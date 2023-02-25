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

            Set<ExtendedLocation> locationSetMutant = getExtendedLocations(new ArrayList<>(mutant.getLocations()));
            Set<ExtendedLocation> locationSetModel = getExtendedLocations(new ArrayList<>(taio.getLocations()));

            System.out.println(difference(locationSetModel, locationSetMutant));
            System.out.println(difference(locationSetMutant, locationSetModel));

            Set<ExtendedTransition> transitionSetMutant = getExtendedTransitions(mutant,  new ArrayList<>(mutant.getTransitions()));
            Set<ExtendedTransition> transitionSetModel = getExtendedTransitions(taio, new ArrayList<>(taio.getTransitions()));

            System.out.println(difference(transitionSetMutant, transitionSetModel));
        }
    }

    private Set<ExtendedLocation> getExtendedLocations(List<Location> locations) {
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
                                transition.getTarget()
                        ))
                        .collect(Collectors.toSet())
        );
    }
}
