package org.neocities.daviddev.simmdiff.grammars.symTraces;

import java.util.Locale;
import java.util.Set;

public class TracesTranslator extends SymTracesParserBaseVisitor<String> {
    private final Set<String> channels;
    private float timeout;

    public TracesTranslator(Set<String> channels){
        this.timeout = 0;
        this.channels = channels;
    }

    public float getTimeout(){
        return this.timeout;
    }

    public Set<String> getChannels() {
        return this.channels;
    }

    @Override
    public String visitTrace(SymTracesParser.TraceContext ctx) {
        String output = "";
        for(SymTracesParser.TransitionContext transition: ctx.transition()){
            output = output.concat(visit(transition));
        }
        return output;
    }

    @Override
    public String visitState(SymTracesParser.StateContext ctx) {
        return super.visitState(ctx);
    }

    @Override
    public String visitTransition(SymTracesParser.TransitionContext ctx) {
        return super.visitTransition(ctx);
    }

    @Override
    public String visitLocation(SymTracesParser.LocationContext ctx) {
        return super.visitLocation(ctx);
    }

    @Override
    public String visitLoc(SymTracesParser.LocContext ctx) {
        return super.visitLoc(ctx);
    }

    @Override
    public String visitValues(SymTracesParser.ValuesContext ctx) {
        return super.visitValues(ctx);
    }

    @Override
    public String visitClocks(SymTracesParser.ClocksContext ctx) {
        return super.visitClocks(ctx);
    }

    @Override
    public String visitDelay(SymTracesParser.DelayContext ctx) {
        String delayString = ctx.POINT().toString();
        double delayDouble = Double.parseDouble(delayString);


        //DecimalFormat dFormat = new DecimalFormat("#.####");
        //delayString = dFormat.format(delayDouble);
        delayString = String.format(Locale.US, "%.4f", delayDouble);

        this.timeout += Float.parseFloat(delayString);

        return "delay ".concat(delayString).concat(";\n");
    }

    @Override
    public String visitDiscrete(SymTracesParser.DiscreteContext ctx) {
        return visit(ctx.aDiscrete(0));
    }

    @Override
    public String visitADiscrete(SymTracesParser.ADiscreteContext ctx) {
        String nameChan = visit(ctx.action());
        String output = "output ".concat(nameChan).concat("();\n");
        this.channels.add(nameChan);
        return output;
    }

    @Override
    public String visitGuard(SymTracesParser.GuardContext ctx) {
        return super.visitGuard(ctx);
    }

    @Override
    public String visitAction(SymTracesParser.ActionContext ctx){
        if(ctx.tau()!=null){
            return visit(ctx.tau());
        }
        if(ctx.sync()!=null){
            return visit(ctx.sync());
        }
        return ctx.toString();
    }

    @Override
    public String visitTau(SymTracesParser.TauContext ctx) {
        return "tau";
    }

    @Override
    public String visitSync(SymTracesParser.SyncContext ctx) {
        return ctx.IDENTIFIER().toString();
    }

    @Override
    public String visitUpdate(SymTracesParser.UpdateContext ctx) {
        return super.visitUpdate(ctx);
    }

    @Override
    public String visitAssign(SymTracesParser.AssignContext ctx) {
        return super.visitAssign(ctx);
    }

    @Override
    public String visitIncrementExpr(SymTracesParser.IncrementExprContext ctx) {
        return super.visitIncrementExpr(ctx);
    }

    @Override
    public String visitIfExpr(SymTracesParser.IfExprContext ctx) {
        return super.visitIfExpr(ctx);
    }

    @Override
    public String visitParenthesisExpr(SymTracesParser.ParenthesisExprContext ctx) {
        return super.visitParenthesisExpr(ctx);
    }

    @Override
    public String visitTrueExpr(SymTracesParser.TrueExprContext ctx) {
        return super.visitTrueExpr(ctx);
    }

    @Override
    public String visitComparisonExpr(SymTracesParser.ComparisonExprContext ctx) {
        return super.visitComparisonExpr(ctx);
    }

    @Override
    public String visitBinaryExpr(SymTracesParser.BinaryExprContext ctx) {
        return super.visitBinaryExpr(ctx);
    }

    @Override
    public String visitExprIncrement(SymTracesParser.ExprIncrementContext ctx) {
        return super.visitExprIncrement(ctx);
    }

    @Override
    public String visitDotExpr(SymTracesParser.DotExprContext ctx) {
        return super.visitDotExpr(ctx);
    }

    @Override
    public String visitForallExpr(SymTracesParser.ForallExprContext ctx) {
        return super.visitForallExpr(ctx);
    }

    @Override
    public String visitUnaryExpr(SymTracesParser.UnaryExprContext ctx) {
        return super.visitUnaryExpr(ctx);
    }

    @Override
    public String visitSumExpr(SymTracesParser.SumExprContext ctx) {
        return super.visitSumExpr(ctx);
    }

    @Override
    public String visitFuncExpr(SymTracesParser.FuncExprContext ctx) {
        return super.visitFuncExpr(ctx);
    }

    @Override
    public String visitExprDecrement(SymTracesParser.ExprDecrementContext ctx) {
        return super.visitExprDecrement(ctx);
    }

    @Override
    public String visitFalseExpr(SymTracesParser.FalseExprContext ctx) {
        return super.visitFalseExpr(ctx);
    }

    @Override
    public String visitAssignExpr(SymTracesParser.AssignExprContext ctx) {
        return super.visitAssignExpr(ctx);
    }

    @Override
    public String visitDoubleExpr(SymTracesParser.DoubleExprContext ctx) {
        return super.visitDoubleExpr(ctx);
    }

    @Override
    public String visitArrayExpr(SymTracesParser.ArrayExprContext ctx) {
        return super.visitArrayExpr(ctx);
    }

    @Override
    public String visitStopWatchExpr(SymTracesParser.StopWatchExprContext ctx) {
        return super.visitStopWatchExpr(ctx);
    }

    @Override
    public String visitIdentifierExpr(SymTracesParser.IdentifierExprContext ctx) {
        return super.visitIdentifierExpr(ctx);
    }

    @Override
    public String visitNatExpr(SymTracesParser.NatExprContext ctx) {
        return super.visitNatExpr(ctx);
    }

    @Override
    public String visitExistsExpr(SymTracesParser.ExistsExprContext ctx) {
        return super.visitExistsExpr(ctx);
    }

    @Override
    public String visitDecrementExpr(SymTracesParser.DecrementExprContext ctx) {
        return super.visitDecrementExpr(ctx);
    }

    @Override
    public String visitArguments(SymTracesParser.ArgumentsContext ctx) {
        return super.visitArguments(ctx);
    }

    @Override
    public String visitIdentifierType(SymTracesParser.IdentifierTypeContext ctx) {
        return super.visitIdentifierType(ctx);
    }

    @Override
    public String visitIntType(SymTracesParser.IntTypeContext ctx) {
        return super.visitIntType(ctx);
    }

    @Override
    public String visitDoubleType(SymTracesParser.DoubleTypeContext ctx) {
        return super.visitDoubleType(ctx);
    }

    @Override
    public String visitClockType(SymTracesParser.ClockTypeContext ctx) {
        return super.visitClockType(ctx);
    }

    @Override
    public String visitChanType(SymTracesParser.ChanTypeContext ctx) {
        return super.visitChanType(ctx);
    }

    @Override
    public String visitBoolType(SymTracesParser.BoolTypeContext ctx) {
        return super.visitBoolType(ctx);
    }

    @Override
    public String visitIntDomainType(SymTracesParser.IntDomainTypeContext ctx) {
        return super.visitIntDomainType(ctx);
    }

    @Override
    public String visitScalarType(SymTracesParser.ScalarTypeContext ctx) {
        return super.visitScalarType(ctx);
    }

    @Override
    public String visitStructType(SymTracesParser.StructTypeContext ctx) {
        return super.visitStructType(ctx);
    }

    @Override
    public String visitFieldDecl(SymTracesParser.FieldDeclContext ctx) {
        return super.visitFieldDecl(ctx);
    }

    @Override
    public String visitVarFieldDecl(SymTracesParser.VarFieldDeclContext ctx) {
        return super.visitVarFieldDecl(ctx);
    }

    @Override
    public String visitArrayDeclExpr(SymTracesParser.ArrayDeclExprContext ctx) {
        return super.visitArrayDeclExpr(ctx);
    }

    @Override
    public String visitArrayDeclType(SymTracesParser.ArrayDeclTypeContext ctx) {
        return super.visitArrayDeclType(ctx);
    }

}
