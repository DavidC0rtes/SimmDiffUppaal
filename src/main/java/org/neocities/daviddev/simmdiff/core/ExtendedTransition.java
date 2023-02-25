package org.neocities.daviddev.simmdiff.core;

import de.tudarmstadt.es.juppaal.Automaton;
import de.tudarmstadt.es.juppaal.Location;
import de.tudarmstadt.es.juppaal.Transition;
import org.jdom.Element;

public class ExtendedTransition extends Transition {

    public ExtendedTransition(Automaton automaton, Location source, Location destination) {
        super(automaton, source, destination);
    }

    public ExtendedTransition(Automaton automaton, Location source) {
        super(automaton, source);
    }

    public ExtendedTransition(Automaton automaton, Element transitionElement) {
        super(automaton, transitionElement);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            System.out.println("TRUE");
            return true;
        }

        if (!(o instanceof Transition)) {
            System.out.println("DANGER!!!");
            return false;
        }

        ExtendedTransition tran = (ExtendedTransition) o;

        if (tran.getSource() != this.getSource() || tran.getTarget() != this.getTarget() ) {
            return false;
        }

        if (!this.getGuardAsString().equals(tran.getGuardAsString())) {
            return false;
        }

        if (!this.getUpdate().toString().equals(tran.getUpdate().toString())) {
            return false;
        }

        if (!this.getSync().toString().equals(tran.getSync().toString())) {
            return false;
        }

        return this.getSelect().toString().equals(tran.getSelect().toString());
    }

    @Override
    public int hashCode() {
        int result = this.getGuardAsString().hashCode();

        if (this.getSource() != null)
            result = 31 * result + this.getSource().hashCode();

        if (this.getTarget() != null) {
            result = 31 * result + this.getTarget().hashCode();
        }

        if (this.getUpdate() != null)
            result = 31 * result + this.getUpdate().hashCode();

        if (this.getSync() != null)
            result = 31 * result + this.getSync().hashCode();



        return result;
    }
}
