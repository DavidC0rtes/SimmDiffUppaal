// Generated from /home/david/Documents/SimmDiffUppaal/src/main/java/org/neocities/daviddev/simmdiff/grammars/symTraces/SymTracesParser.g4 by ANTLR 4.10.1
package org.neocities.daviddev.simmdiff.grammars.symTraces;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SymTracesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SymTracesParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#trace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrace(SymTracesParser.TraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(SymTracesParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(SymTracesParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(SymTracesParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#loc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc(SymTracesParser.LocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code values}
	 * labeled alternative in {@link SymTracesParser#exprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprtypetypetypetypetypetypetypetypetypearrayDeclarrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(SymTracesParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#clocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocks(SymTracesParser.ClocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#delay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay(SymTracesParser.DelayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#discrete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete(SymTracesParser.DiscreteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#aDiscrete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADiscrete(SymTracesParser.ADiscreteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(SymTracesParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(SymTracesParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#sync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSync(SymTracesParser.SyncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#tau}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTau(SymTracesParser.TauContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(SymTracesParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SymTracesParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpr(SymTracesParser.IncrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(SymTracesParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpr(SymTracesParser.ParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(SymTracesParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(SymTracesParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(SymTracesParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIncrement(SymTracesParser.ExprIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpr(SymTracesParser.DotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallExpr(SymTracesParser.ForallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(SymTracesParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpr(SymTracesParser.SumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(SymTracesParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDecrement(SymTracesParser.ExprDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(SymTracesParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(SymTracesParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleExpr(SymTracesParser.DoubleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(SymTracesParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopWatchExpr(SymTracesParser.StopWatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(SymTracesParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatExpr(SymTracesParser.NatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExpr(SymTracesParser.ExistsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementExpr(SymTracesParser.DecrementExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SymTracesParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierType(SymTracesParser.IdentifierTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(SymTracesParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(SymTracesParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClockType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockType(SymTracesParser.ClockTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChanType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanType(SymTracesParser.ChanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(SymTracesParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntDomainType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDomainType(SymTracesParser.IntDomainTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScalarType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(SymTracesParser.ScalarTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(SymTracesParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(SymTracesParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymTracesParser#varFieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarFieldDecl(SymTracesParser.VarFieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclExpr}
	 * labeled alternative in {@link SymTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclExpr(SymTracesParser.ArrayDeclExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclType}
	 * labeled alternative in {@link SymTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclType(SymTracesParser.ArrayDeclTypeContext ctx);
}