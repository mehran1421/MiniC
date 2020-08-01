package compiler.gen;// Generated from C:/Users/Mehran/IdeaProjects/untitled67/grammar\Demo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the compiler.visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DemoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(DemoParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DemoParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code beginend}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginend(DemoParser.BeginendContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(DemoParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(DemoParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(DemoParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(DemoParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DemoParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(DemoParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexExpr}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexExpr(DemoParser.ComplexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(DemoParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(DemoParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DemoParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paranthesis}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesis(DemoParser.ParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binopr}
	 * labeled alternative in {@link DemoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopr(DemoParser.BinoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#complexExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexExp(DemoParser.ComplexExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#div_multi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_multi(DemoParser.Div_multiContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(DemoParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paran}
	 * labeled alternative in {@link DemoParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParan(DemoParser.ParanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idd}
	 * labeled alternative in {@link DemoParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdd(DemoParser.IddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numm}
	 * labeled alternative in {@link DemoParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumm(DemoParser.NummContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#openBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBracket(DemoParser.OpenBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#closeBracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseBracket(DemoParser.CloseBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#opneParan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpneParan(DemoParser.OpneParanContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#closeParan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseParan(DemoParser.CloseParanContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(DemoParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(DemoParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon(DemoParser.ColonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#plus_minusOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_minusOP(DemoParser.Plus_minusOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#div_multiOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_multiOP(DemoParser.Div_multiOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(DemoParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(DemoParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DemoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DemoParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#boolea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolea(DemoParser.BooleaContext ctx);
}