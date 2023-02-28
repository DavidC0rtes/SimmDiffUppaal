// Generated from /home/david/Documents/SimmDiffUppaal/src/main/java/org/neocities/daviddev/simmdiff/grammars/symTraces/SymTracesParser.g4 by ANTLR 4.10.1
package org.neocities.daviddev.simmdiff.grammars.symTraces;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SymTracesParser}.
 */
public interface SymTracesParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#trace}.
	 * @param ctx the parse tree
	 */
	void enterTrace(SymTracesParser.TraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#trace}.
	 * @param ctx the parse tree
	 */
	void exitTrace(SymTracesParser.TraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(SymTracesParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(SymTracesParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(SymTracesParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(SymTracesParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(SymTracesParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(SymTracesParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLoc(SymTracesParser.LocContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#loc}.
	 * @param ctx the parse tree
	 */
	void exitLoc(SymTracesParser.LocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link SymTracesParser#exprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprtypetypetypetypetypetypetypetypetypearrayDeclarrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterValues(SymTracesParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link SymTracesParser#exprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprtypetypetypetypetypetypetypetypetypearrayDeclarrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitValues(SymTracesParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#clocks}.
	 * @param ctx the parse tree
	 */
	void enterClocks(SymTracesParser.ClocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#clocks}.
	 * @param ctx the parse tree
	 */
	void exitClocks(SymTracesParser.ClocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#delay}.
	 * @param ctx the parse tree
	 */
	void enterDelay(SymTracesParser.DelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#delay}.
	 * @param ctx the parse tree
	 */
	void exitDelay(SymTracesParser.DelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#discrete}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete(SymTracesParser.DiscreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#discrete}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete(SymTracesParser.DiscreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#aDiscrete}.
	 * @param ctx the parse tree
	 */
	void enterADiscrete(SymTracesParser.ADiscreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#aDiscrete}.
	 * @param ctx the parse tree
	 */
	void exitADiscrete(SymTracesParser.ADiscreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(SymTracesParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(SymTracesParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(SymTracesParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(SymTracesParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#sync}.
	 * @param ctx the parse tree
	 */
	void enterSync(SymTracesParser.SyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#sync}.
	 * @param ctx the parse tree
	 */
	void exitSync(SymTracesParser.SyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#tau}.
	 * @param ctx the parse tree
	 */
	void enterTau(SymTracesParser.TauContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#tau}.
	 * @param ctx the parse tree
	 */
	void exitTau(SymTracesParser.TauContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(SymTracesParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(SymTracesParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SymTracesParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SymTracesParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpr(SymTracesParser.IncrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpr(SymTracesParser.IncrementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(SymTracesParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(SymTracesParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(SymTracesParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(SymTracesParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(SymTracesParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(SymTracesParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(SymTracesParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(SymTracesParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(SymTracesParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(SymTracesParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIncrement(SymTracesParser.ExprIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIncrement(SymTracesParser.ExprIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(SymTracesParser.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(SymTracesParser.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterForallExpr(SymTracesParser.ForallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitForallExpr(SymTracesParser.ForallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(SymTracesParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(SymTracesParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumExpr(SymTracesParser.SumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumExpr(SymTracesParser.SumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(SymTracesParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(SymTracesParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDecrement(SymTracesParser.ExprDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDecrement(SymTracesParser.ExprDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(SymTracesParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(SymTracesParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(SymTracesParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(SymTracesParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDoubleExpr(SymTracesParser.DoubleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDoubleExpr(SymTracesParser.DoubleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(SymTracesParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(SymTracesParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStopWatchExpr(SymTracesParser.StopWatchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStopWatchExpr(SymTracesParser.StopWatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(SymTracesParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(SymTracesParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNatExpr(SymTracesParser.NatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNatExpr(SymTracesParser.NatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpr(SymTracesParser.ExistsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpr(SymTracesParser.ExistsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDecrementExpr(SymTracesParser.DecrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link SymTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDecrementExpr(SymTracesParser.DecrementExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SymTracesParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SymTracesParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierType(SymTracesParser.IdentifierTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierType(SymTracesParser.IdentifierTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(SymTracesParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(SymTracesParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(SymTracesParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(SymTracesParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClockType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterClockType(SymTracesParser.ClockTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClockType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitClockType(SymTracesParser.ClockTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChanType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterChanType(SymTracesParser.ChanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChanType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitChanType(SymTracesParser.ChanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(SymTracesParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(SymTracesParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDomainType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntDomainType(SymTracesParser.IntDomainTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDomainType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntDomainType(SymTracesParser.IntDomainTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScalarType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(SymTracesParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScalarType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(SymTracesParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStructType(SymTracesParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link SymTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStructType(SymTracesParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(SymTracesParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(SymTracesParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymTracesParser#varFieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarFieldDecl(SymTracesParser.VarFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymTracesParser#varFieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarFieldDecl(SymTracesParser.VarFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclExpr}
	 * labeled alternative in {@link SymTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclExpr(SymTracesParser.ArrayDeclExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclExpr}
	 * labeled alternative in {@link SymTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclExpr(SymTracesParser.ArrayDeclExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclType}
	 * labeled alternative in {@link SymTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclType(SymTracesParser.ArrayDeclTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclType}
	 * labeled alternative in {@link SymTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclType(SymTracesParser.ArrayDeclTypeContext ctx);
}