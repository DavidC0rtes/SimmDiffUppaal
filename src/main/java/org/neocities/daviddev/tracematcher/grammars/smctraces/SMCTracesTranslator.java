package org.neocities.daviddev.simmdiff.grammars.smctraces;

import org.neocities.daviddev.simmdiff.grammars.smctraces.SMCTracesParser;
import org.neocities.daviddev.simmdiff.grammars.smctraces.SMCTracesParserBaseVisitor;

import java.util.Locale;
import java.util.Set;

public class SMCTracesTranslator extends SMCTracesParserBaseVisitor<String> {
    private final Set<String> channels;
    private float timeout;

    public SMCTracesTranslator(Set<String> channels){
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
    public String visitTrace(SMCTracesParser.TraceContext ctx) {
        String output = "";
        for(SMCTracesParser.TransitionContext transition: ctx.transition()){
            output = output.concat(visit(transition));
        }
        return output;
    }

    @Override
    public String visitState(SMCTracesParser.StateContext ctx) {
        return super.visitState(ctx);
    }

    @Override
    public String visitTransition(SMCTracesParser.TransitionContext ctx) {
        return super.visitTransition(ctx);
    }

    @Override
    public String visitLocation(SMCTracesParser.LocationContext ctx) {
        return super.visitLocation(ctx);
    }

    @Override
    public String visitLoc(SMCTracesParser.LocContext ctx) {
        return super.visitLoc(ctx);
    }

    @Override
    public String visitValues(SMCTracesParser.ValuesContext ctx) {
        return super.visitValues(ctx);
    }

    @Override
    public String visitClocks(SMCTracesParser.ClocksContext ctx) {
        return super.visitClocks(ctx);
    }

    @Override
    public String visitDelay(SMCTracesParser.DelayContext ctx) {

        String delayString = ctx.POINT().getText();

        double delayDouble = Double.parseDouble(delayString);


        //DecimalFormat dFormat = new DecimalFormat("#.####");
        //delayString = dFormat.format(delayDouble);
        delayString = String.format(Locale.US, "%.4f", delayDouble);

        this.timeout += Float.parseFloat(delayString);

        return "delay ".concat(delayString).concat(";\n");
    }

    @Override
    public String visitDiscrete(SMCTracesParser.DiscreteContext ctx) {
        return visit(ctx.aDiscrete(0));
    }

    @Override
    public String visitADiscrete(SMCTracesParser.ADiscreteContext ctx) {
        String nameChan = visit(ctx.action());
        String output = "output ".concat(nameChan).concat("();\n");
        this.channels.add(nameChan);
        return output;
    }

    @Override
    public String visitGuard(SMCTracesParser.GuardContext ctx) {
        return super.visitGuard(ctx);
    }

    @Override
    public String visitAction(SMCTracesParser.ActionContext ctx){
        if(ctx.tau()!=null){
            return visit(ctx.tau());
        }
        if(ctx.sync()!=null){
            return visit(ctx.sync());
        }
        return ctx.toString();
    }

    @Override
    public String visitTau(SMCTracesParser.TauContext ctx) {
        return "tau";
    }

    @Override
    public String visitSync(SMCTracesParser.SyncContext ctx) {
        return ctx.IDENTIFIER().toString();
    }

    @Override
    public String visitUpdate(SMCTracesParser.UpdateContext ctx) {
        return super.visitUpdate(ctx);
    }

    @Override
    public String visitAssign(SMCTracesParser.AssignContext ctx) {
        return super.visitAssign(ctx);
    }

    @Override
    public String visitIncrementExpr(SMCTracesParser.IncrementExprContext ctx) {
        return super.visitIncrementExpr(ctx);
    }

    @Override
    public String visitIfExpr(SMCTracesParser.IfExprContext ctx) {
        return super.visitIfExpr(ctx);
    }

    @Override
    public String visitParenthesisExpr(SMCTracesParser.ParenthesisExprContext ctx) {
        return super.visitParenthesisExpr(ctx);
    }

    @Override
    public String visitTrueExpr(SMCTracesParser.TrueExprContext ctx) {
        return super.visitTrueExpr(ctx);
    }

    @Override
    public String visitComparisonExpr(SMCTracesParser.ComparisonExprContext ctx) {
        return super.visitComparisonExpr(ctx);
    }

    @Override
    public String visitBinaryExpr(SMCTracesParser.BinaryExprContext ctx) {
        return super.visitBinaryExpr(ctx);
    }

    @Override
    public String visitExprIncrement(SMCTracesParser.ExprIncrementContext ctx) {
        return super.visitExprIncrement(ctx);
    }

    @Override
    public String visitDotExpr(SMCTracesParser.DotExprContext ctx) {
        return super.visitDotExpr(ctx);
    }

    @Override
    public String visitForallExpr(SMCTracesParser.ForallExprContext ctx) {
        return super.visitForallExpr(ctx);
    }

    @Override
    public String visitUnaryExpr(SMCTracesParser.UnaryExprContext ctx) {
        return super.visitUnaryExpr(ctx);
    }

    @Override
    public String visitSumExpr(SMCTracesParser.SumExprContext ctx) {
        return super.visitSumExpr(ctx);
    }

    @Override
    public String visitFuncExpr(SMCTracesParser.FuncExprContext ctx) {
        return super.visitFuncExpr(ctx);
    }

    @Override
    public String visitExprDecrement(SMCTracesParser.ExprDecrementContext ctx) {
        return super.visitExprDecrement(ctx);
    }

    @Override
    public String visitFalseExpr(SMCTracesParser.FalseExprContext ctx) {
        return super.visitFalseExpr(ctx);
    }

    @Override
    public String visitAssignExpr(SMCTracesParser.AssignExprContext ctx) {
        return super.visitAssignExpr(ctx);
    }

    @Override
    public String visitDoubleExpr(SMCTracesParser.DoubleExprContext ctx) {
        return super.visitDoubleExpr(ctx);
    }

    @Override
    public String visitArrayExpr(SMCTracesParser.ArrayExprContext ctx) {
        return super.visitArrayExpr(ctx);
    }

    @Override
    public String visitStopWatchExpr(SMCTracesParser.StopWatchExprContext ctx) {
        return super.visitStopWatchExpr(ctx);
    }

    @Override
    public String visitIdentifierExpr(SMCTracesParser.IdentifierExprContext ctx) {
        return super.visitIdentifierExpr(ctx);
    }

    @Override
    public String visitNatExpr(SMCTracesParser.NatExprContext ctx) {
        return super.visitNatExpr(ctx);
    }

    @Override
    public String visitExistsExpr(SMCTracesParser.ExistsExprContext ctx) {
        return super.visitExistsExpr(ctx);
    }

    @Override
    public String visitDecrementExpr(SMCTracesParser.DecrementExprContext ctx) {
        return super.visitDecrementExpr(ctx);
    }

    @Override
    public String visitArguments(SMCTracesParser.ArgumentsContext ctx) {
        return super.visitArguments(ctx);
    }

    @Override
    public String visitIdentifierType(SMCTracesParser.IdentifierTypeContext ctx) {
        return super.visitIdentifierType(ctx);
    }

    @Override
    public String visitIntType(SMCTracesParser.IntTypeContext ctx) {
        return super.visitIntType(ctx);
    }

    @Override
    public String visitDoubleType(SMCTracesParser.DoubleTypeContext ctx) {
        return super.visitDoubleType(ctx);
    }

    @Override
    public String visitClockType(SMCTracesParser.ClockTypeContext ctx) {
        return super.visitClockType(ctx);
    }

    @Override
    public String visitChanType(SMCTracesParser.ChanTypeContext ctx) {
        return super.visitChanType(ctx);
    }

    @Override
    public String visitBoolType(SMCTracesParser.BoolTypeContext ctx) {
        return super.visitBoolType(ctx);
    }

    @Override
    public String visitIntDomainType(SMCTracesParser.IntDomainTypeContext ctx) {
        return super.visitIntDomainType(ctx);
    }

    @Override
    public String visitScalarType(SMCTracesParser.ScalarTypeContext ctx) {
        return super.visitScalarType(ctx);
    }

    @Override
    public String visitStructType(SMCTracesParser.StructTypeContext ctx) {
        return super.visitStructType(ctx);
    }

    @Override
    public String visitFieldDecl(SMCTracesParser.FieldDeclContext ctx) {
        return super.visitFieldDecl(ctx);
    }

    @Override
    public String visitVarFieldDecl(SMCTracesParser.VarFieldDeclContext ctx) {
        return super.visitVarFieldDecl(ctx);
    }

    @Override
    public String visitArrayDeclExpr(SMCTracesParser.ArrayDeclExprContext ctx) {
        return super.visitArrayDeclExpr(ctx);
    }

    @Override
    public String visitArrayDeclType(SMCTracesParser.ArrayDeclTypeContext ctx) {
        return super.visitArrayDeclType(ctx);
    }

}
