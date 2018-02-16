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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_ID", "RULE_STRING_LIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'deny'", "'send'", "'receive'", "'=>'", "'<=>'", "'<='", "'thing'", "'{'", "'}'", "'channel:pubsub'", "'channel:ptp'", "'policy'", "'port'", "'protocol'", "'message'", "'topic'", "'('", "')'", "'rule'", "':'", "'.'", "'message:'", "'domain'", "'instanceThing'", "'['", "']'", "'instancePubSub'", "'over'", "'instancePTP'", "'instancePolicy'", "'networkConfiguration'", "'enforce'", "'bind'", "','"
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


    // $ANTLR start "rule__IoTLangModel__Alternatives"
    // InternalIotlang.g:552:1: rule__IoTLangModel__Alternatives : ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__MessagesAssignment_2 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_3 ) ) | ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_5 ) ) );
    public final void rule__IoTLangModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:556:1: ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__MessagesAssignment_2 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_3 ) ) | ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_5 ) ) )
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
                    // InternalIotlang.g:557:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    {
                    // InternalIotlang.g:557:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    // InternalIotlang.g:558:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getThingsAssignment_0()); 
                    // InternalIotlang.g:559:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    // InternalIotlang.g:559:4: rule__IoTLangModel__ThingsAssignment_0
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
                    // InternalIotlang.g:563:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    {
                    // InternalIotlang.g:563:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    // InternalIotlang.g:564:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getPoliciesAssignment_1()); 
                    // InternalIotlang.g:565:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    // InternalIotlang.g:565:4: rule__IoTLangModel__PoliciesAssignment_1
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
                    // InternalIotlang.g:569:2: ( ( rule__IoTLangModel__MessagesAssignment_2 ) )
                    {
                    // InternalIotlang.g:569:2: ( ( rule__IoTLangModel__MessagesAssignment_2 ) )
                    // InternalIotlang.g:570:3: ( rule__IoTLangModel__MessagesAssignment_2 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getMessagesAssignment_2()); 
                    // InternalIotlang.g:571:3: ( rule__IoTLangModel__MessagesAssignment_2 )
                    // InternalIotlang.g:571:4: rule__IoTLangModel__MessagesAssignment_2
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
                    // InternalIotlang.g:575:2: ( ( rule__IoTLangModel__ChannelsAssignment_3 ) )
                    {
                    // InternalIotlang.g:575:2: ( ( rule__IoTLangModel__ChannelsAssignment_3 ) )
                    // InternalIotlang.g:576:3: ( rule__IoTLangModel__ChannelsAssignment_3 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getChannelsAssignment_3()); 
                    // InternalIotlang.g:577:3: ( rule__IoTLangModel__ChannelsAssignment_3 )
                    // InternalIotlang.g:577:4: rule__IoTLangModel__ChannelsAssignment_3
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
                    // InternalIotlang.g:581:2: ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) )
                    {
                    // InternalIotlang.g:581:2: ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) )
                    // InternalIotlang.g:582:3: ( rule__IoTLangModel__ProtocolsAssignment_4 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getProtocolsAssignment_4()); 
                    // InternalIotlang.g:583:3: ( rule__IoTLangModel__ProtocolsAssignment_4 )
                    // InternalIotlang.g:583:4: rule__IoTLangModel__ProtocolsAssignment_4
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
                    // InternalIotlang.g:587:2: ( ( rule__IoTLangModel__ConfigsAssignment_5 ) )
                    {
                    // InternalIotlang.g:587:2: ( ( rule__IoTLangModel__ConfigsAssignment_5 ) )
                    // InternalIotlang.g:588:3: ( rule__IoTLangModel__ConfigsAssignment_5 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getConfigsAssignment_5()); 
                    // InternalIotlang.g:589:3: ( rule__IoTLangModel__ConfigsAssignment_5 )
                    // InternalIotlang.g:589:4: rule__IoTLangModel__ConfigsAssignment_5
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
    // InternalIotlang.g:597:1: rule__Channel__Alternatives : ( ( ( rule__Channel__PubSubAssignment_0 ) ) | ( ( rule__Channel__PointToPointAssignment_1 ) ) );
    public final void rule__Channel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:601:1: ( ( ( rule__Channel__PubSubAssignment_0 ) ) | ( ( rule__Channel__PointToPointAssignment_1 ) ) )
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
                    // InternalIotlang.g:602:2: ( ( rule__Channel__PubSubAssignment_0 ) )
                    {
                    // InternalIotlang.g:602:2: ( ( rule__Channel__PubSubAssignment_0 ) )
                    // InternalIotlang.g:603:3: ( rule__Channel__PubSubAssignment_0 )
                    {
                     before(grammarAccess.getChannelAccess().getPubSubAssignment_0()); 
                    // InternalIotlang.g:604:3: ( rule__Channel__PubSubAssignment_0 )
                    // InternalIotlang.g:604:4: rule__Channel__PubSubAssignment_0
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
                    // InternalIotlang.g:608:2: ( ( rule__Channel__PointToPointAssignment_1 ) )
                    {
                    // InternalIotlang.g:608:2: ( ( rule__Channel__PointToPointAssignment_1 ) )
                    // InternalIotlang.g:609:3: ( rule__Channel__PointToPointAssignment_1 )
                    {
                     before(grammarAccess.getChannelAccess().getPointToPointAssignment_1()); 
                    // InternalIotlang.g:610:3: ( rule__Channel__PointToPointAssignment_1 )
                    // InternalIotlang.g:610:4: rule__Channel__PointToPointAssignment_1
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
    // InternalIotlang.g:618:1: rule__Rule__PermissionAlternatives_3_0 : ( ( 'allow' ) | ( 'deny' ) );
    public final void rule__Rule__PermissionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:622:1: ( ( 'allow' ) | ( 'deny' ) )
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
                    // InternalIotlang.g:623:2: ( 'allow' )
                    {
                    // InternalIotlang.g:623:2: ( 'allow' )
                    // InternalIotlang.g:624:3: 'allow'
                    {
                     before(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:629:2: ( 'deny' )
                    {
                    // InternalIotlang.g:629:2: ( 'deny' )
                    // InternalIotlang.g:630:3: 'deny'
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
    // InternalIotlang.g:639:1: rule__Rule__ActionAlternatives_5_0 : ( ( 'send' ) | ( 'receive' ) );
    public final void rule__Rule__ActionAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:643:1: ( ( 'send' ) | ( 'receive' ) )
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
                    // InternalIotlang.g:644:2: ( 'send' )
                    {
                    // InternalIotlang.g:644:2: ( 'send' )
                    // InternalIotlang.g:645:3: 'send'
                    {
                     before(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:650:2: ( 'receive' )
                    {
                    // InternalIotlang.g:650:2: ( 'receive' )
                    // InternalIotlang.g:651:3: 'receive'
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
    // InternalIotlang.g:660:1: rule__Rule__Alternatives_6 : ( ( ( rule__Rule__Group_6_0__0 ) ) | ( ( rule__Rule__Group_6_1__0 ) ) );
    public final void rule__Rule__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:664:1: ( ( ( rule__Rule__Group_6_0__0 ) ) | ( ( rule__Rule__Group_6_1__0 ) ) )
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
                    // InternalIotlang.g:665:2: ( ( rule__Rule__Group_6_0__0 ) )
                    {
                    // InternalIotlang.g:665:2: ( ( rule__Rule__Group_6_0__0 ) )
                    // InternalIotlang.g:666:3: ( rule__Rule__Group_6_0__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_6_0()); 
                    // InternalIotlang.g:667:3: ( rule__Rule__Group_6_0__0 )
                    // InternalIotlang.g:667:4: rule__Rule__Group_6_0__0
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
                    // InternalIotlang.g:671:2: ( ( rule__Rule__Group_6_1__0 ) )
                    {
                    // InternalIotlang.g:671:2: ( ( rule__Rule__Group_6_1__0 ) )
                    // InternalIotlang.g:672:3: ( rule__Rule__Group_6_1__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_6_1()); 
                    // InternalIotlang.g:673:3: ( rule__Rule__Group_6_1__0 )
                    // InternalIotlang.g:673:4: rule__Rule__Group_6_1__0
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
    // InternalIotlang.g:681:1: rule__InstanceChannel__Alternatives : ( ( ( rule__InstanceChannel__InstancesPubSubAssignment_0 ) ) | ( ( rule__InstanceChannel__InstancesPtpAssignment_1 ) ) );
    public final void rule__InstanceChannel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:685:1: ( ( ( rule__InstanceChannel__InstancesPubSubAssignment_0 ) ) | ( ( rule__InstanceChannel__InstancesPtpAssignment_1 ) ) )
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
                    // InternalIotlang.g:686:2: ( ( rule__InstanceChannel__InstancesPubSubAssignment_0 ) )
                    {
                    // InternalIotlang.g:686:2: ( ( rule__InstanceChannel__InstancesPubSubAssignment_0 ) )
                    // InternalIotlang.g:687:3: ( rule__InstanceChannel__InstancesPubSubAssignment_0 )
                    {
                     before(grammarAccess.getInstanceChannelAccess().getInstancesPubSubAssignment_0()); 
                    // InternalIotlang.g:688:3: ( rule__InstanceChannel__InstancesPubSubAssignment_0 )
                    // InternalIotlang.g:688:4: rule__InstanceChannel__InstancesPubSubAssignment_0
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
                    // InternalIotlang.g:692:2: ( ( rule__InstanceChannel__InstancesPtpAssignment_1 ) )
                    {
                    // InternalIotlang.g:692:2: ( ( rule__InstanceChannel__InstancesPtpAssignment_1 ) )
                    // InternalIotlang.g:693:3: ( rule__InstanceChannel__InstancesPtpAssignment_1 )
                    {
                     before(grammarAccess.getInstanceChannelAccess().getInstancesPtpAssignment_1()); 
                    // InternalIotlang.g:694:3: ( rule__InstanceChannel__InstancesPtpAssignment_1 )
                    // InternalIotlang.g:694:4: rule__InstanceChannel__InstancesPtpAssignment_1
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
    // InternalIotlang.g:702:1: rule__NetworkConfiguration__Alternatives_4 : ( ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__Group_4_4__0 ) ) | ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) ) );
    public final void rule__NetworkConfiguration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:706:1: ( ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__Group_4_4__0 ) ) | ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt8=1;
                }
                break;
            case 46:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            case 40:
            case 42:
                {
                alt8=4;
                }
                break;
            case 45:
                {
                alt8=5;
                }
                break;
            case 43:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalIotlang.g:707:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) )
                    {
                    // InternalIotlang.g:707:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) )
                    // InternalIotlang.g:708:3: ( rule__NetworkConfiguration__DomainAssignment_4_0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getDomainAssignment_4_0()); 
                    // InternalIotlang.g:709:3: ( rule__NetworkConfiguration__DomainAssignment_4_0 )
                    // InternalIotlang.g:709:4: rule__NetworkConfiguration__DomainAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__DomainAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getDomainAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:713:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) )
                    {
                    // InternalIotlang.g:713:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) )
                    // InternalIotlang.g:714:3: ( rule__NetworkConfiguration__BindsAssignment_4_1 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getBindsAssignment_4_1()); 
                    // InternalIotlang.g:715:3: ( rule__NetworkConfiguration__BindsAssignment_4_1 )
                    // InternalIotlang.g:715:4: rule__NetworkConfiguration__BindsAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__BindsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getBindsAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:719:2: ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) )
                    {
                    // InternalIotlang.g:719:2: ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) )
                    // InternalIotlang.g:720:3: ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getThingInstancesAssignment_4_2()); 
                    // InternalIotlang.g:721:3: ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 )
                    // InternalIotlang.g:721:4: rule__NetworkConfiguration__ThingInstancesAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__ThingInstancesAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getThingInstancesAssignment_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIotlang.g:725:2: ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) )
                    {
                    // InternalIotlang.g:725:2: ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) )
                    // InternalIotlang.g:726:3: ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesAssignment_4_3()); 
                    // InternalIotlang.g:727:3: ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 )
                    // InternalIotlang.g:727:4: rule__NetworkConfiguration__ChannelInstancesAssignment_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__ChannelInstancesAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIotlang.g:731:2: ( ( rule__NetworkConfiguration__Group_4_4__0 ) )
                    {
                    // InternalIotlang.g:731:2: ( ( rule__NetworkConfiguration__Group_4_4__0 ) )
                    // InternalIotlang.g:732:3: ( rule__NetworkConfiguration__Group_4_4__0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getGroup_4_4()); 
                    // InternalIotlang.g:733:3: ( rule__NetworkConfiguration__Group_4_4__0 )
                    // InternalIotlang.g:733:4: rule__NetworkConfiguration__Group_4_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__Group_4_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getGroup_4_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIotlang.g:737:2: ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) )
                    {
                    // InternalIotlang.g:737:2: ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) )
                    // InternalIotlang.g:738:3: ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyAssignment_4_5()); 
                    // InternalIotlang.g:739:3: ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 )
                    // InternalIotlang.g:739:4: rule__NetworkConfiguration__InstancePoliciyAssignment_4_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__InstancePoliciyAssignment_4_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyAssignment_4_5()); 

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
    // InternalIotlang.g:747:1: rule__Bind__DirectionAlternatives_3_0 : ( ( '=>' ) | ( '<=>' ) | ( '<=' ) );
    public final void rule__Bind__DirectionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:751:1: ( ( '=>' ) | ( '<=>' ) | ( '<=' ) )
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
                    // InternalIotlang.g:752:2: ( '=>' )
                    {
                    // InternalIotlang.g:752:2: ( '=>' )
                    // InternalIotlang.g:753:3: '=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:758:2: ( '<=>' )
                    {
                    // InternalIotlang.g:758:2: ( '<=>' )
                    // InternalIotlang.g:759:3: '<=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:764:2: ( '<=' )
                    {
                    // InternalIotlang.g:764:2: ( '<=' )
                    // InternalIotlang.g:765:3: '<='
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


    // $ANTLR start "rule__PlatformAnnotation__Group__0"
    // InternalIotlang.g:774:1: rule__PlatformAnnotation__Group__0 : rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 ;
    public final void rule__PlatformAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:778:1: ( rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 )
            // InternalIotlang.g:779:2: rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1
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
    // InternalIotlang.g:786:1: rule__PlatformAnnotation__Group__0__Impl : ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) ;
    public final void rule__PlatformAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:790:1: ( ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) )
            // InternalIotlang.g:791:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            {
            // InternalIotlang.g:791:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            // InternalIotlang.g:792:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0()); 
            // InternalIotlang.g:793:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            // InternalIotlang.g:793:3: rule__PlatformAnnotation__NameAssignment_0
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
    // InternalIotlang.g:801:1: rule__PlatformAnnotation__Group__1 : rule__PlatformAnnotation__Group__1__Impl ;
    public final void rule__PlatformAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:805:1: ( rule__PlatformAnnotation__Group__1__Impl )
            // InternalIotlang.g:806:2: rule__PlatformAnnotation__Group__1__Impl
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
    // InternalIotlang.g:812:1: rule__PlatformAnnotation__Group__1__Impl : ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) ;
    public final void rule__PlatformAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:816:1: ( ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) )
            // InternalIotlang.g:817:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            {
            // InternalIotlang.g:817:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            // InternalIotlang.g:818:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1()); 
            // InternalIotlang.g:819:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            // InternalIotlang.g:819:3: rule__PlatformAnnotation__ValueAssignment_1
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
    // InternalIotlang.g:828:1: rule__Thing__Group__0 : rule__Thing__Group__0__Impl rule__Thing__Group__1 ;
    public final void rule__Thing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:832:1: ( rule__Thing__Group__0__Impl rule__Thing__Group__1 )
            // InternalIotlang.g:833:2: rule__Thing__Group__0__Impl rule__Thing__Group__1
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
    // InternalIotlang.g:840:1: rule__Thing__Group__0__Impl : ( 'thing' ) ;
    public final void rule__Thing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:844:1: ( ( 'thing' ) )
            // InternalIotlang.g:845:1: ( 'thing' )
            {
            // InternalIotlang.g:845:1: ( 'thing' )
            // InternalIotlang.g:846:2: 'thing'
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
    // InternalIotlang.g:855:1: rule__Thing__Group__1 : rule__Thing__Group__1__Impl rule__Thing__Group__2 ;
    public final void rule__Thing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:859:1: ( rule__Thing__Group__1__Impl rule__Thing__Group__2 )
            // InternalIotlang.g:860:2: rule__Thing__Group__1__Impl rule__Thing__Group__2
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
    // InternalIotlang.g:867:1: rule__Thing__Group__1__Impl : ( ( rule__Thing__NameAssignment_1 ) ) ;
    public final void rule__Thing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:871:1: ( ( ( rule__Thing__NameAssignment_1 ) ) )
            // InternalIotlang.g:872:1: ( ( rule__Thing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:872:1: ( ( rule__Thing__NameAssignment_1 ) )
            // InternalIotlang.g:873:2: ( rule__Thing__NameAssignment_1 )
            {
             before(grammarAccess.getThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:874:2: ( rule__Thing__NameAssignment_1 )
            // InternalIotlang.g:874:3: rule__Thing__NameAssignment_1
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
    // InternalIotlang.g:882:1: rule__Thing__Group__2 : rule__Thing__Group__2__Impl rule__Thing__Group__3 ;
    public final void rule__Thing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:886:1: ( rule__Thing__Group__2__Impl rule__Thing__Group__3 )
            // InternalIotlang.g:887:2: rule__Thing__Group__2__Impl rule__Thing__Group__3
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
    // InternalIotlang.g:894:1: rule__Thing__Group__2__Impl : ( ( rule__Thing__AnnotationsAssignment_2 )* ) ;
    public final void rule__Thing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:898:1: ( ( ( rule__Thing__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:899:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:899:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:900:2: ( rule__Thing__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getThingAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:901:2: ( rule__Thing__AnnotationsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ANNOTATION_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIotlang.g:901:3: rule__Thing__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Thing__AnnotationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalIotlang.g:909:1: rule__Thing__Group__3 : rule__Thing__Group__3__Impl rule__Thing__Group__4 ;
    public final void rule__Thing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:913:1: ( rule__Thing__Group__3__Impl rule__Thing__Group__4 )
            // InternalIotlang.g:914:2: rule__Thing__Group__3__Impl rule__Thing__Group__4
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
    // InternalIotlang.g:921:1: rule__Thing__Group__3__Impl : ( '{' ) ;
    public final void rule__Thing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:925:1: ( ( '{' ) )
            // InternalIotlang.g:926:1: ( '{' )
            {
            // InternalIotlang.g:926:1: ( '{' )
            // InternalIotlang.g:927:2: '{'
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
    // InternalIotlang.g:936:1: rule__Thing__Group__4 : rule__Thing__Group__4__Impl rule__Thing__Group__5 ;
    public final void rule__Thing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:940:1: ( rule__Thing__Group__4__Impl rule__Thing__Group__5 )
            // InternalIotlang.g:941:2: rule__Thing__Group__4__Impl rule__Thing__Group__5
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
    // InternalIotlang.g:948:1: rule__Thing__Group__4__Impl : ( ( rule__Thing__PortsAssignment_4 ) ) ;
    public final void rule__Thing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:952:1: ( ( ( rule__Thing__PortsAssignment_4 ) ) )
            // InternalIotlang.g:953:1: ( ( rule__Thing__PortsAssignment_4 ) )
            {
            // InternalIotlang.g:953:1: ( ( rule__Thing__PortsAssignment_4 ) )
            // InternalIotlang.g:954:2: ( rule__Thing__PortsAssignment_4 )
            {
             before(grammarAccess.getThingAccess().getPortsAssignment_4()); 
            // InternalIotlang.g:955:2: ( rule__Thing__PortsAssignment_4 )
            // InternalIotlang.g:955:3: rule__Thing__PortsAssignment_4
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
    // InternalIotlang.g:963:1: rule__Thing__Group__5 : rule__Thing__Group__5__Impl ;
    public final void rule__Thing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:967:1: ( rule__Thing__Group__5__Impl )
            // InternalIotlang.g:968:2: rule__Thing__Group__5__Impl
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
    // InternalIotlang.g:974:1: rule__Thing__Group__5__Impl : ( '}' ) ;
    public final void rule__Thing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:978:1: ( ( '}' ) )
            // InternalIotlang.g:979:1: ( '}' )
            {
            // InternalIotlang.g:979:1: ( '}' )
            // InternalIotlang.g:980:2: '}'
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
    // InternalIotlang.g:990:1: rule__PubSub__Group__0 : rule__PubSub__Group__0__Impl rule__PubSub__Group__1 ;
    public final void rule__PubSub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:994:1: ( rule__PubSub__Group__0__Impl rule__PubSub__Group__1 )
            // InternalIotlang.g:995:2: rule__PubSub__Group__0__Impl rule__PubSub__Group__1
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
    // InternalIotlang.g:1002:1: rule__PubSub__Group__0__Impl : ( 'channel:pubsub' ) ;
    public final void rule__PubSub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1006:1: ( ( 'channel:pubsub' ) )
            // InternalIotlang.g:1007:1: ( 'channel:pubsub' )
            {
            // InternalIotlang.g:1007:1: ( 'channel:pubsub' )
            // InternalIotlang.g:1008:2: 'channel:pubsub'
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
    // InternalIotlang.g:1017:1: rule__PubSub__Group__1 : rule__PubSub__Group__1__Impl rule__PubSub__Group__2 ;
    public final void rule__PubSub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1021:1: ( rule__PubSub__Group__1__Impl rule__PubSub__Group__2 )
            // InternalIotlang.g:1022:2: rule__PubSub__Group__1__Impl rule__PubSub__Group__2
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
    // InternalIotlang.g:1029:1: rule__PubSub__Group__1__Impl : ( ( rule__PubSub__NameAssignment_1 ) ) ;
    public final void rule__PubSub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1033:1: ( ( ( rule__PubSub__NameAssignment_1 ) ) )
            // InternalIotlang.g:1034:1: ( ( rule__PubSub__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1034:1: ( ( rule__PubSub__NameAssignment_1 ) )
            // InternalIotlang.g:1035:2: ( rule__PubSub__NameAssignment_1 )
            {
             before(grammarAccess.getPubSubAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1036:2: ( rule__PubSub__NameAssignment_1 )
            // InternalIotlang.g:1036:3: rule__PubSub__NameAssignment_1
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
    // InternalIotlang.g:1044:1: rule__PubSub__Group__2 : rule__PubSub__Group__2__Impl rule__PubSub__Group__3 ;
    public final void rule__PubSub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1048:1: ( rule__PubSub__Group__2__Impl rule__PubSub__Group__3 )
            // InternalIotlang.g:1049:2: rule__PubSub__Group__2__Impl rule__PubSub__Group__3
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
    // InternalIotlang.g:1056:1: rule__PubSub__Group__2__Impl : ( '{' ) ;
    public final void rule__PubSub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1060:1: ( ( '{' ) )
            // InternalIotlang.g:1061:1: ( '{' )
            {
            // InternalIotlang.g:1061:1: ( '{' )
            // InternalIotlang.g:1062:2: '{'
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
    // InternalIotlang.g:1071:1: rule__PubSub__Group__3 : rule__PubSub__Group__3__Impl rule__PubSub__Group__4 ;
    public final void rule__PubSub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1075:1: ( rule__PubSub__Group__3__Impl rule__PubSub__Group__4 )
            // InternalIotlang.g:1076:2: rule__PubSub__Group__3__Impl rule__PubSub__Group__4
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
    // InternalIotlang.g:1083:1: rule__PubSub__Group__3__Impl : ( ( rule__PubSub__HasTopicsAssignment_3 )* ) ;
    public final void rule__PubSub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1087:1: ( ( ( rule__PubSub__HasTopicsAssignment_3 )* ) )
            // InternalIotlang.g:1088:1: ( ( rule__PubSub__HasTopicsAssignment_3 )* )
            {
            // InternalIotlang.g:1088:1: ( ( rule__PubSub__HasTopicsAssignment_3 )* )
            // InternalIotlang.g:1089:2: ( rule__PubSub__HasTopicsAssignment_3 )*
            {
             before(grammarAccess.getPubSubAccess().getHasTopicsAssignment_3()); 
            // InternalIotlang.g:1090:2: ( rule__PubSub__HasTopicsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIotlang.g:1090:3: rule__PubSub__HasTopicsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PubSub__HasTopicsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalIotlang.g:1098:1: rule__PubSub__Group__4 : rule__PubSub__Group__4__Impl ;
    public final void rule__PubSub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1102:1: ( rule__PubSub__Group__4__Impl )
            // InternalIotlang.g:1103:2: rule__PubSub__Group__4__Impl
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
    // InternalIotlang.g:1109:1: rule__PubSub__Group__4__Impl : ( '}' ) ;
    public final void rule__PubSub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1113:1: ( ( '}' ) )
            // InternalIotlang.g:1114:1: ( '}' )
            {
            // InternalIotlang.g:1114:1: ( '}' )
            // InternalIotlang.g:1115:2: '}'
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
    // InternalIotlang.g:1125:1: rule__PointToPoint__Group__0 : rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1 ;
    public final void rule__PointToPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1129:1: ( rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1 )
            // InternalIotlang.g:1130:2: rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1
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
    // InternalIotlang.g:1137:1: rule__PointToPoint__Group__0__Impl : ( 'channel:ptp' ) ;
    public final void rule__PointToPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1141:1: ( ( 'channel:ptp' ) )
            // InternalIotlang.g:1142:1: ( 'channel:ptp' )
            {
            // InternalIotlang.g:1142:1: ( 'channel:ptp' )
            // InternalIotlang.g:1143:2: 'channel:ptp'
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
    // InternalIotlang.g:1152:1: rule__PointToPoint__Group__1 : rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2 ;
    public final void rule__PointToPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1156:1: ( rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2 )
            // InternalIotlang.g:1157:2: rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2
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
    // InternalIotlang.g:1164:1: rule__PointToPoint__Group__1__Impl : ( ( rule__PointToPoint__NameAssignment_1 ) ) ;
    public final void rule__PointToPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1168:1: ( ( ( rule__PointToPoint__NameAssignment_1 ) ) )
            // InternalIotlang.g:1169:1: ( ( rule__PointToPoint__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1169:1: ( ( rule__PointToPoint__NameAssignment_1 ) )
            // InternalIotlang.g:1170:2: ( rule__PointToPoint__NameAssignment_1 )
            {
             before(grammarAccess.getPointToPointAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1171:2: ( rule__PointToPoint__NameAssignment_1 )
            // InternalIotlang.g:1171:3: rule__PointToPoint__NameAssignment_1
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
    // InternalIotlang.g:1179:1: rule__PointToPoint__Group__2 : rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3 ;
    public final void rule__PointToPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1183:1: ( rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3 )
            // InternalIotlang.g:1184:2: rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3
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
    // InternalIotlang.g:1191:1: rule__PointToPoint__Group__2__Impl : ( '{' ) ;
    public final void rule__PointToPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1195:1: ( ( '{' ) )
            // InternalIotlang.g:1196:1: ( '{' )
            {
            // InternalIotlang.g:1196:1: ( '{' )
            // InternalIotlang.g:1197:2: '{'
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
    // InternalIotlang.g:1206:1: rule__PointToPoint__Group__3 : rule__PointToPoint__Group__3__Impl ;
    public final void rule__PointToPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1210:1: ( rule__PointToPoint__Group__3__Impl )
            // InternalIotlang.g:1211:2: rule__PointToPoint__Group__3__Impl
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
    // InternalIotlang.g:1217:1: rule__PointToPoint__Group__3__Impl : ( '}' ) ;
    public final void rule__PointToPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1221:1: ( ( '}' ) )
            // InternalIotlang.g:1222:1: ( '}' )
            {
            // InternalIotlang.g:1222:1: ( '}' )
            // InternalIotlang.g:1223:2: '}'
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
    // InternalIotlang.g:1233:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1237:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalIotlang.g:1238:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
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
    // InternalIotlang.g:1245:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1249:1: ( ( 'policy' ) )
            // InternalIotlang.g:1250:1: ( 'policy' )
            {
            // InternalIotlang.g:1250:1: ( 'policy' )
            // InternalIotlang.g:1251:2: 'policy'
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
    // InternalIotlang.g:1260:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1264:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalIotlang.g:1265:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
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
    // InternalIotlang.g:1272:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1276:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalIotlang.g:1277:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1277:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalIotlang.g:1278:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1279:2: ( rule__Policy__NameAssignment_1 )
            // InternalIotlang.g:1279:3: rule__Policy__NameAssignment_1
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
    // InternalIotlang.g:1287:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1291:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalIotlang.g:1292:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
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
    // InternalIotlang.g:1299:1: rule__Policy__Group__2__Impl : ( '{' ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1303:1: ( ( '{' ) )
            // InternalIotlang.g:1304:1: ( '{' )
            {
            // InternalIotlang.g:1304:1: ( '{' )
            // InternalIotlang.g:1305:2: '{'
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
    // InternalIotlang.g:1314:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1318:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalIotlang.g:1319:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
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
    // InternalIotlang.g:1326:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__HasRulesAssignment_3 )* ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1330:1: ( ( ( rule__Policy__HasRulesAssignment_3 )* ) )
            // InternalIotlang.g:1331:1: ( ( rule__Policy__HasRulesAssignment_3 )* )
            {
            // InternalIotlang.g:1331:1: ( ( rule__Policy__HasRulesAssignment_3 )* )
            // InternalIotlang.g:1332:2: ( rule__Policy__HasRulesAssignment_3 )*
            {
             before(grammarAccess.getPolicyAccess().getHasRulesAssignment_3()); 
            // InternalIotlang.g:1333:2: ( rule__Policy__HasRulesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIotlang.g:1333:3: rule__Policy__HasRulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Policy__HasRulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalIotlang.g:1341:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1345:1: ( rule__Policy__Group__4__Impl )
            // InternalIotlang.g:1346:2: rule__Policy__Group__4__Impl
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
    // InternalIotlang.g:1352:1: rule__Policy__Group__4__Impl : ( '}' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1356:1: ( ( '}' ) )
            // InternalIotlang.g:1357:1: ( '}' )
            {
            // InternalIotlang.g:1357:1: ( '}' )
            // InternalIotlang.g:1358:2: '}'
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
    // InternalIotlang.g:1368:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1372:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalIotlang.g:1373:2: rule__Port__Group__0__Impl rule__Port__Group__1
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
    // InternalIotlang.g:1380:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1384:1: ( ( 'port' ) )
            // InternalIotlang.g:1385:1: ( 'port' )
            {
            // InternalIotlang.g:1385:1: ( 'port' )
            // InternalIotlang.g:1386:2: 'port'
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
    // InternalIotlang.g:1395:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1399:1: ( rule__Port__Group__1__Impl )
            // InternalIotlang.g:1400:2: rule__Port__Group__1__Impl
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
    // InternalIotlang.g:1406:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1410:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // InternalIotlang.g:1411:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1411:1: ( ( rule__Port__NameAssignment_1 ) )
            // InternalIotlang.g:1412:2: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1413:2: ( rule__Port__NameAssignment_1 )
            // InternalIotlang.g:1413:3: rule__Port__NameAssignment_1
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
    // InternalIotlang.g:1422:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1426:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalIotlang.g:1427:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
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
    // InternalIotlang.g:1434:1: rule__Protocol__Group__0__Impl : ( 'protocol' ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1438:1: ( ( 'protocol' ) )
            // InternalIotlang.g:1439:1: ( 'protocol' )
            {
            // InternalIotlang.g:1439:1: ( 'protocol' )
            // InternalIotlang.g:1440:2: 'protocol'
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
    // InternalIotlang.g:1449:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1453:1: ( rule__Protocol__Group__1__Impl )
            // InternalIotlang.g:1454:2: rule__Protocol__Group__1__Impl
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
    // InternalIotlang.g:1460:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__NameAssignment_1 ) ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1464:1: ( ( ( rule__Protocol__NameAssignment_1 ) ) )
            // InternalIotlang.g:1465:1: ( ( rule__Protocol__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1465:1: ( ( rule__Protocol__NameAssignment_1 ) )
            // InternalIotlang.g:1466:2: ( rule__Protocol__NameAssignment_1 )
            {
             before(grammarAccess.getProtocolAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1467:2: ( rule__Protocol__NameAssignment_1 )
            // InternalIotlang.g:1467:3: rule__Protocol__NameAssignment_1
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
    // InternalIotlang.g:1476:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1480:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalIotlang.g:1481:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalIotlang.g:1488:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1492:1: ( ( 'message' ) )
            // InternalIotlang.g:1493:1: ( 'message' )
            {
            // InternalIotlang.g:1493:1: ( 'message' )
            // InternalIotlang.g:1494:2: 'message'
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
    // InternalIotlang.g:1503:1: rule__Message__Group__1 : rule__Message__Group__1__Impl ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1507:1: ( rule__Message__Group__1__Impl )
            // InternalIotlang.g:1508:2: rule__Message__Group__1__Impl
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
    // InternalIotlang.g:1514:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1518:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // InternalIotlang.g:1519:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1519:1: ( ( rule__Message__NameAssignment_1 ) )
            // InternalIotlang.g:1520:2: ( rule__Message__NameAssignment_1 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1521:2: ( rule__Message__NameAssignment_1 )
            // InternalIotlang.g:1521:3: rule__Message__NameAssignment_1
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
    // InternalIotlang.g:1530:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1534:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // InternalIotlang.g:1535:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
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
    // InternalIotlang.g:1542:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1546:1: ( ( 'topic' ) )
            // InternalIotlang.g:1547:1: ( 'topic' )
            {
            // InternalIotlang.g:1547:1: ( 'topic' )
            // InternalIotlang.g:1548:2: 'topic'
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
    // InternalIotlang.g:1557:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1561:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // InternalIotlang.g:1562:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
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
    // InternalIotlang.g:1569:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1573:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // InternalIotlang.g:1574:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1574:1: ( ( rule__Topic__NameAssignment_1 ) )
            // InternalIotlang.g:1575:2: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1576:2: ( rule__Topic__NameAssignment_1 )
            // InternalIotlang.g:1576:3: rule__Topic__NameAssignment_1
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
    // InternalIotlang.g:1584:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1588:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // InternalIotlang.g:1589:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
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
    // InternalIotlang.g:1596:1: rule__Topic__Group__2__Impl : ( '(' ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1600:1: ( ( '(' ) )
            // InternalIotlang.g:1601:1: ( '(' )
            {
            // InternalIotlang.g:1601:1: ( '(' )
            // InternalIotlang.g:1602:2: '('
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
    // InternalIotlang.g:1611:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1615:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // InternalIotlang.g:1616:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
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
    // InternalIotlang.g:1623:1: rule__Topic__Group__3__Impl : ( ( rule__Topic__AcceptedMessagesAssignment_3 ) ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1627:1: ( ( ( rule__Topic__AcceptedMessagesAssignment_3 ) ) )
            // InternalIotlang.g:1628:1: ( ( rule__Topic__AcceptedMessagesAssignment_3 ) )
            {
            // InternalIotlang.g:1628:1: ( ( rule__Topic__AcceptedMessagesAssignment_3 ) )
            // InternalIotlang.g:1629:2: ( rule__Topic__AcceptedMessagesAssignment_3 )
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesAssignment_3()); 
            // InternalIotlang.g:1630:2: ( rule__Topic__AcceptedMessagesAssignment_3 )
            // InternalIotlang.g:1630:3: rule__Topic__AcceptedMessagesAssignment_3
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
    // InternalIotlang.g:1638:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1642:1: ( rule__Topic__Group__4__Impl )
            // InternalIotlang.g:1643:2: rule__Topic__Group__4__Impl
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
    // InternalIotlang.g:1649:1: rule__Topic__Group__4__Impl : ( ')' ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1653:1: ( ( ')' ) )
            // InternalIotlang.g:1654:1: ( ')' )
            {
            // InternalIotlang.g:1654:1: ( ')' )
            // InternalIotlang.g:1655:2: ')'
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
    // InternalIotlang.g:1665:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1669:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalIotlang.g:1670:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalIotlang.g:1677:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1681:1: ( ( 'rule' ) )
            // InternalIotlang.g:1682:1: ( 'rule' )
            {
            // InternalIotlang.g:1682:1: ( 'rule' )
            // InternalIotlang.g:1683:2: 'rule'
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
    // InternalIotlang.g:1692:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1696:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalIotlang.g:1697:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalIotlang.g:1704:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1708:1: ( ( ( rule__Rule__NameAssignment_1 )? ) )
            // InternalIotlang.g:1709:1: ( ( rule__Rule__NameAssignment_1 )? )
            {
            // InternalIotlang.g:1709:1: ( ( rule__Rule__NameAssignment_1 )? )
            // InternalIotlang.g:1710:2: ( rule__Rule__NameAssignment_1 )?
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1711:2: ( rule__Rule__NameAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalIotlang.g:1711:3: rule__Rule__NameAssignment_1
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
    // InternalIotlang.g:1719:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1723:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalIotlang.g:1724:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalIotlang.g:1731:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__SubjectAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1735:1: ( ( ( rule__Rule__SubjectAssignment_2 ) ) )
            // InternalIotlang.g:1736:1: ( ( rule__Rule__SubjectAssignment_2 ) )
            {
            // InternalIotlang.g:1736:1: ( ( rule__Rule__SubjectAssignment_2 ) )
            // InternalIotlang.g:1737:2: ( rule__Rule__SubjectAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getSubjectAssignment_2()); 
            // InternalIotlang.g:1738:2: ( rule__Rule__SubjectAssignment_2 )
            // InternalIotlang.g:1738:3: rule__Rule__SubjectAssignment_2
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
    // InternalIotlang.g:1746:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1750:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalIotlang.g:1751:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalIotlang.g:1758:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__PermissionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1762:1: ( ( ( rule__Rule__PermissionAssignment_3 ) ) )
            // InternalIotlang.g:1763:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            {
            // InternalIotlang.g:1763:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            // InternalIotlang.g:1764:2: ( rule__Rule__PermissionAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAssignment_3()); 
            // InternalIotlang.g:1765:2: ( rule__Rule__PermissionAssignment_3 )
            // InternalIotlang.g:1765:3: rule__Rule__PermissionAssignment_3
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
    // InternalIotlang.g:1773:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1777:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalIotlang.g:1778:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalIotlang.g:1785:1: rule__Rule__Group__4__Impl : ( ':' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1789:1: ( ( ':' ) )
            // InternalIotlang.g:1790:1: ( ':' )
            {
            // InternalIotlang.g:1790:1: ( ':' )
            // InternalIotlang.g:1791:2: ':'
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
    // InternalIotlang.g:1800:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1804:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalIotlang.g:1805:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
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
    // InternalIotlang.g:1812:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ActionAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1816:1: ( ( ( rule__Rule__ActionAssignment_5 ) ) )
            // InternalIotlang.g:1817:1: ( ( rule__Rule__ActionAssignment_5 ) )
            {
            // InternalIotlang.g:1817:1: ( ( rule__Rule__ActionAssignment_5 ) )
            // InternalIotlang.g:1818:2: ( rule__Rule__ActionAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_5()); 
            // InternalIotlang.g:1819:2: ( rule__Rule__ActionAssignment_5 )
            // InternalIotlang.g:1819:3: rule__Rule__ActionAssignment_5
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
    // InternalIotlang.g:1827:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1831:1: ( rule__Rule__Group__6__Impl )
            // InternalIotlang.g:1832:2: rule__Rule__Group__6__Impl
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
    // InternalIotlang.g:1838:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Alternatives_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1842:1: ( ( ( rule__Rule__Alternatives_6 ) ) )
            // InternalIotlang.g:1843:1: ( ( rule__Rule__Alternatives_6 ) )
            {
            // InternalIotlang.g:1843:1: ( ( rule__Rule__Alternatives_6 ) )
            // InternalIotlang.g:1844:2: ( rule__Rule__Alternatives_6 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_6()); 
            // InternalIotlang.g:1845:2: ( rule__Rule__Alternatives_6 )
            // InternalIotlang.g:1845:3: rule__Rule__Alternatives_6
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
    // InternalIotlang.g:1854:1: rule__Rule__Group_6_0__0 : rule__Rule__Group_6_0__0__Impl rule__Rule__Group_6_0__1 ;
    public final void rule__Rule__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1858:1: ( rule__Rule__Group_6_0__0__Impl rule__Rule__Group_6_0__1 )
            // InternalIotlang.g:1859:2: rule__Rule__Group_6_0__0__Impl rule__Rule__Group_6_0__1
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
    // InternalIotlang.g:1866:1: rule__Rule__Group_6_0__0__Impl : ( ( rule__Rule__ObjectAssignment_6_0_0 ) ) ;
    public final void rule__Rule__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1870:1: ( ( ( rule__Rule__ObjectAssignment_6_0_0 ) ) )
            // InternalIotlang.g:1871:1: ( ( rule__Rule__ObjectAssignment_6_0_0 ) )
            {
            // InternalIotlang.g:1871:1: ( ( rule__Rule__ObjectAssignment_6_0_0 ) )
            // InternalIotlang.g:1872:2: ( rule__Rule__ObjectAssignment_6_0_0 )
            {
             before(grammarAccess.getRuleAccess().getObjectAssignment_6_0_0()); 
            // InternalIotlang.g:1873:2: ( rule__Rule__ObjectAssignment_6_0_0 )
            // InternalIotlang.g:1873:3: rule__Rule__ObjectAssignment_6_0_0
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
    // InternalIotlang.g:1881:1: rule__Rule__Group_6_0__1 : rule__Rule__Group_6_0__1__Impl ;
    public final void rule__Rule__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1885:1: ( rule__Rule__Group_6_0__1__Impl )
            // InternalIotlang.g:1886:2: rule__Rule__Group_6_0__1__Impl
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
    // InternalIotlang.g:1892:1: rule__Rule__Group_6_0__1__Impl : ( ( rule__Rule__Group_6_0_1__0 )* ) ;
    public final void rule__Rule__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1896:1: ( ( ( rule__Rule__Group_6_0_1__0 )* ) )
            // InternalIotlang.g:1897:1: ( ( rule__Rule__Group_6_0_1__0 )* )
            {
            // InternalIotlang.g:1897:1: ( ( rule__Rule__Group_6_0_1__0 )* )
            // InternalIotlang.g:1898:2: ( rule__Rule__Group_6_0_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_6_0_1()); 
            // InternalIotlang.g:1899:2: ( rule__Rule__Group_6_0_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIotlang.g:1899:3: rule__Rule__Group_6_0_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Rule__Group_6_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalIotlang.g:1908:1: rule__Rule__Group_6_0_1__0 : rule__Rule__Group_6_0_1__0__Impl rule__Rule__Group_6_0_1__1 ;
    public final void rule__Rule__Group_6_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1912:1: ( rule__Rule__Group_6_0_1__0__Impl rule__Rule__Group_6_0_1__1 )
            // InternalIotlang.g:1913:2: rule__Rule__Group_6_0_1__0__Impl rule__Rule__Group_6_0_1__1
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
    // InternalIotlang.g:1920:1: rule__Rule__Group_6_0_1__0__Impl : ( '.' ) ;
    public final void rule__Rule__Group_6_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1924:1: ( ( '.' ) )
            // InternalIotlang.g:1925:1: ( '.' )
            {
            // InternalIotlang.g:1925:1: ( '.' )
            // InternalIotlang.g:1926:2: '.'
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
    // InternalIotlang.g:1935:1: rule__Rule__Group_6_0_1__1 : rule__Rule__Group_6_0_1__1__Impl ;
    public final void rule__Rule__Group_6_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1939:1: ( rule__Rule__Group_6_0_1__1__Impl )
            // InternalIotlang.g:1940:2: rule__Rule__Group_6_0_1__1__Impl
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
    // InternalIotlang.g:1946:1: rule__Rule__Group_6_0_1__1__Impl : ( ( rule__Rule__PortsAssignment_6_0_1_1 ) ) ;
    public final void rule__Rule__Group_6_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1950:1: ( ( ( rule__Rule__PortsAssignment_6_0_1_1 ) ) )
            // InternalIotlang.g:1951:1: ( ( rule__Rule__PortsAssignment_6_0_1_1 ) )
            {
            // InternalIotlang.g:1951:1: ( ( rule__Rule__PortsAssignment_6_0_1_1 ) )
            // InternalIotlang.g:1952:2: ( rule__Rule__PortsAssignment_6_0_1_1 )
            {
             before(grammarAccess.getRuleAccess().getPortsAssignment_6_0_1_1()); 
            // InternalIotlang.g:1953:2: ( rule__Rule__PortsAssignment_6_0_1_1 )
            // InternalIotlang.g:1953:3: rule__Rule__PortsAssignment_6_0_1_1
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
    // InternalIotlang.g:1962:1: rule__Rule__Group_6_1__0 : rule__Rule__Group_6_1__0__Impl rule__Rule__Group_6_1__1 ;
    public final void rule__Rule__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1966:1: ( rule__Rule__Group_6_1__0__Impl rule__Rule__Group_6_1__1 )
            // InternalIotlang.g:1967:2: rule__Rule__Group_6_1__0__Impl rule__Rule__Group_6_1__1
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
    // InternalIotlang.g:1974:1: rule__Rule__Group_6_1__0__Impl : ( 'message:' ) ;
    public final void rule__Rule__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1978:1: ( ( 'message:' ) )
            // InternalIotlang.g:1979:1: ( 'message:' )
            {
            // InternalIotlang.g:1979:1: ( 'message:' )
            // InternalIotlang.g:1980:2: 'message:'
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
    // InternalIotlang.g:1989:1: rule__Rule__Group_6_1__1 : rule__Rule__Group_6_1__1__Impl ;
    public final void rule__Rule__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1993:1: ( rule__Rule__Group_6_1__1__Impl )
            // InternalIotlang.g:1994:2: rule__Rule__Group_6_1__1__Impl
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
    // InternalIotlang.g:2000:1: rule__Rule__Group_6_1__1__Impl : ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) ) ;
    public final void rule__Rule__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2004:1: ( ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) ) )
            // InternalIotlang.g:2005:1: ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) )
            {
            // InternalIotlang.g:2005:1: ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) )
            // InternalIotlang.g:2006:2: ( rule__Rule__ObjectMessageAssignment_6_1_1 )
            {
             before(grammarAccess.getRuleAccess().getObjectMessageAssignment_6_1_1()); 
            // InternalIotlang.g:2007:2: ( rule__Rule__ObjectMessageAssignment_6_1_1 )
            // InternalIotlang.g:2007:3: rule__Rule__ObjectMessageAssignment_6_1_1
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
    // InternalIotlang.g:2016:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2020:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalIotlang.g:2021:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalIotlang.g:2028:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2032:1: ( ( 'domain' ) )
            // InternalIotlang.g:2033:1: ( 'domain' )
            {
            // InternalIotlang.g:2033:1: ( 'domain' )
            // InternalIotlang.g:2034:2: 'domain'
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
    // InternalIotlang.g:2043:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2047:1: ( rule__Domain__Group__1__Impl )
            // InternalIotlang.g:2048:2: rule__Domain__Group__1__Impl
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
    // InternalIotlang.g:2054:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2058:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalIotlang.g:2059:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2059:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalIotlang.g:2060:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2061:2: ( rule__Domain__NameAssignment_1 )
            // InternalIotlang.g:2061:3: rule__Domain__NameAssignment_1
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
    // InternalIotlang.g:2070:1: rule__InstanceThing__Group__0 : rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 ;
    public final void rule__InstanceThing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2074:1: ( rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 )
            // InternalIotlang.g:2075:2: rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1
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
    // InternalIotlang.g:2082:1: rule__InstanceThing__Group__0__Impl : ( 'instanceThing' ) ;
    public final void rule__InstanceThing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2086:1: ( ( 'instanceThing' ) )
            // InternalIotlang.g:2087:1: ( 'instanceThing' )
            {
            // InternalIotlang.g:2087:1: ( 'instanceThing' )
            // InternalIotlang.g:2088:2: 'instanceThing'
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
    // InternalIotlang.g:2097:1: rule__InstanceThing__Group__1 : rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 ;
    public final void rule__InstanceThing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2101:1: ( rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 )
            // InternalIotlang.g:2102:2: rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2
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
    // InternalIotlang.g:2109:1: rule__InstanceThing__Group__1__Impl : ( ( rule__InstanceThing__NameAssignment_1 ) ) ;
    public final void rule__InstanceThing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2113:1: ( ( ( rule__InstanceThing__NameAssignment_1 ) ) )
            // InternalIotlang.g:2114:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2114:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            // InternalIotlang.g:2115:2: ( rule__InstanceThing__NameAssignment_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2116:2: ( rule__InstanceThing__NameAssignment_1 )
            // InternalIotlang.g:2116:3: rule__InstanceThing__NameAssignment_1
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
    // InternalIotlang.g:2124:1: rule__InstanceThing__Group__2 : rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 ;
    public final void rule__InstanceThing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2128:1: ( rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 )
            // InternalIotlang.g:2129:2: rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3
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
    // InternalIotlang.g:2136:1: rule__InstanceThing__Group__2__Impl : ( ( rule__InstanceThing__Group_2__0 )* ) ;
    public final void rule__InstanceThing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2140:1: ( ( ( rule__InstanceThing__Group_2__0 )* ) )
            // InternalIotlang.g:2141:1: ( ( rule__InstanceThing__Group_2__0 )* )
            {
            // InternalIotlang.g:2141:1: ( ( rule__InstanceThing__Group_2__0 )* )
            // InternalIotlang.g:2142:2: ( rule__InstanceThing__Group_2__0 )*
            {
             before(grammarAccess.getInstanceThingAccess().getGroup_2()); 
            // InternalIotlang.g:2143:2: ( rule__InstanceThing__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIotlang.g:2143:3: rule__InstanceThing__Group_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__InstanceThing__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalIotlang.g:2151:1: rule__InstanceThing__Group__3 : rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 ;
    public final void rule__InstanceThing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2155:1: ( rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 )
            // InternalIotlang.g:2156:2: rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4
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
    // InternalIotlang.g:2163:1: rule__InstanceThing__Group__3__Impl : ( ':' ) ;
    public final void rule__InstanceThing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2167:1: ( ( ':' ) )
            // InternalIotlang.g:2168:1: ( ':' )
            {
            // InternalIotlang.g:2168:1: ( ':' )
            // InternalIotlang.g:2169:2: ':'
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
    // InternalIotlang.g:2178:1: rule__InstanceThing__Group__4 : rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 ;
    public final void rule__InstanceThing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2182:1: ( rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 )
            // InternalIotlang.g:2183:2: rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5
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
    // InternalIotlang.g:2190:1: rule__InstanceThing__Group__4__Impl : ( ( rule__InstanceThing__TypeThingAssignment_4 ) ) ;
    public final void rule__InstanceThing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2194:1: ( ( ( rule__InstanceThing__TypeThingAssignment_4 ) ) )
            // InternalIotlang.g:2195:1: ( ( rule__InstanceThing__TypeThingAssignment_4 ) )
            {
            // InternalIotlang.g:2195:1: ( ( rule__InstanceThing__TypeThingAssignment_4 ) )
            // InternalIotlang.g:2196:2: ( rule__InstanceThing__TypeThingAssignment_4 )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingAssignment_4()); 
            // InternalIotlang.g:2197:2: ( rule__InstanceThing__TypeThingAssignment_4 )
            // InternalIotlang.g:2197:3: rule__InstanceThing__TypeThingAssignment_4
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
    // InternalIotlang.g:2205:1: rule__InstanceThing__Group__5 : rule__InstanceThing__Group__5__Impl ;
    public final void rule__InstanceThing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2209:1: ( rule__InstanceThing__Group__5__Impl )
            // InternalIotlang.g:2210:2: rule__InstanceThing__Group__5__Impl
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
    // InternalIotlang.g:2216:1: rule__InstanceThing__Group__5__Impl : ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) ;
    public final void rule__InstanceThing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2220:1: ( ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) )
            // InternalIotlang.g:2221:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            {
            // InternalIotlang.g:2221:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            // InternalIotlang.g:2222:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            {
             before(grammarAccess.getInstanceThingAccess().getAnnotationsAssignment_5()); 
            // InternalIotlang.g:2223:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ANNOTATION_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIotlang.g:2223:3: rule__InstanceThing__AnnotationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanceThing__AnnotationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalIotlang.g:2232:1: rule__InstanceThing__Group_2__0 : rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 ;
    public final void rule__InstanceThing__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2236:1: ( rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 )
            // InternalIotlang.g:2237:2: rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1
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
    // InternalIotlang.g:2244:1: rule__InstanceThing__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstanceThing__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2248:1: ( ( '[' ) )
            // InternalIotlang.g:2249:1: ( '[' )
            {
            // InternalIotlang.g:2249:1: ( '[' )
            // InternalIotlang.g:2250:2: '['
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
    // InternalIotlang.g:2259:1: rule__InstanceThing__Group_2__1 : rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 ;
    public final void rule__InstanceThing__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2263:1: ( rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 )
            // InternalIotlang.g:2264:2: rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2
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
    // InternalIotlang.g:2271:1: rule__InstanceThing__Group_2__1__Impl : ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) ;
    public final void rule__InstanceThing__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2275:1: ( ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:2276:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:2276:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            // InternalIotlang.g:2277:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:2278:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            // InternalIotlang.g:2278:3: rule__InstanceThing__NumberAssignment_2_1
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
    // InternalIotlang.g:2286:1: rule__InstanceThing__Group_2__2 : rule__InstanceThing__Group_2__2__Impl ;
    public final void rule__InstanceThing__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2290:1: ( rule__InstanceThing__Group_2__2__Impl )
            // InternalIotlang.g:2291:2: rule__InstanceThing__Group_2__2__Impl
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
    // InternalIotlang.g:2297:1: rule__InstanceThing__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstanceThing__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2301:1: ( ( ']' ) )
            // InternalIotlang.g:2302:1: ( ']' )
            {
            // InternalIotlang.g:2302:1: ( ']' )
            // InternalIotlang.g:2303:2: ']'
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
    // InternalIotlang.g:2313:1: rule__InstancePubSub__Group__0 : rule__InstancePubSub__Group__0__Impl rule__InstancePubSub__Group__1 ;
    public final void rule__InstancePubSub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2317:1: ( rule__InstancePubSub__Group__0__Impl rule__InstancePubSub__Group__1 )
            // InternalIotlang.g:2318:2: rule__InstancePubSub__Group__0__Impl rule__InstancePubSub__Group__1
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
    // InternalIotlang.g:2325:1: rule__InstancePubSub__Group__0__Impl : ( 'instancePubSub' ) ;
    public final void rule__InstancePubSub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2329:1: ( ( 'instancePubSub' ) )
            // InternalIotlang.g:2330:1: ( 'instancePubSub' )
            {
            // InternalIotlang.g:2330:1: ( 'instancePubSub' )
            // InternalIotlang.g:2331:2: 'instancePubSub'
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
    // InternalIotlang.g:2340:1: rule__InstancePubSub__Group__1 : rule__InstancePubSub__Group__1__Impl rule__InstancePubSub__Group__2 ;
    public final void rule__InstancePubSub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2344:1: ( rule__InstancePubSub__Group__1__Impl rule__InstancePubSub__Group__2 )
            // InternalIotlang.g:2345:2: rule__InstancePubSub__Group__1__Impl rule__InstancePubSub__Group__2
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
    // InternalIotlang.g:2352:1: rule__InstancePubSub__Group__1__Impl : ( ( rule__InstancePubSub__NameAssignment_1 ) ) ;
    public final void rule__InstancePubSub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2356:1: ( ( ( rule__InstancePubSub__NameAssignment_1 ) ) )
            // InternalIotlang.g:2357:1: ( ( rule__InstancePubSub__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2357:1: ( ( rule__InstancePubSub__NameAssignment_1 ) )
            // InternalIotlang.g:2358:2: ( rule__InstancePubSub__NameAssignment_1 )
            {
             before(grammarAccess.getInstancePubSubAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2359:2: ( rule__InstancePubSub__NameAssignment_1 )
            // InternalIotlang.g:2359:3: rule__InstancePubSub__NameAssignment_1
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
    // InternalIotlang.g:2367:1: rule__InstancePubSub__Group__2 : rule__InstancePubSub__Group__2__Impl rule__InstancePubSub__Group__3 ;
    public final void rule__InstancePubSub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2371:1: ( rule__InstancePubSub__Group__2__Impl rule__InstancePubSub__Group__3 )
            // InternalIotlang.g:2372:2: rule__InstancePubSub__Group__2__Impl rule__InstancePubSub__Group__3
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
    // InternalIotlang.g:2379:1: rule__InstancePubSub__Group__2__Impl : ( ( rule__InstancePubSub__Group_2__0 )* ) ;
    public final void rule__InstancePubSub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2383:1: ( ( ( rule__InstancePubSub__Group_2__0 )* ) )
            // InternalIotlang.g:2384:1: ( ( rule__InstancePubSub__Group_2__0 )* )
            {
            // InternalIotlang.g:2384:1: ( ( rule__InstancePubSub__Group_2__0 )* )
            // InternalIotlang.g:2385:2: ( rule__InstancePubSub__Group_2__0 )*
            {
             before(grammarAccess.getInstancePubSubAccess().getGroup_2()); 
            // InternalIotlang.g:2386:2: ( rule__InstancePubSub__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIotlang.g:2386:3: rule__InstancePubSub__Group_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__InstancePubSub__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalIotlang.g:2394:1: rule__InstancePubSub__Group__3 : rule__InstancePubSub__Group__3__Impl rule__InstancePubSub__Group__4 ;
    public final void rule__InstancePubSub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2398:1: ( rule__InstancePubSub__Group__3__Impl rule__InstancePubSub__Group__4 )
            // InternalIotlang.g:2399:2: rule__InstancePubSub__Group__3__Impl rule__InstancePubSub__Group__4
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
    // InternalIotlang.g:2406:1: rule__InstancePubSub__Group__3__Impl : ( ':' ) ;
    public final void rule__InstancePubSub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2410:1: ( ( ':' ) )
            // InternalIotlang.g:2411:1: ( ':' )
            {
            // InternalIotlang.g:2411:1: ( ':' )
            // InternalIotlang.g:2412:2: ':'
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
    // InternalIotlang.g:2421:1: rule__InstancePubSub__Group__4 : rule__InstancePubSub__Group__4__Impl rule__InstancePubSub__Group__5 ;
    public final void rule__InstancePubSub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2425:1: ( rule__InstancePubSub__Group__4__Impl rule__InstancePubSub__Group__5 )
            // InternalIotlang.g:2426:2: rule__InstancePubSub__Group__4__Impl rule__InstancePubSub__Group__5
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
    // InternalIotlang.g:2433:1: rule__InstancePubSub__Group__4__Impl : ( ( rule__InstancePubSub__TypeChannelAssignment_4 ) ) ;
    public final void rule__InstancePubSub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2437:1: ( ( ( rule__InstancePubSub__TypeChannelAssignment_4 ) ) )
            // InternalIotlang.g:2438:1: ( ( rule__InstancePubSub__TypeChannelAssignment_4 ) )
            {
            // InternalIotlang.g:2438:1: ( ( rule__InstancePubSub__TypeChannelAssignment_4 ) )
            // InternalIotlang.g:2439:2: ( rule__InstancePubSub__TypeChannelAssignment_4 )
            {
             before(grammarAccess.getInstancePubSubAccess().getTypeChannelAssignment_4()); 
            // InternalIotlang.g:2440:2: ( rule__InstancePubSub__TypeChannelAssignment_4 )
            // InternalIotlang.g:2440:3: rule__InstancePubSub__TypeChannelAssignment_4
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
    // InternalIotlang.g:2448:1: rule__InstancePubSub__Group__5 : rule__InstancePubSub__Group__5__Impl rule__InstancePubSub__Group__6 ;
    public final void rule__InstancePubSub__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2452:1: ( rule__InstancePubSub__Group__5__Impl rule__InstancePubSub__Group__6 )
            // InternalIotlang.g:2453:2: rule__InstancePubSub__Group__5__Impl rule__InstancePubSub__Group__6
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
    // InternalIotlang.g:2460:1: rule__InstancePubSub__Group__5__Impl : ( 'over' ) ;
    public final void rule__InstancePubSub__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2464:1: ( ( 'over' ) )
            // InternalIotlang.g:2465:1: ( 'over' )
            {
            // InternalIotlang.g:2465:1: ( 'over' )
            // InternalIotlang.g:2466:2: 'over'
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
    // InternalIotlang.g:2475:1: rule__InstancePubSub__Group__6 : rule__InstancePubSub__Group__6__Impl rule__InstancePubSub__Group__7 ;
    public final void rule__InstancePubSub__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2479:1: ( rule__InstancePubSub__Group__6__Impl rule__InstancePubSub__Group__7 )
            // InternalIotlang.g:2480:2: rule__InstancePubSub__Group__6__Impl rule__InstancePubSub__Group__7
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
    // InternalIotlang.g:2487:1: rule__InstancePubSub__Group__6__Impl : ( ( rule__InstancePubSub__OverProtocolAssignment_6 ) ) ;
    public final void rule__InstancePubSub__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2491:1: ( ( ( rule__InstancePubSub__OverProtocolAssignment_6 ) ) )
            // InternalIotlang.g:2492:1: ( ( rule__InstancePubSub__OverProtocolAssignment_6 ) )
            {
            // InternalIotlang.g:2492:1: ( ( rule__InstancePubSub__OverProtocolAssignment_6 ) )
            // InternalIotlang.g:2493:2: ( rule__InstancePubSub__OverProtocolAssignment_6 )
            {
             before(grammarAccess.getInstancePubSubAccess().getOverProtocolAssignment_6()); 
            // InternalIotlang.g:2494:2: ( rule__InstancePubSub__OverProtocolAssignment_6 )
            // InternalIotlang.g:2494:3: rule__InstancePubSub__OverProtocolAssignment_6
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
    // InternalIotlang.g:2502:1: rule__InstancePubSub__Group__7 : rule__InstancePubSub__Group__7__Impl ;
    public final void rule__InstancePubSub__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2506:1: ( rule__InstancePubSub__Group__7__Impl )
            // InternalIotlang.g:2507:2: rule__InstancePubSub__Group__7__Impl
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
    // InternalIotlang.g:2513:1: rule__InstancePubSub__Group__7__Impl : ( ( rule__InstancePubSub__AnnotationsAssignment_7 )* ) ;
    public final void rule__InstancePubSub__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2517:1: ( ( ( rule__InstancePubSub__AnnotationsAssignment_7 )* ) )
            // InternalIotlang.g:2518:1: ( ( rule__InstancePubSub__AnnotationsAssignment_7 )* )
            {
            // InternalIotlang.g:2518:1: ( ( rule__InstancePubSub__AnnotationsAssignment_7 )* )
            // InternalIotlang.g:2519:2: ( rule__InstancePubSub__AnnotationsAssignment_7 )*
            {
             before(grammarAccess.getInstancePubSubAccess().getAnnotationsAssignment_7()); 
            // InternalIotlang.g:2520:2: ( rule__InstancePubSub__AnnotationsAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ANNOTATION_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIotlang.g:2520:3: rule__InstancePubSub__AnnotationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstancePubSub__AnnotationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalIotlang.g:2529:1: rule__InstancePubSub__Group_2__0 : rule__InstancePubSub__Group_2__0__Impl rule__InstancePubSub__Group_2__1 ;
    public final void rule__InstancePubSub__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2533:1: ( rule__InstancePubSub__Group_2__0__Impl rule__InstancePubSub__Group_2__1 )
            // InternalIotlang.g:2534:2: rule__InstancePubSub__Group_2__0__Impl rule__InstancePubSub__Group_2__1
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
    // InternalIotlang.g:2541:1: rule__InstancePubSub__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstancePubSub__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2545:1: ( ( '[' ) )
            // InternalIotlang.g:2546:1: ( '[' )
            {
            // InternalIotlang.g:2546:1: ( '[' )
            // InternalIotlang.g:2547:2: '['
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
    // InternalIotlang.g:2556:1: rule__InstancePubSub__Group_2__1 : rule__InstancePubSub__Group_2__1__Impl rule__InstancePubSub__Group_2__2 ;
    public final void rule__InstancePubSub__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2560:1: ( rule__InstancePubSub__Group_2__1__Impl rule__InstancePubSub__Group_2__2 )
            // InternalIotlang.g:2561:2: rule__InstancePubSub__Group_2__1__Impl rule__InstancePubSub__Group_2__2
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
    // InternalIotlang.g:2568:1: rule__InstancePubSub__Group_2__1__Impl : ( ( rule__InstancePubSub__NumberAssignment_2_1 ) ) ;
    public final void rule__InstancePubSub__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2572:1: ( ( ( rule__InstancePubSub__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:2573:1: ( ( rule__InstancePubSub__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:2573:1: ( ( rule__InstancePubSub__NumberAssignment_2_1 ) )
            // InternalIotlang.g:2574:2: ( rule__InstancePubSub__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstancePubSubAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:2575:2: ( rule__InstancePubSub__NumberAssignment_2_1 )
            // InternalIotlang.g:2575:3: rule__InstancePubSub__NumberAssignment_2_1
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
    // InternalIotlang.g:2583:1: rule__InstancePubSub__Group_2__2 : rule__InstancePubSub__Group_2__2__Impl ;
    public final void rule__InstancePubSub__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2587:1: ( rule__InstancePubSub__Group_2__2__Impl )
            // InternalIotlang.g:2588:2: rule__InstancePubSub__Group_2__2__Impl
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
    // InternalIotlang.g:2594:1: rule__InstancePubSub__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstancePubSub__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2598:1: ( ( ']' ) )
            // InternalIotlang.g:2599:1: ( ']' )
            {
            // InternalIotlang.g:2599:1: ( ']' )
            // InternalIotlang.g:2600:2: ']'
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
    // InternalIotlang.g:2610:1: rule__InstancePtP__Group__0 : rule__InstancePtP__Group__0__Impl rule__InstancePtP__Group__1 ;
    public final void rule__InstancePtP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2614:1: ( rule__InstancePtP__Group__0__Impl rule__InstancePtP__Group__1 )
            // InternalIotlang.g:2615:2: rule__InstancePtP__Group__0__Impl rule__InstancePtP__Group__1
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
    // InternalIotlang.g:2622:1: rule__InstancePtP__Group__0__Impl : ( 'instancePTP' ) ;
    public final void rule__InstancePtP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2626:1: ( ( 'instancePTP' ) )
            // InternalIotlang.g:2627:1: ( 'instancePTP' )
            {
            // InternalIotlang.g:2627:1: ( 'instancePTP' )
            // InternalIotlang.g:2628:2: 'instancePTP'
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
    // InternalIotlang.g:2637:1: rule__InstancePtP__Group__1 : rule__InstancePtP__Group__1__Impl rule__InstancePtP__Group__2 ;
    public final void rule__InstancePtP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2641:1: ( rule__InstancePtP__Group__1__Impl rule__InstancePtP__Group__2 )
            // InternalIotlang.g:2642:2: rule__InstancePtP__Group__1__Impl rule__InstancePtP__Group__2
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
    // InternalIotlang.g:2649:1: rule__InstancePtP__Group__1__Impl : ( ( rule__InstancePtP__NameAssignment_1 ) ) ;
    public final void rule__InstancePtP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2653:1: ( ( ( rule__InstancePtP__NameAssignment_1 ) ) )
            // InternalIotlang.g:2654:1: ( ( rule__InstancePtP__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2654:1: ( ( rule__InstancePtP__NameAssignment_1 ) )
            // InternalIotlang.g:2655:2: ( rule__InstancePtP__NameAssignment_1 )
            {
             before(grammarAccess.getInstancePtPAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2656:2: ( rule__InstancePtP__NameAssignment_1 )
            // InternalIotlang.g:2656:3: rule__InstancePtP__NameAssignment_1
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
    // InternalIotlang.g:2664:1: rule__InstancePtP__Group__2 : rule__InstancePtP__Group__2__Impl rule__InstancePtP__Group__3 ;
    public final void rule__InstancePtP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2668:1: ( rule__InstancePtP__Group__2__Impl rule__InstancePtP__Group__3 )
            // InternalIotlang.g:2669:2: rule__InstancePtP__Group__2__Impl rule__InstancePtP__Group__3
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
    // InternalIotlang.g:2676:1: rule__InstancePtP__Group__2__Impl : ( ( rule__InstancePtP__Group_2__0 )* ) ;
    public final void rule__InstancePtP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2680:1: ( ( ( rule__InstancePtP__Group_2__0 )* ) )
            // InternalIotlang.g:2681:1: ( ( rule__InstancePtP__Group_2__0 )* )
            {
            // InternalIotlang.g:2681:1: ( ( rule__InstancePtP__Group_2__0 )* )
            // InternalIotlang.g:2682:2: ( rule__InstancePtP__Group_2__0 )*
            {
             before(grammarAccess.getInstancePtPAccess().getGroup_2()); 
            // InternalIotlang.g:2683:2: ( rule__InstancePtP__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIotlang.g:2683:3: rule__InstancePtP__Group_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__InstancePtP__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalIotlang.g:2691:1: rule__InstancePtP__Group__3 : rule__InstancePtP__Group__3__Impl rule__InstancePtP__Group__4 ;
    public final void rule__InstancePtP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2695:1: ( rule__InstancePtP__Group__3__Impl rule__InstancePtP__Group__4 )
            // InternalIotlang.g:2696:2: rule__InstancePtP__Group__3__Impl rule__InstancePtP__Group__4
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
    // InternalIotlang.g:2703:1: rule__InstancePtP__Group__3__Impl : ( ':' ) ;
    public final void rule__InstancePtP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2707:1: ( ( ':' ) )
            // InternalIotlang.g:2708:1: ( ':' )
            {
            // InternalIotlang.g:2708:1: ( ':' )
            // InternalIotlang.g:2709:2: ':'
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
    // InternalIotlang.g:2718:1: rule__InstancePtP__Group__4 : rule__InstancePtP__Group__4__Impl rule__InstancePtP__Group__5 ;
    public final void rule__InstancePtP__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2722:1: ( rule__InstancePtP__Group__4__Impl rule__InstancePtP__Group__5 )
            // InternalIotlang.g:2723:2: rule__InstancePtP__Group__4__Impl rule__InstancePtP__Group__5
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
    // InternalIotlang.g:2730:1: rule__InstancePtP__Group__4__Impl : ( ( rule__InstancePtP__TypeChannelAssignment_4 ) ) ;
    public final void rule__InstancePtP__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2734:1: ( ( ( rule__InstancePtP__TypeChannelAssignment_4 ) ) )
            // InternalIotlang.g:2735:1: ( ( rule__InstancePtP__TypeChannelAssignment_4 ) )
            {
            // InternalIotlang.g:2735:1: ( ( rule__InstancePtP__TypeChannelAssignment_4 ) )
            // InternalIotlang.g:2736:2: ( rule__InstancePtP__TypeChannelAssignment_4 )
            {
             before(grammarAccess.getInstancePtPAccess().getTypeChannelAssignment_4()); 
            // InternalIotlang.g:2737:2: ( rule__InstancePtP__TypeChannelAssignment_4 )
            // InternalIotlang.g:2737:3: rule__InstancePtP__TypeChannelAssignment_4
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
    // InternalIotlang.g:2745:1: rule__InstancePtP__Group__5 : rule__InstancePtP__Group__5__Impl rule__InstancePtP__Group__6 ;
    public final void rule__InstancePtP__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2749:1: ( rule__InstancePtP__Group__5__Impl rule__InstancePtP__Group__6 )
            // InternalIotlang.g:2750:2: rule__InstancePtP__Group__5__Impl rule__InstancePtP__Group__6
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
    // InternalIotlang.g:2757:1: rule__InstancePtP__Group__5__Impl : ( 'over' ) ;
    public final void rule__InstancePtP__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2761:1: ( ( 'over' ) )
            // InternalIotlang.g:2762:1: ( 'over' )
            {
            // InternalIotlang.g:2762:1: ( 'over' )
            // InternalIotlang.g:2763:2: 'over'
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
    // InternalIotlang.g:2772:1: rule__InstancePtP__Group__6 : rule__InstancePtP__Group__6__Impl rule__InstancePtP__Group__7 ;
    public final void rule__InstancePtP__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2776:1: ( rule__InstancePtP__Group__6__Impl rule__InstancePtP__Group__7 )
            // InternalIotlang.g:2777:2: rule__InstancePtP__Group__6__Impl rule__InstancePtP__Group__7
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
    // InternalIotlang.g:2784:1: rule__InstancePtP__Group__6__Impl : ( ( rule__InstancePtP__OverProtocolAssignment_6 ) ) ;
    public final void rule__InstancePtP__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2788:1: ( ( ( rule__InstancePtP__OverProtocolAssignment_6 ) ) )
            // InternalIotlang.g:2789:1: ( ( rule__InstancePtP__OverProtocolAssignment_6 ) )
            {
            // InternalIotlang.g:2789:1: ( ( rule__InstancePtP__OverProtocolAssignment_6 ) )
            // InternalIotlang.g:2790:2: ( rule__InstancePtP__OverProtocolAssignment_6 )
            {
             before(grammarAccess.getInstancePtPAccess().getOverProtocolAssignment_6()); 
            // InternalIotlang.g:2791:2: ( rule__InstancePtP__OverProtocolAssignment_6 )
            // InternalIotlang.g:2791:3: rule__InstancePtP__OverProtocolAssignment_6
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
    // InternalIotlang.g:2799:1: rule__InstancePtP__Group__7 : rule__InstancePtP__Group__7__Impl ;
    public final void rule__InstancePtP__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2803:1: ( rule__InstancePtP__Group__7__Impl )
            // InternalIotlang.g:2804:2: rule__InstancePtP__Group__7__Impl
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
    // InternalIotlang.g:2810:1: rule__InstancePtP__Group__7__Impl : ( ( rule__InstancePtP__AnnotationsAssignment_7 )* ) ;
    public final void rule__InstancePtP__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2814:1: ( ( ( rule__InstancePtP__AnnotationsAssignment_7 )* ) )
            // InternalIotlang.g:2815:1: ( ( rule__InstancePtP__AnnotationsAssignment_7 )* )
            {
            // InternalIotlang.g:2815:1: ( ( rule__InstancePtP__AnnotationsAssignment_7 )* )
            // InternalIotlang.g:2816:2: ( rule__InstancePtP__AnnotationsAssignment_7 )*
            {
             before(grammarAccess.getInstancePtPAccess().getAnnotationsAssignment_7()); 
            // InternalIotlang.g:2817:2: ( rule__InstancePtP__AnnotationsAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ANNOTATION_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIotlang.g:2817:3: rule__InstancePtP__AnnotationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstancePtP__AnnotationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalIotlang.g:2826:1: rule__InstancePtP__Group_2__0 : rule__InstancePtP__Group_2__0__Impl rule__InstancePtP__Group_2__1 ;
    public final void rule__InstancePtP__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2830:1: ( rule__InstancePtP__Group_2__0__Impl rule__InstancePtP__Group_2__1 )
            // InternalIotlang.g:2831:2: rule__InstancePtP__Group_2__0__Impl rule__InstancePtP__Group_2__1
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
    // InternalIotlang.g:2838:1: rule__InstancePtP__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstancePtP__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2842:1: ( ( '[' ) )
            // InternalIotlang.g:2843:1: ( '[' )
            {
            // InternalIotlang.g:2843:1: ( '[' )
            // InternalIotlang.g:2844:2: '['
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
    // InternalIotlang.g:2853:1: rule__InstancePtP__Group_2__1 : rule__InstancePtP__Group_2__1__Impl rule__InstancePtP__Group_2__2 ;
    public final void rule__InstancePtP__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2857:1: ( rule__InstancePtP__Group_2__1__Impl rule__InstancePtP__Group_2__2 )
            // InternalIotlang.g:2858:2: rule__InstancePtP__Group_2__1__Impl rule__InstancePtP__Group_2__2
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
    // InternalIotlang.g:2865:1: rule__InstancePtP__Group_2__1__Impl : ( ( rule__InstancePtP__NumberAssignment_2_1 ) ) ;
    public final void rule__InstancePtP__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2869:1: ( ( ( rule__InstancePtP__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:2870:1: ( ( rule__InstancePtP__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:2870:1: ( ( rule__InstancePtP__NumberAssignment_2_1 ) )
            // InternalIotlang.g:2871:2: ( rule__InstancePtP__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstancePtPAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:2872:2: ( rule__InstancePtP__NumberAssignment_2_1 )
            // InternalIotlang.g:2872:3: rule__InstancePtP__NumberAssignment_2_1
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
    // InternalIotlang.g:2880:1: rule__InstancePtP__Group_2__2 : rule__InstancePtP__Group_2__2__Impl ;
    public final void rule__InstancePtP__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2884:1: ( rule__InstancePtP__Group_2__2__Impl )
            // InternalIotlang.g:2885:2: rule__InstancePtP__Group_2__2__Impl
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
    // InternalIotlang.g:2891:1: rule__InstancePtP__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstancePtP__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2895:1: ( ( ']' ) )
            // InternalIotlang.g:2896:1: ( ']' )
            {
            // InternalIotlang.g:2896:1: ( ']' )
            // InternalIotlang.g:2897:2: ']'
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
    // InternalIotlang.g:2907:1: rule__InstancePolicy__Group__0 : rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 ;
    public final void rule__InstancePolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2911:1: ( rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 )
            // InternalIotlang.g:2912:2: rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1
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
    // InternalIotlang.g:2919:1: rule__InstancePolicy__Group__0__Impl : ( 'instancePolicy' ) ;
    public final void rule__InstancePolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2923:1: ( ( 'instancePolicy' ) )
            // InternalIotlang.g:2924:1: ( 'instancePolicy' )
            {
            // InternalIotlang.g:2924:1: ( 'instancePolicy' )
            // InternalIotlang.g:2925:2: 'instancePolicy'
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
    // InternalIotlang.g:2934:1: rule__InstancePolicy__Group__1 : rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 ;
    public final void rule__InstancePolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2938:1: ( rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 )
            // InternalIotlang.g:2939:2: rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2
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
    // InternalIotlang.g:2946:1: rule__InstancePolicy__Group__1__Impl : ( ( rule__InstancePolicy__NameAssignment_1 ) ) ;
    public final void rule__InstancePolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2950:1: ( ( ( rule__InstancePolicy__NameAssignment_1 ) ) )
            // InternalIotlang.g:2951:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2951:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            // InternalIotlang.g:2952:2: ( rule__InstancePolicy__NameAssignment_1 )
            {
             before(grammarAccess.getInstancePolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2953:2: ( rule__InstancePolicy__NameAssignment_1 )
            // InternalIotlang.g:2953:3: rule__InstancePolicy__NameAssignment_1
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
    // InternalIotlang.g:2961:1: rule__InstancePolicy__Group__2 : rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 ;
    public final void rule__InstancePolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2965:1: ( rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 )
            // InternalIotlang.g:2966:2: rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3
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
    // InternalIotlang.g:2973:1: rule__InstancePolicy__Group__2__Impl : ( ':' ) ;
    public final void rule__InstancePolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2977:1: ( ( ':' ) )
            // InternalIotlang.g:2978:1: ( ':' )
            {
            // InternalIotlang.g:2978:1: ( ':' )
            // InternalIotlang.g:2979:2: ':'
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
    // InternalIotlang.g:2988:1: rule__InstancePolicy__Group__3 : rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 ;
    public final void rule__InstancePolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2992:1: ( rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 )
            // InternalIotlang.g:2993:2: rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4
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
    // InternalIotlang.g:3000:1: rule__InstancePolicy__Group__3__Impl : ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) ;
    public final void rule__InstancePolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3004:1: ( ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) )
            // InternalIotlang.g:3005:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            {
            // InternalIotlang.g:3005:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            // InternalIotlang.g:3006:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyAssignment_3()); 
            // InternalIotlang.g:3007:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            // InternalIotlang.g:3007:3: rule__InstancePolicy__TypePolicyAssignment_3
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
    // InternalIotlang.g:3015:1: rule__InstancePolicy__Group__4 : rule__InstancePolicy__Group__4__Impl ;
    public final void rule__InstancePolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3019:1: ( rule__InstancePolicy__Group__4__Impl )
            // InternalIotlang.g:3020:2: rule__InstancePolicy__Group__4__Impl
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
    // InternalIotlang.g:3026:1: rule__InstancePolicy__Group__4__Impl : ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) ;
    public final void rule__InstancePolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3030:1: ( ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) )
            // InternalIotlang.g:3031:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            {
            // InternalIotlang.g:3031:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            // InternalIotlang.g:3032:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            {
             before(grammarAccess.getInstancePolicyAccess().getAnnotationsAssignment_4()); 
            // InternalIotlang.g:3033:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ANNOTATION_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIotlang.g:3033:3: rule__InstancePolicy__AnnotationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstancePolicy__AnnotationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalIotlang.g:3042:1: rule__NetworkConfiguration__Group__0 : rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 ;
    public final void rule__NetworkConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3046:1: ( rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 )
            // InternalIotlang.g:3047:2: rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1
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
    // InternalIotlang.g:3054:1: rule__NetworkConfiguration__Group__0__Impl : ( 'networkConfiguration' ) ;
    public final void rule__NetworkConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3058:1: ( ( 'networkConfiguration' ) )
            // InternalIotlang.g:3059:1: ( 'networkConfiguration' )
            {
            // InternalIotlang.g:3059:1: ( 'networkConfiguration' )
            // InternalIotlang.g:3060:2: 'networkConfiguration'
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
    // InternalIotlang.g:3069:1: rule__NetworkConfiguration__Group__1 : rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 ;
    public final void rule__NetworkConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3073:1: ( rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 )
            // InternalIotlang.g:3074:2: rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2
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
    // InternalIotlang.g:3081:1: rule__NetworkConfiguration__Group__1__Impl : ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) ;
    public final void rule__NetworkConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3085:1: ( ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) )
            // InternalIotlang.g:3086:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            {
            // InternalIotlang.g:3086:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            // InternalIotlang.g:3087:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNameAssignment_1()); 
            // InternalIotlang.g:3088:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            // InternalIotlang.g:3088:3: rule__NetworkConfiguration__NameAssignment_1
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
    // InternalIotlang.g:3096:1: rule__NetworkConfiguration__Group__2 : rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 ;
    public final void rule__NetworkConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3100:1: ( rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 )
            // InternalIotlang.g:3101:2: rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3
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
    // InternalIotlang.g:3108:1: rule__NetworkConfiguration__Group__2__Impl : ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) ;
    public final void rule__NetworkConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3112:1: ( ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:3113:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:3113:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:3114:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:3115:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ANNOTATION_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIotlang.g:3115:3: rule__NetworkConfiguration__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NetworkConfiguration__AnnotationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalIotlang.g:3123:1: rule__NetworkConfiguration__Group__3 : rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 ;
    public final void rule__NetworkConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3127:1: ( rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 )
            // InternalIotlang.g:3128:2: rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4
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
    // InternalIotlang.g:3135:1: rule__NetworkConfiguration__Group__3__Impl : ( '{' ) ;
    public final void rule__NetworkConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3139:1: ( ( '{' ) )
            // InternalIotlang.g:3140:1: ( '{' )
            {
            // InternalIotlang.g:3140:1: ( '{' )
            // InternalIotlang.g:3141:2: '{'
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
    // InternalIotlang.g:3150:1: rule__NetworkConfiguration__Group__4 : rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 ;
    public final void rule__NetworkConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3154:1: ( rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 )
            // InternalIotlang.g:3155:2: rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5
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
    // InternalIotlang.g:3162:1: rule__NetworkConfiguration__Group__4__Impl : ( ( rule__NetworkConfiguration__Alternatives_4 )* ) ;
    public final void rule__NetworkConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3166:1: ( ( ( rule__NetworkConfiguration__Alternatives_4 )* ) )
            // InternalIotlang.g:3167:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            {
            // InternalIotlang.g:3167:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            // InternalIotlang.g:3168:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAlternatives_4()); 
            // InternalIotlang.g:3169:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=36 && LA23_0<=37)||LA23_0==40||(LA23_0>=42 && LA23_0<=43)||(LA23_0>=45 && LA23_0<=46)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalIotlang.g:3169:3: rule__NetworkConfiguration__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__NetworkConfiguration__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalIotlang.g:3177:1: rule__NetworkConfiguration__Group__5 : rule__NetworkConfiguration__Group__5__Impl ;
    public final void rule__NetworkConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3181:1: ( rule__NetworkConfiguration__Group__5__Impl )
            // InternalIotlang.g:3182:2: rule__NetworkConfiguration__Group__5__Impl
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
    // InternalIotlang.g:3188:1: rule__NetworkConfiguration__Group__5__Impl : ( '}' ) ;
    public final void rule__NetworkConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3192:1: ( ( '}' ) )
            // InternalIotlang.g:3193:1: ( '}' )
            {
            // InternalIotlang.g:3193:1: ( '}' )
            // InternalIotlang.g:3194:2: '}'
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


    // $ANTLR start "rule__NetworkConfiguration__Group_4_4__0"
    // InternalIotlang.g:3204:1: rule__NetworkConfiguration__Group_4_4__0 : rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1 ;
    public final void rule__NetworkConfiguration__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3208:1: ( rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1 )
            // InternalIotlang.g:3209:2: rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1
            {
            pushFollow(FOLLOW_5);
            rule__NetworkConfiguration__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group_4_4__1();

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
    // $ANTLR end "rule__NetworkConfiguration__Group_4_4__0"


    // $ANTLR start "rule__NetworkConfiguration__Group_4_4__0__Impl"
    // InternalIotlang.g:3216:1: rule__NetworkConfiguration__Group_4_4__0__Impl : ( 'enforce' ) ;
    public final void rule__NetworkConfiguration__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3220:1: ( ( 'enforce' ) )
            // InternalIotlang.g:3221:1: ( 'enforce' )
            {
            // InternalIotlang.g:3221:1: ( 'enforce' )
            // InternalIotlang.g:3222:2: 'enforce'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_4_0()); 

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
    // $ANTLR end "rule__NetworkConfiguration__Group_4_4__0__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group_4_4__1"
    // InternalIotlang.g:3231:1: rule__NetworkConfiguration__Group_4_4__1 : rule__NetworkConfiguration__Group_4_4__1__Impl ;
    public final void rule__NetworkConfiguration__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3235:1: ( rule__NetworkConfiguration__Group_4_4__1__Impl )
            // InternalIotlang.g:3236:2: rule__NetworkConfiguration__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__Group_4_4__1__Impl();

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
    // $ANTLR end "rule__NetworkConfiguration__Group_4_4__1"


    // $ANTLR start "rule__NetworkConfiguration__Group_4_4__1__Impl"
    // InternalIotlang.g:3242:1: rule__NetworkConfiguration__Group_4_4__1__Impl : ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) ) ;
    public final void rule__NetworkConfiguration__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3246:1: ( ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) ) )
            // InternalIotlang.g:3247:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) )
            {
            // InternalIotlang.g:3247:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) )
            // InternalIotlang.g:3248:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesAssignment_4_4_1()); 
            // InternalIotlang.g:3249:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 )
            // InternalIotlang.g:3249:3: rule__NetworkConfiguration__EnforcesAssignment_4_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConfiguration__EnforcesAssignment_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConfigurationAccess().getEnforcesAssignment_4_4_1()); 

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
    // $ANTLR end "rule__NetworkConfiguration__Group_4_4__1__Impl"


    // $ANTLR start "rule__Bind__Group__0"
    // InternalIotlang.g:3258:1: rule__Bind__Group__0 : rule__Bind__Group__0__Impl rule__Bind__Group__1 ;
    public final void rule__Bind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3262:1: ( rule__Bind__Group__0__Impl rule__Bind__Group__1 )
            // InternalIotlang.g:3263:2: rule__Bind__Group__0__Impl rule__Bind__Group__1
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
    // InternalIotlang.g:3270:1: rule__Bind__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Bind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3274:1: ( ( 'bind' ) )
            // InternalIotlang.g:3275:1: ( 'bind' )
            {
            // InternalIotlang.g:3275:1: ( 'bind' )
            // InternalIotlang.g:3276:2: 'bind'
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
    // InternalIotlang.g:3285:1: rule__Bind__Group__1 : rule__Bind__Group__1__Impl rule__Bind__Group__2 ;
    public final void rule__Bind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3289:1: ( rule__Bind__Group__1__Impl rule__Bind__Group__2 )
            // InternalIotlang.g:3290:2: rule__Bind__Group__1__Impl rule__Bind__Group__2
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
    // InternalIotlang.g:3297:1: rule__Bind__Group__1__Impl : ( ( rule__Bind__NameAssignment_1 )? ) ;
    public final void rule__Bind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3301:1: ( ( ( rule__Bind__NameAssignment_1 )? ) )
            // InternalIotlang.g:3302:1: ( ( rule__Bind__NameAssignment_1 )? )
            {
            // InternalIotlang.g:3302:1: ( ( rule__Bind__NameAssignment_1 )? )
            // InternalIotlang.g:3303:2: ( rule__Bind__NameAssignment_1 )?
            {
             before(grammarAccess.getBindAccess().getNameAssignment_1()); 
            // InternalIotlang.g:3304:2: ( rule__Bind__NameAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_ID) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalIotlang.g:3304:3: rule__Bind__NameAssignment_1
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
    // InternalIotlang.g:3312:1: rule__Bind__Group__2 : rule__Bind__Group__2__Impl rule__Bind__Group__3 ;
    public final void rule__Bind__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3316:1: ( rule__Bind__Group__2__Impl rule__Bind__Group__3 )
            // InternalIotlang.g:3317:2: rule__Bind__Group__2__Impl rule__Bind__Group__3
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
    // InternalIotlang.g:3324:1: rule__Bind__Group__2__Impl : ( ( rule__Bind__ThingInstanceAssignment_2 ) ) ;
    public final void rule__Bind__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3328:1: ( ( ( rule__Bind__ThingInstanceAssignment_2 ) ) )
            // InternalIotlang.g:3329:1: ( ( rule__Bind__ThingInstanceAssignment_2 ) )
            {
            // InternalIotlang.g:3329:1: ( ( rule__Bind__ThingInstanceAssignment_2 ) )
            // InternalIotlang.g:3330:2: ( rule__Bind__ThingInstanceAssignment_2 )
            {
             before(grammarAccess.getBindAccess().getThingInstanceAssignment_2()); 
            // InternalIotlang.g:3331:2: ( rule__Bind__ThingInstanceAssignment_2 )
            // InternalIotlang.g:3331:3: rule__Bind__ThingInstanceAssignment_2
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
    // InternalIotlang.g:3339:1: rule__Bind__Group__3 : rule__Bind__Group__3__Impl rule__Bind__Group__4 ;
    public final void rule__Bind__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3343:1: ( rule__Bind__Group__3__Impl rule__Bind__Group__4 )
            // InternalIotlang.g:3344:2: rule__Bind__Group__3__Impl rule__Bind__Group__4
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
    // InternalIotlang.g:3351:1: rule__Bind__Group__3__Impl : ( ( rule__Bind__DirectionAssignment_3 ) ) ;
    public final void rule__Bind__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3355:1: ( ( ( rule__Bind__DirectionAssignment_3 ) ) )
            // InternalIotlang.g:3356:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            {
            // InternalIotlang.g:3356:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            // InternalIotlang.g:3357:2: ( rule__Bind__DirectionAssignment_3 )
            {
             before(grammarAccess.getBindAccess().getDirectionAssignment_3()); 
            // InternalIotlang.g:3358:2: ( rule__Bind__DirectionAssignment_3 )
            // InternalIotlang.g:3358:3: rule__Bind__DirectionAssignment_3
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
    // InternalIotlang.g:3366:1: rule__Bind__Group__4 : rule__Bind__Group__4__Impl rule__Bind__Group__5 ;
    public final void rule__Bind__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3370:1: ( rule__Bind__Group__4__Impl rule__Bind__Group__5 )
            // InternalIotlang.g:3371:2: rule__Bind__Group__4__Impl rule__Bind__Group__5
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
    // InternalIotlang.g:3378:1: rule__Bind__Group__4__Impl : ( ( rule__Bind__PubSubInstanceAssignment_4 ) ) ;
    public final void rule__Bind__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3382:1: ( ( ( rule__Bind__PubSubInstanceAssignment_4 ) ) )
            // InternalIotlang.g:3383:1: ( ( rule__Bind__PubSubInstanceAssignment_4 ) )
            {
            // InternalIotlang.g:3383:1: ( ( rule__Bind__PubSubInstanceAssignment_4 ) )
            // InternalIotlang.g:3384:2: ( rule__Bind__PubSubInstanceAssignment_4 )
            {
             before(grammarAccess.getBindAccess().getPubSubInstanceAssignment_4()); 
            // InternalIotlang.g:3385:2: ( rule__Bind__PubSubInstanceAssignment_4 )
            // InternalIotlang.g:3385:3: rule__Bind__PubSubInstanceAssignment_4
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
    // InternalIotlang.g:3393:1: rule__Bind__Group__5 : rule__Bind__Group__5__Impl rule__Bind__Group__6 ;
    public final void rule__Bind__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3397:1: ( rule__Bind__Group__5__Impl rule__Bind__Group__6 )
            // InternalIotlang.g:3398:2: rule__Bind__Group__5__Impl rule__Bind__Group__6
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
    // InternalIotlang.g:3405:1: rule__Bind__Group__5__Impl : ( '{' ) ;
    public final void rule__Bind__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3409:1: ( ( '{' ) )
            // InternalIotlang.g:3410:1: ( '{' )
            {
            // InternalIotlang.g:3410:1: ( '{' )
            // InternalIotlang.g:3411:2: '{'
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
    // InternalIotlang.g:3420:1: rule__Bind__Group__6 : rule__Bind__Group__6__Impl rule__Bind__Group__7 ;
    public final void rule__Bind__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3424:1: ( rule__Bind__Group__6__Impl rule__Bind__Group__7 )
            // InternalIotlang.g:3425:2: rule__Bind__Group__6__Impl rule__Bind__Group__7
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
    // InternalIotlang.g:3432:1: rule__Bind__Group__6__Impl : ( ( rule__Bind__TopicsAssignment_6 ) ) ;
    public final void rule__Bind__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3436:1: ( ( ( rule__Bind__TopicsAssignment_6 ) ) )
            // InternalIotlang.g:3437:1: ( ( rule__Bind__TopicsAssignment_6 ) )
            {
            // InternalIotlang.g:3437:1: ( ( rule__Bind__TopicsAssignment_6 ) )
            // InternalIotlang.g:3438:2: ( rule__Bind__TopicsAssignment_6 )
            {
             before(grammarAccess.getBindAccess().getTopicsAssignment_6()); 
            // InternalIotlang.g:3439:2: ( rule__Bind__TopicsAssignment_6 )
            // InternalIotlang.g:3439:3: rule__Bind__TopicsAssignment_6
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
    // InternalIotlang.g:3447:1: rule__Bind__Group__7 : rule__Bind__Group__7__Impl rule__Bind__Group__8 ;
    public final void rule__Bind__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3451:1: ( rule__Bind__Group__7__Impl rule__Bind__Group__8 )
            // InternalIotlang.g:3452:2: rule__Bind__Group__7__Impl rule__Bind__Group__8
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
    // InternalIotlang.g:3459:1: rule__Bind__Group__7__Impl : ( ( rule__Bind__Group_7__0 )* ) ;
    public final void rule__Bind__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3463:1: ( ( ( rule__Bind__Group_7__0 )* ) )
            // InternalIotlang.g:3464:1: ( ( rule__Bind__Group_7__0 )* )
            {
            // InternalIotlang.g:3464:1: ( ( rule__Bind__Group_7__0 )* )
            // InternalIotlang.g:3465:2: ( rule__Bind__Group_7__0 )*
            {
             before(grammarAccess.getBindAccess().getGroup_7()); 
            // InternalIotlang.g:3466:2: ( rule__Bind__Group_7__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==47) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalIotlang.g:3466:3: rule__Bind__Group_7__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Bind__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalIotlang.g:3474:1: rule__Bind__Group__8 : rule__Bind__Group__8__Impl rule__Bind__Group__9 ;
    public final void rule__Bind__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3478:1: ( rule__Bind__Group__8__Impl rule__Bind__Group__9 )
            // InternalIotlang.g:3479:2: rule__Bind__Group__8__Impl rule__Bind__Group__9
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
    // InternalIotlang.g:3486:1: rule__Bind__Group__8__Impl : ( '}' ) ;
    public final void rule__Bind__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3490:1: ( ( '}' ) )
            // InternalIotlang.g:3491:1: ( '}' )
            {
            // InternalIotlang.g:3491:1: ( '}' )
            // InternalIotlang.g:3492:2: '}'
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
    // InternalIotlang.g:3501:1: rule__Bind__Group__9 : rule__Bind__Group__9__Impl ;
    public final void rule__Bind__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3505:1: ( rule__Bind__Group__9__Impl )
            // InternalIotlang.g:3506:2: rule__Bind__Group__9__Impl
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
    // InternalIotlang.g:3512:1: rule__Bind__Group__9__Impl : ( ( rule__Bind__AnnotationsAssignment_9 )* ) ;
    public final void rule__Bind__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3516:1: ( ( ( rule__Bind__AnnotationsAssignment_9 )* ) )
            // InternalIotlang.g:3517:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            {
            // InternalIotlang.g:3517:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            // InternalIotlang.g:3518:2: ( rule__Bind__AnnotationsAssignment_9 )*
            {
             before(grammarAccess.getBindAccess().getAnnotationsAssignment_9()); 
            // InternalIotlang.g:3519:2: ( rule__Bind__AnnotationsAssignment_9 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ANNOTATION_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalIotlang.g:3519:3: rule__Bind__AnnotationsAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Bind__AnnotationsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalIotlang.g:3528:1: rule__Bind__Group_7__0 : rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 ;
    public final void rule__Bind__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3532:1: ( rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 )
            // InternalIotlang.g:3533:2: rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1
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
    // InternalIotlang.g:3540:1: rule__Bind__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Bind__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3544:1: ( ( ',' ) )
            // InternalIotlang.g:3545:1: ( ',' )
            {
            // InternalIotlang.g:3545:1: ( ',' )
            // InternalIotlang.g:3546:2: ','
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
    // InternalIotlang.g:3555:1: rule__Bind__Group_7__1 : rule__Bind__Group_7__1__Impl ;
    public final void rule__Bind__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3559:1: ( rule__Bind__Group_7__1__Impl )
            // InternalIotlang.g:3560:2: rule__Bind__Group_7__1__Impl
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
    // InternalIotlang.g:3566:1: rule__Bind__Group_7__1__Impl : ( ( rule__Bind__TopicsAssignment_7_1 ) ) ;
    public final void rule__Bind__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3570:1: ( ( ( rule__Bind__TopicsAssignment_7_1 ) ) )
            // InternalIotlang.g:3571:1: ( ( rule__Bind__TopicsAssignment_7_1 ) )
            {
            // InternalIotlang.g:3571:1: ( ( rule__Bind__TopicsAssignment_7_1 ) )
            // InternalIotlang.g:3572:2: ( rule__Bind__TopicsAssignment_7_1 )
            {
             before(grammarAccess.getBindAccess().getTopicsAssignment_7_1()); 
            // InternalIotlang.g:3573:2: ( rule__Bind__TopicsAssignment_7_1 )
            // InternalIotlang.g:3573:3: rule__Bind__TopicsAssignment_7_1
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


    // $ANTLR start "rule__IoTLangModel__ThingsAssignment_0"
    // InternalIotlang.g:3582:1: rule__IoTLangModel__ThingsAssignment_0 : ( ruleThing ) ;
    public final void rule__IoTLangModel__ThingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3586:1: ( ( ruleThing ) )
            // InternalIotlang.g:3587:2: ( ruleThing )
            {
            // InternalIotlang.g:3587:2: ( ruleThing )
            // InternalIotlang.g:3588:3: ruleThing
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
    // InternalIotlang.g:3597:1: rule__IoTLangModel__PoliciesAssignment_1 : ( rulePolicy ) ;
    public final void rule__IoTLangModel__PoliciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3601:1: ( ( rulePolicy ) )
            // InternalIotlang.g:3602:2: ( rulePolicy )
            {
            // InternalIotlang.g:3602:2: ( rulePolicy )
            // InternalIotlang.g:3603:3: rulePolicy
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
    // InternalIotlang.g:3612:1: rule__IoTLangModel__MessagesAssignment_2 : ( ruleMessage ) ;
    public final void rule__IoTLangModel__MessagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3616:1: ( ( ruleMessage ) )
            // InternalIotlang.g:3617:2: ( ruleMessage )
            {
            // InternalIotlang.g:3617:2: ( ruleMessage )
            // InternalIotlang.g:3618:3: ruleMessage
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
    // InternalIotlang.g:3627:1: rule__IoTLangModel__ChannelsAssignment_3 : ( ruleChannel ) ;
    public final void rule__IoTLangModel__ChannelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3631:1: ( ( ruleChannel ) )
            // InternalIotlang.g:3632:2: ( ruleChannel )
            {
            // InternalIotlang.g:3632:2: ( ruleChannel )
            // InternalIotlang.g:3633:3: ruleChannel
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
    // InternalIotlang.g:3642:1: rule__IoTLangModel__ProtocolsAssignment_4 : ( ruleProtocol ) ;
    public final void rule__IoTLangModel__ProtocolsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3646:1: ( ( ruleProtocol ) )
            // InternalIotlang.g:3647:2: ( ruleProtocol )
            {
            // InternalIotlang.g:3647:2: ( ruleProtocol )
            // InternalIotlang.g:3648:3: ruleProtocol
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
    // InternalIotlang.g:3657:1: rule__IoTLangModel__ConfigsAssignment_5 : ( ruleNetworkConfiguration ) ;
    public final void rule__IoTLangModel__ConfigsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3661:1: ( ( ruleNetworkConfiguration ) )
            // InternalIotlang.g:3662:2: ( ruleNetworkConfiguration )
            {
            // InternalIotlang.g:3662:2: ( ruleNetworkConfiguration )
            // InternalIotlang.g:3663:3: ruleNetworkConfiguration
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
    // InternalIotlang.g:3672:1: rule__PlatformAnnotation__NameAssignment_0 : ( RULE_ANNOTATION_ID ) ;
    public final void rule__PlatformAnnotation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3676:1: ( ( RULE_ANNOTATION_ID ) )
            // InternalIotlang.g:3677:2: ( RULE_ANNOTATION_ID )
            {
            // InternalIotlang.g:3677:2: ( RULE_ANNOTATION_ID )
            // InternalIotlang.g:3678:3: RULE_ANNOTATION_ID
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
    // InternalIotlang.g:3687:1: rule__PlatformAnnotation__ValueAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__PlatformAnnotation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3691:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:3692:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:3692:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:3693:3: RULE_STRING_LIT
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
    // InternalIotlang.g:3702:1: rule__Thing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Thing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3706:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3707:2: ( RULE_ID )
            {
            // InternalIotlang.g:3707:2: ( RULE_ID )
            // InternalIotlang.g:3708:3: RULE_ID
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
    // InternalIotlang.g:3717:1: rule__Thing__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__Thing__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3721:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3722:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3722:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3723:3: rulePlatformAnnotation
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
    // InternalIotlang.g:3732:1: rule__Thing__PortsAssignment_4 : ( rulePort ) ;
    public final void rule__Thing__PortsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3736:1: ( ( rulePort ) )
            // InternalIotlang.g:3737:2: ( rulePort )
            {
            // InternalIotlang.g:3737:2: ( rulePort )
            // InternalIotlang.g:3738:3: rulePort
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
    // InternalIotlang.g:3747:1: rule__Channel__PubSubAssignment_0 : ( rulePubSub ) ;
    public final void rule__Channel__PubSubAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3751:1: ( ( rulePubSub ) )
            // InternalIotlang.g:3752:2: ( rulePubSub )
            {
            // InternalIotlang.g:3752:2: ( rulePubSub )
            // InternalIotlang.g:3753:3: rulePubSub
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
    // InternalIotlang.g:3762:1: rule__Channel__PointToPointAssignment_1 : ( rulePointToPoint ) ;
    public final void rule__Channel__PointToPointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3766:1: ( ( rulePointToPoint ) )
            // InternalIotlang.g:3767:2: ( rulePointToPoint )
            {
            // InternalIotlang.g:3767:2: ( rulePointToPoint )
            // InternalIotlang.g:3768:3: rulePointToPoint
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
    // InternalIotlang.g:3777:1: rule__PubSub__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PubSub__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3781:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3782:2: ( RULE_ID )
            {
            // InternalIotlang.g:3782:2: ( RULE_ID )
            // InternalIotlang.g:3783:3: RULE_ID
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
    // InternalIotlang.g:3792:1: rule__PubSub__HasTopicsAssignment_3 : ( ruleTopic ) ;
    public final void rule__PubSub__HasTopicsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3796:1: ( ( ruleTopic ) )
            // InternalIotlang.g:3797:2: ( ruleTopic )
            {
            // InternalIotlang.g:3797:2: ( ruleTopic )
            // InternalIotlang.g:3798:3: ruleTopic
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
    // InternalIotlang.g:3807:1: rule__PointToPoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PointToPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3811:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3812:2: ( RULE_ID )
            {
            // InternalIotlang.g:3812:2: ( RULE_ID )
            // InternalIotlang.g:3813:3: RULE_ID
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
    // InternalIotlang.g:3822:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3826:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3827:2: ( RULE_ID )
            {
            // InternalIotlang.g:3827:2: ( RULE_ID )
            // InternalIotlang.g:3828:3: RULE_ID
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
    // InternalIotlang.g:3837:1: rule__Policy__HasRulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Policy__HasRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3841:1: ( ( ruleRule ) )
            // InternalIotlang.g:3842:2: ( ruleRule )
            {
            // InternalIotlang.g:3842:2: ( ruleRule )
            // InternalIotlang.g:3843:3: ruleRule
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
    // InternalIotlang.g:3852:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3856:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3857:2: ( RULE_ID )
            {
            // InternalIotlang.g:3857:2: ( RULE_ID )
            // InternalIotlang.g:3858:3: RULE_ID
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
    // InternalIotlang.g:3867:1: rule__Protocol__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Protocol__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3871:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3872:2: ( RULE_ID )
            {
            // InternalIotlang.g:3872:2: ( RULE_ID )
            // InternalIotlang.g:3873:3: RULE_ID
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
    // InternalIotlang.g:3882:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3886:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3887:2: ( RULE_ID )
            {
            // InternalIotlang.g:3887:2: ( RULE_ID )
            // InternalIotlang.g:3888:3: RULE_ID
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
    // InternalIotlang.g:3897:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3901:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3902:2: ( RULE_ID )
            {
            // InternalIotlang.g:3902:2: ( RULE_ID )
            // InternalIotlang.g:3903:3: RULE_ID
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
    // InternalIotlang.g:3912:1: rule__Topic__AcceptedMessagesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Topic__AcceptedMessagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3916:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3917:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3917:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3918:3: ( RULE_ID )
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesMessageCrossReference_3_0()); 
            // InternalIotlang.g:3919:3: ( RULE_ID )
            // InternalIotlang.g:3920:4: RULE_ID
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
    // InternalIotlang.g:3931:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3935:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3936:2: ( RULE_ID )
            {
            // InternalIotlang.g:3936:2: ( RULE_ID )
            // InternalIotlang.g:3937:3: RULE_ID
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
    // InternalIotlang.g:3946:1: rule__Rule__SubjectAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__SubjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3950:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3951:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3951:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3952:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getSubjectThingCrossReference_2_0()); 
            // InternalIotlang.g:3953:3: ( RULE_ID )
            // InternalIotlang.g:3954:4: RULE_ID
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
    // InternalIotlang.g:3965:1: rule__Rule__PermissionAssignment_3 : ( ( rule__Rule__PermissionAlternatives_3_0 ) ) ;
    public final void rule__Rule__PermissionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3969:1: ( ( ( rule__Rule__PermissionAlternatives_3_0 ) ) )
            // InternalIotlang.g:3970:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:3970:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            // InternalIotlang.g:3971:3: ( rule__Rule__PermissionAlternatives_3_0 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAlternatives_3_0()); 
            // InternalIotlang.g:3972:3: ( rule__Rule__PermissionAlternatives_3_0 )
            // InternalIotlang.g:3972:4: rule__Rule__PermissionAlternatives_3_0
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
    // InternalIotlang.g:3980:1: rule__Rule__ActionAssignment_5 : ( ( rule__Rule__ActionAlternatives_5_0 ) ) ;
    public final void rule__Rule__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3984:1: ( ( ( rule__Rule__ActionAlternatives_5_0 ) ) )
            // InternalIotlang.g:3985:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            {
            // InternalIotlang.g:3985:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            // InternalIotlang.g:3986:3: ( rule__Rule__ActionAlternatives_5_0 )
            {
             before(grammarAccess.getRuleAccess().getActionAlternatives_5_0()); 
            // InternalIotlang.g:3987:3: ( rule__Rule__ActionAlternatives_5_0 )
            // InternalIotlang.g:3987:4: rule__Rule__ActionAlternatives_5_0
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
    // InternalIotlang.g:3995:1: rule__Rule__ObjectAssignment_6_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__ObjectAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3999:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4000:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4000:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4001:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getObjectThingCrossReference_6_0_0_0()); 
            // InternalIotlang.g:4002:3: ( RULE_ID )
            // InternalIotlang.g:4003:4: RULE_ID
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
    // InternalIotlang.g:4014:1: rule__Rule__PortsAssignment_6_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__PortsAssignment_6_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4018:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4019:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4019:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4020:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getPortsPortCrossReference_6_0_1_1_0()); 
            // InternalIotlang.g:4021:3: ( RULE_ID )
            // InternalIotlang.g:4022:4: RULE_ID
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
    // InternalIotlang.g:4033:1: rule__Rule__ObjectMessageAssignment_6_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__ObjectMessageAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4037:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4038:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4038:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4039:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getObjectMessageMessageCrossReference_6_1_1_0()); 
            // InternalIotlang.g:4040:3: ( RULE_ID )
            // InternalIotlang.g:4041:4: RULE_ID
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
    // InternalIotlang.g:4052:1: rule__Domain__NameAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4056:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:4057:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:4057:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:4058:3: RULE_STRING_LIT
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
    // InternalIotlang.g:4067:1: rule__InstanceThing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstanceThing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4071:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4072:2: ( RULE_ID )
            {
            // InternalIotlang.g:4072:2: ( RULE_ID )
            // InternalIotlang.g:4073:3: RULE_ID
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
    // InternalIotlang.g:4082:1: rule__InstanceThing__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstanceThing__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4086:1: ( ( RULE_INT ) )
            // InternalIotlang.g:4087:2: ( RULE_INT )
            {
            // InternalIotlang.g:4087:2: ( RULE_INT )
            // InternalIotlang.g:4088:3: RULE_INT
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
    // InternalIotlang.g:4097:1: rule__InstanceThing__TypeThingAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceThing__TypeThingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4101:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4102:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4102:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4103:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingThingCrossReference_4_0()); 
            // InternalIotlang.g:4104:3: ( RULE_ID )
            // InternalIotlang.g:4105:4: RULE_ID
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
    // InternalIotlang.g:4116:1: rule__InstanceThing__AnnotationsAssignment_5 : ( rulePlatformAnnotation ) ;
    public final void rule__InstanceThing__AnnotationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4120:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4121:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4121:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4122:3: rulePlatformAnnotation
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
    // InternalIotlang.g:4131:1: rule__InstancePubSub__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstancePubSub__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4135:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4136:2: ( RULE_ID )
            {
            // InternalIotlang.g:4136:2: ( RULE_ID )
            // InternalIotlang.g:4137:3: RULE_ID
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
    // InternalIotlang.g:4146:1: rule__InstancePubSub__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstancePubSub__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4150:1: ( ( RULE_INT ) )
            // InternalIotlang.g:4151:2: ( RULE_INT )
            {
            // InternalIotlang.g:4151:2: ( RULE_INT )
            // InternalIotlang.g:4152:3: RULE_INT
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
    // InternalIotlang.g:4161:1: rule__InstancePubSub__TypeChannelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePubSub__TypeChannelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4165:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4166:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4166:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4167:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePubSubAccess().getTypeChannelPubSubCrossReference_4_0()); 
            // InternalIotlang.g:4168:3: ( RULE_ID )
            // InternalIotlang.g:4169:4: RULE_ID
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
    // InternalIotlang.g:4180:1: rule__InstancePubSub__OverProtocolAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePubSub__OverProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4184:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4185:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4185:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4186:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePubSubAccess().getOverProtocolProtocolCrossReference_6_0()); 
            // InternalIotlang.g:4187:3: ( RULE_ID )
            // InternalIotlang.g:4188:4: RULE_ID
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
    // InternalIotlang.g:4199:1: rule__InstancePubSub__AnnotationsAssignment_7 : ( rulePlatformAnnotation ) ;
    public final void rule__InstancePubSub__AnnotationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4203:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4204:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4204:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4205:3: rulePlatformAnnotation
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
    // InternalIotlang.g:4214:1: rule__InstancePtP__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstancePtP__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4218:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4219:2: ( RULE_ID )
            {
            // InternalIotlang.g:4219:2: ( RULE_ID )
            // InternalIotlang.g:4220:3: RULE_ID
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
    // InternalIotlang.g:4229:1: rule__InstancePtP__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstancePtP__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4233:1: ( ( RULE_INT ) )
            // InternalIotlang.g:4234:2: ( RULE_INT )
            {
            // InternalIotlang.g:4234:2: ( RULE_INT )
            // InternalIotlang.g:4235:3: RULE_INT
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
    // InternalIotlang.g:4244:1: rule__InstancePtP__TypeChannelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePtP__TypeChannelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4248:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4249:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4249:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4250:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePtPAccess().getTypeChannelPointToPointCrossReference_4_0()); 
            // InternalIotlang.g:4251:3: ( RULE_ID )
            // InternalIotlang.g:4252:4: RULE_ID
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
    // InternalIotlang.g:4263:1: rule__InstancePtP__OverProtocolAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePtP__OverProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4267:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4268:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4268:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4269:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePtPAccess().getOverProtocolProtocolCrossReference_6_0()); 
            // InternalIotlang.g:4270:3: ( RULE_ID )
            // InternalIotlang.g:4271:4: RULE_ID
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
    // InternalIotlang.g:4282:1: rule__InstancePtP__AnnotationsAssignment_7 : ( rulePlatformAnnotation ) ;
    public final void rule__InstancePtP__AnnotationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4286:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4287:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4287:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4288:3: rulePlatformAnnotation
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
    // InternalIotlang.g:4297:1: rule__InstanceChannel__InstancesPubSubAssignment_0 : ( ruleInstancePubSub ) ;
    public final void rule__InstanceChannel__InstancesPubSubAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4301:1: ( ( ruleInstancePubSub ) )
            // InternalIotlang.g:4302:2: ( ruleInstancePubSub )
            {
            // InternalIotlang.g:4302:2: ( ruleInstancePubSub )
            // InternalIotlang.g:4303:3: ruleInstancePubSub
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
    // InternalIotlang.g:4312:1: rule__InstanceChannel__InstancesPtpAssignment_1 : ( ruleInstancePtP ) ;
    public final void rule__InstanceChannel__InstancesPtpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4316:1: ( ( ruleInstancePtP ) )
            // InternalIotlang.g:4317:2: ( ruleInstancePtP )
            {
            // InternalIotlang.g:4317:2: ( ruleInstancePtP )
            // InternalIotlang.g:4318:3: ruleInstancePtP
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
    // InternalIotlang.g:4327:1: rule__InstancePolicy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstancePolicy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4331:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4332:2: ( RULE_ID )
            {
            // InternalIotlang.g:4332:2: ( RULE_ID )
            // InternalIotlang.g:4333:3: RULE_ID
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
    // InternalIotlang.g:4342:1: rule__InstancePolicy__TypePolicyAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePolicy__TypePolicyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4346:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4347:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4347:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4348:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0()); 
            // InternalIotlang.g:4349:3: ( RULE_ID )
            // InternalIotlang.g:4350:4: RULE_ID
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
    // InternalIotlang.g:4361:1: rule__InstancePolicy__AnnotationsAssignment_4 : ( rulePlatformAnnotation ) ;
    public final void rule__InstancePolicy__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4365:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4366:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4366:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4367:3: rulePlatformAnnotation
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
    // InternalIotlang.g:4376:1: rule__NetworkConfiguration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NetworkConfiguration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4380:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4381:2: ( RULE_ID )
            {
            // InternalIotlang.g:4381:2: ( RULE_ID )
            // InternalIotlang.g:4382:3: RULE_ID
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
    // InternalIotlang.g:4391:1: rule__NetworkConfiguration__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__NetworkConfiguration__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4395:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4396:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4396:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4397:3: rulePlatformAnnotation
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


    // $ANTLR start "rule__NetworkConfiguration__DomainAssignment_4_0"
    // InternalIotlang.g:4406:1: rule__NetworkConfiguration__DomainAssignment_4_0 : ( ruleDomain ) ;
    public final void rule__NetworkConfiguration__DomainAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4410:1: ( ( ruleDomain ) )
            // InternalIotlang.g:4411:2: ( ruleDomain )
            {
            // InternalIotlang.g:4411:2: ( ruleDomain )
            // InternalIotlang.g:4412:3: ruleDomain
            {
             before(grammarAccess.getNetworkConfigurationAccess().getDomainDomainParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getDomainDomainParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__NetworkConfiguration__DomainAssignment_4_0"


    // $ANTLR start "rule__NetworkConfiguration__BindsAssignment_4_1"
    // InternalIotlang.g:4421:1: rule__NetworkConfiguration__BindsAssignment_4_1 : ( ruleBind ) ;
    public final void rule__NetworkConfiguration__BindsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4425:1: ( ( ruleBind ) )
            // InternalIotlang.g:4426:2: ( ruleBind )
            {
            // InternalIotlang.g:4426:2: ( ruleBind )
            // InternalIotlang.g:4427:3: ruleBind
            {
             before(grammarAccess.getNetworkConfigurationAccess().getBindsBindParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBind();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getBindsBindParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__NetworkConfiguration__BindsAssignment_4_1"


    // $ANTLR start "rule__NetworkConfiguration__ThingInstancesAssignment_4_2"
    // InternalIotlang.g:4436:1: rule__NetworkConfiguration__ThingInstancesAssignment_4_2 : ( ruleInstanceThing ) ;
    public final void rule__NetworkConfiguration__ThingInstancesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4440:1: ( ( ruleInstanceThing ) )
            // InternalIotlang.g:4441:2: ( ruleInstanceThing )
            {
            // InternalIotlang.g:4441:2: ( ruleInstanceThing )
            // InternalIotlang.g:4442:3: ruleInstanceThing
            {
             before(grammarAccess.getNetworkConfigurationAccess().getThingInstancesInstanceThingParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceThing();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getThingInstancesInstanceThingParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__NetworkConfiguration__ThingInstancesAssignment_4_2"


    // $ANTLR start "rule__NetworkConfiguration__ChannelInstancesAssignment_4_3"
    // InternalIotlang.g:4451:1: rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 : ( ruleInstanceChannel ) ;
    public final void rule__NetworkConfiguration__ChannelInstancesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4455:1: ( ( ruleInstanceChannel ) )
            // InternalIotlang.g:4456:2: ( ruleInstanceChannel )
            {
            // InternalIotlang.g:4456:2: ( ruleInstanceChannel )
            // InternalIotlang.g:4457:3: ruleInstanceChannel
            {
             before(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesInstanceChannelParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceChannel();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesInstanceChannelParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__NetworkConfiguration__ChannelInstancesAssignment_4_3"


    // $ANTLR start "rule__NetworkConfiguration__EnforcesAssignment_4_4_1"
    // InternalIotlang.g:4466:1: rule__NetworkConfiguration__EnforcesAssignment_4_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__NetworkConfiguration__EnforcesAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4470:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4471:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4471:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4472:3: ( RULE_ID )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_4_1_0()); 
            // InternalIotlang.g:4473:3: ( RULE_ID )
            // InternalIotlang.g:4474:4: RULE_ID
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyIDTerminalRuleCall_4_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyIDTerminalRuleCall_4_4_1_0_1()); 

            }

             after(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_4_1_0()); 

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
    // $ANTLR end "rule__NetworkConfiguration__EnforcesAssignment_4_4_1"


    // $ANTLR start "rule__NetworkConfiguration__InstancePoliciyAssignment_4_5"
    // InternalIotlang.g:4485:1: rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 : ( ruleInstancePolicy ) ;
    public final void rule__NetworkConfiguration__InstancePoliciyAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4489:1: ( ( ruleInstancePolicy ) )
            // InternalIotlang.g:4490:2: ( ruleInstancePolicy )
            {
            // InternalIotlang.g:4490:2: ( ruleInstancePolicy )
            // InternalIotlang.g:4491:3: ruleInstancePolicy
            {
             before(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyInstancePolicyParserRuleCall_4_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInstancePolicy();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyInstancePolicyParserRuleCall_4_5_0()); 

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
    // $ANTLR end "rule__NetworkConfiguration__InstancePoliciyAssignment_4_5"


    // $ANTLR start "rule__Bind__NameAssignment_1"
    // InternalIotlang.g:4500:1: rule__Bind__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4504:1: ( ( RULE_ID ) )
            // InternalIotlang.g:4505:2: ( RULE_ID )
            {
            // InternalIotlang.g:4505:2: ( RULE_ID )
            // InternalIotlang.g:4506:3: RULE_ID
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
    // InternalIotlang.g:4515:1: rule__Bind__ThingInstanceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__ThingInstanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4519:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4520:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4520:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4521:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getThingInstanceInstanceThingCrossReference_2_0()); 
            // InternalIotlang.g:4522:3: ( RULE_ID )
            // InternalIotlang.g:4523:4: RULE_ID
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
    // InternalIotlang.g:4534:1: rule__Bind__DirectionAssignment_3 : ( ( rule__Bind__DirectionAlternatives_3_0 ) ) ;
    public final void rule__Bind__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4538:1: ( ( ( rule__Bind__DirectionAlternatives_3_0 ) ) )
            // InternalIotlang.g:4539:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:4539:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            // InternalIotlang.g:4540:3: ( rule__Bind__DirectionAlternatives_3_0 )
            {
             before(grammarAccess.getBindAccess().getDirectionAlternatives_3_0()); 
            // InternalIotlang.g:4541:3: ( rule__Bind__DirectionAlternatives_3_0 )
            // InternalIotlang.g:4541:4: rule__Bind__DirectionAlternatives_3_0
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
    // InternalIotlang.g:4549:1: rule__Bind__PubSubInstanceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__PubSubInstanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4553:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4554:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4554:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4555:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getPubSubInstanceInstancePubSubCrossReference_4_0()); 
            // InternalIotlang.g:4556:3: ( RULE_ID )
            // InternalIotlang.g:4557:4: RULE_ID
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
    // InternalIotlang.g:4568:1: rule__Bind__TopicsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__TopicsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4572:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4573:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4573:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4574:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getTopicsTopicCrossReference_6_0()); 
            // InternalIotlang.g:4575:3: ( RULE_ID )
            // InternalIotlang.g:4576:4: RULE_ID
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
    // InternalIotlang.g:4587:1: rule__Bind__TopicsAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__TopicsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4591:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4592:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4592:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4593:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getTopicsTopicCrossReference_7_1_0()); 
            // InternalIotlang.g:4594:3: ( RULE_ID )
            // InternalIotlang.g:4595:4: RULE_ID
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
    // InternalIotlang.g:4606:1: rule__Bind__AnnotationsAssignment_9 : ( rulePlatformAnnotation ) ;
    public final void rule__Bind__AnnotationsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4610:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4611:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4611:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4612:3: rulePlatformAnnotation
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
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00006D3000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00006D3000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000002L});

}