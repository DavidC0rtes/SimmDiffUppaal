package org.neocities.daviddev.simmdiff.workers;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.neocities.daviddev.simmdiff.grammars.symTraces.SymTracesLexer;
import org.neocities.daviddev.simmdiff.grammars.symTraces.SymTracesParser;
import org.neocities.daviddev.simmdiff.grammars.symTraces.TracesTranslator;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class Trace implements Callable<String> {

    private final String symbolicTrace;

    private Set<String> channels;

    public Trace(String symbolicTrace) {
        this.symbolicTrace = symbolicTrace;
    }
    @Override
    public String call() throws Exception {
        CharStream input = CharStreams.fromString(symbolicTrace);
        SymTracesLexer lexer = new SymTracesLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SymTracesParser parser = new SymTracesParser(tokens);
        ParseTree tree = parser.trace();

        TracesTranslator eval = new TracesTranslator(new HashSet<>());

        String translatedTrace = eval.visit(tree);
        channels = eval.getChannels();
        return translatedTrace;
    }

    public Set<String> getChannels() {
        return channels;
    }

}
