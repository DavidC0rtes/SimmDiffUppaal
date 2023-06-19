package org.neocities.daviddev.tracematcher.entrypoint;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import be.unamur.uppaal.juppaal.Automaton;
import be.unamur.uppaal.juppaal.Location;
import be.unamur.uppaal.juppaal.Transition;
import be.unamur.uppaal.juppaal.labels.Update;
import org.neocities.daviddev.tracematcher.core.ExtendedLocation;
import org.neocities.daviddev.tracematcher.core.ExtendedNTA;
import org.neocities.daviddev.tracematcher.core.ExtendedTransition;

import java.io.*;
import java.util.Arrays;
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

    public ListMultimap<String, String> getPaths(String propDir, String how) throws FileNotFoundException {
        ListMultimap<String, String> traces = ArrayListMultimap.create();

        for (var entry : diffLocations.entries()) {
            final String reachFormula;
            if (how.equals("random")) {
                reachFormula = String.format("simulate [<= 100; 1] {%s.%s}\n", mutant.getProcessName(entry.getKey()), entry.getValue());
            } else if (how.equals("biased")){
                reachFormula = String.format("E<> %s.%s\n", mutant.getProcessName(entry.getKey()), entry.getValue());
            } else {
                throw new RuntimeException("Uknown strategy "+ how + " for trace generation.");
            }

            try  (FileWriter writer = new FileWriter(propDir + "/prop.q")) {
                writer.write(reachFormula);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //System.out.println("wrote prop to " + propDir+ "/prop.q");

            String trace = execVerifyTA(mutant.getPathToFile(), propDir, how);
            if (trace.length() > 0)
                traces.put(entry.getKey(), trace);
        }

        if (!how.equals("biased"))
            return traces;

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

                        String tran2ChannelName = tran2.getChannel() != null ? tran2.getChannel().getName() : null ;
                        try {
                            if (transition.getSync() != null && transition.getSync().getChannelName().equals(tran2ChannelName)) {
                                tran1.setChannel(tran2.getChannel());
                            }
                        } catch (Exception e) {
                            System.err.println(tran2.getChannel());
                            throw new RuntimeException(e);
                        }

                        if (tran1.equals(tran2)) {
                            transition.addUpdate(varName2 + " = true");
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
                //System.out.println("wrote transition prop to " + propDir + "/prop.q with formula " + formula);
                String traceStr = execVerifyTA(cloneFile.getAbsolutePath(), propDir, how);
                if (traceStr.length() > 0)
                    traces.put(trace.getKey(), traceStr);

                clone = null;
            }
        }

        return traces;
    }

    private String execVerifyTA(String model, String propDir, String how) {
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
            trace = how.equals("biased") ? new String(p.getErrorStream().readAllBytes()) : new String(p.getInputStream().readAllBytes());
            if (trace.length() > 0 ) {
                trace = trace.replace("", "");
            } else {
                System.out.println(">>>>>>>>> " + model + " " + propDir+ "/prop.q");
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return trace;
    }
}
