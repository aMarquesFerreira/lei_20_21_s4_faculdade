package eapli.base.ANTLR.src;

import eapli.base.ANTLR.gen.CalculationsBaseVisitor;
import eapli.base.ANTLR.gen.CalculationsParser;

import java.util.HashMap;
import java.util.Map;

public class CalculationsVisitor extends CalculationsBaseVisitor<Integer> {

    private int valor = 0;

    public Integer result(){
        return valor;
    }

    /*** "memory" for our calculator; variable/value pairs go here */
    Map<String, Integer> memory = new HashMap<>();
    /**
     * ID '=' expr NEWLINE
     */
    @Override
    public Integer visitAssign(CalculationsParser.AssignContext ctx) {
        String id = ctx.ID().getText(); // id is left-hand side of '='
        int value = visit(ctx.expr()); // compute value of expression on right
        memory.put(id, value); // store it in our memory
        System.out.println(id+'='+value); // print the result
        return value;
    }
    /*** expr NEWLINE */
    @Override
    public Integer visitPrintExpr(CalculationsParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value); // print the result
        return 0; // return dummy value
    }
    /*** INT */
    @Override
    public Integer visitInt(CalculationsParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }
    /**
     * ID
     */
    @Override
    public Integer visitId(CalculationsParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0;
    }
    /*** expr op=('*'|'/') expr */
    @Override
    public Integer visitMulDiv(CalculationsParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == CalculationsParser.MUL) {
            return valor = left * right;
        }
        return valor = left / right; // must be DIV
    }
    /*** expr op=('+'|'-') expr */
    @Override
    public Integer visitAddSub(CalculationsParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == CalculationsParser.ADD) {
            return valor = left + right;
        }
        return valor = left - right; // must be SUB
    }
    /**
     * '(' expr ')'
     */
    @Override
    public Integer visitParens(CalculationsParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }
}