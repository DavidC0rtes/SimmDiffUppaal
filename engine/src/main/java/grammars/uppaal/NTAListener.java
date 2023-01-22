package grammars.uppaal;


import core.Automata;
import core.Location;
import core.Transition;
import core.types.Clock;
import grammars.uppaal.antlr.UppaalParser;
import grammars.uppaal.antlr.UppaalParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;

public class NTAListener extends UppaalParserBaseListener {

    private StringBuilder content = new StringBuilder();
    private final ArrayList<Integer> bias;

    public HashMap<String, Automata> getNameToTemplate() {
        return nameToTemplate;
    }

    private HashMap<String, Automata> nameToTemplate;
    private HashMap<String, Location> locationsMap;

    public HashMap<String, Clock> getGlobalClocks() {
        return globalClocks;
    }

    private HashMap<String, Clock> globalClocks;
    private String currentAutomata;

    public NTAListener(ArrayList<Integer> changedLines) {
        bias = new ArrayList<>(changedLines);
        nameToTemplate = new HashMap<>();
        locationsMap = new HashMap<>();
        globalClocks = new HashMap<>();
    }

    @Override
    public void enterTempContent(UppaalParser.TempContentContext ctx) {
        Automata bipbop = new Automata(ctx.name().anything().getText(), ctx);
        currentAutomata = bipbop.getName();
        nameToTemplate.put(currentAutomata, bipbop);
    }
    @Override
    public void exitTempContent(UppaalParser.TempContentContext ctx) {
        //System.out.println(nameToTemplate.get(currentAutomata).getName());
    }

    @Override
    public void enterLocation(UppaalParser.LocationContext ctx) {
        Location loc = new Location(ctx.ID().getText(), hasBias(ctx), ctx);
        locationsMap.put(ctx.STRING().getText(), loc);
        nameToTemplate.get(currentAutomata).addLocation(loc);
    }

    @Override
    public void enterTransition(UppaalParser.TransitionContext ctx) {
        Transition tran = new Transition(
                locationsMap.get(ctx.source().STRING().getText()),
                locationsMap.get(ctx.target().STRING().getText()),
                hasBias(ctx),
                ctx
        );
        nameToTemplate.get(currentAutomata).addEdge(tran);
    }

    @Override
    public void enterInitLoc(UppaalParser.InitLocContext ctx) {
        nameToTemplate.get(currentAutomata).setInitLocation(
                locationsMap.get(ctx.STRING().getText())
        );
    }

    @Override
    public void enterVariableDecl(UppaalParser.VariableDeclContext ctx) {
        if (ctx.type().typeId().getText().equals("clock")) {
            for (UppaalParser.VariableIDContext varID : ctx.variableID()) {
                Clock foo = new Clock(varID.IDENTIFIER().getText());
                if (currentAutomata != null) {
                    nameToTemplate.get(currentAutomata).addClock(foo);
                } else {
                    globalClocks.put(varID.IDENTIFIER().getText(), foo);
                }

            }
        }
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
