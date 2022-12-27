// Generated from /home/david/eclipse-workspace/SimmDiffUppaal/engine/src/main/java/grammar/DiffParser.g4 by ANTLR 4.10.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DiffParser}.
 */
public interface DiffParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DiffParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(DiffParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiffParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(DiffParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiffParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(DiffParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiffParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(DiffParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiffParser#chardata}.
	 * @param ctx the parse tree
	 */
	void enterChardata(DiffParser.ChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiffParser#chardata}.
	 * @param ctx the parse tree
	 */
	void exitChardata(DiffParser.ChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiffParser#anything}.
	 * @param ctx the parse tree
	 */
	void enterAnything(DiffParser.AnythingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiffParser#anything}.
	 * @param ctx the parse tree
	 */
	void exitAnything(DiffParser.AnythingContext ctx);
}