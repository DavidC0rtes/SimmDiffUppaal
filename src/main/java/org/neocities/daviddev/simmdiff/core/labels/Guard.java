package org.neocities.daviddev.simmdiff.core.labels;

import org.neocities.daviddev.simmdiff.core.UppaalElement;

public class Guard extends UppaalElement {
    private String expr;
    /**
     * Creates a new Guard element
     */
    public Guard(String expr) {
        this.expr = expr;
    }

    public String getExpr() {
        return expr;
    }

    public String getXMLContent() {
        return String.format(
                "<label kind=\"guard\" %s>%s</location>\n"
                ,coord, expr);
    }

    public String getCoord() {
        return coord;
    }
}
