package org.neocities.daviddev.simmdiff.entrypoint;

import com.google.common.collect.ListMultimap;
import org.neocities.daviddev.simmdiff.core.ExtendedNTA;
import org.neocities.daviddev.simmdiff.workers.Model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.*;

public class Runner {
    private File model, mutant;

    private ExecutorService modelExecutor, diffExecutor;

    private static final String TRACES_DIR = "src/main/resources/traces";

    public Runner(File model, File mutant) {
        this.model=model;
        this.mutant=mutant;
        modelExecutor = Executors.newFixedThreadPool(2);
    }

    public void parseModels() {
        try {
            Future<ExtendedNTA> modelObj = modelExecutor.submit(new Model(model));
            Future<ExtendedNTA> mutantObj = modelExecutor.submit(new Model(mutant));

            Engine engine = new Engine(modelObj.get(), mutantObj.get());
            engine.start();
            parseTraces(engine.getPaths());
        } catch (IOException | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public void parseTraces(ListMultimap<String, String> symTraces) throws IOException {
        Files.createDirectories(Paths.get(TRACES_DIR));
        for (var trace : symTraces.entries()) {
            System.out.println(trace.getValue());
        }
    }
}
