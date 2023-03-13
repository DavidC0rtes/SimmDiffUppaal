package org.neocities.daviddev.simmdiff.workers;

import org.neocities.daviddev.simmdiff.core.ExtendedNTA;
import org.neocities.daviddev.simmdiff.grammars.uppaal.FileLoader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Callable;

public class Model implements Callable<ExtendedNTA> {

    private File modelFile;
    public Model(File model) throws IOException {
        String cleanedFileName = model.getAbsolutePath()
                .concat("_cleaned.xml");

        try (FileWriter writer = new FileWriter(cleanedFileName)) {
            FileLoader fileLoader = new FileLoader(model);
            writer.write(fileLoader.getParsedContent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        modelFile = new File(cleanedFileName);
    }
    @Override
    public ExtendedNTA call() {
        return new ExtendedNTA(modelFile.getPath());
    }
}
