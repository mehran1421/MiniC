package compiler.gen;// Generated from C:/Users/Mehran/IdeaProjects/untitled67/grammar\Demo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, DIGITS=30, ALPHABET=31, 
		ALPHABETS=32, WS=33;
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
			"T__25", "T__26", "T__27", "T__28", "DIGITS", "ALPHABET", "ALPHABETS", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'for'", "'to'", "'print'", "'!'", 
			"'{'", "'}'", "'('", "')'", "';'", "'='", "':'", "'+'", "'-'", "'/'", 
			"'*'", "'^'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'.'", "'_'", 
			"'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "DIGITS", "ALPHABET", "ALPHABETS", 
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


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00a9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\6\37\u009b\n\37\r\37"+
		"\16\37\u009c\3 \3 \3!\6!\u00a2\n!\r!\16!\u00a3\3\"\3\"\3\"\3\"\2\2#\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00aa\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5H\3\2\2\2\7M\3\2\2\2"+
		"\tS\3\2\2\2\13W\3\2\2\2\rZ\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2"+
		"\25f\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2"+
		"\2!r\3\2\2\2#t\3\2\2\2%v\3\2\2\2\'x\3\2\2\2)z\3\2\2\2+|\3\2\2\2-~\3\2"+
		"\2\2/\u0081\3\2\2\2\61\u0084\3\2\2\2\63\u0087\3\2\2\2\65\u008a\3\2\2\2"+
		"\67\u008c\3\2\2\29\u008e\3\2\2\2;\u0093\3\2\2\2=\u009a\3\2\2\2?\u009e"+
		"\3\2\2\2A\u00a1\3\2\2\2C\u00a5\3\2\2\2EF\7k\2\2FG\7h\2\2G\4\3\2\2\2HI"+
		"\7g\2\2IJ\7n\2\2JK\7u\2\2KL\7g\2\2L\6\3\2\2\2MN\7y\2\2NO\7j\2\2OP\7k\2"+
		"\2PQ\7n\2\2QR\7g\2\2R\b\3\2\2\2ST\7h\2\2TU\7q\2\2UV\7t\2\2V\n\3\2\2\2"+
		"WX\7v\2\2XY\7q\2\2Y\f\3\2\2\2Z[\7r\2\2[\\\7t\2\2\\]\7k\2\2]^\7p\2\2^_"+
		"\7v\2\2_\16\3\2\2\2`a\7#\2\2a\20\3\2\2\2bc\7}\2\2c\22\3\2\2\2de\7\177"+
		"\2\2e\24\3\2\2\2fg\7*\2\2g\26\3\2\2\2hi\7+\2\2i\30\3\2\2\2jk\7=\2\2k\32"+
		"\3\2\2\2lm\7?\2\2m\34\3\2\2\2no\7<\2\2o\36\3\2\2\2pq\7-\2\2q \3\2\2\2"+
		"rs\7/\2\2s\"\3\2\2\2tu\7\61\2\2u$\3\2\2\2vw\7,\2\2w&\3\2\2\2xy\7`\2\2"+
		"y(\3\2\2\2z{\7>\2\2{*\3\2\2\2|}\7@\2\2},\3\2\2\2~\177\7>\2\2\177\u0080"+
		"\7?\2\2\u0080.\3\2\2\2\u0081\u0082\7@\2\2\u0082\u0083\7?\2\2\u0083\60"+
		"\3\2\2\2\u0084\u0085\7?\2\2\u0085\u0086\7?\2\2\u0086\62\3\2\2\2\u0087"+
		"\u0088\7#\2\2\u0088\u0089\7?\2\2\u0089\64\3\2\2\2\u008a\u008b\7\60\2\2"+
		"\u008b\66\3\2\2\2\u008c\u008d\7a\2\2\u008d8\3\2\2\2\u008e\u008f\7v\2\2"+
		"\u008f\u0090\7t\2\2\u0090\u0091\7w\2\2\u0091\u0092\7g\2\2\u0092:\3\2\2"+
		"\2\u0093\u0094\7h\2\2\u0094\u0095\7c\2\2\u0095\u0096\7n\2\2\u0096\u0097"+
		"\7u\2\2\u0097\u0098\7g\2\2\u0098<\3\2\2\2\u0099\u009b\t\2\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		">\3\2\2\2\u009e\u009f\t\3\2\2\u009f@\3\2\2\2\u00a0\u00a2\t\3\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4B\3\2\2\2\u00a5\u00a6\t\4\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\b\"\2\2\u00a8D\3\2\2\2\5\2\u009c\u00a3\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}