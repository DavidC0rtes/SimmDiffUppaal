package core;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Todo:
 * Input and Output actions sets, set of clocks, local channels
 */
public class Automata {

    private String name;
    private Location initLocation;
    private ArrayList<Transition> edges;
    private ArrayList<Location> locations;

    public Automata(String name) {
        this.name = name;
        edges = new ArrayList<>();
        locations = new ArrayList<>();
    }

    public void setInitLocation(Location l) { initLocation = l; }

    public void addEdge(Transition transition) {
        edges.add(transition);
    }

    public void addLocation(Location loc) {
        locations.add(loc);
    }

    public String getName() {
        return name;
    }
}
