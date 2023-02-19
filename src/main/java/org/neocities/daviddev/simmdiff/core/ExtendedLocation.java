package org.neocities.daviddev.simmdiff.core;

import de.tudarmstadt.es.juppaal.Automaton;
import de.tudarmstadt.es.juppaal.Location;
import de.tudarmstadt.es.juppaal.Name;
import org.jdom.Element;

import java.util.HashSet;

public class ExtendedLocation extends Location {
    public ExtendedLocation(Automaton automaton) {
        super(automaton);
    }

    public ExtendedLocation(Automaton automaton, Element locationElement) {
        super(automaton, locationElement);
    }

    public ExtendedLocation(Automaton automaton, Name name, LocationType type, int x, int y) {
        super(automaton, name, type, x, y);
    }

    public ExtendedLocation(Automaton automaton, String name) {
        super(automaton, name);
    }

    @Override
    public boolean equals(Object o) {
        System.out.printf("Comparing %s with %s\n", o.toString(), this.toString());
        if (!(o instanceof Location)) return false;
        System.out.println("A");
        if (((Location) o).getType() != this.getType()) return false;
        System.out.println("B");
        if (!new HashSet<>(((Location) o).getOutgoingTransitions()).containsAll(this.getOutgoingTransitions())) return false;
        System.out.println("C");
        if (!new HashSet<>(((Location) o).getIncommingTransitions()).containsAll(this.getIncommingTransitions())) return false;
        System.out.println("D");
        if (!(((Location) o).getInvariant() == this.getInvariant())) return false;
        System.out.println("equal");
        return true;
    }

  /*  @Override
    public int hashCode() {
        int code = 1;

        switch (this.getType()) {
            case NORMAL: code *= 2; break;
            case URGENT: code *= 3; break;
            case COMMITTED: code *= 4; break;
        }

        return code;
    }*/

    public void magic() {System.out.println("edjdedjei");}
}
