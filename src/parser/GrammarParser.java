// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, LITENT=35, LITREAL=36, CHAR_LITERAL=37, 
		ID=38, LINE_COMMENT=39, MULTILINE_COMMENT=40, WS=41;
	public static final int
		RULE_program = 0, RULE_structDeclaration = 1, RULE_variableDeclaration = 2, 
		RULE_functionDeclaration = 3, RULE_parameterList = 4, RULE_parameter = 5, 
		RULE_block = 6, RULE_statement = 7, RULE_expressionList = 8, RULE_expression = 9, 
		RULE_expressionSuffix = 10, RULE_functionCall = 11, RULE_castExpression = 12, 
		RULE_argumentList = 13, RULE_primary = 14, RULE_fieldDeclaration = 15, 
		RULE_type = 16, RULE_primitiveType = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "structDeclaration", "variableDeclaration", "functionDeclaration", 
			"parameterList", "parameter", "block", "statement", "expressionList", 
			"expression", "expressionSuffix", "functionCall", "castExpression", "argumentList", 
			"primary", "fieldDeclaration", "type", "primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'{'", "'}'", "'var'", "'('", "')'", "':'", "','", 
			"'print'", "';'", "'printsp'", "'println'", "'read'", "'='", "'!'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'&&'", "'||'", "'.'", "'['", "']'", "'int'", "'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "LITENT", 
			"LITREAL", "CHAR_LITERAL", "ID", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 515398220338L) != 0) {
				{
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(36);
					structDeclaration();
					}
					break;
				case 2:
					{
					setState(37);
					statement();
					}
					break;
				case 3:
					{
					setState(38);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(39);
					functionDeclaration();
					}
					break;
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(EOF);
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
	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			match(ID);
			setState(49);
			match(T__1);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(50);
				fieldDeclaration();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__2);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__3);
			setState(59);
			fieldDeclaration();
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
			setState(62);
			match(T__4);
			setState(63);
			parameterList();
			setState(64);
			match(T__5);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(65);
				match(T__6);
				setState(66);
				type();
				}
			}

			setState(69);
			block();
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(71);
				parameter();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(72);
					match(T__7);
					setState(73);
					parameter();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(82);
			match(T__6);
			setState(83);
			type();
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
	public static class BlockContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__1);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 515398220336L) != 0) {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(86);
					variableDeclaration();
					}
					break;
				case T__4:
				case T__8:
				case T__10:
				case T__11:
				case T__12:
				case T__14:
				case T__20:
				case LITENT:
				case LITREAL:
				case CHAR_LITERAL:
				case ID:
					{
					setState(87);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__2);
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__8);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 515398205472L) != 0) {
					{
					setState(96);
					expressionList();
					}
				}

				setState(99);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__10);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 515398205472L) != 0) {
					{
					setState(101);
					expressionList();
					}
				}

				setState(104);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(T__11);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 515398205472L) != 0) {
					{
					setState(106);
					expressionList();
					}
				}

				setState(109);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(T__12);
				setState(111);
				expression(0);
				setState(112);
				match(T__9);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				expression(0);
				setState(115);
				match(T__13);
				setState(116);
				expression(0);
				setState(117);
				match(T__9);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				expression(0);
				setState(120);
				match(T__9);
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			expression(0);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(125);
				match(T__7);
				setState(126);
				expression(0);
				}
				}
				setState(131);
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
	public static class ExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionSuffixContext> expressionSuffix() {
			return getRuleContexts(ExpressionSuffixContext.class);
		}
		public ExpressionSuffixContext expressionSuffix(int i) {
			return getRuleContext(ExpressionSuffixContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(133);
				castExpression();
				}
				break;
			case LITENT:
			case LITREAL:
			case CHAR_LITERAL:
			case ID:
				{
				setState(134);
				primary();
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(135);
						expressionSuffix();
						}
						} 
					}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case T__4:
				{
				setState(141);
				match(T__4);
				setState(142);
				expression(0);
				setState(143);
				match(T__5);
				}
				break;
			case T__14:
				{
				setState(145);
				match(T__14);
				setState(146);
				expression(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(150);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(151);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(153);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(156);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						match(T__26);
						setState(163);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(165);
						match(T__27);
						setState(166);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSuffixContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSuffix; }
	}

	public final ExpressionSuffixContext expressionSuffix() throws RecognitionException {
		ExpressionSuffixContext _localctx = new ExpressionSuffixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionSuffix);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__28);
				setState(173);
				match(ID);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__29);
				setState(175);
				expression(0);
				setState(176);
				match(T__30);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				functionCall();
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
	public static class FunctionCallContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__4);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 515398205472L) != 0) {
				{
				setState(182);
				argumentList();
				}
			}

			setState(185);
			match(T__5);
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
	public static class CastExpressionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__20);
			setState(188);
			type();
			setState(189);
			match(T__21);
			setState(190);
			match(T__4);
			setState(191);
			expression(0);
			setState(192);
			match(T__5);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			expression(0);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(195);
				match(T__7);
				setState(196);
				expression(0);
				}
				}
				setState(201);
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
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(GrammarParser.CHAR_LITERAL, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0) ) {
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
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LITENT() { return getTokens(GrammarParser.LITENT); }
		public TerminalNode LITENT(int i) {
			return getToken(GrammarParser.LITENT, i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fieldDeclaration);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(ID);
				setState(205);
				match(T__6);
				setState(206);
				type();
				setState(207);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(ID);
				setState(210);
				match(T__6);
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(211);
					match(T__29);
					setState(212);
					match(LITENT);
					setState(213);
					match(T__30);
					}
					}
					setState(216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__29 );
				setState(218);
				type();
				setState(219);
				match(T__9);
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
	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				primitiveType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(ID);
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
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u00e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003D\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004K\b\u0004"+
		"\n\u0004\f\u0004N\t\u0004\u0003\u0004P\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"Y\b\u0006\n\u0006\f\u0006\\\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007g\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"l\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007{\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u0080\b\b\n\b\f\b\u0083\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u0089\b\t\n\t\f\t\u008c\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u0094\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a8\b\t\n\t\f\t\u00ab\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b4\b\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00b8\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00c6\b\r\n\r\f\r\u00c9\t\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00d7\b\u000f\u000b\u000f"+
		"\f\u000f\u00d8\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00de\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00e2\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0000\u0001\u0012\u0012\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0006"+
		"\u0001\u0000\u0010\u0012\u0001\u0000\u0013\u0014\u0001\u0000\u0015\u0018"+
		"\u0001\u0000\u0019\u001a\u0001\u0000#&\u0001\u0000 \"\u00f7\u0000*\u0001"+
		"\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000"+
		"\u0000\u0006=\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000\nQ\u0001"+
		"\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000ez\u0001\u0000\u0000"+
		"\u0000\u0010|\u0001\u0000\u0000\u0000\u0012\u0093\u0001\u0000\u0000\u0000"+
		"\u0014\u00b3\u0001\u0000\u0000\u0000\u0016\u00b5\u0001\u0000\u0000\u0000"+
		"\u0018\u00bb\u0001\u0000\u0000\u0000\u001a\u00c2\u0001\u0000\u0000\u0000"+
		"\u001c\u00ca\u0001\u0000\u0000\u0000\u001e\u00dd\u0001\u0000\u0000\u0000"+
		" \u00e1\u0001\u0000\u0000\u0000\"\u00e3\u0001\u0000\u0000\u0000$)\u0003"+
		"\u0002\u0001\u0000%)\u0003\u000e\u0007\u0000&)\u0003\u0004\u0002\u0000"+
		"\')\u0003\u0006\u0003\u0000($\u0001\u0000\u0000\u0000(%\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001"+
		".\u0001\u0001\u0000\u0000\u0000/0\u0005\u0001\u0000\u000001\u0005&\u0000"+
		"\u000015\u0005\u0002\u0000\u000024\u0003\u001e\u000f\u000032\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"89\u0005\u0003\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u0005\u0004"+
		"\u0000\u0000;<\u0003\u001e\u000f\u0000<\u0005\u0001\u0000\u0000\u0000"+
		"=>\u0005&\u0000\u0000>?\u0005\u0005\u0000\u0000?@\u0003\b\u0004\u0000"+
		"@C\u0005\u0006\u0000\u0000AB\u0005\u0007\u0000\u0000BD\u0003 \u0010\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0003\f\u0006\u0000F\u0007\u0001\u0000\u0000\u0000GL\u0003\n"+
		"\u0005\u0000HI\u0005\b\u0000\u0000IK\u0003\n\u0005\u0000JH\u0001\u0000"+
		"\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"OG\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\t\u0001\u0000\u0000"+
		"\u0000QR\u0005&\u0000\u0000RS\u0005\u0007\u0000\u0000ST\u0003 \u0010\u0000"+
		"T\u000b\u0001\u0000\u0000\u0000UZ\u0005\u0002\u0000\u0000VY\u0003\u0004"+
		"\u0002\u0000WY\u0003\u000e\u0007\u0000XV\u0001\u0000\u0000\u0000XW\u0001"+
		"\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000]^\u0005\u0003\u0000\u0000^\r\u0001\u0000\u0000\u0000_a\u0005\t"+
		"\u0000\u0000`b\u0003\u0010\b\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000c{\u0005\n\u0000\u0000df\u0005\u000b"+
		"\u0000\u0000eg\u0003\u0010\b\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h{\u0005\n\u0000\u0000ik\u0005\f"+
		"\u0000\u0000jl\u0003\u0010\b\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m{\u0005\n\u0000\u0000no\u0005\r"+
		"\u0000\u0000op\u0003\u0012\t\u0000pq\u0005\n\u0000\u0000q{\u0001\u0000"+
		"\u0000\u0000rs\u0003\u0012\t\u0000st\u0005\u000e\u0000\u0000tu\u0003\u0012"+
		"\t\u0000uv\u0005\n\u0000\u0000v{\u0001\u0000\u0000\u0000wx\u0003\u0012"+
		"\t\u0000xy\u0005\n\u0000\u0000y{\u0001\u0000\u0000\u0000z_\u0001\u0000"+
		"\u0000\u0000zd\u0001\u0000\u0000\u0000zi\u0001\u0000\u0000\u0000zn\u0001"+
		"\u0000\u0000\u0000zr\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000"+
		"{\u000f\u0001\u0000\u0000\u0000|\u0081\u0003\u0012\t\u0000}~\u0005\b\u0000"+
		"\u0000~\u0080\u0003\u0012\t\u0000\u007f}\u0001\u0000\u0000\u0000\u0080"+
		"\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0011\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0006\t\uffff\uffff\u0000\u0085"+
		"\u0094\u0003\u0018\f\u0000\u0086\u008a\u0003\u001c\u000e\u0000\u0087\u0089"+
		"\u0003\u0014\n\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u0094\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005\u0005\u0000\u0000\u008e\u008f\u0003"+
		"\u0012\t\u0000\u008f\u0090\u0005\u0006\u0000\u0000\u0090\u0094\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005\u000f\u0000\u0000\u0092\u0094\u0003\u0012"+
		"\t\u0007\u0093\u0084\u0001\u0000\u0000\u0000\u0093\u0086\u0001\u0000\u0000"+
		"\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u00a9\u0001\u0000\u0000\u0000\u0095\u0096\n\u0006\u0000\u0000"+
		"\u0096\u0097\u0007\u0000\u0000\u0000\u0097\u00a8\u0003\u0012\t\u0007\u0098"+
		"\u0099\n\u0005\u0000\u0000\u0099\u009a\u0007\u0001\u0000\u0000\u009a\u00a8"+
		"\u0003\u0012\t\u0006\u009b\u009c\n\u0004\u0000\u0000\u009c\u009d\u0007"+
		"\u0002\u0000\u0000\u009d\u00a8\u0003\u0012\t\u0005\u009e\u009f\n\u0003"+
		"\u0000\u0000\u009f\u00a0\u0007\u0003\u0000\u0000\u00a0\u00a8\u0003\u0012"+
		"\t\u0004\u00a1\u00a2\n\u0002\u0000\u0000\u00a2\u00a3\u0005\u001b\u0000"+
		"\u0000\u00a3\u00a8\u0003\u0012\t\u0003\u00a4\u00a5\n\u0001\u0000\u0000"+
		"\u00a5\u00a6\u0005\u001c\u0000\u0000\u00a6\u00a8\u0003\u0012\t\u0002\u00a7"+
		"\u0095\u0001\u0000\u0000\u0000\u00a7\u0098\u0001\u0000\u0000\u0000\u00a7"+
		"\u009b\u0001\u0000\u0000\u0000\u00a7\u009e\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u001d\u0000\u0000\u00ad"+
		"\u00b4\u0005&\u0000\u0000\u00ae\u00af\u0005\u001e\u0000\u0000\u00af\u00b0"+
		"\u0003\u0012\t\u0000\u00b0\u00b1\u0005\u001f\u0000\u0000\u00b1\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0003\u0016\u000b\u0000\u00b3\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u0015\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005"+
		"\u0005\u0000\u0000\u00b6\u00b8\u0003\u001a\r\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005\u0006\u0000\u0000\u00ba\u0017\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0015\u0000\u0000\u00bc\u00bd\u0003 \u0010"+
		"\u0000\u00bd\u00be\u0005\u0016\u0000\u0000\u00be\u00bf\u0005\u0005\u0000"+
		"\u0000\u00bf\u00c0\u0003\u0012\t\u0000\u00c0\u00c1\u0005\u0006\u0000\u0000"+
		"\u00c1\u0019\u0001\u0000\u0000\u0000\u00c2\u00c7\u0003\u0012\t\u0000\u00c3"+
		"\u00c4\u0005\b\u0000\u0000\u00c4\u00c6\u0003\u0012\t\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u001b"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0007\u0004\u0000\u0000\u00cb\u001d\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005&\u0000\u0000\u00cd\u00ce\u0005\u0007\u0000\u0000\u00ce\u00cf\u0003"+
		" \u0010\u0000\u00cf\u00d0\u0005\n\u0000\u0000\u00d0\u00de\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005&\u0000\u0000\u00d2\u00d6\u0005\u0007\u0000"+
		"\u0000\u00d3\u00d4\u0005\u001e\u0000\u0000\u00d4\u00d5\u0005#\u0000\u0000"+
		"\u00d5\u00d7\u0005\u001f\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0003 \u0010\u0000\u00db\u00dc\u0005\n\u0000\u0000\u00dc"+
		"\u00de\u0001\u0000\u0000\u0000\u00dd\u00cc\u0001\u0000\u0000\u0000\u00dd"+
		"\u00d1\u0001\u0000\u0000\u0000\u00de\u001f\u0001\u0000\u0000\u0000\u00df"+
		"\u00e2\u0003\"\u0011\u0000\u00e0\u00e2\u0005&\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2!\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0007\u0005\u0000\u0000\u00e4#\u0001\u0000"+
		"\u0000\u0000\u0017(*5CLOXZafkz\u0081\u008a\u0093\u00a7\u00a9\u00b3\u00b7"+
		"\u00c7\u00d8\u00dd\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}