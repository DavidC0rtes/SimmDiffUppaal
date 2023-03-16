package org.neocities.daviddev.simmdiff.entrypoint;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import org.neocities.daviddev.simmdiff.core.ExtendedLocation;
import org.neocities.daviddev.simmdiff.core.ExtendedNTA;
import org.neocities.daviddev.simmdiff.core.ExtendedTransition;

import java.io.*;
import java.util.Random;

public class Engine {
    private final ExtendedNTA model;
    private final ExtendedNTA mutant;

    public ListMultimap<String, ExtendedLocation> getDiffLocations() {
        return diffLocations;
    }

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

    public ListMultimap<String, String> getPaths() {
        ListMultimap<String, String> traces = ArrayListMultimap.create();
        ProcessBuilder verifyPb = new ProcessBuilder();
        Random rand = new Random();
        for (var entry : diffLocations.entries()) {
            //System.out.printf("Got entry %s %s\n", entry.getKey(), entry.getValue());
            String reachFormula = String.format("E<> %s.%s\n", mutant.getProcessName(entry.getKey()), entry.getValue());
            //String reachFormula = String.format("simulate [<= 5; 1] {%s.%s}\n", mutant.getProcessName(entry.getKey()), entry.getValue());
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
                String trace = new String(p.getErrorStream().readAllBytes());
                traces.put(entry.getKey(), trace);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        return traces;
    }

}
