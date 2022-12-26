package Parser.helper;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public interface VisitorHelper {
    /**
     * This method receives a list of ParserRuleContext and returns
     * a String with the String representation of every item in the list
     * separated by commas, under the assumption that every item represents a TerminalNode.
     * @param lst list of <code>ParserRuleContext</code>.
     * @return String.
     */
    default String extractChildren(List<? extends ParserRuleContext> lst) {
        StringBuilder str = new StringBuilder();
        String sep = "";
        for (ParserRuleContext ctx : lst ) {
            str.append(sep).append(ctx.getText());
            sep = ", ";
        }

        return str.toString();
    }

    /**
     * This method receives a list of ParserRuleContext and returns
     * a String with the String representation of every item in the list
     * separated by commas, under the assumption that every item represents a TerminalNode.
     * @param lst list of <code>ParserRuleContext</code>.
     * @param sep String that separates every child
     * @return String.
     */
    default String extractChildren(List<? extends ParserRuleContext> lst, String sep) {
        StringBuilder str = new StringBuilder();
        String separator = sep;
        for (ParserRuleContext ctx : lst ) {
            str.append(separator).append(ctx.getText());
            separator = "\n" + sep;
        }

        return str.toString();
    }
}
