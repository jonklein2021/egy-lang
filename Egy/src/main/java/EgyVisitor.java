// Generated from Egy/src/main/antlr4/Egy.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EgyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EgyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EgyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(EgyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#type_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_suffix(EgyParser.Type_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#discrete_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_type(EgyParser.Discrete_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type(EgyParser.Function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#parameter_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_types(EgyParser.Parameter_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(EgyParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(EgyParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(EgyParser.Array_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#discrete_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_literal(EgyParser.Discrete_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(EgyParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(EgyParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(EgyParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#set_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_literal(EgyParser.Set_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(EgyParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(EgyParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#const_initialization_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_initialization_statement(EgyParser.Const_initialization_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#declaration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_statement(EgyParser.Declaration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#initialization_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization_statement(EgyParser.Initialization_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(EgyParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#rvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(EgyParser.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(EgyParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#function_call_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_suffix(EgyParser.Function_call_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(EgyParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(EgyParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(EgyParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(EgyParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#repeat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_statement(EgyParser.Repeat_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(EgyParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#for_iterable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_iterable(EgyParser.For_iterableContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(EgyParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(EgyParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(EgyParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(EgyParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(EgyParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(EgyParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(EgyParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(EgyParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(EgyParser.BaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(EgyParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(EgyParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EgyParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(EgyParser.String_literalContext ctx);
}