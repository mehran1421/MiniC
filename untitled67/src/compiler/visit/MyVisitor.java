package compiler.visit;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import compiler.gen.*;


import java.util.ArrayList;
import java.util.HashMap;

public class MyVisitor extends DemoBaseVisitor<String> {
    private static ArrayList<String> answre = new ArrayList<>();
    private HashMap<String, String> memory = new HashMap<>();

    public static ArrayList<String> isAcceptInput(ANTLRInputStream input) {
        answre.clear();
        DemoLexer lexer = new DemoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DemoParser parser = new DemoParser(tokens);
        DemoParser.ProgramContext tree = parser.program();
        DemoBaseVisitor<String> visitor = new MyVisitor();
        tree.accept(visitor);
        return answre;
    }

    //=======================================================================
    @Override
    public String visitBinop(DemoParser.BinopContext ctx) {
        return ctx.getText();
    }

    //=======================================================================
    @Override
    public String visitIdd(DemoParser.IddContext ctx) {
        String variable = visit(ctx.identifier());
        return memory.get(variable);
    }

    //========================================================================
    @Override
    public String visitDiv_multi(DemoParser.Div_multiContext ctx) {
        //first Pow
        double result = Double.parseDouble(visit(ctx.pow(0)));

        //getting rest of them
        for (int i = 0; i < ctx.div_multiOP().size(); i++) {
            String operation = visit(ctx.div_multiOP(i));
            double second = Double.parseDouble(visit(ctx.pow(i + 1)));
            switch (operation) {
                case "/":
                    result /= second;
                    break;
                case "*":
                    result *= second;
                    break;
            }
        }
        return String.valueOf(result);
    }

    //===========================================================================
    @Override
    public String visitBeginend(DemoParser.BeginendContext ctx) {
        visit(ctx.statements());
        return null;
    }

    //===========================================================================
    @Override
    public String visitSemicolon(DemoParser.SemicolonContext ctx) {
        return ctx.getText();
    }

    //===========================================================================
    @Override
    public String visitIf(DemoParser.IfContext ctx) {
        boolean result = visit(ctx.expr()).equals("true");
        if (result)
            visit(ctx.statement());
        return null;
    }

    //=============================================================================
    @Override
    public String visitIfelse(DemoParser.IfelseContext ctx) {
        boolean result = visit(ctx.expr()).equals("true");
        if (result)
            visit(ctx.statement(0));
        else
            visit(ctx.statement(1));
        return null;
    }

    //================================================================================
    @Override
    public String visitFor(DemoParser.ForContext ctx) {
        //assigning variable
        String variable = visit(ctx.identifier());
        String value = visit(ctx.number(0));
        memory.put(variable, value);

        //for loop
        double startValue = Double.parseDouble(value);
        double targetValue = Double.parseDouble(visit(ctx.number(1)));
        while (startValue <= targetValue) {
            visit(ctx.statement());
            startValue++;
            memory.put(variable, String.valueOf(startValue));
        }
        return null;
    }

    //=================================================================================
    @Override
    public String visitPrint(DemoParser.PrintContext ctx) {
        String variable = visit(ctx.identifier());
        answre.add(memory.get(variable));
        return null;
    }

    //===================================================================================
    @Override
    public String visitComplexExpr(DemoParser.ComplexExprContext ctx) {
        return visit(ctx.complexExp());
    }

    //====================================================================================
    @Override
    public String visitNum(DemoParser.NumContext ctx) {
        return visit(ctx.number());
    }

    //====================================================================================
    @Override
    public String visitId(DemoParser.IdContext ctx) {
        String variable = visit(ctx.identifier());
        return memory.get(variable);
    }

    //=====================================================================================
    @Override
    public String visitParanthesis(DemoParser.ParanthesisContext ctx) {
        return visit(ctx.expr());
    }

    //=====================================================================================
    @Override
    public String visitBinopr(DemoParser.BinoprContext ctx) {
        String operator = visit(ctx.binop());

        boolean result;
        try {
            double firstExpr = Double.parseDouble(visit(ctx.expr(0)));
            double SecondExpr = Double.parseDouble(visit(ctx.expr(1)));

            switch (operator) {
                case "<":
                    result = firstExpr < SecondExpr;
                    break;
                case ">":
                    result = firstExpr > SecondExpr;
                    break;
                case "<=":
                    result = firstExpr <= SecondExpr;
                    break;
                case ">=":
                    result = firstExpr >= SecondExpr;
                    break;
                case "==":
                    result = firstExpr == SecondExpr;
                    break;
                case "!=":
                    result = firstExpr != SecondExpr;
                    break;
                default:
                    return null;
            }
            return result ? "true" : "false";
        } catch (Exception e) {
            System.err.println("syntax error: input is wrong!!!");
        }
        return null;
    }

    //=============================================================================
    @Override
    public String visitComplexExp(DemoParser.ComplexExpContext ctx) {
        //first Div_Multi
        double result = Double.parseDouble(visit(ctx.div_multi(0)));

        //getting rest of them
        for (int i = 0; i < ctx.plus_minusOP().size(); i++) {
            String operation = visit(ctx.plus_minusOP(i));
            double second = Double.parseDouble(visit(ctx.div_multi(i + 1)));
            switch (operation) {
                case "+":
                    result += second;
                    break;
                case "-":
                    result -= second;
                    break;
            }
        }
        return String.valueOf(result);
    }

    //====================================================================================
    @Override
    public String visitBool(DemoParser.BoolContext ctx) {
        return visit(ctx.boolea());
    }

    //=====================================================================================
    @Override
    public String visitParan(DemoParser.ParanContext ctx) {
        return visit(ctx.complexExp());
    }

    //=====================================================================================

    @Override
    public String visitStatements(DemoParser.StatementsContext ctx) {
        for (DemoParser.StatementContext temp : ctx.statement()) {
            visit(temp);
        }
        return null;
    }

    //======================================================================================
    @Override
    public String visitNumm(DemoParser.NummContext ctx) {
        return visit(ctx.number());
    }

    //======================================================================================
    @Override
    public String visitOpenBracket(DemoParser.OpenBracketContext ctx) {
        return ctx.getText();
    }

    //======================================================================================
    @Override
    public String visitCloseBracket(DemoParser.CloseBracketContext ctx) {
        return ctx.getText();
    }

    //==============================================================================
    @Override
    public String visitOpneParan(DemoParser.OpneParanContext ctx) {
        return ctx.getText();
    }

    //==============================================================================
    @Override
    public String visitWhile(DemoParser.WhileContext ctx) {
        while (visit(ctx.expr()).equals("true")) {
            visit(ctx.statement());
        }
        return null;
    }
    //==============================================================================
    @Override
    public String visitCloseParan(DemoParser.CloseParanContext ctx) {
        return ctx.getText();
    }

    //======================================================================================
    @Override
    public String visitEqual(DemoParser.EqualContext ctx) {
        return ctx.getText();
    }

    //======================================================================================
    @Override
    public String visitColon(DemoParser.ColonContext ctx) {
        return ctx.getText();
    }

    //======================================================================================
    @Override
    public String visitPlus_minusOP(DemoParser.Plus_minusOPContext ctx) {
        return ctx.getText();
    }

    //=======================================================================================
    @Override
    public String visitProgram(DemoParser.ProgramContext ctx) {
        visit(ctx.statements());
        return null;
    }

    //===================================================================
    @Override
    public String visitNot(DemoParser.NotContext ctx) {
        boolean result;
        String value = visit(ctx.expr());
        if (value.matches("\\d+(\\.\\d+)*")) {
            result = Double.parseDouble(value) != 0;
        } else result = value.equals("true");

        if (result)
            return "false";
        return "true";
    }

    //=======================================================================================
    @Override
    public String visitDiv_multiOP(DemoParser.Div_multiOPContext ctx) {
        return ctx.getText();
    }

    //=======================================================================================
    @Override
    public String visitPower(DemoParser.PowerContext ctx) {
        return ctx.getText();
    }

    //=======================================================================================
    @Override
    public String visitNumber(DemoParser.NumberContext ctx) {
        return String.valueOf(Double.parseDouble(ctx.getText()));
    }

    //=======================================================================================
    @Override
    public String visitIdentifier(DemoParser.IdentifierContext ctx) {
        return ctx.getText();
    }

    //=======================================================================================
    @Override
    public String visitPow(DemoParser.PowContext ctx) {
        double result;
        if (ctx.power().size() == 0) {
            result = Double.parseDouble(visit(ctx.fact(0)));
        } else {
            result = Math.pow(Double.parseDouble(visit(ctx.fact(ctx.power().size() - 1)))
                    , Double.parseDouble(visit(ctx.fact(ctx.power().size()))));
            if (ctx.power().size() > 1) {
                for (int i = ctx.power().size() - 1; i > 0; i--) {
                    result = Math.pow(Double.parseDouble(visit(ctx.fact(i - 1)))
                            , result);
                }
            }
        }
        return String.valueOf(result);
    }

    //==================================================================================
    @Override
    public String visitBoolea(DemoParser.BooleaContext ctx) {
        return ctx.getText();
    }

    //=========================================================================
    @Override
    public String visitAssignment(DemoParser.AssignmentContext ctx) {
        String variable = visit(ctx.identifier());
        String value = visit(ctx.expr());
        memory.put(variable, value);
        return null;
    }
}

