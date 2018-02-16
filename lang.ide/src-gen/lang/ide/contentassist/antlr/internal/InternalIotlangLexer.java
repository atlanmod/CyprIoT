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
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_STRING_LIT=5;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_ANNOTATION_ID=4;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:11:7: ( 'allow' )
            // InternalIotlang.g:11:9: 'allow'
            {
            match("allow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:12:7: ( 'deny' )
            // InternalIotlang.g:12:9: 'deny'
            {
            match("deny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:13:7: ( 'send' )
            // InternalIotlang.g:13:9: 'send'
            {
            match("send"); 


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
            // InternalIotlang.g:14:7: ( 'receive' )
            // InternalIotlang.g:14:9: 'receive'
            {
            match("receive"); 


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
            // InternalIotlang.g:15:7: ( '=>' )
            // InternalIotlang.g:15:9: '=>'
            {
            match("=>"); 


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
            // InternalIotlang.g:16:7: ( '<=>' )
            // InternalIotlang.g:16:9: '<=>'
            {
            match("<=>"); 


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
            // InternalIotlang.g:17:7: ( '<=' )
            // InternalIotlang.g:17:9: '<='
            {
            match("<="); 


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
            // InternalIotlang.g:18:7: ( 'thing' )
            // InternalIotlang.g:18:9: 'thing'
            {
            match("thing"); 


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
            // InternalIotlang.g:19:7: ( '{' )
            // InternalIotlang.g:19:9: '{'
            {
            match('{'); 

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
            // InternalIotlang.g:20:7: ( '}' )
            // InternalIotlang.g:20:9: '}'
            {
            match('}'); 

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
            // InternalIotlang.g:21:7: ( 'channel:pubsub' )
            // InternalIotlang.g:21:9: 'channel:pubsub'
            {
            match("channel:pubsub"); 


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
            // InternalIotlang.g:22:7: ( 'channel:ptp' )
            // InternalIotlang.g:22:9: 'channel:ptp'
            {
            match("channel:ptp"); 


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
            // InternalIotlang.g:23:7: ( 'policy' )
            // InternalIotlang.g:23:9: 'policy'
            {
            match("policy"); 


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
            // InternalIotlang.g:24:7: ( 'port' )
            // InternalIotlang.g:24:9: 'port'
            {
            match("port"); 


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
            // InternalIotlang.g:25:7: ( 'protocol' )
            // InternalIotlang.g:25:9: 'protocol'
            {
            match("protocol"); 


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
            // InternalIotlang.g:26:7: ( 'message' )
            // InternalIotlang.g:26:9: 'message'
            {
            match("message"); 


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
            // InternalIotlang.g:27:7: ( 'topic' )
            // InternalIotlang.g:27:9: 'topic'
            {
            match("topic"); 


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
            // InternalIotlang.g:28:7: ( '(' )
            // InternalIotlang.g:28:9: '('
            {
            match('('); 

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
            // InternalIotlang.g:29:7: ( ')' )
            // InternalIotlang.g:29:9: ')'
            {
            match(')'); 

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
            // InternalIotlang.g:30:7: ( 'rule' )
            // InternalIotlang.g:30:9: 'rule'
            {
            match("rule"); 


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
            // InternalIotlang.g:31:7: ( ':' )
            // InternalIotlang.g:31:9: ':'
            {
            match(':'); 

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
            // InternalIotlang.g:32:7: ( '.' )
            // InternalIotlang.g:32:9: '.'
            {
            match('.'); 

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
            // InternalIotlang.g:33:7: ( 'message:' )
            // InternalIotlang.g:33:9: 'message:'
            {
            match("message:"); 


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
            // InternalIotlang.g:34:7: ( 'domain' )
            // InternalIotlang.g:34:9: 'domain'
            {
            match("domain"); 


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
            // InternalIotlang.g:35:7: ( 'instanceThing' )
            // InternalIotlang.g:35:9: 'instanceThing'
            {
            match("instanceThing"); 


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
            // InternalIotlang.g:36:7: ( '[' )
            // InternalIotlang.g:36:9: '['
            {
            match('['); 

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
            // InternalIotlang.g:37:7: ( ']' )
            // InternalIotlang.g:37:9: ']'
            {
            match(']'); 

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
            // InternalIotlang.g:38:7: ( 'instancePubSub' )
            // InternalIotlang.g:38:9: 'instancePubSub'
            {
            match("instancePubSub"); 


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
            // InternalIotlang.g:39:7: ( 'over' )
            // InternalIotlang.g:39:9: 'over'
            {
            match("over"); 


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
            // InternalIotlang.g:40:7: ( 'instancePTP' )
            // InternalIotlang.g:40:9: 'instancePTP'
            {
            match("instancePTP"); 


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
            // InternalIotlang.g:41:7: ( 'instancePolicy' )
            // InternalIotlang.g:41:9: 'instancePolicy'
            {
            match("instancePolicy"); 


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
            // InternalIotlang.g:42:7: ( 'networkConfiguration' )
            // InternalIotlang.g:42:9: 'networkConfiguration'
            {
            match("networkConfiguration"); 


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
            // InternalIotlang.g:43:7: ( 'enforce' )
            // InternalIotlang.g:43:9: 'enforce'
            {
            match("enforce"); 


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
            // InternalIotlang.g:44:7: ( 'bind' )
            // InternalIotlang.g:44:9: 'bind'
            {
            match("bind"); 


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
            // InternalIotlang.g:45:7: ( ',' )
            // InternalIotlang.g:45:9: ','
            {
            match(','); 

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
            // InternalIotlang.g:46:7: ( 'connect' )
            // InternalIotlang.g:46:9: 'connect'
            {
            match("connect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:4939:10: ( ( '0' .. '9' )+ )
            // InternalIotlang.g:4939:12: ( '0' .. '9' )+
            {
            // InternalIotlang.g:4939:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIotlang.g:4939:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING_LIT"
    public final void mRULE_STRING_LIT() throws RecognitionException {
        try {
            int _type = RULE_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:4941:17: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalIotlang.g:4941:19: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalIotlang.g:4941:23: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIotlang.g:4941:24: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalIotlang.g:4941:31: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop2;
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

    // $ANTLR start "RULE_ANNOTATION_ID"
    public final void mRULE_ANNOTATION_ID() throws RecognitionException {
        try {
            int _type = RULE_ANNOTATION_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:4943:20: ( '@' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIotlang.g:4943:22: '@' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            match('@'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalIotlang.g:4943:50: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:4945:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIotlang.g:4945:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalIotlang.g:4945:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIotlang.g:4945:11: '^'
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

            // InternalIotlang.g:4945:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    break loop5;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:4947:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalIotlang.g:4947:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalIotlang.g:4947:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalIotlang.g:4947:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalIotlang.g:4947:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalIotlang.g:4947:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIotlang.g:4947:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:4947:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalIotlang.g:4947:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalIotlang.g:4947:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIotlang.g:4947:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIotlang.g:4949:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalIotlang.g:4949:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalIotlang.g:4949:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIotlang.g:4949:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalIotlang.g:4951:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIotlang.g:4951:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalIotlang.g:4951:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIotlang.g:4951:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalIotlang.g:4951:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIotlang.g:4951:41: ( '\\r' )? '\\n'
                    {
                    // InternalIotlang.g:4951:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalIotlang.g:4951:41: '\\r'
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
            // InternalIotlang.g:4953:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalIotlang.g:4953:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalIotlang.g:4953:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalIotlang.g:4955:16: ( . )
            // InternalIotlang.g:4955:18: .
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

    public void mTokens() throws RecognitionException {
        // InternalIotlang.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_INT | RULE_STRING_LIT | RULE_ANNOTATION_ID | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=45;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalIotlang.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalIotlang.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalIotlang.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalIotlang.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalIotlang.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalIotlang.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalIotlang.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalIotlang.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalIotlang.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalIotlang.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalIotlang.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalIotlang.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalIotlang.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalIotlang.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalIotlang.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalIotlang.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalIotlang.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalIotlang.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalIotlang.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalIotlang.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalIotlang.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalIotlang.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalIotlang.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalIotlang.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalIotlang.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalIotlang.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalIotlang.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalIotlang.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalIotlang.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalIotlang.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalIotlang.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalIotlang.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalIotlang.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalIotlang.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalIotlang.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalIotlang.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalIotlang.g:1:226: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // InternalIotlang.g:1:235: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 39 :
                // InternalIotlang.g:1:251: RULE_ANNOTATION_ID
                {
                mRULE_ANNOTATION_ID(); 

                }
                break;
            case 40 :
                // InternalIotlang.g:1:270: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // InternalIotlang.g:1:278: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // InternalIotlang.g:1:290: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // InternalIotlang.g:1:306: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 44 :
                // InternalIotlang.g:1:322: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 45 :
                // InternalIotlang.g:1:330: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\4\43\2\41\1\43\2\uffff\3\43\4\uffff\1\43\2\uffff\4\43\2\uffff\3\41\1\uffff\2\41\2\uffff\1\43\1\uffff\5\43\1\uffff\1\120\2\43\2\uffff\5\43\4\uffff\1\43\2\uffff\4\43\12\uffff\6\43\2\uffff\15\43\2\uffff\1\43\1\164\1\43\1\166\1\43\1\170\5\43\1\176\3\43\1\u0082\2\43\1\u0085\1\u0086\1\uffff\1\43\1\uffff\1\43\1\uffff\1\u0089\1\u008a\3\43\1\uffff\3\43\1\uffff\2\43\2\uffff\1\u0093\1\43\2\uffff\2\43\1\u0097\5\43\1\uffff\1\u009d\1\43\1\u009f\1\uffff\1\43\1\u00a2\2\43\1\u00a5\3\uffff\1\u00a7\2\uffff\2\43\3\uffff\3\43\2\uffff\7\43\1\u00b9\4\43\1\uffff\2\43\1\u00c0\3\43\1\uffff\1\u00c4\1\u00c5\1\43\2\uffff\5\43\1\u00cc\1\uffff";
    static final String DFA14_eofS =
        "\u00cd\uffff";
    static final String DFA14_minS =
        "\1\0\1\154\3\145\1\76\1\75\1\150\2\uffff\1\150\1\157\1\145\4\uffff\1\156\2\uffff\1\166\1\145\1\156\1\151\2\uffff\1\0\2\101\1\uffff\1\0\1\52\2\uffff\1\154\1\uffff\1\156\1\155\1\156\1\143\1\154\1\uffff\1\76\1\151\1\160\2\uffff\1\141\1\156\1\154\1\157\1\163\4\uffff\1\163\2\uffff\1\145\1\164\1\146\1\156\2\uffff\2\0\6\uffff\1\157\1\171\1\141\1\144\2\145\2\uffff\1\156\1\151\2\156\1\151\2\164\1\163\1\164\1\162\1\167\1\157\1\144\1\0\1\uffff\1\167\1\60\1\151\1\60\1\151\1\60\1\147\1\143\1\156\1\145\1\143\1\60\1\157\2\141\1\60\1\157\1\162\2\60\1\uffff\1\156\1\uffff\1\166\1\uffff\2\60\1\145\1\143\1\171\1\uffff\1\143\1\147\1\156\1\uffff\1\162\1\143\2\uffff\1\60\1\145\2\uffff\1\154\1\164\1\60\1\157\1\145\1\143\1\153\1\145\1\uffff\1\60\1\72\1\60\1\uffff\1\154\1\60\1\145\1\103\1\60\1\uffff\1\160\1\uffff\1\60\2\uffff\1\120\1\157\1\uffff\1\164\1\uffff\1\150\1\124\1\156\2\uffff\1\151\1\142\1\120\1\154\1\146\1\156\1\123\1\60\2\151\1\147\1\165\1\uffff\1\143\1\147\1\60\1\142\1\171\1\165\1\uffff\2\60\1\162\2\uffff\1\141\1\164\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\154\1\157\1\145\1\165\1\76\1\75\1\157\2\uffff\1\157\1\162\1\145\4\uffff\1\156\2\uffff\1\166\1\145\1\156\1\151\2\uffff\1\uffff\2\172\1\uffff\1\uffff\1\57\2\uffff\1\154\1\uffff\1\156\1\155\1\156\1\143\1\154\1\uffff\1\76\1\151\1\160\2\uffff\1\141\1\156\1\162\1\157\1\163\4\uffff\1\163\2\uffff\1\145\1\164\1\146\1\156\2\uffff\2\uffff\6\uffff\1\157\1\171\1\141\1\144\2\145\2\uffff\1\156\1\151\2\156\1\151\2\164\1\163\1\164\1\162\1\167\1\157\1\144\1\uffff\1\uffff\1\167\1\172\1\151\1\172\1\151\1\172\1\147\1\143\1\156\1\145\1\143\1\172\1\157\2\141\1\172\1\157\1\162\2\172\1\uffff\1\156\1\uffff\1\166\1\uffff\2\172\1\145\1\143\1\171\1\uffff\1\143\1\147\1\156\1\uffff\1\162\1\143\2\uffff\1\172\1\145\2\uffff\1\154\1\164\1\172\1\157\1\145\1\143\1\153\1\145\1\uffff\1\172\1\72\1\172\1\uffff\1\154\1\172\1\145\1\103\1\172\1\uffff\1\160\1\uffff\1\172\2\uffff\1\124\1\157\1\uffff\1\165\1\uffff\1\150\1\165\1\156\2\uffff\1\151\1\142\1\120\1\154\1\146\1\156\1\123\1\172\2\151\1\147\1\165\1\uffff\1\143\1\147\1\172\1\142\1\171\1\165\1\uffff\2\172\1\162\2\uffff\1\141\1\164\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\10\uffff\1\11\1\12\3\uffff\1\22\1\23\1\25\1\26\1\uffff\1\32\1\33\4\uffff\1\43\1\45\3\uffff\1\50\2\uffff\1\54\1\55\1\uffff\1\50\5\uffff\1\5\3\uffff\1\11\1\12\5\uffff\1\22\1\23\1\25\1\26\1\uffff\1\32\1\33\4\uffff\1\43\1\45\2\uffff\1\46\1\47\1\51\1\52\1\53\1\54\6\uffff\1\6\1\7\16\uffff\1\46\24\uffff\1\2\1\uffff\1\3\1\uffff\1\24\5\uffff\1\16\3\uffff\1\35\2\uffff\1\42\1\1\2\uffff\1\10\1\21\10\uffff\1\30\3\uffff\1\15\5\uffff\1\4\1\uffff\1\44\1\uffff\1\27\1\20\2\uffff\1\41\1\uffff\1\17\3\uffff\1\13\1\14\14\uffff\1\36\6\uffff\1\31\3\uffff\1\34\1\37\6\uffff\1\40";
    static final String DFA14_specialS =
        "\1\3\31\uffff\1\0\3\uffff\1\5\42\uffff\1\4\1\2\33\uffff\1\1\156\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\32\4\41\1\36\1\15\1\16\2\41\1\30\1\41\1\20\1\37\12\31\1\17\1\41\1\6\1\5\2\41\1\33\32\35\1\22\1\41\1\23\1\34\1\35\1\41\1\1\1\27\1\12\1\2\1\26\3\35\1\21\3\35\1\14\1\25\1\24\1\13\1\35\1\4\1\3\1\7\6\35\1\10\1\41\1\11\uff82\41",
            "\1\42",
            "\1\44\11\uffff\1\45",
            "\1\46",
            "\1\47\17\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53\6\uffff\1\54",
            "",
            "",
            "\1\57\6\uffff\1\60",
            "\1\61\2\uffff\1\62",
            "\1\63",
            "",
            "",
            "",
            "",
            "\1\70",
            "",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "\42\102\1\103\71\102\1\101\uffa3\102",
            "\32\104\4\uffff\1\104\1\uffff\32\104",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\0\105",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "\1\117",
            "\1\121",
            "\1\122",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125\5\uffff\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "\0\136",
            "\42\102\1\103\71\102\1\101\uffa3\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\42\102\1\103\71\102\1\101\uffa3\102",
            "",
            "\1\163",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\165",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\167",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0083",
            "\1\u0084",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0087",
            "",
            "\1\u0088",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0094",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u009e",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00a0",
            "\12\43\1\u00a1\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a3",
            "\1\u00a4",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00a6",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\u00a9\3\uffff\1\u00a8",
            "\1\u00aa",
            "",
            "\1\u00ac\1\u00ab",
            "",
            "\1\u00ad",
            "\1\u00af\32\uffff\1\u00b0\5\uffff\1\u00ae",
            "\1\u00b1",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c6",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | RULE_INT | RULE_STRING_LIT | RULE_ANNOTATION_ID | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( (LA14_26=='\\') ) {s = 65;}

                        else if ( ((LA14_26>='\u0000' && LA14_26<='!')||(LA14_26>='#' && LA14_26<='[')||(LA14_26>=']' && LA14_26<='\uFFFF')) ) {s = 66;}

                        else if ( (LA14_26=='\"') ) {s = 67;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_94 = input.LA(1);

                        s = -1;
                        if ( (LA14_94=='\"') ) {s = 67;}

                        else if ( (LA14_94=='\\') ) {s = 65;}

                        else if ( ((LA14_94>='\u0000' && LA14_94<='!')||(LA14_94>='#' && LA14_94<='[')||(LA14_94>=']' && LA14_94<='\uFFFF')) ) {s = 66;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_66 = input.LA(1);

                        s = -1;
                        if ( (LA14_66=='\"') ) {s = 67;}

                        else if ( (LA14_66=='\\') ) {s = 65;}

                        else if ( ((LA14_66>='\u0000' && LA14_66<='!')||(LA14_66>='#' && LA14_66<='[')||(LA14_66>=']' && LA14_66<='\uFFFF')) ) {s = 66;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='a') ) {s = 1;}

                        else if ( (LA14_0=='d') ) {s = 2;}

                        else if ( (LA14_0=='s') ) {s = 3;}

                        else if ( (LA14_0=='r') ) {s = 4;}

                        else if ( (LA14_0=='=') ) {s = 5;}

                        else if ( (LA14_0=='<') ) {s = 6;}

                        else if ( (LA14_0=='t') ) {s = 7;}

                        else if ( (LA14_0=='{') ) {s = 8;}

                        else if ( (LA14_0=='}') ) {s = 9;}

                        else if ( (LA14_0=='c') ) {s = 10;}

                        else if ( (LA14_0=='p') ) {s = 11;}

                        else if ( (LA14_0=='m') ) {s = 12;}

                        else if ( (LA14_0=='(') ) {s = 13;}

                        else if ( (LA14_0==')') ) {s = 14;}

                        else if ( (LA14_0==':') ) {s = 15;}

                        else if ( (LA14_0=='.') ) {s = 16;}

                        else if ( (LA14_0=='i') ) {s = 17;}

                        else if ( (LA14_0=='[') ) {s = 18;}

                        else if ( (LA14_0==']') ) {s = 19;}

                        else if ( (LA14_0=='o') ) {s = 20;}

                        else if ( (LA14_0=='n') ) {s = 21;}

                        else if ( (LA14_0=='e') ) {s = 22;}

                        else if ( (LA14_0=='b') ) {s = 23;}

                        else if ( (LA14_0==',') ) {s = 24;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 25;}

                        else if ( (LA14_0=='\"') ) {s = 26;}

                        else if ( (LA14_0=='@') ) {s = 27;}

                        else if ( (LA14_0=='^') ) {s = 28;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='f' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='l')||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')) ) {s = 29;}

                        else if ( (LA14_0=='\'') ) {s = 30;}

                        else if ( (LA14_0=='/') ) {s = 31;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 32;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||LA14_0=='-'||LA14_0==';'||(LA14_0>='>' && LA14_0<='?')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_65 = input.LA(1);

                        s = -1;
                        if ( ((LA14_65>='\u0000' && LA14_65<='\uFFFF')) ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_30 = input.LA(1);

                        s = -1;
                        if ( ((LA14_30>='\u0000' && LA14_30<='\uFFFF')) ) {s = 69;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}