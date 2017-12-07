package lang.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIotlangLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_STRING_EXT=8;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=9;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_STRING_LIT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=14;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_ANNOTATION_ID=5;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalIotlangLexer() {;} 
    public InternalIotlangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalIotlangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalIotlang.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:11:7: ( '=>' )
            // InternalIotlang.g:11:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:12:7: ( '<=>' )
            // InternalIotlang.g:12:9: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:13:7: ( '<=' )
            // InternalIotlang.g:13:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:14:7: ( 'import' )
            // InternalIotlang.g:14:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:15:7: ( 'var' )
            // InternalIotlang.g:15:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:16:7: ( ':' )
            // InternalIotlang.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:17:7: ( ']' )
            // InternalIotlang.g:17:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:18:7: ( 'datatype' )
            // InternalIotlang.g:18:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:19:7: ( '<' )
            // InternalIotlang.g:19:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:20:7: ( '>' )
            // InternalIotlang.g:20:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21:7: ( ';' )
            // InternalIotlang.g:21:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:22:7: ( 'object' )
            // InternalIotlang.g:22:9: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:23:7: ( 'enumeration' )
            // InternalIotlang.g:23:9: 'enumeration'
            {
            match("enumeration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:24:7: ( '{' )
            // InternalIotlang.g:24:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:25:7: ( '}' )
            // InternalIotlang.g:25:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:26:7: ( 'thing' )
            // InternalIotlang.g:26:9: 'thing'
            {
            match("thing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:27:7: ( 'includes' )
            // InternalIotlang.g:27:9: 'includes'
            {
            match("includes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:28:7: ( ',' )
            // InternalIotlang.g:28:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:29:7: ( 'set' )
            // InternalIotlang.g:29:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:30:7: ( '=' )
            // InternalIotlang.g:30:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:31:7: ( '[' )
            // InternalIotlang.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:32:7: ( 'protocol' )
            // InternalIotlang.g:32:9: 'protocol'
            {
            match("protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:33:7: ( 'function' )
            // InternalIotlang.g:33:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:34:7: ( '(' )
            // InternalIotlang.g:34:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:35:7: ( ')' )
            // InternalIotlang.g:35:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:36:7: ( 'property' )
            // InternalIotlang.g:36:9: 'property'
            {
            match("property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:37:7: ( 'message' )
            // InternalIotlang.g:37:9: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:38:7: ( 'required' )
            // InternalIotlang.g:38:9: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:39:7: ( 'port' )
            // InternalIotlang.g:39:9: 'port'
            {
            match("port"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:40:7: ( 'sends' )
            // InternalIotlang.g:40:9: 'sends'
            {
            match("sends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:41:7: ( 'receives' )
            // InternalIotlang.g:41:9: 'receives'
            {
            match("receives"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:42:7: ( 'provided' )
            // InternalIotlang.g:42:9: 'provided'
            {
            match("provided"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:43:7: ( 'internal' )
            // InternalIotlang.g:43:9: 'internal'
            {
            match("internal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:44:7: ( 'state' )
            // InternalIotlang.g:44:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:45:7: ( 'on' )
            // InternalIotlang.g:45:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:46:7: ( 'entry' )
            // InternalIotlang.g:46:9: 'entry'
            {
            match("entry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:47:7: ( 'exit' )
            // InternalIotlang.g:47:9: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:48:7: ( 'transition' )
            // InternalIotlang.g:48:9: 'transition'
            {
            match("transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:49:7: ( '->' )
            // InternalIotlang.g:49:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:50:7: ( 'event' )
            // InternalIotlang.g:50:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:51:7: ( 'guard' )
            // InternalIotlang.g:51:9: 'guard'
            {
            match("guard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:52:7: ( 'action' )
            // InternalIotlang.g:52:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:53:7: ( 'composite' )
            // InternalIotlang.g:53:9: 'composite'
            {
            match("composite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:54:7: ( 'init' )
            // InternalIotlang.g:54:9: 'init'
            {
            match("init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:55:7: ( 'keeps' )
            // InternalIotlang.g:55:9: 'keeps'
            {
            match("keeps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:56:7: ( 'statechart' )
            // InternalIotlang.g:56:9: 'statechart'
            {
            match("statechart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:57:7: ( 'session' )
            // InternalIotlang.g:57:9: 'session'
            {
            match("session"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:58:7: ( 'region' )
            // InternalIotlang.g:58:9: 'region'
            {
            match("region"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:59:7: ( 'final' )
            // InternalIotlang.g:59:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:60:7: ( '?' )
            // InternalIotlang.g:60:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:61:7: ( 'do' )
            // InternalIotlang.g:61:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:62:7: ( 'end' )
            // InternalIotlang.g:62:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:63:7: ( '&' )
            // InternalIotlang.g:63:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:64:7: ( '!' )
            // InternalIotlang.g:64:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:65:7: ( '++' )
            // InternalIotlang.g:65:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:66:7: ( '--' )
            // InternalIotlang.g:66:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:67:7: ( 'while' )
            // InternalIotlang.g:67:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:68:7: ( 'if' )
            // InternalIotlang.g:68:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:69:7: ( 'else' )
            // InternalIotlang.g:69:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:70:7: ( 'return' )
            // InternalIotlang.g:70:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:71:7: ( 'print' )
            // InternalIotlang.g:71:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:72:7: ( 'error' )
            // InternalIotlang.g:72:9: 'error'
            {
            match("error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:73:7: ( 'fork' )
            // InternalIotlang.g:73:9: 'fork'
            {
            match("fork"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:74:7: ( 'as' )
            // InternalIotlang.g:74:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:75:7: ( 'or' )
            // InternalIotlang.g:75:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:76:7: ( 'and' )
            // InternalIotlang.g:76:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:77:7: ( '==' )
            // InternalIotlang.g:77:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:78:7: ( '!=' )
            // InternalIotlang.g:78:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:79:7: ( '>=' )
            // InternalIotlang.g:79:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:80:7: ( '+' )
            // InternalIotlang.g:80:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:81:7: ( '-' )
            // InternalIotlang.g:81:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:82:7: ( '*' )
            // InternalIotlang.g:82:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:83:7: ( '/' )
            // InternalIotlang.g:83:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:84:7: ( '%' )
            // InternalIotlang.g:84:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:85:7: ( 'not' )
            // InternalIotlang.g:85:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:86:7: ( 'false' )
            // InternalIotlang.g:86:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:87:7: ( '.' )
            // InternalIotlang.g:87:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:88:7: ( 'gateway' )
            // InternalIotlang.g:88:9: 'gateway'
            {
            match("gateway"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:89:7: ( 'bus' )
            // InternalIotlang.g:89:9: 'bus'
            {
            match("bus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:90:7: ( 'channel' )
            // InternalIotlang.g:90:9: 'channel'
            {
            match("channel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:91:7: ( 'configuration' )
            // InternalIotlang.g:91:9: 'configuration'
            {
            match("configuration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:92:7: ( 'domain' )
            // InternalIotlang.g:92:9: 'domain'
            {
            match("domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:93:7: ( 'instance' )
            // InternalIotlang.g:93:9: 'instance'
            {
            match("instance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:94:7: ( 'gate' )
            // InternalIotlang.g:94:9: 'gate'
            {
            match("gate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:95:7: ( 'connector' )
            // InternalIotlang.g:95:9: 'connector'
            {
            match("connector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:96:8: ( 'over' )
            // InternalIotlang.g:96:10: 'over'
            {
            match("over"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:97:8: ( 'bind' )
            // InternalIotlang.g:97:10: 'bind'
            {
            match("bind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:98:8: ( 'fragment' )
            // InternalIotlang.g:98:10: 'fragment'
            {
            match("fragment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:99:8: ( 'abstract' )
            // InternalIotlang.g:99:10: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:100:8: ( 'readonly' )
            // InternalIotlang.g:100:10: 'readonly'
            {
            match("readonly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:101:8: ( 'optional' )
            // InternalIotlang.g:101:10: 'optional'
            {
            match("optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:102:8: ( 'history' )
            // InternalIotlang.g:102:10: 'history'
            {
            match("history"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:103:8: ( 'true' )
            // InternalIotlang.g:103:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21494:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIotlang.g:21494:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalIotlang.g:21494:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalIotlang.g:21494:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalIotlang.g:21494:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIotlang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21496:10: ( ( '0' .. '9' )+ )
            // InternalIotlang.g:21496:12: ( '0' .. '9' )+
            {
            // InternalIotlang.g:21496:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIotlang.g:21496:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21498:12: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) )
            // InternalIotlang.g:21498:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            {
            // InternalIotlang.g:21498:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalIotlang.g:21498:15: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    {
                    // InternalIotlang.g:21498:15: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalIotlang.g:21498:16: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match('.'); 
                    // InternalIotlang.g:21498:31: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalIotlang.g:21498:32: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalIotlang.g:21498:43: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalIotlang.g:21498:44: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalIotlang.g:21498:54: ( '+' | '-' )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0=='+'||LA6_0=='-') ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalIotlang.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalIotlang.g:21498:65: ( '0' .. '9' )+
                            int cnt7=0;
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalIotlang.g:21498:66: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt7 >= 1 ) break loop7;
                                        EarlyExitException eee =
                                            new EarlyExitException(7, input);
                                        throw eee;
                                }
                                cnt7++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:21498:79: '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    {
                    match('.'); 
                    // InternalIotlang.g:21498:83: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalIotlang.g:21498:84: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    // InternalIotlang.g:21498:95: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalIotlang.g:21498:96: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalIotlang.g:21498:106: ( '+' | '-' )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0=='+'||LA10_0=='-') ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // InternalIotlang.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalIotlang.g:21498:117: ( '0' .. '9' )+
                            int cnt11=0;
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // InternalIotlang.g:21498:118: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt11 >= 1 ) break loop11;
                                        EarlyExitException eee =
                                            new EarlyExitException(11, input);
                                        throw eee;
                                }
                                cnt11++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:21498:131: ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    // InternalIotlang.g:21498:131: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalIotlang.g:21498:132: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalIotlang.g:21498:153: ( '+' | '-' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='+'||LA14_0=='-') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalIotlang.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalIotlang.g:21498:164: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalIotlang.g:21498:165: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ANNOTATION_ID"
    public final void mRULE_ANNOTATION_ID() throws RecognitionException {
        try {
            int _type = RULE_ANNOTATION_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21500:20: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIotlang.g:21500:22: '@' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            match('@'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalIotlang.g:21500:50: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIotlang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANNOTATION_ID"

    // $ANTLR start "RULE_STRING_EXT"
    public final void mRULE_STRING_EXT() throws RecognitionException {
        try {
            int _type = RULE_STRING_EXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21502:17: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalIotlang.g:21502:19: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalIotlang.g:21502:24: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\\') ) {
                    alt18=1;
                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIotlang.g:21502:25: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalIotlang.g:21502:32: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_EXT"

    // $ANTLR start "RULE_STRING_LIT"
    public final void mRULE_STRING_LIT() throws RecognitionException {
        try {
            int _type = RULE_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21504:17: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalIotlang.g:21504:19: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalIotlang.g:21504:23: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\\') ) {
                    alt19=1;
                }
                else if ( ((LA19_0>='\u0000' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIotlang.g:21504:24: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalIotlang.g:21504:31: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LIT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21506:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalIotlang.g:21506:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalIotlang.g:21506:24: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIotlang.g:21506:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21508:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIotlang.g:21508:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalIotlang.g:21508:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIotlang.g:21508:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalIotlang.g:21508:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIotlang.g:21508:41: ( '\\r' )? '\\n'
                    {
                    // InternalIotlang.g:21508:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalIotlang.g:21508:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21510:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalIotlang.g:21510:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalIotlang.g:21510:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalIotlang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21512:16: ( . )
            // InternalIotlang.g:21512:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:21514:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalIotlang.g:21514:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalIotlang.g:21514:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\"') ) {
                alt27=1;
            }
            else if ( (LA27_0=='\'') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalIotlang.g:21514:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalIotlang.g:21514:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='!')||(LA25_0>='#' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalIotlang.g:21514:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIotlang.g:21514:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:21514:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalIotlang.g:21514:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop26:
                    do {
                        int alt26=3;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\\') ) {
                            alt26=1;
                        }
                        else if ( ((LA26_0>='\u0000' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalIotlang.g:21514:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIotlang.g:21514:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    public void mTokens() throws RecognitionException {
        // InternalIotlang.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | RULE_ID | RULE_INT | RULE_FLOAT | RULE_ANNOTATION_ID | RULE_STRING_EXT | RULE_STRING_LIT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_STRING )
        int alt28=104;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // InternalIotlang.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalIotlang.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalIotlang.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalIotlang.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalIotlang.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalIotlang.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalIotlang.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalIotlang.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalIotlang.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalIotlang.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalIotlang.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalIotlang.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalIotlang.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalIotlang.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalIotlang.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalIotlang.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalIotlang.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalIotlang.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalIotlang.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalIotlang.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalIotlang.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalIotlang.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalIotlang.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalIotlang.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalIotlang.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalIotlang.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalIotlang.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalIotlang.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalIotlang.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalIotlang.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalIotlang.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalIotlang.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalIotlang.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalIotlang.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalIotlang.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalIotlang.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalIotlang.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalIotlang.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalIotlang.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalIotlang.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalIotlang.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalIotlang.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalIotlang.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalIotlang.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalIotlang.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalIotlang.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalIotlang.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalIotlang.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // InternalIotlang.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // InternalIotlang.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // InternalIotlang.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // InternalIotlang.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // InternalIotlang.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // InternalIotlang.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // InternalIotlang.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // InternalIotlang.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // InternalIotlang.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // InternalIotlang.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // InternalIotlang.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // InternalIotlang.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // InternalIotlang.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // InternalIotlang.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // InternalIotlang.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // InternalIotlang.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // InternalIotlang.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // InternalIotlang.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // InternalIotlang.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // InternalIotlang.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // InternalIotlang.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // InternalIotlang.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // InternalIotlang.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // InternalIotlang.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // InternalIotlang.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // InternalIotlang.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // InternalIotlang.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // InternalIotlang.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // InternalIotlang.g:1:466: T__91
                {
                mT__91(); 

                }
                break;
            case 78 :
                // InternalIotlang.g:1:472: T__92
                {
                mT__92(); 

                }
                break;
            case 79 :
                // InternalIotlang.g:1:478: T__93
                {
                mT__93(); 

                }
                break;
            case 80 :
                // InternalIotlang.g:1:484: T__94
                {
                mT__94(); 

                }
                break;
            case 81 :
                // InternalIotlang.g:1:490: T__95
                {
                mT__95(); 

                }
                break;
            case 82 :
                // InternalIotlang.g:1:496: T__96
                {
                mT__96(); 

                }
                break;
            case 83 :
                // InternalIotlang.g:1:502: T__97
                {
                mT__97(); 

                }
                break;
            case 84 :
                // InternalIotlang.g:1:508: T__98
                {
                mT__98(); 

                }
                break;
            case 85 :
                // InternalIotlang.g:1:514: T__99
                {
                mT__99(); 

                }
                break;
            case 86 :
                // InternalIotlang.g:1:520: T__100
                {
                mT__100(); 

                }
                break;
            case 87 :
                // InternalIotlang.g:1:527: T__101
                {
                mT__101(); 

                }
                break;
            case 88 :
                // InternalIotlang.g:1:534: T__102
                {
                mT__102(); 

                }
                break;
            case 89 :
                // InternalIotlang.g:1:541: T__103
                {
                mT__103(); 

                }
                break;
            case 90 :
                // InternalIotlang.g:1:548: T__104
                {
                mT__104(); 

                }
                break;
            case 91 :
                // InternalIotlang.g:1:555: T__105
                {
                mT__105(); 

                }
                break;
            case 92 :
                // InternalIotlang.g:1:562: T__106
                {
                mT__106(); 

                }
                break;
            case 93 :
                // InternalIotlang.g:1:569: T__107
                {
                mT__107(); 

                }
                break;
            case 94 :
                // InternalIotlang.g:1:576: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 95 :
                // InternalIotlang.g:1:584: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 96 :
                // InternalIotlang.g:1:593: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 97 :
                // InternalIotlang.g:1:604: RULE_ANNOTATION_ID
                {
                mRULE_ANNOTATION_ID(); 

                }
                break;
            case 98 :
                // InternalIotlang.g:1:623: RULE_STRING_EXT
                {
                mRULE_STRING_EXT(); 

                }
                break;
            case 99 :
                // InternalIotlang.g:1:639: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 100 :
                // InternalIotlang.g:1:655: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 101 :
                // InternalIotlang.g:1:671: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 102 :
                // InternalIotlang.g:1:687: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 103 :
                // InternalIotlang.g:1:695: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 104 :
                // InternalIotlang.g:1:710: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA16_eotS =
        "\5\uffff";
    static final String DFA16_eofS =
        "\5\uffff";
    static final String DFA16_minS =
        "\2\56\3\uffff";
    static final String DFA16_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA16_specialS =
        "\5\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "21498:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )";
        }
    }
    static final String DFA28_eotS =
        "\1\uffff\1\63\1\65\2\71\2\uffff\1\71\1\100\1\uffff\2\71\2\uffff\1\71\1\uffff\1\71\1\uffff\2\71\2\uffff\2\71\1\141\4\71\2\uffff\1\156\1\160\1\71\1\uffff\1\165\1\uffff\1\71\1\171\2\71\1\60\1\uffff\1\175\3\60\5\uffff\1\u0088\1\uffff\2\71\1\u008e\1\uffff\1\71\2\uffff\1\71\1\u0092\3\uffff\1\71\1\u0094\1\u0095\7\71\2\uffff\2\71\1\uffff\2\71\1\uffff\7\71\2\uffff\2\71\3\uffff\3\71\1\u00b7\5\71\6\uffff\1\71\5\uffff\1\71\2\uffff\3\71\1\uffff\1\175\12\uffff\5\71\1\uffff\1\u00cc\2\71\1\uffff\1\71\2\uffff\4\71\1\u00d4\7\71\1\u00dc\24\71\1\uffff\1\u00f3\6\71\1\u00fb\1\u00fc\2\71\4\uffff\3\71\1\u0102\1\71\1\uffff\3\71\1\u0107\3\71\1\uffff\1\u010b\1\71\1\u010d\3\71\1\u0111\1\uffff\7\71\1\u0119\2\71\1\u011c\11\71\1\u0127\1\71\1\uffff\7\71\2\uffff\1\u0130\4\71\1\uffff\4\71\1\uffff\2\71\1\u013b\1\uffff\1\u013c\1\uffff\1\u013d\1\u013e\1\71\1\uffff\1\u0140\1\71\1\u0143\3\71\1\u0147\1\uffff\1\71\1\u0149\1\uffff\1\u014a\7\71\1\u0152\1\71\1\uffff\6\71\1\u015a\1\u015b\1\uffff\1\71\1\u015d\4\71\1\u0162\1\u0163\2\71\4\uffff\1\71\1\uffff\2\71\1\uffff\3\71\1\uffff\1\71\2\uffff\4\71\1\u0171\1\u0172\1\71\1\uffff\1\71\1\u0175\5\71\2\uffff\1\71\1\uffff\4\71\2\uffff\3\71\1\u0183\6\71\1\u018a\2\71\2\uffff\1\71\1\u018e\1\uffff\4\71\1\u0193\1\u0194\1\u0195\1\u0196\1\u0197\1\u0198\1\u0199\2\71\1\uffff\1\71\1\u019d\1\u019e\1\u019f\1\u01a0\1\u01a1\1\uffff\1\u01a2\1\u01a3\1\u01a4\1\uffff\1\u01a5\3\71\7\uffff\3\71\11\uffff\1\u01ac\1\71\1\u01ae\1\71\1\u01b0\1\u01b1\1\uffff\1\71\1\uffff\1\u01b3\2\uffff\1\71\1\uffff\1\71\1\u01b6\1\uffff";
    static final String DFA28_eofS =
        "\u01b7\uffff";
    static final String DFA28_minS =
        "\1\0\2\75\1\146\1\141\2\uffff\1\141\1\75\1\uffff\1\142\1\154\2\uffff\1\150\1\uffff\1\145\1\uffff\1\157\1\141\2\uffff\2\145\1\55\1\141\1\142\1\150\1\145\2\uffff\1\75\1\53\1\150\1\uffff\1\52\1\uffff\1\157\1\60\2\151\1\101\1\uffff\1\56\1\101\2\0\5\uffff\1\76\1\uffff\1\160\1\143\1\60\1\uffff\1\162\2\uffff\1\164\1\60\3\uffff\1\152\2\60\1\145\1\164\1\144\1\151\1\145\1\163\1\162\2\uffff\1\151\1\141\1\uffff\1\156\1\141\1\uffff\1\151\1\162\2\156\1\162\1\154\1\141\2\uffff\1\163\1\141\3\uffff\1\141\2\164\1\60\1\144\1\163\1\155\1\141\1\145\6\uffff\1\151\5\uffff\1\164\2\uffff\1\163\1\156\1\163\1\uffff\1\56\1\uffff\2\0\1\uffff\2\0\4\uffff\1\157\1\154\1\145\2\164\1\uffff\1\60\2\141\1\uffff\1\145\2\uffff\1\162\1\151\1\155\1\162\1\60\1\164\1\156\1\145\1\157\2\156\1\145\1\60\1\144\1\163\1\164\1\160\1\156\1\164\1\143\1\141\1\153\1\163\1\147\1\163\1\165\1\145\1\151\1\165\1\144\1\162\1\145\1\151\1\uffff\1\60\1\164\1\160\1\146\1\156\1\160\1\154\2\60\1\144\1\164\1\0\1\uffff\1\0\1\uffff\1\162\1\165\1\162\1\60\1\141\1\uffff\1\164\1\151\1\143\1\60\1\157\1\145\1\171\1\uffff\1\60\1\164\1\60\1\162\1\147\1\163\1\60\1\uffff\1\163\1\151\1\145\1\157\1\145\1\151\1\164\1\60\1\164\1\154\1\60\1\145\1\155\1\141\2\151\1\157\1\162\1\157\1\144\1\60\1\157\1\uffff\1\162\1\157\1\151\1\145\1\156\1\163\1\145\2\uffff\1\60\1\157\1\164\1\144\1\156\1\uffff\1\156\1\171\1\156\1\164\1\uffff\1\156\1\162\1\60\1\uffff\1\60\1\uffff\2\60\1\151\1\uffff\1\60\1\157\1\60\1\143\1\162\1\144\1\60\1\uffff\1\151\1\60\1\uffff\1\60\1\145\1\147\1\162\1\166\3\156\1\60\1\141\1\uffff\1\156\1\141\1\163\1\147\1\143\1\145\2\60\1\uffff\1\162\1\60\1\145\1\141\1\143\1\160\2\60\2\141\4\uffff\1\164\1\uffff\1\156\1\150\1\uffff\1\157\1\164\1\145\1\uffff\1\157\2\uffff\1\156\3\145\2\60\1\154\1\uffff\1\171\1\60\1\143\1\151\1\165\1\164\1\154\2\uffff\1\171\1\uffff\1\163\1\154\2\145\2\uffff\1\154\1\164\1\151\1\60\1\141\1\154\1\171\1\144\1\156\1\164\1\60\1\144\1\163\2\uffff\1\171\1\60\1\uffff\2\164\1\162\1\157\7\60\1\151\1\157\1\uffff\1\162\5\60\1\uffff\3\60\1\uffff\1\60\1\145\1\141\1\162\7\uffff\1\157\1\156\1\164\11\uffff\1\60\1\164\1\60\1\156\2\60\1\uffff\1\151\1\uffff\1\60\2\uffff\1\157\1\uffff\1\156\1\60\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\1\76\1\75\1\156\1\141\2\uffff\1\157\1\75\1\uffff\1\166\1\170\2\uffff\1\162\1\uffff\1\164\1\uffff\1\162\1\165\2\uffff\2\145\1\76\1\165\1\163\1\157\1\145\2\uffff\1\75\1\53\1\150\1\uffff\1\57\1\uffff\1\157\1\71\1\165\1\151\1\172\1\uffff\1\145\1\172\2\uffff\5\uffff\1\76\1\uffff\1\160\1\164\1\172\1\uffff\1\162\2\uffff\1\164\1\172\3\uffff\1\152\2\172\1\145\1\164\1\165\1\151\1\145\1\163\1\162\2\uffff\1\151\1\165\1\uffff\1\164\1\141\1\uffff\1\157\1\162\2\156\1\162\1\154\1\141\2\uffff\1\163\1\164\3\uffff\1\141\2\164\1\172\1\144\1\163\1\156\1\141\1\145\6\uffff\1\151\5\uffff\1\164\2\uffff\1\163\1\156\1\163\1\uffff\1\145\1\uffff\2\uffff\1\uffff\2\uffff\4\uffff\1\157\1\154\1\145\2\164\1\uffff\1\172\2\141\1\uffff\1\145\2\uffff\1\162\1\151\1\155\1\162\1\172\1\164\1\156\1\145\1\157\2\156\1\145\1\172\1\144\1\163\1\164\1\166\1\156\1\164\1\143\1\141\1\153\1\163\1\147\1\163\1\165\1\145\1\151\1\165\1\144\1\162\1\145\1\151\1\uffff\1\172\1\164\1\160\2\156\1\160\1\154\2\172\1\144\1\164\1\uffff\1\uffff\1\uffff\1\uffff\1\162\1\165\1\162\1\172\1\141\1\uffff\1\164\1\151\1\143\1\172\1\157\1\145\1\171\1\uffff\1\172\1\164\1\172\1\162\1\147\1\163\1\172\1\uffff\1\163\1\151\1\145\1\157\1\145\1\151\1\164\1\172\1\164\1\154\1\172\1\145\1\155\1\141\2\151\1\157\1\162\1\157\1\144\1\172\1\157\1\uffff\1\162\1\157\1\151\1\145\1\156\1\163\1\145\2\uffff\1\172\1\157\1\164\1\144\1\156\1\uffff\1\156\1\171\1\156\1\164\1\uffff\1\156\1\162\1\172\1\uffff\1\172\1\uffff\2\172\1\151\1\uffff\1\172\1\157\1\172\1\143\1\162\1\144\1\172\1\uffff\1\151\1\172\1\uffff\1\172\1\145\1\147\1\162\1\166\3\156\1\172\1\141\1\uffff\1\156\1\141\1\163\1\147\1\143\1\145\2\172\1\uffff\1\162\1\172\1\145\1\141\1\143\1\160\2\172\2\141\4\uffff\1\164\1\uffff\1\156\1\150\1\uffff\1\157\1\164\1\145\1\uffff\1\157\2\uffff\1\156\3\145\2\172\1\154\1\uffff\1\171\1\172\1\143\1\151\1\165\1\164\1\154\2\uffff\1\171\1\uffff\1\163\1\154\2\145\2\uffff\1\154\1\164\1\151\1\172\1\141\1\154\1\171\1\144\1\156\1\164\1\172\1\144\1\163\2\uffff\1\171\1\172\1\uffff\2\164\1\162\1\157\7\172\1\151\1\157\1\uffff\1\162\5\172\1\uffff\3\172\1\uffff\1\172\1\145\1\141\1\162\7\uffff\1\157\1\156\1\164\11\uffff\1\172\1\164\1\172\1\156\2\172\1\uffff\1\151\1\uffff\1\172\2\uffff\1\157\1\uffff\1\156\1\172\1\uffff";
    static final String DFA28_acceptS =
        "\5\uffff\1\6\1\7\2\uffff\1\13\2\uffff\1\16\1\17\1\uffff\1\22\1\uffff\1\25\2\uffff\1\30\1\31\7\uffff\1\62\1\65\3\uffff\1\110\1\uffff\1\112\5\uffff\1\136\4\uffff\1\146\1\147\1\1\1\103\1\24\1\uffff\1\11\3\uffff\1\136\1\uffff\1\6\1\7\2\uffff\1\105\1\12\1\13\12\uffff\1\16\1\17\2\uffff\1\22\2\uffff\1\25\7\uffff\1\30\1\31\2\uffff\1\47\1\70\1\107\11\uffff\1\62\1\65\1\104\1\66\1\67\1\106\1\uffff\1\110\1\144\1\145\1\111\1\112\1\uffff\1\140\1\115\3\uffff\1\137\1\uffff\1\141\2\uffff\1\142\2\uffff\1\143\1\146\1\2\1\3\5\uffff\1\72\3\uffff\1\63\1\uffff\1\43\1\101\41\uffff\1\100\14\uffff\1\142\1\uffff\1\143\5\uffff\1\5\7\uffff\1\64\7\uffff\1\23\26\uffff\1\102\7\uffff\1\113\1\117\5\uffff\1\54\4\uffff\1\126\3\uffff\1\45\1\uffff\1\73\3\uffff\1\135\7\uffff\1\35\2\uffff\1\77\12\uffff\1\124\10\uffff\1\127\12\uffff\1\44\1\50\1\76\1\20\1\uffff\1\36\2\uffff\1\42\3\uffff\1\75\1\uffff\1\61\1\114\7\uffff\1\51\7\uffff\1\55\1\71\1\uffff\1\4\4\uffff\1\122\1\14\15\uffff\1\60\1\74\2\uffff\1\52\15\uffff\1\57\6\uffff\1\33\3\uffff\1\116\4\uffff\1\120\1\134\1\21\1\41\1\123\1\10\1\133\3\uffff\1\26\1\32\1\40\1\27\1\130\1\34\1\37\1\132\1\131\6\uffff\1\53\1\uffff\1\125\1\uffff\1\46\1\56\1\uffff\1\15\2\uffff\1\121";
    static final String DFA28_specialS =
        "\1\4\54\uffff\1\2\1\3\121\uffff\1\0\1\6\1\uffff\1\1\1\10\76\uffff\1\5\1\uffff\1\7\u00f1\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\37\1\56\2\60\1\44\1\36\1\55\1\24\1\25\1\42\1\40\1\17\1\30\1\46\1\43\12\53\1\5\1\11\1\2\1\1\1\10\1\35\1\54\32\52\1\21\1\60\1\6\1\51\1\52\1\60\1\32\1\47\1\33\1\7\1\13\1\23\1\31\1\50\1\3\1\52\1\34\1\52\1\26\1\45\1\12\1\22\1\52\1\27\1\20\1\16\1\52\1\4\1\41\3\52\1\14\1\60\1\15\uff82\60",
            "\1\62\1\61",
            "\1\64",
            "\1\70\6\uffff\1\66\1\67",
            "\1\72",
            "",
            "",
            "\1\75\15\uffff\1\76",
            "\1\77",
            "",
            "\1\102\13\uffff\1\103\1\uffff\1\106\1\uffff\1\104\3\uffff\1\105",
            "\1\112\1\uffff\1\107\3\uffff\1\113\3\uffff\1\111\1\uffff\1\110",
            "",
            "",
            "\1\116\11\uffff\1\117",
            "",
            "\1\121\16\uffff\1\122",
            "",
            "\1\125\2\uffff\1\124",
            "\1\131\7\uffff\1\127\5\uffff\1\130\2\uffff\1\132\2\uffff\1\126",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\140\20\uffff\1\137",
            "\1\143\23\uffff\1\142",
            "\1\147\1\144\12\uffff\1\146\4\uffff\1\145",
            "\1\151\6\uffff\1\150",
            "\1\152",
            "",
            "",
            "\1\155",
            "\1\157",
            "\1\161",
            "",
            "\1\163\4\uffff\1\164",
            "",
            "\1\167",
            "\12\170",
            "\1\173\13\uffff\1\172",
            "\1\174",
            "\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\170\1\uffff\12\176\13\uffff\1\170\37\uffff\1\170",
            "\32\177\4\uffff\1\177\1\uffff\32\177",
            "\47\u0081\1\u0082\64\u0081\1\u0080\uffa3\u0081",
            "\42\u0084\1\u0085\71\u0084\1\u0083\uffa3\u0084",
            "",
            "",
            "",
            "",
            "",
            "\1\u0087",
            "",
            "\1\u0089",
            "\1\u008a\5\uffff\1\u008c\11\uffff\1\u008d\1\u008b",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u008f",
            "",
            "",
            "\1\u0090",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\14\71\1\u0091\15\71",
            "",
            "",
            "",
            "\1\u0093",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0096",
            "\1\u0097",
            "\1\u009a\17\uffff\1\u0099\1\u0098",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "",
            "\1\u009f",
            "\1\u00a0\23\uffff\1\u00a1",
            "",
            "\1\u00a3\4\uffff\1\u00a4\1\u00a2",
            "\1\u00a5",
            "",
            "\1\u00a7\5\uffff\1\u00a6",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "\1\u00ae",
            "\1\u00b3\1\uffff\1\u00b0\3\uffff\1\u00b1\11\uffff\1\u00af\2\uffff\1\u00b2",
            "",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00be",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bf",
            "",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\170\1\uffff\12\176\13\uffff\1\170\37\uffff\1\170",
            "",
            "\0\u00c3",
            "\47\u0081\1\u0082\64\u0081\1\u0080\uffa3\u0081",
            "",
            "\0\u00c5",
            "\42\u0084\1\u0085\71\u0084\1\u0083\uffa3\u0084",
            "",
            "",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e1\3\uffff\1\u00e0\1\uffff\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6\7\uffff\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00fd",
            "\1\u00fe",
            "\47\u0081\1\u0082\64\u0081\1\u0080\uffa3\u0081",
            "",
            "\42\u0084\1\u0085\71\u0084\1\u0083\uffa3\u0084",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0103",
            "",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u010c",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u011a",
            "\1\u011b",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\26\71\1\u0126\3\71",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "\1\u0139",
            "\1\u013a",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u013f",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0141",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\2\71\1\u0142\27\71",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u0148",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u015c",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0164",
            "\1\u0165",
            "",
            "",
            "",
            "",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "",
            "\1\u016c",
            "",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0173",
            "",
            "\1\u0174",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "",
            "",
            "\1\u017b",
            "",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u018b",
            "\1\u018c",
            "",
            "",
            "\1\u018d",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u019a",
            "\1\u019b",
            "",
            "\1\u019c",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u01ad",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u01af",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u01b2",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\u01b4",
            "",
            "\1\u01b5",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | RULE_ID | RULE_INT | RULE_FLOAT | RULE_ANNOTATION_ID | RULE_STRING_EXT | RULE_STRING_LIT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_128 = input.LA(1);

                        s = -1;
                        if ( ((LA28_128>='\u0000' && LA28_128<='\uFFFF')) ) {s = 195;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_131 = input.LA(1);

                        s = -1;
                        if ( ((LA28_131>='\u0000' && LA28_131<='\uFFFF')) ) {s = 197;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_45 = input.LA(1);

                        s = -1;
                        if ( (LA28_45=='\\') ) {s = 128;}

                        else if ( ((LA28_45>='\u0000' && LA28_45<='&')||(LA28_45>='(' && LA28_45<='[')||(LA28_45>=']' && LA28_45<='\uFFFF')) ) {s = 129;}

                        else if ( (LA28_45=='\'') ) {s = 130;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_46 = input.LA(1);

                        s = -1;
                        if ( (LA28_46=='\\') ) {s = 131;}

                        else if ( ((LA28_46>='\u0000' && LA28_46<='!')||(LA28_46>='#' && LA28_46<='[')||(LA28_46>=']' && LA28_46<='\uFFFF')) ) {s = 132;}

                        else if ( (LA28_46=='\"') ) {s = 133;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='=') ) {s = 1;}

                        else if ( (LA28_0=='<') ) {s = 2;}

                        else if ( (LA28_0=='i') ) {s = 3;}

                        else if ( (LA28_0=='v') ) {s = 4;}

                        else if ( (LA28_0==':') ) {s = 5;}

                        else if ( (LA28_0==']') ) {s = 6;}

                        else if ( (LA28_0=='d') ) {s = 7;}

                        else if ( (LA28_0=='>') ) {s = 8;}

                        else if ( (LA28_0==';') ) {s = 9;}

                        else if ( (LA28_0=='o') ) {s = 10;}

                        else if ( (LA28_0=='e') ) {s = 11;}

                        else if ( (LA28_0=='{') ) {s = 12;}

                        else if ( (LA28_0=='}') ) {s = 13;}

                        else if ( (LA28_0=='t') ) {s = 14;}

                        else if ( (LA28_0==',') ) {s = 15;}

                        else if ( (LA28_0=='s') ) {s = 16;}

                        else if ( (LA28_0=='[') ) {s = 17;}

                        else if ( (LA28_0=='p') ) {s = 18;}

                        else if ( (LA28_0=='f') ) {s = 19;}

                        else if ( (LA28_0=='(') ) {s = 20;}

                        else if ( (LA28_0==')') ) {s = 21;}

                        else if ( (LA28_0=='m') ) {s = 22;}

                        else if ( (LA28_0=='r') ) {s = 23;}

                        else if ( (LA28_0=='-') ) {s = 24;}

                        else if ( (LA28_0=='g') ) {s = 25;}

                        else if ( (LA28_0=='a') ) {s = 26;}

                        else if ( (LA28_0=='c') ) {s = 27;}

                        else if ( (LA28_0=='k') ) {s = 28;}

                        else if ( (LA28_0=='?') ) {s = 29;}

                        else if ( (LA28_0=='&') ) {s = 30;}

                        else if ( (LA28_0=='!') ) {s = 31;}

                        else if ( (LA28_0=='+') ) {s = 32;}

                        else if ( (LA28_0=='w') ) {s = 33;}

                        else if ( (LA28_0=='*') ) {s = 34;}

                        else if ( (LA28_0=='/') ) {s = 35;}

                        else if ( (LA28_0=='%') ) {s = 36;}

                        else if ( (LA28_0=='n') ) {s = 37;}

                        else if ( (LA28_0=='.') ) {s = 38;}

                        else if ( (LA28_0=='b') ) {s = 39;}

                        else if ( (LA28_0=='h') ) {s = 40;}

                        else if ( (LA28_0=='^') ) {s = 41;}

                        else if ( ((LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||LA28_0=='j'||LA28_0=='l'||LA28_0=='q'||LA28_0=='u'||(LA28_0>='x' && LA28_0<='z')) ) {s = 42;}

                        else if ( ((LA28_0>='0' && LA28_0<='9')) ) {s = 43;}

                        else if ( (LA28_0=='@') ) {s = 44;}

                        else if ( (LA28_0=='\'') ) {s = 45;}

                        else if ( (LA28_0=='\"') ) {s = 46;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 47;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||(LA28_0>='#' && LA28_0<='$')||LA28_0=='\\'||LA28_0=='`'||LA28_0=='|'||(LA28_0>='~' && LA28_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_195 = input.LA(1);

                        s = -1;
                        if ( (LA28_195=='\'') ) {s = 130;}

                        else if ( (LA28_195=='\\') ) {s = 128;}

                        else if ( ((LA28_195>='\u0000' && LA28_195<='&')||(LA28_195>='(' && LA28_195<='[')||(LA28_195>=']' && LA28_195<='\uFFFF')) ) {s = 129;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_129 = input.LA(1);

                        s = -1;
                        if ( (LA28_129=='\'') ) {s = 130;}

                        else if ( (LA28_129=='\\') ) {s = 128;}

                        else if ( ((LA28_129>='\u0000' && LA28_129<='&')||(LA28_129>='(' && LA28_129<='[')||(LA28_129>=']' && LA28_129<='\uFFFF')) ) {s = 129;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_197 = input.LA(1);

                        s = -1;
                        if ( (LA28_197=='\"') ) {s = 133;}

                        else if ( (LA28_197=='\\') ) {s = 131;}

                        else if ( ((LA28_197>='\u0000' && LA28_197<='!')||(LA28_197>='#' && LA28_197<='[')||(LA28_197>=']' && LA28_197<='\uFFFF')) ) {s = 132;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_132 = input.LA(1);

                        s = -1;
                        if ( (LA28_132=='\"') ) {s = 133;}

                        else if ( (LA28_132=='\\') ) {s = 131;}

                        else if ( ((LA28_132>='\u0000' && LA28_132<='!')||(LA28_132>='#' && LA28_132<='[')||(LA28_132>=']' && LA28_132<='\uFFFF')) ) {s = 132;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}