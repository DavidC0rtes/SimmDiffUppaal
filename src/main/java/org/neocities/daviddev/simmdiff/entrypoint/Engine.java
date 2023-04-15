package org.neocities.daviddev.simmdiff.entrypoint;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import de.tudarmstadt.es.juppaal.Automaton;
import de.tudarmstadt.es.juppaal.Location;
import de.tudarmstadt.es.juppaal.Transition;
import de.tudarmstadt.es.juppaal.labels.Update;
import org.neocities.daviddev.simmdiff.core.ExtendedLocation;
import org.neocities.daviddev.simmdiff.core.ExtendedNTA;
import org.neocities.daviddev.simmdiff.core.ExtendedTransition;

import java.io.*;
import java.util.List;
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

            String trace = execVerifyTA(mutant.getPathToFile(), propDir);
            if (trace.length() > 0)
                traces.put(entry.getKey(), trace);
        }

/*      Compute reachability formula for each identified diff transition.
        For that, we need to add a boolean variable to the model
        and set it to True on every incoming transition to the source location.*/
        String varName = "reachSource";
        String varName2 = "reachTran";
        File cloneFile = new File(mutant.getPathToFile()+"_dummy.xml");
        cloneFile.deleteOnExit();
        for (var trace : diffTransitions.entries()) {
            ExtendedNTA clone = mutant.clone();
            clone.writeModelToFile(cloneFile.getAbsolutePath());

            Automaton automaton = clone.getAutomaton(trace.getValue().getSource().getAutomaton().getName().getName());
            int nTransitionsMut = automaton.getTransitions().size();
            Location sourceLoc = automaton.getLocation(trace.getValue().getSource().getName().getName());
            if (sourceLoc.getIncommingTransitions().size() > 0) {
                Location targetLoc = automaton.getLocation(trace.getValue().getTarget().getName().getName());
                automaton.getDeclaration().add("bool " + varName + "," + varName2 + ";");
                sourceLoc.getIncommingTransitions()
                        .forEach(transition -> transition.addUpdate(new Update(varName + " = " + "true")));

                String formula = String.format("E<> %s.%s", clone.getProcessName(trace.getKey()), varName);

                List<Transition> transitionList = automaton.getTransitions(sourceLoc, targetLoc);
                if (transitionList.size() > 0) {
                    formula += String.format(" && %s.%s", clone.getProcessName(trace.getKey()), varName2);
                    transitionList.forEach(transition -> {
                        ExtendedTransition tran2 = trace.getValue();
                        ExtendedTransition tran1 = new ExtendedTransition(
                                automaton,
                                sourceLoc,
                                targetLoc,
                                null,
                                transition.getSync());

                        if (transition.getSync() != null && transition.getSync().getChannelName().equals(tran2.getChannel().getName())) {
                            tran1.setChannel(tran2.getChannel());
                        }

                        if (tran1.equals(tran2)) {
                            transition.addUpdate(varName2 + " = true");
                            System.out.println("Added the update");
                            automaton.getTransitions().subList(nTransitionsMut, automaton.getTransitions().size()).clear();
                        }
                    });
                }

                formula += String.format(" && %s.%s", clone.getProcessName(trace.getKey()), trace.getValue().getTarget());
                // Rewrite updated clone model
                clone.writeModelToFile(cloneFile.getAbsolutePath());


                // Create prop file with formula
                try (FileWriter writer = new FileWriter(propDir + "/prop.q")) {
                    writer.write(formula);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("wrote transition prop to " + propDir + "/prop.q with formula " + formula);
                String traceStr = execVerifyTA(cloneFile.getAbsolutePath(), propDir);
                if (traceStr.length() > 0)
                    traces.put(trace.getKey(), traceStr);

                clone = null;
            }
        }

        return traces;
    }

    private String execVerifyTA(String model, String propDir) {
        String trace;
        Random rand = new Random();
        try {
            ProcessBuilder verifyPb = new ProcessBuilder();
            verifyPb.command(
                    "/home/david/.local/etc/uppaal64-4.1.26-2/bin-Linux/verifyta",
                    "-t" , "0",
                    "-r", Integer.toString(rand.nextInt()),
                    "-q",
                    model,
                    propDir + "/prop.q"
            );
            //verifyPb.redirectErrorStream(true);
            Process p = verifyPb.start();
            p.waitFor();
            trace = new String(p.getErrorStream().readAllBytes());

            if (trace.length() > 0 && !trace.contains("NOT satisfied")) {
                trace = trace.replace("", "");
            } else {
                System.out.println(">>>>>>>>> " + model + " " + propDir+ "/prop.q");
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return trace;
    }

    private File createProp(String filename, String formula) {
        File propFile = new File(filename);
        try (FileWriter writer = new FileWriter(propFile)) {
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
