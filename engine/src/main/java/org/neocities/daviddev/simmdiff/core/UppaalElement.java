package org.neocities.daviddev.simmdiff.core;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class UppaalElement {

    protected ParserRuleContext ctx;
    protected String x,y, coord;

    public UppaalElement(ParserRuleContext ctx) {this.ctx = ctx; }
    public UppaalElement(ParserRuleContext ctx, String coord) {
        this.ctx = ctx;
        this.coord=coord;
        setCoordFromRegex(coord);
    }
    public UppaalElement() {

    }
    public UppaalElement(String coord) {
        this.coord=coord;
        setCoordFromRegex(coord);
    }
    public String getXMLContent() {
        return ctx.getText();
    }

    private void setCoordFromRegex(String input) {
        String regex = "^x=\"(-?\\d+)\" y=\"(-?\\d+)\"$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            this.x = matcher.group(1);
            this.y = matcher.group(2);
        }

    }

    public String getCoord() {
        return coord;
    }
}
