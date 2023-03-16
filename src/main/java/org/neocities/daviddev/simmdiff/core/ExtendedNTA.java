package org.neocities.daviddev.simmdiff.core;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ListMultimap;

import de.tudarmstadt.es.juppaal.*;
import de.tudarmstadt.es.juppaal.Location;
import de.tudarmstadt.es.juppaal.Transition;
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

   /* private void setupChanDict() {
        for (String decl : this.getDeclarations().getStrings()) {
            String[] parts = decl.split(",");

            for (String part : parts) {

            }
        }
    }*/

    @Override
    public Automaton getAutomaton(String name) {
        for (Automaton ta : this.getAutomata()) {
            if (ta.getName().getName().equals(name)) {
                return ta;
            }
        }

        throw new IllegalArgumentException("Can't find Automaton "+ name + " in this system");
    }

    public void compareNTA(NTA model) {
        for (Automaton taio : model.getAutomata()) {
            System.out.println(this.getAutomata().get(0).getName());
            Automaton mutant = this.getAutomaton(taio.getName().getName());

            Set<ExtendedLocation> locationSetMutant = getExtendedLocations(new ArrayList<>(mutant.getLocations()));
            Set<ExtendedLocation> locationSetModel = getExtendedLocations(new ArrayList<>(taio.getLocations()));

            diffLocations.putAll(taio.getName().getName(),difference(locationSetMutant, locationSetModel));

            System.out.printf("%d/%d different locations\n", diffLocations.size(), locationSetMutant.size());
            Set<ExtendedTransition> transitionSetMutant = getExtendedTransitions(mutant,  new ArrayList<>(mutant.getTransitions()));
            Set<ExtendedTransition> transitionSetModel = getExtendedTransitions(taio, new ArrayList<>(taio.getTransitions()));

            diffTransitions.putAll(taio.getName().getName(), difference(transitionSetMutant, transitionSetModel));
            System.out.printf("%d/%d different transitions \n", diffTransitions.size(), transitionSetMutant.size());
            expandDiffs();

            System.out.printf("%d different locations after expanding\n", diffLocations.size());
        }
    }

    private void expandDiffs() {
        for (var entry : diffTransitions.entries()) {
            if (!diffLocations.containsValue( new ExtendedLocation( entry.getValue().getSource()))) {
                diffLocations.put(entry.getKey(), new ExtendedLocation(entry.getValue().getSource()));
            }

            if (!diffLocations.containsValue( new ExtendedLocation( entry.getValue().getTarget()))) {
                diffLocations.put(entry.getKey(), new ExtendedLocation(entry.getValue().getTarget()));
            }
        }
    }

    public ListMultimap<String, ExtendedLocation> getDiffLocations() {
        return diffLocations;
    }

    public ListMultimap<String, ExtendedTransition> getDiffTransitions() {
        return diffTransitions;
    }

    private Set<ExtendedLocation> getExtendedLocations(List<Location> locations) {
        locations.forEach(location -> {
            if (location.getName() == null)
                location.setName(location.getUniqueIdString());
        });

        return ImmutableSet.copyOf(
                locations.stream()
                        .map(loc -> new ExtendedLocation(
                                loc.getAutomaton(),
                                loc.getName(),
                                loc.getType(),
                                0, 0,
                                loc.getOutgoingTransitions(),
                                loc.getIncommingTransitions()
                        ))
                        .collect(Collectors.toSet())
        );
    }

    private Set<ExtendedTransition> getExtendedTransitions(Automaton automaton, List<Transition> transitions) {
        return ImmutableSet.copyOf(
                transitions.stream()
                        .map(transition -> new ExtendedTransition(
                                automaton,
                                transition.getSource(),
                                transition.getTarget(),
                                transition.getSync() != null ? chanDict.get(transition.getSync().getChannelName()) : null
                        ))
                        .collect(Collectors.toSet())
        );
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
