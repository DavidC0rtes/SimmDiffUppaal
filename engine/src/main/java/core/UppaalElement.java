package core;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class UppaalElement {

    private ParserRuleContext ctx;

    public UppaalElement(ParserRuleContext ctx) {
        this.ctx = ctx;
    }
    public UppaalElement() {

    }
    public String getXMLContent() {
        return ctx.getText();
    }
}
