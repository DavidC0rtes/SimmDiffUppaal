package org.neocities.daviddev.tracematcher.core.labels;

import org.dom4j.Element;
import org.dom4j.tree.BaseElement;

public class Label {
    private String expr;

    public Label(String expr) {
        this.expr = expr;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }
    public Element getXMLElement(String kind) {
        BaseElement syncEl = new BaseElement("label");
        syncEl.addAttribute("kind", kind);

        syncEl.addText(expr);
        return syncEl;
    }
}
