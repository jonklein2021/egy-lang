// Generated from Egy.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EgyParser}.
 */
public interface EgyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EgyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(EgyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(EgyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#type_suffix}.
	 * @param ctx the parse tree
	 */
	void enterType_suffix(EgyParser.Type_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#type_suffix}.
	 * @param ctx the parse tree
	 */
	void exitType_suffix(EgyParser.Type_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#discrete_type}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_type(EgyParser.Discrete_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#discrete_type}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_type(EgyParser.Discrete_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(EgyParser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(EgyParser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#parameter_types}.
	 * @param ctx the parse tree
	 */
	void enterParameter_types(EgyParser.Parameter_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#parameter_types}.
	 * @param ctx the parse tree
	 */
	void exitParameter_types(EgyParser.Parameter_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(EgyParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(EgyParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(EgyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(EgyParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(EgyParser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(EgyParser.Array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#discrete_literal}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_literal(EgyParser.Discrete_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#discrete_literal}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_literal(EgyParser.Discrete_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(EgyParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(EgyParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(EgyParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(EgyParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(EgyParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(EgyParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void enterSet_literal(EgyParser.Set_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#set_literal}.
	 * @param ctx the parse tree
	 */
	void exitSet_literal(EgyParser.Set_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EgyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EgyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(EgyParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(EgyParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#const_initialization_statement}.
	 * @param ctx the parse tree
	 */
	void enterConst_initialization_statement(EgyParser.Const_initialization_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#const_initialization_statement}.
	 * @param ctx the parse tree
	 */
	void exitConst_initialization_statement(EgyParser.Const_initialization_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(EgyParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(EgyParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#initialization_statement}.
	 * @param ctx the parse tree
	 */
	void enterInitialization_statement(EgyParser.Initialization_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#initialization_statement}.
	 * @param ctx the parse tree
	 */
	void exitInitialization_statement(EgyParser.Initialization_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(EgyParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(EgyParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(EgyParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(EgyParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(EgyParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(EgyParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#function_call_suffix}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_suffix(EgyParser.Function_call_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#function_call_suffix}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_suffix(EgyParser.Function_call_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(EgyParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(EgyParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(EgyParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(EgyParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(EgyParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(EgyParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(EgyParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(EgyParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_statement(EgyParser.Repeat_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_statement(EgyParser.Repeat_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(EgyParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(EgyParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#for_iterable}.
	 * @param ctx the parse tree
	 */
	void enterFor_iterable(EgyParser.For_iterableContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#for_iterable}.
	 * @param ctx the parse tree
	 */
	void exitFor_iterable(EgyParser.For_iterableContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(EgyParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(EgyParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(EgyParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(EgyParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(EgyParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(EgyParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(EgyParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(EgyParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(EgyParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(EgyParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(EgyParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(EgyParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(EgyParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(EgyParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(EgyParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(EgyParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(EgyParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(EgyParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(EgyParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(EgyParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(EgyParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(EgyParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EgyParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(EgyParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EgyParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(EgyParser.String_literalContext ctx);
}