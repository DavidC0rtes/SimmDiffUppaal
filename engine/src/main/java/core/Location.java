package core;

import grammars.uppaal.antlr.UppaalParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

public class Location extends UppaalElement{
    private ArrayList<Transition> incomingTransitions, outgoingTransitions;
    private boolean bias;
    private String id;
    private ParserRuleContext ctx;

    public Location( String id, boolean bias, ParserRuleContext ctx) {
        super(ctx);
        this.id = id;
        incomingTransitions = new ArrayList<>();
        outgoingTransitions = new ArrayList<>();
        this.bias = bias;
    }
    public Location( String id, ParserRuleContext ctx) {
        super(ctx);
        this.id = id;
        incomingTransitions = new ArrayList<>();
        outgoingTransitions = new ArrayList<>();
        this.bias = false;
    }
    public boolean hasBias() {
        return bias;
    }
    public void addSource(Transition tran) { incomingTransitions.add(tran); }
    public void addTarget(Transition tran) { outgoingTransitions.add(tran); }

    public ArrayList<Transition> getOutgoings() { return outgoingTransitions; }
    public ArrayList<Transition> getIncomingTransitions() { return incomingTransitions; }
}
