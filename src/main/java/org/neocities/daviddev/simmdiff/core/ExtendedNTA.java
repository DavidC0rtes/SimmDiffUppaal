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
            System.out.println(taio.getInit().getOutgoingTransitions().size());
            List<Location> locsMutant = new ArrayList<>(mutant.getLocations());
            List<Location> locsModel = new ArrayList<>(taio.getLocations());
            System.out.println(locsMutant.get(0).getIncommingTransitions().size());
            Set<ExtendedLocation> locationSetMutant = ImmutableSet.copyOf(
                    locsMutant.stream()
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

            Set<ExtendedLocation> locationSetModel = ImmutableSet.copyOf(
                    locsModel.stream()
                            .map(loc -> new ExtendedLocation(
                                    loc.getAutomaton(),
                                    loc.getName(),
                                    loc.getType(),
                                    0, 0,
                                    loc.getOutgoingTransitions(),
                                    loc.getIncommingTransitions()))
                            .collect(Collectors.toSet())
            );

            System.out.println(difference(locationSetModel, locationSetMutant));
            System.out.println(difference(locationSetMutant, locationSetModel));

        }
    }
}
