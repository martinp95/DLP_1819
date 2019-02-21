// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		IDENT=39, INT_CONSTANT=40, REAL_CONSTANT=41, CHAR_CONSTANT=42, LINE_COMMENT=43, 
		COMENTARIO_MULTILINEA=44, WHITESPACE=45;
	public static final int
		RULE_start = 0, RULE_definiciones = 1, RULE_definicion = 2, RULE_defFuncion = 3, 
		RULE_parametros = 4, RULE_parametro = 5, RULE_variables = 6, RULE_sentencias = 7, 
		RULE_sentencia = 8, RULE_parametrosOpt = 9, RULE_expr = 10, RULE_defStruct = 11, 
		RULE_campos = 12, RULE_campo = 13, RULE_defVariable = 14, RULE_tipo = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definiciones", "definicion", "defFuncion", "parametros", "parametro", 
			"variables", "sentencias", "sentencia", "parametrosOpt", "expr", "defStruct", 
			"campos", "campo", "defVariable", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "':'", "','", "'print'", "';'", "'printsp'", 
			"'println'", "'read'", "'='", "'if'", "'else'", "'while'", "'return'", 
			"'cast'", "'<'", "'>'", "'*'", "'/'", "'+'", "'-'", "'<='", "'>='", "'=='", 
			"'!='", "'!'", "'&&'", "'||'", "'['", "']'", "'.'", "'struct'", "'var'", 
			"'int'", "'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IDENT", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"LINE_COMMENT", "COMENTARIO_MULTILINEA", "WHITESPACE"
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

	public static class StartContext extends ParserRuleContext {
		public DefinicionesContext definiciones() {
			return getRuleContext(DefinicionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			definiciones(0);
			setState(33);
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

	public static class DefinicionesContext extends ParserRuleContext {
		public DefinicionesContext definiciones() {
			return getRuleContext(DefinicionesContext.class,0);
		}
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public DefinicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definiciones; }
	}

	public final DefinicionesContext definiciones() throws RecognitionException {
		return definiciones(0);
	}

	private DefinicionesContext definiciones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DefinicionesContext _localctx = new DefinicionesContext(_ctx, _parentState);
		DefinicionesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_definiciones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DefinicionesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_definiciones);
					setState(36);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(37);
					definicion();
					}
					} 
				}
				setState(42);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DefinicionContext extends ParserRuleContext {
		public DefVariableContext defVariable() {
			return getRuleContext(DefVariableContext.class,0);
		}
		public DefStructContext defStruct() {
			return getRuleContext(DefStructContext.class,0);
		}
		public DefFuncionContext defFuncion() {
			return getRuleContext(DefFuncionContext.class,0);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definicion);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				defVariable();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				defStruct();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				defFuncion();
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

	public static class DefFuncionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFuncion; }
	}

	public final DefFuncionContext defFuncion() throws RecognitionException {
		DefFuncionContext _localctx = new DefFuncionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defFuncion);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(IDENT);
				setState(49);
				match(T__0);
				setState(50);
				parametros(0);
				setState(51);
				match(T__1);
				setState(52);
				match(T__2);
				setState(53);
				variables(0);
				setState(54);
				sentencias(0);
				setState(55);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(IDENT);
				setState(58);
				match(T__0);
				setState(59);
				parametros(0);
				setState(60);
				match(T__1);
				setState(61);
				match(T__4);
				setState(62);
				tipo();
				setState(63);
				match(T__2);
				setState(64);
				variables(0);
				setState(65);
				sentencias(0);
				setState(66);
				match(T__3);
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

	public static class ParametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		return parametros(0);
	}

	private ParametrosContext parametros(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParametrosContext _localctx = new ParametrosContext(_ctx, _parentState);
		ParametrosContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_parametros, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(71);
				parametro();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParametrosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parametros);
					setState(74);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(75);
					match(T__5);
					setState(76);
					parametro();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IDENT);
			setState(83);
			match(T__4);
			setState(84);
			tipo();
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

	public static class VariablesContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public DefVariableContext defVariable() {
			return getRuleContext(DefVariableContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		return variables(0);
	}

	private VariablesContext variables(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariablesContext _localctx = new VariablesContext(_ctx, _parentState);
		VariablesContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariablesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variables);
					setState(87);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(88);
					defVariable();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class SentenciasContext extends ParserRuleContext {
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		return sentencias(0);
	}

	private SentenciasContext sentencias(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SentenciasContext _localctx = new SentenciasContext(_ctx, _parentState);
		SentenciasContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_sentencias, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SentenciasContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sentencias);
					setState(95);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(96);
					sentencia();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class SentenciaContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ParametrosOptContext parametrosOpt() {
			return getRuleContext(ParametrosOptContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentencia);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__6);
				setState(103);
				expr(0);
				setState(104);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(T__8);
				setState(107);
				expr(0);
				setState(108);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(T__9);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__27) | (1L << IDENT) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(111);
					expr(0);
					}
				}

				setState(114);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(T__10);
				setState(116);
				expr(0);
				setState(117);
				match(T__7);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				expr(0);
				setState(120);
				match(T__11);
				setState(121);
				expr(0);
				setState(122);
				match(T__7);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(T__12);
				setState(125);
				match(T__0);
				setState(126);
				expr(0);
				setState(127);
				match(T__1);
				setState(128);
				match(T__2);
				setState(129);
				sentencias(0);
				setState(130);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				match(T__12);
				setState(133);
				match(T__0);
				setState(134);
				expr(0);
				setState(135);
				match(T__1);
				setState(136);
				match(T__2);
				setState(137);
				sentencias(0);
				setState(138);
				match(T__3);
				setState(139);
				match(T__13);
				setState(140);
				match(T__2);
				setState(141);
				sentencias(0);
				setState(142);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				match(T__14);
				setState(145);
				match(T__0);
				setState(146);
				expr(0);
				setState(147);
				match(T__1);
				setState(148);
				match(T__2);
				setState(149);
				sentencias(0);
				setState(150);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(152);
				match(IDENT);
				setState(153);
				match(T__0);
				setState(154);
				parametrosOpt(0);
				setState(155);
				match(T__1);
				setState(156);
				match(T__7);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
				match(T__15);
				setState(159);
				expr(0);
				setState(160);
				match(T__7);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(162);
				match(T__15);
				setState(163);
				match(T__7);
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

	public static class ParametrosOptContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParametrosOptContext parametrosOpt() {
			return getRuleContext(ParametrosOptContext.class,0);
		}
		public ParametrosOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosOpt; }
	}

	public final ParametrosOptContext parametrosOpt() throws RecognitionException {
		return parametrosOpt(0);
	}

	private ParametrosOptContext parametrosOpt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParametrosOptContext _localctx = new ParametrosOptContext(_ctx, _parentState);
		ParametrosOptContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_parametrosOpt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(167);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParametrosOptContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parametrosOpt);
					setState(170);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(171);
					match(T__5);
					setState(172);
					expr(0);
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(GrammarParser.REAL_CONSTANT, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(GrammarParser.CHAR_CONSTANT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametrosOptContext parametrosOpt() {
			return getRuleContext(ParametrosOptContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(179);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(180);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(181);
				match(IDENT);
				}
				break;
			case 4:
				{
				setState(182);
				match(CHAR_CONSTANT);
				}
				break;
			case 5:
				{
				setState(183);
				match(T__0);
				setState(184);
				expr(0);
				setState(185);
				match(T__1);
				}
				break;
			case 6:
				{
				setState(187);
				match(T__16);
				setState(188);
				match(T__17);
				setState(189);
				tipo();
				setState(190);
				match(T__18);
				setState(191);
				match(T__0);
				setState(192);
				expr(0);
				setState(193);
				match(T__1);
				}
				break;
			case 7:
				{
				setState(195);
				match(T__27);
				setState(196);
				expr(6);
				}
				break;
			case 8:
				{
				setState(197);
				match(IDENT);
				setState(198);
				match(T__0);
				setState(199);
				parametrosOpt(0);
				setState(200);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(205);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(208);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(211);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(214);
						match(T__28);
						setState(215);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(217);
						match(T__29);
						setState(218);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(220);
						match(T__30);
						setState(221);
						expr(0);
						setState(222);
						match(T__31);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(225);
						match(T__32);
						setState(226);
						match(IDENT);
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class DefStructContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public CamposContext campos() {
			return getRuleContext(CamposContext.class,0);
		}
		public DefStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStruct; }
	}

	public final DefStructContext defStruct() throws RecognitionException {
		DefStructContext _localctx = new DefStructContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__33);
			setState(233);
			match(IDENT);
			setState(234);
			match(T__2);
			setState(235);
			campos(0);
			setState(236);
			match(T__3);
			setState(237);
			match(T__7);
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

	public static class CamposContext extends ParserRuleContext {
		public CampoContext campo() {
			return getRuleContext(CampoContext.class,0);
		}
		public CamposContext campos() {
			return getRuleContext(CamposContext.class,0);
		}
		public CamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos; }
	}

	public final CamposContext campos() throws RecognitionException {
		return campos(0);
	}

	private CamposContext campos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CamposContext _localctx = new CamposContext(_ctx, _parentState);
		CamposContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_campos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(240);
			campo();
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CamposContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_campos);
					setState(242);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(243);
					campo();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class CampoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IDENT);
			setState(250);
			match(T__4);
			setState(251);
			tipo();
			setState(252);
			match(T__7);
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

	public static class DefVariableContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVariable; }
	}

	public final DefVariableContext defVariable() throws RecognitionException {
		DefVariableContext _localctx = new DefVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__34);
			setState(255);
			match(IDENT);
			setState(256);
			match(T__4);
			setState(257);
			tipo();
			setState(258);
			match(T__7);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(T__37);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				match(IDENT);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				match(T__30);
				setState(265);
				match(INT_CONSTANT);
				setState(266);
				match(T__31);
				setState(267);
				tipo();
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
		case 1:
			return definiciones_sempred((DefinicionesContext)_localctx, predIndex);
		case 4:
			return parametros_sempred((ParametrosContext)_localctx, predIndex);
		case 6:
			return variables_sempred((VariablesContext)_localctx, predIndex);
		case 7:
			return sentencias_sempred((SentenciasContext)_localctx, predIndex);
		case 9:
			return parametrosOpt_sempred((ParametrosOptContext)_localctx, predIndex);
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 12:
			return campos_sempred((CamposContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean definiciones_sempred(DefinicionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parametros_sempred(ParametrosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean variables_sempred(VariablesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sentencias_sempred(SentenciasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parametrosOpt_sempred(ParametrosOptContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean campos_sempred(CamposContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5G\n\5\3\6\3\6\5\6K\n\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\t\3\t\3\t\7\td\n\t\f"+
		"\t\16\tg\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ns\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a7\n\n\3\13"+
		"\3\13\5\13\u00ab\n\13\3\13\3\13\3\13\7\13\u00b0\n\13\f\13\16\13\u00b3"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cd\n\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00e6\n\f\f\f\16\f\u00e9\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00f7\n\16\f\16\16\16\u00fa\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u010f\n\21\3\21\2\t\4\n\16\20\24\26\32\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\5\3\2\26\27\3\2\30\31\4\2\24\25\32\35\2"+
		"\u0128\2\"\3\2\2\2\4%\3\2\2\2\6\60\3\2\2\2\bF\3\2\2\2\nJ\3\2\2\2\fT\3"+
		"\2\2\2\16X\3\2\2\2\20`\3\2\2\2\22\u00a6\3\2\2\2\24\u00aa\3\2\2\2\26\u00cc"+
		"\3\2\2\2\30\u00ea\3\2\2\2\32\u00f1\3\2\2\2\34\u00fb\3\2\2\2\36\u0100\3"+
		"\2\2\2 \u010e\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%*\b\3\1\2&\'\f\3"+
		"\2\2\')\5\6\4\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,*\3"+
		"\2\2\2-\61\5\36\20\2.\61\5\30\r\2/\61\5\b\5\2\60-\3\2\2\2\60.\3\2\2\2"+
		"\60/\3\2\2\2\61\7\3\2\2\2\62\63\7)\2\2\63\64\7\3\2\2\64\65\5\n\6\2\65"+
		"\66\7\4\2\2\66\67\7\5\2\2\678\5\16\b\289\5\20\t\29:\7\6\2\2:G\3\2\2\2"+
		";<\7)\2\2<=\7\3\2\2=>\5\n\6\2>?\7\4\2\2?@\7\7\2\2@A\5 \21\2AB\7\5\2\2"+
		"BC\5\16\b\2CD\5\20\t\2DE\7\6\2\2EG\3\2\2\2F\62\3\2\2\2F;\3\2\2\2G\t\3"+
		"\2\2\2HK\b\6\1\2IK\5\f\7\2JH\3\2\2\2JI\3\2\2\2KQ\3\2\2\2LM\f\3\2\2MN\7"+
		"\b\2\2NP\5\f\7\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\13\3\2\2\2S"+
		"Q\3\2\2\2TU\7)\2\2UV\7\7\2\2VW\5 \21\2W\r\3\2\2\2X]\b\b\1\2YZ\f\3\2\2"+
		"Z\\\5\36\20\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\17\3\2\2\2_]\3"+
		"\2\2\2`e\b\t\1\2ab\f\3\2\2bd\5\22\n\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef"+
		"\3\2\2\2f\21\3\2\2\2ge\3\2\2\2hi\7\t\2\2ij\5\26\f\2jk\7\n\2\2k\u00a7\3"+
		"\2\2\2lm\7\13\2\2mn\5\26\f\2no\7\n\2\2o\u00a7\3\2\2\2pr\7\f\2\2qs\5\26"+
		"\f\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2t\u00a7\7\n\2\2uv\7\r\2\2vw\5\26\f\2"+
		"wx\7\n\2\2x\u00a7\3\2\2\2yz\5\26\f\2z{\7\16\2\2{|\5\26\f\2|}\7\n\2\2}"+
		"\u00a7\3\2\2\2~\177\7\17\2\2\177\u0080\7\3\2\2\u0080\u0081\5\26\f\2\u0081"+
		"\u0082\7\4\2\2\u0082\u0083\7\5\2\2\u0083\u0084\5\20\t\2\u0084\u0085\7"+
		"\6\2\2\u0085\u00a7\3\2\2\2\u0086\u0087\7\17\2\2\u0087\u0088\7\3\2\2\u0088"+
		"\u0089\5\26\f\2\u0089\u008a\7\4\2\2\u008a\u008b\7\5\2\2\u008b\u008c\5"+
		"\20\t\2\u008c\u008d\7\6\2\2\u008d\u008e\7\20\2\2\u008e\u008f\7\5\2\2\u008f"+
		"\u0090\5\20\t\2\u0090\u0091\7\6\2\2\u0091\u00a7\3\2\2\2\u0092\u0093\7"+
		"\21\2\2\u0093\u0094\7\3\2\2\u0094\u0095\5\26\f\2\u0095\u0096\7\4\2\2\u0096"+
		"\u0097\7\5\2\2\u0097\u0098\5\20\t\2\u0098\u0099\7\6\2\2\u0099\u00a7\3"+
		"\2\2\2\u009a\u009b\7)\2\2\u009b\u009c\7\3\2\2\u009c\u009d\5\24\13\2\u009d"+
		"\u009e\7\4\2\2\u009e\u009f\7\n\2\2\u009f\u00a7\3\2\2\2\u00a0\u00a1\7\22"+
		"\2\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7\n\2\2\u00a3\u00a7\3\2\2\2\u00a4"+
		"\u00a5\7\22\2\2\u00a5\u00a7\7\n\2\2\u00a6h\3\2\2\2\u00a6l\3\2\2\2\u00a6"+
		"p\3\2\2\2\u00a6u\3\2\2\2\u00a6y\3\2\2\2\u00a6~\3\2\2\2\u00a6\u0086\3\2"+
		"\2\2\u00a6\u0092\3\2\2\2\u00a6\u009a\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\23\3\2\2\2\u00a8\u00ab\b\13\1\2\u00a9\u00ab\5\26"+
		"\f\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00b1\3\2\2\2\u00ac"+
		"\u00ad\f\3\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00b0\5\26\f\2\u00af\u00ac\3"+
		"\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\25\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\b\f\1\2\u00b5\u00cd\7*\2\2"+
		"\u00b6\u00cd\7+\2\2\u00b7\u00cd\7)\2\2\u00b8\u00cd\7,\2\2\u00b9\u00ba"+
		"\7\3\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc\7\4\2\2\u00bc\u00cd\3\2\2\2"+
		"\u00bd\u00be\7\23\2\2\u00be\u00bf\7\24\2\2\u00bf\u00c0\5 \21\2\u00c0\u00c1"+
		"\7\25\2\2\u00c1\u00c2\7\3\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\7\4\2\2"+
		"\u00c4\u00cd\3\2\2\2\u00c5\u00c6\7\36\2\2\u00c6\u00cd\5\26\f\b\u00c7\u00c8"+
		"\7)\2\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\5\24\13\2\u00ca\u00cb\7\4\2\2"+
		"\u00cb\u00cd\3\2\2\2\u00cc\u00b4\3\2\2\2\u00cc\u00b6\3\2\2\2\u00cc\u00b7"+
		"\3\2\2\2\u00cc\u00b8\3\2\2\2\u00cc\u00b9\3\2\2\2\u00cc\u00bd\3\2\2\2\u00cc"+
		"\u00c5\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\u00e7\3\2\2\2\u00ce\u00cf\f\13"+
		"\2\2\u00cf\u00d0\t\2\2\2\u00d0\u00e6\5\26\f\f\u00d1\u00d2\f\n\2\2\u00d2"+
		"\u00d3\t\3\2\2\u00d3\u00e6\5\26\f\13\u00d4\u00d5\f\t\2\2\u00d5\u00d6\t"+
		"\4\2\2\u00d6\u00e6\5\26\f\n\u00d7\u00d8\f\7\2\2\u00d8\u00d9\7\37\2\2\u00d9"+
		"\u00e6\5\26\f\b\u00da\u00db\f\6\2\2\u00db\u00dc\7 \2\2\u00dc\u00e6\5\26"+
		"\f\7\u00dd\u00de\f\5\2\2\u00de\u00df\7!\2\2\u00df\u00e0\5\26\f\2\u00e0"+
		"\u00e1\7\"\2\2\u00e1\u00e6\3\2\2\2\u00e2\u00e3\f\4\2\2\u00e3\u00e4\7#"+
		"\2\2\u00e4\u00e6\7)\2\2\u00e5\u00ce\3\2\2\2\u00e5\u00d1\3\2\2\2\u00e5"+
		"\u00d4\3\2\2\2\u00e5\u00d7\3\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00dd\3\2"+
		"\2\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\27\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7$\2\2"+
		"\u00eb\u00ec\7)\2\2\u00ec\u00ed\7\5\2\2\u00ed\u00ee\5\32\16\2\u00ee\u00ef"+
		"\7\6\2\2\u00ef\u00f0\7\n\2\2\u00f0\31\3\2\2\2\u00f1\u00f2\b\16\1\2\u00f2"+
		"\u00f3\5\34\17\2\u00f3\u00f8\3\2\2\2\u00f4\u00f5\f\3\2\2\u00f5\u00f7\5"+
		"\34\17\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\33\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7)\2\2"+
		"\u00fc\u00fd\7\7\2\2\u00fd\u00fe\5 \21\2\u00fe\u00ff\7\n\2\2\u00ff\35"+
		"\3\2\2\2\u0100\u0101\7%\2\2\u0101\u0102\7)\2\2\u0102\u0103\7\7\2\2\u0103"+
		"\u0104\5 \21\2\u0104\u0105\7\n\2\2\u0105\37\3\2\2\2\u0106\u010f\7&\2\2"+
		"\u0107\u010f\7\'\2\2\u0108\u010f\7(\2\2\u0109\u010f\7)\2\2\u010a\u010b"+
		"\7!\2\2\u010b\u010c\7*\2\2\u010c\u010d\7\"\2\2\u010d\u010f\5 \21\2\u010e"+
		"\u0106\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u0108\3\2\2\2\u010e\u0109\3\2"+
		"\2\2\u010e\u010a\3\2\2\2\u010f!\3\2\2\2\22*\60FJQ]er\u00a6\u00aa\u00b1"+
		"\u00cc\u00e5\u00e7\u00f8\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}