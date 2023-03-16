package org.neocities.daviddev.simmdiff.grammars.uppaal;

import org.neocities.daviddev.simmdiff.core.types.Channel;
import org.neocities.daviddev.simmdiff.grammars.uppaal.antlr.UppaalLexer;
import org.neocities.daviddev.simmdiff.grammars.uppaal.antlr.UppaalParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileLoader {

    private ParseTree tree;
    private UppaalParser parser;
    private String parsedContent;
    private NTAVisitor visitor;

    public FileLoader(File file) throws IOException {
        CharStream input = CharStreams.fromFileName(file.getPath());
        UppaalLexer lexer = new UppaalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        this.parser = new UppaalParser(tokens);
        this.tree = parser.model();

        // Create NTA walker
        ParseTreeWalker walker = new ParseTreeWalker();
        // Create listener then feed to walker
        visitor = new NTAVisitor();
       // walker.walk(listener, tree);
       parsedContent = visitor.visit(tree);
    }

    public String getParsedContent() {
        return parsedContent;
    }

    public HashMap<String, Channel> getChanDict() { return visitor.getChanDict(); }
}
