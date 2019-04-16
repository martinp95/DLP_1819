// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
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
		T__38=39, T__39=40, T__40=41, T__41=42, IDENT=43, INT_CONSTANT=44, REAL_CONSTANT=45, 
		CHAR_CONSTANT=46, LINE_COMMENT=47, COMENTARIO_MULTILINEA=48, WHITESPACE=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "IDENT", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "LINE_COMMENT", 
			"COMENTARIO_MULTILINEA", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "':'", "','", "'print'", "';'", "'printsp'", 
			"'println'", "'read'", "'='", "'+='", "'-='", "'*='", "'/='", "'if'", 
			"'else'", "'while'", "'return'", "'cast'", "'<'", "'>'", "'!'", "'['", 
			"']'", "'.'", "'*'", "'/'", "'+'", "'-'", "'<='", "'>='", "'!='", "'=='", 
			"'&&'", "'||'", "'struct'", "'var'", "'int'", "'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "IDENT", "INT_CONSTANT", "REAL_CONSTANT", 
			"CHAR_CONSTANT", "LINE_COMMENT", "COMENTARIO_MULTILINEA", "WHITESPACE"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u013a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\6,\u00f8\n,\r,\16,\u00f9\3,\7,\u00fd"+
		"\n,\f,\16,\u0100\13,\3-\6-\u0103\n-\r-\16-\u0104\3.\6.\u0108\n.\r.\16"+
		".\u0109\3.\3.\6.\u010e\n.\r.\16.\u010f\3/\3/\3/\3/\3/\5/\u0117\n/\3\60"+
		"\3\60\3\60\3\60\7\60\u011d\n\60\f\60\16\60\u0120\13\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\7\61\u012a\n\61\f\61\16\61\u012d\13\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\6\62\u0135\n\62\r\62\16\62\u0136\3\62\3\62\4"+
		"\u011e\u012b\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3"+
		"\2\6\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u0142\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\r"+
		"o\3\2\2\2\17q\3\2\2\2\21w\3\2\2\2\23y\3\2\2\2\25\u0081\3\2\2\2\27\u0089"+
		"\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0093\3\2\2\2\37\u0096\3"+
		"\2\2\2!\u0099\3\2\2\2#\u009c\3\2\2\2%\u009f\3\2\2\2\'\u00a4\3\2\2\2)\u00aa"+
		"\3\2\2\2+\u00b1\3\2\2\2-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2"+
		"\63\u00bc\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c2\3\2\2\2;\u00c4"+
		"\3\2\2\2=\u00c6\3\2\2\2?\u00c8\3\2\2\2A\u00ca\3\2\2\2C\u00cd\3\2\2\2E"+
		"\u00d0\3\2\2\2G\u00d3\3\2\2\2I\u00d6\3\2\2\2K\u00d9\3\2\2\2M\u00dc\3\2"+
		"\2\2O\u00e3\3\2\2\2Q\u00e7\3\2\2\2S\u00eb\3\2\2\2U\u00f1\3\2\2\2W\u00f7"+
		"\3\2\2\2Y\u0102\3\2\2\2[\u0107\3\2\2\2]\u0116\3\2\2\2_\u0118\3\2\2\2a"+
		"\u0125\3\2\2\2c\u0134\3\2\2\2ef\7*\2\2f\4\3\2\2\2gh\7+\2\2h\6\3\2\2\2"+
		"ij\7}\2\2j\b\3\2\2\2kl\7\177\2\2l\n\3\2\2\2mn\7<\2\2n\f\3\2\2\2op\7.\2"+
		"\2p\16\3\2\2\2qr\7r\2\2rs\7t\2\2st\7k\2\2tu\7p\2\2uv\7v\2\2v\20\3\2\2"+
		"\2wx\7=\2\2x\22\3\2\2\2yz\7r\2\2z{\7t\2\2{|\7k\2\2|}\7p\2\2}~\7v\2\2~"+
		"\177\7u\2\2\177\u0080\7r\2\2\u0080\24\3\2\2\2\u0081\u0082\7r\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2"+
		"\u0086\u0087\7n\2\2\u0087\u0088\7p\2\2\u0088\26\3\2\2\2\u0089\u008a\7"+
		"t\2\2\u008a\u008b\7g\2\2\u008b\u008c\7c\2\2\u008c\u008d\7f\2\2\u008d\30"+
		"\3\2\2\2\u008e\u008f\7?\2\2\u008f\32\3\2\2\2\u0090\u0091\7-\2\2\u0091"+
		"\u0092\7?\2\2\u0092\34\3\2\2\2\u0093\u0094\7/\2\2\u0094\u0095\7?\2\2\u0095"+
		"\36\3\2\2\2\u0096\u0097\7,\2\2\u0097\u0098\7?\2\2\u0098 \3\2\2\2\u0099"+
		"\u009a\7\61\2\2\u009a\u009b\7?\2\2\u009b\"\3\2\2\2\u009c\u009d\7k\2\2"+
		"\u009d\u009e\7h\2\2\u009e$\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7n\2"+
		"\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7g\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7"+
		"y\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7v\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7p\2\2\u00b0"+
		"*\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7u\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7.\3\2\2\2\u00b8\u00b9"+
		"\7@\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb\62\3\2\2\2\u00bc\u00bd"+
		"\7]\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7_\2\2\u00bf\66\3\2\2\2\u00c0\u00c1"+
		"\7\60\2\2\u00c18\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3:\3\2\2\2\u00c4\u00c5"+
		"\7\61\2\2\u00c5<\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7>\3\2\2\2\u00c8\u00c9"+
		"\7/\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cc\7?\2\2\u00ccB\3"+
		"\2\2\2\u00cd\u00ce\7@\2\2\u00ce\u00cf\7?\2\2\u00cfD\3\2\2\2\u00d0\u00d1"+
		"\7#\2\2\u00d1\u00d2\7?\2\2\u00d2F\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5"+
		"\7?\2\2\u00d5H\3\2\2\2\u00d6\u00d7\7(\2\2\u00d7\u00d8\7(\2\2\u00d8J\3"+
		"\2\2\2\u00d9\u00da\7~\2\2\u00da\u00db\7~\2\2\u00dbL\3\2\2\2\u00dc\u00dd"+
		"\7u\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7w\2\2\u00e0"+
		"\u00e1\7e\2\2\u00e1\u00e2\7v\2\2\u00e2N\3\2\2\2\u00e3\u00e4\7x\2\2\u00e4"+
		"\u00e5\7c\2\2\u00e5\u00e6\7t\2\2\u00e6P\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7p\2\2\u00e9\u00ea\7v\2\2\u00eaR\3\2\2\2\u00eb\u00ec\7h\2\2\u00ec"+
		"\u00ed\7n\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7v\2\2"+
		"\u00f0T\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7j\2\2\u00f3\u00f4\7c\2"+
		"\2\u00f4\u00f5\7t\2\2\u00f5V\3\2\2\2\u00f6\u00f8\t\2\2\2\u00f7\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fe\3\2\2\2\u00fb\u00fd\t\3\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffX\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0101\u0103\t\4\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105Z\3\2\2\2\u0106\u0108\t\4\2\2"+
		"\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\7\60\2\2\u010c\u010e\t\4\2\2"+
		"\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\\\3\2\2\2\u0111\u0112\7)\2\2\u0112\u0113\13\2\2\2\u0113"+
		"\u0117\7)\2\2\u0114\u0115\7^\2\2\u0115\u0117\7p\2\2\u0116\u0111\3\2\2"+
		"\2\u0116\u0114\3\2\2\2\u0117^\3\2\2\2\u0118\u0119\7\61\2\2\u0119\u011a"+
		"\7\61\2\2\u011a\u011e\3\2\2\2\u011b\u011d\13\2\2\2\u011c\u011b\3\2\2\2"+
		"\u011d\u0120\3\2\2\2\u011e\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\f\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\b\60\2\2\u0124`\3\2\2\2\u0125\u0126\7\61\2\2\u0126\u0127\7,\2\2"+
		"\u0127\u012b\3\2\2\2\u0128\u012a\13\2\2\2\u0129\u0128\3\2\2\2\u012a\u012d"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u012f\7,\2\2\u012f\u0130\7\61\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\b\61\2\2\u0132b\3\2\2\2\u0133\u0135\t\5\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\b\62\2\2\u0139d\3\2\2\2\f\2\u00f9\u00fe\u0104"+
		"\u0109\u010f\u0116\u011e\u012b\u0136\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}