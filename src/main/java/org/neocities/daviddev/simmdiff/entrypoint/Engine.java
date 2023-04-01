package org.neocities.daviddev.simmdiff.entrypoint;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import de.tudarmstadt.es.juppaal.Automaton;
import de.tudarmstadt.es.juppaal.Location;
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

    public ListMultimap<String, String> getPaths(String propDir) throws FileNotFoundException {
        ListMultimap<String, String> traces = ArrayListMultimap.create();

        Random rand = new Random();
        for (var entry : diffLocations.entries()) {
            //String reachFormula = String.format("simulate [<= 100; 10] {%s.%s}\n", mutant.getProcessName(entry.getKey()), entry.getValue());
            String reachFormula = String.format("E<> %s.%s\n", mutant.getProcessName(entry.getKey()), entry.getValue());
            System.out.printf("Formula: %s", reachFormula);
            try  (FileWriter writer = new FileWriter(propDir + "/prop.q")) {
                writer.write(reachFormula);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("wrote prop to " + propDir+ "/prop.q");

            mutant.getAutomaton(entry.getKey()).setInit(entry.getValue());

            try {
                ProcessBuilder verifyPb = new ProcessBuilder();
                verifyPb.command(
                        "/home/david/.local/etc/uppaal64-4.1.26-2/bin-Linux/verifyta",
                        "-t" , "0",
                        "-r", Integer.toString(rand.nextInt()),
                        "-q",
                        mutant.getPathToFile(),
                        propDir + "/prop.q"
                );
                verifyPb.redirectErrorStream(true);
                Process p = verifyPb.start();
                p.waitFor();
                String trace = new String(p.getInputStream().readAllBytes());
               System.out.println(trace);
                if (trace.length() > 0)
                    traces.put(entry.getKey(), trace.substring(5).replace("", ""));


            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           // mutant.getAutomaton(entry.getKey()).setInit(oldInit);
        }


        return traces;
    }

}
