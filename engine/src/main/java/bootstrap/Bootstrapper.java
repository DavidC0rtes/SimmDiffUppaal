package bootstrap;

import grammar.DiffLexer;
import grammar.DiffParser;
import grammar.ExtendedDiffListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;

public class Bootstrapper {

    private DiffParser diffParser;
    private DiffLexer diffLexer;
    private ParseTree diffTree;
    private ExtendedDiffListener diffListener;
    private File mutantFile;
    public Bootstrapper(File mutant, String diffStr) throws IOException {
        System.out.println(diffStr);
        mutantFile = mutant;
        CharStream input = CharStreams.fromString(diffStr);
        diffLexer = new DiffLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(diffLexer);

        diffParser = new DiffParser(tokens);
        diffTree = diffParser.document();

        // Create walker
        ParseTreeWalker walker = new ParseTreeWalker();
        // Create listener then feed to walker.
        diffListener = new ExtendedDiffListener();
        walker.walk(diffListener, diffTree);
    }
}
