package org.neocities.daviddev.simmdiff.workers;

import org.neocities.daviddev.simmdiff.core.ExtendedNTA;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Model implements Callable<ExtendedNTA> {

    private File modelFile;
    public Model(File model) throws IOException {
        modelFile = model;
    }
    @Override
    public ExtendedNTA call() {
        return new ExtendedNTA(modelFile.getPath());
    }
}
