package org.neocities.davidev.simmdiff.core.labels;

import org.antlr.v4.runtime.ParserRuleContext;

public class Invariant {

    private String invariant;
    public Invariant(String exp, ParserRuleContext ctx) {
        invariant = exp;
    }


    public String getInvariant() {
        return invariant;
    }

    private void setInvariant(Invariant inv) { invariant = inv.getInvariant(); }

    public void conjoin(Invariant invariant){
        if(invariant == null) return;
        // this ^ g
        if(this.invariant.equals(""))
            this.setInvariant(invariant);
        else if(invariant.equals(""))
            return;
        else
            setInvariant( new Invariant("("+this.invariant+") && ("+invariant+")", null));
    }
}
