package core;

import core.types.Clock;

import org.antlr.v4.runtime.ParserRuleContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Todo:
 * Input and Output actions sets, set of clocks, local channels
 */
public class Automata extends UppaalElement {

    private String name;
    private Location initLocation;
    private ArrayList<Transition> edges;
    private ArrayList<Location> locations;
    private ArrayList<Thread> threadsArr;
    private HashMap<String, Clock> localClocks;
    private HashMap<Integer, ArrayList<Location>> biasedPaths;
    private Location currLocation;
    private ParserRuleContext ctx;

    public Automata(String name, ParserRuleContext ctx) {
        super(ctx);
        this.name = name;
        edges = new ArrayList<>();
        locations = new ArrayList<>();
        localClocks = new HashMap<>();
    }

    public void setInitLocation(Location l) { initLocation = l; }

    public void setCurrLocation(Location currLocation) {
        this.currLocation = currLocation;
    }

    public Location getCurrLocation() { return currLocation; }

    public void addEdge(Transition transition) {
        edges.add(transition);
    }

    public void addLocation(Location loc) {
        locations.add(loc);
    }
    public void addClock(Clock c) { localClocks.put(c.getId(), c); }
    public String getName() {
        return name;
    }

    public Location getInitLocation() {
        return initLocation;
    }

    /**
     * Computes the biased paths that exists in this automaton by exploring each possible path
     * starting from the initial location and until a maximum depth is reached.
     * @param globalClocks
     * @param maxDepth
     */
    public void setBiasedPaths (HashMap<String, Clock> globalClocks, int maxDepth) {
        ArrayList<Location> A = new ArrayList<>(Collections.singletonList(initLocation));

        int depth = 0;

        System.out.printf("Number of locations %d\n", locations.size());

            for (Location loc : A) {
                for (Transition tran : loc.getOutgoings()) {
                    if (!tran.isVisited() && tran.hasBias())
                        A.add(tran.getTarget());
                }
            }
    }

    public ArrayList<Location> getLocations() { return locations; }
}
