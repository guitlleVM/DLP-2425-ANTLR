// Generated from c:/Users/uo294193/Desktop/DLP-2425-ANTLR/specifications/Grammar.g4 by ANTLR 4.13.1
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
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		LITENT=39, LITREAL=40, CHAR_LITERAL=41, ID=42, LINE_COMMENT=43, MULTILINE_COMMENT=44, 
		WS=45;
	public static final int
		RULE_program = 0, RULE_structDeclaration = 1, RULE_variableDeclaration = 2, 
		RULE_functionDeclaration = 3, RULE_parameterList = 4, RULE_parameter = 5, 
		RULE_block = 6, RULE_statement = 7, RULE_expressionList = 8, RULE_expression = 9, 
		RULE_type = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "structDeclaration", "variableDeclaration", "functionDeclaration", 
			"parameterList", "parameter", "block", "statement", "expressionList", 
			"expression", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'{'", "':'", "'}'", "'var'", "';'", "'('", "')'", 
			"','", "'print'", "'printsp'", "'println'", "'read'", "'while'", "'if'", 
			"'else'", "'return'", "'='", "'<'", "'>'", "'.'", "'['", "']'", "'!'", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
			"'||'", "'int'", "'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "LITENT", "LITREAL", "CHAR_LITERAL", "ID", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

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
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246354705570L) != 0)) {
				{
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					structDeclaration();
					}
					break;
				case 2:
					{
					setState(23);
					statement();
					}
					break;
				case 3:
					{
					setState(24);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(25);
					functionDeclaration();
					}
					break;
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
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
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(34);
			match(ID);
			setState(35);
			match(T__1);
			{
			setState(36);
			match(ID);
			setState(37);
			match(T__2);
			setState(38);
			type();
			}
			setState(40);
			match(T__3);
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
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(42);
			match(T__4);
			setState(43);
			match(ID);
			setState(44);
			match(T__2);
			setState(45);
			type();
			setState(46);
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
			setState(48);
			match(ID);
			setState(49);
			match(T__6);
			setState(50);
			parameterList();
			setState(51);
			match(T__7);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(52);
				match(T__2);
				setState(53);
				type();
				}
			}

			setState(56);
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
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(58);
				parameter();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(59);
					match(T__8);
					setState(60);
					parameter();
					}
					}
					setState(65);
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
			setState(68);
			match(ID);
			setState(69);
			match(T__2);
			setState(70);
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
			setState(72);
			match(T__1);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246354705568L) != 0)) {
				{
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(73);
					variableDeclaration();
					}
					break;
				case T__6:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__16:
				case T__18:
				case T__23:
				case LITENT:
				case LITREAL:
				case CHAR_LITERAL:
				case ID:
					{
					setState(74);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__3);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__9);
				setState(83);
				expressionList();
				setState(84);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__10);
				setState(87);
				expressionList();
				setState(88);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(T__11);
				setState(91);
				expressionList();
				setState(92);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(T__12);
				setState(95);
				expression(0);
				setState(96);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(T__13);
				setState(99);
				match(T__6);
				setState(100);
				expression(0);
				setState(101);
				match(T__7);
				setState(102);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				match(T__14);
				setState(105);
				match(T__6);
				setState(106);
				expression(0);
				setState(107);
				match(T__7);
				setState(108);
				block();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(109);
					match(T__15);
					setState(110);
					block();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				match(T__16);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246354509952L) != 0)) {
					{
					setState(114);
					expression(0);
					}
				}

				setState(117);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				expression(0);
				setState(119);
				match(T__17);
				setState(120);
				expression(0);
				setState(121);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				expression(0);
				setState(124);
				match(T__5);
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
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246354509952L) != 0)) {
				{
				setState(128);
				expression(0);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(129);
					match(T__8);
					setState(130);
					expression(0);
					}
					}
					setState(135);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TerminalNode LITREAL() { return getToken(GrammarParser.LITREAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(GrammarParser.CHAR_LITERAL, 0); }
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(139);
				match(T__18);
				setState(140);
				type();
				setState(141);
				match(T__19);
				setState(142);
				match(T__6);
				setState(143);
				expression(0);
				setState(144);
				match(T__7);
				}
				break;
			case 2:
				{
				setState(146);
				match(ID);
				setState(147);
				match(T__6);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246354509952L) != 0)) {
					{
					setState(148);
					expression(0);
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(149);
						match(T__8);
						setState(150);
						expression(0);
						}
						}
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(158);
				match(T__7);
				}
				break;
			case 3:
				{
				setState(159);
				match(T__6);
				setState(160);
				expression(0);
				setState(161);
				match(T__7);
				}
				break;
			case 4:
				{
				setState(163);
				match(T__23);
				setState(164);
				expression(11);
				}
				break;
			case 5:
				{
				setState(165);
				match(ID);
				}
				break;
			case 6:
				{
				setState(166);
				match(LITENT);
				}
				break;
			case 7:
				{
				setState(167);
				match(LITREAL);
				}
				break;
			case 8:
				{
				setState(168);
				match(CHAR_LITERAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(172);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(175);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3222798336L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(184);
						match(T__33);
						setState(185);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(187);
						match(T__34);
						setState(188);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(190);
						match(T__20);
						setState(191);
						match(ID);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(193);
						match(T__21);
						setState(194);
						expression(0);
						setState(195);
						match(T__22);
						}
						break;
					}
					} 
				}
				setState(201);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode LITENT() { return getToken(GrammarParser.LITENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(T__37);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(T__21);
				setState(206);
				match(LITENT);
				setState(207);
				match(T__22);
				setState(208);
				type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
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
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"7\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004>\b\u0004\n\u0004\f\u0004A\t\u0004\u0003\u0004C\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006L\b\u0006\n\u0006\f\u0006O\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007p\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007t\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u007f\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0084\b\b\n\b\f\b\u0087\t\b\u0003\b\u0089\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0098\b\t\n\t\f\t\u009b\t\t\u0003\t\u009d\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00aa\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00c6\b\t\n\t\f\t\u00c9\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d3"+
		"\b\n\u0001\n\u0000\u0001\u0012\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0004\u0001\u0000\u0019\u001b\u0001\u0000\u001c"+
		"\u001d\u0002\u0000\u0013\u0014\u001e\u001f\u0001\u0000 !\u00f3\u0000\u001c"+
		"\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004*\u0001\u0000"+
		"\u0000\u0000\u00060\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000"+
		"\nD\u0001\u0000\u0000\u0000\fH\u0001\u0000\u0000\u0000\u000e~\u0001\u0000"+
		"\u0000\u0000\u0010\u0088\u0001\u0000\u0000\u0000\u0012\u00a9\u0001\u0000"+
		"\u0000\u0000\u0014\u00d2\u0001\u0000\u0000\u0000\u0016\u001b\u0003\u0002"+
		"\u0001\u0000\u0017\u001b\u0003\u000e\u0007\u0000\u0018\u001b\u0003\u0004"+
		"\u0002\u0000\u0019\u001b\u0003\u0006\u0003\u0000\u001a\u0016\u0001\u0000"+
		"\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000"+
		"\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000"+
		"\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000\u0000\u0000"+
		"!\"\u0005\u0001\u0000\u0000\"#\u0005*\u0000\u0000#$\u0005\u0002\u0000"+
		"\u0000$%\u0005*\u0000\u0000%&\u0005\u0003\u0000\u0000&\'\u0003\u0014\n"+
		"\u0000\'(\u0001\u0000\u0000\u0000()\u0005\u0004\u0000\u0000)\u0003\u0001"+
		"\u0000\u0000\u0000*+\u0005\u0005\u0000\u0000+,\u0005*\u0000\u0000,-\u0005"+
		"\u0003\u0000\u0000-.\u0003\u0014\n\u0000./\u0005\u0006\u0000\u0000/\u0005"+
		"\u0001\u0000\u0000\u000001\u0005*\u0000\u000012\u0005\u0007\u0000\u0000"+
		"23\u0003\b\u0004\u000036\u0005\b\u0000\u000045\u0005\u0003\u0000\u0000"+
		"57\u0003\u0014\n\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0003\f\u0006\u00009\u0007\u0001\u0000\u0000"+
		"\u0000:?\u0003\n\u0005\u0000;<\u0005\t\u0000\u0000<>\u0003\n\u0005\u0000"+
		"=;\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000B:\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\t\u0001"+
		"\u0000\u0000\u0000DE\u0005*\u0000\u0000EF\u0005\u0003\u0000\u0000FG\u0003"+
		"\u0014\n\u0000G\u000b\u0001\u0000\u0000\u0000HM\u0005\u0002\u0000\u0000"+
		"IL\u0003\u0004\u0002\u0000JL\u0003\u000e\u0007\u0000KI\u0001\u0000\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0004\u0000\u0000Q\r\u0001\u0000\u0000\u0000"+
		"RS\u0005\n\u0000\u0000ST\u0003\u0010\b\u0000TU\u0005\u0006\u0000\u0000"+
		"U\u007f\u0001\u0000\u0000\u0000VW\u0005\u000b\u0000\u0000WX\u0003\u0010"+
		"\b\u0000XY\u0005\u0006\u0000\u0000Y\u007f\u0001\u0000\u0000\u0000Z[\u0005"+
		"\f\u0000\u0000[\\\u0003\u0010\b\u0000\\]\u0005\u0006\u0000\u0000]\u007f"+
		"\u0001\u0000\u0000\u0000^_\u0005\r\u0000\u0000_`\u0003\u0012\t\u0000`"+
		"a\u0005\u0006\u0000\u0000a\u007f\u0001\u0000\u0000\u0000bc\u0005\u000e"+
		"\u0000\u0000cd\u0005\u0007\u0000\u0000de\u0003\u0012\t\u0000ef\u0005\b"+
		"\u0000\u0000fg\u0003\f\u0006\u0000g\u007f\u0001\u0000\u0000\u0000hi\u0005"+
		"\u000f\u0000\u0000ij\u0005\u0007\u0000\u0000jk\u0003\u0012\t\u0000kl\u0005"+
		"\b\u0000\u0000lo\u0003\f\u0006\u0000mn\u0005\u0010\u0000\u0000np\u0003"+
		"\f\u0006\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u007f"+
		"\u0001\u0000\u0000\u0000qs\u0005\u0011\u0000\u0000rt\u0003\u0012\t\u0000"+
		"sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000u\u007f\u0005\u0006\u0000\u0000vw\u0003\u0012\t\u0000wx\u0005\u0012"+
		"\u0000\u0000xy\u0003\u0012\t\u0000yz\u0005\u0006\u0000\u0000z\u007f\u0001"+
		"\u0000\u0000\u0000{|\u0003\u0012\t\u0000|}\u0005\u0006\u0000\u0000}\u007f"+
		"\u0001\u0000\u0000\u0000~R\u0001\u0000\u0000\u0000~V\u0001\u0000\u0000"+
		"\u0000~Z\u0001\u0000\u0000\u0000~^\u0001\u0000\u0000\u0000~b\u0001\u0000"+
		"\u0000\u0000~h\u0001\u0000\u0000\u0000~q\u0001\u0000\u0000\u0000~v\u0001"+
		"\u0000\u0000\u0000~{\u0001\u0000\u0000\u0000\u007f\u000f\u0001\u0000\u0000"+
		"\u0000\u0080\u0085\u0003\u0012\t\u0000\u0081\u0082\u0005\t\u0000\u0000"+
		"\u0082\u0084\u0003\u0012\t\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u0080\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u0011\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0006\t\uffff\uffff\u0000\u008b\u008c\u0005\u0013\u0000\u0000\u008c"+
		"\u008d\u0003\u0014\n\u0000\u008d\u008e\u0005\u0014\u0000\u0000\u008e\u008f"+
		"\u0005\u0007\u0000\u0000\u008f\u0090\u0003\u0012\t\u0000\u0090\u0091\u0005"+
		"\b\u0000\u0000\u0091\u00aa\u0001\u0000\u0000\u0000\u0092\u0093\u0005*"+
		"\u0000\u0000\u0093\u009c\u0005\u0007\u0000\u0000\u0094\u0099\u0003\u0012"+
		"\t\u0000\u0095\u0096\u0005\t\u0000\u0000\u0096\u0098\u0003\u0012\t\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009c\u0094\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00aa\u0005\b\u0000\u0000\u009f"+
		"\u00a0\u0005\u0007\u0000\u0000\u00a0\u00a1\u0003\u0012\t\u0000\u00a1\u00a2"+
		"\u0005\b\u0000\u0000\u00a2\u00aa\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0018\u0000\u0000\u00a4\u00aa\u0003\u0012\t\u000b\u00a5\u00aa\u0005*"+
		"\u0000\u0000\u00a6\u00aa\u0005\'\u0000\u0000\u00a7\u00aa\u0005(\u0000"+
		"\u0000\u00a8\u00aa\u0005)\u0000\u0000\u00a9\u008a\u0001\u0000\u0000\u0000"+
		"\u00a9\u0092\u0001\u0000\u0000\u0000\u00a9\u009f\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a3\u0001\u0000\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a6\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00c7\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\n\n\u0000\u0000\u00ac\u00ad\u0007\u0000\u0000\u0000\u00ad"+
		"\u00c6\u0003\u0012\t\u000b\u00ae\u00af\n\t\u0000\u0000\u00af\u00b0\u0007"+
		"\u0001\u0000\u0000\u00b0\u00c6\u0003\u0012\t\n\u00b1\u00b2\n\b\u0000\u0000"+
		"\u00b2\u00b3\u0007\u0002\u0000\u0000\u00b3\u00c6\u0003\u0012\t\t\u00b4"+
		"\u00b5\n\u0007\u0000\u0000\u00b5\u00b6\u0007\u0003\u0000\u0000\u00b6\u00c6"+
		"\u0003\u0012\t\b\u00b7\u00b8\n\u0006\u0000\u0000\u00b8\u00b9\u0005\"\u0000"+
		"\u0000\u00b9\u00c6\u0003\u0012\t\u0007\u00ba\u00bb\n\u0005\u0000\u0000"+
		"\u00bb\u00bc\u0005#\u0000\u0000\u00bc\u00c6\u0003\u0012\t\u0006\u00bd"+
		"\u00be\n\u000f\u0000\u0000\u00be\u00bf\u0005\u0015\u0000\u0000\u00bf\u00c6"+
		"\u0005*\u0000\u0000\u00c0\u00c1\n\u000e\u0000\u0000\u00c1\u00c2\u0005"+
		"\u0016\u0000\u0000\u00c2\u00c3\u0003\u0012\t\u0000\u00c3\u00c4\u0005\u0017"+
		"\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00ab\u0001\u0000"+
		"\u0000\u0000\u00c5\u00ae\u0001\u0000\u0000\u0000\u00c5\u00b1\u0001\u0000"+
		"\u0000\u0000\u00c5\u00b4\u0001\u0000\u0000\u0000\u00c5\u00b7\u0001\u0000"+
		"\u0000\u0000\u00c5\u00ba\u0001\u0000\u0000\u0000\u00c5\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u0013\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00d3\u0005$\u0000\u0000\u00cb\u00d3\u0005%\u0000\u0000"+
		"\u00cc\u00d3\u0005&\u0000\u0000\u00cd\u00ce\u0005\u0016\u0000\u0000\u00ce"+
		"\u00cf\u0005\'\u0000\u0000\u00cf\u00d0\u0005\u0017\u0000\u0000\u00d0\u00d3"+
		"\u0003\u0014\n\u0000\u00d1\u00d3\u0005*\u0000\u0000\u00d2\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d2\u00cb\u0001\u0000\u0000\u0000\u00d2\u00cc\u0001"+
		"\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u0015\u0001\u0000\u0000\u0000\u0012\u001a\u001c"+
		"6?BKMos~\u0085\u0088\u0099\u009c\u00a9\u00c5\u00c7\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}