// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;

    import ast.*;

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
		RULE_parametros = 4, RULE_parametro = 5, RULE_param = 6, RULE_variables = 7, 
		RULE_sentencias = 8, RULE_sentencia = 9, RULE_parametrosOpt = 10, RULE_parametroOpt = 11, 
		RULE_expr = 12, RULE_defStruct = 13, RULE_campos = 14, RULE_campo = 15, 
		RULE_defVariable = 16, RULE_tipo = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definiciones", "definicion", "defFuncion", "parametros", "parametro", 
			"param", "variables", "sentencias", "sentencia", "parametrosOpt", "parametroOpt", 
			"expr", "defStruct", "campos", "campo", "defVariable", "tipo"
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
		public Programa ast;
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
			setState(36);
			definiciones(0);
			setState(37);
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
			setState(44);
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
					setState(40);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(41);
					definicion();
					}
					} 
				}
				setState(46);
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				defVariable();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				defStruct();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(IDENT);
				setState(53);
				match(T__0);
				setState(54);
				parametros();
				setState(55);
				match(T__1);
				setState(56);
				match(T__2);
				setState(57);
				variables(0);
				setState(58);
				sentencias(0);
				setState(59);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(IDENT);
				setState(62);
				match(T__0);
				setState(63);
				parametros();
				setState(64);
				match(T__1);
				setState(65);
				match(T__4);
				setState(66);
				tipo();
				setState(67);
				match(T__2);
				setState(68);
				variables(0);
				setState(69);
				sentencias(0);
				setState(70);
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
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametros);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				parametro(0);
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

	public static class ParametroContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		return parametro(0);
	}

	private ParametroContext parametro(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParametroContext _localctx = new ParametroContext(_ctx, _parentState);
		ParametroContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_parametro, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(79);
			param();
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParametroContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parametro);
					setState(81);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(82);
					match(T__5);
					setState(83);
					param();
					}
					} 
				}
				setState(88);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IDENT);
			setState(90);
			match(T__4);
			setState(91);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_variables, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
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
					setState(94);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(95);
					defVariable();
					}
					} 
				}
				setState(100);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_sentencias, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
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
					setState(102);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(103);
					sentencia();
					}
					} 
				}
				setState(108);
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
		enterRule(_localctx, 18, RULE_sentencia);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__6);
				setState(110);
				expr(0);
				setState(111);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__8);
				setState(114);
				expr(0);
				setState(115);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(T__9);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__27) | (1L << IDENT) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(118);
					expr(0);
					}
				}

				setState(121);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(T__10);
				setState(123);
				expr(0);
				setState(124);
				match(T__7);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				expr(0);
				setState(127);
				match(T__11);
				setState(128);
				expr(0);
				setState(129);
				match(T__7);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				match(T__12);
				setState(132);
				match(T__0);
				setState(133);
				expr(0);
				setState(134);
				match(T__1);
				setState(135);
				match(T__2);
				setState(136);
				sentencias(0);
				setState(137);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				match(T__12);
				setState(140);
				match(T__0);
				setState(141);
				expr(0);
				setState(142);
				match(T__1);
				setState(143);
				match(T__2);
				setState(144);
				sentencias(0);
				setState(145);
				match(T__3);
				setState(146);
				match(T__13);
				setState(147);
				match(T__2);
				setState(148);
				sentencias(0);
				setState(149);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(151);
				match(T__14);
				setState(152);
				match(T__0);
				setState(153);
				expr(0);
				setState(154);
				match(T__1);
				setState(155);
				match(T__2);
				setState(156);
				sentencias(0);
				setState(157);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
				match(IDENT);
				setState(160);
				match(T__0);
				setState(161);
				parametrosOpt();
				setState(162);
				match(T__1);
				setState(163);
				match(T__7);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(165);
				match(T__15);
				setState(166);
				expr(0);
				setState(167);
				match(T__7);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(169);
				match(T__15);
				setState(170);
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
		public ParametroOptContext parametroOpt() {
			return getRuleContext(ParametroOptContext.class,0);
		}
		public ParametrosOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosOpt; }
	}

	public final ParametrosOptContext parametrosOpt() throws RecognitionException {
		ParametrosOptContext _localctx = new ParametrosOptContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametrosOpt);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__0:
			case T__16:
			case T__27:
			case IDENT:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				parametroOpt(0);
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

	public static class ParametroOptContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParametroOptContext parametroOpt() {
			return getRuleContext(ParametroOptContext.class,0);
		}
		public ParametroOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroOpt; }
	}

	public final ParametroOptContext parametroOpt() throws RecognitionException {
		return parametroOpt(0);
	}

	private ParametroOptContext parametroOpt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParametroOptContext _localctx = new ParametroOptContext(_ctx, _parentState);
		ParametroOptContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_parametroOpt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(178);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParametroOptContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parametroOpt);
					setState(180);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(181);
					match(T__5);
					setState(182);
					expr(0);
					}
					} 
				}
				setState(187);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(189);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(190);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(191);
				match(IDENT);
				}
				break;
			case 4:
				{
				setState(192);
				match(CHAR_CONSTANT);
				}
				break;
			case 5:
				{
				setState(193);
				match(T__0);
				setState(194);
				expr(0);
				setState(195);
				match(T__1);
				}
				break;
			case 6:
				{
				setState(197);
				match(T__16);
				setState(198);
				match(T__17);
				setState(199);
				tipo();
				setState(200);
				match(T__18);
				setState(201);
				match(T__0);
				setState(202);
				expr(0);
				setState(203);
				match(T__1);
				}
				break;
			case 7:
				{
				setState(205);
				match(T__27);
				setState(206);
				expr(6);
				}
				break;
			case 8:
				{
				setState(207);
				match(IDENT);
				setState(208);
				match(T__0);
				setState(209);
				parametrosOpt();
				setState(210);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(215);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(218);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(221);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(222);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(224);
						match(T__28);
						setState(225);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(227);
						match(T__29);
						setState(228);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(230);
						match(T__30);
						setState(231);
						expr(0);
						setState(232);
						match(T__31);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(235);
						match(T__32);
						setState(236);
						match(IDENT);
						}
						break;
					}
					} 
				}
				setState(241);
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
		enterRule(_localctx, 26, RULE_defStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__33);
			setState(243);
			match(IDENT);
			setState(244);
			match(T__2);
			setState(245);
			campos(0);
			setState(246);
			match(T__3);
			setState(247);
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
		public CamposContext campos() {
			return getRuleContext(CamposContext.class,0);
		}
		public CampoContext campo() {
			return getRuleContext(CampoContext.class,0);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_campos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
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
					setState(250);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(251);
					campo();
					}
					} 
				}
				setState(256);
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
		public Campo ast;
		public Token IDENT;
		public TipoContext tipo;
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
		enterRule(_localctx, 30, RULE_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			((CampoContext)_localctx).IDENT = match(IDENT);
			setState(258);
			match(T__4);
			setState(259);
			((CampoContext)_localctx).tipo = tipo();
			setState(260);
			match(T__7);
			 ((CampoContext)_localctx).ast =  new Campo(((CampoContext)_localctx).IDENT, ((CampoContext)_localctx).tipo.ast);
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
		public DefVariable ast;
		public Token IDENT;
		public TipoContext tipo;
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
		enterRule(_localctx, 32, RULE_defVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__34);
			setState(264);
			((DefVariableContext)_localctx).IDENT = match(IDENT);
			setState(265);
			match(T__4);
			setState(266);
			((DefVariableContext)_localctx).tipo = tipo();
			setState(267);
			match(T__7);
			((DefVariableContext)_localctx).ast =  new DefVariable(((DefVariableContext)_localctx).IDENT, ((DefVariableContext)_localctx).tipo.ast, "");
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
		public Tipo ast;
		public Token INT_CONSTANT;
		public TipoContext tipo;
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
		enterRule(_localctx, 34, RULE_tipo);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__35);
				 ((TipoContext)_localctx).ast =  new IntType();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(T__36);
				 ((TipoContext)_localctx).ast =  new FloatType();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(T__37);
				 ((TipoContext)_localctx).ast =  new CharType();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(IDENT);
				 ((TipoContext)_localctx).ast =  new IdentType();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				match(T__30);
				setState(279);
				((TipoContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(280);
				match(T__31);
				setState(281);
				((TipoContext)_localctx).tipo = tipo();
				 ((TipoContext)_localctx).ast =  new ArrayType(((TipoContext)_localctx).INT_CONSTANT,((TipoContext)_localctx).tipo.ast);
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
		case 5:
			return parametro_sempred((ParametroContext)_localctx, predIndex);
		case 7:
			return variables_sempred((VariablesContext)_localctx, predIndex);
		case 8:
			return sentencias_sempred((SentenciasContext)_localctx, predIndex);
		case 11:
			return parametroOpt_sempred((ParametroOptContext)_localctx, predIndex);
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 14:
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
	private boolean parametro_sempred(ParametroContext _localctx, int predIndex) {
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
	private boolean parametroOpt_sempred(ParametroOptContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0121\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\4\3\4\3"+
		"\4\5\4\65\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7W\n\7\f\7\16\7Z\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tc\n\t\f\t"+
		"\16\tf\13\t\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13z\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00ae\n\13\3\f\3\f\5\f\u00b2\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00d7\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00f0\n\16\f\16\16\16\u00f3\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\7\20\u00ff\n\20\f\20\16\20\u0102\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011f"+
		"\n\23\3\23\2\t\4\f\20\22\30\32\36\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\5\3\2\26\27\3\2\30\31\4\2\24\25\32\35\2\u0136\2&\3\2\2\2"+
		"\4)\3\2\2\2\6\64\3\2\2\2\bJ\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16[\3\2\2\2"+
		"\20_\3\2\2\2\22g\3\2\2\2\24\u00ad\3\2\2\2\26\u00b1\3\2\2\2\30\u00b3\3"+
		"\2\2\2\32\u00d6\3\2\2\2\34\u00f4\3\2\2\2\36\u00fb\3\2\2\2 \u0103\3\2\2"+
		"\2\"\u0109\3\2\2\2$\u011e\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3(\3\3\2\2\2).\b"+
		"\3\1\2*+\f\3\2\2+-\5\6\4\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/"+
		"\5\3\2\2\2\60.\3\2\2\2\61\65\5\"\22\2\62\65\5\34\17\2\63\65\5\b\5\2\64"+
		"\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\7\3\2\2\2\66\67\7)\2\2\678"+
		"\7\3\2\289\5\n\6\29:\7\4\2\2:;\7\5\2\2;<\5\20\t\2<=\5\22\n\2=>\7\6\2\2"+
		">K\3\2\2\2?@\7)\2\2@A\7\3\2\2AB\5\n\6\2BC\7\4\2\2CD\7\7\2\2DE\5$\23\2"+
		"EF\7\5\2\2FG\5\20\t\2GH\5\22\n\2HI\7\6\2\2IK\3\2\2\2J\66\3\2\2\2J?\3\2"+
		"\2\2K\t\3\2\2\2LO\3\2\2\2MO\5\f\7\2NL\3\2\2\2NM\3\2\2\2O\13\3\2\2\2PQ"+
		"\b\7\1\2QR\5\16\b\2RX\3\2\2\2ST\f\3\2\2TU\7\b\2\2UW\5\16\b\2VS\3\2\2\2"+
		"WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2ZX\3\2\2\2[\\\7)\2\2\\]\7\7\2"+
		"\2]^\5$\23\2^\17\3\2\2\2_d\b\t\1\2`a\f\3\2\2ac\5\"\22\2b`\3\2\2\2cf\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2e\21\3\2\2\2fd\3\2\2\2gl\b\n\1\2hi\f\3\2\2i"+
		"k\5\24\13\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\23\3\2\2\2nl\3\2"+
		"\2\2op\7\t\2\2pq\5\32\16\2qr\7\n\2\2r\u00ae\3\2\2\2st\7\13\2\2tu\5\32"+
		"\16\2uv\7\n\2\2v\u00ae\3\2\2\2wy\7\f\2\2xz\5\32\16\2yx\3\2\2\2yz\3\2\2"+
		"\2z{\3\2\2\2{\u00ae\7\n\2\2|}\7\r\2\2}~\5\32\16\2~\177\7\n\2\2\177\u00ae"+
		"\3\2\2\2\u0080\u0081\5\32\16\2\u0081\u0082\7\16\2\2\u0082\u0083\5\32\16"+
		"\2\u0083\u0084\7\n\2\2\u0084\u00ae\3\2\2\2\u0085\u0086\7\17\2\2\u0086"+
		"\u0087\7\3\2\2\u0087\u0088\5\32\16\2\u0088\u0089\7\4\2\2\u0089\u008a\7"+
		"\5\2\2\u008a\u008b\5\22\n\2\u008b\u008c\7\6\2\2\u008c\u00ae\3\2\2\2\u008d"+
		"\u008e\7\17\2\2\u008e\u008f\7\3\2\2\u008f\u0090\5\32\16\2\u0090\u0091"+
		"\7\4\2\2\u0091\u0092\7\5\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7\6\2\2"+
		"\u0094\u0095\7\20\2\2\u0095\u0096\7\5\2\2\u0096\u0097\5\22\n\2\u0097\u0098"+
		"\7\6\2\2\u0098\u00ae\3\2\2\2\u0099\u009a\7\21\2\2\u009a\u009b\7\3\2\2"+
		"\u009b\u009c\5\32\16\2\u009c\u009d\7\4\2\2\u009d\u009e\7\5\2\2\u009e\u009f"+
		"\5\22\n\2\u009f\u00a0\7\6\2\2\u00a0\u00ae\3\2\2\2\u00a1\u00a2\7)\2\2\u00a2"+
		"\u00a3\7\3\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\7\4\2\2\u00a5\u00a6\7"+
		"\n\2\2\u00a6\u00ae\3\2\2\2\u00a7\u00a8\7\22\2\2\u00a8\u00a9\5\32\16\2"+
		"\u00a9\u00aa\7\n\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ac\7\22\2\2\u00ac\u00ae"+
		"\7\n\2\2\u00ado\3\2\2\2\u00ads\3\2\2\2\u00adw\3\2\2\2\u00ad|\3\2\2\2\u00ad"+
		"\u0080\3\2\2\2\u00ad\u0085\3\2\2\2\u00ad\u008d\3\2\2\2\u00ad\u0099\3\2"+
		"\2\2\u00ad\u00a1\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\25\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b2\5\30\r\2\u00b1\u00af\3\2\2"+
		"\2\u00b1\u00b0\3\2\2\2\u00b2\27\3\2\2\2\u00b3\u00b4\b\r\1\2\u00b4\u00b5"+
		"\5\32\16\2\u00b5\u00bb\3\2\2\2\u00b6\u00b7\f\3\2\2\u00b7\u00b8\7\b\2\2"+
		"\u00b8\u00ba\5\32\16\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\b\16\1\2\u00bf\u00d7\7*\2\2\u00c0\u00d7\7+\2\2\u00c1\u00d7\7)\2"+
		"\2\u00c2\u00d7\7,\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00c5\5\32\16\2\u00c5"+
		"\u00c6\7\4\2\2\u00c6\u00d7\3\2\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\7"+
		"\24\2\2\u00c9\u00ca\5$\23\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\7\3\2\2\u00cc"+
		"\u00cd\5\32\16\2\u00cd\u00ce\7\4\2\2\u00ce\u00d7\3\2\2\2\u00cf\u00d0\7"+
		"\36\2\2\u00d0\u00d7\5\32\16\b\u00d1\u00d2\7)\2\2\u00d2\u00d3\7\3\2\2\u00d3"+
		"\u00d4\5\26\f\2\u00d4\u00d5\7\4\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00be\3"+
		"\2\2\2\u00d6\u00c0\3\2\2\2\u00d6\u00c1\3\2\2\2\u00d6\u00c2\3\2\2\2\u00d6"+
		"\u00c3\3\2\2\2\u00d6\u00c7\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d1\3\2"+
		"\2\2\u00d7\u00f1\3\2\2\2\u00d8\u00d9\f\13\2\2\u00d9\u00da\t\2\2\2\u00da"+
		"\u00f0\5\32\16\f\u00db\u00dc\f\n\2\2\u00dc\u00dd\t\3\2\2\u00dd\u00f0\5"+
		"\32\16\13\u00de\u00df\f\t\2\2\u00df\u00e0\t\4\2\2\u00e0\u00f0\5\32\16"+
		"\n\u00e1\u00e2\f\7\2\2\u00e2\u00e3\7\37\2\2\u00e3\u00f0\5\32\16\b\u00e4"+
		"\u00e5\f\6\2\2\u00e5\u00e6\7 \2\2\u00e6\u00f0\5\32\16\7\u00e7\u00e8\f"+
		"\5\2\2\u00e8\u00e9\7!\2\2\u00e9\u00ea\5\32\16\2\u00ea\u00eb\7\"\2\2\u00eb"+
		"\u00f0\3\2\2\2\u00ec\u00ed\f\4\2\2\u00ed\u00ee\7#\2\2\u00ee\u00f0\7)\2"+
		"\2\u00ef\u00d8\3\2\2\2\u00ef\u00db\3\2\2\2\u00ef\u00de\3\2\2\2\u00ef\u00e1"+
		"\3\2\2\2\u00ef\u00e4\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\33\3\2\2"+
		"\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7$\2\2\u00f5\u00f6\7)\2\2\u00f6\u00f7"+
		"\7\5\2\2\u00f7\u00f8\5\36\20\2\u00f8\u00f9\7\6\2\2\u00f9\u00fa\7\n\2\2"+
		"\u00fa\35\3\2\2\2\u00fb\u0100\b\20\1\2\u00fc\u00fd\f\3\2\2\u00fd\u00ff"+
		"\5 \21\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\37\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7)\2\2"+
		"\u0104\u0105\7\7\2\2\u0105\u0106\5$\23\2\u0106\u0107\7\n\2\2\u0107\u0108"+
		"\b\21\1\2\u0108!\3\2\2\2\u0109\u010a\7%\2\2\u010a\u010b\7)\2\2\u010b\u010c"+
		"\7\7\2\2\u010c\u010d\5$\23\2\u010d\u010e\7\n\2\2\u010e\u010f\b\22\1\2"+
		"\u010f#\3\2\2\2\u0110\u0111\7&\2\2\u0111\u011f\b\23\1\2\u0112\u0113\7"+
		"\'\2\2\u0113\u011f\b\23\1\2\u0114\u0115\7(\2\2\u0115\u011f\b\23\1\2\u0116"+
		"\u0117\7)\2\2\u0117\u011f\b\23\1\2\u0118\u0119\7!\2\2\u0119\u011a\7*\2"+
		"\2\u011a\u011b\7\"\2\2\u011b\u011c\5$\23\2\u011c\u011d\b\23\1\2\u011d"+
		"\u011f\3\2\2\2\u011e\u0110\3\2\2\2\u011e\u0112\3\2\2\2\u011e\u0114\3\2"+
		"\2\2\u011e\u0116\3\2\2\2\u011e\u0118\3\2\2\2\u011f%\3\2\2\2\22.\64JNX"+
		"dly\u00ad\u00b1\u00bb\u00d6\u00ef\u00f1\u0100\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}