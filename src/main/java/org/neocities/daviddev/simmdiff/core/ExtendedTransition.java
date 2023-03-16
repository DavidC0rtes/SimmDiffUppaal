package org.neocities.daviddev.simmdiff.core;

import de.tudarmstadt.es.juppaal.Automaton;
import de.tudarmstadt.es.juppaal.Location;
import de.tudarmstadt.es.juppaal.Transition;
import de.tudarmstadt.es.juppaal.labels.Label;

import org.neocities.daviddev.simmdiff.core.types.Channel;


public class ExtendedTransition extends Transition {

    private Channel channel;
    private ExtendedLocation extSource, extTarget;
    private Automaton automaton;

    public ExtendedTransition(Automaton automaton, Location source, Location destination, Channel channel) {
        super(automaton, source, destination);
        if (source != null) {
            this.setSource(new ExtendedLocation(automaton, source.getName(),
                    source.getType(),
                    0, 0,
                    source.getOutgoingTransitions(),
                    source.getIncommingTransitions()));
        }

        if (destination != null){
            this.setTarget(new ExtendedLocation(automaton, destination.getName(),
                    destination.getType(),
                    0, 0,
                    destination.getOutgoingTransitions(),
                    destination.getIncommingTransitions()));
        }
        this.automaton = automaton;
        this.channel = channel;

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

        if ( !tran.getSource().equals( this.getSource()) || !tran.getTarget().equals(this.getTarget()) ) {
            return false;
        }

        if (!this.getGuardAsString().equals(tran.getGuardAsString())) {
            return false;
        }

        if (!areLabelsEqual(this.getUpdate(), tran.getUpdate())) {
            return false;
        }
        if (!areLabelsEqual(this.getSelect(), tran.getSelect())) {
            return false;
        }
        if (!areLabelsEqual(this.getSync(), tran.getSync())) {
            return false;
        }

        return this.channel.equals(tran.getChannel());
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

        if (this.getSync() != null) {
            result = 31 * result + this.getSync().hashCode();
            result = 31 * result + this.getChannel().hashCode();
        }

        return result;
    }

    private boolean areLabelsEqual(Label label1, Label label2) {

        if (label1 == null ^ label2 == null ) {
            return false;
        } else if (label1 != null && label2 != null) {
            return label1.toString().equals(label2.toString());
        }

        return true;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", this.getSource(), this.getTarget());
    }

    public Channel getChannel() {
        return channel;
    }
}
