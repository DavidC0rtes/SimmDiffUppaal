// Generated from /home/david/Documents/SimmDiffUppaal/src/main/java/org/neocities/daviddev/simmdiff/grammars/smctraces/SMCTracesParser.g4 by ANTLR 4.10.1
package org.neocities.daviddev.simmdiff.grammars.smctraces;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SMCTracesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SMCTracesParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#trace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrace(SMCTracesParser.TraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(SMCTracesParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(SMCTracesParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(SMCTracesParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#loc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc(SMCTracesParser.LocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code values}
	 * labeled alternative in {@link SMCTracesParser#exprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprtypetypetypetypetypetypetypetypetypearrayDeclarrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(SMCTracesParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#clocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocks(SMCTracesParser.ClocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#delay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay(SMCTracesParser.DelayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#discrete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete(SMCTracesParser.DiscreteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#aDiscrete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADiscrete(SMCTracesParser.ADiscreteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(SMCTracesParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(SMCTracesParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#sync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSync(SMCTracesParser.SyncContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#tau}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTau(SMCTracesParser.TauContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(SMCTracesParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(SMCTracesParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpr(SMCTracesParser.IncrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(SMCTracesParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpr(SMCTracesParser.ParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(SMCTracesParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(SMCTracesParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(SMCTracesParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIncrement(SMCTracesParser.ExprIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpr(SMCTracesParser.DotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallExpr(SMCTracesParser.ForallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(SMCTracesParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpr(SMCTracesParser.SumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(SMCTracesParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDecrement(SMCTracesParser.ExprDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(SMCTracesParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(SMCTracesParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleExpr(SMCTracesParser.DoubleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(SMCTracesParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopWatchExpr(SMCTracesParser.StopWatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(SMCTracesParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatExpr(SMCTracesParser.NatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExpr(SMCTracesParser.ExistsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementExpr(SMCTracesParser.DecrementExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SMCTracesParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierType(SMCTracesParser.IdentifierTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(SMCTracesParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(SMCTracesParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClockType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockType(SMCTracesParser.ClockTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChanType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanType(SMCTracesParser.ChanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(SMCTracesParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntDomainType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDomainType(SMCTracesParser.IntDomainTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScalarType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(SMCTracesParser.ScalarTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(SMCTracesParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(SMCTracesParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SMCTracesParser#varFieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarFieldDecl(SMCTracesParser.VarFieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclExpr}
	 * labeled alternative in {@link SMCTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclExpr(SMCTracesParser.ArrayDeclExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclType}
	 * labeled alternative in {@link SMCTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclType(SMCTracesParser.ArrayDeclTypeContext ctx);
}