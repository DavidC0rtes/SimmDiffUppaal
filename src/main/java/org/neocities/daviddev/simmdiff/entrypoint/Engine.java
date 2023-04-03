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
                //verifyPb.redirectErrorStream(true);
                Process p = verifyPb.start();
                p.waitFor();
                String trace = new String(p.getErrorStream().readAllBytes());
                //System.out.println(trace);
                if (trace.length() > 0 && !trace.contains("NOT satisfied"))
                    //if (trace.contains("NOT satisfied")) throw new RuntimeException("Formula is not satisfied, please check "+mutant.getPathToFile());
                    traces.put(entry.getKey(), trace.replace("", ""));

            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        return traces;
    }

    private File createProp(String filename, String formula) {
        File propFile = new File(filename);
        try (FileWriter writer = new FileWriter(propFile)){
            writer.write(formula);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return propFile;
    }

    public String getRandomTrace(File model, String formula) {
        File prop = createProp("random-prop.q", formula);
        Random rand = new Random();
        try {
            ProcessBuilder verifyPb = new ProcessBuilder();
            verifyPb.command(
                    "/home/david/.local/etc/uppaal64-4.1.26-2/bin-Linux/verifyta",
                    "-t" , "0",
                    "-r", Integer.toString(rand.nextInt()),
                    "-q",
                    model.getAbsolutePath(),
                    prop.getAbsolutePath()
            );
            //verifyPb.redirectErrorStream(true);
            Process p = verifyPb.start();
            p.waitFor();
            String trace = new String(p.getInputStream().readAllBytes());
            if (trace.length() == 0)
                throw new RuntimeException("Generated empty trace, please check " + model.getPath() + " formula " + formula);

            return trace.substring(5).replace("", "");

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
