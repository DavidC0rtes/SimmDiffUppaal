package org.neocities.daviddev.tracematcher.grammars.uppaal;


import org.neocities.daviddev.tracematcher.core.labels.Label;
import org.neocities.daviddev.tracematcher.core.labels.Sync;
import org.neocities.daviddev.tracematcher.grammars.uppaal.antlr.*;
import org.neocities.daviddev.tracematcher.core.Automata;
import org.neocities.daviddev.tracematcher.core.Location;
import org.neocities.daviddev.tracematcher.core.Transition;
import org.neocities.daviddev.tracematcher.core.types.Clock;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class NTAListener extends UppaalParserBaseListener {

    private StringBuilder content = new StringBuilder();
    private final ArrayList<Integer> bias;

    public void setGlobalDeclarations(String globalDeclarations) {
        this.globalDeclarations = globalDeclarations;
    }

    private String globalDeclarations;

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

    public NTAListener() {
        bias = new ArrayList<>();
        nameToTemplate = new HashMap<>();
        locationsMap = new HashMap<>();
        globalClocks = new HashMap<>();
    }
    @Override
    public void enterDeclContent(UppaalParser.DeclContentContext ctx) {
        if (currentAutomata != null) {
            nameToTemplate.get(currentAutomata).setDeclContent(ctx.getText());
        } else {
            globalDeclarations = ctx.getText();
        }
    }

    @Override
    public void enterTempContent(UppaalParser.TempContentContext ctx) {
        Automata bipbop = new Automata(ctx.name().anything().getText(), ctx);
        currentAutomata = bipbop.getName();
        nameToTemplate.put(currentAutomata, bipbop);
    }
    @Override
    public void exitTempContent(UppaalParser.TempContentContext ctx) {
        // Order each automata's transitions according to bias.
        ArrayList<Location> locations = nameToTemplate.get(currentAutomata).getLocations();
        locations.forEach(Location::orderTransitions);
    }

    @Override
    public void enterLocation(UppaalParser.LocationContext ctx) {
        boolean hasBias = hasBias(ctx);
        Location loc = new Location(ctx.STRING().getText(), hasBias, ctx);
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

        String key = ctx.source().STRING().getText() + "->"+ctx.target().STRING().getText();

        nameToTemplate.get(currentAutomata).addEdge(tran);
        nameToTemplate.get(currentAutomata).getEdgesHashMap().put(key, tran);
        if (ctx.labelTransSyncInput().size() >= 1) {
            tran.setSynchronization(
                    new Sync(ctx.labelTransSyncInput(0).expr().getText()+"?")
            );
        } else if (ctx.labelTransSyncOutput().size() >= 1) {
            tran.setSynchronization(
                    new Sync(ctx.labelTransSyncOutput(0).expr().getText()+"!")
            );
        }

        if (ctx.labelTransGuard().size() > 0) {
            tran.setGuard(new Label(ctx.labelTransGuard(0).guardExpr().getText()));
        }
        if (ctx.labelTransGuard().size() > 1) {
            System.out.println("More than 1 guard !!!!");
        }
    }

    @Override
    public void enterLabelUpdate(UppaalParser.LabelUpdateContext ctx) {
        UppaalParser.TransitionContext transitionContext = (UppaalParser.TransitionContext) ctx.getParent().getParent().getRuleContext();

        Stream<String> stringStream = ctx.expr().stream().map(RuleContext::getText);
        String expr = stringStream.reduce("", (accum, element) -> accum+element);
        Label updateLbl = new Label(expr);

        String key = transitionContext.source().STRING().getText() + "->"+transitionContext.target().STRING().getText();
        Transition transition =  nameToTemplate.get(currentAutomata)
                .getEdgesHashMap().get(key);

        System.out.printf("Adding update label to %s\n", key);
        transition.setUpdate(updateLbl);
    }
    @Override
    public void enterLabelSelect(UppaalParser.LabelSelectContext ctx) {
        UppaalParser.TransitionContext transitionContext = (UppaalParser.TransitionContext) ctx.getParent().getParent().getRuleContext();
        Label selectLbl = new Label(ctx.selectList().getText());
        String key = transitionContext.source().STRING().getText() + "->"+transitionContext.target().STRING().getText();
        nameToTemplate.get(currentAutomata)
                .getEdgesHashMap().get(key).setSelect(selectLbl);
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
            System.out.printf("Checking if line %d is inside %d-%d\n", line, bias.get(i), bias.get(i+1));
            if ( (line - bias.get(i)) * (line - bias.get(i+1)) <= 0) {
                return true;
            }
        }
        return false;
    }

    public String getGlobalDeclarations() {
        return globalDeclarations;
    }
}
