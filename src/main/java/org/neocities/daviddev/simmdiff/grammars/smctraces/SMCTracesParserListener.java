// Generated from /home/david/Documents/SimmDiffUppaal/src/main/java/org/neocities/daviddev/simmdiff/grammars/smctraces/SMCTracesParser.g4 by ANTLR 4.10.1
package org.neocities.daviddev.simmdiff.grammars.smctraces;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SMCTracesParser}.
 */
public interface SMCTracesParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#trace}.
	 * @param ctx the parse tree
	 */
	void enterTrace(SMCTracesParser.TraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#trace}.
	 * @param ctx the parse tree
	 */
	void exitTrace(SMCTracesParser.TraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(SMCTracesParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(SMCTracesParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(SMCTracesParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(SMCTracesParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(SMCTracesParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(SMCTracesParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLoc(SMCTracesParser.LocContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#loc}.
	 * @param ctx the parse tree
	 */
	void exitLoc(SMCTracesParser.LocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link SMCTracesParser#exprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprtypetypetypetypetypetypetypetypetypearrayDeclarrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterValues(SMCTracesParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link SMCTracesParser#exprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprtypetypetypetypetypetypetypetypetypearrayDeclarrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitValues(SMCTracesParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#clocks}.
	 * @param ctx the parse tree
	 */
	void enterClocks(SMCTracesParser.ClocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#clocks}.
	 * @param ctx the parse tree
	 */
	void exitClocks(SMCTracesParser.ClocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#delay}.
	 * @param ctx the parse tree
	 */
	void enterDelay(SMCTracesParser.DelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#delay}.
	 * @param ctx the parse tree
	 */
	void exitDelay(SMCTracesParser.DelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#discrete}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete(SMCTracesParser.DiscreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#discrete}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete(SMCTracesParser.DiscreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#aDiscrete}.
	 * @param ctx the parse tree
	 */
	void enterADiscrete(SMCTracesParser.ADiscreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#aDiscrete}.
	 * @param ctx the parse tree
	 */
	void exitADiscrete(SMCTracesParser.ADiscreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(SMCTracesParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(SMCTracesParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(SMCTracesParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(SMCTracesParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#sync}.
	 * @param ctx the parse tree
	 */
	void enterSync(SMCTracesParser.SyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#sync}.
	 * @param ctx the parse tree
	 */
	void exitSync(SMCTracesParser.SyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#tau}.
	 * @param ctx the parse tree
	 */
	void enterTau(SMCTracesParser.TauContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#tau}.
	 * @param ctx the parse tree
	 */
	void exitTau(SMCTracesParser.TauContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(SMCTracesParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(SMCTracesParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SMCTracesParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SMCTracesParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpr(SMCTracesParser.IncrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpr(SMCTracesParser.IncrementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(SMCTracesParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(SMCTracesParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(SMCTracesParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(SMCTracesParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(SMCTracesParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(SMCTracesParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(SMCTracesParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(SMCTracesParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(SMCTracesParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(SMCTracesParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIncrement(SMCTracesParser.ExprIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIncrement(SMCTracesParser.ExprIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(SMCTracesParser.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(SMCTracesParser.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterForallExpr(SMCTracesParser.ForallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitForallExpr(SMCTracesParser.ForallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(SMCTracesParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(SMCTracesParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumExpr(SMCTracesParser.SumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumExpr(SMCTracesParser.SumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(SMCTracesParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(SMCTracesParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDecrement(SMCTracesParser.ExprDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDecrement(SMCTracesParser.ExprDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(SMCTracesParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(SMCTracesParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(SMCTracesParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(SMCTracesParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDoubleExpr(SMCTracesParser.DoubleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDoubleExpr(SMCTracesParser.DoubleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(SMCTracesParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(SMCTracesParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStopWatchExpr(SMCTracesParser.StopWatchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStopWatchExpr(SMCTracesParser.StopWatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(SMCTracesParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(SMCTracesParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNatExpr(SMCTracesParser.NatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNatExpr(SMCTracesParser.NatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpr(SMCTracesParser.ExistsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpr(SMCTracesParser.ExistsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDecrementExpr(SMCTracesParser.DecrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link SMCTracesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDecrementExpr(SMCTracesParser.DecrementExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SMCTracesParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SMCTracesParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierType(SMCTracesParser.IdentifierTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierType(SMCTracesParser.IdentifierTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(SMCTracesParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(SMCTracesParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(SMCTracesParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(SMCTracesParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClockType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterClockType(SMCTracesParser.ClockTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClockType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitClockType(SMCTracesParser.ClockTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChanType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterChanType(SMCTracesParser.ChanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChanType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitChanType(SMCTracesParser.ChanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(SMCTracesParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(SMCTracesParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDomainType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntDomainType(SMCTracesParser.IntDomainTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDomainType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntDomainType(SMCTracesParser.IntDomainTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScalarType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(SMCTracesParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScalarType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(SMCTracesParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStructType(SMCTracesParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link SMCTracesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStructType(SMCTracesParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(SMCTracesParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(SMCTracesParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMCTracesParser#varFieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarFieldDecl(SMCTracesParser.VarFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMCTracesParser#varFieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarFieldDecl(SMCTracesParser.VarFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclExpr}
	 * labeled alternative in {@link SMCTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclExpr(SMCTracesParser.ArrayDeclExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclExpr}
	 * labeled alternative in {@link SMCTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclExpr(SMCTracesParser.ArrayDeclExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclType}
	 * labeled alternative in {@link SMCTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclType(SMCTracesParser.ArrayDeclTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclType}
	 * labeled alternative in {@link SMCTracesParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclType(SMCTracesParser.ArrayDeclTypeContext ctx);
}