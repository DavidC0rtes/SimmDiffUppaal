package org.neocities.daviddev.simmdiff.core;

import org.neocities.daviddev.simmdiff.core.types.Clock;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Orchestrates TAIOs
 */
public class Runner {
    private HashMap<String, Automata> automataHashMap;
    private HashMap<String, Clock> globalClocks;
    private HashMap<String, Location> computedLocations = new HashMap<>();
    private String globalDecl;
    public Runner(HashMap<String, Automata> automatas, HashMap<String, Clock> clocks, String globalDecl) {
        automataHashMap = automatas;
        globalClocks = clocks;
        this.globalDecl = globalDecl;
    }

    /**
     * Initialize clocks,
     * get enabled transitions, (reachability, bias)
     * choose non-deterministically from above set.
     * get enabled transitions ...
     * ...
     */
    public void start() {
        //globalClocks.values().forEach(Clock::run);
        int i = 0;
        for (Automata taio : automataHashMap.values()) {
            // Todo: This should be done in a thread for every TAIO.
            if (i == 0) taio.setCurrLocation(taio.getInitLocation());
            taio.setBiasedPaths(globalClocks, 10);
            i++;
        }
    }

    public String getXMLContent() {
        StringBuilder xml = new StringBuilder();
        System.out.println(automataHashMap.size());
        for (Automata taio : automataHashMap.values()) {

            xml.append("<template>\n");
            xml.append(taio.getXMLContent());
            xml.append("</template>\n");
        }

        return xml.toString();
    }

    public File getNTAProduct() {
        Object[] automataArr = automataHashMap.values().toArray();
        Automata result = new Automata("NTAProduct", null);
        if (automataArr.length == 1) {
            result = (Automata) automataArr[0];
        }

        for (int i = 1; i < automataArr.length; i+=2) {

            Automata A = (Automata) automataArr[i];
            Automata B = (Automata) automataArr[i-1];

            for (Location l: A.getLocations()) {
                for (Location j: B.getLocations()) {
                    result.addLocation(computePLocation(l,j));
                }
            }
            System.out.println("Transitions");

            ArrayList<Transition> Atransitions = new ArrayList<>(A.getEdges());
            ArrayList<Transition> Btransitions = new ArrayList<>(B.getEdges());
            computeTransitions(Atransitions, B.getLocations(), result, false);
            computeTransitions(Btransitions, A.getLocations(), result, true);

            String init = A.getInitLocation().getID()+ "_"+ B.getInitLocation().getID();
            System.out.printf("init loc of result is %s \n", init);
            result.setInitLocation(computedLocations.get(init));
        }

        Document document = DocumentHelper.createDocument();
        Element nta = document.addElement("workers");
        nta.addElement("declaration").addText(globalDecl);
        nta.add(result.getXMLElement());
        nta.addElement("system").addText(String.format("system %s;\n", result.getName()));
        return writeModel(document);
    }
    private void computeTransitions(ArrayList<Transition> transitions, ArrayList<Location> locs, Automata ta, boolean inverse) {
        for (Transition at : transitions) {
            for (Location j : locs) {
                String source, target;
                if (inverse) {
                    source = j.getID()+"_"+at.getSource().getID();
                    target = j.getID()+"_"+at.getTarget().getID();
                } else {
                    source = at.getSource().getID() +"_"+j.getID();
                    target = at.getTarget().getID() +"_"+j.getID();
                }

                System.out.println(source +"    ->    " + target);
                Location sourceLoc = computedLocations.get(source);
                Location targetLoc = computedLocations.get(target);
                Transition transition = new Transition(
                        sourceLoc,
                        targetLoc,
                        null
                );
                transition.setGuards(at.getGuards());
                transition.setGuard(at.getGuard());
                transition.setBias(at.hasBias());
                transition.setUpdate(at.getUpdate());
                // todo: guards
                if (sourceLoc != null)
                    sourceLoc.addOutgoing(transition);
                if (targetLoc != null)
                    targetLoc.addIncoming(transition);

                transition.setSynchronization(at.getSynchronization());

                ta.addEdge(transition);
            }
        }
    }

    /**
     * author: ksluckow
     * @param a
     * @param b
     * @return
     */
    private Location computePLocation(Location a, Location b) {
        String name = a.getName() +"_"+b.getName();
        String idstr = a.getID() + "_" + b.getID();
        Location result = new Location(name.replaceAll("\"", ""), false, null);
        if (result.getInvariant() != null) {
            result.getInvariant().conjoin(a.getInvariant());
            result.getInvariant().conjoin(b.getInvariant());
        }

        System.out.printf("adding loca %s\n", result.getName());
        computedLocations.put(idstr, result);
        return result;
    }

    private File writeModel(Document model) {
        File product = new File("src/main/" +
                "resources", "product.xml");
        try (FileWriter writer = new FileWriter(product))
        {
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter xwriter = new XMLWriter( writer, format );
            xwriter.setEscapeText(false);
            xwriter.write( model );
            xwriter.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return product;
    }
}
