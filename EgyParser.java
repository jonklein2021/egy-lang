// Generated from Egy.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EgyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACKET=1, RBRACKET=2, LBRACE=3, RBRACE=4, CHAR=5, SHORT=6, INT=7, LONG=8, 
		LONGER=9, FLOAT=10, DOUBLE=11, STRING=12, FUNCTION=13, COLON=14, LPAREN=15, 
		RPAREN=16, RIGHTARROW=17, COMMA=18, VOID=19, TRUE=20, FALSE=21, ID=22, 
		BINARYLITERAL=23, DECIMALLITERAL=24, OCTALLITERAL=25, HEXADECIMALLITERAL=26, 
		ASSIGN=27, SEMICOLON=28, CONST=29, LET=30, DO=31, WHILE=32, REPEAT=33, 
		UNTIL=34, FOR=35, IN=36, IF=37, ELSE=38, PRINT=39, RETURN=40, AND=41, 
		OR=42, EQUALS=43, NOTEQUALTO=44, LESSTHAN=45, LESSTHANOREQUALTO=46, GREATERTHAN=47, 
		GREATERTHANOREQUALTO=48, PLUS=49, MINUS=50, TIMES=51, DIVIDE=52, MOD=53, 
		LSHIFT=54, RSHIFT=55, POW=56, NOT=57, SINGLEQUOTE=58, SingleCharacter=59, 
		EscapeSequence=60, UnterminatedStringLiteral=61, DOUBLEQUOTE=62;
	public static final int
		RULE_type = 0, RULE_type_suffix = 1, RULE_discrete_type = 2, RULE_function_type = 3, 
		RULE_parameter_types = 4, RULE_return_type = 5, RULE_literal = 6, RULE_array_literal = 7, 
		RULE_discrete_literal = 8, RULE_boolean_literal = 9, RULE_function_definition = 10, 
		RULE_numeric_literal = 11, RULE_set_literal = 12, RULE_statement = 13, 
		RULE_assignment_statement = 14, RULE_const_initialization_statement = 15, 
		RULE_declaration_statement = 16, RULE_initialization_statement = 17, RULE_lvalue = 18, 
		RULE_rvalue = 19, RULE_function_call = 20, RULE_function_call_suffix = 21, 
		RULE_argument_list = 22, RULE_compound_statement = 23, RULE_do_while_statement = 24, 
		RULE_while_statement = 25, RULE_repeat_statement = 26, RULE_for_statement = 27, 
		RULE_for_iterable = 28, RULE_if_statement = 29, RULE_print_statement = 30, 
		RULE_return_statement = 31, RULE_logical_expression = 32, RULE_relational_expression = 33, 
		RULE_simple_expression = 34, RULE_term = 35, RULE_factor = 36, RULE_base = 37, 
		RULE_negation = 38, RULE_char_literal = 39, RULE_string_literal = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "type_suffix", "discrete_type", "function_type", "parameter_types", 
			"return_type", "literal", "array_literal", "discrete_literal", "boolean_literal", 
			"function_definition", "numeric_literal", "set_literal", "statement", 
			"assignment_statement", "const_initialization_statement", "declaration_statement", 
			"initialization_statement", "lvalue", "rvalue", "function_call", "function_call_suffix", 
			"argument_list", "compound_statement", "do_while_statement", "while_statement", 
			"repeat_statement", "for_statement", "for_iterable", "if_statement", 
			"print_statement", "return_statement", "logical_expression", "relational_expression", 
			"simple_expression", "term", "factor", "base", "negation", "char_literal", 
			"string_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "CHAR", "SHORT", "INT", 
			"LONG", "LONGER", "FLOAT", "DOUBLE", "STRING", "FUNCTION", "COLON", "LPAREN", 
			"RPAREN", "RIGHTARROW", "COMMA", "VOID", "TRUE", "FALSE", "ID", "BINARYLITERAL", 
			"DECIMALLITERAL", "OCTALLITERAL", "HEXADECIMALLITERAL", "ASSIGN", "SEMICOLON", 
			"CONST", "LET", "DO", "WHILE", "REPEAT", "UNTIL", "FOR", "IN", "IF", 
			"ELSE", "PRINT", "RETURN", "AND", "OR", "EQUALS", "NOTEQUALTO", "LESSTHAN", 
			"LESSTHANOREQUALTO", "GREATERTHAN", "GREATERTHANOREQUALTO", "PLUS", "MINUS", 
			"TIMES", "DIVIDE", "MOD", "LSHIFT", "RSHIFT", "POW", "NOT", "SINGLEQUOTE", 
			"SingleCharacter", "EscapeSequence", "UnterminatedStringLiteral", "DOUBLEQUOTE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Egy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EgyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Discrete_typeContext discrete_type() {
			return getRuleContext(Discrete_typeContext.class,0);
		}
		public List<Type_suffixContext> type_suffix() {
			return getRuleContexts(Type_suffixContext.class);
		}
		public Type_suffixContext type_suffix(int i) {
			return getRuleContext(Type_suffixContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			discrete_type();
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					type_suffix();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_suffixContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(EgyParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(EgyParser.RBRACKET, 0); }
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(EgyParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(EgyParser.RBRACE, 0); }
		public Type_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitType_suffix(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type_suffix);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(LBRACKET);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) {
					{
					setState(90);
					numeric_literal();
					}
				}

				setState(93);
				match(RBRACKET);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(LBRACE);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) {
					{
					setState(95);
					numeric_literal();
					}
				}

				setState(98);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Discrete_typeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(EgyParser.CHAR, 0); }
		public TerminalNode SHORT() { return getToken(EgyParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(EgyParser.INT, 0); }
		public TerminalNode LONG() { return getToken(EgyParser.LONG, 0); }
		public TerminalNode LONGER() { return getToken(EgyParser.LONGER, 0); }
		public TerminalNode FLOAT() { return getToken(EgyParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(EgyParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(EgyParser.STRING, 0); }
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public Discrete_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discrete_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterDiscrete_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitDiscrete_type(this);
		}
	}

	public final Discrete_typeContext discrete_type() throws RecognitionException {
		Discrete_typeContext _localctx = new Discrete_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_discrete_type);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(CHAR);
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(SHORT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(INT);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(LONG);
				}
				break;
			case LONGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				match(LONGER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				match(DOUBLE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				match(STRING);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				function_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_typeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(EgyParser.FUNCTION, 0); }
		public TerminalNode COLON() { return getToken(EgyParser.COLON, 0); }
		public TerminalNode LPAREN() { return getToken(EgyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EgyParser.RPAREN, 0); }
		public TerminalNode RIGHTARROW() { return getToken(EgyParser.RIGHTARROW, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Parameter_typesContext parameter_types() {
			return getRuleContext(Parameter_typesContext.class,0);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterFunction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitFunction_type(this);
		}
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(FUNCTION);
			setState(113);
			match(COLON);
			setState(114);
			match(LPAREN);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16352L) != 0)) {
				{
				setState(115);
				parameter_types();
				}
			}

			setState(118);
			match(RPAREN);
			setState(119);
			match(RIGHTARROW);
			setState(120);
			return_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_typesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EgyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EgyParser.COMMA, i);
		}
		public Parameter_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterParameter_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitParameter_types(this);
		}
	}

	public final Parameter_typesContext parameter_types() throws RecognitionException {
		Parameter_typesContext _localctx = new Parameter_typesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			type();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				type();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(EgyParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_return_type);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case SHORT:
			case INT:
			case LONG:
			case LONGER:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Discrete_literalContext discrete_literal() {
			return getRuleContext(Discrete_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Set_literalContext set_literal() {
			return getRuleContext(Set_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literal);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				array_literal();
				}
				break;
			case LPAREN:
			case TRUE:
			case FALSE:
			case BINARYLITERAL:
			case DECIMALLITERAL:
			case OCTALLITERAL:
			case HEXADECIMALLITERAL:
			case SINGLEQUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				discrete_literal();
				}
				break;
			case UnterminatedStringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				string_literal();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				set_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_literalContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(EgyParser.LBRACKET, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(EgyParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EgyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EgyParser.COMMA, i);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitArray_literal(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LBRACKET);
			setState(141);
			literal();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				literal();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Discrete_literalContext extends ParserRuleContext {
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Discrete_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discrete_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterDiscrete_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitDiscrete_literal(this);
		}
	}

	public final Discrete_literalContext discrete_literal() throws RecognitionException {
		Discrete_literalContext _localctx = new Discrete_literalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_discrete_literal);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLEQUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				char_literal();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				boolean_literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				function_definition();
				}
				break;
			case BINARYLITERAL:
			case DECIMALLITERAL:
			case OCTALLITERAL:
			case HEXADECIMALLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				numeric_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(EgyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EgyParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitBoolean_literal(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EgyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EgyParser.RPAREN, 0); }
		public TerminalNode RIGHTARROW() { return getToken(EgyParser.RIGHTARROW, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(EgyParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EgyParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(EgyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(EgyParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EgyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EgyParser.COMMA, i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LPAREN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(160);
				match(ID);
				setState(161);
				match(COLON);
				setState(162);
				type();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(163);
					match(COMMA);
					setState(164);
					match(ID);
					setState(165);
					match(COLON);
					setState(166);
					type();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(174);
			match(RPAREN);
			setState(175);
			match(RIGHTARROW);
			setState(176);
			type();
			setState(177);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_literalContext extends ParserRuleContext {
		public TerminalNode BINARYLITERAL() { return getToken(EgyParser.BINARYLITERAL, 0); }
		public TerminalNode DECIMALLITERAL() { return getToken(EgyParser.DECIMALLITERAL, 0); }
		public TerminalNode OCTALLITERAL() { return getToken(EgyParser.OCTALLITERAL, 0); }
		public TerminalNode HEXADECIMALLITERAL() { return getToken(EgyParser.HEXADECIMALLITERAL, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitNumeric_literal(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_numeric_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_literalContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(EgyParser.LBRACE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(EgyParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EgyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EgyParser.COMMA, i);
		}
		public Set_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterSet_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitSet_literal(this);
		}
	}

	public final Set_literalContext set_literal() throws RecognitionException {
		Set_literalContext _localctx = new Set_literalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LBRACE);
			setState(182);
			literal();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(183);
				match(COMMA);
				setState(184);
				literal();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Const_initialization_statementContext const_initialization_statement() {
			return getRuleContext(Const_initialization_statementContext.class,0);
		}
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Repeat_statementContext repeat_statement() {
			return getRuleContext(Repeat_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				assignment_statement();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				const_initialization_statement();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				declaration_statement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				compound_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				if_statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				do_while_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				while_statement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				repeat_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				for_statement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 10);
				{
				setState(201);
				print_statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 11);
				{
				setState(202);
				return_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_statementContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(EgyParser.ASSIGN, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EgyParser.SEMICOLON, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			lvalue();
			setState(206);
			match(ASSIGN);
			setState(207);
			logical_expression();
			setState(208);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_initialization_statementContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(EgyParser.CONST, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(EgyParser.ASSIGN, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EgyParser.SEMICOLON, 0); }
		public TerminalNode COLON() { return getToken(EgyParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Const_initialization_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_initialization_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterConst_initialization_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitConst_initialization_statement(this);
		}
	}

	public final Const_initialization_statementContext const_initialization_statement() throws RecognitionException {
		Const_initialization_statementContext _localctx = new Const_initialization_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_const_initialization_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(CONST);
			setState(211);
			lvalue();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(212);
				match(COLON);
				setState(213);
				type();
				}
			}

			setState(216);
			match(ASSIGN);
			setState(217);
			logical_expression();
			setState(218);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_statementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(EgyParser.LET, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(EgyParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EgyParser.SEMICOLON, 0); }
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitDeclaration_statement(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(LET);
			setState(221);
			lvalue();
			setState(222);
			match(COLON);
			setState(223);
			type();
			setState(224);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Initialization_statementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(EgyParser.LET, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(EgyParser.ASSIGN, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EgyParser.SEMICOLON, 0); }
		public TerminalNode COLON() { return getToken(EgyParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Initialization_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterInitialization_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitInitialization_statement(this);
		}
	}

	public final Initialization_statementContext initialization_statement() throws RecognitionException {
		Initialization_statementContext _localctx = new Initialization_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_initialization_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(LET);
			setState(227);
			lvalue();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(228);
				match(COLON);
				setState(229);
				type();
				}
			}

			setState(232);
			match(ASSIGN);
			setState(233);
			logical_expression();
			setState(234);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LvalueContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode ID() { return getToken(EgyParser.ID, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(EgyParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(EgyParser.LBRACKET, i);
		}
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(EgyParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(EgyParser.RBRACKET, i);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lvalue);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(ID);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(238);
					match(LBRACKET);
					setState(239);
					simple_expression();
					setState(240);
					match(RBRACKET);
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RvalueContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode ID() { return getToken(EgyParser.ID, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(EgyParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(EgyParser.LBRACKET, i);
		}
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(EgyParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(EgyParser.RBRACKET, i);
		}
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitRvalue(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		RvalueContext _localctx = new RvalueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rvalue);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(ID);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(251);
					match(LBRACKET);
					setState(252);
					simple_expression();
					setState(253);
					match(RBRACKET);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EgyParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(EgyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EgyParser.RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(EgyParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(EgyParser.LBRACKET, i);
		}
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(EgyParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(EgyParser.RBRACKET, i);
		}
		public List<Function_call_suffixContext> function_call_suffix() {
			return getRuleContexts(Function_call_suffixContext.class);
		}
		public Function_call_suffixContext function_call_suffix(int i) {
			return getRuleContext(Function_call_suffixContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
			setState(263);
			match(LPAREN);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2738188573574463498L) != 0)) {
				{
				setState(264);
				argument_list();
				}
			}

			setState(267);
			match(RPAREN);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(268);
					match(LBRACKET);
					setState(269);
					simple_expression();
					setState(270);
					match(RBRACKET);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET || _la==LPAREN) {
				{
				{
				setState(277);
				function_call_suffix();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_suffixContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EgyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EgyParser.RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(EgyParser.LBRACKET, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(EgyParser.RBRACKET, 0); }
		public Function_call_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterFunction_call_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitFunction_call_suffix(this);
		}
	}

	public final Function_call_suffixContext function_call_suffix() throws RecognitionException {
		Function_call_suffixContext _localctx = new Function_call_suffixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call_suffix);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(LPAREN);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2738188573574463498L) != 0)) {
					{
					setState(284);
					argument_list();
					}
				}

				setState(287);
				match(RPAREN);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(LBRACKET);
				setState(289);
				simple_expression();
				setState(290);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EgyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EgyParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			simple_expression();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(295);
				match(COMMA);
				setState(296);
				simple_expression();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(EgyParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(EgyParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(LBRACE);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1837713326088L) != 0)) {
				{
				{
				setState(303);
				statement();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(EgyParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(EgyParser.WHILE, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(DO);
			setState(312);
			statement();
			setState(313);
			match(WHILE);
			setState(314);
			logical_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(EgyParser.WHILE, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(WHILE);
			setState(317);
			logical_expression();
			setState(318);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_statementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(EgyParser.REPEAT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(EgyParser.UNTIL, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EgyParser.SEMICOLON, 0); }
		public Repeat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterRepeat_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitRepeat_statement(this);
		}
	}

	public final Repeat_statementContext repeat_statement() throws RecognitionException {
		Repeat_statementContext _localctx = new Repeat_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_repeat_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(REPEAT);
			setState(321);
			statement();
			setState(322);
			match(UNTIL);
			setState(323);
			logical_expression();
			setState(324);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(EgyParser.FOR, 0); }
		public TerminalNode ID() { return getToken(EgyParser.ID, 0); }
		public TerminalNode IN() { return getToken(EgyParser.IN, 0); }
		public For_iterableContext for_iterable() {
			return getRuleContext(For_iterableContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(FOR);
			setState(327);
			match(ID);
			setState(328);
			match(IN);
			setState(329);
			for_iterable();
			setState(330);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_iterableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EgyParser.ID, 0); }
		public Set_literalContext set_literal() {
			return getRuleContext(Set_literalContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public For_iterableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iterable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterFor_iterable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitFor_iterable(this);
		}
	}

	public final For_iterableContext for_iterable() throws RecognitionException {
		For_iterableContext _localctx = new For_iterableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_for_iterable);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				set_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				simple_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EgyParser.IF, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(EgyParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(IF);
			setState(338);
			logical_expression();
			setState(339);
			statement();
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(340);
				match(ELSE);
				setState(341);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(EgyParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(EgyParser.LPAREN, 0); }
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(EgyParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(EgyParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EgyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EgyParser.COMMA, i);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitPrint_statement(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(PRINT);
			setState(345);
			match(LPAREN);
			setState(346);
			simple_expression();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(347);
				match(COMMA);
				setState(348);
				simple_expression();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			match(RPAREN);
			setState(355);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(EgyParser.RETURN, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(EgyParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(RETURN);
			setState(358);
			logical_expression();
			setState(359);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_expressionContext extends ParserRuleContext {
		public Token op;
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(EgyParser.AND, 0); }
		public TerminalNode OR() { return getToken(EgyParser.OR, 0); }
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitLogical_expression(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_logical_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			relational_expression();
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(362);
				((Logical_expressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((Logical_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(363);
				relational_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_expressionContext extends ParserRuleContext {
		public Token op;
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(EgyParser.EQUALS, 0); }
		public TerminalNode NOTEQUALTO() { return getToken(EgyParser.NOTEQUALTO, 0); }
		public TerminalNode LESSTHAN() { return getToken(EgyParser.LESSTHAN, 0); }
		public TerminalNode LESSTHANOREQUALTO() { return getToken(EgyParser.LESSTHANOREQUALTO, 0); }
		public TerminalNode GREATERTHAN() { return getToken(EgyParser.GREATERTHAN, 0); }
		public TerminalNode GREATERTHANOREQUALTO() { return getToken(EgyParser.GREATERTHANOREQUALTO, 0); }
		public TerminalNode IN() { return getToken(EgyParser.IN, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			simple_expression();
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(367);
				((Relational_expressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 554222579875840L) != 0)) ) {
					((Relational_expressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(368);
				simple_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_expressionContext extends ParserRuleContext {
		public Token PLUS;
		public List<Token> op = new ArrayList<Token>();
		public Token MINUS;
		public Token _tset777;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(EgyParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(EgyParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(EgyParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(EgyParser.MINUS, i);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitSimple_expression(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_simple_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			term();
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372);
					((Simple_expressionContext)_localctx)._tset777 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((Simple_expressionContext)_localctx)._tset777 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((Simple_expressionContext)_localctx).op.add(((Simple_expressionContext)_localctx)._tset777);
					setState(373);
					term();
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public Token TIMES;
		public List<Token> op = new ArrayList<Token>();
		public Token DIVIDE;
		public Token MOD;
		public Token LSHIFT;
		public Token RSHIFT;
		public Token _tset800;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(EgyParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(EgyParser.TIMES, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(EgyParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(EgyParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(EgyParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(EgyParser.MOD, i);
		}
		public List<TerminalNode> LSHIFT() { return getTokens(EgyParser.LSHIFT); }
		public TerminalNode LSHIFT(int i) {
			return getToken(EgyParser.LSHIFT, i);
		}
		public List<TerminalNode> RSHIFT() { return getTokens(EgyParser.RSHIFT); }
		public TerminalNode RSHIFT(int i) {
			return getToken(EgyParser.RSHIFT, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			factor();
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(380);
					((TermContext)_localctx)._tset800 = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805794224242688L) != 0)) ) {
						((TermContext)_localctx)._tset800 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((TermContext)_localctx).op.add(((TermContext)_localctx)._tset800);
					setState(381);
					factor();
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public Token op;
		public List<BaseContext> base() {
			return getRuleContexts(BaseContext.class);
		}
		public BaseContext base(int i) {
			return getRuleContext(BaseContext.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(EgyParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(EgyParser.POW, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_factor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			base();
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					((FactorContext)_localctx).op = match(POW);
					setState(389);
					base();
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseContext extends ParserRuleContext {
		public Logical_expressionContext fle;
		public LiteralContext fl;
		public RvalueContext fi;
		public NegationContext fn;
		public TerminalNode LPAREN() { return getToken(EgyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EgyParser.RPAREN, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public NegationContext negation() {
			return getRuleContext(NegationContext.class,0);
		}
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitBase(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_base);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(LPAREN);
				setState(396);
				((BaseContext)_localctx).fle = logical_expression();
				setState(397);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				((BaseContext)_localctx).fl = literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				((BaseContext)_localctx).fi = rvalue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				((BaseContext)_localctx).fn = negation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(EgyParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitNegation(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(NOT);
			setState(405);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Char_literalContext extends ParserRuleContext {
		public List<TerminalNode> SINGLEQUOTE() { return getTokens(EgyParser.SINGLEQUOTE); }
		public TerminalNode SINGLEQUOTE(int i) {
			return getToken(EgyParser.SINGLEQUOTE, i);
		}
		public TerminalNode SingleCharacter() { return getToken(EgyParser.SingleCharacter, 0); }
		public TerminalNode EscapeSequence() { return getToken(EgyParser.EscapeSequence, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitChar_literal(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_char_literal);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(SINGLEQUOTE);
				setState(408);
				match(SingleCharacter);
				setState(409);
				match(SINGLEQUOTE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(SINGLEQUOTE);
				setState(411);
				match(EscapeSequence);
				setState(412);
				match(SINGLEQUOTE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode UnterminatedStringLiteral() { return getToken(EgyParser.UnterminatedStringLiteral, 0); }
		public TerminalNode DOUBLEQUOTE() { return getToken(EgyParser.DOUBLEQUOTE, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EgyListener ) ((EgyListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(UnterminatedStringLiteral);
			setState(416);
			match(DOUBLEQUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u01a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0001\u0000\u0005\u0000U\b\u0000\n\u0000\f\u0000"+
		"X\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001\\\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001a\b\u0001\u0001\u0001\u0003\u0001d\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002o\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003u\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004~\b\u0004\n\u0004\f\u0004\u0081\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0085\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u008b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0091\b\u0007\n\u0007\f\u0007\u0094\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009c\b\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00a8\b\n\n\n\f\n\u00ab\t\n\u0003\n\u00ad\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00ba\b\f\n\f\f\f\u00bd\t\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00cc\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00d7\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00e7\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00f3\b\u0012\n"+
		"\u0012\f\u0012\u00f6\t\u0012\u0003\u0012\u00f8\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0100"+
		"\b\u0013\n\u0013\f\u0013\u0103\t\u0013\u0003\u0013\u0105\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010a\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0111\b\u0014\n"+
		"\u0014\f\u0014\u0114\t\u0014\u0001\u0014\u0005\u0014\u0117\b\u0014\n\u0014"+
		"\f\u0014\u011a\t\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u011e\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0125\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u012a\b"+
		"\u0016\n\u0016\f\u0016\u012d\t\u0016\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0131\b\u0017\n\u0017\f\u0017\u0134\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0150\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0157\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u015e\b\u001e\n\u001e\f\u001e\u0161\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u016d\b \u0001!\u0001!\u0001"+
		"!\u0003!\u0172\b!\u0001\"\u0001\"\u0001\"\u0005\"\u0177\b\"\n\"\f\"\u017a"+
		"\t\"\u0001#\u0001#\u0001#\u0005#\u017f\b#\n#\f#\u0182\t#\u0001$\u0001"+
		"$\u0001$\u0005$\u0187\b$\n$\f$\u018a\t$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u0193\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u019e\b\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0000\u0000)\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNP\u0000\u0006\u0001\u0000"+
		"\u0014\u0015\u0001\u0000\u0017\u001a\u0001\u0000)*\u0002\u0000$$+0\u0001"+
		"\u000012\u0001\u000037\u01b6\u0000R\u0001\u0000\u0000\u0000\u0002c\u0001"+
		"\u0000\u0000\u0000\u0004n\u0001\u0000\u0000\u0000\u0006p\u0001\u0000\u0000"+
		"\u0000\bz\u0001\u0000\u0000\u0000\n\u0084\u0001\u0000\u0000\u0000\f\u008a"+
		"\u0001\u0000\u0000\u0000\u000e\u008c\u0001\u0000\u0000\u0000\u0010\u009b"+
		"\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u009f"+
		"\u0001\u0000\u0000\u0000\u0016\u00b3\u0001\u0000\u0000\u0000\u0018\u00b5"+
		"\u0001\u0000\u0000\u0000\u001a\u00cb\u0001\u0000\u0000\u0000\u001c\u00cd"+
		"\u0001\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00dc\u0001"+
		"\u0000\u0000\u0000\"\u00e2\u0001\u0000\u0000\u0000$\u00f7\u0001\u0000"+
		"\u0000\u0000&\u0104\u0001\u0000\u0000\u0000(\u0106\u0001\u0000\u0000\u0000"+
		"*\u0124\u0001\u0000\u0000\u0000,\u0126\u0001\u0000\u0000\u0000.\u012e"+
		"\u0001\u0000\u0000\u00000\u0137\u0001\u0000\u0000\u00002\u013c\u0001\u0000"+
		"\u0000\u00004\u0140\u0001\u0000\u0000\u00006\u0146\u0001\u0000\u0000\u0000"+
		"8\u014f\u0001\u0000\u0000\u0000:\u0151\u0001\u0000\u0000\u0000<\u0158"+
		"\u0001\u0000\u0000\u0000>\u0165\u0001\u0000\u0000\u0000@\u0169\u0001\u0000"+
		"\u0000\u0000B\u016e\u0001\u0000\u0000\u0000D\u0173\u0001\u0000\u0000\u0000"+
		"F\u017b\u0001\u0000\u0000\u0000H\u0183\u0001\u0000\u0000\u0000J\u0192"+
		"\u0001\u0000\u0000\u0000L\u0194\u0001\u0000\u0000\u0000N\u019d\u0001\u0000"+
		"\u0000\u0000P\u019f\u0001\u0000\u0000\u0000RV\u0003\u0004\u0002\u0000"+
		"SU\u0003\u0002\u0001\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0001\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y[\u0005\u0001\u0000\u0000"+
		"Z\\\u0003\u0016\u000b\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]d\u0005\u0002\u0000\u0000^`\u0005\u0003"+
		"\u0000\u0000_a\u0003\u0016\u000b\u0000`_\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0005\u0004\u0000\u0000"+
		"cY\u0001\u0000\u0000\u0000c^\u0001\u0000\u0000\u0000d\u0003\u0001\u0000"+
		"\u0000\u0000eo\u0005\u0005\u0000\u0000fo\u0005\u0006\u0000\u0000go\u0005"+
		"\u0007\u0000\u0000ho\u0005\b\u0000\u0000io\u0005\t\u0000\u0000jo\u0005"+
		"\n\u0000\u0000ko\u0005\u000b\u0000\u0000lo\u0005\f\u0000\u0000mo\u0003"+
		"\u0006\u0003\u0000ne\u0001\u0000\u0000\u0000nf\u0001\u0000\u0000\u0000"+
		"ng\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000ni\u0001\u0000\u0000"+
		"\u0000nj\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0005\u0001\u0000\u0000\u0000"+
		"pq\u0005\r\u0000\u0000qr\u0005\u000e\u0000\u0000rt\u0005\u000f\u0000\u0000"+
		"su\u0003\b\u0004\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vw\u0005\u0010\u0000\u0000wx\u0005\u0011\u0000"+
		"\u0000xy\u0003\n\u0005\u0000y\u0007\u0001\u0000\u0000\u0000z\u007f\u0003"+
		"\u0000\u0000\u0000{|\u0005\u0012\u0000\u0000|~\u0003\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\t\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0003\u0000"+
		"\u0000\u0000\u0083\u0085\u0005\u0013\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u000b\u0001\u0000"+
		"\u0000\u0000\u0086\u008b\u0003\u000e\u0007\u0000\u0087\u008b\u0003\u0010"+
		"\b\u0000\u0088\u008b\u0003P(\u0000\u0089\u008b\u0003\u0018\f\u0000\u008a"+
		"\u0086\u0001\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\r\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0001\u0000\u0000\u008d\u0092"+
		"\u0003\f\u0006\u0000\u008e\u008f\u0005\u0012\u0000\u0000\u008f\u0091\u0003"+
		"\f\u0006\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\u0002\u0000\u0000\u0096\u000f\u0001\u0000"+
		"\u0000\u0000\u0097\u009c\u0003N\'\u0000\u0098\u009c\u0003\u0012\t\u0000"+
		"\u0099\u009c\u0003\u0014\n\u0000\u009a\u009c\u0003\u0016\u000b\u0000\u009b"+
		"\u0097\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u0011\u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0000\u0000\u0000\u009e"+
		"\u0013\u0001\u0000\u0000\u0000\u009f\u00ac\u0005\u000f\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0016\u0000\u0000\u00a1\u00a2\u0005\u000e\u0000\u0000\u00a2"+
		"\u00a9\u0003\u0000\u0000\u0000\u00a3\u00a4\u0005\u0012\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0016\u0000\u0000\u00a5\u00a6\u0005\u000e\u0000\u0000\u00a6"+
		"\u00a8\u0003\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ac\u00a0\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005\u0010\u0000\u0000\u00af\u00b0\u0005\u0011\u0000\u0000\u00b0"+
		"\u00b1\u0003\u0000\u0000\u0000\u00b1\u00b2\u0003\u001a\r\u0000\u00b2\u0015"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0001\u0000\u0000\u00b4\u0017"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0003\u0000\u0000\u00b6\u00bb"+
		"\u0003\f\u0006\u0000\u00b7\u00b8\u0005\u0012\u0000\u0000\u00b8\u00ba\u0003"+
		"\f\u0006\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005\u0004\u0000\u0000\u00bf\u0019\u0001\u0000"+
		"\u0000\u0000\u00c0\u00cc\u0003\u001c\u000e\u0000\u00c1\u00cc\u0003\u001e"+
		"\u000f\u0000\u00c2\u00cc\u0003 \u0010\u0000\u00c3\u00cc\u0003.\u0017\u0000"+
		"\u00c4\u00cc\u0003:\u001d\u0000\u00c5\u00cc\u00030\u0018\u0000\u00c6\u00cc"+
		"\u00032\u0019\u0000\u00c7\u00cc\u00034\u001a\u0000\u00c8\u00cc\u00036"+
		"\u001b\u0000\u00c9\u00cc\u0003<\u001e\u0000\u00ca\u00cc\u0003>\u001f\u0000"+
		"\u00cb\u00c0\u0001\u0000\u0000\u0000\u00cb\u00c1\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c2\u0001\u0000\u0000\u0000\u00cb\u00c3\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c4\u0001\u0000\u0000\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c6\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u001b\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0003$\u0012\u0000\u00ce\u00cf\u0005\u001b\u0000\u0000\u00cf"+
		"\u00d0\u0003@ \u0000\u00d0\u00d1\u0005\u001c\u0000\u0000\u00d1\u001d\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\u001d\u0000\u0000\u00d3\u00d6\u0003"+
		"$\u0012\u0000\u00d4\u00d5\u0005\u000e\u0000\u0000\u00d5\u00d7\u0003\u0000"+
		"\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u001b"+
		"\u0000\u0000\u00d9\u00da\u0003@ \u0000\u00da\u00db\u0005\u001c\u0000\u0000"+
		"\u00db\u001f\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u001e\u0000\u0000"+
		"\u00dd\u00de\u0003$\u0012\u0000\u00de\u00df\u0005\u000e\u0000\u0000\u00df"+
		"\u00e0\u0003\u0000\u0000\u0000\u00e0\u00e1\u0005\u001c\u0000\u0000\u00e1"+
		"!\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u001e\u0000\u0000\u00e3\u00e6"+
		"\u0003$\u0012\u0000\u00e4\u00e5\u0005\u000e\u0000\u0000\u00e5\u00e7\u0003"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"\u001b\u0000\u0000\u00e9\u00ea\u0003@ \u0000\u00ea\u00eb\u0005\u001c\u0000"+
		"\u0000\u00eb#\u0001\u0000\u0000\u0000\u00ec\u00f8\u0003(\u0014\u0000\u00ed"+
		"\u00f4\u0005\u0016\u0000\u0000\u00ee\u00ef\u0005\u0001\u0000\u0000\u00ef"+
		"\u00f0\u0003D\"\u0000\u00f0\u00f1\u0005\u0002\u0000\u0000\u00f1\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f2\u00ee\u0001\u0000\u0000\u0000\u00f3\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00ec\u0001\u0000\u0000\u0000\u00f7\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f8%\u0001\u0000\u0000\u0000\u00f9\u0105\u0003"+
		"(\u0014\u0000\u00fa\u0101\u0005\u0016\u0000\u0000\u00fb\u00fc\u0005\u0001"+
		"\u0000\u0000\u00fc\u00fd\u0003D\"\u0000\u00fd\u00fe\u0005\u0002\u0000"+
		"\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fb\u0001\u0000\u0000"+
		"\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u00f9\u0001\u0000\u0000"+
		"\u0000\u0104\u00fa\u0001\u0000\u0000\u0000\u0105\'\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0005\u0016\u0000\u0000\u0107\u0109\u0005\u000f\u0000\u0000"+
		"\u0108\u010a\u0003,\u0016\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b"+
		"\u0112\u0005\u0010\u0000\u0000\u010c\u010d\u0005\u0001\u0000\u0000\u010d"+
		"\u010e\u0003D\"\u0000\u010e\u010f\u0005\u0002\u0000\u0000\u010f\u0111"+
		"\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u0111\u0114"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0118\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0115\u0117\u0003*\u0015\u0000\u0116\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119)\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011d\u0005\u000f"+
		"\u0000\u0000\u011c\u011e\u0003,\u0016\u0000\u011d\u011c\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0125\u0005\u0010\u0000\u0000\u0120\u0121\u0005\u0001\u0000"+
		"\u0000\u0121\u0122\u0003D\"\u0000\u0122\u0123\u0005\u0002\u0000\u0000"+
		"\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u011b\u0001\u0000\u0000\u0000"+
		"\u0124\u0120\u0001\u0000\u0000\u0000\u0125+\u0001\u0000\u0000\u0000\u0126"+
		"\u012b\u0003D\"\u0000\u0127\u0128\u0005\u0012\u0000\u0000\u0128\u012a"+
		"\u0003D\"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012d\u0001"+
		"\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001"+
		"\u0000\u0000\u0000\u012c-\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012e\u0132\u0005\u0003\u0000\u0000\u012f\u0131\u0003\u001a"+
		"\r\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000"+
		"\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000"+
		"\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0005\u0004\u0000\u0000\u0136/\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0005\u001f\u0000\u0000\u0138\u0139\u0003\u001a\r\u0000\u0139"+
		"\u013a\u0005 \u0000\u0000\u013a\u013b\u0003@ \u0000\u013b1\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0005 \u0000\u0000\u013d\u013e\u0003@ \u0000"+
		"\u013e\u013f\u0003\u001a\r\u0000\u013f3\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0005!\u0000\u0000\u0141\u0142\u0003\u001a\r\u0000\u0142\u0143"+
		"\u0005\"\u0000\u0000\u0143\u0144\u0003@ \u0000\u0144\u0145\u0005\u001c"+
		"\u0000\u0000\u01455\u0001\u0000\u0000\u0000\u0146\u0147\u0005#\u0000\u0000"+
		"\u0147\u0148\u0005\u0016\u0000\u0000\u0148\u0149\u0005$\u0000\u0000\u0149"+
		"\u014a\u00038\u001c\u0000\u014a\u014b\u0003\u001a\r\u0000\u014b7\u0001"+
		"\u0000\u0000\u0000\u014c\u0150\u0005\u0016\u0000\u0000\u014d\u0150\u0003"+
		"\u0018\f\u0000\u014e\u0150\u0003D\"\u0000\u014f\u014c\u0001\u0000\u0000"+
		"\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u014e\u0001\u0000\u0000"+
		"\u0000\u01509\u0001\u0000\u0000\u0000\u0151\u0152\u0005%\u0000\u0000\u0152"+
		"\u0153\u0003@ \u0000\u0153\u0156\u0003\u001a\r\u0000\u0154\u0155\u0005"+
		"&\u0000\u0000\u0155\u0157\u0003\u001a\r\u0000\u0156\u0154\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157;\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0005\'\u0000\u0000\u0159\u015a\u0005\u000f\u0000\u0000"+
		"\u015a\u015f\u0003D\"\u0000\u015b\u015c\u0005\u0012\u0000\u0000\u015c"+
		"\u015e\u0003D\"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0161"+
		"\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015f"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0010\u0000\u0000\u0163\u0164"+
		"\u0005\u001c\u0000\u0000\u0164=\u0001\u0000\u0000\u0000\u0165\u0166\u0005"+
		"(\u0000\u0000\u0166\u0167\u0003@ \u0000\u0167\u0168\u0005\u001c\u0000"+
		"\u0000\u0168?\u0001\u0000\u0000\u0000\u0169\u016c\u0003B!\u0000\u016a"+
		"\u016b\u0007\u0002\u0000\u0000\u016b\u016d\u0003B!\u0000\u016c\u016a\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016dA\u0001\u0000"+
		"\u0000\u0000\u016e\u0171\u0003D\"\u0000\u016f\u0170\u0007\u0003\u0000"+
		"\u0000\u0170\u0172\u0003D\"\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u0172C\u0001\u0000\u0000\u0000\u0173"+
		"\u0178\u0003F#\u0000\u0174\u0175\u0007\u0004\u0000\u0000\u0175\u0177\u0003"+
		"F#\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000"+
		"\u0000\u0179E\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000"+
		"\u017b\u0180\u0003H$\u0000\u017c\u017d\u0007\u0005\u0000\u0000\u017d\u017f"+
		"\u0003H$\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000"+
		"\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181G\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000"+
		"\u0000\u0183\u0188\u0003J%\u0000\u0184\u0185\u00058\u0000\u0000\u0185"+
		"\u0187\u0003J%\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u018a\u0001"+
		"\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001"+
		"\u0000\u0000\u0000\u0189I\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0005\u000f\u0000\u0000\u018c\u018d\u0003@ \u0000"+
		"\u018d\u018e\u0005\u0010\u0000\u0000\u018e\u0193\u0001\u0000\u0000\u0000"+
		"\u018f\u0193\u0003\f\u0006\u0000\u0190\u0193\u0003&\u0013\u0000\u0191"+
		"\u0193\u0003L&\u0000\u0192\u018b\u0001\u0000\u0000\u0000\u0192\u018f\u0001"+
		"\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0191\u0001"+
		"\u0000\u0000\u0000\u0193K\u0001\u0000\u0000\u0000\u0194\u0195\u00059\u0000"+
		"\u0000\u0195\u0196\u0003H$\u0000\u0196M\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0005:\u0000\u0000\u0198\u0199\u0005;\u0000\u0000\u0199\u019e\u0005"+
		":\u0000\u0000\u019a\u019b\u0005:\u0000\u0000\u019b\u019c\u0005<\u0000"+
		"\u0000\u019c\u019e\u0005:\u0000\u0000\u019d\u0197\u0001\u0000\u0000\u0000"+
		"\u019d\u019a\u0001\u0000\u0000\u0000\u019eO\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0005=\u0000\u0000\u01a0\u01a1\u0005>\u0000\u0000\u01a1Q\u0001"+
		"\u0000\u0000\u0000&V[`cnt\u007f\u0084\u008a\u0092\u009b\u00a9\u00ac\u00bb"+
		"\u00cb\u00d6\u00e6\u00f4\u00f7\u0101\u0104\u0109\u0112\u0118\u011d\u0124"+
		"\u012b\u0132\u014f\u0156\u015f\u016c\u0171\u0178\u0180\u0188\u0192\u019d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}