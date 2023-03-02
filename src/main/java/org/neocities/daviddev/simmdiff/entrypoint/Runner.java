package org.neocities.daviddev.simmdiff.entrypoint;

import com.google.common.collect.ListMultimap;
import org.neocities.daviddev.simmdiff.core.ExtendedNTA;
import org.neocities.daviddev.simmdiff.core.Preamble;
import org.neocities.daviddev.simmdiff.workers.Model;
import org.neocities.daviddev.simmdiff.workers.Trace;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.*;

public class Runner {
    private final File model;
    private final File mutant;

    private final ExecutorService modelExecutor;
    private ExecutorService diffExecutor;

    private static final String TRACES_DIR = "src/main/resources/traces/";

    public Runner(File model, File mutant) {
        this.model=model;
        this.mutant=mutant;
        modelExecutor = Executors.newCachedThreadPool();
    }

    public void parseModels() {
        try {
            Future<ExtendedNTA> modelObj = modelExecutor.submit(new Model(model));
            Future<ExtendedNTA> mutantObj = modelExecutor.submit(new Model(mutant));
            Engine engine = new Engine(modelObj.get(), mutantObj.get());
            engine.start();
            parseTraces(engine.getPaths());
            modelExecutor.shutdown();
        } catch (IOException | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public void parseTraces(ListMultimap<String, String> symTraces) throws IOException, ExecutionException, InterruptedException {
        Files.createDirectories(Paths.get(TRACES_DIR));
        diffExecutor = Executors.newCachedThreadPool();

        for (var trace : symTraces.entries()) {
            System.out.println("Translating traces");

            Trace traceWorker = new Trace(trace.getValue());

            Future<String> translatedTrace =  diffExecutor.submit(traceWorker);
            FileWriter writer = new FileWriter(TRACES_DIR.concat(trace.getKey()));
            writer.write(translatedTrace.get());
            writer.close();

            // Create preamble
            String preambleFilename = "Preamble_" +  trace.getKey() + ".trn";
            FileWriter pWriter = new FileWriter(TRACES_DIR.concat(preambleFilename));
            Preamble preamble = new Preamble(traceWorker.getChannels(), "1000", "60000");

            pWriter.write(preamble.getPreamble());
            pWriter.close();
        }
    }
}
