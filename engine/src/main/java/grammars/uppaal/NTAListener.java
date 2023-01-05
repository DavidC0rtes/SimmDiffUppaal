package grammars.uppaal;


import core.Automata;
import core.Location;
import grammars.uppaal.antlr.UppaalParser;
import grammars.uppaal.antlr.UppaalParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;

public class NTAListener extends UppaalParserBaseListener {

    private StringBuilder content = new StringBuilder();
    private final ArrayList<Integer> bias;
    private HashMap<String, Automata> nameToTemplate;
    private String currentAutomata;

    public NTAListener(ArrayList<Integer> changedLines) {
        bias = new ArrayList<>(changedLines);
        nameToTemplate = new HashMap<>();
    }
    @Override
    public void enterTempContent(UppaalParser.TempContentContext ctx) {
        Automata bipbop = new Automata(ctx.name().getText());
        currentAutomata = bipbop.getName();
        nameToTemplate.put(currentAutomata, bipbop);
    }

    @Override
    public void enterLocation(UppaalParser.LocationContext ctx) {
        Location loc = new Location(ctx.ID().getText(), hasBias(ctx));
        nameToTemplate.get(currentAutomata).addLocation(loc);
    }

    private boolean hasBias(ParserRuleContext ctx) {
        for (int i = 0; i < bias.size() - 1; i+=2) {
            int line = ctx.getStart().getLine();
            if ( (line - bias.get(i)) * (line - bias.get(i+1)) <= 0) {
                return true;
            }
        }
        return false;
    }
}
