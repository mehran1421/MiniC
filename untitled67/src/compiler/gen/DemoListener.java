package compiler.gen;// Generated from C:/Users/Mehran/IdeaProjects/untitled67/grammar\Demo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DemoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DemoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(DemoParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(DemoParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DemoParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DemoParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBeginend(DemoParser.BeginendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBeginend(DemoParser.BeginendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(DemoParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(DemoParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(DemoParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(DemoParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(DemoParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(DemoParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(DemoParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(DemoParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DemoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DemoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(DemoParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(DemoParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexExpr}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComplexExpr(DemoParser.ComplexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexExpr}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComplexExpr(DemoParser.ComplexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(DemoParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(DemoParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(DemoParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(DemoParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(DemoParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(DemoParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis(DemoParser.ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis(DemoParser.ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinopr(DemoParser.BinoprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinopr(DemoParser.BinoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#complexExp}.
	 * @param ctx the parse tree
	 */
	void enterComplexExp(DemoParser.ComplexExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#complexExp}.
	 * @param ctx the parse tree
	 */
	void exitComplexExp(DemoParser.ComplexExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#div_multi}.
	 * @param ctx the parse tree
	 */
	void enterDiv_multi(DemoParser.Div_multiContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#div_multi}.
	 * @param ctx the parse tree
	 */
	void exitDiv_multi(DemoParser.Div_multiContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(DemoParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(DemoParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paran}
	 * labeled alternative in {@link DemoParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterParan(DemoParser.ParanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paran}
	 * labeled alternative in {@link DemoParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitParan(DemoParser.ParanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idd}
	 * labeled alternative in {@link DemoParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterIdd(DemoParser.IddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idd}
	 * labeled alternative in {@link DemoParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitIdd(DemoParser.IddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numm}
	 * labeled alternative in {@link DemoParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterNumm(DemoParser.NummContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numm}
	 * labeled alternative in {@link DemoParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitNumm(DemoParser.NummContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void enterOpenBracket(DemoParser.OpenBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#openBracket}.
	 * @param ctx the parse tree
	 */
	void exitOpenBracket(DemoParser.OpenBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void enterCloseBracket(DemoParser.CloseBracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#closeBracket}.
	 * @param ctx the parse tree
	 */
	void exitCloseBracket(DemoParser.CloseBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#opneParan}.
	 * @param ctx the parse tree
	 */
	void enterOpneParan(DemoParser.OpneParanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#opneParan}.
	 * @param ctx the parse tree
	 */
	void exitOpneParan(DemoParser.OpneParanContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#closeParan}.
	 * @param ctx the parse tree
	 */
	void enterCloseParan(DemoParser.CloseParanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#closeParan}.
	 * @param ctx the parse tree
	 */
	void exitCloseParan(DemoParser.CloseParanContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(DemoParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(DemoParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(DemoParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(DemoParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(DemoParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(DemoParser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#plus_minusOP}.
	 * @param ctx the parse tree
	 */
	void enterPlus_minusOP(DemoParser.Plus_minusOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#plus_minusOP}.
	 * @param ctx the parse tree
	 */
	void exitPlus_minusOP(DemoParser.Plus_minusOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#div_multiOP}.
	 * @param ctx the parse tree
	 */
	void enterDiv_multiOP(DemoParser.Div_multiOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#div_multiOP}.
	 * @param ctx the parse tree
	 */
	void exitDiv_multiOP(DemoParser.Div_multiOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(DemoParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(DemoParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(DemoParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(DemoParser.BinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DemoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DemoParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DemoParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DemoParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#boolea}.
	 * @param ctx the parse tree
	 */
	void enterBoolea(DemoParser.BooleaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#boolea}.
	 * @param ctx the parse tree
	 */
	void exitBoolea(DemoParser.BooleaContext ctx);
}