package core;

import core.types.Clock;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Todo:
 *  actions
 */
public class Transition {
    private Location source;
    private Location target;
    private boolean bias;
    private HashMap<String, Float> clocksDict;
    private ArrayList<Clock> clocksToReset;
    private ArrayList<String> actions;
    private ArrayList<Guard> guards;
    public Transition(Location s, Location t, boolean bias) {
        source = s; target = t;
        this.bias = bias;
        clocksToReset = new ArrayList<>();
        clocksDict = new HashMap<>();
        guards = new ArrayList<>();
        actions = new ArrayList<>();
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
        return bias;
    }

    public void addGuard(String clockRef, String comparisonOp, float value) {
        guards.add(new Guard(clockRef, comparisonOp, value));
    }
    public void addAction(String guard) { actions.add(guard); }

    public ArrayList<Guard> getGuards() {
        return guards;
    }
}
