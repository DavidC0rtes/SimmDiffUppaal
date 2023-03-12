package org.neocities.daviddev.simmdiff.entrypoint;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ListMultimap;
import de.tudarmstadt.es.juppaal.Automaton;
import org.neocities.daviddev.simmdiff.core.BidirectionalSearch;
import org.neocities.daviddev.simmdiff.core.ExtendedLocation;
import org.neocities.daviddev.simmdiff.core.ExtendedNTA;
import org.neocities.daviddev.simmdiff.core.ExtendedTransition;

import java.io.*;
import java.util.Iterator;
import java.util.Random;

public class Engine {
    private final ExtendedNTA model;
    private final ExtendedNTA mutant;
    private ListMultimap<String, ExtendedLocation> diffLocations;
    private ListMultimap<String, ExtendedTransition> diffTransitions;
    public Engine(ExtendedNTA model, ExtendedNTA mutant) {
        this.mutant=mutant; this.model=model;
        diffLocations = ArrayListMultimap.create();
        diffTransitions = ArrayListMultimap.create();
    }

    public void start() {
        mutant.compareNTA(model);
        diffTransitions = mutant.getDiffTransitions();
        diffLocations = mutant.getDiffLocations();
    }



    /*
    Compute the shortest path for every TAIO to diff loc. (A*) -> create new automata at the same time
    Discard everything else... create a new automata only with those paths
    add new automata to nta.
     */
    public void computePaths() {
        BidirectionalSearch search = new BidirectionalSearch(null);
        for(Automaton ta : mutant.getAutomata()) {
            search.setAutomaton(ta);
            Iterator<ExtendedLocation> iter = diffLocations.asMap().get(ta.getName().getName()).iterator();
            while(iter.hasNext()) {
                System.out.println(search.search(new ExtendedLocation(ta.getInit()),iter.next()));
            }
        }
    }

    private void prepareModels() {
       /* mutant.makeBroadcast();
        model.makeBroadcast();*/
        model.getAutomata().forEach(automaton -> {
            System.out.printf("%d locations in automaton %s\n", automaton.getLocations().size(), automaton.getName().getName());
        });
        model.writeModelToFile(model.getPathToFile()+"test.xml");
    }
    public ListMultimap<String, String> getPaths() {
        //prepareModels();
        ListMultimap<String, String> traces = ArrayListMultimap.create();
        ProcessBuilder verifyPb = new ProcessBuilder();
        Random rand = new Random();
        for (var entry : diffLocations.entries()) {
            System.out.printf("Got entry %s %s\n", entry.getKey(), entry.getValue());
            String reachFormula = String.format("E<> %s.%s\n", mutant.getProcessName(entry.getKey()), entry.getValue());
            System.out.printf("Formula: %s", reachFormula);

            try  (FileWriter writer = new FileWriter("src/main/resources/prop.q")) {
                writer.write(reachFormula);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                verifyPb.command(
                        "/home/david/.local/etc/uppaal64-4.1.26-2/bin-Linux/verifyta",
                        "-t" , "0",
                        "-r", Integer.toString(rand.nextInt()),
                        "-q",
                        mutant.getPathToFile(),
                        "src/main/resources/prop.q"
                );
                Process p = verifyPb.start();
                traces.put(entry.getKey(), new String(p.getErrorStream().readAllBytes()));
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        return traces;
    }

}
