package org.neocities.daviddev.simmdiff.core;

import org.neocities.daviddev.simmdiff.core.types.Clock;

import org.antlr.v4.runtime.ParserRuleContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

/**
 * Todo:
 * Input and Output actions sets, set of clocks, local channels
 */
public class Automata extends UppaalElement {

    private String name, declContent;
    private Location initLocation;
    private ArrayList<Transition> edges;
    private ArrayList<Location> locations;
    private HashMap<String, Clock> localClocks;
    private HashMap<Integer, ArrayList<Location>> biasedPaths;
    private HashMap<String, Transition> edgesHashMap;
    private Location currLocation;

    public Automata(String name, ParserRuleContext ctx) {
        super(ctx);
        this.name = name;
        edges = new ArrayList<>();
        locations = new ArrayList<>();
        localClocks = new HashMap<>();
        edgesHashMap = new HashMap<>();
    }

    public void setInitLocation(Location l) { initLocation = l; }

    public void setCurrLocation(Location currLocation) {
        this.currLocation = currLocation;
    }

    public Location getCurrLocation() { return currLocation; }

    public void addEdge(Transition transition) {
        edges.add(transition);
        String sourceStr = transition.getSource() != null
                ? transition.getSource().getID()
                : "nil";

        String targetStr = transition.getTarget() != null
                ? transition.getTarget().getID()
                : "nil";

        edgesHashMap.put(
                String.format("%s->%s", sourceStr, targetStr),
                transition
        );
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
                System.out.printf("Location %s has %d outgoings\n", loc.getName(), loc.getOutgoings().size());
                for (Transition tran : loc.getOutgoings()) {
                    if (tran.hasBias())
                        System.out.printf("Location %s has bias\n", tran.getTarget().getName());
                        A.add(tran.getTarget());
                }
            }
    }

    public ArrayList<Location> getLocations() { return locations; }

    public ArrayList<Transition> getEdges() {
        return edges;
    }

    public Element getXMLElement() {
        //Element template = workers.addElement("template");
        Element template = new BaseElement("template");

        template.addElement("name")
                .addText(name);

        for (Location location : locations) {
            template.add(location.getXMLStr());
        }

        System.out.println(initLocation);
        Element initEl = template.addElement("init");
        initEl.addAttribute("ref", initLocation.getID().replaceAll("\"", ""));

        for (Transition tran : edges) {
            template.add(tran.getXMLElement(template));
        }

        return template;
    }

    public HashMap<String, Transition> getEdgesHashMap() {
        return edgesHashMap;
    }

    public void setDeclContent(String decl) {
        this.declContent = decl;
    }
}
