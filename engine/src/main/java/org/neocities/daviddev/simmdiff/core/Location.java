package org.neocities.daviddev.simmdiff.core;

import org.neocities.daviddev.simmdiff.core.labels.Invariant;

import org.antlr.v4.runtime.ParserRuleContext;
import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

import java.util.ArrayList;

public class Location extends UppaalElement{
    private ArrayList<Transition> incomingTransitions, outgoingTransitions;
    private boolean bias;
    private Invariant invariant;
    private String id, name, x,y;
    private ParserRuleContext ctx;

    public Location( String id, String  coord, boolean bias, ParserRuleContext ctx) {
        super(ctx, coord);
        this.id = id;
        incomingTransitions = new ArrayList<>();
        outgoingTransitions = new ArrayList<>();
        this.bias = bias;
    }
    public Location( String id, String coord, ParserRuleContext ctx) {
        super(ctx, coord);
        this.id = id;
        incomingTransitions = new ArrayList<>();
        outgoingTransitions = new ArrayList<>();
        this.bias = false;
    }

    public Location(ParserRuleContext ctx, String id, String name) {
        super(ctx);
        this.id = id;
        this.name = name;
        incomingTransitions = new ArrayList<>();
        outgoingTransitions = new ArrayList<>();
        this.bias = false;
    }

    public Location( String id, boolean bias, ParserRuleContext ctx) {
        super(ctx);
        this.id = id;
        incomingTransitions = new ArrayList<>();
        outgoingTransitions = new ArrayList<>();
        this.bias = bias;
    }
    public boolean hasBias() {
        return bias;
    }
    public void addIncoming(Transition tran) { incomingTransitions.add(tran); }
    public void addOutgoing(Transition tran) { outgoingTransitions.add(tran); }
    public void setInvariant(Invariant inv) { invariant = inv; }

    public String getName() {
        if (name != null)
            return name;
        return id;
    }
    public ArrayList<Transition> getOutgoings() { return outgoingTransitions; }
    public ArrayList<Transition> getIncomingTransitions() { return incomingTransitions; }

    public void orderTransitions() {
        outgoingTransitions.sort((t1, t2) -> {
            if (t1.hasBias() && !t2.hasBias()) {
                return 1;
            } else if (t2.hasBias() && !t1.hasBias()) {
                return -1;
            } else {
                return 0;
            }
        });
    }

    public String getID() {
        return id;
    }

    public Invariant getInvariant() {
        return invariant;
    }

    public Element getXMLStr() {
        Element locElement = new BaseElement("location");
        locElement.addAttribute("id", id.replaceAll("\"", ""));
        locElement.addElement("name").addText(this.getName());
        return locElement;
    }
}
