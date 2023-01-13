package core;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Location {

    private boolean isBias = false;
    private ArrayList<Transition> sources, targets;
    private String id;
    // todo: invariants
    public Location( String id, boolean bias) {
        isBias = bias;
        this.id = id;
        sources = new ArrayList<>();
        targets = new ArrayList<>();
    }
    public boolean hasBias() {
        return isBias;
    }
    public void addSource(Transition tran) { sources.add(tran); }
    public void addTarget(Transition tran) { targets.add(tran); }

    public ArrayList<Transition> getOutgoings() { return targets; }
    public ArrayList<Transition> getSources() { return sources; }
}
