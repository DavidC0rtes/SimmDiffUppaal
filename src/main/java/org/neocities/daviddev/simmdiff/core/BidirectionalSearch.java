package org.neocities.daviddev.simmdiff.core;

import com.google.common.collect.Sets;
import de.tudarmstadt.es.juppaal.Automaton;
import de.tudarmstadt.es.juppaal.Transition;

import java.util.*;
import java.util.stream.Collectors;

public class BidirectionalSearch {

    private Automaton automaton;
    public BidirectionalSearch(Automaton automaton) {
        this.automaton = automaton;
    }

    public Set<ExtendedLocation> search(ExtendedLocation start, ExtendedLocation goal) {
        System.out.printf("Searching path from %s to %s\n", start, goal);
        Queue<ExtendedLocation> forwardQ = new LinkedList<>();
        Queue<ExtendedLocation> backwardQ = new LinkedList<>();
        Set<ExtendedLocation> forwardVisited = new HashSet<>();
        Set<ExtendedLocation> backwardVisited = new HashSet<>();



        // Add the start node to both queues and visited sets
        forwardQ.add(start);
        backwardQ.add(goal);
        forwardVisited.add(start);
        backwardVisited.add(goal);

        System.out.printf("%s %s \n", forwardVisited, backwardVisited);
        // Search!
        while(!forwardQ.isEmpty() && !backwardQ.isEmpty()) {
            // Check if any of the search queues contain a node that has been visited by the other search
            Set<ExtendedLocation> intersect = Sets.intersection(forwardVisited, backwardVisited);
            System.out.printf("intersect %s \n", intersect);
            if (intersect.size() > 0) {
                // Construct the path from start to goal through the first intersection node
                return constructPath((ExtendedLocation) intersect.toArray()[0], forwardVisited, backwardVisited);
            }
            // Perform one step of the forward search
            ExtendedLocation current = forwardQ.poll();
            Set<ExtendedLocation> neighbors = automaton
                    .getOutgoingTransitions(current)
                    .stream()
                    .map(transition ->  new ExtendedLocation(transition.getTarget()))
                    .collect(Collectors.toSet());

            for (ExtendedLocation neighbor : neighbors) {
                if (!forwardVisited.contains(neighbor)) {
                    forwardVisited.add(neighbor);
                    forwardQ.add(neighbor);
                }
            }

            // Perform one step of the backward search
            current = backwardQ.poll();
            assert current != null;
            neighbors = current
                    .getIncommingTransitions()
                    .stream()
                    .map(transition ->  new ExtendedLocation(transition.getSource()))
                    .collect(Collectors.toSet());

            for (ExtendedLocation neighbor : neighbors) {
                if (!backwardVisited.contains(neighbor)) {
                    backwardVisited.add(neighbor);
                    backwardQ.add(neighbor);
                }
            }
        }
        System.out.println("No path was found");
        return null;
    }

    private Set<ExtendedLocation> constructPath(ExtendedLocation intersect, Set<ExtendedLocation> forwardVisited, Set<ExtendedLocation> backwardVisited) {
        System.out.printf("construct path start %s, forward %s, back %s\n", intersect, forwardVisited, backwardVisited);
        Set<ExtendedLocation> path = new HashSet<>();
        path.add(intersect);

        ExtendedLocation current = intersect;

        while (!current.equals(forwardVisited.iterator().next())) {
            for (ExtendedLocation  neighbor : getNeighbors(current, false)) {
                System.out.printf("neighbor %s \n", neighbor);
                if (forwardVisited.contains(neighbor)) {
                    path.add(neighbor);
                    break;
                }
                current = neighbor;
            }
        }

        while (!current.equals(backwardVisited.iterator().next())) {
            for (ExtendedLocation  neighbor : getNeighbors(current, true)) {
                System.out.printf("neighbor! %s \n", neighbor);
                if (backwardVisited.contains(neighbor)) {
                    path.add(neighbor);
                    current = neighbor;
                    break;
                }
                current = neighbor;
            }
        }

        return path;
    }

    private List<ExtendedLocation> getNeighbors(ExtendedLocation location, boolean forward) {
        if (forward) {
            return location.getOutgoingTransitions()
                    .stream()
                    .map(transition -> new ExtendedLocation(transition.getTarget()))
                    .collect(Collectors.toList());

        }

        return location.getIncommingTransitions()
                .stream()
                .map(transition -> new ExtendedLocation(transition.getSource()))
                .collect(Collectors.toList());
    }

    public void setAutomaton(Automaton automaton) {
        this.automaton = automaton;
    }
}

