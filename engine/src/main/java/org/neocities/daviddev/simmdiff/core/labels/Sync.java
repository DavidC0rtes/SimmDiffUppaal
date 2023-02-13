package org.neocities.daviddev.simmdiff.core.labels;

import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

public class Sync {

    private String expr;

    public Sync(String expr) {
        this.expr = expr;
    }

    public String getXMLContent() {
        return String.format("<label kind=\"synchronisation\">%s</label>\n", expr);
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }
    public Element getXMLElement() {
        BaseElement syncEl = new BaseElement("label");
        syncEl.addAttribute("kind", "synchronisation");
        syncEl.addText(expr);

        return syncEl;
    }
}
