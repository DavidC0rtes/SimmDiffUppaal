package org.neocities.daviddev.simmdiff.workers;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.neocities.daviddev.simmdiff.grammars.smctraces.SMCTracesLexer;
import org.neocities.daviddev.simmdiff.grammars.smctraces.SMCTracesParser;
import org.neocities.daviddev.simmdiff.grammars.smctraces.SMCTracesTranslator;
import org.neocities.daviddev.simmdiff.grammars.symTraces.SymTracesLexer;
import org.neocities.daviddev.simmdiff.grammars.symTraces.SymTracesParser;
import org.neocities.daviddev.simmdiff.grammars.symTraces.TracesTranslator;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class Trace implements Callable<String> {

    private final String symbolicTrace;

    private Set<String> channels;
    private float timeout;

    public Trace(String symbolicTrace) {
        this.symbolicTrace = symbolicTrace;
        //System.out.printf("SYM TRACE %s\n",symbolicTrace);
    }
    @Override
    public String call() throws Exception {
        CharStream input = CharStreams.fromString(symbolicTrace);
        SymTracesLexer lexer = new SymTracesLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SymTracesParser parser = new SymTracesParser(tokens);
        ParseTree tree = parser.trace();

        TracesTranslator eval2 = new TracesTranslator(new HashSet<>());

        String translatedTrace = eval2.visit(tree);
        channels = eval2.getChannels();
        timeout = eval2.getTimeout();
        return translatedTrace;

 /*       CharStream input = CharStreams.fromString(symbolicTrace);
        SMCTracesLexer lexer = new SMCTracesLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SMCTracesParser parser = new SMCTracesParser(tokens);
        ParseTree tree = parser.trace();

        SMCTracesTranslator eval2 = new SMCTracesTranslator(new HashSet<>());

        String translatedTrace = eval2.visit(tree);
        channels = eval2.getChannels();
        timeout = eval2.getTimeout();
        return translatedTrace;*/
    }

    public Set<String> getChannels() {
        return channels;
    }
    public float getTimeout() { return timeout; }
}
