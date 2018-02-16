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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_ID", "RULE_STRING_LIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'deny'", "'send'", "'receive'", "'=>'", "'<=>'", "'<='", "'thing'", "'{'", "'}'", "'channel:pubsub'", "'channel:ptp'", "'policy'", "'protocol'", "'message'", "'topic'", "'('", "')'", "'rule'", "':'", "'domain'", "'instanceThing'", "'['", "']'", "'instanceChannel'", "'over'", "'instancePolicy'", "'networkConfiguration'", "'enforce'", "'bind'", "','"
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

                if ( (LA1_0==20||(LA1_0>=23 && LA1_0<=27)||LA1_0==40) ) {
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


    // $ANTLR start "entryRuleProtocol"
    // InternalIotlang.g:228:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalIotlang.g:229:1: ( ruleProtocol EOF )
            // InternalIotlang.g:230:1: ruleProtocol EOF
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
    // InternalIotlang.g:237:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:241:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // InternalIotlang.g:242:2: ( ( rule__Protocol__Group__0 ) )
            {
            // InternalIotlang.g:242:2: ( ( rule__Protocol__Group__0 ) )
            // InternalIotlang.g:243:3: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // InternalIotlang.g:244:3: ( rule__Protocol__Group__0 )
            // InternalIotlang.g:244:4: rule__Protocol__Group__0
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
    // InternalIotlang.g:253:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalIotlang.g:254:1: ( ruleMessage EOF )
            // InternalIotlang.g:255:1: ruleMessage EOF
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
    // InternalIotlang.g:262:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:266:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalIotlang.g:267:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalIotlang.g:267:2: ( ( rule__Message__Group__0 ) )
            // InternalIotlang.g:268:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalIotlang.g:269:3: ( rule__Message__Group__0 )
            // InternalIotlang.g:269:4: rule__Message__Group__0
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
    // InternalIotlang.g:278:1: entryRuleTopic : ruleTopic EOF ;
    public final void entryRuleTopic() throws RecognitionException {
        try {
            // InternalIotlang.g:279:1: ( ruleTopic EOF )
            // InternalIotlang.g:280:1: ruleTopic EOF
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
    // InternalIotlang.g:287:1: ruleTopic : ( ( rule__Topic__Group__0 ) ) ;
    public final void ruleTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:291:2: ( ( ( rule__Topic__Group__0 ) ) )
            // InternalIotlang.g:292:2: ( ( rule__Topic__Group__0 ) )
            {
            // InternalIotlang.g:292:2: ( ( rule__Topic__Group__0 ) )
            // InternalIotlang.g:293:3: ( rule__Topic__Group__0 )
            {
             before(grammarAccess.getTopicAccess().getGroup()); 
            // InternalIotlang.g:294:3: ( rule__Topic__Group__0 )
            // InternalIotlang.g:294:4: rule__Topic__Group__0
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
    // InternalIotlang.g:303:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalIotlang.g:304:1: ( ruleRule EOF )
            // InternalIotlang.g:305:1: ruleRule EOF
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
    // InternalIotlang.g:312:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:316:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalIotlang.g:317:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalIotlang.g:317:2: ( ( rule__Rule__Group__0 ) )
            // InternalIotlang.g:318:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalIotlang.g:319:3: ( rule__Rule__Group__0 )
            // InternalIotlang.g:319:4: rule__Rule__Group__0
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
    // InternalIotlang.g:328:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalIotlang.g:329:1: ( ruleDomain EOF )
            // InternalIotlang.g:330:1: ruleDomain EOF
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
    // InternalIotlang.g:337:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:341:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalIotlang.g:342:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalIotlang.g:342:2: ( ( rule__Domain__Group__0 ) )
            // InternalIotlang.g:343:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalIotlang.g:344:3: ( rule__Domain__Group__0 )
            // InternalIotlang.g:344:4: rule__Domain__Group__0
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
    // InternalIotlang.g:353:1: entryRuleInstanceThing : ruleInstanceThing EOF ;
    public final void entryRuleInstanceThing() throws RecognitionException {
        try {
            // InternalIotlang.g:354:1: ( ruleInstanceThing EOF )
            // InternalIotlang.g:355:1: ruleInstanceThing EOF
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
    // InternalIotlang.g:362:1: ruleInstanceThing : ( ( rule__InstanceThing__Group__0 ) ) ;
    public final void ruleInstanceThing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:366:2: ( ( ( rule__InstanceThing__Group__0 ) ) )
            // InternalIotlang.g:367:2: ( ( rule__InstanceThing__Group__0 ) )
            {
            // InternalIotlang.g:367:2: ( ( rule__InstanceThing__Group__0 ) )
            // InternalIotlang.g:368:3: ( rule__InstanceThing__Group__0 )
            {
             before(grammarAccess.getInstanceThingAccess().getGroup()); 
            // InternalIotlang.g:369:3: ( rule__InstanceThing__Group__0 )
            // InternalIotlang.g:369:4: rule__InstanceThing__Group__0
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


    // $ANTLR start "entryRuleInstanceChannel"
    // InternalIotlang.g:378:1: entryRuleInstanceChannel : ruleInstanceChannel EOF ;
    public final void entryRuleInstanceChannel() throws RecognitionException {
        try {
            // InternalIotlang.g:379:1: ( ruleInstanceChannel EOF )
            // InternalIotlang.g:380:1: ruleInstanceChannel EOF
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
    // InternalIotlang.g:387:1: ruleInstanceChannel : ( ( rule__InstanceChannel__Group__0 ) ) ;
    public final void ruleInstanceChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:391:2: ( ( ( rule__InstanceChannel__Group__0 ) ) )
            // InternalIotlang.g:392:2: ( ( rule__InstanceChannel__Group__0 ) )
            {
            // InternalIotlang.g:392:2: ( ( rule__InstanceChannel__Group__0 ) )
            // InternalIotlang.g:393:3: ( rule__InstanceChannel__Group__0 )
            {
             before(grammarAccess.getInstanceChannelAccess().getGroup()); 
            // InternalIotlang.g:394:3: ( rule__InstanceChannel__Group__0 )
            // InternalIotlang.g:394:4: rule__InstanceChannel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceChannelAccess().getGroup()); 

            }


            }

        }
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
    // InternalIotlang.g:403:1: entryRuleInstancePolicy : ruleInstancePolicy EOF ;
    public final void entryRuleInstancePolicy() throws RecognitionException {
        try {
            // InternalIotlang.g:404:1: ( ruleInstancePolicy EOF )
            // InternalIotlang.g:405:1: ruleInstancePolicy EOF
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
    // InternalIotlang.g:412:1: ruleInstancePolicy : ( ( rule__InstancePolicy__Group__0 ) ) ;
    public final void ruleInstancePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:416:2: ( ( ( rule__InstancePolicy__Group__0 ) ) )
            // InternalIotlang.g:417:2: ( ( rule__InstancePolicy__Group__0 ) )
            {
            // InternalIotlang.g:417:2: ( ( rule__InstancePolicy__Group__0 ) )
            // InternalIotlang.g:418:3: ( rule__InstancePolicy__Group__0 )
            {
             before(grammarAccess.getInstancePolicyAccess().getGroup()); 
            // InternalIotlang.g:419:3: ( rule__InstancePolicy__Group__0 )
            // InternalIotlang.g:419:4: rule__InstancePolicy__Group__0
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
    // InternalIotlang.g:428:1: entryRuleNetworkConfiguration : ruleNetworkConfiguration EOF ;
    public final void entryRuleNetworkConfiguration() throws RecognitionException {
        try {
            // InternalIotlang.g:429:1: ( ruleNetworkConfiguration EOF )
            // InternalIotlang.g:430:1: ruleNetworkConfiguration EOF
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
    // InternalIotlang.g:437:1: ruleNetworkConfiguration : ( ( rule__NetworkConfiguration__Group__0 ) ) ;
    public final void ruleNetworkConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:441:2: ( ( ( rule__NetworkConfiguration__Group__0 ) ) )
            // InternalIotlang.g:442:2: ( ( rule__NetworkConfiguration__Group__0 ) )
            {
            // InternalIotlang.g:442:2: ( ( rule__NetworkConfiguration__Group__0 ) )
            // InternalIotlang.g:443:3: ( rule__NetworkConfiguration__Group__0 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getGroup()); 
            // InternalIotlang.g:444:3: ( rule__NetworkConfiguration__Group__0 )
            // InternalIotlang.g:444:4: rule__NetworkConfiguration__Group__0
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
    // InternalIotlang.g:453:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // InternalIotlang.g:454:1: ( ruleBind EOF )
            // InternalIotlang.g:455:1: ruleBind EOF
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
    // InternalIotlang.g:462:1: ruleBind : ( ( rule__Bind__Group__0 ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:466:2: ( ( ( rule__Bind__Group__0 ) ) )
            // InternalIotlang.g:467:2: ( ( rule__Bind__Group__0 ) )
            {
            // InternalIotlang.g:467:2: ( ( rule__Bind__Group__0 ) )
            // InternalIotlang.g:468:3: ( rule__Bind__Group__0 )
            {
             before(grammarAccess.getBindAccess().getGroup()); 
            // InternalIotlang.g:469:3: ( rule__Bind__Group__0 )
            // InternalIotlang.g:469:4: rule__Bind__Group__0
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
    // InternalIotlang.g:477:1: rule__IoTLangModel__Alternatives : ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__MessagesAssignment_2 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_3 ) ) | ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_5 ) ) );
    public final void rule__IoTLangModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:481:1: ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__MessagesAssignment_2 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_3 ) ) | ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_5 ) ) )
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
            case 27:
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
            case 26:
                {
                alt2=5;
                }
                break;
            case 40:
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
                    // InternalIotlang.g:482:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    {
                    // InternalIotlang.g:482:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    // InternalIotlang.g:483:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getThingsAssignment_0()); 
                    // InternalIotlang.g:484:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    // InternalIotlang.g:484:4: rule__IoTLangModel__ThingsAssignment_0
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
                    // InternalIotlang.g:488:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    {
                    // InternalIotlang.g:488:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    // InternalIotlang.g:489:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getPoliciesAssignment_1()); 
                    // InternalIotlang.g:490:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    // InternalIotlang.g:490:4: rule__IoTLangModel__PoliciesAssignment_1
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
                    // InternalIotlang.g:494:2: ( ( rule__IoTLangModel__MessagesAssignment_2 ) )
                    {
                    // InternalIotlang.g:494:2: ( ( rule__IoTLangModel__MessagesAssignment_2 ) )
                    // InternalIotlang.g:495:3: ( rule__IoTLangModel__MessagesAssignment_2 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getMessagesAssignment_2()); 
                    // InternalIotlang.g:496:3: ( rule__IoTLangModel__MessagesAssignment_2 )
                    // InternalIotlang.g:496:4: rule__IoTLangModel__MessagesAssignment_2
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
                    // InternalIotlang.g:500:2: ( ( rule__IoTLangModel__ChannelsAssignment_3 ) )
                    {
                    // InternalIotlang.g:500:2: ( ( rule__IoTLangModel__ChannelsAssignment_3 ) )
                    // InternalIotlang.g:501:3: ( rule__IoTLangModel__ChannelsAssignment_3 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getChannelsAssignment_3()); 
                    // InternalIotlang.g:502:3: ( rule__IoTLangModel__ChannelsAssignment_3 )
                    // InternalIotlang.g:502:4: rule__IoTLangModel__ChannelsAssignment_3
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
                    // InternalIotlang.g:506:2: ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) )
                    {
                    // InternalIotlang.g:506:2: ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) )
                    // InternalIotlang.g:507:3: ( rule__IoTLangModel__ProtocolsAssignment_4 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getProtocolsAssignment_4()); 
                    // InternalIotlang.g:508:3: ( rule__IoTLangModel__ProtocolsAssignment_4 )
                    // InternalIotlang.g:508:4: rule__IoTLangModel__ProtocolsAssignment_4
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
                    // InternalIotlang.g:512:2: ( ( rule__IoTLangModel__ConfigsAssignment_5 ) )
                    {
                    // InternalIotlang.g:512:2: ( ( rule__IoTLangModel__ConfigsAssignment_5 ) )
                    // InternalIotlang.g:513:3: ( rule__IoTLangModel__ConfigsAssignment_5 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getConfigsAssignment_5()); 
                    // InternalIotlang.g:514:3: ( rule__IoTLangModel__ConfigsAssignment_5 )
                    // InternalIotlang.g:514:4: rule__IoTLangModel__ConfigsAssignment_5
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
    // InternalIotlang.g:522:1: rule__Channel__Alternatives : ( ( rulePubSub ) | ( rulePointToPoint ) );
    public final void rule__Channel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:526:1: ( ( rulePubSub ) | ( rulePointToPoint ) )
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
                    // InternalIotlang.g:527:2: ( rulePubSub )
                    {
                    // InternalIotlang.g:527:2: ( rulePubSub )
                    // InternalIotlang.g:528:3: rulePubSub
                    {
                     before(grammarAccess.getChannelAccess().getPubSubParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePubSub();

                    state._fsp--;

                     after(grammarAccess.getChannelAccess().getPubSubParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:533:2: ( rulePointToPoint )
                    {
                    // InternalIotlang.g:533:2: ( rulePointToPoint )
                    // InternalIotlang.g:534:3: rulePointToPoint
                    {
                     before(grammarAccess.getChannelAccess().getPointToPointParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePointToPoint();

                    state._fsp--;

                     after(grammarAccess.getChannelAccess().getPointToPointParserRuleCall_1()); 

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
    // InternalIotlang.g:543:1: rule__Rule__PermissionAlternatives_3_0 : ( ( 'allow' ) | ( 'deny' ) );
    public final void rule__Rule__PermissionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:547:1: ( ( 'allow' ) | ( 'deny' ) )
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
                    // InternalIotlang.g:548:2: ( 'allow' )
                    {
                    // InternalIotlang.g:548:2: ( 'allow' )
                    // InternalIotlang.g:549:3: 'allow'
                    {
                     before(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:554:2: ( 'deny' )
                    {
                    // InternalIotlang.g:554:2: ( 'deny' )
                    // InternalIotlang.g:555:3: 'deny'
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
    // InternalIotlang.g:564:1: rule__Rule__ActionAlternatives_5_0 : ( ( 'send' ) | ( 'receive' ) );
    public final void rule__Rule__ActionAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:568:1: ( ( 'send' ) | ( 'receive' ) )
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
                    // InternalIotlang.g:569:2: ( 'send' )
                    {
                    // InternalIotlang.g:569:2: ( 'send' )
                    // InternalIotlang.g:570:3: 'send'
                    {
                     before(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:575:2: ( 'receive' )
                    {
                    // InternalIotlang.g:575:2: ( 'receive' )
                    // InternalIotlang.g:576:3: 'receive'
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


    // $ANTLR start "rule__NetworkConfiguration__Alternatives_4"
    // InternalIotlang.g:585:1: rule__NetworkConfiguration__Alternatives_4 : ( ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__Group_4_4__0 ) ) | ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) ) );
    public final void rule__NetworkConfiguration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:589:1: ( ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__Group_4_4__0 ) ) | ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 42:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            case 37:
                {
                alt6=4;
                }
                break;
            case 41:
                {
                alt6=5;
                }
                break;
            case 39:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalIotlang.g:590:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) )
                    {
                    // InternalIotlang.g:590:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) )
                    // InternalIotlang.g:591:3: ( rule__NetworkConfiguration__DomainAssignment_4_0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getDomainAssignment_4_0()); 
                    // InternalIotlang.g:592:3: ( rule__NetworkConfiguration__DomainAssignment_4_0 )
                    // InternalIotlang.g:592:4: rule__NetworkConfiguration__DomainAssignment_4_0
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
                    // InternalIotlang.g:596:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) )
                    {
                    // InternalIotlang.g:596:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) )
                    // InternalIotlang.g:597:3: ( rule__NetworkConfiguration__BindsAssignment_4_1 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getBindsAssignment_4_1()); 
                    // InternalIotlang.g:598:3: ( rule__NetworkConfiguration__BindsAssignment_4_1 )
                    // InternalIotlang.g:598:4: rule__NetworkConfiguration__BindsAssignment_4_1
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
                    // InternalIotlang.g:602:2: ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) )
                    {
                    // InternalIotlang.g:602:2: ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) )
                    // InternalIotlang.g:603:3: ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getThingInstancesAssignment_4_2()); 
                    // InternalIotlang.g:604:3: ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 )
                    // InternalIotlang.g:604:4: rule__NetworkConfiguration__ThingInstancesAssignment_4_2
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
                    // InternalIotlang.g:608:2: ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) )
                    {
                    // InternalIotlang.g:608:2: ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) )
                    // InternalIotlang.g:609:3: ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesAssignment_4_3()); 
                    // InternalIotlang.g:610:3: ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 )
                    // InternalIotlang.g:610:4: rule__NetworkConfiguration__ChannelInstancesAssignment_4_3
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
                    // InternalIotlang.g:614:2: ( ( rule__NetworkConfiguration__Group_4_4__0 ) )
                    {
                    // InternalIotlang.g:614:2: ( ( rule__NetworkConfiguration__Group_4_4__0 ) )
                    // InternalIotlang.g:615:3: ( rule__NetworkConfiguration__Group_4_4__0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getGroup_4_4()); 
                    // InternalIotlang.g:616:3: ( rule__NetworkConfiguration__Group_4_4__0 )
                    // InternalIotlang.g:616:4: rule__NetworkConfiguration__Group_4_4__0
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
                    // InternalIotlang.g:620:2: ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) )
                    {
                    // InternalIotlang.g:620:2: ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) )
                    // InternalIotlang.g:621:3: ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyAssignment_4_5()); 
                    // InternalIotlang.g:622:3: ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 )
                    // InternalIotlang.g:622:4: rule__NetworkConfiguration__InstancePoliciyAssignment_4_5
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
    // InternalIotlang.g:630:1: rule__Bind__DirectionAlternatives_3_0 : ( ( '=>' ) | ( '<=>' ) | ( '<=' ) );
    public final void rule__Bind__DirectionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:634:1: ( ( '=>' ) | ( '<=>' ) | ( '<=' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIotlang.g:635:2: ( '=>' )
                    {
                    // InternalIotlang.g:635:2: ( '=>' )
                    // InternalIotlang.g:636:3: '=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:641:2: ( '<=>' )
                    {
                    // InternalIotlang.g:641:2: ( '<=>' )
                    // InternalIotlang.g:642:3: '<=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:647:2: ( '<=' )
                    {
                    // InternalIotlang.g:647:2: ( '<=' )
                    // InternalIotlang.g:648:3: '<='
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
    // InternalIotlang.g:657:1: rule__PlatformAnnotation__Group__0 : rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 ;
    public final void rule__PlatformAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:661:1: ( rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 )
            // InternalIotlang.g:662:2: rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1
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
    // InternalIotlang.g:669:1: rule__PlatformAnnotation__Group__0__Impl : ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) ;
    public final void rule__PlatformAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:673:1: ( ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) )
            // InternalIotlang.g:674:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            {
            // InternalIotlang.g:674:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            // InternalIotlang.g:675:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0()); 
            // InternalIotlang.g:676:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            // InternalIotlang.g:676:3: rule__PlatformAnnotation__NameAssignment_0
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
    // InternalIotlang.g:684:1: rule__PlatformAnnotation__Group__1 : rule__PlatformAnnotation__Group__1__Impl ;
    public final void rule__PlatformAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:688:1: ( rule__PlatformAnnotation__Group__1__Impl )
            // InternalIotlang.g:689:2: rule__PlatformAnnotation__Group__1__Impl
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
    // InternalIotlang.g:695:1: rule__PlatformAnnotation__Group__1__Impl : ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) ;
    public final void rule__PlatformAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:699:1: ( ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) )
            // InternalIotlang.g:700:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            {
            // InternalIotlang.g:700:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            // InternalIotlang.g:701:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1()); 
            // InternalIotlang.g:702:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            // InternalIotlang.g:702:3: rule__PlatformAnnotation__ValueAssignment_1
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
    // InternalIotlang.g:711:1: rule__Thing__Group__0 : rule__Thing__Group__0__Impl rule__Thing__Group__1 ;
    public final void rule__Thing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:715:1: ( rule__Thing__Group__0__Impl rule__Thing__Group__1 )
            // InternalIotlang.g:716:2: rule__Thing__Group__0__Impl rule__Thing__Group__1
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
    // InternalIotlang.g:723:1: rule__Thing__Group__0__Impl : ( 'thing' ) ;
    public final void rule__Thing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:727:1: ( ( 'thing' ) )
            // InternalIotlang.g:728:1: ( 'thing' )
            {
            // InternalIotlang.g:728:1: ( 'thing' )
            // InternalIotlang.g:729:2: 'thing'
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
    // InternalIotlang.g:738:1: rule__Thing__Group__1 : rule__Thing__Group__1__Impl rule__Thing__Group__2 ;
    public final void rule__Thing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:742:1: ( rule__Thing__Group__1__Impl rule__Thing__Group__2 )
            // InternalIotlang.g:743:2: rule__Thing__Group__1__Impl rule__Thing__Group__2
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
    // InternalIotlang.g:750:1: rule__Thing__Group__1__Impl : ( ( rule__Thing__NameAssignment_1 ) ) ;
    public final void rule__Thing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:754:1: ( ( ( rule__Thing__NameAssignment_1 ) ) )
            // InternalIotlang.g:755:1: ( ( rule__Thing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:755:1: ( ( rule__Thing__NameAssignment_1 ) )
            // InternalIotlang.g:756:2: ( rule__Thing__NameAssignment_1 )
            {
             before(grammarAccess.getThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:757:2: ( rule__Thing__NameAssignment_1 )
            // InternalIotlang.g:757:3: rule__Thing__NameAssignment_1
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
    // InternalIotlang.g:765:1: rule__Thing__Group__2 : rule__Thing__Group__2__Impl rule__Thing__Group__3 ;
    public final void rule__Thing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:769:1: ( rule__Thing__Group__2__Impl rule__Thing__Group__3 )
            // InternalIotlang.g:770:2: rule__Thing__Group__2__Impl rule__Thing__Group__3
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
    // InternalIotlang.g:777:1: rule__Thing__Group__2__Impl : ( ( rule__Thing__AnnotationsAssignment_2 )* ) ;
    public final void rule__Thing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:781:1: ( ( ( rule__Thing__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:782:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:782:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:783:2: ( rule__Thing__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getThingAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:784:2: ( rule__Thing__AnnotationsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ANNOTATION_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIotlang.g:784:3: rule__Thing__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Thing__AnnotationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalIotlang.g:792:1: rule__Thing__Group__3 : rule__Thing__Group__3__Impl rule__Thing__Group__4 ;
    public final void rule__Thing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:796:1: ( rule__Thing__Group__3__Impl rule__Thing__Group__4 )
            // InternalIotlang.g:797:2: rule__Thing__Group__3__Impl rule__Thing__Group__4
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
    // InternalIotlang.g:804:1: rule__Thing__Group__3__Impl : ( '{' ) ;
    public final void rule__Thing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:808:1: ( ( '{' ) )
            // InternalIotlang.g:809:1: ( '{' )
            {
            // InternalIotlang.g:809:1: ( '{' )
            // InternalIotlang.g:810:2: '{'
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
    // InternalIotlang.g:819:1: rule__Thing__Group__4 : rule__Thing__Group__4__Impl ;
    public final void rule__Thing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:823:1: ( rule__Thing__Group__4__Impl )
            // InternalIotlang.g:824:2: rule__Thing__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Thing__Group__4__Impl();

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
    // InternalIotlang.g:830:1: rule__Thing__Group__4__Impl : ( '}' ) ;
    public final void rule__Thing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:834:1: ( ( '}' ) )
            // InternalIotlang.g:835:1: ( '}' )
            {
            // InternalIotlang.g:835:1: ( '}' )
            // InternalIotlang.g:836:2: '}'
            {
             before(grammarAccess.getThingAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getThingAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__PubSub__Group__0"
    // InternalIotlang.g:846:1: rule__PubSub__Group__0 : rule__PubSub__Group__0__Impl rule__PubSub__Group__1 ;
    public final void rule__PubSub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:850:1: ( rule__PubSub__Group__0__Impl rule__PubSub__Group__1 )
            // InternalIotlang.g:851:2: rule__PubSub__Group__0__Impl rule__PubSub__Group__1
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
    // InternalIotlang.g:858:1: rule__PubSub__Group__0__Impl : ( 'channel:pubsub' ) ;
    public final void rule__PubSub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:862:1: ( ( 'channel:pubsub' ) )
            // InternalIotlang.g:863:1: ( 'channel:pubsub' )
            {
            // InternalIotlang.g:863:1: ( 'channel:pubsub' )
            // InternalIotlang.g:864:2: 'channel:pubsub'
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
    // InternalIotlang.g:873:1: rule__PubSub__Group__1 : rule__PubSub__Group__1__Impl rule__PubSub__Group__2 ;
    public final void rule__PubSub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:877:1: ( rule__PubSub__Group__1__Impl rule__PubSub__Group__2 )
            // InternalIotlang.g:878:2: rule__PubSub__Group__1__Impl rule__PubSub__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalIotlang.g:885:1: rule__PubSub__Group__1__Impl : ( ( rule__PubSub__NameAssignment_1 ) ) ;
    public final void rule__PubSub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:889:1: ( ( ( rule__PubSub__NameAssignment_1 ) ) )
            // InternalIotlang.g:890:1: ( ( rule__PubSub__NameAssignment_1 ) )
            {
            // InternalIotlang.g:890:1: ( ( rule__PubSub__NameAssignment_1 ) )
            // InternalIotlang.g:891:2: ( rule__PubSub__NameAssignment_1 )
            {
             before(grammarAccess.getPubSubAccess().getNameAssignment_1()); 
            // InternalIotlang.g:892:2: ( rule__PubSub__NameAssignment_1 )
            // InternalIotlang.g:892:3: rule__PubSub__NameAssignment_1
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
    // InternalIotlang.g:900:1: rule__PubSub__Group__2 : rule__PubSub__Group__2__Impl rule__PubSub__Group__3 ;
    public final void rule__PubSub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:904:1: ( rule__PubSub__Group__2__Impl rule__PubSub__Group__3 )
            // InternalIotlang.g:905:2: rule__PubSub__Group__2__Impl rule__PubSub__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalIotlang.g:912:1: rule__PubSub__Group__2__Impl : ( '{' ) ;
    public final void rule__PubSub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:916:1: ( ( '{' ) )
            // InternalIotlang.g:917:1: ( '{' )
            {
            // InternalIotlang.g:917:1: ( '{' )
            // InternalIotlang.g:918:2: '{'
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
    // InternalIotlang.g:927:1: rule__PubSub__Group__3 : rule__PubSub__Group__3__Impl rule__PubSub__Group__4 ;
    public final void rule__PubSub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:931:1: ( rule__PubSub__Group__3__Impl rule__PubSub__Group__4 )
            // InternalIotlang.g:932:2: rule__PubSub__Group__3__Impl rule__PubSub__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalIotlang.g:939:1: rule__PubSub__Group__3__Impl : ( ( rule__PubSub__HasTopicsAssignment_3 )* ) ;
    public final void rule__PubSub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:943:1: ( ( ( rule__PubSub__HasTopicsAssignment_3 )* ) )
            // InternalIotlang.g:944:1: ( ( rule__PubSub__HasTopicsAssignment_3 )* )
            {
            // InternalIotlang.g:944:1: ( ( rule__PubSub__HasTopicsAssignment_3 )* )
            // InternalIotlang.g:945:2: ( rule__PubSub__HasTopicsAssignment_3 )*
            {
             before(grammarAccess.getPubSubAccess().getHasTopicsAssignment_3()); 
            // InternalIotlang.g:946:2: ( rule__PubSub__HasTopicsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIotlang.g:946:3: rule__PubSub__HasTopicsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PubSub__HasTopicsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalIotlang.g:954:1: rule__PubSub__Group__4 : rule__PubSub__Group__4__Impl ;
    public final void rule__PubSub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:958:1: ( rule__PubSub__Group__4__Impl )
            // InternalIotlang.g:959:2: rule__PubSub__Group__4__Impl
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
    // InternalIotlang.g:965:1: rule__PubSub__Group__4__Impl : ( '}' ) ;
    public final void rule__PubSub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:969:1: ( ( '}' ) )
            // InternalIotlang.g:970:1: ( '}' )
            {
            // InternalIotlang.g:970:1: ( '}' )
            // InternalIotlang.g:971:2: '}'
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
    // InternalIotlang.g:981:1: rule__PointToPoint__Group__0 : rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1 ;
    public final void rule__PointToPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:985:1: ( rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1 )
            // InternalIotlang.g:986:2: rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1
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
    // InternalIotlang.g:993:1: rule__PointToPoint__Group__0__Impl : ( 'channel:ptp' ) ;
    public final void rule__PointToPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:997:1: ( ( 'channel:ptp' ) )
            // InternalIotlang.g:998:1: ( 'channel:ptp' )
            {
            // InternalIotlang.g:998:1: ( 'channel:ptp' )
            // InternalIotlang.g:999:2: 'channel:ptp'
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
    // InternalIotlang.g:1008:1: rule__PointToPoint__Group__1 : rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2 ;
    public final void rule__PointToPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1012:1: ( rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2 )
            // InternalIotlang.g:1013:2: rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalIotlang.g:1020:1: rule__PointToPoint__Group__1__Impl : ( ( rule__PointToPoint__NameAssignment_1 ) ) ;
    public final void rule__PointToPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1024:1: ( ( ( rule__PointToPoint__NameAssignment_1 ) ) )
            // InternalIotlang.g:1025:1: ( ( rule__PointToPoint__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1025:1: ( ( rule__PointToPoint__NameAssignment_1 ) )
            // InternalIotlang.g:1026:2: ( rule__PointToPoint__NameAssignment_1 )
            {
             before(grammarAccess.getPointToPointAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1027:2: ( rule__PointToPoint__NameAssignment_1 )
            // InternalIotlang.g:1027:3: rule__PointToPoint__NameAssignment_1
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
    // InternalIotlang.g:1035:1: rule__PointToPoint__Group__2 : rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3 ;
    public final void rule__PointToPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1039:1: ( rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3 )
            // InternalIotlang.g:1040:2: rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalIotlang.g:1047:1: rule__PointToPoint__Group__2__Impl : ( '{' ) ;
    public final void rule__PointToPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1051:1: ( ( '{' ) )
            // InternalIotlang.g:1052:1: ( '{' )
            {
            // InternalIotlang.g:1052:1: ( '{' )
            // InternalIotlang.g:1053:2: '{'
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
    // InternalIotlang.g:1062:1: rule__PointToPoint__Group__3 : rule__PointToPoint__Group__3__Impl rule__PointToPoint__Group__4 ;
    public final void rule__PointToPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1066:1: ( rule__PointToPoint__Group__3__Impl rule__PointToPoint__Group__4 )
            // InternalIotlang.g:1067:2: rule__PointToPoint__Group__3__Impl rule__PointToPoint__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__PointToPoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__4();

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
    // InternalIotlang.g:1074:1: rule__PointToPoint__Group__3__Impl : ( ( rule__PointToPoint__HasTopicsAssignment_3 )* ) ;
    public final void rule__PointToPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1078:1: ( ( ( rule__PointToPoint__HasTopicsAssignment_3 )* ) )
            // InternalIotlang.g:1079:1: ( ( rule__PointToPoint__HasTopicsAssignment_3 )* )
            {
            // InternalIotlang.g:1079:1: ( ( rule__PointToPoint__HasTopicsAssignment_3 )* )
            // InternalIotlang.g:1080:2: ( rule__PointToPoint__HasTopicsAssignment_3 )*
            {
             before(grammarAccess.getPointToPointAccess().getHasTopicsAssignment_3()); 
            // InternalIotlang.g:1081:2: ( rule__PointToPoint__HasTopicsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIotlang.g:1081:3: rule__PointToPoint__HasTopicsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PointToPoint__HasTopicsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPointToPointAccess().getHasTopicsAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__PointToPoint__Group__4"
    // InternalIotlang.g:1089:1: rule__PointToPoint__Group__4 : rule__PointToPoint__Group__4__Impl ;
    public final void rule__PointToPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1093:1: ( rule__PointToPoint__Group__4__Impl )
            // InternalIotlang.g:1094:2: rule__PointToPoint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PointToPoint__Group__4__Impl();

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
    // $ANTLR end "rule__PointToPoint__Group__4"


    // $ANTLR start "rule__PointToPoint__Group__4__Impl"
    // InternalIotlang.g:1100:1: rule__PointToPoint__Group__4__Impl : ( '}' ) ;
    public final void rule__PointToPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1104:1: ( ( '}' ) )
            // InternalIotlang.g:1105:1: ( '}' )
            {
            // InternalIotlang.g:1105:1: ( '}' )
            // InternalIotlang.g:1106:2: '}'
            {
             before(grammarAccess.getPointToPointAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPointToPointAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__Group__4__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalIotlang.g:1116:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1120:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalIotlang.g:1121:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
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
    // InternalIotlang.g:1128:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1132:1: ( ( 'policy' ) )
            // InternalIotlang.g:1133:1: ( 'policy' )
            {
            // InternalIotlang.g:1133:1: ( 'policy' )
            // InternalIotlang.g:1134:2: 'policy'
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
    // InternalIotlang.g:1143:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1147:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalIotlang.g:1148:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalIotlang.g:1155:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1159:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalIotlang.g:1160:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1160:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalIotlang.g:1161:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1162:2: ( rule__Policy__NameAssignment_1 )
            // InternalIotlang.g:1162:3: rule__Policy__NameAssignment_1
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
    // InternalIotlang.g:1170:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1174:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalIotlang.g:1175:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalIotlang.g:1182:1: rule__Policy__Group__2__Impl : ( '{' ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1186:1: ( ( '{' ) )
            // InternalIotlang.g:1187:1: ( '{' )
            {
            // InternalIotlang.g:1187:1: ( '{' )
            // InternalIotlang.g:1188:2: '{'
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
    // InternalIotlang.g:1197:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1201:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalIotlang.g:1202:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalIotlang.g:1209:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__HasRulesAssignment_3 )* ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1213:1: ( ( ( rule__Policy__HasRulesAssignment_3 )* ) )
            // InternalIotlang.g:1214:1: ( ( rule__Policy__HasRulesAssignment_3 )* )
            {
            // InternalIotlang.g:1214:1: ( ( rule__Policy__HasRulesAssignment_3 )* )
            // InternalIotlang.g:1215:2: ( rule__Policy__HasRulesAssignment_3 )*
            {
             before(grammarAccess.getPolicyAccess().getHasRulesAssignment_3()); 
            // InternalIotlang.g:1216:2: ( rule__Policy__HasRulesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIotlang.g:1216:3: rule__Policy__HasRulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Policy__HasRulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalIotlang.g:1224:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1228:1: ( rule__Policy__Group__4__Impl )
            // InternalIotlang.g:1229:2: rule__Policy__Group__4__Impl
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
    // InternalIotlang.g:1235:1: rule__Policy__Group__4__Impl : ( '}' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1239:1: ( ( '}' ) )
            // InternalIotlang.g:1240:1: ( '}' )
            {
            // InternalIotlang.g:1240:1: ( '}' )
            // InternalIotlang.g:1241:2: '}'
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


    // $ANTLR start "rule__Protocol__Group__0"
    // InternalIotlang.g:1251:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1255:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalIotlang.g:1256:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
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
    // InternalIotlang.g:1263:1: rule__Protocol__Group__0__Impl : ( 'protocol' ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1267:1: ( ( 'protocol' ) )
            // InternalIotlang.g:1268:1: ( 'protocol' )
            {
            // InternalIotlang.g:1268:1: ( 'protocol' )
            // InternalIotlang.g:1269:2: 'protocol'
            {
             before(grammarAccess.getProtocolAccess().getProtocolKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalIotlang.g:1278:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1282:1: ( rule__Protocol__Group__1__Impl )
            // InternalIotlang.g:1283:2: rule__Protocol__Group__1__Impl
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
    // InternalIotlang.g:1289:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__NameAssignment_1 ) ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1293:1: ( ( ( rule__Protocol__NameAssignment_1 ) ) )
            // InternalIotlang.g:1294:1: ( ( rule__Protocol__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1294:1: ( ( rule__Protocol__NameAssignment_1 ) )
            // InternalIotlang.g:1295:2: ( rule__Protocol__NameAssignment_1 )
            {
             before(grammarAccess.getProtocolAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1296:2: ( rule__Protocol__NameAssignment_1 )
            // InternalIotlang.g:1296:3: rule__Protocol__NameAssignment_1
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
    // InternalIotlang.g:1305:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1309:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalIotlang.g:1310:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalIotlang.g:1317:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1321:1: ( ( 'message' ) )
            // InternalIotlang.g:1322:1: ( 'message' )
            {
            // InternalIotlang.g:1322:1: ( 'message' )
            // InternalIotlang.g:1323:2: 'message'
            {
             before(grammarAccess.getMessageAccess().getMessageKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalIotlang.g:1332:1: rule__Message__Group__1 : rule__Message__Group__1__Impl ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1336:1: ( rule__Message__Group__1__Impl )
            // InternalIotlang.g:1337:2: rule__Message__Group__1__Impl
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
    // InternalIotlang.g:1343:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1347:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // InternalIotlang.g:1348:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1348:1: ( ( rule__Message__NameAssignment_1 ) )
            // InternalIotlang.g:1349:2: ( rule__Message__NameAssignment_1 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1350:2: ( rule__Message__NameAssignment_1 )
            // InternalIotlang.g:1350:3: rule__Message__NameAssignment_1
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
    // InternalIotlang.g:1359:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1363:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // InternalIotlang.g:1364:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
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
    // InternalIotlang.g:1371:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1375:1: ( ( 'topic' ) )
            // InternalIotlang.g:1376:1: ( 'topic' )
            {
            // InternalIotlang.g:1376:1: ( 'topic' )
            // InternalIotlang.g:1377:2: 'topic'
            {
             before(grammarAccess.getTopicAccess().getTopicKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalIotlang.g:1386:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1390:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // InternalIotlang.g:1391:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalIotlang.g:1398:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1402:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // InternalIotlang.g:1403:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1403:1: ( ( rule__Topic__NameAssignment_1 ) )
            // InternalIotlang.g:1404:2: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1405:2: ( rule__Topic__NameAssignment_1 )
            // InternalIotlang.g:1405:3: rule__Topic__NameAssignment_1
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
    // InternalIotlang.g:1413:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1417:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // InternalIotlang.g:1418:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
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
    // InternalIotlang.g:1425:1: rule__Topic__Group__2__Impl : ( '(' ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1429:1: ( ( '(' ) )
            // InternalIotlang.g:1430:1: ( '(' )
            {
            // InternalIotlang.g:1430:1: ( '(' )
            // InternalIotlang.g:1431:2: '('
            {
             before(grammarAccess.getTopicAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalIotlang.g:1440:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1444:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // InternalIotlang.g:1445:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalIotlang.g:1452:1: rule__Topic__Group__3__Impl : ( ( rule__Topic__AcceptedMessagesAssignment_3 ) ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1456:1: ( ( ( rule__Topic__AcceptedMessagesAssignment_3 ) ) )
            // InternalIotlang.g:1457:1: ( ( rule__Topic__AcceptedMessagesAssignment_3 ) )
            {
            // InternalIotlang.g:1457:1: ( ( rule__Topic__AcceptedMessagesAssignment_3 ) )
            // InternalIotlang.g:1458:2: ( rule__Topic__AcceptedMessagesAssignment_3 )
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesAssignment_3()); 
            // InternalIotlang.g:1459:2: ( rule__Topic__AcceptedMessagesAssignment_3 )
            // InternalIotlang.g:1459:3: rule__Topic__AcceptedMessagesAssignment_3
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
    // InternalIotlang.g:1467:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1471:1: ( rule__Topic__Group__4__Impl )
            // InternalIotlang.g:1472:2: rule__Topic__Group__4__Impl
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
    // InternalIotlang.g:1478:1: rule__Topic__Group__4__Impl : ( ')' ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1482:1: ( ( ')' ) )
            // InternalIotlang.g:1483:1: ( ')' )
            {
            // InternalIotlang.g:1483:1: ( ')' )
            // InternalIotlang.g:1484:2: ')'
            {
             before(grammarAccess.getTopicAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalIotlang.g:1494:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1498:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalIotlang.g:1499:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalIotlang.g:1506:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1510:1: ( ( 'rule' ) )
            // InternalIotlang.g:1511:1: ( 'rule' )
            {
            // InternalIotlang.g:1511:1: ( 'rule' )
            // InternalIotlang.g:1512:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalIotlang.g:1521:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1525:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalIotlang.g:1526:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalIotlang.g:1533:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1537:1: ( ( ( rule__Rule__NameAssignment_1 )? ) )
            // InternalIotlang.g:1538:1: ( ( rule__Rule__NameAssignment_1 )? )
            {
            // InternalIotlang.g:1538:1: ( ( rule__Rule__NameAssignment_1 )? )
            // InternalIotlang.g:1539:2: ( rule__Rule__NameAssignment_1 )?
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1540:2: ( rule__Rule__NameAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalIotlang.g:1540:3: rule__Rule__NameAssignment_1
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
    // InternalIotlang.g:1548:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1552:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalIotlang.g:1553:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalIotlang.g:1560:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__SubjectAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1564:1: ( ( ( rule__Rule__SubjectAssignment_2 ) ) )
            // InternalIotlang.g:1565:1: ( ( rule__Rule__SubjectAssignment_2 ) )
            {
            // InternalIotlang.g:1565:1: ( ( rule__Rule__SubjectAssignment_2 ) )
            // InternalIotlang.g:1566:2: ( rule__Rule__SubjectAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getSubjectAssignment_2()); 
            // InternalIotlang.g:1567:2: ( rule__Rule__SubjectAssignment_2 )
            // InternalIotlang.g:1567:3: rule__Rule__SubjectAssignment_2
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
    // InternalIotlang.g:1575:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1579:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalIotlang.g:1580:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalIotlang.g:1587:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__PermissionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1591:1: ( ( ( rule__Rule__PermissionAssignment_3 ) ) )
            // InternalIotlang.g:1592:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            {
            // InternalIotlang.g:1592:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            // InternalIotlang.g:1593:2: ( rule__Rule__PermissionAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAssignment_3()); 
            // InternalIotlang.g:1594:2: ( rule__Rule__PermissionAssignment_3 )
            // InternalIotlang.g:1594:3: rule__Rule__PermissionAssignment_3
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
    // InternalIotlang.g:1602:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1606:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalIotlang.g:1607:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalIotlang.g:1614:1: rule__Rule__Group__4__Impl : ( ':' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1618:1: ( ( ':' ) )
            // InternalIotlang.g:1619:1: ( ':' )
            {
            // InternalIotlang.g:1619:1: ( ':' )
            // InternalIotlang.g:1620:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalIotlang.g:1629:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1633:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalIotlang.g:1634:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalIotlang.g:1641:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ActionAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1645:1: ( ( ( rule__Rule__ActionAssignment_5 ) ) )
            // InternalIotlang.g:1646:1: ( ( rule__Rule__ActionAssignment_5 ) )
            {
            // InternalIotlang.g:1646:1: ( ( rule__Rule__ActionAssignment_5 ) )
            // InternalIotlang.g:1647:2: ( rule__Rule__ActionAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_5()); 
            // InternalIotlang.g:1648:2: ( rule__Rule__ActionAssignment_5 )
            // InternalIotlang.g:1648:3: rule__Rule__ActionAssignment_5
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
    // InternalIotlang.g:1656:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1660:1: ( rule__Rule__Group__6__Impl )
            // InternalIotlang.g:1661:2: rule__Rule__Group__6__Impl
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
    // InternalIotlang.g:1667:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__ObjectAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1671:1: ( ( ( rule__Rule__ObjectAssignment_6 ) ) )
            // InternalIotlang.g:1672:1: ( ( rule__Rule__ObjectAssignment_6 ) )
            {
            // InternalIotlang.g:1672:1: ( ( rule__Rule__ObjectAssignment_6 ) )
            // InternalIotlang.g:1673:2: ( rule__Rule__ObjectAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getObjectAssignment_6()); 
            // InternalIotlang.g:1674:2: ( rule__Rule__ObjectAssignment_6 )
            // InternalIotlang.g:1674:3: rule__Rule__ObjectAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ObjectAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getObjectAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Domain__Group__0"
    // InternalIotlang.g:1683:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1687:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalIotlang.g:1688:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalIotlang.g:1695:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1699:1: ( ( 'domain' ) )
            // InternalIotlang.g:1700:1: ( 'domain' )
            {
            // InternalIotlang.g:1700:1: ( 'domain' )
            // InternalIotlang.g:1701:2: 'domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalIotlang.g:1710:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1714:1: ( rule__Domain__Group__1__Impl )
            // InternalIotlang.g:1715:2: rule__Domain__Group__1__Impl
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
    // InternalIotlang.g:1721:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1725:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalIotlang.g:1726:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1726:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalIotlang.g:1727:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1728:2: ( rule__Domain__NameAssignment_1 )
            // InternalIotlang.g:1728:3: rule__Domain__NameAssignment_1
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
    // InternalIotlang.g:1737:1: rule__InstanceThing__Group__0 : rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 ;
    public final void rule__InstanceThing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1741:1: ( rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 )
            // InternalIotlang.g:1742:2: rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1
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
    // InternalIotlang.g:1749:1: rule__InstanceThing__Group__0__Impl : ( 'instanceThing' ) ;
    public final void rule__InstanceThing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1753:1: ( ( 'instanceThing' ) )
            // InternalIotlang.g:1754:1: ( 'instanceThing' )
            {
            // InternalIotlang.g:1754:1: ( 'instanceThing' )
            // InternalIotlang.g:1755:2: 'instanceThing'
            {
             before(grammarAccess.getInstanceThingAccess().getInstanceThingKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalIotlang.g:1764:1: rule__InstanceThing__Group__1 : rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 ;
    public final void rule__InstanceThing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1768:1: ( rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 )
            // InternalIotlang.g:1769:2: rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalIotlang.g:1776:1: rule__InstanceThing__Group__1__Impl : ( ( rule__InstanceThing__NameAssignment_1 ) ) ;
    public final void rule__InstanceThing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1780:1: ( ( ( rule__InstanceThing__NameAssignment_1 ) ) )
            // InternalIotlang.g:1781:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1781:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            // InternalIotlang.g:1782:2: ( rule__InstanceThing__NameAssignment_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1783:2: ( rule__InstanceThing__NameAssignment_1 )
            // InternalIotlang.g:1783:3: rule__InstanceThing__NameAssignment_1
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
    // InternalIotlang.g:1791:1: rule__InstanceThing__Group__2 : rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 ;
    public final void rule__InstanceThing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1795:1: ( rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 )
            // InternalIotlang.g:1796:2: rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalIotlang.g:1803:1: rule__InstanceThing__Group__2__Impl : ( ( rule__InstanceThing__Group_2__0 )* ) ;
    public final void rule__InstanceThing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1807:1: ( ( ( rule__InstanceThing__Group_2__0 )* ) )
            // InternalIotlang.g:1808:1: ( ( rule__InstanceThing__Group_2__0 )* )
            {
            // InternalIotlang.g:1808:1: ( ( rule__InstanceThing__Group_2__0 )* )
            // InternalIotlang.g:1809:2: ( rule__InstanceThing__Group_2__0 )*
            {
             before(grammarAccess.getInstanceThingAccess().getGroup_2()); 
            // InternalIotlang.g:1810:2: ( rule__InstanceThing__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIotlang.g:1810:3: rule__InstanceThing__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__InstanceThing__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalIotlang.g:1818:1: rule__InstanceThing__Group__3 : rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 ;
    public final void rule__InstanceThing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1822:1: ( rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 )
            // InternalIotlang.g:1823:2: rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4
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
    // InternalIotlang.g:1830:1: rule__InstanceThing__Group__3__Impl : ( ':' ) ;
    public final void rule__InstanceThing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1834:1: ( ( ':' ) )
            // InternalIotlang.g:1835:1: ( ':' )
            {
            // InternalIotlang.g:1835:1: ( ':' )
            // InternalIotlang.g:1836:2: ':'
            {
             before(grammarAccess.getInstanceThingAccess().getColonKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalIotlang.g:1845:1: rule__InstanceThing__Group__4 : rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 ;
    public final void rule__InstanceThing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1849:1: ( rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 )
            // InternalIotlang.g:1850:2: rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalIotlang.g:1857:1: rule__InstanceThing__Group__4__Impl : ( ( rule__InstanceThing__TypeThingAssignment_4 ) ) ;
    public final void rule__InstanceThing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1861:1: ( ( ( rule__InstanceThing__TypeThingAssignment_4 ) ) )
            // InternalIotlang.g:1862:1: ( ( rule__InstanceThing__TypeThingAssignment_4 ) )
            {
            // InternalIotlang.g:1862:1: ( ( rule__InstanceThing__TypeThingAssignment_4 ) )
            // InternalIotlang.g:1863:2: ( rule__InstanceThing__TypeThingAssignment_4 )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingAssignment_4()); 
            // InternalIotlang.g:1864:2: ( rule__InstanceThing__TypeThingAssignment_4 )
            // InternalIotlang.g:1864:3: rule__InstanceThing__TypeThingAssignment_4
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
    // InternalIotlang.g:1872:1: rule__InstanceThing__Group__5 : rule__InstanceThing__Group__5__Impl ;
    public final void rule__InstanceThing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1876:1: ( rule__InstanceThing__Group__5__Impl )
            // InternalIotlang.g:1877:2: rule__InstanceThing__Group__5__Impl
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
    // InternalIotlang.g:1883:1: rule__InstanceThing__Group__5__Impl : ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) ;
    public final void rule__InstanceThing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1887:1: ( ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) )
            // InternalIotlang.g:1888:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            {
            // InternalIotlang.g:1888:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            // InternalIotlang.g:1889:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            {
             before(grammarAccess.getInstanceThingAccess().getAnnotationsAssignment_5()); 
            // InternalIotlang.g:1890:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ANNOTATION_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIotlang.g:1890:3: rule__InstanceThing__AnnotationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanceThing__AnnotationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalIotlang.g:1899:1: rule__InstanceThing__Group_2__0 : rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 ;
    public final void rule__InstanceThing__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1903:1: ( rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 )
            // InternalIotlang.g:1904:2: rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalIotlang.g:1911:1: rule__InstanceThing__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstanceThing__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1915:1: ( ( '[' ) )
            // InternalIotlang.g:1916:1: ( '[' )
            {
            // InternalIotlang.g:1916:1: ( '[' )
            // InternalIotlang.g:1917:2: '['
            {
             before(grammarAccess.getInstanceThingAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalIotlang.g:1926:1: rule__InstanceThing__Group_2__1 : rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 ;
    public final void rule__InstanceThing__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1930:1: ( rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 )
            // InternalIotlang.g:1931:2: rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalIotlang.g:1938:1: rule__InstanceThing__Group_2__1__Impl : ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) ;
    public final void rule__InstanceThing__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1942:1: ( ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:1943:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:1943:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            // InternalIotlang.g:1944:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:1945:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            // InternalIotlang.g:1945:3: rule__InstanceThing__NumberAssignment_2_1
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
    // InternalIotlang.g:1953:1: rule__InstanceThing__Group_2__2 : rule__InstanceThing__Group_2__2__Impl ;
    public final void rule__InstanceThing__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1957:1: ( rule__InstanceThing__Group_2__2__Impl )
            // InternalIotlang.g:1958:2: rule__InstanceThing__Group_2__2__Impl
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
    // InternalIotlang.g:1964:1: rule__InstanceThing__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstanceThing__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1968:1: ( ( ']' ) )
            // InternalIotlang.g:1969:1: ( ']' )
            {
            // InternalIotlang.g:1969:1: ( ']' )
            // InternalIotlang.g:1970:2: ']'
            {
             before(grammarAccess.getInstanceThingAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__InstanceChannel__Group__0"
    // InternalIotlang.g:1980:1: rule__InstanceChannel__Group__0 : rule__InstanceChannel__Group__0__Impl rule__InstanceChannel__Group__1 ;
    public final void rule__InstanceChannel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1984:1: ( rule__InstanceChannel__Group__0__Impl rule__InstanceChannel__Group__1 )
            // InternalIotlang.g:1985:2: rule__InstanceChannel__Group__0__Impl rule__InstanceChannel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InstanceChannel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__1();

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
    // $ANTLR end "rule__InstanceChannel__Group__0"


    // $ANTLR start "rule__InstanceChannel__Group__0__Impl"
    // InternalIotlang.g:1992:1: rule__InstanceChannel__Group__0__Impl : ( 'instanceChannel' ) ;
    public final void rule__InstanceChannel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1996:1: ( ( 'instanceChannel' ) )
            // InternalIotlang.g:1997:1: ( 'instanceChannel' )
            {
            // InternalIotlang.g:1997:1: ( 'instanceChannel' )
            // InternalIotlang.g:1998:2: 'instanceChannel'
            {
             before(grammarAccess.getInstanceChannelAccess().getInstanceChannelKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getInstanceChannelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__0__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__1"
    // InternalIotlang.g:2007:1: rule__InstanceChannel__Group__1 : rule__InstanceChannel__Group__1__Impl rule__InstanceChannel__Group__2 ;
    public final void rule__InstanceChannel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2011:1: ( rule__InstanceChannel__Group__1__Impl rule__InstanceChannel__Group__2 )
            // InternalIotlang.g:2012:2: rule__InstanceChannel__Group__1__Impl rule__InstanceChannel__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__InstanceChannel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__2();

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
    // $ANTLR end "rule__InstanceChannel__Group__1"


    // $ANTLR start "rule__InstanceChannel__Group__1__Impl"
    // InternalIotlang.g:2019:1: rule__InstanceChannel__Group__1__Impl : ( ( rule__InstanceChannel__NameAssignment_1 ) ) ;
    public final void rule__InstanceChannel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2023:1: ( ( ( rule__InstanceChannel__NameAssignment_1 ) ) )
            // InternalIotlang.g:2024:1: ( ( rule__InstanceChannel__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2024:1: ( ( rule__InstanceChannel__NameAssignment_1 ) )
            // InternalIotlang.g:2025:2: ( rule__InstanceChannel__NameAssignment_1 )
            {
             before(grammarAccess.getInstanceChannelAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2026:2: ( rule__InstanceChannel__NameAssignment_1 )
            // InternalIotlang.g:2026:3: rule__InstanceChannel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceChannelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__1__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__2"
    // InternalIotlang.g:2034:1: rule__InstanceChannel__Group__2 : rule__InstanceChannel__Group__2__Impl rule__InstanceChannel__Group__3 ;
    public final void rule__InstanceChannel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2038:1: ( rule__InstanceChannel__Group__2__Impl rule__InstanceChannel__Group__3 )
            // InternalIotlang.g:2039:2: rule__InstanceChannel__Group__2__Impl rule__InstanceChannel__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__InstanceChannel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__3();

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
    // $ANTLR end "rule__InstanceChannel__Group__2"


    // $ANTLR start "rule__InstanceChannel__Group__2__Impl"
    // InternalIotlang.g:2046:1: rule__InstanceChannel__Group__2__Impl : ( ( rule__InstanceChannel__Group_2__0 )* ) ;
    public final void rule__InstanceChannel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2050:1: ( ( ( rule__InstanceChannel__Group_2__0 )* ) )
            // InternalIotlang.g:2051:1: ( ( rule__InstanceChannel__Group_2__0 )* )
            {
            // InternalIotlang.g:2051:1: ( ( rule__InstanceChannel__Group_2__0 )* )
            // InternalIotlang.g:2052:2: ( rule__InstanceChannel__Group_2__0 )*
            {
             before(grammarAccess.getInstanceChannelAccess().getGroup_2()); 
            // InternalIotlang.g:2053:2: ( rule__InstanceChannel__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIotlang.g:2053:3: rule__InstanceChannel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__InstanceChannel__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInstanceChannelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__2__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__3"
    // InternalIotlang.g:2061:1: rule__InstanceChannel__Group__3 : rule__InstanceChannel__Group__3__Impl rule__InstanceChannel__Group__4 ;
    public final void rule__InstanceChannel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2065:1: ( rule__InstanceChannel__Group__3__Impl rule__InstanceChannel__Group__4 )
            // InternalIotlang.g:2066:2: rule__InstanceChannel__Group__3__Impl rule__InstanceChannel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__InstanceChannel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__4();

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
    // $ANTLR end "rule__InstanceChannel__Group__3"


    // $ANTLR start "rule__InstanceChannel__Group__3__Impl"
    // InternalIotlang.g:2073:1: rule__InstanceChannel__Group__3__Impl : ( ':' ) ;
    public final void rule__InstanceChannel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2077:1: ( ( ':' ) )
            // InternalIotlang.g:2078:1: ( ':' )
            {
            // InternalIotlang.g:2078:1: ( ':' )
            // InternalIotlang.g:2079:2: ':'
            {
             before(grammarAccess.getInstanceChannelAccess().getColonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__3__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__4"
    // InternalIotlang.g:2088:1: rule__InstanceChannel__Group__4 : rule__InstanceChannel__Group__4__Impl rule__InstanceChannel__Group__5 ;
    public final void rule__InstanceChannel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2092:1: ( rule__InstanceChannel__Group__4__Impl rule__InstanceChannel__Group__5 )
            // InternalIotlang.g:2093:2: rule__InstanceChannel__Group__4__Impl rule__InstanceChannel__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__InstanceChannel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__5();

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
    // $ANTLR end "rule__InstanceChannel__Group__4"


    // $ANTLR start "rule__InstanceChannel__Group__4__Impl"
    // InternalIotlang.g:2100:1: rule__InstanceChannel__Group__4__Impl : ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) ) ;
    public final void rule__InstanceChannel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2104:1: ( ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) ) )
            // InternalIotlang.g:2105:1: ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) )
            {
            // InternalIotlang.g:2105:1: ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) )
            // InternalIotlang.g:2106:2: ( rule__InstanceChannel__TypeChannelAssignment_4 )
            {
             before(grammarAccess.getInstanceChannelAccess().getTypeChannelAssignment_4()); 
            // InternalIotlang.g:2107:2: ( rule__InstanceChannel__TypeChannelAssignment_4 )
            // InternalIotlang.g:2107:3: rule__InstanceChannel__TypeChannelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__TypeChannelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInstanceChannelAccess().getTypeChannelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__4__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__5"
    // InternalIotlang.g:2115:1: rule__InstanceChannel__Group__5 : rule__InstanceChannel__Group__5__Impl rule__InstanceChannel__Group__6 ;
    public final void rule__InstanceChannel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2119:1: ( rule__InstanceChannel__Group__5__Impl rule__InstanceChannel__Group__6 )
            // InternalIotlang.g:2120:2: rule__InstanceChannel__Group__5__Impl rule__InstanceChannel__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__InstanceChannel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__6();

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
    // $ANTLR end "rule__InstanceChannel__Group__5"


    // $ANTLR start "rule__InstanceChannel__Group__5__Impl"
    // InternalIotlang.g:2127:1: rule__InstanceChannel__Group__5__Impl : ( 'over' ) ;
    public final void rule__InstanceChannel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2131:1: ( ( 'over' ) )
            // InternalIotlang.g:2132:1: ( 'over' )
            {
            // InternalIotlang.g:2132:1: ( 'over' )
            // InternalIotlang.g:2133:2: 'over'
            {
             before(grammarAccess.getInstanceChannelAccess().getOverKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getOverKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__5__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__6"
    // InternalIotlang.g:2142:1: rule__InstanceChannel__Group__6 : rule__InstanceChannel__Group__6__Impl rule__InstanceChannel__Group__7 ;
    public final void rule__InstanceChannel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2146:1: ( rule__InstanceChannel__Group__6__Impl rule__InstanceChannel__Group__7 )
            // InternalIotlang.g:2147:2: rule__InstanceChannel__Group__6__Impl rule__InstanceChannel__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__InstanceChannel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__7();

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
    // $ANTLR end "rule__InstanceChannel__Group__6"


    // $ANTLR start "rule__InstanceChannel__Group__6__Impl"
    // InternalIotlang.g:2154:1: rule__InstanceChannel__Group__6__Impl : ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) ) ;
    public final void rule__InstanceChannel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2158:1: ( ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) ) )
            // InternalIotlang.g:2159:1: ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) )
            {
            // InternalIotlang.g:2159:1: ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) )
            // InternalIotlang.g:2160:2: ( rule__InstanceChannel__OverProtocolAssignment_6 )
            {
             before(grammarAccess.getInstanceChannelAccess().getOverProtocolAssignment_6()); 
            // InternalIotlang.g:2161:2: ( rule__InstanceChannel__OverProtocolAssignment_6 )
            // InternalIotlang.g:2161:3: rule__InstanceChannel__OverProtocolAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__OverProtocolAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInstanceChannelAccess().getOverProtocolAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__6__Impl"


    // $ANTLR start "rule__InstanceChannel__Group__7"
    // InternalIotlang.g:2169:1: rule__InstanceChannel__Group__7 : rule__InstanceChannel__Group__7__Impl ;
    public final void rule__InstanceChannel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2173:1: ( rule__InstanceChannel__Group__7__Impl )
            // InternalIotlang.g:2174:2: rule__InstanceChannel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group__7__Impl();

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
    // $ANTLR end "rule__InstanceChannel__Group__7"


    // $ANTLR start "rule__InstanceChannel__Group__7__Impl"
    // InternalIotlang.g:2180:1: rule__InstanceChannel__Group__7__Impl : ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* ) ;
    public final void rule__InstanceChannel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2184:1: ( ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* ) )
            // InternalIotlang.g:2185:1: ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* )
            {
            // InternalIotlang.g:2185:1: ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* )
            // InternalIotlang.g:2186:2: ( rule__InstanceChannel__AnnotationsAssignment_7 )*
            {
             before(grammarAccess.getInstanceChannelAccess().getAnnotationsAssignment_7()); 
            // InternalIotlang.g:2187:2: ( rule__InstanceChannel__AnnotationsAssignment_7 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ANNOTATION_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIotlang.g:2187:3: rule__InstanceChannel__AnnotationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanceChannel__AnnotationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInstanceChannelAccess().getAnnotationsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group__7__Impl"


    // $ANTLR start "rule__InstanceChannel__Group_2__0"
    // InternalIotlang.g:2196:1: rule__InstanceChannel__Group_2__0 : rule__InstanceChannel__Group_2__0__Impl rule__InstanceChannel__Group_2__1 ;
    public final void rule__InstanceChannel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2200:1: ( rule__InstanceChannel__Group_2__0__Impl rule__InstanceChannel__Group_2__1 )
            // InternalIotlang.g:2201:2: rule__InstanceChannel__Group_2__0__Impl rule__InstanceChannel__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__InstanceChannel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group_2__1();

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
    // $ANTLR end "rule__InstanceChannel__Group_2__0"


    // $ANTLR start "rule__InstanceChannel__Group_2__0__Impl"
    // InternalIotlang.g:2208:1: rule__InstanceChannel__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstanceChannel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2212:1: ( ( '[' ) )
            // InternalIotlang.g:2213:1: ( '[' )
            {
            // InternalIotlang.g:2213:1: ( '[' )
            // InternalIotlang.g:2214:2: '['
            {
             before(grammarAccess.getInstanceChannelAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group_2__0__Impl"


    // $ANTLR start "rule__InstanceChannel__Group_2__1"
    // InternalIotlang.g:2223:1: rule__InstanceChannel__Group_2__1 : rule__InstanceChannel__Group_2__1__Impl rule__InstanceChannel__Group_2__2 ;
    public final void rule__InstanceChannel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2227:1: ( rule__InstanceChannel__Group_2__1__Impl rule__InstanceChannel__Group_2__2 )
            // InternalIotlang.g:2228:2: rule__InstanceChannel__Group_2__1__Impl rule__InstanceChannel__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__InstanceChannel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group_2__2();

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
    // $ANTLR end "rule__InstanceChannel__Group_2__1"


    // $ANTLR start "rule__InstanceChannel__Group_2__1__Impl"
    // InternalIotlang.g:2235:1: rule__InstanceChannel__Group_2__1__Impl : ( ( rule__InstanceChannel__NumberAssignment_2_1 ) ) ;
    public final void rule__InstanceChannel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2239:1: ( ( ( rule__InstanceChannel__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:2240:1: ( ( rule__InstanceChannel__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:2240:1: ( ( rule__InstanceChannel__NumberAssignment_2_1 ) )
            // InternalIotlang.g:2241:2: ( rule__InstanceChannel__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstanceChannelAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:2242:2: ( rule__InstanceChannel__NumberAssignment_2_1 )
            // InternalIotlang.g:2242:3: rule__InstanceChannel__NumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__NumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceChannelAccess().getNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group_2__1__Impl"


    // $ANTLR start "rule__InstanceChannel__Group_2__2"
    // InternalIotlang.g:2250:1: rule__InstanceChannel__Group_2__2 : rule__InstanceChannel__Group_2__2__Impl ;
    public final void rule__InstanceChannel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2254:1: ( rule__InstanceChannel__Group_2__2__Impl )
            // InternalIotlang.g:2255:2: rule__InstanceChannel__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceChannel__Group_2__2__Impl();

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
    // $ANTLR end "rule__InstanceChannel__Group_2__2"


    // $ANTLR start "rule__InstanceChannel__Group_2__2__Impl"
    // InternalIotlang.g:2261:1: rule__InstanceChannel__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstanceChannel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2265:1: ( ( ']' ) )
            // InternalIotlang.g:2266:1: ( ']' )
            {
            // InternalIotlang.g:2266:1: ( ']' )
            // InternalIotlang.g:2267:2: ']'
            {
             before(grammarAccess.getInstanceChannelAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__Group_2__2__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__0"
    // InternalIotlang.g:2277:1: rule__InstancePolicy__Group__0 : rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 ;
    public final void rule__InstancePolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2281:1: ( rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 )
            // InternalIotlang.g:2282:2: rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1
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
    // InternalIotlang.g:2289:1: rule__InstancePolicy__Group__0__Impl : ( 'instancePolicy' ) ;
    public final void rule__InstancePolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2293:1: ( ( 'instancePolicy' ) )
            // InternalIotlang.g:2294:1: ( 'instancePolicy' )
            {
            // InternalIotlang.g:2294:1: ( 'instancePolicy' )
            // InternalIotlang.g:2295:2: 'instancePolicy'
            {
             before(grammarAccess.getInstancePolicyAccess().getInstancePolicyKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalIotlang.g:2304:1: rule__InstancePolicy__Group__1 : rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 ;
    public final void rule__InstancePolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2308:1: ( rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 )
            // InternalIotlang.g:2309:2: rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalIotlang.g:2316:1: rule__InstancePolicy__Group__1__Impl : ( ( rule__InstancePolicy__NameAssignment_1 ) ) ;
    public final void rule__InstancePolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2320:1: ( ( ( rule__InstancePolicy__NameAssignment_1 ) ) )
            // InternalIotlang.g:2321:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2321:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            // InternalIotlang.g:2322:2: ( rule__InstancePolicy__NameAssignment_1 )
            {
             before(grammarAccess.getInstancePolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2323:2: ( rule__InstancePolicy__NameAssignment_1 )
            // InternalIotlang.g:2323:3: rule__InstancePolicy__NameAssignment_1
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
    // InternalIotlang.g:2331:1: rule__InstancePolicy__Group__2 : rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 ;
    public final void rule__InstancePolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2335:1: ( rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 )
            // InternalIotlang.g:2336:2: rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3
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
    // InternalIotlang.g:2343:1: rule__InstancePolicy__Group__2__Impl : ( ':' ) ;
    public final void rule__InstancePolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2347:1: ( ( ':' ) )
            // InternalIotlang.g:2348:1: ( ':' )
            {
            // InternalIotlang.g:2348:1: ( ':' )
            // InternalIotlang.g:2349:2: ':'
            {
             before(grammarAccess.getInstancePolicyAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalIotlang.g:2358:1: rule__InstancePolicy__Group__3 : rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 ;
    public final void rule__InstancePolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2362:1: ( rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 )
            // InternalIotlang.g:2363:2: rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalIotlang.g:2370:1: rule__InstancePolicy__Group__3__Impl : ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) ;
    public final void rule__InstancePolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2374:1: ( ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) )
            // InternalIotlang.g:2375:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            {
            // InternalIotlang.g:2375:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            // InternalIotlang.g:2376:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyAssignment_3()); 
            // InternalIotlang.g:2377:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            // InternalIotlang.g:2377:3: rule__InstancePolicy__TypePolicyAssignment_3
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
    // InternalIotlang.g:2385:1: rule__InstancePolicy__Group__4 : rule__InstancePolicy__Group__4__Impl ;
    public final void rule__InstancePolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2389:1: ( rule__InstancePolicy__Group__4__Impl )
            // InternalIotlang.g:2390:2: rule__InstancePolicy__Group__4__Impl
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
    // InternalIotlang.g:2396:1: rule__InstancePolicy__Group__4__Impl : ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) ;
    public final void rule__InstancePolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2400:1: ( ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) )
            // InternalIotlang.g:2401:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            {
            // InternalIotlang.g:2401:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            // InternalIotlang.g:2402:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            {
             before(grammarAccess.getInstancePolicyAccess().getAnnotationsAssignment_4()); 
            // InternalIotlang.g:2403:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ANNOTATION_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIotlang.g:2403:3: rule__InstancePolicy__AnnotationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstancePolicy__AnnotationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalIotlang.g:2412:1: rule__NetworkConfiguration__Group__0 : rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 ;
    public final void rule__NetworkConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2416:1: ( rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 )
            // InternalIotlang.g:2417:2: rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1
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
    // InternalIotlang.g:2424:1: rule__NetworkConfiguration__Group__0__Impl : ( 'networkConfiguration' ) ;
    public final void rule__NetworkConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2428:1: ( ( 'networkConfiguration' ) )
            // InternalIotlang.g:2429:1: ( 'networkConfiguration' )
            {
            // InternalIotlang.g:2429:1: ( 'networkConfiguration' )
            // InternalIotlang.g:2430:2: 'networkConfiguration'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalIotlang.g:2439:1: rule__NetworkConfiguration__Group__1 : rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 ;
    public final void rule__NetworkConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2443:1: ( rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 )
            // InternalIotlang.g:2444:2: rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2
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
    // InternalIotlang.g:2451:1: rule__NetworkConfiguration__Group__1__Impl : ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) ;
    public final void rule__NetworkConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2455:1: ( ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) )
            // InternalIotlang.g:2456:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2456:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            // InternalIotlang.g:2457:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2458:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            // InternalIotlang.g:2458:3: rule__NetworkConfiguration__NameAssignment_1
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
    // InternalIotlang.g:2466:1: rule__NetworkConfiguration__Group__2 : rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 ;
    public final void rule__NetworkConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2470:1: ( rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 )
            // InternalIotlang.g:2471:2: rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3
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
    // InternalIotlang.g:2478:1: rule__NetworkConfiguration__Group__2__Impl : ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) ;
    public final void rule__NetworkConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2482:1: ( ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:2483:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:2483:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:2484:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:2485:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ANNOTATION_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIotlang.g:2485:3: rule__NetworkConfiguration__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NetworkConfiguration__AnnotationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalIotlang.g:2493:1: rule__NetworkConfiguration__Group__3 : rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 ;
    public final void rule__NetworkConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2497:1: ( rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 )
            // InternalIotlang.g:2498:2: rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalIotlang.g:2505:1: rule__NetworkConfiguration__Group__3__Impl : ( '{' ) ;
    public final void rule__NetworkConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2509:1: ( ( '{' ) )
            // InternalIotlang.g:2510:1: ( '{' )
            {
            // InternalIotlang.g:2510:1: ( '{' )
            // InternalIotlang.g:2511:2: '{'
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
    // InternalIotlang.g:2520:1: rule__NetworkConfiguration__Group__4 : rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 ;
    public final void rule__NetworkConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2524:1: ( rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 )
            // InternalIotlang.g:2525:2: rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalIotlang.g:2532:1: rule__NetworkConfiguration__Group__4__Impl : ( ( rule__NetworkConfiguration__Alternatives_4 )* ) ;
    public final void rule__NetworkConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2536:1: ( ( ( rule__NetworkConfiguration__Alternatives_4 )* ) )
            // InternalIotlang.g:2537:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            {
            // InternalIotlang.g:2537:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            // InternalIotlang.g:2538:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAlternatives_4()); 
            // InternalIotlang.g:2539:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=33 && LA19_0<=34)||LA19_0==37||LA19_0==39||(LA19_0>=41 && LA19_0<=42)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIotlang.g:2539:3: rule__NetworkConfiguration__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__NetworkConfiguration__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalIotlang.g:2547:1: rule__NetworkConfiguration__Group__5 : rule__NetworkConfiguration__Group__5__Impl ;
    public final void rule__NetworkConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2551:1: ( rule__NetworkConfiguration__Group__5__Impl )
            // InternalIotlang.g:2552:2: rule__NetworkConfiguration__Group__5__Impl
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
    // InternalIotlang.g:2558:1: rule__NetworkConfiguration__Group__5__Impl : ( '}' ) ;
    public final void rule__NetworkConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2562:1: ( ( '}' ) )
            // InternalIotlang.g:2563:1: ( '}' )
            {
            // InternalIotlang.g:2563:1: ( '}' )
            // InternalIotlang.g:2564:2: '}'
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
    // InternalIotlang.g:2574:1: rule__NetworkConfiguration__Group_4_4__0 : rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1 ;
    public final void rule__NetworkConfiguration__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2578:1: ( rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1 )
            // InternalIotlang.g:2579:2: rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1
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
    // InternalIotlang.g:2586:1: rule__NetworkConfiguration__Group_4_4__0__Impl : ( 'enforce' ) ;
    public final void rule__NetworkConfiguration__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2590:1: ( ( 'enforce' ) )
            // InternalIotlang.g:2591:1: ( 'enforce' )
            {
            // InternalIotlang.g:2591:1: ( 'enforce' )
            // InternalIotlang.g:2592:2: 'enforce'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_4_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalIotlang.g:2601:1: rule__NetworkConfiguration__Group_4_4__1 : rule__NetworkConfiguration__Group_4_4__1__Impl ;
    public final void rule__NetworkConfiguration__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2605:1: ( rule__NetworkConfiguration__Group_4_4__1__Impl )
            // InternalIotlang.g:2606:2: rule__NetworkConfiguration__Group_4_4__1__Impl
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
    // InternalIotlang.g:2612:1: rule__NetworkConfiguration__Group_4_4__1__Impl : ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) ) ;
    public final void rule__NetworkConfiguration__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2616:1: ( ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) ) )
            // InternalIotlang.g:2617:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) )
            {
            // InternalIotlang.g:2617:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) )
            // InternalIotlang.g:2618:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesAssignment_4_4_1()); 
            // InternalIotlang.g:2619:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 )
            // InternalIotlang.g:2619:3: rule__NetworkConfiguration__EnforcesAssignment_4_4_1
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
    // InternalIotlang.g:2628:1: rule__Bind__Group__0 : rule__Bind__Group__0__Impl rule__Bind__Group__1 ;
    public final void rule__Bind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2632:1: ( rule__Bind__Group__0__Impl rule__Bind__Group__1 )
            // InternalIotlang.g:2633:2: rule__Bind__Group__0__Impl rule__Bind__Group__1
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
    // InternalIotlang.g:2640:1: rule__Bind__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Bind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2644:1: ( ( 'bind' ) )
            // InternalIotlang.g:2645:1: ( 'bind' )
            {
            // InternalIotlang.g:2645:1: ( 'bind' )
            // InternalIotlang.g:2646:2: 'bind'
            {
             before(grammarAccess.getBindAccess().getBindKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalIotlang.g:2655:1: rule__Bind__Group__1 : rule__Bind__Group__1__Impl rule__Bind__Group__2 ;
    public final void rule__Bind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2659:1: ( rule__Bind__Group__1__Impl rule__Bind__Group__2 )
            // InternalIotlang.g:2660:2: rule__Bind__Group__1__Impl rule__Bind__Group__2
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
    // InternalIotlang.g:2667:1: rule__Bind__Group__1__Impl : ( ( rule__Bind__NameAssignment_1 )? ) ;
    public final void rule__Bind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2671:1: ( ( ( rule__Bind__NameAssignment_1 )? ) )
            // InternalIotlang.g:2672:1: ( ( rule__Bind__NameAssignment_1 )? )
            {
            // InternalIotlang.g:2672:1: ( ( rule__Bind__NameAssignment_1 )? )
            // InternalIotlang.g:2673:2: ( rule__Bind__NameAssignment_1 )?
            {
             before(grammarAccess.getBindAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2674:2: ( rule__Bind__NameAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_ID) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalIotlang.g:2674:3: rule__Bind__NameAssignment_1
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
    // InternalIotlang.g:2682:1: rule__Bind__Group__2 : rule__Bind__Group__2__Impl rule__Bind__Group__3 ;
    public final void rule__Bind__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2686:1: ( rule__Bind__Group__2__Impl rule__Bind__Group__3 )
            // InternalIotlang.g:2687:2: rule__Bind__Group__2__Impl rule__Bind__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalIotlang.g:2694:1: rule__Bind__Group__2__Impl : ( ( rule__Bind__ThingInstanceAssignment_2 ) ) ;
    public final void rule__Bind__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2698:1: ( ( ( rule__Bind__ThingInstanceAssignment_2 ) ) )
            // InternalIotlang.g:2699:1: ( ( rule__Bind__ThingInstanceAssignment_2 ) )
            {
            // InternalIotlang.g:2699:1: ( ( rule__Bind__ThingInstanceAssignment_2 ) )
            // InternalIotlang.g:2700:2: ( rule__Bind__ThingInstanceAssignment_2 )
            {
             before(grammarAccess.getBindAccess().getThingInstanceAssignment_2()); 
            // InternalIotlang.g:2701:2: ( rule__Bind__ThingInstanceAssignment_2 )
            // InternalIotlang.g:2701:3: rule__Bind__ThingInstanceAssignment_2
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
    // InternalIotlang.g:2709:1: rule__Bind__Group__3 : rule__Bind__Group__3__Impl rule__Bind__Group__4 ;
    public final void rule__Bind__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2713:1: ( rule__Bind__Group__3__Impl rule__Bind__Group__4 )
            // InternalIotlang.g:2714:2: rule__Bind__Group__3__Impl rule__Bind__Group__4
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
    // InternalIotlang.g:2721:1: rule__Bind__Group__3__Impl : ( ( rule__Bind__DirectionAssignment_3 ) ) ;
    public final void rule__Bind__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2725:1: ( ( ( rule__Bind__DirectionAssignment_3 ) ) )
            // InternalIotlang.g:2726:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            {
            // InternalIotlang.g:2726:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            // InternalIotlang.g:2727:2: ( rule__Bind__DirectionAssignment_3 )
            {
             before(grammarAccess.getBindAccess().getDirectionAssignment_3()); 
            // InternalIotlang.g:2728:2: ( rule__Bind__DirectionAssignment_3 )
            // InternalIotlang.g:2728:3: rule__Bind__DirectionAssignment_3
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
    // InternalIotlang.g:2736:1: rule__Bind__Group__4 : rule__Bind__Group__4__Impl rule__Bind__Group__5 ;
    public final void rule__Bind__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2740:1: ( rule__Bind__Group__4__Impl rule__Bind__Group__5 )
            // InternalIotlang.g:2741:2: rule__Bind__Group__4__Impl rule__Bind__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalIotlang.g:2748:1: rule__Bind__Group__4__Impl : ( ( rule__Bind__ChannelInstanceAssignment_4 ) ) ;
    public final void rule__Bind__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2752:1: ( ( ( rule__Bind__ChannelInstanceAssignment_4 ) ) )
            // InternalIotlang.g:2753:1: ( ( rule__Bind__ChannelInstanceAssignment_4 ) )
            {
            // InternalIotlang.g:2753:1: ( ( rule__Bind__ChannelInstanceAssignment_4 ) )
            // InternalIotlang.g:2754:2: ( rule__Bind__ChannelInstanceAssignment_4 )
            {
             before(grammarAccess.getBindAccess().getChannelInstanceAssignment_4()); 
            // InternalIotlang.g:2755:2: ( rule__Bind__ChannelInstanceAssignment_4 )
            // InternalIotlang.g:2755:3: rule__Bind__ChannelInstanceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Bind__ChannelInstanceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getChannelInstanceAssignment_4()); 

            }


            }

        }
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
    // InternalIotlang.g:2763:1: rule__Bind__Group__5 : rule__Bind__Group__5__Impl rule__Bind__Group__6 ;
    public final void rule__Bind__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2767:1: ( rule__Bind__Group__5__Impl rule__Bind__Group__6 )
            // InternalIotlang.g:2768:2: rule__Bind__Group__5__Impl rule__Bind__Group__6
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
    // InternalIotlang.g:2775:1: rule__Bind__Group__5__Impl : ( '{' ) ;
    public final void rule__Bind__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2779:1: ( ( '{' ) )
            // InternalIotlang.g:2780:1: ( '{' )
            {
            // InternalIotlang.g:2780:1: ( '{' )
            // InternalIotlang.g:2781:2: '{'
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
    // InternalIotlang.g:2790:1: rule__Bind__Group__6 : rule__Bind__Group__6__Impl rule__Bind__Group__7 ;
    public final void rule__Bind__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2794:1: ( rule__Bind__Group__6__Impl rule__Bind__Group__7 )
            // InternalIotlang.g:2795:2: rule__Bind__Group__6__Impl rule__Bind__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalIotlang.g:2802:1: rule__Bind__Group__6__Impl : ( ( rule__Bind__TopicsAssignment_6 ) ) ;
    public final void rule__Bind__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2806:1: ( ( ( rule__Bind__TopicsAssignment_6 ) ) )
            // InternalIotlang.g:2807:1: ( ( rule__Bind__TopicsAssignment_6 ) )
            {
            // InternalIotlang.g:2807:1: ( ( rule__Bind__TopicsAssignment_6 ) )
            // InternalIotlang.g:2808:2: ( rule__Bind__TopicsAssignment_6 )
            {
             before(grammarAccess.getBindAccess().getTopicsAssignment_6()); 
            // InternalIotlang.g:2809:2: ( rule__Bind__TopicsAssignment_6 )
            // InternalIotlang.g:2809:3: rule__Bind__TopicsAssignment_6
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
    // InternalIotlang.g:2817:1: rule__Bind__Group__7 : rule__Bind__Group__7__Impl rule__Bind__Group__8 ;
    public final void rule__Bind__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2821:1: ( rule__Bind__Group__7__Impl rule__Bind__Group__8 )
            // InternalIotlang.g:2822:2: rule__Bind__Group__7__Impl rule__Bind__Group__8
            {
            pushFollow(FOLLOW_28);
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
    // InternalIotlang.g:2829:1: rule__Bind__Group__7__Impl : ( ( rule__Bind__Group_7__0 )* ) ;
    public final void rule__Bind__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2833:1: ( ( ( rule__Bind__Group_7__0 )* ) )
            // InternalIotlang.g:2834:1: ( ( rule__Bind__Group_7__0 )* )
            {
            // InternalIotlang.g:2834:1: ( ( rule__Bind__Group_7__0 )* )
            // InternalIotlang.g:2835:2: ( rule__Bind__Group_7__0 )*
            {
             before(grammarAccess.getBindAccess().getGroup_7()); 
            // InternalIotlang.g:2836:2: ( rule__Bind__Group_7__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==43) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIotlang.g:2836:3: rule__Bind__Group_7__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Bind__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalIotlang.g:2844:1: rule__Bind__Group__8 : rule__Bind__Group__8__Impl rule__Bind__Group__9 ;
    public final void rule__Bind__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2848:1: ( rule__Bind__Group__8__Impl rule__Bind__Group__9 )
            // InternalIotlang.g:2849:2: rule__Bind__Group__8__Impl rule__Bind__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalIotlang.g:2856:1: rule__Bind__Group__8__Impl : ( '}' ) ;
    public final void rule__Bind__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2860:1: ( ( '}' ) )
            // InternalIotlang.g:2861:1: ( '}' )
            {
            // InternalIotlang.g:2861:1: ( '}' )
            // InternalIotlang.g:2862:2: '}'
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
    // InternalIotlang.g:2871:1: rule__Bind__Group__9 : rule__Bind__Group__9__Impl ;
    public final void rule__Bind__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2875:1: ( rule__Bind__Group__9__Impl )
            // InternalIotlang.g:2876:2: rule__Bind__Group__9__Impl
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
    // InternalIotlang.g:2882:1: rule__Bind__Group__9__Impl : ( ( rule__Bind__AnnotationsAssignment_9 )* ) ;
    public final void rule__Bind__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2886:1: ( ( ( rule__Bind__AnnotationsAssignment_9 )* ) )
            // InternalIotlang.g:2887:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            {
            // InternalIotlang.g:2887:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            // InternalIotlang.g:2888:2: ( rule__Bind__AnnotationsAssignment_9 )*
            {
             before(grammarAccess.getBindAccess().getAnnotationsAssignment_9()); 
            // InternalIotlang.g:2889:2: ( rule__Bind__AnnotationsAssignment_9 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ANNOTATION_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIotlang.g:2889:3: rule__Bind__AnnotationsAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Bind__AnnotationsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalIotlang.g:2898:1: rule__Bind__Group_7__0 : rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 ;
    public final void rule__Bind__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2902:1: ( rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 )
            // InternalIotlang.g:2903:2: rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1
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
    // InternalIotlang.g:2910:1: rule__Bind__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Bind__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2914:1: ( ( ',' ) )
            // InternalIotlang.g:2915:1: ( ',' )
            {
            // InternalIotlang.g:2915:1: ( ',' )
            // InternalIotlang.g:2916:2: ','
            {
             before(grammarAccess.getBindAccess().getCommaKeyword_7_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalIotlang.g:2925:1: rule__Bind__Group_7__1 : rule__Bind__Group_7__1__Impl ;
    public final void rule__Bind__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2929:1: ( rule__Bind__Group_7__1__Impl )
            // InternalIotlang.g:2930:2: rule__Bind__Group_7__1__Impl
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
    // InternalIotlang.g:2936:1: rule__Bind__Group_7__1__Impl : ( ( rule__Bind__TopicsAssignment_7_1 ) ) ;
    public final void rule__Bind__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2940:1: ( ( ( rule__Bind__TopicsAssignment_7_1 ) ) )
            // InternalIotlang.g:2941:1: ( ( rule__Bind__TopicsAssignment_7_1 ) )
            {
            // InternalIotlang.g:2941:1: ( ( rule__Bind__TopicsAssignment_7_1 ) )
            // InternalIotlang.g:2942:2: ( rule__Bind__TopicsAssignment_7_1 )
            {
             before(grammarAccess.getBindAccess().getTopicsAssignment_7_1()); 
            // InternalIotlang.g:2943:2: ( rule__Bind__TopicsAssignment_7_1 )
            // InternalIotlang.g:2943:3: rule__Bind__TopicsAssignment_7_1
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
    // InternalIotlang.g:2952:1: rule__IoTLangModel__ThingsAssignment_0 : ( ruleThing ) ;
    public final void rule__IoTLangModel__ThingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2956:1: ( ( ruleThing ) )
            // InternalIotlang.g:2957:2: ( ruleThing )
            {
            // InternalIotlang.g:2957:2: ( ruleThing )
            // InternalIotlang.g:2958:3: ruleThing
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
    // InternalIotlang.g:2967:1: rule__IoTLangModel__PoliciesAssignment_1 : ( rulePolicy ) ;
    public final void rule__IoTLangModel__PoliciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2971:1: ( ( rulePolicy ) )
            // InternalIotlang.g:2972:2: ( rulePolicy )
            {
            // InternalIotlang.g:2972:2: ( rulePolicy )
            // InternalIotlang.g:2973:3: rulePolicy
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
    // InternalIotlang.g:2982:1: rule__IoTLangModel__MessagesAssignment_2 : ( ruleMessage ) ;
    public final void rule__IoTLangModel__MessagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2986:1: ( ( ruleMessage ) )
            // InternalIotlang.g:2987:2: ( ruleMessage )
            {
            // InternalIotlang.g:2987:2: ( ruleMessage )
            // InternalIotlang.g:2988:3: ruleMessage
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
    // InternalIotlang.g:2997:1: rule__IoTLangModel__ChannelsAssignment_3 : ( ruleChannel ) ;
    public final void rule__IoTLangModel__ChannelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3001:1: ( ( ruleChannel ) )
            // InternalIotlang.g:3002:2: ( ruleChannel )
            {
            // InternalIotlang.g:3002:2: ( ruleChannel )
            // InternalIotlang.g:3003:3: ruleChannel
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
    // InternalIotlang.g:3012:1: rule__IoTLangModel__ProtocolsAssignment_4 : ( ruleProtocol ) ;
    public final void rule__IoTLangModel__ProtocolsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3016:1: ( ( ruleProtocol ) )
            // InternalIotlang.g:3017:2: ( ruleProtocol )
            {
            // InternalIotlang.g:3017:2: ( ruleProtocol )
            // InternalIotlang.g:3018:3: ruleProtocol
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
    // InternalIotlang.g:3027:1: rule__IoTLangModel__ConfigsAssignment_5 : ( ruleNetworkConfiguration ) ;
    public final void rule__IoTLangModel__ConfigsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3031:1: ( ( ruleNetworkConfiguration ) )
            // InternalIotlang.g:3032:2: ( ruleNetworkConfiguration )
            {
            // InternalIotlang.g:3032:2: ( ruleNetworkConfiguration )
            // InternalIotlang.g:3033:3: ruleNetworkConfiguration
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
    // InternalIotlang.g:3042:1: rule__PlatformAnnotation__NameAssignment_0 : ( RULE_ANNOTATION_ID ) ;
    public final void rule__PlatformAnnotation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3046:1: ( ( RULE_ANNOTATION_ID ) )
            // InternalIotlang.g:3047:2: ( RULE_ANNOTATION_ID )
            {
            // InternalIotlang.g:3047:2: ( RULE_ANNOTATION_ID )
            // InternalIotlang.g:3048:3: RULE_ANNOTATION_ID
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
    // InternalIotlang.g:3057:1: rule__PlatformAnnotation__ValueAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__PlatformAnnotation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3061:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:3062:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:3062:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:3063:3: RULE_STRING_LIT
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
    // InternalIotlang.g:3072:1: rule__Thing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Thing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3076:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3077:2: ( RULE_ID )
            {
            // InternalIotlang.g:3077:2: ( RULE_ID )
            // InternalIotlang.g:3078:3: RULE_ID
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
    // InternalIotlang.g:3087:1: rule__Thing__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__Thing__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3091:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3092:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3092:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3093:3: rulePlatformAnnotation
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


    // $ANTLR start "rule__PubSub__NameAssignment_1"
    // InternalIotlang.g:3102:1: rule__PubSub__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PubSub__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3106:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3107:2: ( RULE_ID )
            {
            // InternalIotlang.g:3107:2: ( RULE_ID )
            // InternalIotlang.g:3108:3: RULE_ID
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
    // InternalIotlang.g:3117:1: rule__PubSub__HasTopicsAssignment_3 : ( ruleTopic ) ;
    public final void rule__PubSub__HasTopicsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3121:1: ( ( ruleTopic ) )
            // InternalIotlang.g:3122:2: ( ruleTopic )
            {
            // InternalIotlang.g:3122:2: ( ruleTopic )
            // InternalIotlang.g:3123:3: ruleTopic
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
    // InternalIotlang.g:3132:1: rule__PointToPoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PointToPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3136:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3137:2: ( RULE_ID )
            {
            // InternalIotlang.g:3137:2: ( RULE_ID )
            // InternalIotlang.g:3138:3: RULE_ID
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


    // $ANTLR start "rule__PointToPoint__HasTopicsAssignment_3"
    // InternalIotlang.g:3147:1: rule__PointToPoint__HasTopicsAssignment_3 : ( ruleTopic ) ;
    public final void rule__PointToPoint__HasTopicsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3151:1: ( ( ruleTopic ) )
            // InternalIotlang.g:3152:2: ( ruleTopic )
            {
            // InternalIotlang.g:3152:2: ( ruleTopic )
            // InternalIotlang.g:3153:3: ruleTopic
            {
             before(grammarAccess.getPointToPointAccess().getHasTopicsTopicParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getPointToPointAccess().getHasTopicsTopicParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointToPoint__HasTopicsAssignment_3"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalIotlang.g:3162:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3166:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3167:2: ( RULE_ID )
            {
            // InternalIotlang.g:3167:2: ( RULE_ID )
            // InternalIotlang.g:3168:3: RULE_ID
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
    // InternalIotlang.g:3177:1: rule__Policy__HasRulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Policy__HasRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3181:1: ( ( ruleRule ) )
            // InternalIotlang.g:3182:2: ( ruleRule )
            {
            // InternalIotlang.g:3182:2: ( ruleRule )
            // InternalIotlang.g:3183:3: ruleRule
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


    // $ANTLR start "rule__Protocol__NameAssignment_1"
    // InternalIotlang.g:3192:1: rule__Protocol__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Protocol__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3196:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3197:2: ( RULE_ID )
            {
            // InternalIotlang.g:3197:2: ( RULE_ID )
            // InternalIotlang.g:3198:3: RULE_ID
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
    // InternalIotlang.g:3207:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3211:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3212:2: ( RULE_ID )
            {
            // InternalIotlang.g:3212:2: ( RULE_ID )
            // InternalIotlang.g:3213:3: RULE_ID
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
    // InternalIotlang.g:3222:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3226:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3227:2: ( RULE_ID )
            {
            // InternalIotlang.g:3227:2: ( RULE_ID )
            // InternalIotlang.g:3228:3: RULE_ID
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
    // InternalIotlang.g:3237:1: rule__Topic__AcceptedMessagesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Topic__AcceptedMessagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3241:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3242:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3242:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3243:3: ( RULE_ID )
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesMessageCrossReference_3_0()); 
            // InternalIotlang.g:3244:3: ( RULE_ID )
            // InternalIotlang.g:3245:4: RULE_ID
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
    // InternalIotlang.g:3256:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3260:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3261:2: ( RULE_ID )
            {
            // InternalIotlang.g:3261:2: ( RULE_ID )
            // InternalIotlang.g:3262:3: RULE_ID
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
    // InternalIotlang.g:3271:1: rule__Rule__SubjectAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__SubjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3275:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3276:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3276:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3277:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getSubjectThingCrossReference_2_0()); 
            // InternalIotlang.g:3278:3: ( RULE_ID )
            // InternalIotlang.g:3279:4: RULE_ID
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
    // InternalIotlang.g:3290:1: rule__Rule__PermissionAssignment_3 : ( ( rule__Rule__PermissionAlternatives_3_0 ) ) ;
    public final void rule__Rule__PermissionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3294:1: ( ( ( rule__Rule__PermissionAlternatives_3_0 ) ) )
            // InternalIotlang.g:3295:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:3295:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            // InternalIotlang.g:3296:3: ( rule__Rule__PermissionAlternatives_3_0 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAlternatives_3_0()); 
            // InternalIotlang.g:3297:3: ( rule__Rule__PermissionAlternatives_3_0 )
            // InternalIotlang.g:3297:4: rule__Rule__PermissionAlternatives_3_0
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
    // InternalIotlang.g:3305:1: rule__Rule__ActionAssignment_5 : ( ( rule__Rule__ActionAlternatives_5_0 ) ) ;
    public final void rule__Rule__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3309:1: ( ( ( rule__Rule__ActionAlternatives_5_0 ) ) )
            // InternalIotlang.g:3310:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            {
            // InternalIotlang.g:3310:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            // InternalIotlang.g:3311:3: ( rule__Rule__ActionAlternatives_5_0 )
            {
             before(grammarAccess.getRuleAccess().getActionAlternatives_5_0()); 
            // InternalIotlang.g:3312:3: ( rule__Rule__ActionAlternatives_5_0 )
            // InternalIotlang.g:3312:4: rule__Rule__ActionAlternatives_5_0
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


    // $ANTLR start "rule__Rule__ObjectAssignment_6"
    // InternalIotlang.g:3320:1: rule__Rule__ObjectAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__ObjectAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3324:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3325:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3325:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3326:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getObjectThingCrossReference_6_0()); 
            // InternalIotlang.g:3327:3: ( RULE_ID )
            // InternalIotlang.g:3328:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getObjectThingIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getObjectThingIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getObjectThingCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ObjectAssignment_6"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalIotlang.g:3339:1: rule__Domain__NameAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3343:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:3344:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:3344:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:3345:3: RULE_STRING_LIT
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
    // InternalIotlang.g:3354:1: rule__InstanceThing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstanceThing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3358:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3359:2: ( RULE_ID )
            {
            // InternalIotlang.g:3359:2: ( RULE_ID )
            // InternalIotlang.g:3360:3: RULE_ID
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
    // InternalIotlang.g:3369:1: rule__InstanceThing__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstanceThing__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3373:1: ( ( RULE_INT ) )
            // InternalIotlang.g:3374:2: ( RULE_INT )
            {
            // InternalIotlang.g:3374:2: ( RULE_INT )
            // InternalIotlang.g:3375:3: RULE_INT
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
    // InternalIotlang.g:3384:1: rule__InstanceThing__TypeThingAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceThing__TypeThingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3388:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3389:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3389:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3390:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingThingCrossReference_4_0()); 
            // InternalIotlang.g:3391:3: ( RULE_ID )
            // InternalIotlang.g:3392:4: RULE_ID
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
    // InternalIotlang.g:3403:1: rule__InstanceThing__AnnotationsAssignment_5 : ( rulePlatformAnnotation ) ;
    public final void rule__InstanceThing__AnnotationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3407:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3408:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3408:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3409:3: rulePlatformAnnotation
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


    // $ANTLR start "rule__InstanceChannel__NameAssignment_1"
    // InternalIotlang.g:3418:1: rule__InstanceChannel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstanceChannel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3422:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3423:2: ( RULE_ID )
            {
            // InternalIotlang.g:3423:2: ( RULE_ID )
            // InternalIotlang.g:3424:3: RULE_ID
            {
             before(grammarAccess.getInstanceChannelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__NameAssignment_1"


    // $ANTLR start "rule__InstanceChannel__NumberAssignment_2_1"
    // InternalIotlang.g:3433:1: rule__InstanceChannel__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstanceChannel__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3437:1: ( ( RULE_INT ) )
            // InternalIotlang.g:3438:2: ( RULE_INT )
            {
            // InternalIotlang.g:3438:2: ( RULE_INT )
            // InternalIotlang.g:3439:3: RULE_INT
            {
             before(grammarAccess.getInstanceChannelAccess().getNumberINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getNumberINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__NumberAssignment_2_1"


    // $ANTLR start "rule__InstanceChannel__TypeChannelAssignment_4"
    // InternalIotlang.g:3448:1: rule__InstanceChannel__TypeChannelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceChannel__TypeChannelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3452:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3453:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3453:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3454:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceChannelAccess().getTypeChannelChannelCrossReference_4_0()); 
            // InternalIotlang.g:3455:3: ( RULE_ID )
            // InternalIotlang.g:3456:4: RULE_ID
            {
             before(grammarAccess.getInstanceChannelAccess().getTypeChannelChannelIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getTypeChannelChannelIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInstanceChannelAccess().getTypeChannelChannelCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__TypeChannelAssignment_4"


    // $ANTLR start "rule__InstanceChannel__OverProtocolAssignment_6"
    // InternalIotlang.g:3467:1: rule__InstanceChannel__OverProtocolAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceChannel__OverProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3471:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3472:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3472:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3473:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceChannelAccess().getOverProtocolProtocolCrossReference_6_0()); 
            // InternalIotlang.g:3474:3: ( RULE_ID )
            // InternalIotlang.g:3475:4: RULE_ID
            {
             before(grammarAccess.getInstanceChannelAccess().getOverProtocolProtocolIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceChannelAccess().getOverProtocolProtocolIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getInstanceChannelAccess().getOverProtocolProtocolCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__OverProtocolAssignment_6"


    // $ANTLR start "rule__InstanceChannel__AnnotationsAssignment_7"
    // InternalIotlang.g:3486:1: rule__InstanceChannel__AnnotationsAssignment_7 : ( rulePlatformAnnotation ) ;
    public final void rule__InstanceChannel__AnnotationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3490:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3491:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3491:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3492:3: rulePlatformAnnotation
            {
             before(grammarAccess.getInstanceChannelAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getInstanceChannelAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceChannel__AnnotationsAssignment_7"


    // $ANTLR start "rule__InstancePolicy__NameAssignment_1"
    // InternalIotlang.g:3501:1: rule__InstancePolicy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstancePolicy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3505:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3506:2: ( RULE_ID )
            {
            // InternalIotlang.g:3506:2: ( RULE_ID )
            // InternalIotlang.g:3507:3: RULE_ID
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
    // InternalIotlang.g:3516:1: rule__InstancePolicy__TypePolicyAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePolicy__TypePolicyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3520:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3521:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3521:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3522:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0()); 
            // InternalIotlang.g:3523:3: ( RULE_ID )
            // InternalIotlang.g:3524:4: RULE_ID
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
    // InternalIotlang.g:3535:1: rule__InstancePolicy__AnnotationsAssignment_4 : ( rulePlatformAnnotation ) ;
    public final void rule__InstancePolicy__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3539:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3540:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3540:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3541:3: rulePlatformAnnotation
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
    // InternalIotlang.g:3550:1: rule__NetworkConfiguration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NetworkConfiguration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3554:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3555:2: ( RULE_ID )
            {
            // InternalIotlang.g:3555:2: ( RULE_ID )
            // InternalIotlang.g:3556:3: RULE_ID
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
    // InternalIotlang.g:3565:1: rule__NetworkConfiguration__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__NetworkConfiguration__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3569:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3570:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3570:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3571:3: rulePlatformAnnotation
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
    // InternalIotlang.g:3580:1: rule__NetworkConfiguration__DomainAssignment_4_0 : ( ruleDomain ) ;
    public final void rule__NetworkConfiguration__DomainAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3584:1: ( ( ruleDomain ) )
            // InternalIotlang.g:3585:2: ( ruleDomain )
            {
            // InternalIotlang.g:3585:2: ( ruleDomain )
            // InternalIotlang.g:3586:3: ruleDomain
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
    // InternalIotlang.g:3595:1: rule__NetworkConfiguration__BindsAssignment_4_1 : ( ruleBind ) ;
    public final void rule__NetworkConfiguration__BindsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3599:1: ( ( ruleBind ) )
            // InternalIotlang.g:3600:2: ( ruleBind )
            {
            // InternalIotlang.g:3600:2: ( ruleBind )
            // InternalIotlang.g:3601:3: ruleBind
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
    // InternalIotlang.g:3610:1: rule__NetworkConfiguration__ThingInstancesAssignment_4_2 : ( ruleInstanceThing ) ;
    public final void rule__NetworkConfiguration__ThingInstancesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3614:1: ( ( ruleInstanceThing ) )
            // InternalIotlang.g:3615:2: ( ruleInstanceThing )
            {
            // InternalIotlang.g:3615:2: ( ruleInstanceThing )
            // InternalIotlang.g:3616:3: ruleInstanceThing
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
    // InternalIotlang.g:3625:1: rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 : ( ruleInstanceChannel ) ;
    public final void rule__NetworkConfiguration__ChannelInstancesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3629:1: ( ( ruleInstanceChannel ) )
            // InternalIotlang.g:3630:2: ( ruleInstanceChannel )
            {
            // InternalIotlang.g:3630:2: ( ruleInstanceChannel )
            // InternalIotlang.g:3631:3: ruleInstanceChannel
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
    // InternalIotlang.g:3640:1: rule__NetworkConfiguration__EnforcesAssignment_4_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__NetworkConfiguration__EnforcesAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3644:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3645:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3645:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3646:3: ( RULE_ID )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_4_1_0()); 
            // InternalIotlang.g:3647:3: ( RULE_ID )
            // InternalIotlang.g:3648:4: RULE_ID
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
    // InternalIotlang.g:3659:1: rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 : ( ruleInstancePolicy ) ;
    public final void rule__NetworkConfiguration__InstancePoliciyAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3663:1: ( ( ruleInstancePolicy ) )
            // InternalIotlang.g:3664:2: ( ruleInstancePolicy )
            {
            // InternalIotlang.g:3664:2: ( ruleInstancePolicy )
            // InternalIotlang.g:3665:3: ruleInstancePolicy
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
    // InternalIotlang.g:3674:1: rule__Bind__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3678:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3679:2: ( RULE_ID )
            {
            // InternalIotlang.g:3679:2: ( RULE_ID )
            // InternalIotlang.g:3680:3: RULE_ID
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
    // InternalIotlang.g:3689:1: rule__Bind__ThingInstanceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__ThingInstanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3693:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3694:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3694:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3695:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getThingInstanceInstanceThingCrossReference_2_0()); 
            // InternalIotlang.g:3696:3: ( RULE_ID )
            // InternalIotlang.g:3697:4: RULE_ID
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
    // InternalIotlang.g:3708:1: rule__Bind__DirectionAssignment_3 : ( ( rule__Bind__DirectionAlternatives_3_0 ) ) ;
    public final void rule__Bind__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3712:1: ( ( ( rule__Bind__DirectionAlternatives_3_0 ) ) )
            // InternalIotlang.g:3713:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:3713:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            // InternalIotlang.g:3714:3: ( rule__Bind__DirectionAlternatives_3_0 )
            {
             before(grammarAccess.getBindAccess().getDirectionAlternatives_3_0()); 
            // InternalIotlang.g:3715:3: ( rule__Bind__DirectionAlternatives_3_0 )
            // InternalIotlang.g:3715:4: rule__Bind__DirectionAlternatives_3_0
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


    // $ANTLR start "rule__Bind__ChannelInstanceAssignment_4"
    // InternalIotlang.g:3723:1: rule__Bind__ChannelInstanceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__ChannelInstanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3727:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3728:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3728:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3729:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getChannelInstanceInstanceChannelCrossReference_4_0()); 
            // InternalIotlang.g:3730:3: ( RULE_ID )
            // InternalIotlang.g:3731:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getChannelInstanceInstanceChannelIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getChannelInstanceInstanceChannelIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBindAccess().getChannelInstanceInstanceChannelCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ChannelInstanceAssignment_4"


    // $ANTLR start "rule__Bind__TopicsAssignment_6"
    // InternalIotlang.g:3742:1: rule__Bind__TopicsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__TopicsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3746:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3747:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3747:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3748:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getTopicsTopicCrossReference_6_0()); 
            // InternalIotlang.g:3749:3: ( RULE_ID )
            // InternalIotlang.g:3750:4: RULE_ID
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
    // InternalIotlang.g:3761:1: rule__Bind__TopicsAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__TopicsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3765:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3766:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3766:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3767:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getTopicsTopicCrossReference_7_1_0()); 
            // InternalIotlang.g:3768:3: ( RULE_ID )
            // InternalIotlang.g:3769:4: RULE_ID
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
    // InternalIotlang.g:3780:1: rule__Bind__AnnotationsAssignment_9 : ( rulePlatformAnnotation ) ;
    public final void rule__Bind__AnnotationsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3784:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3785:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3785:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3786:3: rulePlatformAnnotation
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001000F900002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000006A600400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000006A600000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000002L});

}