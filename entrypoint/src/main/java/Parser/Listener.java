package Parser;

import Parser.Antlr.UppaalParser;
import Parser.Antlr.UppaalParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends UppaalParserBaseListener {

    private StringBuilder content = new StringBuilder();

    @Override
    public void exitModel(UppaalParser.ModelContext ctx) {
        String model = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<!DOCTYPE nta PUBLIC '-//Uppaal Team//DTD Flat System 1.1//EN' 'http://www.it.uu.se/research/group/darts/uppaal/flat-1_2.dtd'>\n";

        content.append(model);
    }

    public String getStringContent() { return content.toString(); }
}
