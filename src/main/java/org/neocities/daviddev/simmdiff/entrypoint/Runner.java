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
import java.util.concurrent.*;

public class Runner {
    private final File model;
    private final File mutant;

    private final ExecutorService modelExecutor;
    private ExecutorService diffExecutor;
    private HashMap<String, String[]> tracesMap;
    private ListMultimap<String, String> symTraces;
    private String tracesDir = "src/main/resources/traces/";

    public Runner(File model, File mutant) {
        this.model=model;
        this.mutant=mutant;
        modelExecutor = Executors.newCachedThreadPool();
        System.out.println(mutant.getName());
        tracesDir += mutant.getName().replace((".xml"),"" ).concat("/");
        tracesMap = new HashMap<>();
    }

    public void parseModels() {
        try {
            Future<ExtendedNTA> modelObj = modelExecutor.submit(new Model(model));
            Future<ExtendedNTA> mutantObj = modelExecutor.submit(new Model(mutant));
            Engine engine = new Engine(modelObj.get(), mutantObj.get());
            modelExecutor.shutdown();

            engine.start();
            symTraces = engine.getPaths();
        } catch (IOException | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Parses symbolic UPPAAL traces and translates them to TRON format.
     * @throws IOException
     * @throws ExecutionException
     * @throws InterruptedException
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
            System.out.println("Translating traces " + trace.getKey());

            Trace traceWorker = new Trace(trace.getValue());

            Future<String> translatedTrace =  diffExecutor.submit(traceWorker);
            String traceFileName = trace.getKey() + i+".trn";
            FileWriter writer = null;
            try {
                writer = new FileWriter(tracesDir.concat(traceFileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.write(translatedTrace.get());
            } catch (IOException | InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            float newTimeout = traceWorker.getTimeout();
            if (newTimeout > timeout) {
                timeout = newTimeout;
            }

            // Create preamble
            String preambleFilename = "Preamble_" +  trace.getKey() + i + ".trn";

            Preamble preamble = new Preamble(traceWorker.getChannels(), "1000", Integer.toString(Math.round(timeout) + 1));

            try (FileWriter pWriter = new FileWriter(tracesDir.concat(preambleFilename))){
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
        //diffExecutor.shutdown();
    }

    public void simulateTraces() {
        // Find out Tron path
        String tronPath = System.getProperty("user.home") + "/.local/etc/uppaal-tron-1.5-linux/tron";
        for (var entry : tracesMap.entrySet()) {
            System.out.println(entry.getValue()[0] + " " + entry.getValue()[1]);
            Future<Boolean> result = diffExecutor.submit(new Tron(
                    tronPath,
                    model.getAbsolutePath(),
                    entry.getValue()[0],
                    entry.getValue()[1]
            ));

            try {
                System.out.printf("Result  was %s\n", result.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
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
