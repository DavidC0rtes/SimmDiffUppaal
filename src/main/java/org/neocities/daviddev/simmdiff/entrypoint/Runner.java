package org.neocities.daviddev.simmdiff.entrypoint;

import de.tudarmstadt.es.juppaal.NTA;
import org.neocities.daviddev.simmdiff.core.ExtendedNTA;
import org.neocities.daviddev.simmdiff.workers.Model;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.*;

public class Runner {
    private File model, mutant;

    private ExecutorService modelExecutor, diffExecutor;

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
            engine.computePaths();
            //engine.getPaths();
        } catch (IOException | InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
