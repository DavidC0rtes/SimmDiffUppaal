package grammars.uppaal;


import grammars.uppaal.antlr.UppaalParser;
import grammars.uppaal.antlr.UppaalParserBaseListener;

public class NTAListener extends UppaalParserBaseListener {

    private StringBuilder content = new StringBuilder();

    @Override
    public void exitModel(UppaalParser.ModelContext ctx) {
        String model = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<!DOCTYPE nta PUBLIC '-//Uppaal Team//DTD Flat System 1.1//EN' 'http://www.it.uu.se/research/group/darts/uppaal/flat-1_2.dtd'>\n";

        content.append(model);
    }

    public String getStringContent() { return content.toString(); }
}
