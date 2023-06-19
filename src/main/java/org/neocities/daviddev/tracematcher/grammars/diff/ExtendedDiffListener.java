package org.neocities.daviddev.tracematcher.grammars.diff;

import java.util.ArrayList;

public class ExtendedDiffListener extends DiffParserBaseListener {

    private final ArrayList<Integer> lineRanges = new ArrayList<>();
    private ArrayList<String> changedLines = new ArrayList<>();
    @Override
    public void exitLineRange(DiffParser.LineRangeContext ctx) {
        ctx.DIGIT().forEach(x -> lineRanges.add(Integer.parseInt(x.getText())));
    }

    public ArrayList<Integer> getLineRanges() {
        return lineRanges;
    }
}
