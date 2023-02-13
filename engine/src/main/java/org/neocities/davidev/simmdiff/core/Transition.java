package org.neocities.davidev.simmdiff.core;

import org.neocities.davidev.simmdiff.core.labels.Guard;
import org.neocities.davidev.simmdiff.core.labels.Label;
import org.neocities.davidev.simmdiff.core.labels.Sync;
import org.neocities.davidev.simmdiff.core.types.Clock;
import org.antlr.v4.runtime.ParserRuleContext;
import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Todo:
 *  actions
 */
public class Transition extends UppaalElement {
    private Location source;
    private Location target;
    private boolean bias, visited;
    private HashMap<String, Float> clocksDict;
    private Sync synchronization;
    private Label update, select, guard;
    private ArrayList<Clock> clocksToReset;
    private ArrayList<String> actions;
    private ArrayList<Guard> guards;
    private ParserRuleContext ctx;

    public Transition(Location s, Location t, boolean bias, ParserRuleContext ctx) {
        super(ctx);
        source = s; target = t;
        this.bias = bias;
        clocksToReset = new ArrayList<>();
        clocksDict = new HashMap<>();
        guards = new ArrayList<>();
        actions = new ArrayList<>();
        visited = false;
    }

    public Transition(Location s, Location t, ParserRuleContext ctx) {
        super(ctx);
        source = s; target = t;
        this.bias = false;
        clocksToReset = new ArrayList<>();
        clocksDict = new HashMap<>();
        guards = new ArrayList<>();
        actions = new ArrayList<>();
        visited = false;
    }
    public Location getSource() {
        return source;
    }

    public Location getTarget() {
        return target;
    }

    public boolean resetClocks() {
        for (Clock c : clocksToReset) {
            c.setValue(clocksDict.get(c.getId()));
            if (c.getValue() != clocksDict.get(c.getId()))
                return false;
        }
        return true;
    }

    public void addClockToReset(Clock c, float value) {
        clocksToReset.add(c);
        clocksDict.put(c.getId(), value);
    }
    public boolean hasBias() {
        return bias || target.hasBias();
    }

    public void addGuard(String expr) {
        guards.add(new Guard(expr));
    }

    public void setGuards(ArrayList<Guard> guardsArr) { guards = guardsArr; }
    public void addAction(String guard) { actions.add(guard); }
    public ArrayList<Guard> getGuards() { return guards; }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited() { visited = true; }
    public void setBias(boolean b) { this.bias = b; }

    public void setSynchronization(Sync synchronization) {
        if (synchronization != null)
            System.out.printf("Setting the sync as %s\n", synchronization.getExpr());
        this.synchronization = synchronization;
    }

    public Sync getSynchronization() {
        return synchronization;
    }

    public HashMap<String, Float> getClocksToReset() { return clocksDict; }

    public void setUpdate(Label update) {
        this.update = update;
    }

    public Element getXMLElement(Element father) {
        BaseElement transitionEl = new BaseElement("transition");
        if (source != null) {
            Element sourceEl = transitionEl.addElement("source");
            sourceEl.addAttribute("ref", source.getID().replaceAll("\"", ""));
        }

        if (target != null) {
            Element targetEl = transitionEl.addElement("target");
            targetEl.addAttribute("ref", target.getID().replaceAll("\"", ""));
        }

        for (Guard guard : guards) {
            transitionEl.addText(guard.getXMLContent());
        }

        if (update != null) {
            transitionEl.add(update.getXMLElement("assignment"));
        }
        if (select != null) transitionEl.add(select.getXMLElement("select"));
        if (guard != null) transitionEl.add(guard.getXMLElement("guard"));

        return transitionEl;
    }

    public void setSelect(Label selectLbl) {
        this.select = selectLbl;
    }

    public Label getUpdate() {
        return update;
    }

    public Label getGuard() {
        return guard;
    }
    public void setGuard(Label label) {
        guard = label;
    }
}
