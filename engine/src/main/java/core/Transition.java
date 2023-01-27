package core;

import core.labels.Guard;
import core.types.Clock;
import org.antlr.v4.runtime.ParserRuleContext;

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

    public void addGuard(String[] clockRef, String comparisonOp, String[] left) {
        guards.add(new Guard(clockRef, comparisonOp, left));
    }
    public void addAction(String guard) { actions.add(guard); }
    public ArrayList<Guard> getGuards() { return guards; }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited() { visited = true; }
}
