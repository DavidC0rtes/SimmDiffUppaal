package org.neocities.daviddev.simmdiff.workers;

import de.tudarmstadt.es.juppaal.NTA;
import org.neocities.daviddev.simmdiff.core.ExtendedNTA;
import org.neocities.daviddev.simmdiff.grammars.diff.DiffParser;
import org.neocities.daviddev.simmdiff.grammars.diff.ExtendedDiffListener;
import org.neocities.daviddev.simmdiff.grammars.uppaal.NTAListener;
import org.neocities.daviddev.simmdiff.grammars.uppaal.antlr.UppaalLexer;
import org.neocities.daviddev.simmdiff.grammars.uppaal.antlr.UppaalParser;
import org.neocities.daviddev.simmdiff.core.Runner;
import org.neocities.daviddev.simmdiff.grammars.diff.DiffLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Model implements Callable<ExtendedNTA> {

    private DiffParser diffParser;
    private DiffLexer diffLexer;
    private ParseTree diffTree;
    private ExtendedDiffListener diffListener;
    private NTAListener NTAlistener;
    private Runner runner;
    private File modelFile;
    public Model(File model) throws IOException {
        modelFile = model;
    }
    @Override
    public ExtendedNTA call() {
        return new ExtendedNTA(modelFile.getPath());
    }
}
