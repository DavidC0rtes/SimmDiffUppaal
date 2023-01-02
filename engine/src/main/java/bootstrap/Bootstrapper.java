package bootstrap;

import grammars.diff.DiffLexer;
import grammars.diff.DiffParser;
import grammars.diff.ExtendedDiffListener;
import grammars.uppaal.NTAListener;
import grammars.uppaal.antlr.UppaalLexer;
import grammars.uppaal.antlr.UppaalParser;
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
        mutantFile = mutant;

        // Parse the diff
        parse(diffStr);
        // Then parse the generated mutant
        parse(mutantFile);
    }

    public void parse(File file) throws IOException {
        CharStream input = CharStreams.fromFileName(file.getPath());
        UppaalLexer mutantLexer = new UppaalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(mutantLexer);

        UppaalParser parser = new UppaalParser(tokens);
        ParseTree tree = parser.model();

        // Create walker
        ParseTreeWalker walker = new ParseTreeWalker();
        // Create listener then feed to walker.
        NTAListener listener = new NTAListener();
        walker.walk(listener, tree);
    }

    public void parse(String strContent) throws IOException {
        CharStream input = CharStreams.fromString(strContent);
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
