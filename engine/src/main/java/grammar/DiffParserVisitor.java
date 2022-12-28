// Generated from /home/david/eclipse-workspace/SimmDiffUppaal/engine/src/main/java/grammar/DiffParser.g4 by ANTLR 4.10.1
package grammar;
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
}