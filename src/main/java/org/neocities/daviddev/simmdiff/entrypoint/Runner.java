package org.neocities.daviddev.simmdiff.entrypoint;

import com.google.common.collect.ListMultimap;
import org.neocities.daviddev.simmdiff.core.ExtendedNTA;
import org.neocities.daviddev.simmdiff.core.Preamble;
import org.neocities.daviddev.simmdiff.workers.Model;
import org.neocities.daviddev.simmdiff.workers.Trace;
import org.neocities.daviddev.simmdiff.workers.Tron;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class Runner {
    private final File model;
    private final File mutant;

    private final ExecutorService modelExecutor;
    private ExecutorService diffExecutor;
    private final HashMap<String, String[]> tracesMap;

    public HashMap<String, String[]> getTracesResult() {
        return tracesResult;
    }

    private final HashMap<String, String[]> tracesResult;
    private ListMultimap<String, String> symTraces;
    private String tracesDir = "traces/";
    private Engine engine;

    private ExtendedNTA mutantNTA;

    public Runner(File model, File mutant) {
        this.model=model;
        this.mutant=mutant;
        modelExecutor = Executors.newFixedThreadPool(2);
        tracesDir += model.getName().replace(".xml", "") +"/" + mutant.getName().replace((".xml"),"" ).concat("/");
        System.out.println("Traces dir :"+tracesDir);
        tracesMap = new HashMap<>();
        tracesResult = new HashMap<String, String[]>();
    }

    public void parseModels(String propDir) {
        try {
            Future<ExtendedNTA> modelObj = modelExecutor.submit(new Model(model));
            Future<ExtendedNTA> mutantObj = modelExecutor.submit(new Model(mutant));
            mutantNTA = mutantObj.get();
            engine = new Engine(modelObj.get(), mutantNTA);
            modelExecutor.shutdown();

            engine.start();
            symTraces = engine.getPaths(propDir);
        } catch (IOException | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Parses symbolic UPPAAL traces and translates them to TRON format.
     */
    public void parseTraces()  {
        try {
            Files.createDirectories(Paths.get(tracesDir));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        diffExecutor = Executors.newCachedThreadPool();
        float timeout = 0;
        int i = 1;
        for (var trace : symTraces.entries()) {
            if (trace.getValue().length() == 0) {
                throw new RuntimeException("Empty symbolic trace "+trace.getKey());
            }
            Trace traceWorker = new Trace(trace.getValue());
            Future<String> translatedTrace =  diffExecutor.submit(traceWorker);

            String traceFileName = trace.getKey() + i+".trn";
            try (FileWriter writer = new FileWriter(tracesDir.concat(traceFileName))){
                String tronTrace = translatedTrace.get();
                if (tronTrace.equals(""))
                    throw new RuntimeException("Empty tron trace " + tracesDir.concat(traceFileName) + "\n"+ trace.getValue());
                writer.write(tronTrace);
            } catch (IOException | InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }

            float newTimeout = traceWorker.getTimeout();
            if (newTimeout > timeout) {
                timeout = newTimeout;
            }

            // Create preamble
            String preambleFilename = "Preamble_" +  trace.getKey() + i + ".trn";
            Preamble preamble = new Preamble(traceWorker.getChannels(), "1000", Integer.toString(Math.round(timeout) + 10));

            try (FileWriter pWriter = new FileWriter(tracesDir.concat(preambleFilename))){
                String preambletxt = preamble.getPreamble();
                if (preambletxt.length()==0) throw new RuntimeException("Empty preamble");
                pWriter.write(preamble.getPreamble());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // Add element to tracesMap
            tracesMap.put(tracesDir + trace.getKey() + i,
                    new String[]{tracesDir.concat(preambleFilename), tracesDir.concat(traceFileName)}
            );
            i++;
        }
    }

    public void simulateTraces() {
        String tronPath = System.getProperty("user.home") + "/.local/etc/uppaal-tron-1.5-linux/tron";
        int traceIdx = 1;
        for (var entry : tracesMap.entrySet()) {
            int cap = tracesMap.size();
            String[]dirParts =  entry.getKey().split("/");
            String templateName = dirParts[dirParts.length-1];
            long start = System.currentTimeMillis();
            Future<String> result = diffExecutor.submit(new Tron(
                    tronPath,
                    model.getAbsolutePath(),
                    entry.getValue()[0],
                    entry.getValue()[1]
            ));

            try {
                String testPassed = result.get(60, TimeUnit.SECONDS);
                if (testPassed.equals("FAILED") || traceIdx == cap) {
                    tracesResult.put(
                            model.getName(),
                            new String[] {
                                    mutant.getName(),
                                    templateName,
                                    testPassed,
                                    String.valueOf(cap),
                                    String.valueOf(traceIdx),
                                    String.valueOf(System.currentTimeMillis() - start)
                            });
                    break;
                } /*else if (traceIdx == cap) {
                    System.out.println("Generating random traces");
                    for (int i = 0; i < 10; i++) {
                        // Generate random trace
                        String randomTrace = engine.getRandomTrace(mutant, "simulate [<=5;1] {1}");
                        // Translate to TRON format
                        String trnName = tracesDir+mutant.getName()+"random"+i+".trn";
                        String preambleName = tracesDir+mutant.getName()+"randomPreamble"+i+".trn";
                        Map<String, File> tronMap = parseSingleTrace(randomTrace, trnName, preambleName);
                        String testResult = scheduleTron(
                                tronPath,
                                tronMap.get("preamble").getAbsolutePath(),
                                tronMap.get("trn").getAbsolutePath()
                        );
                        //System.out.printf("Test result is %s\n", testResult);
                        if (testResult.equals("FAILED") || i == 9) {
                            tracesResult.put(
                                    model.getName(),
                                    new String[] {
                                            mutant.getName(),
                                            templateName,
                                            testResult,
                                            String.valueOf(cap),
                                            String.valueOf(traceIdx),
                                            String.valueOf(System.currentTimeMillis() - start)
                                    });
                        }

                    }

                }*/

            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            } catch (TimeoutException e) {
                System.out.println("Timed out, skipping...");
            }
            traceIdx++;
        }
        diffExecutor.shutdown();
    }

    private Map<String, File> parseSingleTrace(String trace, String fileURL, String preambleURL) throws ExecutionException, InterruptedException {
        File tronFile = new File(fileURL);
        Trace traceWorker = new Trace(trace, true);
        Future<String> future =  diffExecutor.submit(traceWorker);
        String tronTrace = future.get();

        if (tronTrace.equals(""))
            throw new RuntimeException("parseSingleTrace : Empty tron trace");

        try (FileWriter writer = new FileWriter(tronFile)){
            writer.write(tronTrace);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return Map.of(
                "trn", tronFile,
                "preamble", generatePreamble(traceWorker, preambleURL)
        );
    }

    private File generatePreamble(Trace traceWorker, String preambleURL) {
        File preambleFile = new File(preambleURL);

        float timeout = traceWorker.getTimeout();

        Preamble preamble = new Preamble(traceWorker.getChannels(), "1000", Integer.toString(Math.round(timeout) + 1000));

        try (FileWriter pWriter = new FileWriter(preambleFile)){
            String preambletxt = preamble.getPreamble();
            if (preambletxt.length()==0) throw new RuntimeException("generatePreamble : Empty preamble");
            pWriter.write(preamble.getPreamble());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return preambleFile;

    }

    private String scheduleTron(String tronPath, String preambleURL, String traceURL) throws ExecutionException, InterruptedException {
        long start2 = System.currentTimeMillis();
        Future<String> result2 = diffExecutor.submit(new Tron(
                tronPath,
                model.getAbsolutePath(),
                preambleURL,
                traceURL
        ));
        return result2.get();
    }
    private String getTronPath() {
        ProcessBuilder pb = new ProcessBuilder("bash -l which tron");
        Process p = null;
        String path = null;
        try {
            p = pb.start();
            path = new String(p.getInputStream().readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return path;
    }
}
