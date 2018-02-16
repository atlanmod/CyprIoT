package lang.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import lang.services.IotlangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIotlangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_ID", "RULE_STRING_LIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'deny'", "'send'", "'receive'", "'=>'", "'<=>'", "'<='", "'thing'", "'{'", "'}'", "'channel:pubsub'", "'channel:ptp'", "'policy'", "'port'", "'protocol'", "'message'", "'topic'", "'('", "')'", "'rule'", "':'", "'.'", "'message:'", "'domain'", "'instanceThing'", "'['", "']'", "'instancePubSub'", "'over'", "'instancePTP'", "'instancePolicy'", "'networkConfiguration'", "'enforce'", "'bind'", "','", "'connect'"
    };
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


        public InternalIotlangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIotlangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIotlangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIotlang.g"; }


    	private IotlangGrammarAccess grammarAccess;

    	public void setGrammarAccess(IotlangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleIoTLangModel"
    // InternalIotlang.g:53:1: entryRuleIoTLangModel : ruleIoTLangModel EOF ;
    public final void entryRuleIoTLangModel() throws RecognitionException {
        try {
            // InternalIotlang.g:54:1: ( ruleIoTLangModel EOF )
            // InternalIotlang.g:55:1: ruleIoTLangModel EOF
            {
             before(grammarAccess.getIoTLangModelRule()); 
            pushFollow(FOLLOW_1);
            ruleIoTLangModel();

            state._fsp--;

             after(grammarAccess.getIoTLangModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIoTLangModel"


    // $ANTLR start "ruleIoTLangModel"
    // InternalIotlang.g:62:1: ruleIoTLangModel : ( ( rule__IoTLangModel__Alternatives )* ) ;
    public final void ruleIoTLangModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:66:2: ( ( ( rule__IoTLangModel__Alternatives )* ) )
            // InternalIotlang.g:67:2: ( ( rule__IoTLangModel__Alternatives )* )
            {
            // InternalIotlang.g:67:2: ( ( rule__IoTLangModel__Alternatives )* )
            // InternalIotlang.g:68:3: ( rule__IoTLangModel__Alternatives )*
            {
             before(grammarAccess.getIoTLangModelAccess().getAlternatives()); 
            // InternalIotlang.g:69:3: ( rule__IoTLangModel__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||(LA1_0>=23 && LA1_0<=25)||(LA1_0>=27 && LA1_0<=28)||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIotlang.g:69:4: rule__IoTLangModel__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__IoTLangModel__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getIoTLangModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIoTLangModel"


    // $ANTLR start "entryRulePlatformAnnotation"
    // InternalIotlang.g:78:1: entryRulePlatformAnnotation : rulePlatformAnnotation EOF ;
    public final void entryRulePlatformAnnotation() throws RecognitionException {
        try {
            // InternalIotlang.g:79:1: ( rulePlatformAnnotation EOF )
            // InternalIotlang.g:80:1: rulePlatformAnnotation EOF
            {
             before(grammarAccess.getPlatformAnnotationRule()); 
            pushFollow(FOLLOW_1);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getPlatformAnnotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlatformAnnotation"


    // $ANTLR start "rulePlatformAnnotation"
    // InternalIotlang.g:87:1: rulePlatformAnnotation : ( ( rule__PlatformAnnotation__Group__0 ) ) ;
    public final void rulePlatformAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:91:2: ( ( ( rule__PlatformAnnotation__Group__0 ) ) )
            // InternalIotlang.g:92:2: ( ( rule__PlatformAnnotation__Group__0 ) )
            {
            // InternalIotlang.g:92:2: ( ( rule__PlatformAnnotation__Group__0 ) )
            // InternalIotlang.g:93:3: ( rule__PlatformAnnotation__Group__0 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getGroup()); 
            // InternalIotlang.g:94:3: ( rule__PlatformAnnotation__Group__0 )
            // InternalIotlang.g:94:4: rule__PlatformAnnotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlatformAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlatformAnnotation"


    // $ANTLR start "entryRuleThing"
    // InternalIotlang.g:103:1: entryRuleThing : ruleThing EOF ;
    public final void entryRuleThing() throws RecognitionException {
        try {
            // InternalIotlang.g:104:1: ( ruleThing EOF )
            // InternalIotlang.g:105:1: ruleThing EOF
            {
             before(grammarAccess.getThingRule()); 
            pushFollow(FOLLOW_1);
            ruleThing();

            state._fsp--;

             after(grammarAccess.getThingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThing"


    // $ANTLR start "ruleThing"
    // InternalIotlang.g:112:1: ruleThing : ( ( rule__Thing__Group__0 ) ) ;
    public final void ruleThing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:116:2: ( ( ( rule__Thing__Group__0 ) ) )
            // InternalIotlang.g:117:2: ( ( rule__Thing__Group__0 ) )
            {
            // InternalIotlang.g:117:2: ( ( rule__Thing__Group__0 ) )
            // InternalIotlang.g:118:3: ( rule__Thing__Group__0 )
            {
             before(grammarAccess.getThingAccess().getGroup()); 
            // InternalIotlang.g:119:3: ( rule__Thing__Group__0 )
            // InternalIotlang.g:119:4: rule__Thing__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Thing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThing"


    // $ANTLR start "entryRuleChannel"
    // InternalIotlang.g:128:1: entryRuleChannel : ruleChannel EOF ;
    public final void entryRuleChannel() throws RecognitionException {
        try {
            // InternalIotlang.g:129:1: ( ruleChannel EOF )
            // InternalIotlang.g:130:1: ruleChannel EOF
            {
             before(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getChannelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalIotlang.g:137:1: ruleChannel : ( ( rule__Channel__Alternatives ) ) ;
    public final void ruleChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:141:2: ( ( ( rule__Channel__Alternatives ) ) )
            // InternalIotlang.g:142:2: ( ( rule__Channel__Alternatives ) )
            {
            // InternalIotlang.g:142:2: ( ( rule__Channel__Alternatives ) )
            // InternalIotlang.g:143:3: ( rule__Channel__Alternatives )
            {
             before(grammarAccess.getChannelAccess().getAlternatives()); 
            // InternalIotlang.g:144:3: ( rule__Channel__Alternatives )
            // InternalIotlang.g:144:4: rule__Channel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRulePubSub"
    // InternalIotlang.g:153:1: entryRulePubSub : rulePubSub EOF ;
    public final void entryRulePubSub() throws RecognitionException {
        try {
            // InternalIotlang.g:154:1: ( rulePubSub EOF )
            // InternalIotlang.g:155:1: rulePubSub EOF
            {
             before(grammarAccess.getPubSubRule()); 
            pushFollow(FOLLOW_1);
            rulePubSub();

            state._fsp--;

             after(grammarAccess.getPubSubRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePubSub"


    // $ANTLR start "rulePubSub"
    // InternalIotlang.g:162:1: rulePubSub : ( ( rule__PubSub__Group__0 ) ) ;
    public final void rulePubSub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:166:2: ( ( ( rule__PubSub__Group__0 ) ) )
            // InternalIotlang.g:167:2: ( ( rule__PubSub__Group__0 ) )
            {
            // InternalIotlang.g:167:2: ( ( rule__PubSub__Group__0 ) )
            // InternalIotlang.g:168:3: ( rule__PubSub__Group__0 )
            {
             before(grammarAccess.getPubSubAccess().getGroup()); 
            // InternalIotlang.g:169:3: ( rule__PubSub__Group__0 )
            // InternalIotlang.g:169:4: rule__PubSub__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PubSub__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPubSubAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePubSub"


    // $ANTLR start "entryRulePointToPoint"
    // InternalIotlang.g:178:1: entryRulePointToPoint : rulePointToPoint EOF ;
    public final void entryRulePointToPoint() throws RecognitionException {
        try {
            // InternalIotlang.g:179:1: ( rulePointToPoint EOF )
            // InternalIotlang.g:180:1: rulePointToPoint EOF
            {
             before(grammarAccess.getPointToPointRule()); 
            pushFollow(FOLLOW_1);
            rulePointToPoint();

            state._fsp--;

             after(grammarAccess.getPointToPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePointToPoint"


    // $ANTLR start "rulePointToPoint"
    // InternalIotlang.g:187:1: rulePointToPoint : ( ( rule__PointToPoint__Group__0 ) ) ;
    public final void rulePointToPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:191:2: ( ( ( rule__PointToPoint__Group__0 ) ) )
            // InternalIotlang.g:192:2: ( ( rule__PointToPoint__Group__0 ) )
            {
            // InternalIotlang.g:192:2: ( ( rule__PointToPoint__Group__0 ) )
            // InternalIotlang.g:193:3: ( rule__PointToPoint__Group__0 )
            {
             before(grammarAccess.getPointToPointAccess().getGroup()); 
            // InternalIotlang.g:194:3: ( rule__PointToPoint__Group__0 )
            // InternalIotlang.g:194:4: rule__PointToPoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointToPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePointToPoint"


    // $ANTLR start "entryRulePolicy"
    // InternalIotlang.g:203:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalIotlang.g:204:1: ( rulePolicy EOF )
            // InternalIotlang.g:205:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalIotlang.g:212:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:216:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalIotlang.g:217:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalIotlang.g:217:2: ( ( rule__Policy__Group__0 ) )
            // InternalIotlang.g:218:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalIotlang.g:219:3: ( rule__Policy__Group__0 )
            // InternalIotlang.g:219:4: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRulePort"
    // InternalIotlang.g:228:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalIotlang.g:229:1: ( rulePort EOF )
            // InternalIotlang.g:230:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalIotlang.g:237:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:241:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalIotlang.g:242:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalIotlang.g:242:2: ( ( rule__Port__Group__0 ) )
            // InternalIotlang.g:243:3: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalIotlang.g:244:3: ( rule__Port__Group__0 )
            // InternalIotlang.g:244:4: rule__Port__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleProtocol"
    // InternalIotlang.g:253:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalIotlang.g:254:1: ( ruleProtocol EOF )
            // InternalIotlang.g:255:1: ruleProtocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalIotlang.g:262:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:266:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // InternalIotlang.g:267:2: ( ( rule__Protocol__Group__0 ) )
            {
            // InternalIotlang.g:267:2: ( ( rule__Protocol__Group__0 ) )
            // InternalIotlang.g:268:3: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // InternalIotlang.g:269:3: ( rule__Protocol__Group__0 )
            // InternalIotlang.g:269:4: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleMessage"
    // InternalIotlang.g:278:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalIotlang.g:279:1: ( ruleMessage EOF )
            // InternalIotlang.g:280:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalIotlang.g:287:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:291:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalIotlang.g:292:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalIotlang.g:292:2: ( ( rule__Message__Group__0 ) )
            // InternalIotlang.g:293:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalIotlang.g:294:3: ( rule__Message__Group__0 )
            // InternalIotlang.g:294:4: rule__Message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleTopic"
    // InternalIotlang.g:303:1: entryRuleTopic : ruleTopic EOF ;
    public final void entryRuleTopic() throws RecognitionException {
        try {
            // InternalIotlang.g:304:1: ( ruleTopic EOF )
            // InternalIotlang.g:305:1: ruleTopic EOF
            {
             before(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getTopicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalIotlang.g:312:1: ruleTopic : ( ( rule__Topic__Group__0 ) ) ;
    public final void ruleTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:316:2: ( ( ( rule__Topic__Group__0 ) ) )
            // InternalIotlang.g:317:2: ( ( rule__Topic__Group__0 ) )
            {
            // InternalIotlang.g:317:2: ( ( rule__Topic__Group__0 ) )
            // InternalIotlang.g:318:3: ( rule__Topic__Group__0 )
            {
             before(grammarAccess.getTopicAccess().getGroup()); 
            // InternalIotlang.g:319:3: ( rule__Topic__Group__0 )
            // InternalIotlang.g:319:4: rule__Topic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRuleRule"
    // InternalIotlang.g:328:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalIotlang.g:329:1: ( ruleRule EOF )
            // InternalIotlang.g:330:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalIotlang.g:337:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:341:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalIotlang.g:342:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalIotlang.g:342:2: ( ( rule__Rule__Group__0 ) )
            // InternalIotlang.g:343:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalIotlang.g:344:3: ( rule__Rule__Group__0 )
            // InternalIotlang.g:344:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDomain"
    // InternalIotlang.g:353:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalIotlang.g:354:1: ( ruleDomain EOF )
            // InternalIotlang.g:355:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalIotlang.g:362:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:366:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalIotlang.g:367:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalIotlang.g:367:2: ( ( rule__Domain__Group__0 ) )
            // InternalIotlang.g:368:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalIotlang.g:369:3: ( rule__Domain__Group__0 )
            // InternalIotlang.g:369:4: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleInstanceThing"
    // InternalIotlang.g:378:1: entryRuleInstanceThing : ruleInstanceThing EOF ;
    public final void entryRuleInstanceThing() throws RecognitionException {
        try {
            // InternalIotlang.g:379:1: ( ruleInstanceThing EOF )
            // InternalIotlang.g:380:1: ruleInstanceThing EOF
            {
             before(grammarAccess.getInstanceThingRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceThing();

            state._fsp--;

             after(grammarAccess.getInstanceThingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceThing"


    // $ANTLR start "ruleInstanceThing"
    // InternalIotlang.g:387:1: ruleInstanceThing : ( ( rule__InstanceThing__Group__0 ) ) ;
    public final void ruleInstanceThing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:391:2: ( ( ( rule__InstanceThing__Group__0 ) ) )
            // InternalIotlang.g:392:2: ( ( rule__InstanceThing__Group__0 ) )
            {
            // InternalIotlang.g:392:2: ( ( rule__InstanceThing__Group__0 ) )
            // InternalIotlang.g:393:3: ( rule__InstanceThing__Group__0 )
            {
             before(grammarAccess.getInstanceThingAccess().getGroup()); 
            // InternalIotlang.g:394:3: ( rule__InstanceThing__Group__0 )
            // InternalIotlang.g:394:4: rule__InstanceThing__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceThingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceThing"


    // $ANTLR start "entryRuleInstancePubSub"
    // InternalIotlang.g:403:1: entryRuleInstancePubSub : ruleInstancePubSub EOF ;
    public final void entryRuleInstancePubSub() throws RecognitionException {
        try {
            // InternalIotlang.g:404:1: ( ruleInstancePubSub EOF )
            // InternalIotlang.g:405:1: ruleInstancePubSub EOF
            {
             before(grammarAccess.getInstancePubSubRule()); 
            pushFollow(FOLLOW_1);
            ruleInstancePubSub();

            state._fsp--;

             after(grammarAccess.getInstancePubSubRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstancePubSub"


    // $ANTLR start "ruleInstancePubSub"
    // InternalIotlang.g:412:1: ruleInstancePubSub : ( ( rule__InstancePubSub__Group__0 ) ) ;
    public final void ruleInstancePubSub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:416:2: ( ( ( rule__InstancePubSub__Group__0 ) ) )
            // InternalIotlang.g:417:2: ( ( rule__InstancePubSub__Group__0 ) )
            {
            // InternalIotlang.g:417:2: ( ( rule__InstancePubSub__Group__0 ) )
            // InternalIotlang.g:418:3: ( rule__InstancePubSub__Group__0 )
            {
             before(grammarAccess.getInstancePubSubAccess().getGroup()); 
            // InternalIotlang.g:419:3: ( rule__InstancePubSub__Group__0 )
            // InternalIotlang.g:419:4: rule__InstancePubSub__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstancePubSubAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstancePubSub"


    // $ANTLR start "entryRuleInstancePtP"
    // InternalIotlang.g:428:1: entryRuleInstancePtP : ruleInstancePtP EOF ;
    public final void entryRuleInstancePtP() throws RecognitionException {
        try {
            // InternalIotlang.g:429:1: ( ruleInstancePtP EOF )
            // InternalIotlang.g:430:1: ruleInstancePtP EOF
            {
             before(grammarAccess.getInstancePtPRule()); 
            pushFollow(FOLLOW_1);
            ruleInstancePtP();

            state._fsp--;

             after(grammarAccess.getInstancePtPRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstancePtP"


    // $ANTLR start "ruleInstancePtP"
    // InternalIotlang.g:437:1: ruleInstancePtP : ( ( rule__InstancePtP__Group__0 ) ) ;
    public final void ruleInstancePtP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:441:2: ( ( ( rule__InstancePtP__Group__0 ) ) )
            // InternalIotlang.g:442:2: ( ( rule__InstancePtP__Group__0 ) )
            {
            // InternalIotlang.g:442:2: ( ( rule__InstancePtP__Group__0 ) )
            // InternalIotlang.g:443:3: ( rule__InstancePtP__Group__0 )
            {
             before(grammarAccess.getInstancePtPAccess().getGroup()); 
            // InternalIotlang.g:444:3: ( rule__InstancePtP__Group__0 )
            // InternalIotlang.g:444:4: rule__InstancePtP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstancePtPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstancePtP"


    // $ANTLR start "entryRuleInstanceChannel"
    // InternalIotlang.g:453:1: entryRuleInstanceChannel : ruleInstanceChannel EOF ;
    public final void entryRuleInstanceChannel() throws RecognitionException {
        try {
            // InternalIotlang.g:454:1: ( ruleInstanceChannel EOF )
            // InternalIotlang.g:455:1: ruleInstanceChannel EOF
            {
             before(grammarAccess.getInstanceChannelRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceChannel();

            state._fsp--;

             after(grammarAccess.getInstanceChannelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceChannel"


    // $ANTLR start "ruleInstanceChannel"
    // InternalIotlang.g:462:1: ruleInstanceChannel : ( ( rule__InstanceChannel__Alternatives ) ) ;
    public final void ruleInstanceChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:466:2: ( ( ( rule__InstanceChannel__Alternatives ) ) )
            // InternalIotlang.g:467:2: ( ( rule__InstanceChannel__Alternatives ) )
            {
            // InternalIotlang.g:467:2: ( ( rule__InstanceChannel__Alternatives ) )
            // InternalIotlang.g:468:3: ( rule__InstanceChannel__Alternatives )
            {
             before(grammarAccess.getInstanceChannelAccess().getAlternatives()); 
            // InternalIotlang.g:469:3: ( rule__InstanceChannel__Alternatives )
            // InternalIotlang.g:469:4: rule__InstanceChannel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstanceChannelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceChannel"


    // $ANTLR start "entryRuleInstancePolicy"
    // InternalIotlang.g:478:1: entryRuleInstancePolicy : ruleInstancePolicy EOF ;
    public final void entryRuleInstancePolicy() throws RecognitionException {
        try {
            // InternalIotlang.g:479:1: ( ruleInstancePolicy EOF )
            // InternalIotlang.g:480:1: ruleInstancePolicy EOF
            {
             before(grammarAccess.getInstancePolicyRule()); 
            pushFollow(FOLLOW_1);
            ruleInstancePolicy();

            state._fsp--;

             after(grammarAccess.getInstancePolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstancePolicy"


    // $ANTLR start "ruleInstancePolicy"
    // InternalIotlang.g:487:1: ruleInstancePolicy : ( ( rule__InstancePolicy__Group__0 ) ) ;
    public final void ruleInstancePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:491:2: ( ( ( rule__InstancePolicy__Group__0 ) ) )
            // InternalIotlang.g:492:2: ( ( rule__InstancePolicy__Group__0 ) )
            {
            // InternalIotlang.g:492:2: ( ( rule__InstancePolicy__Group__0 ) )
            // InternalIotlang.g:493:3: ( rule__InstancePolicy__Group__0 )
            {
             before(grammarAccess.getInstancePolicyAccess().getGroup()); 
            // InternalIotlang.g:494:3: ( rule__InstancePolicy__Group__0 )
            // InternalIotlang.g:494:4: rule__InstancePolicy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstancePolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstancePolicy"


    // $ANTLR start "entryRuleNetworkConfiguration"
    // InternalIotlang.g:503:1: entryRuleNetworkConfiguration : ruleNetworkConfiguration EOF ;
    public final void entryRuleNetworkConfiguration() throws RecognitionException {
        try {
            // InternalIotlang.g:504:1: ( ruleNetworkConfiguration EOF )
            // InternalIotlang.g:505:1: ruleNetworkConfiguration EOF
            {
             before(grammarAccess.getNetworkConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleNetworkConfiguration();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNetworkConfiguration"


    // $ANTLR start "ruleNetworkConfiguration"
    // InternalIotlang.g:512:1: ruleNetworkConfiguration : ( ( rule__NetworkConfiguration__Group__0 ) ) ;
    public final void ruleNetworkConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:516:2: ( ( ( rule__NetworkConfiguration__Group__0 ) ) )
            // InternalIotlang.g:517:2: ( ( rule__NetworkConfiguration__Group__0 ) )
            {
            // InternalIotlang.g:517:2: ( ( rule__NetworkConfiguration__Group__0 ) )
            // InternalIotlang.g:518:3: ( rule__NetworkConfiguration__Group__0 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getGroup()); 
            // InternalIotlang.g:519:3: ( rule__NetworkConfiguration__Group__0 )
            // InternalIotlang.g:519:4: rule__NetworkConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetworkConfiguration"


    // $ANTLR start "entryRuleBind"
    // InternalIotlang.g:528:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // InternalIotlang.g:529:1: ( ruleBind EOF )
            // InternalIotlang.g:530:1: ruleBind EOF
            {
             before(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_1);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getBindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // InternalIotlang.g:537:1: ruleBind : ( ( rule__Bind__Group__0 ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:541:2: ( ( ( rule__Bind__Group__0 ) ) )
            // InternalIotlang.g:542:2: ( ( rule__Bind__Group__0 ) )
            {
            // InternalIotlang.g:542:2: ( ( rule__Bind__Group__0 ) )
            // InternalIotlang.g:543:3: ( rule__Bind__Group__0 )
            {
             before(grammarAccess.getBindAccess().getGroup()); 
            // InternalIotlang.g:544:3: ( rule__Bind__Group__0 )
            // InternalIotlang.g:544:4: rule__Bind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBind"


    // $ANTLR start "entryRuleConnect"
    // InternalIotlang.g:553:1: entryRuleConnect : ruleConnect EOF ;
    public final void entryRuleConnect() throws RecognitionException {
        try {
            // InternalIotlang.g:554:1: ( ruleConnect EOF )
            // InternalIotlang.g:555:1: ruleConnect EOF
            {
             before(grammarAccess.getConnectRule()); 
            pushFollow(FOLLOW_1);
            ruleConnect();

            state._fsp--;

             after(grammarAccess.getConnectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnect"


    // $ANTLR start "ruleConnect"
    // InternalIotlang.g:562:1: ruleConnect : ( ( rule__Connect__Group__0 ) ) ;
    public final void ruleConnect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:566:2: ( ( ( rule__Connect__Group__0 ) ) )
            // InternalIotlang.g:567:2: ( ( rule__Connect__Group__0 ) )
            {
            // InternalIotlang.g:567:2: ( ( rule__Connect__Group__0 ) )
            // InternalIotlang.g:568:3: ( rule__Connect__Group__0 )
            {
             before(grammarAccess.getConnectAccess().getGroup()); 
            // InternalIotlang.g:569:3: ( rule__Connect__Group__0 )
            // InternalIotlang.g:569:4: rule__Connect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnect"


    // $ANTLR start "rule__IoTLangModel__Alternatives"
    // InternalIotlang.g:577:1: rule__IoTLangModel__Alternatives : ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__MessagesAssignment_2 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_3 ) ) | ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_5 ) ) );
    public final void rule__IoTLangModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:581:1: ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__MessagesAssignment_2 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_3 ) ) | ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 23:
            case 24:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            case 44:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalIotlang.g:582:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    {
                    // InternalIotlang.g:582:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    // InternalIotlang.g:583:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getThingsAssignment_0()); 
                    // InternalIotlang.g:584:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    // InternalIotlang.g:584:4: rule__IoTLangModel__ThingsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__ThingsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getThingsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:588:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    {
                    // InternalIotlang.g:588:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    // InternalIotlang.g:589:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getPoliciesAssignment_1()); 
                    // InternalIotlang.g:590:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    // InternalIotlang.g:590:4: rule__IoTLangModel__PoliciesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__PoliciesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getPoliciesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:594:2: ( ( rule__IoTLangModel__MessagesAssignment_2 ) )
                    {
                    // InternalIotlang.g:594:2: ( ( rule__IoTLangModel__MessagesAssignment_2 ) )
                    // InternalIotlang.g:595:3: ( rule__IoTLangModel__MessagesAssignment_2 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getMessagesAssignment_2()); 
                    // InternalIotlang.g:596:3: ( rule__IoTLangModel__MessagesAssignment_2 )
                    // InternalIotlang.g:596:4: rule__IoTLangModel__MessagesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__MessagesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getMessagesAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIotlang.g:600:2: ( ( rule__IoTLangModel__ChannelsAssignment_3 ) )
                    {
                    // InternalIotlang.g:600:2: ( ( rule__IoTLangModel__ChannelsAssignment_3 ) )
                    // InternalIotlang.g:601:3: ( rule__IoTLangModel__ChannelsAssignment_3 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getChannelsAssignment_3()); 
                    // InternalIotlang.g:602:3: ( rule__IoTLangModel__ChannelsAssignment_3 )
                    // InternalIotlang.g:602:4: rule__IoTLangModel__ChannelsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__ChannelsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getChannelsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIotlang.g:606:2: ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) )
                    {
                    // InternalIotlang.g:606:2: ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) )
                    // InternalIotlang.g:607:3: ( rule__IoTLangModel__ProtocolsAssignment_4 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getProtocolsAssignment_4()); 
                    // InternalIotlang.g:608:3: ( rule__IoTLangModel__ProtocolsAssignment_4 )
                    // InternalIotlang.g:608:4: rule__IoTLangModel__ProtocolsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__ProtocolsAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getProtocolsAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIotlang.g:612:2: ( ( rule__IoTLangModel__ConfigsAssignment_5 ) )
                    {
                    // InternalIotlang.g:612:2: ( ( rule__IoTLangModel__ConfigsAssignment_5 ) )
                    // InternalIotlang.g:613:3: ( rule__IoTLangModel__ConfigsAssignment_5 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getConfigsAssignment_5()); 
                    // InternalIotlang.g:614:3: ( rule__IoTLangModel__ConfigsAssignment_5 )
                    // InternalIotlang.g:614:4: rule__IoTLangModel__ConfigsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__ConfigsAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getConfigsAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__Alternatives"


    // $ANTLR start "rule__Channel__Alternatives"
    // InternalIotlang.g:622:1: rule__Channel__Alternatives : ( ( ( rule__Channel__PubSubAssignment_0 ) ) | ( ( rule__Channel__PointToPointAssignment_1 ) ) );
    public final void rule__Channel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:626:1: ( ( ( rule__Channel__PubSubAssignment_0 ) ) | ( ( rule__Channel__PointToPointAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIotlang.g:627:2: ( ( rule__Channel__PubSubAssignment_0 ) )
                    {
                    // InternalIotlang.g:627:2: ( ( rule__Channel__PubSubAssignment_0 ) )
                    // InternalIotlang.g:628:3: ( rule__Channel__PubSubAssignment_0 )
                    {
                     before(grammarAccess.getChannelAccess().getPubSubAssignment_0()); 
                    // InternalIotlang.g:629:3: ( rule__Channel__PubSubAssignment_0 )
                    // InternalIotlang.g:629:4: rule__Channel__PubSubAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Channel__PubSubAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChannelAccess().getPubSubAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:633:2: ( ( rule__Channel__PointToPointAssignment_1 ) )
                    {
                    // InternalIotlang.g:633:2: ( ( rule__Channel__PointToPointAssignment_1 ) )
                    // InternalIotlang.g:634:3: ( rule__Channel__PointToPointAssignment_1 )
                    {
                     before(grammarAccess.getChannelAccess().getPointToPointAssignment_1()); 
                    // InternalIotlang.g:635:3: ( rule__Channel__PointToPointAssignment_1 )
                    // InternalIotlang.g:635:4: rule__Channel__PointToPointAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Channel__PointToPointAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getChannelAccess().getPointToPointAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Alternatives"


    // $ANTLR start "rule__Rule__PermissionAlternatives_3_0"
    // InternalIotlang.g:643:1: rule__Rule__PermissionAlternatives_3_0 : ( ( 'allow' ) | ( 'deny' ) );
    public final void rule__Rule__PermissionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:647:1: ( ( 'allow' ) | ( 'deny' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalIotlang.g:648:2: ( 'allow' )
                    {
                    // InternalIotlang.g:648:2: ( 'allow' )
                    // InternalIotlang.g:649:3: 'allow'
                    {
                     before(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:654:2: ( 'deny' )
                    {
                    // InternalIotlang.g:654:2: ( 'deny' )
                    // InternalIotlang.g:655:3: 'deny'
                    {
                     before(grammarAccess.getRuleAccess().getPermissionDenyKeyword_3_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getPermissionDenyKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PermissionAlternatives_3_0"


    // $ANTLR start "rule__Rule__ActionAlternatives_5_0"
    // InternalIotlang.g:664:1: rule__Rule__ActionAlternatives_5_0 : ( ( 'send' ) | ( 'receive' ) );
    public final void rule__Rule__ActionAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:668:1: ( ( 'send' ) | ( 'receive' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalIotlang.g:669:2: ( 'send' )
                    {
                    // InternalIotlang.g:669:2: ( 'send' )
                    // InternalIotlang.g:670:3: 'send'
                    {
                     before(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:675:2: ( 'receive' )
                    {
                    // InternalIotlang.g:675:2: ( 'receive' )
                    // InternalIotlang.g:676:3: 'receive'
                    {
                     before(grammarAccess.getRuleAccess().getActionReceiveKeyword_5_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getActionReceiveKeyword_5_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionAlternatives_5_0"


    // $ANTLR start "rule__Rule__Alternatives_6"
    // InternalIotlang.g:685:1: rule__Rule__Alternatives_6 : ( ( ( rule__Rule__Group_6_0__0 ) ) | ( ( rule__Rule__Group_6_1__0 ) ) );
    public final void rule__Rule__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:689:1: ( ( ( rule__Rule__Group_6_0__0 ) ) | ( ( rule__Rule__Group_6_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==35) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalIotlang.g:690:2: ( ( rule__Rule__Group_6_0__0 ) )
                    {
                    // InternalIotlang.g:690:2: ( ( rule__Rule__Group_6_0__0 ) )
                    // InternalIotlang.g:691:3: ( rule__Rule__Group_6_0__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_6_0()); 
                    // InternalIotlang.g:692:3: ( rule__Rule__Group_6_0__0 )
                    // InternalIotlang.g:692:4: rule__Rule__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:696:2: ( ( rule__Rule__Group_6_1__0 ) )
                    {
                    // InternalIotlang.g:696:2: ( ( rule__Rule__Group_6_1__0 ) )
                    // InternalIotlang.g:697:3: ( rule__Rule__Group_6_1__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_6_1()); 
                    // InternalIotlang.g:698:3: ( rule__Rule__Group_6_1__0 )
                    // InternalIotlang.g:698:4: rule__Rule__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getGroup_6_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_6"


    // $ANTLR start "rule__InstanceChannel__Alternatives"
    // InternalIotlang.g:706:1: rule__InstanceChannel__Alternatives : ( ( ( rule__InstanceChannel__InstancesPubSubAssignment_0 ) ) | ( ( rule__InstanceChannel__InstancesPtpAssignment_1 ) ) );
    public final void rule__InstanceChannel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:710:1: ( ( ( rule__InstanceChannel__InstancesPubSubAssignment_0 ) ) | ( ( rule__InstanceChannel__InstancesPtpAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==40) ) {
                alt7=1;
            }
            else if ( (LA7_0==42) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIotlang.g:711:2: ( ( rule__InstanceChannel__InstancesPubSubAssignment_0 ) )
                    {
                    // InternalIotlang.g:711:2: ( ( rule__InstanceChannel__InstancesPubSubAssignment_0 ) )
                    // InternalIotlang.g:712:3: ( rule__InstanceChannel__InstancesPubSubAssignment_0 )
                    {
                     before(grammarAccess.getInstanceChannelAccess().getInstancesPubSubAssignment_0()); 
                    // InternalIotlang.g:713:3: ( rule__InstanceChannel__InstancesPubSubAssignment_0 )
                    // InternalIotlang.g:713:4: rule__InstanceChannel__InstancesPubSubAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanceChannel__InstancesPubSubAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstanceChannelAccess().getInstancesPubSubAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:717:2: ( ( rule__InstanceChannel__InstancesPtpAssignment_1 ) )
                    {
                    // InternalIotlang.g:717:2: ( ( rule__InstanceChannel__InstancesPtpAssignment_1 ) )
                    // InternalIotlang.g:718:3: ( rule__InstanceChannel__InstancesPtpAssignment_1 )
                    {
                     before(grammarAccess.getInstanceChannelAccess().getInstancesPtpAssignment_1()); 
                    // InternalIotlang.g:719:3: ( rule__InstanceChannel__InstancesPtpAssignment_1 )
                    // InternalIotlang.g:719:4: rule__InstanceChannel__InstancesPtpAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstanceChannel__InstancesPtpAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstanceChannelAccess().getInstancesPtpAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Alternatives"


    // $ANTLR start "rule__NetworkConfiguration__Alternatives_4"
    // InternalIotlang.g:727:1: rule__NetworkConfiguration__Alternatives_4 : ( ( ( rule__NetworkConfiguration__ConnectsAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__DomainAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_4 ) ) | ( ( rule__NetworkConfiguration__Group_4_5__0 ) ) | ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_6 ) ) );
    public final void rule__NetworkConfiguration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:731:1: ( ( ( rule__NetworkConfiguration__ConnectsAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__DomainAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_4 ) ) | ( ( rule__NetworkConfiguration__Group_4_5__0 ) ) | ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_6 ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 46:
                {
                alt8=3;
                }
                break;
            case 37:
                {
                alt8=4;
                }
                break;
            case 40:
            case 42:
                {
                alt8=5;
                }
                break;
            case 45:
                {
                alt8=6;
                }
                break;
            case 43:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalIotlang.g:732:2: ( ( rule__NetworkConfiguration__ConnectsAssignment_4_0 ) )
                    {
                    // InternalIotlang.g:732:2: ( ( rule__NetworkConfiguration__ConnectsAssignment_4_0 ) )
                    // InternalIotlang.g:733:3: ( rule__NetworkConfiguration__ConnectsAssignment_4_0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getConnectsAssignment_4_0()); 
                    // InternalIotlang.g:734:3: ( rule__NetworkConfiguration__ConnectsAssignment_4_0 )
                    // InternalIotlang.g:734:4: rule__NetworkConfiguration__ConnectsAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__ConnectsAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getConnectsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:738:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_1 ) )
                    {
                    // InternalIotlang.g:738:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_1 ) )
                    // InternalIotlang.g:739:3: ( rule__NetworkConfiguration__DomainAssignment_4_1 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getDomainAssignment_4_1()); 
                    // InternalIotlang.g:740:3: ( rule__NetworkConfiguration__DomainAssignment_4_1 )
                    // InternalIotlang.g:740:4: rule__NetworkConfiguration__DomainAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__DomainAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getDomainAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:744:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_2 ) )
                    {
                    // InternalIotlang.g:744:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_2 ) )
                    // InternalIotlang.g:745:3: ( rule__NetworkConfiguration__BindsAssignment_4_2 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getBindsAssignment_4_2()); 
                    // InternalIotlang.g:746:3: ( rule__NetworkConfiguration__BindsAssignment_4_2 )
                    // InternalIotlang.g:746:4: rule__NetworkConfiguration__BindsAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__BindsAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getBindsAssignment_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIotlang.g:750:2: ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_3 ) )
                    {
                    // InternalIotlang.g:750:2: ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_3 ) )
                    // InternalIotlang.g:751:3: ( rule__NetworkConfiguration__ThingInstancesAssignment_4_3 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getThingInstancesAssignment_4_3()); 
                    // InternalIotlang.g:752:3: ( rule__NetworkConfiguration__ThingInstancesAssignment_4_3 )
                    // InternalIotlang.g:752:4: rule__NetworkConfiguration__ThingInstancesAssignment_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__ThingInstancesAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getThingInstancesAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIotlang.g:756:2: ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_4 ) )
                    {
                    // InternalIotlang.g:756:2: ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_4 ) )
                    // InternalIotlang.g:757:3: ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_4 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesAssignment_4_4()); 
                    // InternalIotlang.g:758:3: ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_4 )
                    // InternalIotlang.g:758:4: rule__NetworkConfiguration__ChannelInstancesAssignment_4_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__ChannelInstancesAssignment_4_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesAssignment_4_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIotlang.g:762:2: ( ( rule__NetworkConfiguration__Group_4_5__0 ) )
                    {
                    // InternalIotlang.g:762:2: ( ( rule__NetworkConfiguration__Group_4_5__0 ) )
                    // InternalIotlang.g:763:3: ( rule__NetworkConfiguration__Group_4_5__0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getGroup_4_5()); 
                    // InternalIotlang.g:764:3: ( rule__NetworkConfiguration__Group_4_5__0 )
                    // InternalIotlang.g:764:4: rule__NetworkConfiguration__Group_4_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__Group_4_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getGroup_4_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalIotlang.g:768:2: ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_6 ) )
                    {
                    // InternalIotlang.g:768:2: ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_6 ) )
                    // InternalIotlang.g:769:3: ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_6 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyAssignment_4_6()); 
                    // InternalIotlang.g:770:3: ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_6 )
                    // InternalIotlang.g:770:4: rule__NetworkConfiguration__InstancePoliciyAssignment_4_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__InstancePoliciyAssignment_4_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyAssignment_4_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Alternatives_4"


    // $ANTLR start "rule__Bind__DirectionAlternatives_3_0"
    // InternalIotlang.g:778:1: rule__Bind__DirectionAlternatives_3_0 : ( ( '=>' ) | ( '<=>' ) | ( '<=' ) );
    public final void rule__Bind__DirectionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:782:1: ( ( '=>' ) | ( '<=>' ) | ( '<=' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalIotlang.g:783:2: ( '=>' )
                    {
                    // InternalIotlang.g:783:2: ( '=>' )
                    // InternalIotlang.g:784:3: '=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:789:2: ( '<=>' )
                    {
                    // InternalIotlang.g:789:2: ( '<=>' )
                    // InternalIotlang.g:790:3: '<=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:795:2: ( '<=' )
                    {
                    // InternalIotlang.g:795:2: ( '<=' )
                    // InternalIotlang.g:796:3: '<='
                    {
                     before(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignKeyword_3_0_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignKeyword_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__DirectionAlternatives_3_0"


    // $ANTLR start "rule__Connect__DirectionAlternatives_3_0"
    // InternalIotlang.g:805:1: rule__Connect__DirectionAlternatives_3_0 : ( ( '=>' ) | ( '<=>' ) | ( '<=' ) );
    public final void rule__Connect__DirectionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:809:1: ( ( '=>' ) | ( '<=>' ) | ( '<=' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalIotlang.g:810:2: ( '=>' )
                    {
                    // InternalIotlang.g:810:2: ( '=>' )
                    // InternalIotlang.g:811:3: '=>'
                    {
                     before(grammarAccess.getConnectAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getConnectAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:816:2: ( '<=>' )
                    {
                    // InternalIotlang.g:816:2: ( '<=>' )
                    // InternalIotlang.g:817:3: '<=>'
                    {
                     before(grammarAccess.getConnectAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConnectAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:822:2: ( '<=' )
                    {
                    // InternalIotlang.g:822:2: ( '<=' )
                    // InternalIotlang.g:823:3: '<='
                    {
                     before(grammarAccess.getConnectAccess().getDirectionLessThanSignEqualsSignKeyword_3_0_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConnectAccess().getDirectionLessThanSignEqualsSignKeyword_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__DirectionAlternatives_3_0"


    // $ANTLR start "rule__PlatformAnnotation__Group__0"
    // InternalIotlang.g:832:1: rule__PlatformAnnotation__Group__0 : rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 ;
    public final void rule__PlatformAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:836:1: ( rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 )
            // InternalIotlang.g:837:2: rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PlatformAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlatformAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__Group__0"


    // $ANTLR start "rule__PlatformAnnotation__Group__0__Impl"
    // InternalIotlang.g:844:1: rule__PlatformAnnotation__Group__0__Impl : ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) ;
    public final void rule__PlatformAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:848:1: ( ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) )
            // InternalIotlang.g:849:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            {
            // InternalIotlang.g:849:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            // InternalIotlang.g:850:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0()); 
            // InternalIotlang.g:851:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            // InternalIotlang.g:851:3: rule__PlatformAnnotation__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PlatformAnnotation__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__Group__0__Impl"


    // $ANTLR start "rule__PlatformAnnotation__Group__1"
    // InternalIotlang.g:859:1: rule__PlatformAnnotation__Group__1 : rule__PlatformAnnotation__Group__1__Impl ;
    public final void rule__PlatformAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:863:1: ( rule__PlatformAnnotation__Group__1__Impl )
            // InternalIotlang.g:864:2: rule__PlatformAnnotation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlatformAnnotation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__Group__1"


    // $ANTLR start "rule__PlatformAnnotation__Group__1__Impl"
    // InternalIotlang.g:870:1: rule__PlatformAnnotation__Group__1__Impl : ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) ;
    public final void rule__PlatformAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:874:1: ( ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) )
            // InternalIotlang.g:875:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            {
            // InternalIotlang.g:875:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            // InternalIotlang.g:876:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1()); 
            // InternalIotlang.g:877:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            // InternalIotlang.g:877:3: rule__PlatformAnnotation__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PlatformAnnotation__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__Group__1__Impl"


    // $ANTLR start "rule__Thing__Group__0"
    // InternalIotlang.g:886:1: rule__Thing__Group__0 : rule__Thing__Group__0__Impl rule__Thing__Group__1 ;
    public final void rule__Thing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:890:1: ( rule__Thing__Group__0__Impl rule__Thing__Group__1 )
            // InternalIotlang.g:891:2: rule__Thing__Group__0__Impl rule__Thing__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Thing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Thing__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__0"


    // $ANTLR start "rule__Thing__Group__0__Impl"
    // InternalIotlang.g:898:1: rule__Thing__Group__0__Impl : ( 'thing' ) ;
    public final void rule__Thing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:902:1: ( ( 'thing' ) )
            // InternalIotlang.g:903:1: ( 'thing' )
            {
            // InternalIotlang.g:903:1: ( 'thing' )
            // InternalIotlang.g:904:2: 'thing'
            {
             before(grammarAccess.getThingAccess().getThingKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getThingAccess().getThingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__0__Impl"


    // $ANTLR start "rule__Thing__Group__1"
    // InternalIotlang.g:913:1: rule__Thing__Group__1 : rule__Thing__Group__1__Impl rule__Thing__Group__2 ;
    public final void rule__Thing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:917:1: ( rule__Thing__Group__1__Impl rule__Thing__Group__2 )
            // InternalIotlang.g:918:2: rule__Thing__Group__1__Impl rule__Thing__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Thing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Thing__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__1"


    // $ANTLR start "rule__Thing__Group__1__Impl"
    // InternalIotlang.g:925:1: rule__Thing__Group__1__Impl : ( ( rule__Thing__NameAssignment_1 ) ) ;
    public final void rule__Thing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:929:1: ( ( ( rule__Thing__NameAssignment_1 ) ) )
            // InternalIotlang.g:930:1: ( ( rule__Thing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:930:1: ( ( rule__Thing__NameAssignment_1 ) )
            // InternalIotlang.g:931:2: ( rule__Thing__NameAssignment_1 )
            {
             before(grammarAccess.getThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:932:2: ( rule__Thing__NameAssignment_1 )
            // InternalIotlang.g:932:3: rule__Thing__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Thing__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__1__Impl"


    // $ANTLR start "rule__Thing__Group__2"
    // InternalIotlang.g:940:1: rule__Thing__Group__2 : rule__Thing__Group__2__Impl rule__Thing__Group__3 ;
    public final void rule__Thing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:944:1: ( rule__Thing__Group__2__Impl rule__Thing__Group__3 )
            // InternalIotlang.g:945:2: rule__Thing__Group__2__Impl rule__Thing__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Thing__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Thing__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__2"


    // $ANTLR start "rule__Thing__Group__2__Impl"
    // InternalIotlang.g:952:1: rule__Thing__Group__2__Impl : ( ( rule__Thing__AnnotationsAssignment_2 )* ) ;
    public final void rule__Thing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:956:1: ( ( ( rule__Thing__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:957:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:957:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:958:2: ( rule__Thing__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getThingAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:959:2: ( rule__Thing__AnnotationsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ANNOTATION_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIotlang.g:959:3: rule__Thing__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Thing__AnnotationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getThingAccess().getAnnotationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__2__Impl"


    // $ANTLR start "rule__Thing__Group__3"
    // InternalIotlang.g:967:1: rule__Thing__Group__3 : rule__Thing__Group__3__Impl rule__Thing__Group__4 ;
    public final void rule__Thing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:971:1: ( rule__Thing__Group__3__Impl rule__Thing__Group__4 )
            // InternalIotlang.g:972:2: rule__Thing__Group__3__Impl rule__Thing__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Thing__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Thing__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__3"


    // $ANTLR start "rule__Thing__Group__3__Impl"
    // InternalIotlang.g:979:1: rule__Thing__Group__3__Impl : ( '{' ) ;
    public final void rule__Thing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:983:1: ( ( '{' ) )
            // InternalIotlang.g:984:1: ( '{' )
            {
            // InternalIotlang.g:984:1: ( '{' )
            // InternalIotlang.g:985:2: '{'
            {
             before(grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__3__Impl"


    // $ANTLR start "rule__Thing__Group__4"
    // InternalIotlang.g:994:1: rule__Thing__Group__4 : rule__Thing__Group__4__Impl rule__Thing__Group__5 ;
    public final void rule__Thing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:998:1: ( rule__Thing__Group__4__Impl rule__Thing__Group__5 )
            // InternalIotlang.g:999:2: rule__Thing__Group__4__Impl rule__Thing__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Thing__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Thing__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__4"


    // $ANTLR start "rule__Thing__Group__4__Impl"
    // InternalIotlang.g:1006:1: rule__Thing__Group__4__Impl : ( ( rule__Thing__PortsAssignment_4 ) ) ;
    public final void rule__Thing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1010:1: ( ( ( rule__Thing__PortsAssignment_4 ) ) )
            // InternalIotlang.g:1011:1: ( ( rule__Thing__PortsAssignment_4 ) )
            {
            // InternalIotlang.g:1011:1: ( ( rule__Thing__PortsAssignment_4 ) )
            // InternalIotlang.g:1012:2: ( rule__Thing__PortsAssignment_4 )
            {
             before(grammarAccess.getThingAccess().getPortsAssignment_4()); 
            // InternalIotlang.g:1013:2: ( rule__Thing__PortsAssignment_4 )
            // InternalIotlang.g:1013:3: rule__Thing__PortsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Thing__PortsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getThingAccess().getPortsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__4__Impl"


    // $ANTLR start "rule__Thing__Group__5"
    // InternalIotlang.g:1021:1: rule__Thing__Group__5 : rule__Thing__Group__5__Impl ;
    public final void rule__Thing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1025:1: ( rule__Thing__Group__5__Impl )
            // InternalIotlang.g:1026:2: rule__Thing__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Thing__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__5"


    // $ANTLR start "rule__Thing__Group__5__Impl"
    // InternalIotlang.g:1032:1: rule__Thing__Group__5__Impl : ( '}' ) ;
    public final void rule__Thing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1036:1: ( ( '}' ) )
            // InternalIotlang.g:1037:1: ( '}' )
            {
            // InternalIotlang.g:1037:1: ( '}' )
            // InternalIotlang.g:1038:2: '}'
            {
             before(grammarAccess.getThingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getThingAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__Group__5__Impl"


    // $ANTLR start "rule__PubSub__Group__0"
    // InternalIotlang.g:1048:1: rule__PubSub__Group__0 : rule__PubSub__Group__0__Impl rule__PubSub__Group__1 ;
    public final void rule__PubSub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1052:1: ( rule__PubSub__Group__0__Impl rule__PubSub__Group__1 )
            // InternalIotlang.g:1053:2: rule__PubSub__Group__0__Impl rule__PubSub__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PubSub__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubSub__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__0"


    // $ANTLR start "rule__PubSub__Group__0__Impl"
    // InternalIotlang.g:1060:1: rule__PubSub__Group__0__Impl : ( 'channel:pubsub' ) ;
    public final void rule__PubSub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1064:1: ( ( 'channel:pubsub' ) )
            // InternalIotlang.g:1065:1: ( 'channel:pubsub' )
            {
            // InternalIotlang.g:1065:1: ( 'channel:pubsub' )
            // InternalIotlang.g:1066:2: 'channel:pubsub'
            {
             before(grammarAccess.getPubSubAccess().getChannelPubsubKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPubSubAccess().getChannelPubsubKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__0__Impl"


    // $ANTLR start "rule__PubSub__Group__1"
    // InternalIotlang.g:1075:1: rule__PubSub__Group__1 : rule__PubSub__Group__1__Impl rule__PubSub__Group__2 ;
    public final void rule__PubSub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1079:1: ( rule__PubSub__Group__1__Impl rule__PubSub__Group__2 )
            // InternalIotlang.g:1080:2: rule__PubSub__Group__1__Impl rule__PubSub__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__PubSub__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubSub__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__1"


    // $ANTLR start "rule__PubSub__Group__1__Impl"
    // InternalIotlang.g:1087:1: rule__PubSub__Group__1__Impl : ( ( rule__PubSub__NameAssignment_1 ) ) ;
    public final void rule__PubSub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1091:1: ( ( ( rule__PubSub__NameAssignment_1 ) ) )
            // InternalIotlang.g:1092:1: ( ( rule__PubSub__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1092:1: ( ( rule__PubSub__NameAssignment_1 ) )
            // InternalIotlang.g:1093:2: ( rule__PubSub__NameAssignment_1 )
            {
             before(grammarAccess.getPubSubAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1094:2: ( rule__PubSub__NameAssignment_1 )
            // InternalIotlang.g:1094:3: rule__PubSub__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PubSub__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPubSubAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__1__Impl"


    // $ANTLR start "rule__PubSub__Group__2"
    // InternalIotlang.g:1102:1: rule__PubSub__Group__2 : rule__PubSub__Group__2__Impl rule__PubSub__Group__3 ;
    public final void rule__PubSub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1106:1: ( rule__PubSub__Group__2__Impl rule__PubSub__Group__3 )
            // InternalIotlang.g:1107:2: rule__PubSub__Group__2__Impl rule__PubSub__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__PubSub__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubSub__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__2"


    // $ANTLR start "rule__PubSub__Group__2__Impl"
    // InternalIotlang.g:1114:1: rule__PubSub__Group__2__Impl : ( '{' ) ;
    public final void rule__PubSub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1118:1: ( ( '{' ) )
            // InternalIotlang.g:1119:1: ( '{' )
            {
            // InternalIotlang.g:1119:1: ( '{' )
            // InternalIotlang.g:1120:2: '{'
            {
             before(grammarAccess.getPubSubAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPubSubAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__2__Impl"


    // $ANTLR start "rule__PubSub__Group__3"
    // InternalIotlang.g:1129:1: rule__PubSub__Group__3 : rule__PubSub__Group__3__Impl rule__PubSub__Group__4 ;
    public final void rule__PubSub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1133:1: ( rule__PubSub__Group__3__Impl rule__PubSub__Group__4 )
            // InternalIotlang.g:1134:2: rule__PubSub__Group__3__Impl rule__PubSub__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__PubSub__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PubSub__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__3"


    // $ANTLR start "rule__PubSub__Group__3__Impl"
    // InternalIotlang.g:1141:1: rule__PubSub__Group__3__Impl : ( ( rule__PubSub__HasTopicsAssignment_3 )* ) ;
    public final void rule__PubSub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1145:1: ( ( ( rule__PubSub__HasTopicsAssignment_3 )* ) )
            // InternalIotlang.g:1146:1: ( ( rule__PubSub__HasTopicsAssignment_3 )* )
            {
            // InternalIotlang.g:1146:1: ( ( rule__PubSub__HasTopicsAssignment_3 )* )
            // InternalIotlang.g:1147:2: ( rule__PubSub__HasTopicsAssignment_3 )*
            {
             before(grammarAccess.getPubSubAccess().getHasTopicsAssignment_3()); 
            // InternalIotlang.g:1148:2: ( rule__PubSub__HasTopicsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIotlang.g:1148:3: rule__PubSub__HasTopicsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PubSub__HasTopicsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPubSubAccess().getHasTopicsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__3__Impl"


    // $ANTLR start "rule__PubSub__Group__4"
    // InternalIotlang.g:1156:1: rule__PubSub__Group__4 : rule__PubSub__Group__4__Impl ;
    public final void rule__PubSub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1160:1: ( rule__PubSub__Group__4__Impl )
            // InternalIotlang.g:1161:2: rule__PubSub__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PubSub__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__4"


    // $ANTLR start "rule__PubSub__Group__4__Impl"
    // InternalIotlang.g:1167:1: rule__PubSub__Group__4__Impl : ( '}' ) ;
    public final void rule__PubSub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1171:1: ( ( '}' ) )
            // InternalIotlang.g:1172:1: ( '}' )
            {
            // InternalIotlang.g:1172:1: ( '}' )
            // InternalIotlang.g:1173:2: '}'
            {
             before(grammarAccess.getPubSubAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPubSubAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__Group__4__Impl"


    // $ANTLR start "rule__PointToPoint__Group__0"
    // InternalIotlang.g:1183:1: rule__PointToPoint__Group__0 : rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1 ;
    public final void rule__PointToPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1187:1: ( rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1 )
            // InternalIotlang.g:1188:2: rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PointToPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__0"


    // $ANTLR start "rule__PointToPoint__Group__0__Impl"
    // InternalIotlang.g:1195:1: rule__PointToPoint__Group__0__Impl : ( 'channel:ptp' ) ;
    public final void rule__PointToPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1199:1: ( ( 'channel:ptp' ) )
            // InternalIotlang.g:1200:1: ( 'channel:ptp' )
            {
            // InternalIotlang.g:1200:1: ( 'channel:ptp' )
            // InternalIotlang.g:1201:2: 'channel:ptp'
            {
             before(grammarAccess.getPointToPointAccess().getChannelPtpKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPointToPointAccess().getChannelPtpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__0__Impl"


    // $ANTLR start "rule__PointToPoint__Group__1"
    // InternalIotlang.g:1210:1: rule__PointToPoint__Group__1 : rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2 ;
    public final void rule__PointToPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1214:1: ( rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2 )
            // InternalIotlang.g:1215:2: rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__PointToPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__1"


    // $ANTLR start "rule__PointToPoint__Group__1__Impl"
    // InternalIotlang.g:1222:1: rule__PointToPoint__Group__1__Impl : ( ( rule__PointToPoint__NameAssignment_1 ) ) ;
    public final void rule__PointToPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1226:1: ( ( ( rule__PointToPoint__NameAssignment_1 ) ) )
            // InternalIotlang.g:1227:1: ( ( rule__PointToPoint__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1227:1: ( ( rule__PointToPoint__NameAssignment_1 ) )
            // InternalIotlang.g:1228:2: ( rule__PointToPoint__NameAssignment_1 )
            {
             before(grammarAccess.getPointToPointAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1229:2: ( rule__PointToPoint__NameAssignment_1 )
            // InternalIotlang.g:1229:3: rule__PointToPoint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PointToPoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointToPointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__1__Impl"


    // $ANTLR start "rule__PointToPoint__Group__2"
    // InternalIotlang.g:1237:1: rule__PointToPoint__Group__2 : rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3 ;
    public final void rule__PointToPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1241:1: ( rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3 )
            // InternalIotlang.g:1242:2: rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PointToPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__2"


    // $ANTLR start "rule__PointToPoint__Group__2__Impl"
    // InternalIotlang.g:1249:1: rule__PointToPoint__Group__2__Impl : ( '{' ) ;
    public final void rule__PointToPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1253:1: ( ( '{' ) )
            // InternalIotlang.g:1254:1: ( '{' )
            {
            // InternalIotlang.g:1254:1: ( '{' )
            // InternalIotlang.g:1255:2: '{'
            {
             before(grammarAccess.getPointToPointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPointToPointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__2__Impl"


    // $ANTLR start "rule__PointToPoint__Group__3"
    // InternalIotlang.g:1264:1: rule__PointToPoint__Group__3 : rule__PointToPoint__Group__3__Impl ;
    public final void rule__PointToPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1268:1: ( rule__PointToPoint__Group__3__Impl )
            // InternalIotlang.g:1269:2: rule__PointToPoint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__3"


    // $ANTLR start "rule__PointToPoint__Group__3__Impl"
    // InternalIotlang.g:1275:1: rule__PointToPoint__Group__3__Impl : ( '}' ) ;
    public final void rule__PointToPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1279:1: ( ( '}' ) )
            // InternalIotlang.g:1280:1: ( '}' )
            {
            // InternalIotlang.g:1280:1: ( '}' )
            // InternalIotlang.g:1281:2: '}'
            {
             before(grammarAccess.getPointToPointAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPointToPointAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalIotlang.g:1291:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1295:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalIotlang.g:1296:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // InternalIotlang.g:1303:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1307:1: ( ( 'policy' ) )
            // InternalIotlang.g:1308:1: ( 'policy' )
            {
            // InternalIotlang.g:1308:1: ( 'policy' )
            // InternalIotlang.g:1309:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // InternalIotlang.g:1318:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1322:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalIotlang.g:1323:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // InternalIotlang.g:1330:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1334:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalIotlang.g:1335:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1335:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalIotlang.g:1336:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1337:2: ( rule__Policy__NameAssignment_1 )
            // InternalIotlang.g:1337:3: rule__Policy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Policy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // InternalIotlang.g:1345:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1349:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalIotlang.g:1350:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // InternalIotlang.g:1357:1: rule__Policy__Group__2__Impl : ( '{' ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1361:1: ( ( '{' ) )
            // InternalIotlang.g:1362:1: ( '{' )
            {
            // InternalIotlang.g:1362:1: ( '{' )
            // InternalIotlang.g:1363:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Policy__Group__3"
    // InternalIotlang.g:1372:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1376:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalIotlang.g:1377:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3"


    // $ANTLR start "rule__Policy__Group__3__Impl"
    // InternalIotlang.g:1384:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__HasRulesAssignment_3 )* ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1388:1: ( ( ( rule__Policy__HasRulesAssignment_3 )* ) )
            // InternalIotlang.g:1389:1: ( ( rule__Policy__HasRulesAssignment_3 )* )
            {
            // InternalIotlang.g:1389:1: ( ( rule__Policy__HasRulesAssignment_3 )* )
            // InternalIotlang.g:1390:2: ( rule__Policy__HasRulesAssignment_3 )*
            {
             before(grammarAccess.getPolicyAccess().getHasRulesAssignment_3()); 
            // InternalIotlang.g:1391:2: ( rule__Policy__HasRulesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIotlang.g:1391:3: rule__Policy__HasRulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Policy__HasRulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getHasRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__4"
    // InternalIotlang.g:1399:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1403:1: ( rule__Policy__Group__4__Impl )
            // InternalIotlang.g:1404:2: rule__Policy__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4"


    // $ANTLR start "rule__Policy__Group__4__Impl"
    // InternalIotlang.g:1410:1: rule__Policy__Group__4__Impl : ( '}' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1414:1: ( ( '}' ) )
            // InternalIotlang.g:1415:1: ( '}' )
            {
            // InternalIotlang.g:1415:1: ( '}' )
            // InternalIotlang.g:1416:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // InternalIotlang.g:1426:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1430:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalIotlang.g:1431:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // InternalIotlang.g:1438:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1442:1: ( ( 'port' ) )
            // InternalIotlang.g:1443:1: ( 'port' )
            {
            // InternalIotlang.g:1443:1: ( 'port' )
            // InternalIotlang.g:1444:2: 'port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // InternalIotlang.g:1453:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1457:1: ( rule__Port__Group__1__Impl )
            // InternalIotlang.g:1458:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // InternalIotlang.g:1464:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1468:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // InternalIotlang.g:1469:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1469:1: ( ( rule__Port__NameAssignment_1 ) )
            // InternalIotlang.g:1470:2: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1471:2: ( rule__Port__NameAssignment_1 )
            // InternalIotlang.g:1471:3: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Port__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__0"
    // InternalIotlang.g:1480:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1484:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalIotlang.g:1485:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Protocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // InternalIotlang.g:1492:1: rule__Protocol__Group__0__Impl : ( 'protocol' ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1496:1: ( ( 'protocol' ) )
            // InternalIotlang.g:1497:1: ( 'protocol' )
            {
            // InternalIotlang.g:1497:1: ( 'protocol' )
            // InternalIotlang.g:1498:2: 'protocol'
            {
             before(grammarAccess.getProtocolAccess().getProtocolKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getProtocolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // InternalIotlang.g:1507:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1511:1: ( rule__Protocol__Group__1__Impl )
            // InternalIotlang.g:1512:2: rule__Protocol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // InternalIotlang.g:1518:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__NameAssignment_1 ) ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1522:1: ( ( ( rule__Protocol__NameAssignment_1 ) ) )
            // InternalIotlang.g:1523:1: ( ( rule__Protocol__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1523:1: ( ( rule__Protocol__NameAssignment_1 ) )
            // InternalIotlang.g:1524:2: ( rule__Protocol__NameAssignment_1 )
            {
             before(grammarAccess.getProtocolAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1525:2: ( rule__Protocol__NameAssignment_1 )
            // InternalIotlang.g:1525:3: rule__Protocol__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // InternalIotlang.g:1534:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1538:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalIotlang.g:1539:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalIotlang.g:1546:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1550:1: ( ( 'message' ) )
            // InternalIotlang.g:1551:1: ( 'message' )
            {
            // InternalIotlang.g:1551:1: ( 'message' )
            // InternalIotlang.g:1552:2: 'message'
            {
             before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getMessageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // InternalIotlang.g:1561:1: rule__Message__Group__1 : rule__Message__Group__1__Impl ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1565:1: ( rule__Message__Group__1__Impl )
            // InternalIotlang.g:1566:2: rule__Message__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalIotlang.g:1572:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1576:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // InternalIotlang.g:1577:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1577:1: ( ( rule__Message__NameAssignment_1 ) )
            // InternalIotlang.g:1578:2: ( rule__Message__NameAssignment_1 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1579:2: ( rule__Message__NameAssignment_1 )
            // InternalIotlang.g:1579:3: rule__Message__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Message__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Topic__Group__0"
    // InternalIotlang.g:1588:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1592:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // InternalIotlang.g:1593:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Topic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__0"


    // $ANTLR start "rule__Topic__Group__0__Impl"
    // InternalIotlang.g:1600:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1604:1: ( ( 'topic' ) )
            // InternalIotlang.g:1605:1: ( 'topic' )
            {
            // InternalIotlang.g:1605:1: ( 'topic' )
            // InternalIotlang.g:1606:2: 'topic'
            {
             before(grammarAccess.getTopicAccess().getTopicKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getTopicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__0__Impl"


    // $ANTLR start "rule__Topic__Group__1"
    // InternalIotlang.g:1615:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1619:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // InternalIotlang.g:1620:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Topic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__1"


    // $ANTLR start "rule__Topic__Group__1__Impl"
    // InternalIotlang.g:1627:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1631:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // InternalIotlang.g:1632:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1632:1: ( ( rule__Topic__NameAssignment_1 ) )
            // InternalIotlang.g:1633:2: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1634:2: ( rule__Topic__NameAssignment_1 )
            // InternalIotlang.g:1634:3: rule__Topic__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Topic__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__1__Impl"


    // $ANTLR start "rule__Topic__Group__2"
    // InternalIotlang.g:1642:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1646:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // InternalIotlang.g:1647:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Topic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__2"


    // $ANTLR start "rule__Topic__Group__2__Impl"
    // InternalIotlang.g:1654:1: rule__Topic__Group__2__Impl : ( '(' ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1658:1: ( ( '(' ) )
            // InternalIotlang.g:1659:1: ( '(' )
            {
            // InternalIotlang.g:1659:1: ( '(' )
            // InternalIotlang.g:1660:2: '('
            {
             before(grammarAccess.getTopicAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__2__Impl"


    // $ANTLR start "rule__Topic__Group__3"
    // InternalIotlang.g:1669:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1673:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // InternalIotlang.g:1674:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Topic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__3"


    // $ANTLR start "rule__Topic__Group__3__Impl"
    // InternalIotlang.g:1681:1: rule__Topic__Group__3__Impl : ( ( rule__Topic__AcceptedMessagesAssignment_3 ) ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1685:1: ( ( ( rule__Topic__AcceptedMessagesAssignment_3 ) ) )
            // InternalIotlang.g:1686:1: ( ( rule__Topic__AcceptedMessagesAssignment_3 ) )
            {
            // InternalIotlang.g:1686:1: ( ( rule__Topic__AcceptedMessagesAssignment_3 ) )
            // InternalIotlang.g:1687:2: ( rule__Topic__AcceptedMessagesAssignment_3 )
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesAssignment_3()); 
            // InternalIotlang.g:1688:2: ( rule__Topic__AcceptedMessagesAssignment_3 )
            // InternalIotlang.g:1688:3: rule__Topic__AcceptedMessagesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Topic__AcceptedMessagesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getAcceptedMessagesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__3__Impl"


    // $ANTLR start "rule__Topic__Group__4"
    // InternalIotlang.g:1696:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1700:1: ( rule__Topic__Group__4__Impl )
            // InternalIotlang.g:1701:2: rule__Topic__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__4"


    // $ANTLR start "rule__Topic__Group__4__Impl"
    // InternalIotlang.g:1707:1: rule__Topic__Group__4__Impl : ( ')' ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1711:1: ( ( ')' ) )
            // InternalIotlang.g:1712:1: ( ')' )
            {
            // InternalIotlang.g:1712:1: ( ')' )
            // InternalIotlang.g:1713:2: ')'
            {
             before(grammarAccess.getTopicAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalIotlang.g:1723:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1727:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalIotlang.g:1728:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalIotlang.g:1735:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1739:1: ( ( 'rule' ) )
            // InternalIotlang.g:1740:1: ( 'rule' )
            {
            // InternalIotlang.g:1740:1: ( 'rule' )
            // InternalIotlang.g:1741:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalIotlang.g:1750:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1754:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalIotlang.g:1755:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalIotlang.g:1762:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1766:1: ( ( ( rule__Rule__NameAssignment_1 )? ) )
            // InternalIotlang.g:1767:1: ( ( rule__Rule__NameAssignment_1 )? )
            {
            // InternalIotlang.g:1767:1: ( ( rule__Rule__NameAssignment_1 )? )
            // InternalIotlang.g:1768:2: ( rule__Rule__NameAssignment_1 )?
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1769:2: ( rule__Rule__NameAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalIotlang.g:1769:3: rule__Rule__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalIotlang.g:1777:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1781:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalIotlang.g:1782:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalIotlang.g:1789:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__SubjectAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1793:1: ( ( ( rule__Rule__SubjectAssignment_2 ) ) )
            // InternalIotlang.g:1794:1: ( ( rule__Rule__SubjectAssignment_2 ) )
            {
            // InternalIotlang.g:1794:1: ( ( rule__Rule__SubjectAssignment_2 ) )
            // InternalIotlang.g:1795:2: ( rule__Rule__SubjectAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getSubjectAssignment_2()); 
            // InternalIotlang.g:1796:2: ( rule__Rule__SubjectAssignment_2 )
            // InternalIotlang.g:1796:3: rule__Rule__SubjectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SubjectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSubjectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalIotlang.g:1804:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1808:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalIotlang.g:1809:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalIotlang.g:1816:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__PermissionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1820:1: ( ( ( rule__Rule__PermissionAssignment_3 ) ) )
            // InternalIotlang.g:1821:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            {
            // InternalIotlang.g:1821:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            // InternalIotlang.g:1822:2: ( rule__Rule__PermissionAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAssignment_3()); 
            // InternalIotlang.g:1823:2: ( rule__Rule__PermissionAssignment_3 )
            // InternalIotlang.g:1823:3: rule__Rule__PermissionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PermissionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPermissionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalIotlang.g:1831:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1835:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalIotlang.g:1836:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalIotlang.g:1843:1: rule__Rule__Group__4__Impl : ( ':' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1847:1: ( ( ':' ) )
            // InternalIotlang.g:1848:1: ( ':' )
            {
            // InternalIotlang.g:1848:1: ( ':' )
            // InternalIotlang.g:1849:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalIotlang.g:1858:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1862:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalIotlang.g:1863:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalIotlang.g:1870:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ActionAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1874:1: ( ( ( rule__Rule__ActionAssignment_5 ) ) )
            // InternalIotlang.g:1875:1: ( ( rule__Rule__ActionAssignment_5 ) )
            {
            // InternalIotlang.g:1875:1: ( ( rule__Rule__ActionAssignment_5 ) )
            // InternalIotlang.g:1876:2: ( rule__Rule__ActionAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_5()); 
            // InternalIotlang.g:1877:2: ( rule__Rule__ActionAssignment_5 )
            // InternalIotlang.g:1877:3: rule__Rule__ActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalIotlang.g:1885:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1889:1: ( rule__Rule__Group__6__Impl )
            // InternalIotlang.g:1890:2: rule__Rule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalIotlang.g:1896:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Alternatives_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1900:1: ( ( ( rule__Rule__Alternatives_6 ) ) )
            // InternalIotlang.g:1901:1: ( ( rule__Rule__Alternatives_6 ) )
            {
            // InternalIotlang.g:1901:1: ( ( rule__Rule__Alternatives_6 ) )
            // InternalIotlang.g:1902:2: ( rule__Rule__Alternatives_6 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_6()); 
            // InternalIotlang.g:1903:2: ( rule__Rule__Alternatives_6 )
            // InternalIotlang.g:1903:3: rule__Rule__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group_6_0__0"
    // InternalIotlang.g:1912:1: rule__Rule__Group_6_0__0 : rule__Rule__Group_6_0__0__Impl rule__Rule__Group_6_0__1 ;
    public final void rule__Rule__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1916:1: ( rule__Rule__Group_6_0__0__Impl rule__Rule__Group_6_0__1 )
            // InternalIotlang.g:1917:2: rule__Rule__Group_6_0__0__Impl rule__Rule__Group_6_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_0__0"


    // $ANTLR start "rule__Rule__Group_6_0__0__Impl"
    // InternalIotlang.g:1924:1: rule__Rule__Group_6_0__0__Impl : ( ( rule__Rule__ObjectAssignment_6_0_0 ) ) ;
    public final void rule__Rule__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1928:1: ( ( ( rule__Rule__ObjectAssignment_6_0_0 ) ) )
            // InternalIotlang.g:1929:1: ( ( rule__Rule__ObjectAssignment_6_0_0 ) )
            {
            // InternalIotlang.g:1929:1: ( ( rule__Rule__ObjectAssignment_6_0_0 ) )
            // InternalIotlang.g:1930:2: ( rule__Rule__ObjectAssignment_6_0_0 )
            {
             before(grammarAccess.getRuleAccess().getObjectAssignment_6_0_0()); 
            // InternalIotlang.g:1931:2: ( rule__Rule__ObjectAssignment_6_0_0 )
            // InternalIotlang.g:1931:3: rule__Rule__ObjectAssignment_6_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ObjectAssignment_6_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getObjectAssignment_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_0__0__Impl"


    // $ANTLR start "rule__Rule__Group_6_0__1"
    // InternalIotlang.g:1939:1: rule__Rule__Group_6_0__1 : rule__Rule__Group_6_0__1__Impl ;
    public final void rule__Rule__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1943:1: ( rule__Rule__Group_6_0__1__Impl )
            // InternalIotlang.g:1944:2: rule__Rule__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_0__1"


    // $ANTLR start "rule__Rule__Group_6_0__1__Impl"
    // InternalIotlang.g:1950:1: rule__Rule__Group_6_0__1__Impl : ( ( rule__Rule__Group_6_0_1__0 )* ) ;
    public final void rule__Rule__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1954:1: ( ( ( rule__Rule__Group_6_0_1__0 )* ) )
            // InternalIotlang.g:1955:1: ( ( rule__Rule__Group_6_0_1__0 )* )
            {
            // InternalIotlang.g:1955:1: ( ( rule__Rule__Group_6_0_1__0 )* )
            // InternalIotlang.g:1956:2: ( rule__Rule__Group_6_0_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_6_0_1()); 
            // InternalIotlang.g:1957:2: ( rule__Rule__Group_6_0_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIotlang.g:1957:3: rule__Rule__Group_6_0_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Rule__Group_6_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_0__1__Impl"


    // $ANTLR start "rule__Rule__Group_6_0_1__0"
    // InternalIotlang.g:1966:1: rule__Rule__Group_6_0_1__0 : rule__Rule__Group_6_0_1__0__Impl rule__Rule__Group_6_0_1__1 ;
    public final void rule__Rule__Group_6_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1970:1: ( rule__Rule__Group_6_0_1__0__Impl rule__Rule__Group_6_0_1__1 )
            // InternalIotlang.g:1971:2: rule__Rule__Group_6_0_1__0__Impl rule__Rule__Group_6_0_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group_6_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_6_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_0_1__0"


    // $ANTLR start "rule__Rule__Group_6_0_1__0__Impl"
    // InternalIotlang.g:1978:1: rule__Rule__Group_6_0_1__0__Impl : ( '.' ) ;
    public final void rule__Rule__Group_6_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1982:1: ( ( '.' ) )
            // InternalIotlang.g:1983:1: ( '.' )
            {
            // InternalIotlang.g:1983:1: ( '.' )
            // InternalIotlang.g:1984:2: '.'
            {
             before(grammarAccess.getRuleAccess().getFullStopKeyword_6_0_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFullStopKeyword_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_0_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_6_0_1__1"
    // InternalIotlang.g:1993:1: rule__Rule__Group_6_0_1__1 : rule__Rule__Group_6_0_1__1__Impl ;
    public final void rule__Rule__Group_6_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1997:1: ( rule__Rule__Group_6_0_1__1__Impl )
            // InternalIotlang.g:1998:2: rule__Rule__Group_6_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_0_1__1"


    // $ANTLR start "rule__Rule__Group_6_0_1__1__Impl"
    // InternalIotlang.g:2004:1: rule__Rule__Group_6_0_1__1__Impl : ( ( rule__Rule__PortsAssignment_6_0_1_1 ) ) ;
    public final void rule__Rule__Group_6_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2008:1: ( ( ( rule__Rule__PortsAssignment_6_0_1_1 ) ) )
            // InternalIotlang.g:2009:1: ( ( rule__Rule__PortsAssignment_6_0_1_1 ) )
            {
            // InternalIotlang.g:2009:1: ( ( rule__Rule__PortsAssignment_6_0_1_1 ) )
            // InternalIotlang.g:2010:2: ( rule__Rule__PortsAssignment_6_0_1_1 )
            {
             before(grammarAccess.getRuleAccess().getPortsAssignment_6_0_1_1()); 
            // InternalIotlang.g:2011:2: ( rule__Rule__PortsAssignment_6_0_1_1 )
            // InternalIotlang.g:2011:3: rule__Rule__PortsAssignment_6_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PortsAssignment_6_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPortsAssignment_6_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_0_1__1__Impl"


    // $ANTLR start "rule__Rule__Group_6_1__0"
    // InternalIotlang.g:2020:1: rule__Rule__Group_6_1__0 : rule__Rule__Group_6_1__0__Impl rule__Rule__Group_6_1__1 ;
    public final void rule__Rule__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2024:1: ( rule__Rule__Group_6_1__0__Impl rule__Rule__Group_6_1__1 )
            // InternalIotlang.g:2025:2: rule__Rule__Group_6_1__0__Impl rule__Rule__Group_6_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_1__0"


    // $ANTLR start "rule__Rule__Group_6_1__0__Impl"
    // InternalIotlang.g:2032:1: rule__Rule__Group_6_1__0__Impl : ( 'message:' ) ;
    public final void rule__Rule__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2036:1: ( ( 'message:' ) )
            // InternalIotlang.g:2037:1: ( 'message:' )
            {
            // InternalIotlang.g:2037:1: ( 'message:' )
            // InternalIotlang.g:2038:2: 'message:'
            {
             before(grammarAccess.getRuleAccess().getMessageKeyword_6_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getMessageKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_6_1__1"
    // InternalIotlang.g:2047:1: rule__Rule__Group_6_1__1 : rule__Rule__Group_6_1__1__Impl ;
    public final void rule__Rule__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2051:1: ( rule__Rule__Group_6_1__1__Impl )
            // InternalIotlang.g:2052:2: rule__Rule__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_1__1"


    // $ANTLR start "rule__Rule__Group_6_1__1__Impl"
    // InternalIotlang.g:2058:1: rule__Rule__Group_6_1__1__Impl : ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) ) ;
    public final void rule__Rule__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2062:1: ( ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) ) )
            // InternalIotlang.g:2063:1: ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) )
            {
            // InternalIotlang.g:2063:1: ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) )
            // InternalIotlang.g:2064:2: ( rule__Rule__ObjectMessageAssignment_6_1_1 )
            {
             before(grammarAccess.getRuleAccess().getObjectMessageAssignment_6_1_1()); 
            // InternalIotlang.g:2065:2: ( rule__Rule__ObjectMessageAssignment_6_1_1 )
            // InternalIotlang.g:2065:3: rule__Rule__ObjectMessageAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ObjectMessageAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getObjectMessageAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6_1__1__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalIotlang.g:2074:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2078:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalIotlang.g:2079:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalIotlang.g:2086:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2090:1: ( ( 'domain' ) )
            // InternalIotlang.g:2091:1: ( 'domain' )
            {
            // InternalIotlang.g:2091:1: ( 'domain' )
            // InternalIotlang.g:2092:2: 'domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getDomainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // InternalIotlang.g:2101:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2105:1: ( rule__Domain__Group__1__Impl )
            // InternalIotlang.g:2106:2: rule__Domain__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalIotlang.g:2112:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2116:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalIotlang.g:2117:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2117:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalIotlang.g:2118:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2119:2: ( rule__Domain__NameAssignment_1 )
            // InternalIotlang.g:2119:3: rule__Domain__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Domain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__InstanceThing__Group__0"
    // InternalIotlang.g:2128:1: rule__InstanceThing__Group__0 : rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 ;
    public final void rule__InstanceThing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2132:1: ( rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 )
            // InternalIotlang.g:2133:2: rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InstanceThing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__0"


    // $ANTLR start "rule__InstanceThing__Group__0__Impl"
    // InternalIotlang.g:2140:1: rule__InstanceThing__Group__0__Impl : ( 'instanceThing' ) ;
    public final void rule__InstanceThing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2144:1: ( ( 'instanceThing' ) )
            // InternalIotlang.g:2145:1: ( 'instanceThing' )
            {
            // InternalIotlang.g:2145:1: ( 'instanceThing' )
            // InternalIotlang.g:2146:2: 'instanceThing'
            {
             before(grammarAccess.getInstanceThingAccess().getInstanceThingKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getInstanceThingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__0__Impl"


    // $ANTLR start "rule__InstanceThing__Group__1"
    // InternalIotlang.g:2155:1: rule__InstanceThing__Group__1 : rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 ;
    public final void rule__InstanceThing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2159:1: ( rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 )
            // InternalIotlang.g:2160:2: rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__InstanceThing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__1"


    // $ANTLR start "rule__InstanceThing__Group__1__Impl"
    // InternalIotlang.g:2167:1: rule__InstanceThing__Group__1__Impl : ( ( rule__InstanceThing__NameAssignment_1 ) ) ;
    public final void rule__InstanceThing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2171:1: ( ( ( rule__InstanceThing__NameAssignment_1 ) ) )
            // InternalIotlang.g:2172:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2172:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            // InternalIotlang.g:2173:2: ( rule__InstanceThing__NameAssignment_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2174:2: ( rule__InstanceThing__NameAssignment_1 )
            // InternalIotlang.g:2174:3: rule__InstanceThing__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceThingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__1__Impl"


    // $ANTLR start "rule__InstanceThing__Group__2"
    // InternalIotlang.g:2182:1: rule__InstanceThing__Group__2 : rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 ;
    public final void rule__InstanceThing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2186:1: ( rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 )
            // InternalIotlang.g:2187:2: rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__InstanceThing__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__2"


    // $ANTLR start "rule__InstanceThing__Group__2__Impl"
    // InternalIotlang.g:2194:1: rule__InstanceThing__Group__2__Impl : ( ( rule__InstanceThing__Group_2__0 )* ) ;
    public final void rule__InstanceThing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2198:1: ( ( ( rule__InstanceThing__Group_2__0 )* ) )
            // InternalIotlang.g:2199:1: ( ( rule__InstanceThing__Group_2__0 )* )
            {
            // InternalIotlang.g:2199:1: ( ( rule__InstanceThing__Group_2__0 )* )
            // InternalIotlang.g:2200:2: ( rule__InstanceThing__Group_2__0 )*
            {
             before(grammarAccess.getInstanceThingAccess().getGroup_2()); 
            // InternalIotlang.g:2201:2: ( rule__InstanceThing__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIotlang.g:2201:3: rule__InstanceThing__Group_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__InstanceThing__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInstanceThingAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__2__Impl"


    // $ANTLR start "rule__InstanceThing__Group__3"
    // InternalIotlang.g:2209:1: rule__InstanceThing__Group__3 : rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 ;
    public final void rule__InstanceThing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2213:1: ( rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 )
            // InternalIotlang.g:2214:2: rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__InstanceThing__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__3"


    // $ANTLR start "rule__InstanceThing__Group__3__Impl"
    // InternalIotlang.g:2221:1: rule__InstanceThing__Group__3__Impl : ( ':' ) ;
    public final void rule__InstanceThing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2225:1: ( ( ':' ) )
            // InternalIotlang.g:2226:1: ( ':' )
            {
            // InternalIotlang.g:2226:1: ( ':' )
            // InternalIotlang.g:2227:2: ':'
            {
             before(grammarAccess.getInstanceThingAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__3__Impl"


    // $ANTLR start "rule__InstanceThing__Group__4"
    // InternalIotlang.g:2236:1: rule__InstanceThing__Group__4 : rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 ;
    public final void rule__InstanceThing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2240:1: ( rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 )
            // InternalIotlang.g:2241:2: rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__InstanceThing__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__4"


    // $ANTLR start "rule__InstanceThing__Group__4__Impl"
    // InternalIotlang.g:2248:1: rule__InstanceThing__Group__4__Impl : ( ( rule__InstanceThing__TypeThingAssignment_4 ) ) ;
    public final void rule__InstanceThing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2252:1: ( ( ( rule__InstanceThing__TypeThingAssignment_4 ) ) )
            // InternalIotlang.g:2253:1: ( ( rule__InstanceThing__TypeThingAssignment_4 ) )
            {
            // InternalIotlang.g:2253:1: ( ( rule__InstanceThing__TypeThingAssignment_4 ) )
            // InternalIotlang.g:2254:2: ( rule__InstanceThing__TypeThingAssignment_4 )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingAssignment_4()); 
            // InternalIotlang.g:2255:2: ( rule__InstanceThing__TypeThingAssignment_4 )
            // InternalIotlang.g:2255:3: rule__InstanceThing__TypeThingAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__TypeThingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInstanceThingAccess().getTypeThingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__4__Impl"


    // $ANTLR start "rule__InstanceThing__Group__5"
    // InternalIotlang.g:2263:1: rule__InstanceThing__Group__5 : rule__InstanceThing__Group__5__Impl ;
    public final void rule__InstanceThing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2267:1: ( rule__InstanceThing__Group__5__Impl )
            // InternalIotlang.g:2268:2: rule__InstanceThing__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__5"


    // $ANTLR start "rule__InstanceThing__Group__5__Impl"
    // InternalIotlang.g:2274:1: rule__InstanceThing__Group__5__Impl : ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) ;
    public final void rule__InstanceThing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2278:1: ( ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) )
            // InternalIotlang.g:2279:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            {
            // InternalIotlang.g:2279:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            // InternalIotlang.g:2280:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            {
             before(grammarAccess.getInstanceThingAccess().getAnnotationsAssignment_5()); 
            // InternalIotlang.g:2281:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ANNOTATION_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIotlang.g:2281:3: rule__InstanceThing__AnnotationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanceThing__AnnotationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getInstanceThingAccess().getAnnotationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group__5__Impl"


    // $ANTLR start "rule__InstanceThing__Group_2__0"
    // InternalIotlang.g:2290:1: rule__InstanceThing__Group_2__0 : rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 ;
    public final void rule__InstanceThing__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2294:1: ( rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 )
            // InternalIotlang.g:2295:2: rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__InstanceThing__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__0"


    // $ANTLR start "rule__InstanceThing__Group_2__0__Impl"
    // InternalIotlang.g:2302:1: rule__InstanceThing__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstanceThing__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2306:1: ( ( '[' ) )
            // InternalIotlang.g:2307:1: ( '[' )
            {
            // InternalIotlang.g:2307:1: ( '[' )
            // InternalIotlang.g:2308:2: '['
            {
             before(grammarAccess.getInstanceThingAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__0__Impl"


    // $ANTLR start "rule__InstanceThing__Group_2__1"
    // InternalIotlang.g:2317:1: rule__InstanceThing__Group_2__1 : rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 ;
    public final void rule__InstanceThing__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2321:1: ( rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 )
            // InternalIotlang.g:2322:2: rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__InstanceThing__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__1"


    // $ANTLR start "rule__InstanceThing__Group_2__1__Impl"
    // InternalIotlang.g:2329:1: rule__InstanceThing__Group_2__1__Impl : ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) ;
    public final void rule__InstanceThing__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2333:1: ( ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:2334:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:2334:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            // InternalIotlang.g:2335:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:2336:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            // InternalIotlang.g:2336:3: rule__InstanceThing__NumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__NumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceThingAccess().getNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__1__Impl"


    // $ANTLR start "rule__InstanceThing__Group_2__2"
    // InternalIotlang.g:2344:1: rule__InstanceThing__Group_2__2 : rule__InstanceThing__Group_2__2__Impl ;
    public final void rule__InstanceThing__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2348:1: ( rule__InstanceThing__Group_2__2__Impl )
            // InternalIotlang.g:2349:2: rule__InstanceThing__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__2"


    // $ANTLR start "rule__InstanceThing__Group_2__2__Impl"
    // InternalIotlang.g:2355:1: rule__InstanceThing__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstanceThing__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2359:1: ( ( ']' ) )
            // InternalIotlang.g:2360:1: ( ']' )
            {
            // InternalIotlang.g:2360:1: ( ']' )
            // InternalIotlang.g:2361:2: ']'
            {
             before(grammarAccess.getInstanceThingAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__Group_2__2__Impl"


    // $ANTLR start "rule__InstancePubSub__Group__0"
    // InternalIotlang.g:2371:1: rule__InstancePubSub__Group__0 : rule__InstancePubSub__Group__0__Impl rule__InstancePubSub__Group__1 ;
    public final void rule__InstancePubSub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2375:1: ( rule__InstancePubSub__Group__0__Impl rule__InstancePubSub__Group__1 )
            // InternalIotlang.g:2376:2: rule__InstancePubSub__Group__0__Impl rule__InstancePubSub__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InstancePubSub__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__0"


    // $ANTLR start "rule__InstancePubSub__Group__0__Impl"
    // InternalIotlang.g:2383:1: rule__InstancePubSub__Group__0__Impl : ( 'instancePubSub' ) ;
    public final void rule__InstancePubSub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2387:1: ( ( 'instancePubSub' ) )
            // InternalIotlang.g:2388:1: ( 'instancePubSub' )
            {
            // InternalIotlang.g:2388:1: ( 'instancePubSub' )
            // InternalIotlang.g:2389:2: 'instancePubSub'
            {
             before(grammarAccess.getInstancePubSubAccess().getInstancePubSubKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInstancePubSubAccess().getInstancePubSubKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__0__Impl"


    // $ANTLR start "rule__InstancePubSub__Group__1"
    // InternalIotlang.g:2398:1: rule__InstancePubSub__Group__1 : rule__InstancePubSub__Group__1__Impl rule__InstancePubSub__Group__2 ;
    public final void rule__InstancePubSub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2402:1: ( rule__InstancePubSub__Group__1__Impl rule__InstancePubSub__Group__2 )
            // InternalIotlang.g:2403:2: rule__InstancePubSub__Group__1__Impl rule__InstancePubSub__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__InstancePubSub__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__1"


    // $ANTLR start "rule__InstancePubSub__Group__1__Impl"
    // InternalIotlang.g:2410:1: rule__InstancePubSub__Group__1__Impl : ( ( rule__InstancePubSub__NameAssignment_1 ) ) ;
    public final void rule__InstancePubSub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2414:1: ( ( ( rule__InstancePubSub__NameAssignment_1 ) ) )
            // InternalIotlang.g:2415:1: ( ( rule__InstancePubSub__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2415:1: ( ( rule__InstancePubSub__NameAssignment_1 ) )
            // InternalIotlang.g:2416:2: ( rule__InstancePubSub__NameAssignment_1 )
            {
             before(grammarAccess.getInstancePubSubAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2417:2: ( rule__InstancePubSub__NameAssignment_1 )
            // InternalIotlang.g:2417:3: rule__InstancePubSub__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstancePubSub__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstancePubSubAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__1__Impl"


    // $ANTLR start "rule__InstancePubSub__Group__2"
    // InternalIotlang.g:2425:1: rule__InstancePubSub__Group__2 : rule__InstancePubSub__Group__2__Impl rule__InstancePubSub__Group__3 ;
    public final void rule__InstancePubSub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2429:1: ( rule__InstancePubSub__Group__2__Impl rule__InstancePubSub__Group__3 )
            // InternalIotlang.g:2430:2: rule__InstancePubSub__Group__2__Impl rule__InstancePubSub__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__InstancePubSub__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__2"


    // $ANTLR start "rule__InstancePubSub__Group__2__Impl"
    // InternalIotlang.g:2437:1: rule__InstancePubSub__Group__2__Impl : ( ( rule__InstancePubSub__Group_2__0 )* ) ;
    public final void rule__InstancePubSub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2441:1: ( ( ( rule__InstancePubSub__Group_2__0 )* ) )
            // InternalIotlang.g:2442:1: ( ( rule__InstancePubSub__Group_2__0 )* )
            {
            // InternalIotlang.g:2442:1: ( ( rule__InstancePubSub__Group_2__0 )* )
            // InternalIotlang.g:2443:2: ( rule__InstancePubSub__Group_2__0 )*
            {
             before(grammarAccess.getInstancePubSubAccess().getGroup_2()); 
            // InternalIotlang.g:2444:2: ( rule__InstancePubSub__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIotlang.g:2444:3: rule__InstancePubSub__Group_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__InstancePubSub__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getInstancePubSubAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__2__Impl"


    // $ANTLR start "rule__InstancePubSub__Group__3"
    // InternalIotlang.g:2452:1: rule__InstancePubSub__Group__3 : rule__InstancePubSub__Group__3__Impl rule__InstancePubSub__Group__4 ;
    public final void rule__InstancePubSub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2456:1: ( rule__InstancePubSub__Group__3__Impl rule__InstancePubSub__Group__4 )
            // InternalIotlang.g:2457:2: rule__InstancePubSub__Group__3__Impl rule__InstancePubSub__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__InstancePubSub__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__3"


    // $ANTLR start "rule__InstancePubSub__Group__3__Impl"
    // InternalIotlang.g:2464:1: rule__InstancePubSub__Group__3__Impl : ( ':' ) ;
    public final void rule__InstancePubSub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2468:1: ( ( ':' ) )
            // InternalIotlang.g:2469:1: ( ':' )
            {
            // InternalIotlang.g:2469:1: ( ':' )
            // InternalIotlang.g:2470:2: ':'
            {
             before(grammarAccess.getInstancePubSubAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInstancePubSubAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__3__Impl"


    // $ANTLR start "rule__InstancePubSub__Group__4"
    // InternalIotlang.g:2479:1: rule__InstancePubSub__Group__4 : rule__InstancePubSub__Group__4__Impl rule__InstancePubSub__Group__5 ;
    public final void rule__InstancePubSub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2483:1: ( rule__InstancePubSub__Group__4__Impl rule__InstancePubSub__Group__5 )
            // InternalIotlang.g:2484:2: rule__InstancePubSub__Group__4__Impl rule__InstancePubSub__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__InstancePubSub__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__4"


    // $ANTLR start "rule__InstancePubSub__Group__4__Impl"
    // InternalIotlang.g:2491:1: rule__InstancePubSub__Group__4__Impl : ( ( rule__InstancePubSub__TypeChannelAssignment_4 ) ) ;
    public final void rule__InstancePubSub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2495:1: ( ( ( rule__InstancePubSub__TypeChannelAssignment_4 ) ) )
            // InternalIotlang.g:2496:1: ( ( rule__InstancePubSub__TypeChannelAssignment_4 ) )
            {
            // InternalIotlang.g:2496:1: ( ( rule__InstancePubSub__TypeChannelAssignment_4 ) )
            // InternalIotlang.g:2497:2: ( rule__InstancePubSub__TypeChannelAssignment_4 )
            {
             before(grammarAccess.getInstancePubSubAccess().getTypeChannelAssignment_4()); 
            // InternalIotlang.g:2498:2: ( rule__InstancePubSub__TypeChannelAssignment_4 )
            // InternalIotlang.g:2498:3: rule__InstancePubSub__TypeChannelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InstancePubSub__TypeChannelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInstancePubSubAccess().getTypeChannelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__4__Impl"


    // $ANTLR start "rule__InstancePubSub__Group__5"
    // InternalIotlang.g:2506:1: rule__InstancePubSub__Group__5 : rule__InstancePubSub__Group__5__Impl rule__InstancePubSub__Group__6 ;
    public final void rule__InstancePubSub__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2510:1: ( rule__InstancePubSub__Group__5__Impl rule__InstancePubSub__Group__6 )
            // InternalIotlang.g:2511:2: rule__InstancePubSub__Group__5__Impl rule__InstancePubSub__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__InstancePubSub__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__5"


    // $ANTLR start "rule__InstancePubSub__Group__5__Impl"
    // InternalIotlang.g:2518:1: rule__InstancePubSub__Group__5__Impl : ( 'over' ) ;
    public final void rule__InstancePubSub__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2522:1: ( ( 'over' ) )
            // InternalIotlang.g:2523:1: ( 'over' )
            {
            // InternalIotlang.g:2523:1: ( 'over' )
            // InternalIotlang.g:2524:2: 'over'
            {
             before(grammarAccess.getInstancePubSubAccess().getOverKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInstancePubSubAccess().getOverKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__5__Impl"


    // $ANTLR start "rule__InstancePubSub__Group__6"
    // InternalIotlang.g:2533:1: rule__InstancePubSub__Group__6 : rule__InstancePubSub__Group__6__Impl rule__InstancePubSub__Group__7 ;
    public final void rule__InstancePubSub__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2537:1: ( rule__InstancePubSub__Group__6__Impl rule__InstancePubSub__Group__7 )
            // InternalIotlang.g:2538:2: rule__InstancePubSub__Group__6__Impl rule__InstancePubSub__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__InstancePubSub__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__6"


    // $ANTLR start "rule__InstancePubSub__Group__6__Impl"
    // InternalIotlang.g:2545:1: rule__InstancePubSub__Group__6__Impl : ( ( rule__InstancePubSub__OverProtocolAssignment_6 ) ) ;
    public final void rule__InstancePubSub__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2549:1: ( ( ( rule__InstancePubSub__OverProtocolAssignment_6 ) ) )
            // InternalIotlang.g:2550:1: ( ( rule__InstancePubSub__OverProtocolAssignment_6 ) )
            {
            // InternalIotlang.g:2550:1: ( ( rule__InstancePubSub__OverProtocolAssignment_6 ) )
            // InternalIotlang.g:2551:2: ( rule__InstancePubSub__OverProtocolAssignment_6 )
            {
             before(grammarAccess.getInstancePubSubAccess().getOverProtocolAssignment_6()); 
            // InternalIotlang.g:2552:2: ( rule__InstancePubSub__OverProtocolAssignment_6 )
            // InternalIotlang.g:2552:3: rule__InstancePubSub__OverProtocolAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InstancePubSub__OverProtocolAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInstancePubSubAccess().getOverProtocolAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__6__Impl"


    // $ANTLR start "rule__InstancePubSub__Group__7"
    // InternalIotlang.g:2560:1: rule__InstancePubSub__Group__7 : rule__InstancePubSub__Group__7__Impl ;
    public final void rule__InstancePubSub__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2564:1: ( rule__InstancePubSub__Group__7__Impl )
            // InternalIotlang.g:2565:2: rule__InstancePubSub__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__7"


    // $ANTLR start "rule__InstancePubSub__Group__7__Impl"
    // InternalIotlang.g:2571:1: rule__InstancePubSub__Group__7__Impl : ( ( rule__InstancePubSub__AnnotationsAssignment_7 )* ) ;
    public final void rule__InstancePubSub__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2575:1: ( ( ( rule__InstancePubSub__AnnotationsAssignment_7 )* ) )
            // InternalIotlang.g:2576:1: ( ( rule__InstancePubSub__AnnotationsAssignment_7 )* )
            {
            // InternalIotlang.g:2576:1: ( ( rule__InstancePubSub__AnnotationsAssignment_7 )* )
            // InternalIotlang.g:2577:2: ( rule__InstancePubSub__AnnotationsAssignment_7 )*
            {
             before(grammarAccess.getInstancePubSubAccess().getAnnotationsAssignment_7()); 
            // InternalIotlang.g:2578:2: ( rule__InstancePubSub__AnnotationsAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ANNOTATION_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIotlang.g:2578:3: rule__InstancePubSub__AnnotationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstancePubSub__AnnotationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getInstancePubSubAccess().getAnnotationsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group__7__Impl"


    // $ANTLR start "rule__InstancePubSub__Group_2__0"
    // InternalIotlang.g:2587:1: rule__InstancePubSub__Group_2__0 : rule__InstancePubSub__Group_2__0__Impl rule__InstancePubSub__Group_2__1 ;
    public final void rule__InstancePubSub__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2591:1: ( rule__InstancePubSub__Group_2__0__Impl rule__InstancePubSub__Group_2__1 )
            // InternalIotlang.g:2592:2: rule__InstancePubSub__Group_2__0__Impl rule__InstancePubSub__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__InstancePubSub__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group_2__0"


    // $ANTLR start "rule__InstancePubSub__Group_2__0__Impl"
    // InternalIotlang.g:2599:1: rule__InstancePubSub__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstancePubSub__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2603:1: ( ( '[' ) )
            // InternalIotlang.g:2604:1: ( '[' )
            {
            // InternalIotlang.g:2604:1: ( '[' )
            // InternalIotlang.g:2605:2: '['
            {
             before(grammarAccess.getInstancePubSubAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInstancePubSubAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group_2__0__Impl"


    // $ANTLR start "rule__InstancePubSub__Group_2__1"
    // InternalIotlang.g:2614:1: rule__InstancePubSub__Group_2__1 : rule__InstancePubSub__Group_2__1__Impl rule__InstancePubSub__Group_2__2 ;
    public final void rule__InstancePubSub__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2618:1: ( rule__InstancePubSub__Group_2__1__Impl rule__InstancePubSub__Group_2__2 )
            // InternalIotlang.g:2619:2: rule__InstancePubSub__Group_2__1__Impl rule__InstancePubSub__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__InstancePubSub__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group_2__1"


    // $ANTLR start "rule__InstancePubSub__Group_2__1__Impl"
    // InternalIotlang.g:2626:1: rule__InstancePubSub__Group_2__1__Impl : ( ( rule__InstancePubSub__NumberAssignment_2_1 ) ) ;
    public final void rule__InstancePubSub__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2630:1: ( ( ( rule__InstancePubSub__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:2631:1: ( ( rule__InstancePubSub__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:2631:1: ( ( rule__InstancePubSub__NumberAssignment_2_1 ) )
            // InternalIotlang.g:2632:2: ( rule__InstancePubSub__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstancePubSubAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:2633:2: ( rule__InstancePubSub__NumberAssignment_2_1 )
            // InternalIotlang.g:2633:3: rule__InstancePubSub__NumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InstancePubSub__NumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInstancePubSubAccess().getNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group_2__1__Impl"


    // $ANTLR start "rule__InstancePubSub__Group_2__2"
    // InternalIotlang.g:2641:1: rule__InstancePubSub__Group_2__2 : rule__InstancePubSub__Group_2__2__Impl ;
    public final void rule__InstancePubSub__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2645:1: ( rule__InstancePubSub__Group_2__2__Impl )
            // InternalIotlang.g:2646:2: rule__InstancePubSub__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstancePubSub__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group_2__2"


    // $ANTLR start "rule__InstancePubSub__Group_2__2__Impl"
    // InternalIotlang.g:2652:1: rule__InstancePubSub__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstancePubSub__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2656:1: ( ( ']' ) )
            // InternalIotlang.g:2657:1: ( ']' )
            {
            // InternalIotlang.g:2657:1: ( ']' )
            // InternalIotlang.g:2658:2: ']'
            {
             before(grammarAccess.getInstancePubSubAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInstancePubSubAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__Group_2__2__Impl"


    // $ANTLR start "rule__InstancePtP__Group__0"
    // InternalIotlang.g:2668:1: rule__InstancePtP__Group__0 : rule__InstancePtP__Group__0__Impl rule__InstancePtP__Group__1 ;
    public final void rule__InstancePtP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2672:1: ( rule__InstancePtP__Group__0__Impl rule__InstancePtP__Group__1 )
            // InternalIotlang.g:2673:2: rule__InstancePtP__Group__0__Impl rule__InstancePtP__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InstancePtP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__0"


    // $ANTLR start "rule__InstancePtP__Group__0__Impl"
    // InternalIotlang.g:2680:1: rule__InstancePtP__Group__0__Impl : ( 'instancePTP' ) ;
    public final void rule__InstancePtP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2684:1: ( ( 'instancePTP' ) )
            // InternalIotlang.g:2685:1: ( 'instancePTP' )
            {
            // InternalIotlang.g:2685:1: ( 'instancePTP' )
            // InternalIotlang.g:2686:2: 'instancePTP'
            {
             before(grammarAccess.getInstancePtPAccess().getInstancePTPKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInstancePtPAccess().getInstancePTPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__0__Impl"


    // $ANTLR start "rule__InstancePtP__Group__1"
    // InternalIotlang.g:2695:1: rule__InstancePtP__Group__1 : rule__InstancePtP__Group__1__Impl rule__InstancePtP__Group__2 ;
    public final void rule__InstancePtP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2699:1: ( rule__InstancePtP__Group__1__Impl rule__InstancePtP__Group__2 )
            // InternalIotlang.g:2700:2: rule__InstancePtP__Group__1__Impl rule__InstancePtP__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__InstancePtP__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__1"


    // $ANTLR start "rule__InstancePtP__Group__1__Impl"
    // InternalIotlang.g:2707:1: rule__InstancePtP__Group__1__Impl : ( ( rule__InstancePtP__NameAssignment_1 ) ) ;
    public final void rule__InstancePtP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2711:1: ( ( ( rule__InstancePtP__NameAssignment_1 ) ) )
            // InternalIotlang.g:2712:1: ( ( rule__InstancePtP__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2712:1: ( ( rule__InstancePtP__NameAssignment_1 ) )
            // InternalIotlang.g:2713:2: ( rule__InstancePtP__NameAssignment_1 )
            {
             before(grammarAccess.getInstancePtPAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2714:2: ( rule__InstancePtP__NameAssignment_1 )
            // InternalIotlang.g:2714:3: rule__InstancePtP__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstancePtP__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstancePtPAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__1__Impl"


    // $ANTLR start "rule__InstancePtP__Group__2"
    // InternalIotlang.g:2722:1: rule__InstancePtP__Group__2 : rule__InstancePtP__Group__2__Impl rule__InstancePtP__Group__3 ;
    public final void rule__InstancePtP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2726:1: ( rule__InstancePtP__Group__2__Impl rule__InstancePtP__Group__3 )
            // InternalIotlang.g:2727:2: rule__InstancePtP__Group__2__Impl rule__InstancePtP__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__InstancePtP__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__2"


    // $ANTLR start "rule__InstancePtP__Group__2__Impl"
    // InternalIotlang.g:2734:1: rule__InstancePtP__Group__2__Impl : ( ( rule__InstancePtP__Group_2__0 )* ) ;
    public final void rule__InstancePtP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2738:1: ( ( ( rule__InstancePtP__Group_2__0 )* ) )
            // InternalIotlang.g:2739:1: ( ( rule__InstancePtP__Group_2__0 )* )
            {
            // InternalIotlang.g:2739:1: ( ( rule__InstancePtP__Group_2__0 )* )
            // InternalIotlang.g:2740:2: ( rule__InstancePtP__Group_2__0 )*
            {
             before(grammarAccess.getInstancePtPAccess().getGroup_2()); 
            // InternalIotlang.g:2741:2: ( rule__InstancePtP__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIotlang.g:2741:3: rule__InstancePtP__Group_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__InstancePtP__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getInstancePtPAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__2__Impl"


    // $ANTLR start "rule__InstancePtP__Group__3"
    // InternalIotlang.g:2749:1: rule__InstancePtP__Group__3 : rule__InstancePtP__Group__3__Impl rule__InstancePtP__Group__4 ;
    public final void rule__InstancePtP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2753:1: ( rule__InstancePtP__Group__3__Impl rule__InstancePtP__Group__4 )
            // InternalIotlang.g:2754:2: rule__InstancePtP__Group__3__Impl rule__InstancePtP__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__InstancePtP__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__3"


    // $ANTLR start "rule__InstancePtP__Group__3__Impl"
    // InternalIotlang.g:2761:1: rule__InstancePtP__Group__3__Impl : ( ':' ) ;
    public final void rule__InstancePtP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2765:1: ( ( ':' ) )
            // InternalIotlang.g:2766:1: ( ':' )
            {
            // InternalIotlang.g:2766:1: ( ':' )
            // InternalIotlang.g:2767:2: ':'
            {
             before(grammarAccess.getInstancePtPAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInstancePtPAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__3__Impl"


    // $ANTLR start "rule__InstancePtP__Group__4"
    // InternalIotlang.g:2776:1: rule__InstancePtP__Group__4 : rule__InstancePtP__Group__4__Impl rule__InstancePtP__Group__5 ;
    public final void rule__InstancePtP__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2780:1: ( rule__InstancePtP__Group__4__Impl rule__InstancePtP__Group__5 )
            // InternalIotlang.g:2781:2: rule__InstancePtP__Group__4__Impl rule__InstancePtP__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__InstancePtP__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__4"


    // $ANTLR start "rule__InstancePtP__Group__4__Impl"
    // InternalIotlang.g:2788:1: rule__InstancePtP__Group__4__Impl : ( ( rule__InstancePtP__TypeChannelAssignment_4 ) ) ;
    public final void rule__InstancePtP__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2792:1: ( ( ( rule__InstancePtP__TypeChannelAssignment_4 ) ) )
            // InternalIotlang.g:2793:1: ( ( rule__InstancePtP__TypeChannelAssignment_4 ) )
            {
            // InternalIotlang.g:2793:1: ( ( rule__InstancePtP__TypeChannelAssignment_4 ) )
            // InternalIotlang.g:2794:2: ( rule__InstancePtP__TypeChannelAssignment_4 )
            {
             before(grammarAccess.getInstancePtPAccess().getTypeChannelAssignment_4()); 
            // InternalIotlang.g:2795:2: ( rule__InstancePtP__TypeChannelAssignment_4 )
            // InternalIotlang.g:2795:3: rule__InstancePtP__TypeChannelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InstancePtP__TypeChannelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInstancePtPAccess().getTypeChannelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__4__Impl"


    // $ANTLR start "rule__InstancePtP__Group__5"
    // InternalIotlang.g:2803:1: rule__InstancePtP__Group__5 : rule__InstancePtP__Group__5__Impl rule__InstancePtP__Group__6 ;
    public final void rule__InstancePtP__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2807:1: ( rule__InstancePtP__Group__5__Impl rule__InstancePtP__Group__6 )
            // InternalIotlang.g:2808:2: rule__InstancePtP__Group__5__Impl rule__InstancePtP__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__InstancePtP__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__5"


    // $ANTLR start "rule__InstancePtP__Group__5__Impl"
    // InternalIotlang.g:2815:1: rule__InstancePtP__Group__5__Impl : ( 'over' ) ;
    public final void rule__InstancePtP__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2819:1: ( ( 'over' ) )
            // InternalIotlang.g:2820:1: ( 'over' )
            {
            // InternalIotlang.g:2820:1: ( 'over' )
            // InternalIotlang.g:2821:2: 'over'
            {
             before(grammarAccess.getInstancePtPAccess().getOverKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInstancePtPAccess().getOverKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__5__Impl"


    // $ANTLR start "rule__InstancePtP__Group__6"
    // InternalIotlang.g:2830:1: rule__InstancePtP__Group__6 : rule__InstancePtP__Group__6__Impl rule__InstancePtP__Group__7 ;
    public final void rule__InstancePtP__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2834:1: ( rule__InstancePtP__Group__6__Impl rule__InstancePtP__Group__7 )
            // InternalIotlang.g:2835:2: rule__InstancePtP__Group__6__Impl rule__InstancePtP__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__InstancePtP__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__6"


    // $ANTLR start "rule__InstancePtP__Group__6__Impl"
    // InternalIotlang.g:2842:1: rule__InstancePtP__Group__6__Impl : ( ( rule__InstancePtP__OverProtocolAssignment_6 ) ) ;
    public final void rule__InstancePtP__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2846:1: ( ( ( rule__InstancePtP__OverProtocolAssignment_6 ) ) )
            // InternalIotlang.g:2847:1: ( ( rule__InstancePtP__OverProtocolAssignment_6 ) )
            {
            // InternalIotlang.g:2847:1: ( ( rule__InstancePtP__OverProtocolAssignment_6 ) )
            // InternalIotlang.g:2848:2: ( rule__InstancePtP__OverProtocolAssignment_6 )
            {
             before(grammarAccess.getInstancePtPAccess().getOverProtocolAssignment_6()); 
            // InternalIotlang.g:2849:2: ( rule__InstancePtP__OverProtocolAssignment_6 )
            // InternalIotlang.g:2849:3: rule__InstancePtP__OverProtocolAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InstancePtP__OverProtocolAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInstancePtPAccess().getOverProtocolAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__6__Impl"


    // $ANTLR start "rule__InstancePtP__Group__7"
    // InternalIotlang.g:2857:1: rule__InstancePtP__Group__7 : rule__InstancePtP__Group__7__Impl ;
    public final void rule__InstancePtP__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2861:1: ( rule__InstancePtP__Group__7__Impl )
            // InternalIotlang.g:2862:2: rule__InstancePtP__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__7"


    // $ANTLR start "rule__InstancePtP__Group__7__Impl"
    // InternalIotlang.g:2868:1: rule__InstancePtP__Group__7__Impl : ( ( rule__InstancePtP__AnnotationsAssignment_7 )* ) ;
    public final void rule__InstancePtP__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2872:1: ( ( ( rule__InstancePtP__AnnotationsAssignment_7 )* ) )
            // InternalIotlang.g:2873:1: ( ( rule__InstancePtP__AnnotationsAssignment_7 )* )
            {
            // InternalIotlang.g:2873:1: ( ( rule__InstancePtP__AnnotationsAssignment_7 )* )
            // InternalIotlang.g:2874:2: ( rule__InstancePtP__AnnotationsAssignment_7 )*
            {
             before(grammarAccess.getInstancePtPAccess().getAnnotationsAssignment_7()); 
            // InternalIotlang.g:2875:2: ( rule__InstancePtP__AnnotationsAssignment_7 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ANNOTATION_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIotlang.g:2875:3: rule__InstancePtP__AnnotationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstancePtP__AnnotationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getInstancePtPAccess().getAnnotationsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group__7__Impl"


    // $ANTLR start "rule__InstancePtP__Group_2__0"
    // InternalIotlang.g:2884:1: rule__InstancePtP__Group_2__0 : rule__InstancePtP__Group_2__0__Impl rule__InstancePtP__Group_2__1 ;
    public final void rule__InstancePtP__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2888:1: ( rule__InstancePtP__Group_2__0__Impl rule__InstancePtP__Group_2__1 )
            // InternalIotlang.g:2889:2: rule__InstancePtP__Group_2__0__Impl rule__InstancePtP__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__InstancePtP__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group_2__0"


    // $ANTLR start "rule__InstancePtP__Group_2__0__Impl"
    // InternalIotlang.g:2896:1: rule__InstancePtP__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstancePtP__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2900:1: ( ( '[' ) )
            // InternalIotlang.g:2901:1: ( '[' )
            {
            // InternalIotlang.g:2901:1: ( '[' )
            // InternalIotlang.g:2902:2: '['
            {
             before(grammarAccess.getInstancePtPAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInstancePtPAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group_2__0__Impl"


    // $ANTLR start "rule__InstancePtP__Group_2__1"
    // InternalIotlang.g:2911:1: rule__InstancePtP__Group_2__1 : rule__InstancePtP__Group_2__1__Impl rule__InstancePtP__Group_2__2 ;
    public final void rule__InstancePtP__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2915:1: ( rule__InstancePtP__Group_2__1__Impl rule__InstancePtP__Group_2__2 )
            // InternalIotlang.g:2916:2: rule__InstancePtP__Group_2__1__Impl rule__InstancePtP__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__InstancePtP__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group_2__1"


    // $ANTLR start "rule__InstancePtP__Group_2__1__Impl"
    // InternalIotlang.g:2923:1: rule__InstancePtP__Group_2__1__Impl : ( ( rule__InstancePtP__NumberAssignment_2_1 ) ) ;
    public final void rule__InstancePtP__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2927:1: ( ( ( rule__InstancePtP__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:2928:1: ( ( rule__InstancePtP__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:2928:1: ( ( rule__InstancePtP__NumberAssignment_2_1 ) )
            // InternalIotlang.g:2929:2: ( rule__InstancePtP__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstancePtPAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:2930:2: ( rule__InstancePtP__NumberAssignment_2_1 )
            // InternalIotlang.g:2930:3: rule__InstancePtP__NumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InstancePtP__NumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInstancePtPAccess().getNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group_2__1__Impl"


    // $ANTLR start "rule__InstancePtP__Group_2__2"
    // InternalIotlang.g:2938:1: rule__InstancePtP__Group_2__2 : rule__InstancePtP__Group_2__2__Impl ;
    public final void rule__InstancePtP__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2942:1: ( rule__InstancePtP__Group_2__2__Impl )
            // InternalIotlang.g:2943:2: rule__InstancePtP__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstancePtP__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group_2__2"


    // $ANTLR start "rule__InstancePtP__Group_2__2__Impl"
    // InternalIotlang.g:2949:1: rule__InstancePtP__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstancePtP__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2953:1: ( ( ']' ) )
            // InternalIotlang.g:2954:1: ( ']' )
            {
            // InternalIotlang.g:2954:1: ( ']' )
            // InternalIotlang.g:2955:2: ']'
            {
             before(grammarAccess.getInstancePtPAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInstancePtPAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__Group_2__2__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__0"
    // InternalIotlang.g:2965:1: rule__InstancePolicy__Group__0 : rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 ;
    public final void rule__InstancePolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2969:1: ( rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 )
            // InternalIotlang.g:2970:2: rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InstancePolicy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__0"


    // $ANTLR start "rule__InstancePolicy__Group__0__Impl"
    // InternalIotlang.g:2977:1: rule__InstancePolicy__Group__0__Impl : ( 'instancePolicy' ) ;
    public final void rule__InstancePolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2981:1: ( ( 'instancePolicy' ) )
            // InternalIotlang.g:2982:1: ( 'instancePolicy' )
            {
            // InternalIotlang.g:2982:1: ( 'instancePolicy' )
            // InternalIotlang.g:2983:2: 'instancePolicy'
            {
             before(grammarAccess.getInstancePolicyAccess().getInstancePolicyKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInstancePolicyAccess().getInstancePolicyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__0__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__1"
    // InternalIotlang.g:2992:1: rule__InstancePolicy__Group__1 : rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 ;
    public final void rule__InstancePolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2996:1: ( rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 )
            // InternalIotlang.g:2997:2: rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__InstancePolicy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__1"


    // $ANTLR start "rule__InstancePolicy__Group__1__Impl"
    // InternalIotlang.g:3004:1: rule__InstancePolicy__Group__1__Impl : ( ( rule__InstancePolicy__NameAssignment_1 ) ) ;
    public final void rule__InstancePolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3008:1: ( ( ( rule__InstancePolicy__NameAssignment_1 ) ) )
            // InternalIotlang.g:3009:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:3009:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            // InternalIotlang.g:3010:2: ( rule__InstancePolicy__NameAssignment_1 )
            {
             before(grammarAccess.getInstancePolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:3011:2: ( rule__InstancePolicy__NameAssignment_1 )
            // InternalIotlang.g:3011:3: rule__InstancePolicy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstancePolicy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstancePolicyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__1__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__2"
    // InternalIotlang.g:3019:1: rule__InstancePolicy__Group__2 : rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 ;
    public final void rule__InstancePolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3023:1: ( rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 )
            // InternalIotlang.g:3024:2: rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__InstancePolicy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__2"


    // $ANTLR start "rule__InstancePolicy__Group__2__Impl"
    // InternalIotlang.g:3031:1: rule__InstancePolicy__Group__2__Impl : ( ':' ) ;
    public final void rule__InstancePolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3035:1: ( ( ':' ) )
            // InternalIotlang.g:3036:1: ( ':' )
            {
            // InternalIotlang.g:3036:1: ( ':' )
            // InternalIotlang.g:3037:2: ':'
            {
             before(grammarAccess.getInstancePolicyAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInstancePolicyAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__2__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__3"
    // InternalIotlang.g:3046:1: rule__InstancePolicy__Group__3 : rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 ;
    public final void rule__InstancePolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3050:1: ( rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 )
            // InternalIotlang.g:3051:2: rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__InstancePolicy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__3"


    // $ANTLR start "rule__InstancePolicy__Group__3__Impl"
    // InternalIotlang.g:3058:1: rule__InstancePolicy__Group__3__Impl : ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) ;
    public final void rule__InstancePolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3062:1: ( ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) )
            // InternalIotlang.g:3063:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            {
            // InternalIotlang.g:3063:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            // InternalIotlang.g:3064:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyAssignment_3()); 
            // InternalIotlang.g:3065:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            // InternalIotlang.g:3065:3: rule__InstancePolicy__TypePolicyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InstancePolicy__TypePolicyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInstancePolicyAccess().getTypePolicyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__3__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__4"
    // InternalIotlang.g:3073:1: rule__InstancePolicy__Group__4 : rule__InstancePolicy__Group__4__Impl ;
    public final void rule__InstancePolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3077:1: ( rule__InstancePolicy__Group__4__Impl )
            // InternalIotlang.g:3078:2: rule__InstancePolicy__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstancePolicy__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__4"


    // $ANTLR start "rule__InstancePolicy__Group__4__Impl"
    // InternalIotlang.g:3084:1: rule__InstancePolicy__Group__4__Impl : ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) ;
    public final void rule__InstancePolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3088:1: ( ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) )
            // InternalIotlang.g:3089:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            {
            // InternalIotlang.g:3089:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            // InternalIotlang.g:3090:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            {
             before(grammarAccess.getInstancePolicyAccess().getAnnotationsAssignment_4()); 
            // InternalIotlang.g:3091:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ANNOTATION_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIotlang.g:3091:3: rule__InstancePolicy__AnnotationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstancePolicy__AnnotationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getInstancePolicyAccess().getAnnotationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__Group__4__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__0"
    // InternalIotlang.g:3100:1: rule__NetworkConfiguration__Group__0 : rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 ;
    public final void rule__NetworkConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3104:1: ( rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 )
            // InternalIotlang.g:3105:2: rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NetworkConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__0"


    // $ANTLR start "rule__NetworkConfiguration__Group__0__Impl"
    // InternalIotlang.g:3112:1: rule__NetworkConfiguration__Group__0__Impl : ( 'networkConfiguration' ) ;
    public final void rule__NetworkConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3116:1: ( ( 'networkConfiguration' ) )
            // InternalIotlang.g:3117:1: ( 'networkConfiguration' )
            {
            // InternalIotlang.g:3117:1: ( 'networkConfiguration' )
            // InternalIotlang.g:3118:2: 'networkConfiguration'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__0__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__1"
    // InternalIotlang.g:3127:1: rule__NetworkConfiguration__Group__1 : rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 ;
    public final void rule__NetworkConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3131:1: ( rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 )
            // InternalIotlang.g:3132:2: rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__NetworkConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__1"


    // $ANTLR start "rule__NetworkConfiguration__Group__1__Impl"
    // InternalIotlang.g:3139:1: rule__NetworkConfiguration__Group__1__Impl : ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) ;
    public final void rule__NetworkConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3143:1: ( ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) )
            // InternalIotlang.g:3144:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            {
            // InternalIotlang.g:3144:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            // InternalIotlang.g:3145:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNameAssignment_1()); 
            // InternalIotlang.g:3146:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            // InternalIotlang.g:3146:3: rule__NetworkConfiguration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConfigurationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__1__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__2"
    // InternalIotlang.g:3154:1: rule__NetworkConfiguration__Group__2 : rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 ;
    public final void rule__NetworkConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3158:1: ( rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 )
            // InternalIotlang.g:3159:2: rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__NetworkConfiguration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__2"


    // $ANTLR start "rule__NetworkConfiguration__Group__2__Impl"
    // InternalIotlang.g:3166:1: rule__NetworkConfiguration__Group__2__Impl : ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) ;
    public final void rule__NetworkConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3170:1: ( ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:3171:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:3171:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:3172:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:3173:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ANNOTATION_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalIotlang.g:3173:3: rule__NetworkConfiguration__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NetworkConfiguration__AnnotationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getNetworkConfigurationAccess().getAnnotationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__2__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__3"
    // InternalIotlang.g:3181:1: rule__NetworkConfiguration__Group__3 : rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 ;
    public final void rule__NetworkConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3185:1: ( rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 )
            // InternalIotlang.g:3186:2: rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__NetworkConfiguration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__3"


    // $ANTLR start "rule__NetworkConfiguration__Group__3__Impl"
    // InternalIotlang.g:3193:1: rule__NetworkConfiguration__Group__3__Impl : ( '{' ) ;
    public final void rule__NetworkConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3197:1: ( ( '{' ) )
            // InternalIotlang.g:3198:1: ( '{' )
            {
            // InternalIotlang.g:3198:1: ( '{' )
            // InternalIotlang.g:3199:2: '{'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__3__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__4"
    // InternalIotlang.g:3208:1: rule__NetworkConfiguration__Group__4 : rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 ;
    public final void rule__NetworkConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3212:1: ( rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 )
            // InternalIotlang.g:3213:2: rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__NetworkConfiguration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__4"


    // $ANTLR start "rule__NetworkConfiguration__Group__4__Impl"
    // InternalIotlang.g:3220:1: rule__NetworkConfiguration__Group__4__Impl : ( ( rule__NetworkConfiguration__Alternatives_4 )* ) ;
    public final void rule__NetworkConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3224:1: ( ( ( rule__NetworkConfiguration__Alternatives_4 )* ) )
            // InternalIotlang.g:3225:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            {
            // InternalIotlang.g:3225:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            // InternalIotlang.g:3226:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAlternatives_4()); 
            // InternalIotlang.g:3227:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=36 && LA24_0<=37)||LA24_0==40||(LA24_0>=42 && LA24_0<=43)||(LA24_0>=45 && LA24_0<=46)||LA24_0==48) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalIotlang.g:3227:3: rule__NetworkConfiguration__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__NetworkConfiguration__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getNetworkConfigurationAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__4__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__5"
    // InternalIotlang.g:3235:1: rule__NetworkConfiguration__Group__5 : rule__NetworkConfiguration__Group__5__Impl ;
    public final void rule__NetworkConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3239:1: ( rule__NetworkConfiguration__Group__5__Impl )
            // InternalIotlang.g:3240:2: rule__NetworkConfiguration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__5"


    // $ANTLR start "rule__NetworkConfiguration__Group__5__Impl"
    // InternalIotlang.g:3246:1: rule__NetworkConfiguration__Group__5__Impl : ( '}' ) ;
    public final void rule__NetworkConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3250:1: ( ( '}' ) )
            // InternalIotlang.g:3251:1: ( '}' )
            {
            // InternalIotlang.g:3251:1: ( '}' )
            // InternalIotlang.g:3252:2: '}'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__5__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group_4_5__0"
    // InternalIotlang.g:3262:1: rule__NetworkConfiguration__Group_4_5__0 : rule__NetworkConfiguration__Group_4_5__0__Impl rule__NetworkConfiguration__Group_4_5__1 ;
    public final void rule__NetworkConfiguration__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3266:1: ( rule__NetworkConfiguration__Group_4_5__0__Impl rule__NetworkConfiguration__Group_4_5__1 )
            // InternalIotlang.g:3267:2: rule__NetworkConfiguration__Group_4_5__0__Impl rule__NetworkConfiguration__Group_4_5__1
            {
            pushFollow(FOLLOW_5);
            rule__NetworkConfiguration__Group_4_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group_4_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group_4_5__0"


    // $ANTLR start "rule__NetworkConfiguration__Group_4_5__0__Impl"
    // InternalIotlang.g:3274:1: rule__NetworkConfiguration__Group_4_5__0__Impl : ( 'enforce' ) ;
    public final void rule__NetworkConfiguration__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3278:1: ( ( 'enforce' ) )
            // InternalIotlang.g:3279:1: ( 'enforce' )
            {
            // InternalIotlang.g:3279:1: ( 'enforce' )
            // InternalIotlang.g:3280:2: 'enforce'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_5_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group_4_5__0__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group_4_5__1"
    // InternalIotlang.g:3289:1: rule__NetworkConfiguration__Group_4_5__1 : rule__NetworkConfiguration__Group_4_5__1__Impl ;
    public final void rule__NetworkConfiguration__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3293:1: ( rule__NetworkConfiguration__Group_4_5__1__Impl )
            // InternalIotlang.g:3294:2: rule__NetworkConfiguration__Group_4_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group_4_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group_4_5__1"


    // $ANTLR start "rule__NetworkConfiguration__Group_4_5__1__Impl"
    // InternalIotlang.g:3300:1: rule__NetworkConfiguration__Group_4_5__1__Impl : ( ( rule__NetworkConfiguration__EnforcesAssignment_4_5_1 ) ) ;
    public final void rule__NetworkConfiguration__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3304:1: ( ( ( rule__NetworkConfiguration__EnforcesAssignment_4_5_1 ) ) )
            // InternalIotlang.g:3305:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_5_1 ) )
            {
            // InternalIotlang.g:3305:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_5_1 ) )
            // InternalIotlang.g:3306:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_5_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesAssignment_4_5_1()); 
            // InternalIotlang.g:3307:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_5_1 )
            // InternalIotlang.g:3307:3: rule__NetworkConfiguration__EnforcesAssignment_4_5_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__EnforcesAssignment_4_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConfigurationAccess().getEnforcesAssignment_4_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group_4_5__1__Impl"


    // $ANTLR start "rule__Bind__Group__0"
    // InternalIotlang.g:3316:1: rule__Bind__Group__0 : rule__Bind__Group__0__Impl rule__Bind__Group__1 ;
    public final void rule__Bind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3320:1: ( rule__Bind__Group__0__Impl rule__Bind__Group__1 )
            // InternalIotlang.g:3321:2: rule__Bind__Group__0__Impl rule__Bind__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Bind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__0"


    // $ANTLR start "rule__Bind__Group__0__Impl"
    // InternalIotlang.g:3328:1: rule__Bind__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Bind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3332:1: ( ( 'bind' ) )
            // InternalIotlang.g:3333:1: ( 'bind' )
            {
            // InternalIotlang.g:3333:1: ( 'bind' )
            // InternalIotlang.g:3334:2: 'bind'
            {
             before(grammarAccess.getBindAccess().getBindKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getBindKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__0__Impl"


    // $ANTLR start "rule__Bind__Group__1"
    // InternalIotlang.g:3343:1: rule__Bind__Group__1 : rule__Bind__Group__1__Impl rule__Bind__Group__2 ;
    public final void rule__Bind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3347:1: ( rule__Bind__Group__1__Impl rule__Bind__Group__2 )
            // InternalIotlang.g:3348:2: rule__Bind__Group__1__Impl rule__Bind__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Bind__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__1"


    // $ANTLR start "rule__Bind__Group__1__Impl"
    // InternalIotlang.g:3355:1: rule__Bind__Group__1__Impl : ( ( rule__Bind__NameAssignment_1 )? ) ;
    public final void rule__Bind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3359:1: ( ( ( rule__Bind__NameAssignment_1 )? ) )
            // InternalIotlang.g:3360:1: ( ( rule__Bind__NameAssignment_1 )? )
            {
            // InternalIotlang.g:3360:1: ( ( rule__Bind__NameAssignment_1 )? )
            // InternalIotlang.g:3361:2: ( rule__Bind__NameAssignment_1 )?
            {
             before(grammarAccess.getBindAccess().getNameAssignment_1()); 
            // InternalIotlang.g:3362:2: ( rule__Bind__NameAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_ID) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalIotlang.g:3362:3: rule__Bind__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bind__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBindAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__1__Impl"


    // $ANTLR start "rule__Bind__Group__2"
    // InternalIotlang.g:3370:1: rule__Bind__Group__2 : rule__Bind__Group__2__Impl rule__Bind__Group__3 ;
    public final void rule__Bind__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3374:1: ( rule__Bind__Group__2__Impl rule__Bind__Group__3 )
            // InternalIotlang.g:3375:2: rule__Bind__Group__2__Impl rule__Bind__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Bind__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__2"


    // $ANTLR start "rule__Bind__Group__2__Impl"
    // InternalIotlang.g:3382:1: rule__Bind__Group__2__Impl : ( ( rule__Bind__ThingInstanceAssignment_2 ) ) ;
    public final void rule__Bind__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3386:1: ( ( ( rule__Bind__ThingInstanceAssignment_2 ) ) )
            // InternalIotlang.g:3387:1: ( ( rule__Bind__ThingInstanceAssignment_2 ) )
            {
            // InternalIotlang.g:3387:1: ( ( rule__Bind__ThingInstanceAssignment_2 ) )
            // InternalIotlang.g:3388:2: ( rule__Bind__ThingInstanceAssignment_2 )
            {
             before(grammarAccess.getBindAccess().getThingInstanceAssignment_2()); 
            // InternalIotlang.g:3389:2: ( rule__Bind__ThingInstanceAssignment_2 )
            // InternalIotlang.g:3389:3: rule__Bind__ThingInstanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Bind__ThingInstanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getThingInstanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__2__Impl"


    // $ANTLR start "rule__Bind__Group__3"
    // InternalIotlang.g:3397:1: rule__Bind__Group__3 : rule__Bind__Group__3__Impl rule__Bind__Group__4 ;
    public final void rule__Bind__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3401:1: ( rule__Bind__Group__3__Impl rule__Bind__Group__4 )
            // InternalIotlang.g:3402:2: rule__Bind__Group__3__Impl rule__Bind__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Bind__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__3"


    // $ANTLR start "rule__Bind__Group__3__Impl"
    // InternalIotlang.g:3409:1: rule__Bind__Group__3__Impl : ( ( rule__Bind__DirectionAssignment_3 ) ) ;
    public final void rule__Bind__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3413:1: ( ( ( rule__Bind__DirectionAssignment_3 ) ) )
            // InternalIotlang.g:3414:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            {
            // InternalIotlang.g:3414:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            // InternalIotlang.g:3415:2: ( rule__Bind__DirectionAssignment_3 )
            {
             before(grammarAccess.getBindAccess().getDirectionAssignment_3()); 
            // InternalIotlang.g:3416:2: ( rule__Bind__DirectionAssignment_3 )
            // InternalIotlang.g:3416:3: rule__Bind__DirectionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Bind__DirectionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getDirectionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__3__Impl"


    // $ANTLR start "rule__Bind__Group__4"
    // InternalIotlang.g:3424:1: rule__Bind__Group__4 : rule__Bind__Group__4__Impl rule__Bind__Group__5 ;
    public final void rule__Bind__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3428:1: ( rule__Bind__Group__4__Impl rule__Bind__Group__5 )
            // InternalIotlang.g:3429:2: rule__Bind__Group__4__Impl rule__Bind__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Bind__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__4"


    // $ANTLR start "rule__Bind__Group__4__Impl"
    // InternalIotlang.g:3436:1: rule__Bind__Group__4__Impl : ( ( rule__Bind__PubSubInstanceAssignment_4 ) ) ;
    public final void rule__Bind__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3440:1: ( ( ( rule__Bind__PubSubInstanceAssignment_4 ) ) )
            // InternalIotlang.g:3441:1: ( ( rule__Bind__PubSubInstanceAssignment_4 ) )
            {
            // InternalIotlang.g:3441:1: ( ( rule__Bind__PubSubInstanceAssignment_4 ) )
            // InternalIotlang.g:3442:2: ( rule__Bind__PubSubInstanceAssignment_4 )
            {
             before(grammarAccess.getBindAccess().getPubSubInstanceAssignment_4()); 
            // InternalIotlang.g:3443:2: ( rule__Bind__PubSubInstanceAssignment_4 )
            // InternalIotlang.g:3443:3: rule__Bind__PubSubInstanceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Bind__PubSubInstanceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getPubSubInstanceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__4__Impl"


    // $ANTLR start "rule__Bind__Group__5"
    // InternalIotlang.g:3451:1: rule__Bind__Group__5 : rule__Bind__Group__5__Impl rule__Bind__Group__6 ;
    public final void rule__Bind__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3455:1: ( rule__Bind__Group__5__Impl rule__Bind__Group__6 )
            // InternalIotlang.g:3456:2: rule__Bind__Group__5__Impl rule__Bind__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Bind__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__5"


    // $ANTLR start "rule__Bind__Group__5__Impl"
    // InternalIotlang.g:3463:1: rule__Bind__Group__5__Impl : ( '{' ) ;
    public final void rule__Bind__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3467:1: ( ( '{' ) )
            // InternalIotlang.g:3468:1: ( '{' )
            {
            // InternalIotlang.g:3468:1: ( '{' )
            // InternalIotlang.g:3469:2: '{'
            {
             before(grammarAccess.getBindAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__5__Impl"


    // $ANTLR start "rule__Bind__Group__6"
    // InternalIotlang.g:3478:1: rule__Bind__Group__6 : rule__Bind__Group__6__Impl rule__Bind__Group__7 ;
    public final void rule__Bind__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3482:1: ( rule__Bind__Group__6__Impl rule__Bind__Group__7 )
            // InternalIotlang.g:3483:2: rule__Bind__Group__6__Impl rule__Bind__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__Bind__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__6"


    // $ANTLR start "rule__Bind__Group__6__Impl"
    // InternalIotlang.g:3490:1: rule__Bind__Group__6__Impl : ( ( rule__Bind__TopicsAssignment_6 ) ) ;
    public final void rule__Bind__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3494:1: ( ( ( rule__Bind__TopicsAssignment_6 ) ) )
            // InternalIotlang.g:3495:1: ( ( rule__Bind__TopicsAssignment_6 ) )
            {
            // InternalIotlang.g:3495:1: ( ( rule__Bind__TopicsAssignment_6 ) )
            // InternalIotlang.g:3496:2: ( rule__Bind__TopicsAssignment_6 )
            {
             before(grammarAccess.getBindAccess().getTopicsAssignment_6()); 
            // InternalIotlang.g:3497:2: ( rule__Bind__TopicsAssignment_6 )
            // InternalIotlang.g:3497:3: rule__Bind__TopicsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Bind__TopicsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getTopicsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__6__Impl"


    // $ANTLR start "rule__Bind__Group__7"
    // InternalIotlang.g:3505:1: rule__Bind__Group__7 : rule__Bind__Group__7__Impl rule__Bind__Group__8 ;
    public final void rule__Bind__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3509:1: ( rule__Bind__Group__7__Impl rule__Bind__Group__8 )
            // InternalIotlang.g:3510:2: rule__Bind__Group__7__Impl rule__Bind__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__Bind__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__7"


    // $ANTLR start "rule__Bind__Group__7__Impl"
    // InternalIotlang.g:3517:1: rule__Bind__Group__7__Impl : ( ( rule__Bind__Group_7__0 )* ) ;
    public final void rule__Bind__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3521:1: ( ( ( rule__Bind__Group_7__0 )* ) )
            // InternalIotlang.g:3522:1: ( ( rule__Bind__Group_7__0 )* )
            {
            // InternalIotlang.g:3522:1: ( ( rule__Bind__Group_7__0 )* )
            // InternalIotlang.g:3523:2: ( rule__Bind__Group_7__0 )*
            {
             before(grammarAccess.getBindAccess().getGroup_7()); 
            // InternalIotlang.g:3524:2: ( rule__Bind__Group_7__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==47) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalIotlang.g:3524:3: rule__Bind__Group_7__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Bind__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getBindAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__7__Impl"


    // $ANTLR start "rule__Bind__Group__8"
    // InternalIotlang.g:3532:1: rule__Bind__Group__8 : rule__Bind__Group__8__Impl rule__Bind__Group__9 ;
    public final void rule__Bind__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3536:1: ( rule__Bind__Group__8__Impl rule__Bind__Group__9 )
            // InternalIotlang.g:3537:2: rule__Bind__Group__8__Impl rule__Bind__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__Bind__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__8"


    // $ANTLR start "rule__Bind__Group__8__Impl"
    // InternalIotlang.g:3544:1: rule__Bind__Group__8__Impl : ( '}' ) ;
    public final void rule__Bind__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3548:1: ( ( '}' ) )
            // InternalIotlang.g:3549:1: ( '}' )
            {
            // InternalIotlang.g:3549:1: ( '}' )
            // InternalIotlang.g:3550:2: '}'
            {
             before(grammarAccess.getBindAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__8__Impl"


    // $ANTLR start "rule__Bind__Group__9"
    // InternalIotlang.g:3559:1: rule__Bind__Group__9 : rule__Bind__Group__9__Impl ;
    public final void rule__Bind__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3563:1: ( rule__Bind__Group__9__Impl )
            // InternalIotlang.g:3564:2: rule__Bind__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bind__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__9"


    // $ANTLR start "rule__Bind__Group__9__Impl"
    // InternalIotlang.g:3570:1: rule__Bind__Group__9__Impl : ( ( rule__Bind__AnnotationsAssignment_9 )* ) ;
    public final void rule__Bind__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3574:1: ( ( ( rule__Bind__AnnotationsAssignment_9 )* ) )
            // InternalIotlang.g:3575:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            {
            // InternalIotlang.g:3575:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            // InternalIotlang.g:3576:2: ( rule__Bind__AnnotationsAssignment_9 )*
            {
             before(grammarAccess.getBindAccess().getAnnotationsAssignment_9()); 
            // InternalIotlang.g:3577:2: ( rule__Bind__AnnotationsAssignment_9 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ANNOTATION_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalIotlang.g:3577:3: rule__Bind__AnnotationsAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Bind__AnnotationsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getBindAccess().getAnnotationsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group__9__Impl"


    // $ANTLR start "rule__Bind__Group_7__0"
    // InternalIotlang.g:3586:1: rule__Bind__Group_7__0 : rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 ;
    public final void rule__Bind__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3590:1: ( rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 )
            // InternalIotlang.g:3591:2: rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Bind__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bind__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group_7__0"


    // $ANTLR start "rule__Bind__Group_7__0__Impl"
    // InternalIotlang.g:3598:1: rule__Bind__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Bind__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3602:1: ( ( ',' ) )
            // InternalIotlang.g:3603:1: ( ',' )
            {
            // InternalIotlang.g:3603:1: ( ',' )
            // InternalIotlang.g:3604:2: ','
            {
             before(grammarAccess.getBindAccess().getCommaKeyword_7_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group_7__0__Impl"


    // $ANTLR start "rule__Bind__Group_7__1"
    // InternalIotlang.g:3613:1: rule__Bind__Group_7__1 : rule__Bind__Group_7__1__Impl ;
    public final void rule__Bind__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3617:1: ( rule__Bind__Group_7__1__Impl )
            // InternalIotlang.g:3618:2: rule__Bind__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bind__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group_7__1"


    // $ANTLR start "rule__Bind__Group_7__1__Impl"
    // InternalIotlang.g:3624:1: rule__Bind__Group_7__1__Impl : ( ( rule__Bind__TopicsAssignment_7_1 ) ) ;
    public final void rule__Bind__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3628:1: ( ( ( rule__Bind__TopicsAssignment_7_1 ) ) )
            // InternalIotlang.g:3629:1: ( ( rule__Bind__TopicsAssignment_7_1 ) )
            {
            // InternalIotlang.g:3629:1: ( ( rule__Bind__TopicsAssignment_7_1 ) )
            // InternalIotlang.g:3630:2: ( rule__Bind__TopicsAssignment_7_1 )
            {
             before(grammarAccess.getBindAccess().getTopicsAssignment_7_1()); 
            // InternalIotlang.g:3631:2: ( rule__Bind__TopicsAssignment_7_1 )
            // InternalIotlang.g:3631:3: rule__Bind__TopicsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Bind__TopicsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getTopicsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__Group_7__1__Impl"


    // $ANTLR start "rule__Connect__Group__0"
    // InternalIotlang.g:3640:1: rule__Connect__Group__0 : rule__Connect__Group__0__Impl rule__Connect__Group__1 ;
    public final void rule__Connect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3644:1: ( rule__Connect__Group__0__Impl rule__Connect__Group__1 )
            // InternalIotlang.g:3645:2: rule__Connect__Group__0__Impl rule__Connect__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Connect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__0"


    // $ANTLR start "rule__Connect__Group__0__Impl"
    // InternalIotlang.g:3652:1: rule__Connect__Group__0__Impl : ( 'connect' ) ;
    public final void rule__Connect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3656:1: ( ( 'connect' ) )
            // InternalIotlang.g:3657:1: ( 'connect' )
            {
            // InternalIotlang.g:3657:1: ( 'connect' )
            // InternalIotlang.g:3658:2: 'connect'
            {
             before(grammarAccess.getConnectAccess().getConnectKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getConnectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__0__Impl"


    // $ANTLR start "rule__Connect__Group__1"
    // InternalIotlang.g:3667:1: rule__Connect__Group__1 : rule__Connect__Group__1__Impl rule__Connect__Group__2 ;
    public final void rule__Connect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3671:1: ( rule__Connect__Group__1__Impl rule__Connect__Group__2 )
            // InternalIotlang.g:3672:2: rule__Connect__Group__1__Impl rule__Connect__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Connect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__1"


    // $ANTLR start "rule__Connect__Group__1__Impl"
    // InternalIotlang.g:3679:1: rule__Connect__Group__1__Impl : ( ( rule__Connect__NameAssignment_1 )? ) ;
    public final void rule__Connect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3683:1: ( ( ( rule__Connect__NameAssignment_1 )? ) )
            // InternalIotlang.g:3684:1: ( ( rule__Connect__NameAssignment_1 )? )
            {
            // InternalIotlang.g:3684:1: ( ( rule__Connect__NameAssignment_1 )? )
            // InternalIotlang.g:3685:2: ( rule__Connect__NameAssignment_1 )?
            {
             before(grammarAccess.getConnectAccess().getNameAssignment_1()); 
            // InternalIotlang.g:3686:2: ( rule__Connect__NameAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_ID) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalIotlang.g:3686:3: rule__Connect__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connect__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__1__Impl"


    // $ANTLR start "rule__Connect__Group__2"
    // InternalIotlang.g:3694:1: rule__Connect__Group__2 : rule__Connect__Group__2__Impl rule__Connect__Group__3 ;
    public final void rule__Connect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3698:1: ( rule__Connect__Group__2__Impl rule__Connect__Group__3 )
            // InternalIotlang.g:3699:2: rule__Connect__Group__2__Impl rule__Connect__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Connect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__2"


    // $ANTLR start "rule__Connect__Group__2__Impl"
    // InternalIotlang.g:3706:1: rule__Connect__Group__2__Impl : ( ( rule__Connect__ThingInstanceAssignment_2 ) ) ;
    public final void rule__Connect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3710:1: ( ( ( rule__Connect__ThingInstanceAssignment_2 ) ) )
            // InternalIotlang.g:3711:1: ( ( rule__Connect__ThingInstanceAssignment_2 ) )
            {
            // InternalIotlang.g:3711:1: ( ( rule__Connect__ThingInstanceAssignment_2 ) )
            // InternalIotlang.g:3712:2: ( rule__Connect__ThingInstanceAssignment_2 )
            {
             before(grammarAccess.getConnectAccess().getThingInstanceAssignment_2()); 
            // InternalIotlang.g:3713:2: ( rule__Connect__ThingInstanceAssignment_2 )
            // InternalIotlang.g:3713:3: rule__Connect__ThingInstanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connect__ThingInstanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectAccess().getThingInstanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__2__Impl"


    // $ANTLR start "rule__Connect__Group__3"
    // InternalIotlang.g:3721:1: rule__Connect__Group__3 : rule__Connect__Group__3__Impl rule__Connect__Group__4 ;
    public final void rule__Connect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3725:1: ( rule__Connect__Group__3__Impl rule__Connect__Group__4 )
            // InternalIotlang.g:3726:2: rule__Connect__Group__3__Impl rule__Connect__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Connect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connect__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__3"


    // $ANTLR start "rule__Connect__Group__3__Impl"
    // InternalIotlang.g:3733:1: rule__Connect__Group__3__Impl : ( ( rule__Connect__DirectionAssignment_3 ) ) ;
    public final void rule__Connect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3737:1: ( ( ( rule__Connect__DirectionAssignment_3 ) ) )
            // InternalIotlang.g:3738:1: ( ( rule__Connect__DirectionAssignment_3 ) )
            {
            // InternalIotlang.g:3738:1: ( ( rule__Connect__DirectionAssignment_3 ) )
            // InternalIotlang.g:3739:2: ( rule__Connect__DirectionAssignment_3 )
            {
             before(grammarAccess.getConnectAccess().getDirectionAssignment_3()); 
            // InternalIotlang.g:3740:2: ( rule__Connect__DirectionAssignment_3 )
            // InternalIotlang.g:3740:3: rule__Connect__DirectionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Connect__DirectionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectAccess().getDirectionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__3__Impl"


    // $ANTLR start "rule__Connect__Group__4"
    // InternalIotlang.g:3748:1: rule__Connect__Group__4 : rule__Connect__Group__4__Impl rule__Connect__Group__5 ;
    public final void rule__Connect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3752:1: ( rule__Connect__Group__4__Impl rule__Connect__Group__5 )
            // InternalIotlang.g:3753:2: rule__Connect__Group__4__Impl rule__Connect__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Connect__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connect__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__4"


    // $ANTLR start "rule__Connect__Group__4__Impl"
    // InternalIotlang.g:3760:1: rule__Connect__Group__4__Impl : ( ( rule__Connect__PtpInstanceAssignment_4 ) ) ;
    public final void rule__Connect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3764:1: ( ( ( rule__Connect__PtpInstanceAssignment_4 ) ) )
            // InternalIotlang.g:3765:1: ( ( rule__Connect__PtpInstanceAssignment_4 ) )
            {
            // InternalIotlang.g:3765:1: ( ( rule__Connect__PtpInstanceAssignment_4 ) )
            // InternalIotlang.g:3766:2: ( rule__Connect__PtpInstanceAssignment_4 )
            {
             before(grammarAccess.getConnectAccess().getPtpInstanceAssignment_4()); 
            // InternalIotlang.g:3767:2: ( rule__Connect__PtpInstanceAssignment_4 )
            // InternalIotlang.g:3767:3: rule__Connect__PtpInstanceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Connect__PtpInstanceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnectAccess().getPtpInstanceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__4__Impl"


    // $ANTLR start "rule__Connect__Group__5"
    // InternalIotlang.g:3775:1: rule__Connect__Group__5 : rule__Connect__Group__5__Impl ;
    public final void rule__Connect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3779:1: ( rule__Connect__Group__5__Impl )
            // InternalIotlang.g:3780:2: rule__Connect__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connect__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__5"


    // $ANTLR start "rule__Connect__Group__5__Impl"
    // InternalIotlang.g:3786:1: rule__Connect__Group__5__Impl : ( ( rule__Connect__AnnotationsAssignment_5 )* ) ;
    public final void rule__Connect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3790:1: ( ( ( rule__Connect__AnnotationsAssignment_5 )* ) )
            // InternalIotlang.g:3791:1: ( ( rule__Connect__AnnotationsAssignment_5 )* )
            {
            // InternalIotlang.g:3791:1: ( ( rule__Connect__AnnotationsAssignment_5 )* )
            // InternalIotlang.g:3792:2: ( rule__Connect__AnnotationsAssignment_5 )*
            {
             before(grammarAccess.getConnectAccess().getAnnotationsAssignment_5()); 
            // InternalIotlang.g:3793:2: ( rule__Connect__AnnotationsAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ANNOTATION_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalIotlang.g:3793:3: rule__Connect__AnnotationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Connect__AnnotationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getConnectAccess().getAnnotationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__Group__5__Impl"


    // $ANTLR start "rule__IoTLangModel__ThingsAssignment_0"
    // InternalIotlang.g:3802:1: rule__IoTLangModel__ThingsAssignment_0 : ( ruleThing ) ;
    public final void rule__IoTLangModel__ThingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3806:1: ( ( ruleThing ) )
            // InternalIotlang.g:3807:2: ( ruleThing )
            {
            // InternalIotlang.g:3807:2: ( ruleThing )
            // InternalIotlang.g:3808:3: ruleThing
            {
             before(grammarAccess.getIoTLangModelAccess().getThingsThingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleThing();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getThingsThingParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__ThingsAssignment_0"


    // $ANTLR start "rule__IoTLangModel__PoliciesAssignment_1"
    // InternalIotlang.g:3817:1: rule__IoTLangModel__PoliciesAssignment_1 : ( rulePolicy ) ;
    public final void rule__IoTLangModel__PoliciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3821:1: ( ( rulePolicy ) )
            // InternalIotlang.g:3822:2: ( rulePolicy )
            {
            // InternalIotlang.g:3822:2: ( rulePolicy )
            // InternalIotlang.g:3823:3: rulePolicy
            {
             before(grammarAccess.getIoTLangModelAccess().getPoliciesPolicyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getPoliciesPolicyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__PoliciesAssignment_1"


    // $ANTLR start "rule__IoTLangModel__MessagesAssignment_2"
    // InternalIotlang.g:3832:1: rule__IoTLangModel__MessagesAssignment_2 : ( ruleMessage ) ;
    public final void rule__IoTLangModel__MessagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3836:1: ( ( ruleMessage ) )
            // InternalIotlang.g:3837:2: ( ruleMessage )
            {
            // InternalIotlang.g:3837:2: ( ruleMessage )
            // InternalIotlang.g:3838:3: ruleMessage
            {
             before(grammarAccess.getIoTLangModelAccess().getMessagesMessageParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getMessagesMessageParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__MessagesAssignment_2"


    // $ANTLR start "rule__IoTLangModel__ChannelsAssignment_3"
    // InternalIotlang.g:3847:1: rule__IoTLangModel__ChannelsAssignment_3 : ( ruleChannel ) ;
    public final void rule__IoTLangModel__ChannelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3851:1: ( ( ruleChannel ) )
            // InternalIotlang.g:3852:2: ( ruleChannel )
            {
            // InternalIotlang.g:3852:2: ( ruleChannel )
            // InternalIotlang.g:3853:3: ruleChannel
            {
             before(grammarAccess.getIoTLangModelAccess().getChannelsChannelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getChannelsChannelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__ChannelsAssignment_3"


    // $ANTLR start "rule__IoTLangModel__ProtocolsAssignment_4"
    // InternalIotlang.g:3862:1: rule__IoTLangModel__ProtocolsAssignment_4 : ( ruleProtocol ) ;
    public final void rule__IoTLangModel__ProtocolsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3866:1: ( ( ruleProtocol ) )
            // InternalIotlang.g:3867:2: ( ruleProtocol )
            {
            // InternalIotlang.g:3867:2: ( ruleProtocol )
            // InternalIotlang.g:3868:3: ruleProtocol
            {
             before(grammarAccess.getIoTLangModelAccess().getProtocolsProtocolParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getProtocolsProtocolParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__ProtocolsAssignment_4"


    // $ANTLR start "rule__IoTLangModel__ConfigsAssignment_5"
    // InternalIotlang.g:3877:1: rule__IoTLangModel__ConfigsAssignment_5 : ( ruleNetworkConfiguration ) ;
    public final void rule__IoTLangModel__ConfigsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3881:1: ( ( ruleNetworkConfiguration ) )
            // InternalIotlang.g:3882:2: ( ruleNetworkConfiguration )
            {
            // InternalIotlang.g:3882:2: ( ruleNetworkConfiguration )
            // InternalIotlang.g:3883:3: ruleNetworkConfiguration
            {
             before(grammarAccess.getIoTLangModelAccess().getConfigsNetworkConfigurationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNetworkConfiguration();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getConfigsNetworkConfigurationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__ConfigsAssignment_5"


    // $ANTLR start "rule__PlatformAnnotation__NameAssignment_0"
    // InternalIotlang.g:3892:1: rule__PlatformAnnotation__NameAssignment_0 : ( RULE_ANNOTATION_ID ) ;
    public final void rule__PlatformAnnotation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3896:1: ( ( RULE_ANNOTATION_ID ) )
            // InternalIotlang.g:3897:2: ( RULE_ANNOTATION_ID )
            {
            // InternalIotlang.g:3897:2: ( RULE_ANNOTATION_ID )
            // InternalIotlang.g:3898:3: RULE_ANNOTATION_ID
            {
             before(grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0()); 
            match(input,RULE_ANNOTATION_ID,FOLLOW_2); 
             after(grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__NameAssignment_0"


    // $ANTLR start "rule__PlatformAnnotation__ValueAssignment_1"
    // InternalIotlang.g:3907:1: rule__PlatformAnnotation__ValueAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__PlatformAnnotation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3911:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:3912:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:3912:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:3913:3: RULE_STRING_LIT
            {
             before(grammarAccess.getPlatformAnnotationAccess().getValueSTRING_LITTerminalRuleCall_1_0()); 
            match(input,RULE_STRING_LIT,FOLLOW_2); 
             after(grammarAccess.getPlatformAnnotationAccess().getValueSTRING_LITTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformAnnotation__ValueAssignment_1"


    // $ANTLR start "rule__Thing__NameAssignment_1"
    // InternalIotlang.g:3922:1: rule__Thing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Thing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3926:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3927:2: ( RULE_ID )
            {
            // InternalIotlang.g:3927:2: ( RULE_ID )
            // InternalIotlang.g:3928:3: RULE_ID
            {
             before(grammarAccess.getThingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getThingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__NameAssignment_1"


    // $ANTLR start "rule__Thing__AnnotationsAssignment_2"
    // InternalIotlang.g:3937:1: rule__Thing__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__Thing__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3941:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3942:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3942:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3943:3: rulePlatformAnnotation
            {
             before(grammarAccess.getThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__AnnotationsAssignment_2"


    // $ANTLR start "rule__Thing__PortsAssignment_4"
    // InternalIotlang.g:3952:1: rule__Thing__PortsAssignment_4 : ( rulePort ) ;
    public final void rule__Thing__PortsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3956:1: ( ( rulePort ) )
            // InternalIotlang.g:3957:2: ( rulePort )
            {
            // InternalIotlang.g:3957:2: ( rulePort )
            // InternalIotlang.g:3958:3: rulePort
            {
             before(grammarAccess.getThingAccess().getPortsPortParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getThingAccess().getPortsPortParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thing__PortsAssignment_4"


    // $ANTLR start "rule__Channel__PubSubAssignment_0"
    // InternalIotlang.g:3967:1: rule__Channel__PubSubAssignment_0 : ( rulePubSub ) ;
    public final void rule__Channel__PubSubAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3971:1: ( ( rulePubSub ) )
            // InternalIotlang.g:3972:2: ( rulePubSub )
            {
            // InternalIotlang.g:3972:2: ( rulePubSub )
            // InternalIotlang.g:3973:3: rulePubSub
            {
             before(grammarAccess.getChannelAccess().getPubSubPubSubParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePubSub();

            state._fsp--;

             after(grammarAccess.getChannelAccess().getPubSubPubSubParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__PubSubAssignment_0"


    // $ANTLR start "rule__Channel__PointToPointAssignment_1"
    // InternalIotlang.g:3982:1: rule__Channel__PointToPointAssignment_1 : ( rulePointToPoint ) ;
    public final void rule__Channel__PointToPointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3986:1: ( ( rulePointToPoint ) )
            // InternalIotlang.g:3987:2: ( rulePointToPoint )
            {
            // InternalIotlang.g:3987:2: ( rulePointToPoint )
            // InternalIotlang.g:3988:3: rulePointToPoint
            {
             before(grammarAccess.getChannelAccess().getPointToPointPointToPointParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePointToPoint();

            state._fsp--;

             after(grammarAccess.getChannelAccess().getPointToPointPointToPointParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__PointToPointAssignment_1"


    // $ANTLR start "rule__PubSub__NameAssignment_1"
    // InternalIotlang.g:3997:1: rule__PubSub__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PubSub__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4001:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4002:2: ( RULE_ID )
            {
            // InternalIotlang.g:4002:2: ( RULE_ID )
            // InternalIotlang.g:4003:3: RULE_ID
            {
             before(grammarAccess.getPubSubAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPubSubAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__NameAssignment_1"


    // $ANTLR start "rule__PubSub__HasTopicsAssignment_3"
    // InternalIotlang.g:4012:1: rule__PubSub__HasTopicsAssignment_3 : ( ruleTopic ) ;
    public final void rule__PubSub__HasTopicsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4016:1: ( ( ruleTopic ) )
            // InternalIotlang.g:4017:2: ( ruleTopic )
            {
            // InternalIotlang.g:4017:2: ( ruleTopic )
            // InternalIotlang.g:4018:3: ruleTopic
            {
             before(grammarAccess.getPubSubAccess().getHasTopicsTopicParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getPubSubAccess().getHasTopicsTopicParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PubSub__HasTopicsAssignment_3"


    // $ANTLR start "rule__PointToPoint__NameAssignment_1"
    // InternalIotlang.g:4027:1: rule__PointToPoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PointToPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4031:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4032:2: ( RULE_ID )
            {
            // InternalIotlang.g:4032:2: ( RULE_ID )
            // InternalIotlang.g:4033:3: RULE_ID
            {
             before(grammarAccess.getPointToPointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPointToPointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__NameAssignment_1"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalIotlang.g:4042:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4046:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4047:2: ( RULE_ID )
            {
            // InternalIotlang.g:4047:2: ( RULE_ID )
            // InternalIotlang.g:4048:3: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__NameAssignment_1"


    // $ANTLR start "rule__Policy__HasRulesAssignment_3"
    // InternalIotlang.g:4057:1: rule__Policy__HasRulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Policy__HasRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4061:1: ( ( ruleRule ) )
            // InternalIotlang.g:4062:2: ( ruleRule )
            {
            // InternalIotlang.g:4062:2: ( ruleRule )
            // InternalIotlang.g:4063:3: ruleRule
            {
             before(grammarAccess.getPolicyAccess().getHasRulesRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getHasRulesRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__HasRulesAssignment_3"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // InternalIotlang.g:4072:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4076:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4077:2: ( RULE_ID )
            {
            // InternalIotlang.g:4077:2: ( RULE_ID )
            // InternalIotlang.g:4078:3: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NameAssignment_1"


    // $ANTLR start "rule__Protocol__NameAssignment_1"
    // InternalIotlang.g:4087:1: rule__Protocol__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Protocol__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4091:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4092:2: ( RULE_ID )
            {
            // InternalIotlang.g:4092:2: ( RULE_ID )
            // InternalIotlang.g:4093:3: RULE_ID
            {
             before(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__NameAssignment_1"


    // $ANTLR start "rule__Message__NameAssignment_1"
    // InternalIotlang.g:4102:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4106:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4107:2: ( RULE_ID )
            {
            // InternalIotlang.g:4107:2: ( RULE_ID )
            // InternalIotlang.g:4108:3: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__NameAssignment_1"


    // $ANTLR start "rule__Topic__NameAssignment_1"
    // InternalIotlang.g:4117:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4121:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4122:2: ( RULE_ID )
            {
            // InternalIotlang.g:4122:2: ( RULE_ID )
            // InternalIotlang.g:4123:3: RULE_ID
            {
             before(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__NameAssignment_1"


    // $ANTLR start "rule__Topic__AcceptedMessagesAssignment_3"
    // InternalIotlang.g:4132:1: rule__Topic__AcceptedMessagesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Topic__AcceptedMessagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4136:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4137:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4137:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4138:3: ( RULE_ID )
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesMessageCrossReference_3_0()); 
            // InternalIotlang.g:4139:3: ( RULE_ID )
            // InternalIotlang.g:4140:4: RULE_ID
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesMessageIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getAcceptedMessagesMessageIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTopicAccess().getAcceptedMessagesMessageCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__AcceptedMessagesAssignment_3"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalIotlang.g:4151:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4155:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4156:2: ( RULE_ID )
            {
            // InternalIotlang.g:4156:2: ( RULE_ID )
            // InternalIotlang.g:4157:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__SubjectAssignment_2"
    // InternalIotlang.g:4166:1: rule__Rule__SubjectAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__SubjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4170:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4171:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4171:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4172:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getSubjectThingCrossReference_2_0()); 
            // InternalIotlang.g:4173:3: ( RULE_ID )
            // InternalIotlang.g:4174:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getSubjectThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSubjectThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getSubjectThingCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__SubjectAssignment_2"


    // $ANTLR start "rule__Rule__PermissionAssignment_3"
    // InternalIotlang.g:4185:1: rule__Rule__PermissionAssignment_3 : ( ( rule__Rule__PermissionAlternatives_3_0 ) ) ;
    public final void rule__Rule__PermissionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4189:1: ( ( ( rule__Rule__PermissionAlternatives_3_0 ) ) )
            // InternalIotlang.g:4190:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:4190:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            // InternalIotlang.g:4191:3: ( rule__Rule__PermissionAlternatives_3_0 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAlternatives_3_0()); 
            // InternalIotlang.g:4192:3: ( rule__Rule__PermissionAlternatives_3_0 )
            // InternalIotlang.g:4192:4: rule__Rule__PermissionAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__PermissionAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getPermissionAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PermissionAssignment_3"


    // $ANTLR start "rule__Rule__ActionAssignment_5"
    // InternalIotlang.g:4200:1: rule__Rule__ActionAssignment_5 : ( ( rule__Rule__ActionAlternatives_5_0 ) ) ;
    public final void rule__Rule__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4204:1: ( ( ( rule__Rule__ActionAlternatives_5_0 ) ) )
            // InternalIotlang.g:4205:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            {
            // InternalIotlang.g:4205:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            // InternalIotlang.g:4206:3: ( rule__Rule__ActionAlternatives_5_0 )
            {
             before(grammarAccess.getRuleAccess().getActionAlternatives_5_0()); 
            // InternalIotlang.g:4207:3: ( rule__Rule__ActionAlternatives_5_0 )
            // InternalIotlang.g:4207:4: rule__Rule__ActionAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionAssignment_5"


    // $ANTLR start "rule__Rule__ObjectAssignment_6_0_0"
    // InternalIotlang.g:4215:1: rule__Rule__ObjectAssignment_6_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__ObjectAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4219:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4220:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4220:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4221:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getObjectThingCrossReference_6_0_0_0()); 
            // InternalIotlang.g:4222:3: ( RULE_ID )
            // InternalIotlang.g:4223:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getObjectThingIDTerminalRuleCall_6_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getObjectThingIDTerminalRuleCall_6_0_0_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getObjectThingCrossReference_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ObjectAssignment_6_0_0"


    // $ANTLR start "rule__Rule__PortsAssignment_6_0_1_1"
    // InternalIotlang.g:4234:1: rule__Rule__PortsAssignment_6_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__PortsAssignment_6_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4238:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4239:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4239:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4240:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getPortsPortCrossReference_6_0_1_1_0()); 
            // InternalIotlang.g:4241:3: ( RULE_ID )
            // InternalIotlang.g:4242:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getPortsPortIDTerminalRuleCall_6_0_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getPortsPortIDTerminalRuleCall_6_0_1_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getPortsPortCrossReference_6_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__PortsAssignment_6_0_1_1"


    // $ANTLR start "rule__Rule__ObjectMessageAssignment_6_1_1"
    // InternalIotlang.g:4253:1: rule__Rule__ObjectMessageAssignment_6_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__ObjectMessageAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4257:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4258:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4258:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4259:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getObjectMessageMessageCrossReference_6_1_1_0()); 
            // InternalIotlang.g:4260:3: ( RULE_ID )
            // InternalIotlang.g:4261:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getObjectMessageMessageIDTerminalRuleCall_6_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getObjectMessageMessageIDTerminalRuleCall_6_1_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getObjectMessageMessageCrossReference_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ObjectMessageAssignment_6_1_1"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalIotlang.g:4272:1: rule__Domain__NameAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4276:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:4277:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:4277:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:4278:3: RULE_STRING_LIT
            {
             before(grammarAccess.getDomainAccess().getNameSTRING_LITTerminalRuleCall_1_0()); 
            match(input,RULE_STRING_LIT,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getNameSTRING_LITTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__NameAssignment_1"


    // $ANTLR start "rule__InstanceThing__NameAssignment_1"
    // InternalIotlang.g:4287:1: rule__InstanceThing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstanceThing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4291:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4292:2: ( RULE_ID )
            {
            // InternalIotlang.g:4292:2: ( RULE_ID )
            // InternalIotlang.g:4293:3: RULE_ID
            {
             before(grammarAccess.getInstanceThingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__NameAssignment_1"


    // $ANTLR start "rule__InstanceThing__NumberAssignment_2_1"
    // InternalIotlang.g:4302:1: rule__InstanceThing__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstanceThing__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4306:1: ( ( RULE_INT ) )
            // InternalIotlang.g:4307:2: ( RULE_INT )
            {
            // InternalIotlang.g:4307:2: ( RULE_INT )
            // InternalIotlang.g:4308:3: RULE_INT
            {
             before(grammarAccess.getInstanceThingAccess().getNumberINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getNumberINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__NumberAssignment_2_1"


    // $ANTLR start "rule__InstanceThing__TypeThingAssignment_4"
    // InternalIotlang.g:4317:1: rule__InstanceThing__TypeThingAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceThing__TypeThingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4321:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4322:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4322:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4323:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingThingCrossReference_4_0()); 
            // InternalIotlang.g:4324:3: ( RULE_ID )
            // InternalIotlang.g:4325:4: RULE_ID
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getTypeThingThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInstanceThingAccess().getTypeThingThingCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__TypeThingAssignment_4"


    // $ANTLR start "rule__InstanceThing__AnnotationsAssignment_5"
    // InternalIotlang.g:4336:1: rule__InstanceThing__AnnotationsAssignment_5 : ( rulePlatformAnnotation ) ;
    public final void rule__InstanceThing__AnnotationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4340:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4341:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4341:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4342:3: rulePlatformAnnotation
            {
             before(grammarAccess.getInstanceThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getInstanceThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__AnnotationsAssignment_5"


    // $ANTLR start "rule__InstancePubSub__NameAssignment_1"
    // InternalIotlang.g:4351:1: rule__InstancePubSub__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstancePubSub__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4355:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4356:2: ( RULE_ID )
            {
            // InternalIotlang.g:4356:2: ( RULE_ID )
            // InternalIotlang.g:4357:3: RULE_ID
            {
             before(grammarAccess.getInstancePubSubAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstancePubSubAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__NameAssignment_1"


    // $ANTLR start "rule__InstancePubSub__NumberAssignment_2_1"
    // InternalIotlang.g:4366:1: rule__InstancePubSub__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstancePubSub__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4370:1: ( ( RULE_INT ) )
            // InternalIotlang.g:4371:2: ( RULE_INT )
            {
            // InternalIotlang.g:4371:2: ( RULE_INT )
            // InternalIotlang.g:4372:3: RULE_INT
            {
             before(grammarAccess.getInstancePubSubAccess().getNumberINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstancePubSubAccess().getNumberINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__NumberAssignment_2_1"


    // $ANTLR start "rule__InstancePubSub__TypeChannelAssignment_4"
    // InternalIotlang.g:4381:1: rule__InstancePubSub__TypeChannelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePubSub__TypeChannelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4385:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4386:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4386:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4387:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePubSubAccess().getTypeChannelPubSubCrossReference_4_0()); 
            // InternalIotlang.g:4388:3: ( RULE_ID )
            // InternalIotlang.g:4389:4: RULE_ID
            {
             before(grammarAccess.getInstancePubSubAccess().getTypeChannelPubSubIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstancePubSubAccess().getTypeChannelPubSubIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInstancePubSubAccess().getTypeChannelPubSubCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__TypeChannelAssignment_4"


    // $ANTLR start "rule__InstancePubSub__OverProtocolAssignment_6"
    // InternalIotlang.g:4400:1: rule__InstancePubSub__OverProtocolAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePubSub__OverProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4404:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4405:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4405:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4406:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePubSubAccess().getOverProtocolProtocolCrossReference_6_0()); 
            // InternalIotlang.g:4407:3: ( RULE_ID )
            // InternalIotlang.g:4408:4: RULE_ID
            {
             before(grammarAccess.getInstancePubSubAccess().getOverProtocolProtocolIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstancePubSubAccess().getOverProtocolProtocolIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getInstancePubSubAccess().getOverProtocolProtocolCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__OverProtocolAssignment_6"


    // $ANTLR start "rule__InstancePubSub__AnnotationsAssignment_7"
    // InternalIotlang.g:4419:1: rule__InstancePubSub__AnnotationsAssignment_7 : ( rulePlatformAnnotation ) ;
    public final void rule__InstancePubSub__AnnotationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4423:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4424:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4424:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4425:3: rulePlatformAnnotation
            {
             before(grammarAccess.getInstancePubSubAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getInstancePubSubAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePubSub__AnnotationsAssignment_7"


    // $ANTLR start "rule__InstancePtP__NameAssignment_1"
    // InternalIotlang.g:4434:1: rule__InstancePtP__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstancePtP__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4438:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4439:2: ( RULE_ID )
            {
            // InternalIotlang.g:4439:2: ( RULE_ID )
            // InternalIotlang.g:4440:3: RULE_ID
            {
             before(grammarAccess.getInstancePtPAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstancePtPAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__NameAssignment_1"


    // $ANTLR start "rule__InstancePtP__NumberAssignment_2_1"
    // InternalIotlang.g:4449:1: rule__InstancePtP__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstancePtP__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4453:1: ( ( RULE_INT ) )
            // InternalIotlang.g:4454:2: ( RULE_INT )
            {
            // InternalIotlang.g:4454:2: ( RULE_INT )
            // InternalIotlang.g:4455:3: RULE_INT
            {
             before(grammarAccess.getInstancePtPAccess().getNumberINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstancePtPAccess().getNumberINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__NumberAssignment_2_1"


    // $ANTLR start "rule__InstancePtP__TypeChannelAssignment_4"
    // InternalIotlang.g:4464:1: rule__InstancePtP__TypeChannelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePtP__TypeChannelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4468:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4469:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4469:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4470:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePtPAccess().getTypeChannelPointToPointCrossReference_4_0()); 
            // InternalIotlang.g:4471:3: ( RULE_ID )
            // InternalIotlang.g:4472:4: RULE_ID
            {
             before(grammarAccess.getInstancePtPAccess().getTypeChannelPointToPointIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstancePtPAccess().getTypeChannelPointToPointIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInstancePtPAccess().getTypeChannelPointToPointCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__TypeChannelAssignment_4"


    // $ANTLR start "rule__InstancePtP__OverProtocolAssignment_6"
    // InternalIotlang.g:4483:1: rule__InstancePtP__OverProtocolAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePtP__OverProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4487:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4488:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4488:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4489:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePtPAccess().getOverProtocolProtocolCrossReference_6_0()); 
            // InternalIotlang.g:4490:3: ( RULE_ID )
            // InternalIotlang.g:4491:4: RULE_ID
            {
             before(grammarAccess.getInstancePtPAccess().getOverProtocolProtocolIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstancePtPAccess().getOverProtocolProtocolIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getInstancePtPAccess().getOverProtocolProtocolCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__OverProtocolAssignment_6"


    // $ANTLR start "rule__InstancePtP__AnnotationsAssignment_7"
    // InternalIotlang.g:4502:1: rule__InstancePtP__AnnotationsAssignment_7 : ( rulePlatformAnnotation ) ;
    public final void rule__InstancePtP__AnnotationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4506:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4507:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4507:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4508:3: rulePlatformAnnotation
            {
             before(grammarAccess.getInstancePtPAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getInstancePtPAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePtP__AnnotationsAssignment_7"


    // $ANTLR start "rule__InstanceChannel__InstancesPubSubAssignment_0"
    // InternalIotlang.g:4517:1: rule__InstanceChannel__InstancesPubSubAssignment_0 : ( ruleInstancePubSub ) ;
    public final void rule__InstanceChannel__InstancesPubSubAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4521:1: ( ( ruleInstancePubSub ) )
            // InternalIotlang.g:4522:2: ( ruleInstancePubSub )
            {
            // InternalIotlang.g:4522:2: ( ruleInstancePubSub )
            // InternalIotlang.g:4523:3: ruleInstancePubSub
            {
             before(grammarAccess.getInstanceChannelAccess().getInstancesPubSubInstancePubSubParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstancePubSub();

            state._fsp--;

             after(grammarAccess.getInstanceChannelAccess().getInstancesPubSubInstancePubSubParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__InstancesPubSubAssignment_0"


    // $ANTLR start "rule__InstanceChannel__InstancesPtpAssignment_1"
    // InternalIotlang.g:4532:1: rule__InstanceChannel__InstancesPtpAssignment_1 : ( ruleInstancePtP ) ;
    public final void rule__InstanceChannel__InstancesPtpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4536:1: ( ( ruleInstancePtP ) )
            // InternalIotlang.g:4537:2: ( ruleInstancePtP )
            {
            // InternalIotlang.g:4537:2: ( ruleInstancePtP )
            // InternalIotlang.g:4538:3: ruleInstancePtP
            {
             before(grammarAccess.getInstanceChannelAccess().getInstancesPtpInstancePtPParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstancePtP();

            state._fsp--;

             after(grammarAccess.getInstanceChannelAccess().getInstancesPtpInstancePtPParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__InstancesPtpAssignment_1"


    // $ANTLR start "rule__InstancePolicy__NameAssignment_1"
    // InternalIotlang.g:4547:1: rule__InstancePolicy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstancePolicy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4551:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4552:2: ( RULE_ID )
            {
            // InternalIotlang.g:4552:2: ( RULE_ID )
            // InternalIotlang.g:4553:3: RULE_ID
            {
             before(grammarAccess.getInstancePolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstancePolicyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__NameAssignment_1"


    // $ANTLR start "rule__InstancePolicy__TypePolicyAssignment_3"
    // InternalIotlang.g:4562:1: rule__InstancePolicy__TypePolicyAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePolicy__TypePolicyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4566:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4567:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4567:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4568:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0()); 
            // InternalIotlang.g:4569:3: ( RULE_ID )
            // InternalIotlang.g:4570:4: RULE_ID
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__TypePolicyAssignment_3"


    // $ANTLR start "rule__InstancePolicy__AnnotationsAssignment_4"
    // InternalIotlang.g:4581:1: rule__InstancePolicy__AnnotationsAssignment_4 : ( rulePlatformAnnotation ) ;
    public final void rule__InstancePolicy__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4585:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4586:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4586:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4587:3: rulePlatformAnnotation
            {
             before(grammarAccess.getInstancePolicyAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getInstancePolicyAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstancePolicy__AnnotationsAssignment_4"


    // $ANTLR start "rule__NetworkConfiguration__NameAssignment_1"
    // InternalIotlang.g:4596:1: rule__NetworkConfiguration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NetworkConfiguration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4600:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4601:2: ( RULE_ID )
            {
            // InternalIotlang.g:4601:2: ( RULE_ID )
            // InternalIotlang.g:4602:3: RULE_ID
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__NameAssignment_1"


    // $ANTLR start "rule__NetworkConfiguration__AnnotationsAssignment_2"
    // InternalIotlang.g:4611:1: rule__NetworkConfiguration__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__NetworkConfiguration__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4615:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4616:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4616:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4617:3: rulePlatformAnnotation
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__AnnotationsAssignment_2"


    // $ANTLR start "rule__NetworkConfiguration__ConnectsAssignment_4_0"
    // InternalIotlang.g:4626:1: rule__NetworkConfiguration__ConnectsAssignment_4_0 : ( ruleConnect ) ;
    public final void rule__NetworkConfiguration__ConnectsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4630:1: ( ( ruleConnect ) )
            // InternalIotlang.g:4631:2: ( ruleConnect )
            {
            // InternalIotlang.g:4631:2: ( ruleConnect )
            // InternalIotlang.g:4632:3: ruleConnect
            {
             before(grammarAccess.getNetworkConfigurationAccess().getConnectsConnectParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConnect();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getConnectsConnectParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__ConnectsAssignment_4_0"


    // $ANTLR start "rule__NetworkConfiguration__DomainAssignment_4_1"
    // InternalIotlang.g:4641:1: rule__NetworkConfiguration__DomainAssignment_4_1 : ( ruleDomain ) ;
    public final void rule__NetworkConfiguration__DomainAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4645:1: ( ( ruleDomain ) )
            // InternalIotlang.g:4646:2: ( ruleDomain )
            {
            // InternalIotlang.g:4646:2: ( ruleDomain )
            // InternalIotlang.g:4647:3: ruleDomain
            {
             before(grammarAccess.getNetworkConfigurationAccess().getDomainDomainParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getDomainDomainParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__DomainAssignment_4_1"


    // $ANTLR start "rule__NetworkConfiguration__BindsAssignment_4_2"
    // InternalIotlang.g:4656:1: rule__NetworkConfiguration__BindsAssignment_4_2 : ( ruleBind ) ;
    public final void rule__NetworkConfiguration__BindsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4660:1: ( ( ruleBind ) )
            // InternalIotlang.g:4661:2: ( ruleBind )
            {
            // InternalIotlang.g:4661:2: ( ruleBind )
            // InternalIotlang.g:4662:3: ruleBind
            {
             before(grammarAccess.getNetworkConfigurationAccess().getBindsBindParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getBindsBindParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__BindsAssignment_4_2"


    // $ANTLR start "rule__NetworkConfiguration__ThingInstancesAssignment_4_3"
    // InternalIotlang.g:4671:1: rule__NetworkConfiguration__ThingInstancesAssignment_4_3 : ( ruleInstanceThing ) ;
    public final void rule__NetworkConfiguration__ThingInstancesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4675:1: ( ( ruleInstanceThing ) )
            // InternalIotlang.g:4676:2: ( ruleInstanceThing )
            {
            // InternalIotlang.g:4676:2: ( ruleInstanceThing )
            // InternalIotlang.g:4677:3: ruleInstanceThing
            {
             before(grammarAccess.getNetworkConfigurationAccess().getThingInstancesInstanceThingParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceThing();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getThingInstancesInstanceThingParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__ThingInstancesAssignment_4_3"


    // $ANTLR start "rule__NetworkConfiguration__ChannelInstancesAssignment_4_4"
    // InternalIotlang.g:4686:1: rule__NetworkConfiguration__ChannelInstancesAssignment_4_4 : ( ruleInstanceChannel ) ;
    public final void rule__NetworkConfiguration__ChannelInstancesAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4690:1: ( ( ruleInstanceChannel ) )
            // InternalIotlang.g:4691:2: ( ruleInstanceChannel )
            {
            // InternalIotlang.g:4691:2: ( ruleInstanceChannel )
            // InternalIotlang.g:4692:3: ruleInstanceChannel
            {
             before(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesInstanceChannelParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceChannel();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesInstanceChannelParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__ChannelInstancesAssignment_4_4"


    // $ANTLR start "rule__NetworkConfiguration__EnforcesAssignment_4_5_1"
    // InternalIotlang.g:4701:1: rule__NetworkConfiguration__EnforcesAssignment_4_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__NetworkConfiguration__EnforcesAssignment_4_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4705:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4706:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4706:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4707:3: ( RULE_ID )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_5_1_0()); 
            // InternalIotlang.g:4708:3: ( RULE_ID )
            // InternalIotlang.g:4709:4: RULE_ID
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyIDTerminalRuleCall_4_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyIDTerminalRuleCall_4_5_1_0_1()); 

            }

             after(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__EnforcesAssignment_4_5_1"


    // $ANTLR start "rule__NetworkConfiguration__InstancePoliciyAssignment_4_6"
    // InternalIotlang.g:4720:1: rule__NetworkConfiguration__InstancePoliciyAssignment_4_6 : ( ruleInstancePolicy ) ;
    public final void rule__NetworkConfiguration__InstancePoliciyAssignment_4_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4724:1: ( ( ruleInstancePolicy ) )
            // InternalIotlang.g:4725:2: ( ruleInstancePolicy )
            {
            // InternalIotlang.g:4725:2: ( ruleInstancePolicy )
            // InternalIotlang.g:4726:3: ruleInstancePolicy
            {
             before(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyInstancePolicyParserRuleCall_4_6_0()); 
            pushFollow(FOLLOW_2);
            ruleInstancePolicy();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyInstancePolicyParserRuleCall_4_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__InstancePoliciyAssignment_4_6"


    // $ANTLR start "rule__Bind__NameAssignment_1"
    // InternalIotlang.g:4735:1: rule__Bind__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4739:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4740:2: ( RULE_ID )
            {
            // InternalIotlang.g:4740:2: ( RULE_ID )
            // InternalIotlang.g:4741:3: RULE_ID
            {
             before(grammarAccess.getBindAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__NameAssignment_1"


    // $ANTLR start "rule__Bind__ThingInstanceAssignment_2"
    // InternalIotlang.g:4750:1: rule__Bind__ThingInstanceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__ThingInstanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4754:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4755:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4755:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4756:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getThingInstanceInstanceThingCrossReference_2_0()); 
            // InternalIotlang.g:4757:3: ( RULE_ID )
            // InternalIotlang.g:4758:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getThingInstanceInstanceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getThingInstanceInstanceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBindAccess().getThingInstanceInstanceThingCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ThingInstanceAssignment_2"


    // $ANTLR start "rule__Bind__DirectionAssignment_3"
    // InternalIotlang.g:4769:1: rule__Bind__DirectionAssignment_3 : ( ( rule__Bind__DirectionAlternatives_3_0 ) ) ;
    public final void rule__Bind__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4773:1: ( ( ( rule__Bind__DirectionAlternatives_3_0 ) ) )
            // InternalIotlang.g:4774:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:4774:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            // InternalIotlang.g:4775:3: ( rule__Bind__DirectionAlternatives_3_0 )
            {
             before(grammarAccess.getBindAccess().getDirectionAlternatives_3_0()); 
            // InternalIotlang.g:4776:3: ( rule__Bind__DirectionAlternatives_3_0 )
            // InternalIotlang.g:4776:4: rule__Bind__DirectionAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Bind__DirectionAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getDirectionAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__DirectionAssignment_3"


    // $ANTLR start "rule__Bind__PubSubInstanceAssignment_4"
    // InternalIotlang.g:4784:1: rule__Bind__PubSubInstanceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__PubSubInstanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4788:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4789:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4789:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4790:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getPubSubInstanceInstancePubSubCrossReference_4_0()); 
            // InternalIotlang.g:4791:3: ( RULE_ID )
            // InternalIotlang.g:4792:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getPubSubInstanceInstancePubSubIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getPubSubInstanceInstancePubSubIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBindAccess().getPubSubInstanceInstancePubSubCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__PubSubInstanceAssignment_4"


    // $ANTLR start "rule__Bind__TopicsAssignment_6"
    // InternalIotlang.g:4803:1: rule__Bind__TopicsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__TopicsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4807:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4808:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4808:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4809:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getTopicsTopicCrossReference_6_0()); 
            // InternalIotlang.g:4810:3: ( RULE_ID )
            // InternalIotlang.g:4811:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getTopicsTopicIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getTopicsTopicIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getBindAccess().getTopicsTopicCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__TopicsAssignment_6"


    // $ANTLR start "rule__Bind__TopicsAssignment_7_1"
    // InternalIotlang.g:4822:1: rule__Bind__TopicsAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__TopicsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4826:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4827:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4827:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4828:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getTopicsTopicCrossReference_7_1_0()); 
            // InternalIotlang.g:4829:3: ( RULE_ID )
            // InternalIotlang.g:4830:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getTopicsTopicIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getTopicsTopicIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getBindAccess().getTopicsTopicCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__TopicsAssignment_7_1"


    // $ANTLR start "rule__Bind__AnnotationsAssignment_9"
    // InternalIotlang.g:4841:1: rule__Bind__AnnotationsAssignment_9 : ( rulePlatformAnnotation ) ;
    public final void rule__Bind__AnnotationsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4845:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4846:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4846:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4847:3: rulePlatformAnnotation
            {
             before(grammarAccess.getBindAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getBindAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__AnnotationsAssignment_9"


    // $ANTLR start "rule__Connect__NameAssignment_1"
    // InternalIotlang.g:4856:1: rule__Connect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4860:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4861:2: ( RULE_ID )
            {
            // InternalIotlang.g:4861:2: ( RULE_ID )
            // InternalIotlang.g:4862:3: RULE_ID
            {
             before(grammarAccess.getConnectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__NameAssignment_1"


    // $ANTLR start "rule__Connect__ThingInstanceAssignment_2"
    // InternalIotlang.g:4871:1: rule__Connect__ThingInstanceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Connect__ThingInstanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4875:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4876:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4876:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4877:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectAccess().getThingInstanceInstanceThingCrossReference_2_0()); 
            // InternalIotlang.g:4878:3: ( RULE_ID )
            // InternalIotlang.g:4879:4: RULE_ID
            {
             before(grammarAccess.getConnectAccess().getThingInstanceInstanceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getThingInstanceInstanceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConnectAccess().getThingInstanceInstanceThingCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__ThingInstanceAssignment_2"


    // $ANTLR start "rule__Connect__DirectionAssignment_3"
    // InternalIotlang.g:4890:1: rule__Connect__DirectionAssignment_3 : ( ( rule__Connect__DirectionAlternatives_3_0 ) ) ;
    public final void rule__Connect__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4894:1: ( ( ( rule__Connect__DirectionAlternatives_3_0 ) ) )
            // InternalIotlang.g:4895:2: ( ( rule__Connect__DirectionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:4895:2: ( ( rule__Connect__DirectionAlternatives_3_0 ) )
            // InternalIotlang.g:4896:3: ( rule__Connect__DirectionAlternatives_3_0 )
            {
             before(grammarAccess.getConnectAccess().getDirectionAlternatives_3_0()); 
            // InternalIotlang.g:4897:3: ( rule__Connect__DirectionAlternatives_3_0 )
            // InternalIotlang.g:4897:4: rule__Connect__DirectionAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Connect__DirectionAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectAccess().getDirectionAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__DirectionAssignment_3"


    // $ANTLR start "rule__Connect__PtpInstanceAssignment_4"
    // InternalIotlang.g:4905:1: rule__Connect__PtpInstanceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Connect__PtpInstanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4909:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4910:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4910:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4911:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectAccess().getPtpInstanceInstancePtPCrossReference_4_0()); 
            // InternalIotlang.g:4912:3: ( RULE_ID )
            // InternalIotlang.g:4913:4: RULE_ID
            {
             before(grammarAccess.getConnectAccess().getPtpInstanceInstancePtPIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectAccess().getPtpInstanceInstancePtPIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConnectAccess().getPtpInstanceInstancePtPCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__PtpInstanceAssignment_4"


    // $ANTLR start "rule__Connect__AnnotationsAssignment_5"
    // InternalIotlang.g:4924:1: rule__Connect__AnnotationsAssignment_5 : ( rulePlatformAnnotation ) ;
    public final void rule__Connect__AnnotationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4928:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4929:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4929:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4930:3: rulePlatformAnnotation
            {
             before(grammarAccess.getConnectAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getConnectAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connect__AnnotationsAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000010001B900002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00016D3000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00016D3000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000002L});

}