package grammar;

import java.util.ArrayList;

public class ExtendedDiffListener extends DiffParserBaseListener {

    private ArrayList<Integer> changedLines;
    @Override
    public void exitLineRange(DiffParser.LineRangeContext ctx) {
        ctx.DIGIT().forEach(x -> changedLines.add(Integer.parseInt(x.getText())));
    }

    public ArrayList<Integer> getChangedLines() {
        return changedLines;
    }
}
