package core;

import core.types.Clock;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Todo:
 *  Guards, actions, clocks to be reset.
 */
public class Transition {
    private Location source;
    private Location target;
    private boolean bias;
    private HashMap<String, Float> clocksDict;
    private ArrayList<Clock> clocksToReset;
    private ArrayList<String> guards, actions;
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

    /**
     * Receives a guard in its string representation and adds it to guards array.
     * @param guard a string of the form x op n, where x is a clock, op a comparison operator
     * and n a float value.
     */
    public void addGuard(String guard) { guards.add(guard); }
    public void addAction(String guard) { actions.add(guard); }
}
