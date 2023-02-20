package org.neocities.daviddev.simmdiff.core;

import de.tudarmstadt.es.juppaal.Automaton;
import de.tudarmstadt.es.juppaal.Location;
import de.tudarmstadt.es.juppaal.Name;
import de.tudarmstadt.es.juppaal.Transition;
import org.jdom.Element;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class ExtendedLocation extends Location {
    public ExtendedLocation(Automaton automaton) {
        super(automaton);
    }

    public ExtendedLocation(Automaton automaton, Element locationElement) {
        super(automaton, locationElement);
    }

    public ExtendedLocation(Automaton automaton, Name name, LocationType type, int x, int y, List<Transition> outgoingTransitions, List<Transition> incomingTransitions) {
        super(automaton, name, type, x, y);

        for (Transition transition : outgoingTransitions) {
            this.addOutgoingTransition(transition);
        }

        for (Transition transition : incomingTransitions) {
            this.addIncomingTransition(transition);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            System.out.println("TRUE");
            return true;
        }

        if (!(o instanceof Location)) {
            System.out.println("DANGER!!!");
            return false;
        }
        ExtendedLocation loc = (ExtendedLocation) o;
        //System.out.printf("%s != %s ", loc.getName().getName(), this.getName().getName());
        if (!loc.getName().getName().equals(this.getName().getName()))
            return false;

        //System.out.printf("%d != %d ", loc.getIncommingTransitions().size(), this.getIncommingTransitions().size());
        if (loc.getIncommingTransitions().size() != this.getIncommingTransitions().size()) {
            return false;
        }

        //System.out.printf("%d != %d ", loc.getOutgoingTransitions().size(), this.getOutgoingTransitions().size());
        if (loc.getOutgoingTransitions().size() != this.getOutgoingTransitions().size()) {
            return false;
        }

        if (loc.getType() != this.getType())
            return false;

        //System.out.printf("%s != %s ", loc.getAutomaton().getName().getName(), this.getAutomaton().getName().getName());
        if (!loc.getAutomaton().getName().getName().equals(this.getAutomaton().getName().getName()))
            return false;

        //System.out.printf("%s == %s \n", loc.getInvariantAsString(), this.getInvariantAsString());
        return loc.getInvariantAsString().equals(this.getInvariantAsString());
    }

    @Override
    public int hashCode() {
        int result = this.getAutomaton().getName().getName().hashCode();

        result = 31 * result + LocationType.NORMAL.hashCode();
        result = 31 * result + Integer.hashCode(this.getIncommingTransitions().size());
        result = 31 * result + Integer.hashCode(this.getOutgoingTransitions().size());
        result = 31 * result + this.getName().getName().hashCode();
        if (this.getInvariant() == null) {
            result *= 31;
        } else {
            result = 31 * result + this.getInvariantAsString().hashCode();
        }

        System.out.printf("hash code is %d for %s\n", result, this.getName().getName());
        return result;
    }

    public void magic() {System.out.println("edjdedjei");}
}
