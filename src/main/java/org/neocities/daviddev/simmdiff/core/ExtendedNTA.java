package org.neocities.daviddev.simmdiff.core;

import com.google.common.collect.ImmutableSet;
import de.tudarmstadt.es.juppaal.Automaton;
import de.tudarmstadt.es.juppaal.Location;
import de.tudarmstadt.es.juppaal.NTA;
import de.tudarmstadt.es.juppaal.Transition;

import java.util.*;
import java.util.stream.Collectors;

import static com.google.common.collect.Sets.*;

public class ExtendedNTA extends NTA {

    public ExtendedNTA(String pathToFile) {
        super(pathToFile);
    }

    public void compareNTA(NTA model) {
        for (Automaton taio : model.getAutomata()) {
            System.out.printf("Getting counterpart with name %s \n", taio.getName().getName());
            Automaton mutant = this.getAutomaton(taio.getName().getName());

            List<Location> locsMutant = new ArrayList<>(mutant.getLocations());
            List<Location> locsModel = new ArrayList<>(taio.getLocations());

            Set<ExtendedLocation> locationSetMutant = ImmutableSet.copyOf(
                    locsMutant.stream()
                            .map(loc -> new ExtendedLocation(loc.getAutomaton(), loc.generateXMLElement()))
                            .collect(Collectors.toSet())
            );

            Set<ExtendedLocation> locationSetModel = ImmutableSet.copyOf(
                    locsModel.stream()
                            .map(loc -> new ExtendedLocation(loc.getAutomaton(), loc.generateXMLElement()))
                            .collect(Collectors.toSet())
            );

            System.out.println(intersection(locationSetMutant, locationSetModel));
            //System.out.println(difference(locationSetModel, locationSetMutant));

            /*for (Location loc : counterpart.getLocations()) {

            }

            Set<ExtendedLocation> bar = new HashSet<ExtendedLocation>((Collection<? extends ExtendedLocation>) counterpart.getLocations());
            System.out.printf("Locations in mutant: %d, locations in model: %d\n", bar.size(), foo.size());
            Set<ExtendedLocation> diff2 = new HashSet<>(bar);
            diff2.removeIf(foo::contains);
            for (ExtendedLocation extendedLocation : diff2) {
                System.out.printf("loc %s not in original\n", extendedLocation.toString());
            }
            Set<Transition> transitionSet = new HashSet<Transition>(counterpart.getTransitions());
            Set<Transition> transitionSetB = new HashSet<Transition>(taio.getTransitions());
            System.out.printf("Transitions in mutant: %d, transitions in model: %d\n", transitionSet.size(), transitionSetB.size());
            Set<Transition> diff = new HashSet<>(transitionSet);
            diff.removeIf(transitionSetB::contains);

            for (Transition difT : diff) {
                System.out.printf("tran %s not in original\n", difT.toString());
            }*/

        }
    }

    private boolean equalLocations(Location loc1, Location loc2) {

        if (loc1.getType() != loc2.getType()) return false;

        if (loc1.getAutomaton() != loc2.getAutomaton()) return false;

        if (!new HashSet<>(loc1.getOutgoingTransitions()).containsAll(loc2.getOutgoingTransitions())) return false;

        if (!new HashSet<>(loc1.getIncommingTransitions()).containsAll(loc2.getIncommingTransitions())) return false;

        return loc1.getInvariant() == loc2.getInvariant();
    }
}
