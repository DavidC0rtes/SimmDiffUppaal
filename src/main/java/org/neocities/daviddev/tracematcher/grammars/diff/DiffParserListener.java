// Generated from /home/david/Documents/SimmDiffUppaal/src/main/java/org/neocities/daviddev/tracematcher/grammars/diff/DiffParser.g4 by ANTLR 4.12.0
package org.neocities.daviddev.tracematcher.grammars.diff;
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
	 * Enter a parse tree produced by {@link DiffParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(DiffParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiffParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(DiffParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiffParser#lineRange}.
	 * @param ctx the parse tree
	 */
	void enterLineRange(DiffParser.LineRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiffParser#lineRange}.
	 * @param ctx the parse tree
	 */
	void exitLineRange(DiffParser.LineRangeContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link DiffParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(DiffParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiffParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(DiffParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiffParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(DiffParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiffParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(DiffParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiffParser#coordinate}.
	 * @param ctx the parse tree
	 */
	void enterCoordinate(DiffParser.CoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiffParser#coordinate}.
	 * @param ctx the parse tree
	 */
	void exitCoordinate(DiffParser.CoordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiffParser#lineChange}.
	 * @param ctx the parse tree
	 */
	void enterLineChange(DiffParser.LineChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiffParser#lineChange}.
	 * @param ctx the parse tree
	 */
	void exitLineChange(DiffParser.LineChangeContext ctx);
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
}