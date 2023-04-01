package org.neocities.daviddev.simmdiff.core;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ListMultimap;

import com.google.gson.Gson;
import de.tudarmstadt.es.juppaal.*;
import de.tudarmstadt.es.juppaal.Location;
import de.tudarmstadt.es.juppaal.Transition;
import org.checkerframework.checker.units.qual.A;
import org.neocities.daviddev.simmdiff.core.types.Channel;

import java.util.*;
import java.util.stream.Collectors;

import static com.google.common.collect.Sets.*;

public class ExtendedNTA extends NTA {

    private ListMultimap<String, ExtendedLocation> diffLocations;
    private ListMultimap<String, ExtendedTransition> diffTransitions;
    private String pathToFile;
    private HashMap<String, Channel> chanDict;

    public ExtendedNTA(String pathToFile, HashMap<String, Channel> chanDict) {
        super(pathToFile);
        diffLocations = ArrayListMultimap.create();
        diffTransitions = ArrayListMultimap.create();
        this.pathToFile = pathToFile;
        this.chanDict = chanDict;
        this.getAutomata().forEach(automaton -> {
            System.out.printf(">> %d locations in automaton %s\n", automaton.getLocations().size(), automaton.getName().getName());
        });

    }

    @Override
    public Automaton getAutomaton(String name) {
        for (Automaton ta : this.getAutomata()) {
            if (ta.getName().getName().equals(name)) {
                return ta;
            }
        }

        throw new IllegalArgumentException("Can't find Automaton "+ name + " in this system "+ this.pathToFile);
    }

    public void compareNTA(NTA model) {
        int mutantMaxLocId = 0;
        int modelMaxLocId = 0;
        for (Automaton taio : model.getAutomata()) {
            Automaton mutant = this.getAutomaton(taio.getName().getName());
            ArrayList<Location> mutantLocsCopy = new ArrayList<>(mutant.getLocations());
            mutantMaxLocId += mutantLocsCopy.size();
            Set<ExtendedLocation> locationSetMutant = getExtendedLocations(mutant ,mutantLocsCopy);
            HashMap<String, ExtendedLocation> mutantLocsMap = new HashMap<>();

            for (ExtendedLocation l : locationSetMutant) {
                mutantLocsMap.put(l.toString(), l);
/*                if (l.toString().equals(mutant.getInit().toString())) {
                    mutant.setInit(l);
                }*/
            }

            ArrayList<Location> modelLocsCopy = new ArrayList<>(taio.getLocations());
            Set<ExtendedLocation> locationSetModel = getExtendedLocations(taio, new ArrayList<>(taio.getLocations()));
            HashMap<String, ExtendedLocation> modelLocsMap = new HashMap<>();

            for (ExtendedLocation l : locationSetModel) {
                modelLocsMap.put(l.toString(), l);
/*                if (l.toString().equals(taio.getInit().toString())) {
                    taio.setInit(l);
                }*/
            }
            modelMaxLocId += modelLocsCopy.size();

            String bar = mutant.getInit().toString();
            Set<ExtendedLocation> diffLoc = difference(locationSetMutant, locationSetModel);
            diffLocations.putAll(taio.getName().getName(),diffLoc.stream().filter(location -> !location.getName().getName().equals(bar)).collect(Collectors.toSet()));
            System.out.printf("different locations : %s\n", diffLoc);

            // Fix mutant
            /*List<Location> foo = new ArrayList<>(mutant.getLocations());
            for (int i = locationSetMutant.size(); i<foo.size(); i++) {
                mutant.removeLocation(foo.get(i));
            }*/

            Set<ExtendedTransition> transitionSetMutant = getExtendedTransitions(mutant,  new ArrayList<>(mutant.getTransitions()), mutantLocsMap);
            Set<ExtendedTransition> transitionSetModel = getExtendedTransitions(taio, new ArrayList<>(taio.getTransitions()), modelLocsMap);
            // Fix model
          /*  List<Location> foo2 = new ArrayList<>(taio.getLocations());
            for (int i = locationSetModel.size(); i<foo2.size(); i++) {
                taio.removeLocation(foo2.get(i));
            }*/

            Set<ExtendedTransition> differentT = difference(transitionSetMutant, transitionSetModel);
            diffTransitions.putAll(taio.getName().getName(), differentT);
            System.out.printf("different transitions : %s\n", differentT);

            ArrayList<String> locs = expandDiffs();
            locs.forEach(l -> {
                if (!l.equals(bar) && !diffLocations.containsValue(mutantLocsMap.get(l))) {
                    diffLocations.put(
                            mutant.getName().getName(),
                            mutantLocsMap.get(l));
                }
            });

            System.out.printf("After expanding : %s\n", diffLocations);
            System.out.println("Cleaning up "+ mutant.getName().getName());
            cleanUpLocations(mutant, mutantMaxLocId);
            cleanUpLocations(taio, modelMaxLocId);
        }
    }

    private ArrayList<String> expandDiffs() {
        ArrayList<String> locationsToAdd = new ArrayList<>();

        for (var entry : diffTransitions.entries()) {
            Collection<ExtendedLocation> locations = diffLocations.asMap().get(entry.getKey());

            String sourceName = entry.getValue().getSource().getName().getName();
            String targetName = entry.getValue().getTarget().getName().getName();

            if (locations == null) {
                locationsToAdd.add(sourceName);
                locationsToAdd.add(targetName);
                continue;
            }


            List<String> locNames = locations.stream()
                    .map(Location::toString)
                    .collect(Collectors.toList());


            if (!locNames.contains(sourceName)) {
                //System.out.println(sourceName + " is not in "+ locNames.toString());
                locationsToAdd.add(sourceName);
            }

            if (!locNames.contains(targetName)) {
                //System.out.println(targetName + " is not in "+ locNames.toString());
                locationsToAdd.add(targetName);
            }
        }
        return locationsToAdd;
    }

    public ListMultimap<String, ExtendedLocation> getDiffLocations() {
        return diffLocations;
    }

    public ListMultimap<String, ExtendedTransition> getDiffTransitions() {
        return diffTransitions;
    }

    private Set<ExtendedLocation> getExtendedLocations(Automaton automaton, List<Location> locations) {
        locations.forEach(location -> {
            if (location.getName() == null)
                location.setName(location.getUniqueIdString());
        });

        Set<ExtendedLocation> set = ImmutableSet.copyOf(
                locations.stream()
                        .map(loc -> new ExtendedLocation(
                                automaton,
                                loc.getName(),
                                loc.getType(),
                                0, 0,
                                loc.getOutgoingTransitions(),
                                loc.getIncommingTransitions()
                        ))
                        .collect(Collectors.toSet())
        );

        //locations.forEach(automaton::removeLocation);
        return set;
    }

    private Set<ExtendedTransition> getExtendedTransitions(Automaton automaton, List<Transition> transitions, HashMap<String, ExtendedLocation> locsMap) {
        Set<ExtendedTransition> set = ImmutableSet.copyOf(
                transitions.stream()
                        .map(transition -> new ExtendedTransition(
                                automaton,
                                locsMap.get(transition.getSource().getName().getName()),
                                locsMap.get(transition.getTarget().getName().getName()),
                                transition.getSync() != null ? chanDict.get(transition.getSync().getChannelName()) : null
                        ))
                        .collect(Collectors.toSet())
        );

        return set;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public String getProcessName(String template) {
        for(String decl : this.getSystemDeclaration().getDeclarations()) {
            if (decl.contains(template) && decl.contains("=")) {
                String[] parts = decl.trim().split("=");
                return parts[0].trim();
            }
        }
        return template;
    }

    private void cleanUpLocations(Automaton automaton, int cap) {
        ArrayList<Location> copy = new ArrayList<>(automaton.getLocations());

        automaton.getLocations().clear();
        for (Location loc : copy) {
            if (loc.getId() < cap) {
                automaton.addLocation(loc);
            }
        }
    }


    public void makeBroadcast() {
        int idx = 0;
        for (String decl : this.getDeclarations().getStrings()) {
            boolean notBroadcast = decl.matches("^(urgent)?\\s+chan.*");
            if (notBroadcast) {
                this.getDeclarations().getStrings().set(idx, "broadcast " + decl);
            }
            idx++;
        }
    }
}
