import java.util.HashMap;
import java.util.Map;
public class EvalVisitor extends RulesBaseVisitor<Integer> {
    /*** "memory" for our calculator; variable/value pairs go here */
    Map<String, Integer> memory = new HashMap<>();
    /**
     * ID '=' expr NEWLINE
     */
    @Override
    public Integer visitAssign(RulesParser.AssignContext ctx) {
        String id = ctx.ID().getText(); // id is left-hand side of '='
        int value = visit(ctx.expr()); // compute value of expression on right
        memory.put(id, value); // store it in our memory
        System.out.println(id+'='+value); // print the result
        return value;
    }
    /*** expr NEWLINE */
    @Override
    public Integer visitPrintExpr(RulesParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value); // print the result
        return 0; // return dummy value
    }
    /*** INT */
    @Override
    public Integer visitInt(RulesParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }
    /**
     * ID
     */
    @Override
    public Integer visitId(RulesParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0;
    }
    /*** expr op=('*'|'/') expr */
    @Override
    public Integer visitMulDiv(RulesParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == RulesParser.MUL) {
            return left * right;
        }
        return left / right; // must be DIV
    }
    /*** expr op=('+'|'-') expr */
    @Override
    public Integer visitAddSub(RulesParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == RulesParser.ADD) {
            return left + right;
        }
        return left - right; // must be SUB
    }
    /**
     * '(' expr ')'
     */
    @Override
    public Integer visitParens(RulesParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }
}