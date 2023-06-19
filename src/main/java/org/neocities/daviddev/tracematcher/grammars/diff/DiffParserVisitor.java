// Generated from /home/david/Documents/SimmDiffUppaal/src/main/java/org/neocities/daviddev/tracematcher/grammars/diff/DiffParser.g4 by ANTLR 4.12.0
package org.neocities.daviddev.tracematcher.grammars.diff;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DiffParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DiffParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DiffParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(DiffParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiffParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(DiffParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiffParser#lineRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineRange(DiffParser.LineRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiffParser#chardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardata(DiffParser.ChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiffParser#anything}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnything(DiffParser.AnythingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiffParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(DiffParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiffParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(DiffParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiffParser#coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinate(DiffParser.CoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiffParser#lineChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineChange(DiffParser.LineChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiffParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(DiffParser.LineContext ctx);
}