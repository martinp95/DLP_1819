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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, INT_CONSTANT=16, 
		REAL_CONSTANT=17, IDENT=18, CHAR=19, LINE_COMMENT=20, COMENTARIO_MULTILINEA=21, 
		WHITESPACE=22;
	public static final int
		RULE_start = 0, RULE_definiciones = 1, RULE_definicion = 2, RULE_defFuncion = 3, 
		RULE_parametros = 4, RULE_parametro = 5, RULE_variables = 6, RULE_sentencias = 7, 
		RULE_sentencia = 8, RULE_defStruct = 9, RULE_campos = 10, RULE_campo = 11, 
		RULE_defVariable = 12, RULE_tipo = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definiciones", "definicion", "defFuncion", "parametros", "parametro", 
			"variables", "sentencias", "sentencia", "defStruct", "campos", "campo", 
			"defVariable", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "':'", "','", "'if'", "'struct'", "';'", 
			"'var'", "'int'", "'float'", "'char'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "IDENT", "CHAR", 
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
			setState(28);
			definiciones(0);
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
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public DefinicionesContext definiciones() {
			return getRuleContext(DefinicionesContext.class,0);
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
			setState(31);
			definicion();
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
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
					setState(33);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(34);
					definicion();
					}
					} 
				}
				setState(39);
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
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				defVariable();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				defStruct();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(IDENT);
				setState(46);
				match(T__0);
				setState(47);
				parametros(0);
				setState(48);
				match(T__1);
				setState(49);
				match(T__2);
				setState(50);
				variables(0);
				setState(51);
				sentencias(0);
				setState(52);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(IDENT);
				setState(55);
				match(T__0);
				setState(56);
				parametros(0);
				setState(57);
				match(T__1);
				setState(58);
				match(T__4);
				setState(59);
				tipo();
				setState(60);
				match(T__2);
				setState(61);
				variables(0);
				setState(62);
				sentencias(0);
				setState(63);
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
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(68);
				parametro();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
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
					setState(71);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(72);
					match(T__5);
					setState(73);
					parametro();
					}
					} 
				}
				setState(78);
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
			setState(79);
			match(IDENT);
			setState(80);
			match(T__4);
			setState(81);
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
			setState(88);
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
					setState(84);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(85);
					defVariable();
					}
					} 
				}
				setState(90);
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
			setState(96);
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
					setState(92);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(93);
					sentencia();
					}
					} 
				}
				setState(98);
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
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__6);
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
		enterRule(_localctx, 18, RULE_defStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__7);
			setState(102);
			match(IDENT);
			setState(103);
			match(T__2);
			setState(104);
			campos(0);
			setState(105);
			match(T__3);
			setState(106);
			match(T__8);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_campos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(109);
			campo();
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CamposContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_campos);
					setState(111);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(112);
					campo();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 22, RULE_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IDENT);
			setState(119);
			match(T__4);
			setState(120);
			tipo();
			setState(121);
			match(T__8);
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
		enterRule(_localctx, 24, RULE_defVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__9);
			setState(124);
			match(IDENT);
			setState(125);
			match(T__4);
			setState(126);
			tipo();
			setState(127);
			match(T__8);
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
		enterRule(_localctx, 26, RULE_tipo);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(T__12);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(IDENT);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				match(T__13);
				setState(134);
				match(INT_CONSTANT);
				setState(135);
				match(T__14);
				setState(136);
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
		case 10:
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
	private boolean campos_sempred(CamposContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u008e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\7\3&\n\3\f\3\16\3)\13\3\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\3\6"+
		"\3\6\5\6H\n\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\t\3\t\3\t\7\ta\n\t\f\t\16\td\13\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\ft\n"+
		"\f\f\f\16\fw\13\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008c\n\17\3\17\2\7\4\n\16"+
		"\20\26\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u008c\2\36\3\2\2\2"+
		"\4 \3\2\2\2\6-\3\2\2\2\bC\3\2\2\2\nG\3\2\2\2\fQ\3\2\2\2\16U\3\2\2\2\20"+
		"]\3\2\2\2\22e\3\2\2\2\24g\3\2\2\2\26n\3\2\2\2\30x\3\2\2\2\32}\3\2\2\2"+
		"\34\u008b\3\2\2\2\36\37\5\4\3\2\37\3\3\2\2\2 !\b\3\1\2!\"\5\6\4\2\"\'"+
		"\3\2\2\2#$\f\3\2\2$&\5\6\4\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2"+
		"(\5\3\2\2\2)\'\3\2\2\2*.\5\32\16\2+.\5\24\13\2,.\5\b\5\2-*\3\2\2\2-+\3"+
		"\2\2\2-,\3\2\2\2.\7\3\2\2\2/\60\7\24\2\2\60\61\7\3\2\2\61\62\5\n\6\2\62"+
		"\63\7\4\2\2\63\64\7\5\2\2\64\65\5\16\b\2\65\66\5\20\t\2\66\67\7\6\2\2"+
		"\67D\3\2\2\289\7\24\2\29:\7\3\2\2:;\5\n\6\2;<\7\4\2\2<=\7\7\2\2=>\5\34"+
		"\17\2>?\7\5\2\2?@\5\16\b\2@A\5\20\t\2AB\7\6\2\2BD\3\2\2\2C/\3\2\2\2C8"+
		"\3\2\2\2D\t\3\2\2\2EH\b\6\1\2FH\5\f\7\2GE\3\2\2\2GF\3\2\2\2HN\3\2\2\2"+
		"IJ\f\3\2\2JK\7\b\2\2KM\5\f\7\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"O\13\3\2\2\2PN\3\2\2\2QR\7\24\2\2RS\7\7\2\2ST\5\34\17\2T\r\3\2\2\2UZ\b"+
		"\b\1\2VW\f\3\2\2WY\5\32\16\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[\17\3\2\2\2\\Z\3\2\2\2]b\b\t\1\2^_\f\3\2\2_a\5\22\n\2`^\3\2\2\2ad\3\2"+
		"\2\2b`\3\2\2\2bc\3\2\2\2c\21\3\2\2\2db\3\2\2\2ef\7\t\2\2f\23\3\2\2\2g"+
		"h\7\n\2\2hi\7\24\2\2ij\7\5\2\2jk\5\26\f\2kl\7\6\2\2lm\7\13\2\2m\25\3\2"+
		"\2\2no\b\f\1\2op\5\30\r\2pu\3\2\2\2qr\f\3\2\2rt\5\30\r\2sq\3\2\2\2tw\3"+
		"\2\2\2us\3\2\2\2uv\3\2\2\2v\27\3\2\2\2wu\3\2\2\2xy\7\24\2\2yz\7\7\2\2"+
		"z{\5\34\17\2{|\7\13\2\2|\31\3\2\2\2}~\7\f\2\2~\177\7\24\2\2\177\u0080"+
		"\7\7\2\2\u0080\u0081\5\34\17\2\u0081\u0082\7\13\2\2\u0082\33\3\2\2\2\u0083"+
		"\u008c\7\r\2\2\u0084\u008c\7\16\2\2\u0085\u008c\7\17\2\2\u0086\u008c\7"+
		"\24\2\2\u0087\u0088\7\20\2\2\u0088\u0089\7\22\2\2\u0089\u008a\7\21\2\2"+
		"\u008a\u008c\5\34\17\2\u008b\u0083\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0085"+
		"\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008c\35\3\2\2\2\13\'"+
		"-CGNZbu\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}