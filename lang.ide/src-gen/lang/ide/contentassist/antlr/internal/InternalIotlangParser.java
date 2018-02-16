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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_ID", "RULE_STRING_LIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'allow'", "'deny'", "'send'", "'receive'", "'=>'", "'<=>'", "'<='", "'thing'", "'{'", "'}'", "'channel:pubsub'", "'channel:ptp'", "'policy'", "'port'", "'protocol'", "'message'", "'topic'", "'('", "')'", "'rule'", "':'", "'.'", "'message:'", "'domain'", "'instanceThing'", "'['", "']'", "'instanceChannel'", "'over'", "'instancePolicy'", "'networkConfiguration'", "'enforce'", "'bind'", "','"
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

                if ( (LA1_0==20||(LA1_0>=23 && LA1_0<=25)||(LA1_0>=27 && LA1_0<=28)||LA1_0==43) ) {
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


    // $ANTLR start "entryRuleInstanceChannel"
    // InternalIotlang.g:403:1: entryRuleInstanceChannel : ruleInstanceChannel EOF ;
    public final void entryRuleInstanceChannel() throws RecognitionException {
        try {
            // InternalIotlang.g:404:1: ( ruleInstanceChannel EOF )
            // InternalIotlang.g:405:1: ruleInstanceChannel EOF
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
    // InternalIotlang.g:412:1: ruleInstanceChannel : ( ( rule__InstanceChannel__Group__0 ) ) ;
    public final void ruleInstanceChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:416:2: ( ( ( rule__InstanceChannel__Group__0 ) ) )
            // InternalIotlang.g:417:2: ( ( rule__InstanceChannel__Group__0 ) )
            {
            // InternalIotlang.g:417:2: ( ( rule__InstanceChannel__Group__0 ) )
            // InternalIotlang.g:418:3: ( rule__InstanceChannel__Group__0 )
            {
             before(grammarAccess.getInstanceChannelAccess().getGroup()); 
            // InternalIotlang.g:419:3: ( rule__InstanceChannel__Group__0 )
            // InternalIotlang.g:419:4: rule__InstanceChannel__Group__0
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
    // InternalIotlang.g:428:1: entryRuleInstancePolicy : ruleInstancePolicy EOF ;
    public final void entryRuleInstancePolicy() throws RecognitionException {
        try {
            // InternalIotlang.g:429:1: ( ruleInstancePolicy EOF )
            // InternalIotlang.g:430:1: ruleInstancePolicy EOF
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
    // InternalIotlang.g:437:1: ruleInstancePolicy : ( ( rule__InstancePolicy__Group__0 ) ) ;
    public final void ruleInstancePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:441:2: ( ( ( rule__InstancePolicy__Group__0 ) ) )
            // InternalIotlang.g:442:2: ( ( rule__InstancePolicy__Group__0 ) )
            {
            // InternalIotlang.g:442:2: ( ( rule__InstancePolicy__Group__0 ) )
            // InternalIotlang.g:443:3: ( rule__InstancePolicy__Group__0 )
            {
             before(grammarAccess.getInstancePolicyAccess().getGroup()); 
            // InternalIotlang.g:444:3: ( rule__InstancePolicy__Group__0 )
            // InternalIotlang.g:444:4: rule__InstancePolicy__Group__0
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
    // InternalIotlang.g:453:1: entryRuleNetworkConfiguration : ruleNetworkConfiguration EOF ;
    public final void entryRuleNetworkConfiguration() throws RecognitionException {
        try {
            // InternalIotlang.g:454:1: ( ruleNetworkConfiguration EOF )
            // InternalIotlang.g:455:1: ruleNetworkConfiguration EOF
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
    // InternalIotlang.g:462:1: ruleNetworkConfiguration : ( ( rule__NetworkConfiguration__Group__0 ) ) ;
    public final void ruleNetworkConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:466:2: ( ( ( rule__NetworkConfiguration__Group__0 ) ) )
            // InternalIotlang.g:467:2: ( ( rule__NetworkConfiguration__Group__0 ) )
            {
            // InternalIotlang.g:467:2: ( ( rule__NetworkConfiguration__Group__0 ) )
            // InternalIotlang.g:468:3: ( rule__NetworkConfiguration__Group__0 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getGroup()); 
            // InternalIotlang.g:469:3: ( rule__NetworkConfiguration__Group__0 )
            // InternalIotlang.g:469:4: rule__NetworkConfiguration__Group__0
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
    // InternalIotlang.g:478:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // InternalIotlang.g:479:1: ( ruleBind EOF )
            // InternalIotlang.g:480:1: ruleBind EOF
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
    // InternalIotlang.g:487:1: ruleBind : ( ( rule__Bind__Group__0 ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:491:2: ( ( ( rule__Bind__Group__0 ) ) )
            // InternalIotlang.g:492:2: ( ( rule__Bind__Group__0 ) )
            {
            // InternalIotlang.g:492:2: ( ( rule__Bind__Group__0 ) )
            // InternalIotlang.g:493:3: ( rule__Bind__Group__0 )
            {
             before(grammarAccess.getBindAccess().getGroup()); 
            // InternalIotlang.g:494:3: ( rule__Bind__Group__0 )
            // InternalIotlang.g:494:4: rule__Bind__Group__0
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
    // InternalIotlang.g:502:1: rule__IoTLangModel__Alternatives : ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__MessagesAssignment_2 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_3 ) ) | ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_5 ) ) );
    public final void rule__IoTLangModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:506:1: ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__MessagesAssignment_2 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_3 ) ) | ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_5 ) ) )
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
            case 43:
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
                    // InternalIotlang.g:507:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    {
                    // InternalIotlang.g:507:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    // InternalIotlang.g:508:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getThingsAssignment_0()); 
                    // InternalIotlang.g:509:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    // InternalIotlang.g:509:4: rule__IoTLangModel__ThingsAssignment_0
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
                    // InternalIotlang.g:513:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    {
                    // InternalIotlang.g:513:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    // InternalIotlang.g:514:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getPoliciesAssignment_1()); 
                    // InternalIotlang.g:515:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    // InternalIotlang.g:515:4: rule__IoTLangModel__PoliciesAssignment_1
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
                    // InternalIotlang.g:519:2: ( ( rule__IoTLangModel__MessagesAssignment_2 ) )
                    {
                    // InternalIotlang.g:519:2: ( ( rule__IoTLangModel__MessagesAssignment_2 ) )
                    // InternalIotlang.g:520:3: ( rule__IoTLangModel__MessagesAssignment_2 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getMessagesAssignment_2()); 
                    // InternalIotlang.g:521:3: ( rule__IoTLangModel__MessagesAssignment_2 )
                    // InternalIotlang.g:521:4: rule__IoTLangModel__MessagesAssignment_2
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
                    // InternalIotlang.g:525:2: ( ( rule__IoTLangModel__ChannelsAssignment_3 ) )
                    {
                    // InternalIotlang.g:525:2: ( ( rule__IoTLangModel__ChannelsAssignment_3 ) )
                    // InternalIotlang.g:526:3: ( rule__IoTLangModel__ChannelsAssignment_3 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getChannelsAssignment_3()); 
                    // InternalIotlang.g:527:3: ( rule__IoTLangModel__ChannelsAssignment_3 )
                    // InternalIotlang.g:527:4: rule__IoTLangModel__ChannelsAssignment_3
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
                    // InternalIotlang.g:531:2: ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) )
                    {
                    // InternalIotlang.g:531:2: ( ( rule__IoTLangModel__ProtocolsAssignment_4 ) )
                    // InternalIotlang.g:532:3: ( rule__IoTLangModel__ProtocolsAssignment_4 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getProtocolsAssignment_4()); 
                    // InternalIotlang.g:533:3: ( rule__IoTLangModel__ProtocolsAssignment_4 )
                    // InternalIotlang.g:533:4: rule__IoTLangModel__ProtocolsAssignment_4
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
                    // InternalIotlang.g:537:2: ( ( rule__IoTLangModel__ConfigsAssignment_5 ) )
                    {
                    // InternalIotlang.g:537:2: ( ( rule__IoTLangModel__ConfigsAssignment_5 ) )
                    // InternalIotlang.g:538:3: ( rule__IoTLangModel__ConfigsAssignment_5 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getConfigsAssignment_5()); 
                    // InternalIotlang.g:539:3: ( rule__IoTLangModel__ConfigsAssignment_5 )
                    // InternalIotlang.g:539:4: rule__IoTLangModel__ConfigsAssignment_5
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
    // InternalIotlang.g:547:1: rule__Channel__Alternatives : ( ( rulePubSub ) | ( rulePointToPoint ) );
    public final void rule__Channel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:551:1: ( ( rulePubSub ) | ( rulePointToPoint ) )
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
                    // InternalIotlang.g:552:2: ( rulePubSub )
                    {
                    // InternalIotlang.g:552:2: ( rulePubSub )
                    // InternalIotlang.g:553:3: rulePubSub
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
                    // InternalIotlang.g:558:2: ( rulePointToPoint )
                    {
                    // InternalIotlang.g:558:2: ( rulePointToPoint )
                    // InternalIotlang.g:559:3: rulePointToPoint
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
    // InternalIotlang.g:568:1: rule__Rule__PermissionAlternatives_3_0 : ( ( 'allow' ) | ( 'deny' ) );
    public final void rule__Rule__PermissionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:572:1: ( ( 'allow' ) | ( 'deny' ) )
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
                    // InternalIotlang.g:573:2: ( 'allow' )
                    {
                    // InternalIotlang.g:573:2: ( 'allow' )
                    // InternalIotlang.g:574:3: 'allow'
                    {
                     before(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:579:2: ( 'deny' )
                    {
                    // InternalIotlang.g:579:2: ( 'deny' )
                    // InternalIotlang.g:580:3: 'deny'
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
    // InternalIotlang.g:589:1: rule__Rule__ActionAlternatives_5_0 : ( ( 'send' ) | ( 'receive' ) );
    public final void rule__Rule__ActionAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:593:1: ( ( 'send' ) | ( 'receive' ) )
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
                    // InternalIotlang.g:594:2: ( 'send' )
                    {
                    // InternalIotlang.g:594:2: ( 'send' )
                    // InternalIotlang.g:595:3: 'send'
                    {
                     before(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:600:2: ( 'receive' )
                    {
                    // InternalIotlang.g:600:2: ( 'receive' )
                    // InternalIotlang.g:601:3: 'receive'
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
    // InternalIotlang.g:610:1: rule__Rule__Alternatives_6 : ( ( ( rule__Rule__Group_6_0__0 ) ) | ( ( rule__Rule__Group_6_1__0 ) ) );
    public final void rule__Rule__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:614:1: ( ( ( rule__Rule__Group_6_0__0 ) ) | ( ( rule__Rule__Group_6_1__0 ) ) )
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
                    // InternalIotlang.g:615:2: ( ( rule__Rule__Group_6_0__0 ) )
                    {
                    // InternalIotlang.g:615:2: ( ( rule__Rule__Group_6_0__0 ) )
                    // InternalIotlang.g:616:3: ( rule__Rule__Group_6_0__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_6_0()); 
                    // InternalIotlang.g:617:3: ( rule__Rule__Group_6_0__0 )
                    // InternalIotlang.g:617:4: rule__Rule__Group_6_0__0
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
                    // InternalIotlang.g:621:2: ( ( rule__Rule__Group_6_1__0 ) )
                    {
                    // InternalIotlang.g:621:2: ( ( rule__Rule__Group_6_1__0 ) )
                    // InternalIotlang.g:622:3: ( rule__Rule__Group_6_1__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_6_1()); 
                    // InternalIotlang.g:623:3: ( rule__Rule__Group_6_1__0 )
                    // InternalIotlang.g:623:4: rule__Rule__Group_6_1__0
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


    // $ANTLR start "rule__NetworkConfiguration__Alternatives_4"
    // InternalIotlang.g:631:1: rule__NetworkConfiguration__Alternatives_4 : ( ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__Group_4_4__0 ) ) | ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) ) );
    public final void rule__NetworkConfiguration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:635:1: ( ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__Group_4_4__0 ) ) | ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt7=1;
                }
                break;
            case 45:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            case 40:
                {
                alt7=4;
                }
                break;
            case 44:
                {
                alt7=5;
                }
                break;
            case 42:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIotlang.g:636:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) )
                    {
                    // InternalIotlang.g:636:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) )
                    // InternalIotlang.g:637:3: ( rule__NetworkConfiguration__DomainAssignment_4_0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getDomainAssignment_4_0()); 
                    // InternalIotlang.g:638:3: ( rule__NetworkConfiguration__DomainAssignment_4_0 )
                    // InternalIotlang.g:638:4: rule__NetworkConfiguration__DomainAssignment_4_0
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
                    // InternalIotlang.g:642:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) )
                    {
                    // InternalIotlang.g:642:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) )
                    // InternalIotlang.g:643:3: ( rule__NetworkConfiguration__BindsAssignment_4_1 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getBindsAssignment_4_1()); 
                    // InternalIotlang.g:644:3: ( rule__NetworkConfiguration__BindsAssignment_4_1 )
                    // InternalIotlang.g:644:4: rule__NetworkConfiguration__BindsAssignment_4_1
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
                    // InternalIotlang.g:648:2: ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) )
                    {
                    // InternalIotlang.g:648:2: ( ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 ) )
                    // InternalIotlang.g:649:3: ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getThingInstancesAssignment_4_2()); 
                    // InternalIotlang.g:650:3: ( rule__NetworkConfiguration__ThingInstancesAssignment_4_2 )
                    // InternalIotlang.g:650:4: rule__NetworkConfiguration__ThingInstancesAssignment_4_2
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
                    // InternalIotlang.g:654:2: ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) )
                    {
                    // InternalIotlang.g:654:2: ( ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 ) )
                    // InternalIotlang.g:655:3: ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesAssignment_4_3()); 
                    // InternalIotlang.g:656:3: ( rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 )
                    // InternalIotlang.g:656:4: rule__NetworkConfiguration__ChannelInstancesAssignment_4_3
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
                    // InternalIotlang.g:660:2: ( ( rule__NetworkConfiguration__Group_4_4__0 ) )
                    {
                    // InternalIotlang.g:660:2: ( ( rule__NetworkConfiguration__Group_4_4__0 ) )
                    // InternalIotlang.g:661:3: ( rule__NetworkConfiguration__Group_4_4__0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getGroup_4_4()); 
                    // InternalIotlang.g:662:3: ( rule__NetworkConfiguration__Group_4_4__0 )
                    // InternalIotlang.g:662:4: rule__NetworkConfiguration__Group_4_4__0
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
                    // InternalIotlang.g:666:2: ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) )
                    {
                    // InternalIotlang.g:666:2: ( ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 ) )
                    // InternalIotlang.g:667:3: ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyAssignment_4_5()); 
                    // InternalIotlang.g:668:3: ( rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 )
                    // InternalIotlang.g:668:4: rule__NetworkConfiguration__InstancePoliciyAssignment_4_5
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
    // InternalIotlang.g:676:1: rule__Bind__DirectionAlternatives_3_0 : ( ( '=>' ) | ( '<=>' ) | ( '<=' ) );
    public final void rule__Bind__DirectionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:680:1: ( ( '=>' ) | ( '<=>' ) | ( '<=' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalIotlang.g:681:2: ( '=>' )
                    {
                    // InternalIotlang.g:681:2: ( '=>' )
                    // InternalIotlang.g:682:3: '=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:687:2: ( '<=>' )
                    {
                    // InternalIotlang.g:687:2: ( '<=>' )
                    // InternalIotlang.g:688:3: '<=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:693:2: ( '<=' )
                    {
                    // InternalIotlang.g:693:2: ( '<=' )
                    // InternalIotlang.g:694:3: '<='
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
    // InternalIotlang.g:703:1: rule__PlatformAnnotation__Group__0 : rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 ;
    public final void rule__PlatformAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:707:1: ( rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 )
            // InternalIotlang.g:708:2: rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1
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
    // InternalIotlang.g:715:1: rule__PlatformAnnotation__Group__0__Impl : ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) ;
    public final void rule__PlatformAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:719:1: ( ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) )
            // InternalIotlang.g:720:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            {
            // InternalIotlang.g:720:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            // InternalIotlang.g:721:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0()); 
            // InternalIotlang.g:722:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            // InternalIotlang.g:722:3: rule__PlatformAnnotation__NameAssignment_0
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
    // InternalIotlang.g:730:1: rule__PlatformAnnotation__Group__1 : rule__PlatformAnnotation__Group__1__Impl ;
    public final void rule__PlatformAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:734:1: ( rule__PlatformAnnotation__Group__1__Impl )
            // InternalIotlang.g:735:2: rule__PlatformAnnotation__Group__1__Impl
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
    // InternalIotlang.g:741:1: rule__PlatformAnnotation__Group__1__Impl : ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) ;
    public final void rule__PlatformAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:745:1: ( ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) )
            // InternalIotlang.g:746:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            {
            // InternalIotlang.g:746:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            // InternalIotlang.g:747:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1()); 
            // InternalIotlang.g:748:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            // InternalIotlang.g:748:3: rule__PlatformAnnotation__ValueAssignment_1
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
    // InternalIotlang.g:757:1: rule__Thing__Group__0 : rule__Thing__Group__0__Impl rule__Thing__Group__1 ;
    public final void rule__Thing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:761:1: ( rule__Thing__Group__0__Impl rule__Thing__Group__1 )
            // InternalIotlang.g:762:2: rule__Thing__Group__0__Impl rule__Thing__Group__1
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
    // InternalIotlang.g:769:1: rule__Thing__Group__0__Impl : ( 'thing' ) ;
    public final void rule__Thing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:773:1: ( ( 'thing' ) )
            // InternalIotlang.g:774:1: ( 'thing' )
            {
            // InternalIotlang.g:774:1: ( 'thing' )
            // InternalIotlang.g:775:2: 'thing'
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
    // InternalIotlang.g:784:1: rule__Thing__Group__1 : rule__Thing__Group__1__Impl rule__Thing__Group__2 ;
    public final void rule__Thing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:788:1: ( rule__Thing__Group__1__Impl rule__Thing__Group__2 )
            // InternalIotlang.g:789:2: rule__Thing__Group__1__Impl rule__Thing__Group__2
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
    // InternalIotlang.g:796:1: rule__Thing__Group__1__Impl : ( ( rule__Thing__NameAssignment_1 ) ) ;
    public final void rule__Thing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:800:1: ( ( ( rule__Thing__NameAssignment_1 ) ) )
            // InternalIotlang.g:801:1: ( ( rule__Thing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:801:1: ( ( rule__Thing__NameAssignment_1 ) )
            // InternalIotlang.g:802:2: ( rule__Thing__NameAssignment_1 )
            {
             before(grammarAccess.getThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:803:2: ( rule__Thing__NameAssignment_1 )
            // InternalIotlang.g:803:3: rule__Thing__NameAssignment_1
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
    // InternalIotlang.g:811:1: rule__Thing__Group__2 : rule__Thing__Group__2__Impl rule__Thing__Group__3 ;
    public final void rule__Thing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:815:1: ( rule__Thing__Group__2__Impl rule__Thing__Group__3 )
            // InternalIotlang.g:816:2: rule__Thing__Group__2__Impl rule__Thing__Group__3
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
    // InternalIotlang.g:823:1: rule__Thing__Group__2__Impl : ( ( rule__Thing__AnnotationsAssignment_2 )* ) ;
    public final void rule__Thing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:827:1: ( ( ( rule__Thing__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:828:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:828:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:829:2: ( rule__Thing__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getThingAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:830:2: ( rule__Thing__AnnotationsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ANNOTATION_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIotlang.g:830:3: rule__Thing__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Thing__AnnotationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalIotlang.g:838:1: rule__Thing__Group__3 : rule__Thing__Group__3__Impl rule__Thing__Group__4 ;
    public final void rule__Thing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:842:1: ( rule__Thing__Group__3__Impl rule__Thing__Group__4 )
            // InternalIotlang.g:843:2: rule__Thing__Group__3__Impl rule__Thing__Group__4
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
    // InternalIotlang.g:850:1: rule__Thing__Group__3__Impl : ( '{' ) ;
    public final void rule__Thing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:854:1: ( ( '{' ) )
            // InternalIotlang.g:855:1: ( '{' )
            {
            // InternalIotlang.g:855:1: ( '{' )
            // InternalIotlang.g:856:2: '{'
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
    // InternalIotlang.g:865:1: rule__Thing__Group__4 : rule__Thing__Group__4__Impl rule__Thing__Group__5 ;
    public final void rule__Thing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:869:1: ( rule__Thing__Group__4__Impl rule__Thing__Group__5 )
            // InternalIotlang.g:870:2: rule__Thing__Group__4__Impl rule__Thing__Group__5
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
    // InternalIotlang.g:877:1: rule__Thing__Group__4__Impl : ( ( rule__Thing__PortsAssignment_4 ) ) ;
    public final void rule__Thing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:881:1: ( ( ( rule__Thing__PortsAssignment_4 ) ) )
            // InternalIotlang.g:882:1: ( ( rule__Thing__PortsAssignment_4 ) )
            {
            // InternalIotlang.g:882:1: ( ( rule__Thing__PortsAssignment_4 ) )
            // InternalIotlang.g:883:2: ( rule__Thing__PortsAssignment_4 )
            {
             before(grammarAccess.getThingAccess().getPortsAssignment_4()); 
            // InternalIotlang.g:884:2: ( rule__Thing__PortsAssignment_4 )
            // InternalIotlang.g:884:3: rule__Thing__PortsAssignment_4
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
    // InternalIotlang.g:892:1: rule__Thing__Group__5 : rule__Thing__Group__5__Impl ;
    public final void rule__Thing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:896:1: ( rule__Thing__Group__5__Impl )
            // InternalIotlang.g:897:2: rule__Thing__Group__5__Impl
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
    // InternalIotlang.g:903:1: rule__Thing__Group__5__Impl : ( '}' ) ;
    public final void rule__Thing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:907:1: ( ( '}' ) )
            // InternalIotlang.g:908:1: ( '}' )
            {
            // InternalIotlang.g:908:1: ( '}' )
            // InternalIotlang.g:909:2: '}'
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
    // InternalIotlang.g:919:1: rule__PubSub__Group__0 : rule__PubSub__Group__0__Impl rule__PubSub__Group__1 ;
    public final void rule__PubSub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:923:1: ( rule__PubSub__Group__0__Impl rule__PubSub__Group__1 )
            // InternalIotlang.g:924:2: rule__PubSub__Group__0__Impl rule__PubSub__Group__1
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
    // InternalIotlang.g:931:1: rule__PubSub__Group__0__Impl : ( 'channel:pubsub' ) ;
    public final void rule__PubSub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:935:1: ( ( 'channel:pubsub' ) )
            // InternalIotlang.g:936:1: ( 'channel:pubsub' )
            {
            // InternalIotlang.g:936:1: ( 'channel:pubsub' )
            // InternalIotlang.g:937:2: 'channel:pubsub'
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
    // InternalIotlang.g:946:1: rule__PubSub__Group__1 : rule__PubSub__Group__1__Impl rule__PubSub__Group__2 ;
    public final void rule__PubSub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:950:1: ( rule__PubSub__Group__1__Impl rule__PubSub__Group__2 )
            // InternalIotlang.g:951:2: rule__PubSub__Group__1__Impl rule__PubSub__Group__2
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
    // InternalIotlang.g:958:1: rule__PubSub__Group__1__Impl : ( ( rule__PubSub__NameAssignment_1 ) ) ;
    public final void rule__PubSub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:962:1: ( ( ( rule__PubSub__NameAssignment_1 ) ) )
            // InternalIotlang.g:963:1: ( ( rule__PubSub__NameAssignment_1 ) )
            {
            // InternalIotlang.g:963:1: ( ( rule__PubSub__NameAssignment_1 ) )
            // InternalIotlang.g:964:2: ( rule__PubSub__NameAssignment_1 )
            {
             before(grammarAccess.getPubSubAccess().getNameAssignment_1()); 
            // InternalIotlang.g:965:2: ( rule__PubSub__NameAssignment_1 )
            // InternalIotlang.g:965:3: rule__PubSub__NameAssignment_1
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
    // InternalIotlang.g:973:1: rule__PubSub__Group__2 : rule__PubSub__Group__2__Impl rule__PubSub__Group__3 ;
    public final void rule__PubSub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:977:1: ( rule__PubSub__Group__2__Impl rule__PubSub__Group__3 )
            // InternalIotlang.g:978:2: rule__PubSub__Group__2__Impl rule__PubSub__Group__3
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
    // InternalIotlang.g:985:1: rule__PubSub__Group__2__Impl : ( '{' ) ;
    public final void rule__PubSub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:989:1: ( ( '{' ) )
            // InternalIotlang.g:990:1: ( '{' )
            {
            // InternalIotlang.g:990:1: ( '{' )
            // InternalIotlang.g:991:2: '{'
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
    // InternalIotlang.g:1000:1: rule__PubSub__Group__3 : rule__PubSub__Group__3__Impl rule__PubSub__Group__4 ;
    public final void rule__PubSub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1004:1: ( rule__PubSub__Group__3__Impl rule__PubSub__Group__4 )
            // InternalIotlang.g:1005:2: rule__PubSub__Group__3__Impl rule__PubSub__Group__4
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
    // InternalIotlang.g:1012:1: rule__PubSub__Group__3__Impl : ( ( rule__PubSub__HasTopicsAssignment_3 )* ) ;
    public final void rule__PubSub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1016:1: ( ( ( rule__PubSub__HasTopicsAssignment_3 )* ) )
            // InternalIotlang.g:1017:1: ( ( rule__PubSub__HasTopicsAssignment_3 )* )
            {
            // InternalIotlang.g:1017:1: ( ( rule__PubSub__HasTopicsAssignment_3 )* )
            // InternalIotlang.g:1018:2: ( rule__PubSub__HasTopicsAssignment_3 )*
            {
             before(grammarAccess.getPubSubAccess().getHasTopicsAssignment_3()); 
            // InternalIotlang.g:1019:2: ( rule__PubSub__HasTopicsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIotlang.g:1019:3: rule__PubSub__HasTopicsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PubSub__HasTopicsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalIotlang.g:1027:1: rule__PubSub__Group__4 : rule__PubSub__Group__4__Impl ;
    public final void rule__PubSub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1031:1: ( rule__PubSub__Group__4__Impl )
            // InternalIotlang.g:1032:2: rule__PubSub__Group__4__Impl
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
    // InternalIotlang.g:1038:1: rule__PubSub__Group__4__Impl : ( '}' ) ;
    public final void rule__PubSub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1042:1: ( ( '}' ) )
            // InternalIotlang.g:1043:1: ( '}' )
            {
            // InternalIotlang.g:1043:1: ( '}' )
            // InternalIotlang.g:1044:2: '}'
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
    // InternalIotlang.g:1054:1: rule__PointToPoint__Group__0 : rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1 ;
    public final void rule__PointToPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1058:1: ( rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1 )
            // InternalIotlang.g:1059:2: rule__PointToPoint__Group__0__Impl rule__PointToPoint__Group__1
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
    // InternalIotlang.g:1066:1: rule__PointToPoint__Group__0__Impl : ( 'channel:ptp' ) ;
    public final void rule__PointToPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1070:1: ( ( 'channel:ptp' ) )
            // InternalIotlang.g:1071:1: ( 'channel:ptp' )
            {
            // InternalIotlang.g:1071:1: ( 'channel:ptp' )
            // InternalIotlang.g:1072:2: 'channel:ptp'
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
    // InternalIotlang.g:1081:1: rule__PointToPoint__Group__1 : rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2 ;
    public final void rule__PointToPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1085:1: ( rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2 )
            // InternalIotlang.g:1086:2: rule__PointToPoint__Group__1__Impl rule__PointToPoint__Group__2
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
    // InternalIotlang.g:1093:1: rule__PointToPoint__Group__1__Impl : ( ( rule__PointToPoint__NameAssignment_1 ) ) ;
    public final void rule__PointToPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1097:1: ( ( ( rule__PointToPoint__NameAssignment_1 ) ) )
            // InternalIotlang.g:1098:1: ( ( rule__PointToPoint__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1098:1: ( ( rule__PointToPoint__NameAssignment_1 ) )
            // InternalIotlang.g:1099:2: ( rule__PointToPoint__NameAssignment_1 )
            {
             before(grammarAccess.getPointToPointAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1100:2: ( rule__PointToPoint__NameAssignment_1 )
            // InternalIotlang.g:1100:3: rule__PointToPoint__NameAssignment_1
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
    // InternalIotlang.g:1108:1: rule__PointToPoint__Group__2 : rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3 ;
    public final void rule__PointToPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1112:1: ( rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3 )
            // InternalIotlang.g:1113:2: rule__PointToPoint__Group__2__Impl rule__PointToPoint__Group__3
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
    // InternalIotlang.g:1120:1: rule__PointToPoint__Group__2__Impl : ( '{' ) ;
    public final void rule__PointToPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1124:1: ( ( '{' ) )
            // InternalIotlang.g:1125:1: ( '{' )
            {
            // InternalIotlang.g:1125:1: ( '{' )
            // InternalIotlang.g:1126:2: '{'
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
    // InternalIotlang.g:1135:1: rule__PointToPoint__Group__3 : rule__PointToPoint__Group__3__Impl ;
    public final void rule__PointToPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1139:1: ( rule__PointToPoint__Group__3__Impl )
            // InternalIotlang.g:1140:2: rule__PointToPoint__Group__3__Impl
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
    // InternalIotlang.g:1146:1: rule__PointToPoint__Group__3__Impl : ( '}' ) ;
    public final void rule__PointToPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1150:1: ( ( '}' ) )
            // InternalIotlang.g:1151:1: ( '}' )
            {
            // InternalIotlang.g:1151:1: ( '}' )
            // InternalIotlang.g:1152:2: '}'
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
    // InternalIotlang.g:1162:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1166:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalIotlang.g:1167:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
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
    // InternalIotlang.g:1174:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1178:1: ( ( 'policy' ) )
            // InternalIotlang.g:1179:1: ( 'policy' )
            {
            // InternalIotlang.g:1179:1: ( 'policy' )
            // InternalIotlang.g:1180:2: 'policy'
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
    // InternalIotlang.g:1189:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1193:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalIotlang.g:1194:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
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
    // InternalIotlang.g:1201:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1205:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalIotlang.g:1206:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1206:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalIotlang.g:1207:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1208:2: ( rule__Policy__NameAssignment_1 )
            // InternalIotlang.g:1208:3: rule__Policy__NameAssignment_1
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
    // InternalIotlang.g:1216:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1220:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalIotlang.g:1221:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
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
    // InternalIotlang.g:1228:1: rule__Policy__Group__2__Impl : ( '{' ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1232:1: ( ( '{' ) )
            // InternalIotlang.g:1233:1: ( '{' )
            {
            // InternalIotlang.g:1233:1: ( '{' )
            // InternalIotlang.g:1234:2: '{'
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
    // InternalIotlang.g:1243:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1247:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalIotlang.g:1248:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
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
    // InternalIotlang.g:1255:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__HasRulesAssignment_3 )* ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1259:1: ( ( ( rule__Policy__HasRulesAssignment_3 )* ) )
            // InternalIotlang.g:1260:1: ( ( rule__Policy__HasRulesAssignment_3 )* )
            {
            // InternalIotlang.g:1260:1: ( ( rule__Policy__HasRulesAssignment_3 )* )
            // InternalIotlang.g:1261:2: ( rule__Policy__HasRulesAssignment_3 )*
            {
             before(grammarAccess.getPolicyAccess().getHasRulesAssignment_3()); 
            // InternalIotlang.g:1262:2: ( rule__Policy__HasRulesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIotlang.g:1262:3: rule__Policy__HasRulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalIotlang.g:1270:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1274:1: ( rule__Policy__Group__4__Impl )
            // InternalIotlang.g:1275:2: rule__Policy__Group__4__Impl
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
    // InternalIotlang.g:1281:1: rule__Policy__Group__4__Impl : ( '}' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1285:1: ( ( '}' ) )
            // InternalIotlang.g:1286:1: ( '}' )
            {
            // InternalIotlang.g:1286:1: ( '}' )
            // InternalIotlang.g:1287:2: '}'
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
    // InternalIotlang.g:1297:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1301:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalIotlang.g:1302:2: rule__Port__Group__0__Impl rule__Port__Group__1
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
    // InternalIotlang.g:1309:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1313:1: ( ( 'port' ) )
            // InternalIotlang.g:1314:1: ( 'port' )
            {
            // InternalIotlang.g:1314:1: ( 'port' )
            // InternalIotlang.g:1315:2: 'port'
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
    // InternalIotlang.g:1324:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1328:1: ( rule__Port__Group__1__Impl )
            // InternalIotlang.g:1329:2: rule__Port__Group__1__Impl
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
    // InternalIotlang.g:1335:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1339:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // InternalIotlang.g:1340:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1340:1: ( ( rule__Port__NameAssignment_1 ) )
            // InternalIotlang.g:1341:2: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1342:2: ( rule__Port__NameAssignment_1 )
            // InternalIotlang.g:1342:3: rule__Port__NameAssignment_1
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
    // InternalIotlang.g:1351:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1355:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalIotlang.g:1356:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
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
    // InternalIotlang.g:1363:1: rule__Protocol__Group__0__Impl : ( 'protocol' ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1367:1: ( ( 'protocol' ) )
            // InternalIotlang.g:1368:1: ( 'protocol' )
            {
            // InternalIotlang.g:1368:1: ( 'protocol' )
            // InternalIotlang.g:1369:2: 'protocol'
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
    // InternalIotlang.g:1378:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1382:1: ( rule__Protocol__Group__1__Impl )
            // InternalIotlang.g:1383:2: rule__Protocol__Group__1__Impl
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
    // InternalIotlang.g:1389:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__NameAssignment_1 ) ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1393:1: ( ( ( rule__Protocol__NameAssignment_1 ) ) )
            // InternalIotlang.g:1394:1: ( ( rule__Protocol__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1394:1: ( ( rule__Protocol__NameAssignment_1 ) )
            // InternalIotlang.g:1395:2: ( rule__Protocol__NameAssignment_1 )
            {
             before(grammarAccess.getProtocolAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1396:2: ( rule__Protocol__NameAssignment_1 )
            // InternalIotlang.g:1396:3: rule__Protocol__NameAssignment_1
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
    // InternalIotlang.g:1405:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1409:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalIotlang.g:1410:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalIotlang.g:1417:1: rule__Message__Group__0__Impl : ( 'message' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1421:1: ( ( 'message' ) )
            // InternalIotlang.g:1422:1: ( 'message' )
            {
            // InternalIotlang.g:1422:1: ( 'message' )
            // InternalIotlang.g:1423:2: 'message'
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
    // InternalIotlang.g:1432:1: rule__Message__Group__1 : rule__Message__Group__1__Impl ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1436:1: ( rule__Message__Group__1__Impl )
            // InternalIotlang.g:1437:2: rule__Message__Group__1__Impl
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
    // InternalIotlang.g:1443:1: rule__Message__Group__1__Impl : ( ( rule__Message__NameAssignment_1 ) ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1447:1: ( ( ( rule__Message__NameAssignment_1 ) ) )
            // InternalIotlang.g:1448:1: ( ( rule__Message__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1448:1: ( ( rule__Message__NameAssignment_1 ) )
            // InternalIotlang.g:1449:2: ( rule__Message__NameAssignment_1 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1450:2: ( rule__Message__NameAssignment_1 )
            // InternalIotlang.g:1450:3: rule__Message__NameAssignment_1
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
    // InternalIotlang.g:1459:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1463:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // InternalIotlang.g:1464:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
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
    // InternalIotlang.g:1471:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1475:1: ( ( 'topic' ) )
            // InternalIotlang.g:1476:1: ( 'topic' )
            {
            // InternalIotlang.g:1476:1: ( 'topic' )
            // InternalIotlang.g:1477:2: 'topic'
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
    // InternalIotlang.g:1486:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1490:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // InternalIotlang.g:1491:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
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
    // InternalIotlang.g:1498:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1502:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // InternalIotlang.g:1503:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1503:1: ( ( rule__Topic__NameAssignment_1 ) )
            // InternalIotlang.g:1504:2: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1505:2: ( rule__Topic__NameAssignment_1 )
            // InternalIotlang.g:1505:3: rule__Topic__NameAssignment_1
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
    // InternalIotlang.g:1513:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1517:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // InternalIotlang.g:1518:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
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
    // InternalIotlang.g:1525:1: rule__Topic__Group__2__Impl : ( '(' ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1529:1: ( ( '(' ) )
            // InternalIotlang.g:1530:1: ( '(' )
            {
            // InternalIotlang.g:1530:1: ( '(' )
            // InternalIotlang.g:1531:2: '('
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
    // InternalIotlang.g:1540:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1544:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // InternalIotlang.g:1545:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
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
    // InternalIotlang.g:1552:1: rule__Topic__Group__3__Impl : ( ( rule__Topic__AcceptedMessagesAssignment_3 ) ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1556:1: ( ( ( rule__Topic__AcceptedMessagesAssignment_3 ) ) )
            // InternalIotlang.g:1557:1: ( ( rule__Topic__AcceptedMessagesAssignment_3 ) )
            {
            // InternalIotlang.g:1557:1: ( ( rule__Topic__AcceptedMessagesAssignment_3 ) )
            // InternalIotlang.g:1558:2: ( rule__Topic__AcceptedMessagesAssignment_3 )
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesAssignment_3()); 
            // InternalIotlang.g:1559:2: ( rule__Topic__AcceptedMessagesAssignment_3 )
            // InternalIotlang.g:1559:3: rule__Topic__AcceptedMessagesAssignment_3
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
    // InternalIotlang.g:1567:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1571:1: ( rule__Topic__Group__4__Impl )
            // InternalIotlang.g:1572:2: rule__Topic__Group__4__Impl
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
    // InternalIotlang.g:1578:1: rule__Topic__Group__4__Impl : ( ')' ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1582:1: ( ( ')' ) )
            // InternalIotlang.g:1583:1: ( ')' )
            {
            // InternalIotlang.g:1583:1: ( ')' )
            // InternalIotlang.g:1584:2: ')'
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
    // InternalIotlang.g:1594:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1598:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalIotlang.g:1599:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalIotlang.g:1606:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1610:1: ( ( 'rule' ) )
            // InternalIotlang.g:1611:1: ( 'rule' )
            {
            // InternalIotlang.g:1611:1: ( 'rule' )
            // InternalIotlang.g:1612:2: 'rule'
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
    // InternalIotlang.g:1621:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1625:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalIotlang.g:1626:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalIotlang.g:1633:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1637:1: ( ( ( rule__Rule__NameAssignment_1 )? ) )
            // InternalIotlang.g:1638:1: ( ( rule__Rule__NameAssignment_1 )? )
            {
            // InternalIotlang.g:1638:1: ( ( rule__Rule__NameAssignment_1 )? )
            // InternalIotlang.g:1639:2: ( rule__Rule__NameAssignment_1 )?
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1640:2: ( rule__Rule__NameAssignment_1 )?
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
                    // InternalIotlang.g:1640:3: rule__Rule__NameAssignment_1
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
    // InternalIotlang.g:1648:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1652:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalIotlang.g:1653:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalIotlang.g:1660:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__SubjectAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1664:1: ( ( ( rule__Rule__SubjectAssignment_2 ) ) )
            // InternalIotlang.g:1665:1: ( ( rule__Rule__SubjectAssignment_2 ) )
            {
            // InternalIotlang.g:1665:1: ( ( rule__Rule__SubjectAssignment_2 ) )
            // InternalIotlang.g:1666:2: ( rule__Rule__SubjectAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getSubjectAssignment_2()); 
            // InternalIotlang.g:1667:2: ( rule__Rule__SubjectAssignment_2 )
            // InternalIotlang.g:1667:3: rule__Rule__SubjectAssignment_2
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
    // InternalIotlang.g:1675:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1679:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalIotlang.g:1680:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalIotlang.g:1687:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__PermissionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1691:1: ( ( ( rule__Rule__PermissionAssignment_3 ) ) )
            // InternalIotlang.g:1692:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            {
            // InternalIotlang.g:1692:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            // InternalIotlang.g:1693:2: ( rule__Rule__PermissionAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAssignment_3()); 
            // InternalIotlang.g:1694:2: ( rule__Rule__PermissionAssignment_3 )
            // InternalIotlang.g:1694:3: rule__Rule__PermissionAssignment_3
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
    // InternalIotlang.g:1702:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1706:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalIotlang.g:1707:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalIotlang.g:1714:1: rule__Rule__Group__4__Impl : ( ':' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1718:1: ( ( ':' ) )
            // InternalIotlang.g:1719:1: ( ':' )
            {
            // InternalIotlang.g:1719:1: ( ':' )
            // InternalIotlang.g:1720:2: ':'
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
    // InternalIotlang.g:1729:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1733:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalIotlang.g:1734:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
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
    // InternalIotlang.g:1741:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ActionAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1745:1: ( ( ( rule__Rule__ActionAssignment_5 ) ) )
            // InternalIotlang.g:1746:1: ( ( rule__Rule__ActionAssignment_5 ) )
            {
            // InternalIotlang.g:1746:1: ( ( rule__Rule__ActionAssignment_5 ) )
            // InternalIotlang.g:1747:2: ( rule__Rule__ActionAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_5()); 
            // InternalIotlang.g:1748:2: ( rule__Rule__ActionAssignment_5 )
            // InternalIotlang.g:1748:3: rule__Rule__ActionAssignment_5
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
    // InternalIotlang.g:1756:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1760:1: ( rule__Rule__Group__6__Impl )
            // InternalIotlang.g:1761:2: rule__Rule__Group__6__Impl
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
    // InternalIotlang.g:1767:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Alternatives_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1771:1: ( ( ( rule__Rule__Alternatives_6 ) ) )
            // InternalIotlang.g:1772:1: ( ( rule__Rule__Alternatives_6 ) )
            {
            // InternalIotlang.g:1772:1: ( ( rule__Rule__Alternatives_6 ) )
            // InternalIotlang.g:1773:2: ( rule__Rule__Alternatives_6 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_6()); 
            // InternalIotlang.g:1774:2: ( rule__Rule__Alternatives_6 )
            // InternalIotlang.g:1774:3: rule__Rule__Alternatives_6
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
    // InternalIotlang.g:1783:1: rule__Rule__Group_6_0__0 : rule__Rule__Group_6_0__0__Impl rule__Rule__Group_6_0__1 ;
    public final void rule__Rule__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1787:1: ( rule__Rule__Group_6_0__0__Impl rule__Rule__Group_6_0__1 )
            // InternalIotlang.g:1788:2: rule__Rule__Group_6_0__0__Impl rule__Rule__Group_6_0__1
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
    // InternalIotlang.g:1795:1: rule__Rule__Group_6_0__0__Impl : ( ( rule__Rule__ObjectAssignment_6_0_0 ) ) ;
    public final void rule__Rule__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1799:1: ( ( ( rule__Rule__ObjectAssignment_6_0_0 ) ) )
            // InternalIotlang.g:1800:1: ( ( rule__Rule__ObjectAssignment_6_0_0 ) )
            {
            // InternalIotlang.g:1800:1: ( ( rule__Rule__ObjectAssignment_6_0_0 ) )
            // InternalIotlang.g:1801:2: ( rule__Rule__ObjectAssignment_6_0_0 )
            {
             before(grammarAccess.getRuleAccess().getObjectAssignment_6_0_0()); 
            // InternalIotlang.g:1802:2: ( rule__Rule__ObjectAssignment_6_0_0 )
            // InternalIotlang.g:1802:3: rule__Rule__ObjectAssignment_6_0_0
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
    // InternalIotlang.g:1810:1: rule__Rule__Group_6_0__1 : rule__Rule__Group_6_0__1__Impl ;
    public final void rule__Rule__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1814:1: ( rule__Rule__Group_6_0__1__Impl )
            // InternalIotlang.g:1815:2: rule__Rule__Group_6_0__1__Impl
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
    // InternalIotlang.g:1821:1: rule__Rule__Group_6_0__1__Impl : ( ( rule__Rule__Group_6_0_1__0 )* ) ;
    public final void rule__Rule__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1825:1: ( ( ( rule__Rule__Group_6_0_1__0 )* ) )
            // InternalIotlang.g:1826:1: ( ( rule__Rule__Group_6_0_1__0 )* )
            {
            // InternalIotlang.g:1826:1: ( ( rule__Rule__Group_6_0_1__0 )* )
            // InternalIotlang.g:1827:2: ( rule__Rule__Group_6_0_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_6_0_1()); 
            // InternalIotlang.g:1828:2: ( rule__Rule__Group_6_0_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIotlang.g:1828:3: rule__Rule__Group_6_0_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Rule__Group_6_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalIotlang.g:1837:1: rule__Rule__Group_6_0_1__0 : rule__Rule__Group_6_0_1__0__Impl rule__Rule__Group_6_0_1__1 ;
    public final void rule__Rule__Group_6_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1841:1: ( rule__Rule__Group_6_0_1__0__Impl rule__Rule__Group_6_0_1__1 )
            // InternalIotlang.g:1842:2: rule__Rule__Group_6_0_1__0__Impl rule__Rule__Group_6_0_1__1
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
    // InternalIotlang.g:1849:1: rule__Rule__Group_6_0_1__0__Impl : ( '.' ) ;
    public final void rule__Rule__Group_6_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1853:1: ( ( '.' ) )
            // InternalIotlang.g:1854:1: ( '.' )
            {
            // InternalIotlang.g:1854:1: ( '.' )
            // InternalIotlang.g:1855:2: '.'
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
    // InternalIotlang.g:1864:1: rule__Rule__Group_6_0_1__1 : rule__Rule__Group_6_0_1__1__Impl ;
    public final void rule__Rule__Group_6_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1868:1: ( rule__Rule__Group_6_0_1__1__Impl )
            // InternalIotlang.g:1869:2: rule__Rule__Group_6_0_1__1__Impl
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
    // InternalIotlang.g:1875:1: rule__Rule__Group_6_0_1__1__Impl : ( ( rule__Rule__PortsAssignment_6_0_1_1 ) ) ;
    public final void rule__Rule__Group_6_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1879:1: ( ( ( rule__Rule__PortsAssignment_6_0_1_1 ) ) )
            // InternalIotlang.g:1880:1: ( ( rule__Rule__PortsAssignment_6_0_1_1 ) )
            {
            // InternalIotlang.g:1880:1: ( ( rule__Rule__PortsAssignment_6_0_1_1 ) )
            // InternalIotlang.g:1881:2: ( rule__Rule__PortsAssignment_6_0_1_1 )
            {
             before(grammarAccess.getRuleAccess().getPortsAssignment_6_0_1_1()); 
            // InternalIotlang.g:1882:2: ( rule__Rule__PortsAssignment_6_0_1_1 )
            // InternalIotlang.g:1882:3: rule__Rule__PortsAssignment_6_0_1_1
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
    // InternalIotlang.g:1891:1: rule__Rule__Group_6_1__0 : rule__Rule__Group_6_1__0__Impl rule__Rule__Group_6_1__1 ;
    public final void rule__Rule__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1895:1: ( rule__Rule__Group_6_1__0__Impl rule__Rule__Group_6_1__1 )
            // InternalIotlang.g:1896:2: rule__Rule__Group_6_1__0__Impl rule__Rule__Group_6_1__1
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
    // InternalIotlang.g:1903:1: rule__Rule__Group_6_1__0__Impl : ( 'message:' ) ;
    public final void rule__Rule__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1907:1: ( ( 'message:' ) )
            // InternalIotlang.g:1908:1: ( 'message:' )
            {
            // InternalIotlang.g:1908:1: ( 'message:' )
            // InternalIotlang.g:1909:2: 'message:'
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
    // InternalIotlang.g:1918:1: rule__Rule__Group_6_1__1 : rule__Rule__Group_6_1__1__Impl ;
    public final void rule__Rule__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1922:1: ( rule__Rule__Group_6_1__1__Impl )
            // InternalIotlang.g:1923:2: rule__Rule__Group_6_1__1__Impl
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
    // InternalIotlang.g:1929:1: rule__Rule__Group_6_1__1__Impl : ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) ) ;
    public final void rule__Rule__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1933:1: ( ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) ) )
            // InternalIotlang.g:1934:1: ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) )
            {
            // InternalIotlang.g:1934:1: ( ( rule__Rule__ObjectMessageAssignment_6_1_1 ) )
            // InternalIotlang.g:1935:2: ( rule__Rule__ObjectMessageAssignment_6_1_1 )
            {
             before(grammarAccess.getRuleAccess().getObjectMessageAssignment_6_1_1()); 
            // InternalIotlang.g:1936:2: ( rule__Rule__ObjectMessageAssignment_6_1_1 )
            // InternalIotlang.g:1936:3: rule__Rule__ObjectMessageAssignment_6_1_1
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
    // InternalIotlang.g:1945:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1949:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalIotlang.g:1950:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalIotlang.g:1957:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1961:1: ( ( 'domain' ) )
            // InternalIotlang.g:1962:1: ( 'domain' )
            {
            // InternalIotlang.g:1962:1: ( 'domain' )
            // InternalIotlang.g:1963:2: 'domain'
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
    // InternalIotlang.g:1972:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1976:1: ( rule__Domain__Group__1__Impl )
            // InternalIotlang.g:1977:2: rule__Domain__Group__1__Impl
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
    // InternalIotlang.g:1983:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1987:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalIotlang.g:1988:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1988:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalIotlang.g:1989:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1990:2: ( rule__Domain__NameAssignment_1 )
            // InternalIotlang.g:1990:3: rule__Domain__NameAssignment_1
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
    // InternalIotlang.g:1999:1: rule__InstanceThing__Group__0 : rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 ;
    public final void rule__InstanceThing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2003:1: ( rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 )
            // InternalIotlang.g:2004:2: rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1
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
    // InternalIotlang.g:2011:1: rule__InstanceThing__Group__0__Impl : ( 'instanceThing' ) ;
    public final void rule__InstanceThing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2015:1: ( ( 'instanceThing' ) )
            // InternalIotlang.g:2016:1: ( 'instanceThing' )
            {
            // InternalIotlang.g:2016:1: ( 'instanceThing' )
            // InternalIotlang.g:2017:2: 'instanceThing'
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
    // InternalIotlang.g:2026:1: rule__InstanceThing__Group__1 : rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 ;
    public final void rule__InstanceThing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2030:1: ( rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 )
            // InternalIotlang.g:2031:2: rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2
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
    // InternalIotlang.g:2038:1: rule__InstanceThing__Group__1__Impl : ( ( rule__InstanceThing__NameAssignment_1 ) ) ;
    public final void rule__InstanceThing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2042:1: ( ( ( rule__InstanceThing__NameAssignment_1 ) ) )
            // InternalIotlang.g:2043:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2043:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            // InternalIotlang.g:2044:2: ( rule__InstanceThing__NameAssignment_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2045:2: ( rule__InstanceThing__NameAssignment_1 )
            // InternalIotlang.g:2045:3: rule__InstanceThing__NameAssignment_1
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
    // InternalIotlang.g:2053:1: rule__InstanceThing__Group__2 : rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 ;
    public final void rule__InstanceThing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2057:1: ( rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 )
            // InternalIotlang.g:2058:2: rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3
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
    // InternalIotlang.g:2065:1: rule__InstanceThing__Group__2__Impl : ( ( rule__InstanceThing__Group_2__0 )* ) ;
    public final void rule__InstanceThing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2069:1: ( ( ( rule__InstanceThing__Group_2__0 )* ) )
            // InternalIotlang.g:2070:1: ( ( rule__InstanceThing__Group_2__0 )* )
            {
            // InternalIotlang.g:2070:1: ( ( rule__InstanceThing__Group_2__0 )* )
            // InternalIotlang.g:2071:2: ( rule__InstanceThing__Group_2__0 )*
            {
             before(grammarAccess.getInstanceThingAccess().getGroup_2()); 
            // InternalIotlang.g:2072:2: ( rule__InstanceThing__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIotlang.g:2072:3: rule__InstanceThing__Group_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__InstanceThing__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalIotlang.g:2080:1: rule__InstanceThing__Group__3 : rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 ;
    public final void rule__InstanceThing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2084:1: ( rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 )
            // InternalIotlang.g:2085:2: rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4
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
    // InternalIotlang.g:2092:1: rule__InstanceThing__Group__3__Impl : ( ':' ) ;
    public final void rule__InstanceThing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2096:1: ( ( ':' ) )
            // InternalIotlang.g:2097:1: ( ':' )
            {
            // InternalIotlang.g:2097:1: ( ':' )
            // InternalIotlang.g:2098:2: ':'
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
    // InternalIotlang.g:2107:1: rule__InstanceThing__Group__4 : rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 ;
    public final void rule__InstanceThing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2111:1: ( rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 )
            // InternalIotlang.g:2112:2: rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5
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
    // InternalIotlang.g:2119:1: rule__InstanceThing__Group__4__Impl : ( ( rule__InstanceThing__TypeThingAssignment_4 ) ) ;
    public final void rule__InstanceThing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2123:1: ( ( ( rule__InstanceThing__TypeThingAssignment_4 ) ) )
            // InternalIotlang.g:2124:1: ( ( rule__InstanceThing__TypeThingAssignment_4 ) )
            {
            // InternalIotlang.g:2124:1: ( ( rule__InstanceThing__TypeThingAssignment_4 ) )
            // InternalIotlang.g:2125:2: ( rule__InstanceThing__TypeThingAssignment_4 )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingAssignment_4()); 
            // InternalIotlang.g:2126:2: ( rule__InstanceThing__TypeThingAssignment_4 )
            // InternalIotlang.g:2126:3: rule__InstanceThing__TypeThingAssignment_4
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
    // InternalIotlang.g:2134:1: rule__InstanceThing__Group__5 : rule__InstanceThing__Group__5__Impl ;
    public final void rule__InstanceThing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2138:1: ( rule__InstanceThing__Group__5__Impl )
            // InternalIotlang.g:2139:2: rule__InstanceThing__Group__5__Impl
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
    // InternalIotlang.g:2145:1: rule__InstanceThing__Group__5__Impl : ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) ;
    public final void rule__InstanceThing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2149:1: ( ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) )
            // InternalIotlang.g:2150:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            {
            // InternalIotlang.g:2150:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            // InternalIotlang.g:2151:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            {
             before(grammarAccess.getInstanceThingAccess().getAnnotationsAssignment_5()); 
            // InternalIotlang.g:2152:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ANNOTATION_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIotlang.g:2152:3: rule__InstanceThing__AnnotationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanceThing__AnnotationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalIotlang.g:2161:1: rule__InstanceThing__Group_2__0 : rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 ;
    public final void rule__InstanceThing__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2165:1: ( rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 )
            // InternalIotlang.g:2166:2: rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1
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
    // InternalIotlang.g:2173:1: rule__InstanceThing__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstanceThing__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2177:1: ( ( '[' ) )
            // InternalIotlang.g:2178:1: ( '[' )
            {
            // InternalIotlang.g:2178:1: ( '[' )
            // InternalIotlang.g:2179:2: '['
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
    // InternalIotlang.g:2188:1: rule__InstanceThing__Group_2__1 : rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 ;
    public final void rule__InstanceThing__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2192:1: ( rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 )
            // InternalIotlang.g:2193:2: rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2
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
    // InternalIotlang.g:2200:1: rule__InstanceThing__Group_2__1__Impl : ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) ;
    public final void rule__InstanceThing__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2204:1: ( ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:2205:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:2205:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            // InternalIotlang.g:2206:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:2207:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            // InternalIotlang.g:2207:3: rule__InstanceThing__NumberAssignment_2_1
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
    // InternalIotlang.g:2215:1: rule__InstanceThing__Group_2__2 : rule__InstanceThing__Group_2__2__Impl ;
    public final void rule__InstanceThing__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2219:1: ( rule__InstanceThing__Group_2__2__Impl )
            // InternalIotlang.g:2220:2: rule__InstanceThing__Group_2__2__Impl
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
    // InternalIotlang.g:2226:1: rule__InstanceThing__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstanceThing__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2230:1: ( ( ']' ) )
            // InternalIotlang.g:2231:1: ( ']' )
            {
            // InternalIotlang.g:2231:1: ( ']' )
            // InternalIotlang.g:2232:2: ']'
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


    // $ANTLR start "rule__InstanceChannel__Group__0"
    // InternalIotlang.g:2242:1: rule__InstanceChannel__Group__0 : rule__InstanceChannel__Group__0__Impl rule__InstanceChannel__Group__1 ;
    public final void rule__InstanceChannel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2246:1: ( rule__InstanceChannel__Group__0__Impl rule__InstanceChannel__Group__1 )
            // InternalIotlang.g:2247:2: rule__InstanceChannel__Group__0__Impl rule__InstanceChannel__Group__1
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
    // InternalIotlang.g:2254:1: rule__InstanceChannel__Group__0__Impl : ( 'instanceChannel' ) ;
    public final void rule__InstanceChannel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2258:1: ( ( 'instanceChannel' ) )
            // InternalIotlang.g:2259:1: ( 'instanceChannel' )
            {
            // InternalIotlang.g:2259:1: ( 'instanceChannel' )
            // InternalIotlang.g:2260:2: 'instanceChannel'
            {
             before(grammarAccess.getInstanceChannelAccess().getInstanceChannelKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalIotlang.g:2269:1: rule__InstanceChannel__Group__1 : rule__InstanceChannel__Group__1__Impl rule__InstanceChannel__Group__2 ;
    public final void rule__InstanceChannel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2273:1: ( rule__InstanceChannel__Group__1__Impl rule__InstanceChannel__Group__2 )
            // InternalIotlang.g:2274:2: rule__InstanceChannel__Group__1__Impl rule__InstanceChannel__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalIotlang.g:2281:1: rule__InstanceChannel__Group__1__Impl : ( ( rule__InstanceChannel__NameAssignment_1 ) ) ;
    public final void rule__InstanceChannel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2285:1: ( ( ( rule__InstanceChannel__NameAssignment_1 ) ) )
            // InternalIotlang.g:2286:1: ( ( rule__InstanceChannel__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2286:1: ( ( rule__InstanceChannel__NameAssignment_1 ) )
            // InternalIotlang.g:2287:2: ( rule__InstanceChannel__NameAssignment_1 )
            {
             before(grammarAccess.getInstanceChannelAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2288:2: ( rule__InstanceChannel__NameAssignment_1 )
            // InternalIotlang.g:2288:3: rule__InstanceChannel__NameAssignment_1
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
    // InternalIotlang.g:2296:1: rule__InstanceChannel__Group__2 : rule__InstanceChannel__Group__2__Impl rule__InstanceChannel__Group__3 ;
    public final void rule__InstanceChannel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2300:1: ( rule__InstanceChannel__Group__2__Impl rule__InstanceChannel__Group__3 )
            // InternalIotlang.g:2301:2: rule__InstanceChannel__Group__2__Impl rule__InstanceChannel__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalIotlang.g:2308:1: rule__InstanceChannel__Group__2__Impl : ( ( rule__InstanceChannel__Group_2__0 )* ) ;
    public final void rule__InstanceChannel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2312:1: ( ( ( rule__InstanceChannel__Group_2__0 )* ) )
            // InternalIotlang.g:2313:1: ( ( rule__InstanceChannel__Group_2__0 )* )
            {
            // InternalIotlang.g:2313:1: ( ( rule__InstanceChannel__Group_2__0 )* )
            // InternalIotlang.g:2314:2: ( rule__InstanceChannel__Group_2__0 )*
            {
             before(grammarAccess.getInstanceChannelAccess().getGroup_2()); 
            // InternalIotlang.g:2315:2: ( rule__InstanceChannel__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIotlang.g:2315:3: rule__InstanceChannel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__InstanceChannel__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalIotlang.g:2323:1: rule__InstanceChannel__Group__3 : rule__InstanceChannel__Group__3__Impl rule__InstanceChannel__Group__4 ;
    public final void rule__InstanceChannel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2327:1: ( rule__InstanceChannel__Group__3__Impl rule__InstanceChannel__Group__4 )
            // InternalIotlang.g:2328:2: rule__InstanceChannel__Group__3__Impl rule__InstanceChannel__Group__4
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
    // InternalIotlang.g:2335:1: rule__InstanceChannel__Group__3__Impl : ( ':' ) ;
    public final void rule__InstanceChannel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2339:1: ( ( ':' ) )
            // InternalIotlang.g:2340:1: ( ':' )
            {
            // InternalIotlang.g:2340:1: ( ':' )
            // InternalIotlang.g:2341:2: ':'
            {
             before(grammarAccess.getInstanceChannelAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalIotlang.g:2350:1: rule__InstanceChannel__Group__4 : rule__InstanceChannel__Group__4__Impl rule__InstanceChannel__Group__5 ;
    public final void rule__InstanceChannel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2354:1: ( rule__InstanceChannel__Group__4__Impl rule__InstanceChannel__Group__5 )
            // InternalIotlang.g:2355:2: rule__InstanceChannel__Group__4__Impl rule__InstanceChannel__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalIotlang.g:2362:1: rule__InstanceChannel__Group__4__Impl : ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) ) ;
    public final void rule__InstanceChannel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2366:1: ( ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) ) )
            // InternalIotlang.g:2367:1: ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) )
            {
            // InternalIotlang.g:2367:1: ( ( rule__InstanceChannel__TypeChannelAssignment_4 ) )
            // InternalIotlang.g:2368:2: ( rule__InstanceChannel__TypeChannelAssignment_4 )
            {
             before(grammarAccess.getInstanceChannelAccess().getTypeChannelAssignment_4()); 
            // InternalIotlang.g:2369:2: ( rule__InstanceChannel__TypeChannelAssignment_4 )
            // InternalIotlang.g:2369:3: rule__InstanceChannel__TypeChannelAssignment_4
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
    // InternalIotlang.g:2377:1: rule__InstanceChannel__Group__5 : rule__InstanceChannel__Group__5__Impl rule__InstanceChannel__Group__6 ;
    public final void rule__InstanceChannel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2381:1: ( rule__InstanceChannel__Group__5__Impl rule__InstanceChannel__Group__6 )
            // InternalIotlang.g:2382:2: rule__InstanceChannel__Group__5__Impl rule__InstanceChannel__Group__6
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
    // InternalIotlang.g:2389:1: rule__InstanceChannel__Group__5__Impl : ( 'over' ) ;
    public final void rule__InstanceChannel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2393:1: ( ( 'over' ) )
            // InternalIotlang.g:2394:1: ( 'over' )
            {
            // InternalIotlang.g:2394:1: ( 'over' )
            // InternalIotlang.g:2395:2: 'over'
            {
             before(grammarAccess.getInstanceChannelAccess().getOverKeyword_5()); 
            match(input,41,FOLLOW_2); 
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
    // InternalIotlang.g:2404:1: rule__InstanceChannel__Group__6 : rule__InstanceChannel__Group__6__Impl rule__InstanceChannel__Group__7 ;
    public final void rule__InstanceChannel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2408:1: ( rule__InstanceChannel__Group__6__Impl rule__InstanceChannel__Group__7 )
            // InternalIotlang.g:2409:2: rule__InstanceChannel__Group__6__Impl rule__InstanceChannel__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalIotlang.g:2416:1: rule__InstanceChannel__Group__6__Impl : ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) ) ;
    public final void rule__InstanceChannel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2420:1: ( ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) ) )
            // InternalIotlang.g:2421:1: ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) )
            {
            // InternalIotlang.g:2421:1: ( ( rule__InstanceChannel__OverProtocolAssignment_6 ) )
            // InternalIotlang.g:2422:2: ( rule__InstanceChannel__OverProtocolAssignment_6 )
            {
             before(grammarAccess.getInstanceChannelAccess().getOverProtocolAssignment_6()); 
            // InternalIotlang.g:2423:2: ( rule__InstanceChannel__OverProtocolAssignment_6 )
            // InternalIotlang.g:2423:3: rule__InstanceChannel__OverProtocolAssignment_6
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
    // InternalIotlang.g:2431:1: rule__InstanceChannel__Group__7 : rule__InstanceChannel__Group__7__Impl ;
    public final void rule__InstanceChannel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2435:1: ( rule__InstanceChannel__Group__7__Impl )
            // InternalIotlang.g:2436:2: rule__InstanceChannel__Group__7__Impl
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
    // InternalIotlang.g:2442:1: rule__InstanceChannel__Group__7__Impl : ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* ) ;
    public final void rule__InstanceChannel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2446:1: ( ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* ) )
            // InternalIotlang.g:2447:1: ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* )
            {
            // InternalIotlang.g:2447:1: ( ( rule__InstanceChannel__AnnotationsAssignment_7 )* )
            // InternalIotlang.g:2448:2: ( rule__InstanceChannel__AnnotationsAssignment_7 )*
            {
             before(grammarAccess.getInstanceChannelAccess().getAnnotationsAssignment_7()); 
            // InternalIotlang.g:2449:2: ( rule__InstanceChannel__AnnotationsAssignment_7 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ANNOTATION_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIotlang.g:2449:3: rule__InstanceChannel__AnnotationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanceChannel__AnnotationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalIotlang.g:2458:1: rule__InstanceChannel__Group_2__0 : rule__InstanceChannel__Group_2__0__Impl rule__InstanceChannel__Group_2__1 ;
    public final void rule__InstanceChannel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2462:1: ( rule__InstanceChannel__Group_2__0__Impl rule__InstanceChannel__Group_2__1 )
            // InternalIotlang.g:2463:2: rule__InstanceChannel__Group_2__0__Impl rule__InstanceChannel__Group_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalIotlang.g:2470:1: rule__InstanceChannel__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstanceChannel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2474:1: ( ( '[' ) )
            // InternalIotlang.g:2475:1: ( '[' )
            {
            // InternalIotlang.g:2475:1: ( '[' )
            // InternalIotlang.g:2476:2: '['
            {
             before(grammarAccess.getInstanceChannelAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalIotlang.g:2485:1: rule__InstanceChannel__Group_2__1 : rule__InstanceChannel__Group_2__1__Impl rule__InstanceChannel__Group_2__2 ;
    public final void rule__InstanceChannel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2489:1: ( rule__InstanceChannel__Group_2__1__Impl rule__InstanceChannel__Group_2__2 )
            // InternalIotlang.g:2490:2: rule__InstanceChannel__Group_2__1__Impl rule__InstanceChannel__Group_2__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalIotlang.g:2497:1: rule__InstanceChannel__Group_2__1__Impl : ( ( rule__InstanceChannel__NumberAssignment_2_1 ) ) ;
    public final void rule__InstanceChannel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2501:1: ( ( ( rule__InstanceChannel__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:2502:1: ( ( rule__InstanceChannel__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:2502:1: ( ( rule__InstanceChannel__NumberAssignment_2_1 ) )
            // InternalIotlang.g:2503:2: ( rule__InstanceChannel__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstanceChannelAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:2504:2: ( rule__InstanceChannel__NumberAssignment_2_1 )
            // InternalIotlang.g:2504:3: rule__InstanceChannel__NumberAssignment_2_1
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
    // InternalIotlang.g:2512:1: rule__InstanceChannel__Group_2__2 : rule__InstanceChannel__Group_2__2__Impl ;
    public final void rule__InstanceChannel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2516:1: ( rule__InstanceChannel__Group_2__2__Impl )
            // InternalIotlang.g:2517:2: rule__InstanceChannel__Group_2__2__Impl
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
    // InternalIotlang.g:2523:1: rule__InstanceChannel__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstanceChannel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2527:1: ( ( ']' ) )
            // InternalIotlang.g:2528:1: ( ']' )
            {
            // InternalIotlang.g:2528:1: ( ']' )
            // InternalIotlang.g:2529:2: ']'
            {
             before(grammarAccess.getInstanceChannelAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalIotlang.g:2539:1: rule__InstancePolicy__Group__0 : rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 ;
    public final void rule__InstancePolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2543:1: ( rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 )
            // InternalIotlang.g:2544:2: rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1
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
    // InternalIotlang.g:2551:1: rule__InstancePolicy__Group__0__Impl : ( 'instancePolicy' ) ;
    public final void rule__InstancePolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2555:1: ( ( 'instancePolicy' ) )
            // InternalIotlang.g:2556:1: ( 'instancePolicy' )
            {
            // InternalIotlang.g:2556:1: ( 'instancePolicy' )
            // InternalIotlang.g:2557:2: 'instancePolicy'
            {
             before(grammarAccess.getInstancePolicyAccess().getInstancePolicyKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalIotlang.g:2566:1: rule__InstancePolicy__Group__1 : rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 ;
    public final void rule__InstancePolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2570:1: ( rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 )
            // InternalIotlang.g:2571:2: rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2
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
    // InternalIotlang.g:2578:1: rule__InstancePolicy__Group__1__Impl : ( ( rule__InstancePolicy__NameAssignment_1 ) ) ;
    public final void rule__InstancePolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2582:1: ( ( ( rule__InstancePolicy__NameAssignment_1 ) ) )
            // InternalIotlang.g:2583:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2583:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            // InternalIotlang.g:2584:2: ( rule__InstancePolicy__NameAssignment_1 )
            {
             before(grammarAccess.getInstancePolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2585:2: ( rule__InstancePolicy__NameAssignment_1 )
            // InternalIotlang.g:2585:3: rule__InstancePolicy__NameAssignment_1
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
    // InternalIotlang.g:2593:1: rule__InstancePolicy__Group__2 : rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 ;
    public final void rule__InstancePolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2597:1: ( rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 )
            // InternalIotlang.g:2598:2: rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3
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
    // InternalIotlang.g:2605:1: rule__InstancePolicy__Group__2__Impl : ( ':' ) ;
    public final void rule__InstancePolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2609:1: ( ( ':' ) )
            // InternalIotlang.g:2610:1: ( ':' )
            {
            // InternalIotlang.g:2610:1: ( ':' )
            // InternalIotlang.g:2611:2: ':'
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
    // InternalIotlang.g:2620:1: rule__InstancePolicy__Group__3 : rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 ;
    public final void rule__InstancePolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2624:1: ( rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 )
            // InternalIotlang.g:2625:2: rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4
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
    // InternalIotlang.g:2632:1: rule__InstancePolicy__Group__3__Impl : ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) ;
    public final void rule__InstancePolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2636:1: ( ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) )
            // InternalIotlang.g:2637:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            {
            // InternalIotlang.g:2637:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            // InternalIotlang.g:2638:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyAssignment_3()); 
            // InternalIotlang.g:2639:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            // InternalIotlang.g:2639:3: rule__InstancePolicy__TypePolicyAssignment_3
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
    // InternalIotlang.g:2647:1: rule__InstancePolicy__Group__4 : rule__InstancePolicy__Group__4__Impl ;
    public final void rule__InstancePolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2651:1: ( rule__InstancePolicy__Group__4__Impl )
            // InternalIotlang.g:2652:2: rule__InstancePolicy__Group__4__Impl
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
    // InternalIotlang.g:2658:1: rule__InstancePolicy__Group__4__Impl : ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) ;
    public final void rule__InstancePolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2662:1: ( ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) )
            // InternalIotlang.g:2663:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            {
            // InternalIotlang.g:2663:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            // InternalIotlang.g:2664:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            {
             before(grammarAccess.getInstancePolicyAccess().getAnnotationsAssignment_4()); 
            // InternalIotlang.g:2665:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ANNOTATION_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIotlang.g:2665:3: rule__InstancePolicy__AnnotationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstancePolicy__AnnotationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalIotlang.g:2674:1: rule__NetworkConfiguration__Group__0 : rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 ;
    public final void rule__NetworkConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2678:1: ( rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 )
            // InternalIotlang.g:2679:2: rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1
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
    // InternalIotlang.g:2686:1: rule__NetworkConfiguration__Group__0__Impl : ( 'networkConfiguration' ) ;
    public final void rule__NetworkConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2690:1: ( ( 'networkConfiguration' ) )
            // InternalIotlang.g:2691:1: ( 'networkConfiguration' )
            {
            // InternalIotlang.g:2691:1: ( 'networkConfiguration' )
            // InternalIotlang.g:2692:2: 'networkConfiguration'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalIotlang.g:2701:1: rule__NetworkConfiguration__Group__1 : rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 ;
    public final void rule__NetworkConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2705:1: ( rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 )
            // InternalIotlang.g:2706:2: rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2
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
    // InternalIotlang.g:2713:1: rule__NetworkConfiguration__Group__1__Impl : ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) ;
    public final void rule__NetworkConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2717:1: ( ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) )
            // InternalIotlang.g:2718:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2718:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            // InternalIotlang.g:2719:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2720:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            // InternalIotlang.g:2720:3: rule__NetworkConfiguration__NameAssignment_1
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
    // InternalIotlang.g:2728:1: rule__NetworkConfiguration__Group__2 : rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 ;
    public final void rule__NetworkConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2732:1: ( rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 )
            // InternalIotlang.g:2733:2: rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3
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
    // InternalIotlang.g:2740:1: rule__NetworkConfiguration__Group__2__Impl : ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) ;
    public final void rule__NetworkConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2744:1: ( ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:2745:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:2745:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:2746:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:2747:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ANNOTATION_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIotlang.g:2747:3: rule__NetworkConfiguration__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NetworkConfiguration__AnnotationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalIotlang.g:2755:1: rule__NetworkConfiguration__Group__3 : rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 ;
    public final void rule__NetworkConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2759:1: ( rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 )
            // InternalIotlang.g:2760:2: rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4
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
    // InternalIotlang.g:2767:1: rule__NetworkConfiguration__Group__3__Impl : ( '{' ) ;
    public final void rule__NetworkConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2771:1: ( ( '{' ) )
            // InternalIotlang.g:2772:1: ( '{' )
            {
            // InternalIotlang.g:2772:1: ( '{' )
            // InternalIotlang.g:2773:2: '{'
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
    // InternalIotlang.g:2782:1: rule__NetworkConfiguration__Group__4 : rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 ;
    public final void rule__NetworkConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2786:1: ( rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 )
            // InternalIotlang.g:2787:2: rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5
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
    // InternalIotlang.g:2794:1: rule__NetworkConfiguration__Group__4__Impl : ( ( rule__NetworkConfiguration__Alternatives_4 )* ) ;
    public final void rule__NetworkConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2798:1: ( ( ( rule__NetworkConfiguration__Alternatives_4 )* ) )
            // InternalIotlang.g:2799:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            {
            // InternalIotlang.g:2799:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            // InternalIotlang.g:2800:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAlternatives_4()); 
            // InternalIotlang.g:2801:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=36 && LA20_0<=37)||LA20_0==40||LA20_0==42||(LA20_0>=44 && LA20_0<=45)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIotlang.g:2801:3: rule__NetworkConfiguration__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__NetworkConfiguration__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalIotlang.g:2809:1: rule__NetworkConfiguration__Group__5 : rule__NetworkConfiguration__Group__5__Impl ;
    public final void rule__NetworkConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2813:1: ( rule__NetworkConfiguration__Group__5__Impl )
            // InternalIotlang.g:2814:2: rule__NetworkConfiguration__Group__5__Impl
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
    // InternalIotlang.g:2820:1: rule__NetworkConfiguration__Group__5__Impl : ( '}' ) ;
    public final void rule__NetworkConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2824:1: ( ( '}' ) )
            // InternalIotlang.g:2825:1: ( '}' )
            {
            // InternalIotlang.g:2825:1: ( '}' )
            // InternalIotlang.g:2826:2: '}'
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
    // InternalIotlang.g:2836:1: rule__NetworkConfiguration__Group_4_4__0 : rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1 ;
    public final void rule__NetworkConfiguration__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2840:1: ( rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1 )
            // InternalIotlang.g:2841:2: rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1
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
    // InternalIotlang.g:2848:1: rule__NetworkConfiguration__Group_4_4__0__Impl : ( 'enforce' ) ;
    public final void rule__NetworkConfiguration__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2852:1: ( ( 'enforce' ) )
            // InternalIotlang.g:2853:1: ( 'enforce' )
            {
            // InternalIotlang.g:2853:1: ( 'enforce' )
            // InternalIotlang.g:2854:2: 'enforce'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_4_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalIotlang.g:2863:1: rule__NetworkConfiguration__Group_4_4__1 : rule__NetworkConfiguration__Group_4_4__1__Impl ;
    public final void rule__NetworkConfiguration__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2867:1: ( rule__NetworkConfiguration__Group_4_4__1__Impl )
            // InternalIotlang.g:2868:2: rule__NetworkConfiguration__Group_4_4__1__Impl
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
    // InternalIotlang.g:2874:1: rule__NetworkConfiguration__Group_4_4__1__Impl : ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) ) ;
    public final void rule__NetworkConfiguration__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2878:1: ( ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) ) )
            // InternalIotlang.g:2879:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) )
            {
            // InternalIotlang.g:2879:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) )
            // InternalIotlang.g:2880:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesAssignment_4_4_1()); 
            // InternalIotlang.g:2881:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 )
            // InternalIotlang.g:2881:3: rule__NetworkConfiguration__EnforcesAssignment_4_4_1
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
    // InternalIotlang.g:2890:1: rule__Bind__Group__0 : rule__Bind__Group__0__Impl rule__Bind__Group__1 ;
    public final void rule__Bind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2894:1: ( rule__Bind__Group__0__Impl rule__Bind__Group__1 )
            // InternalIotlang.g:2895:2: rule__Bind__Group__0__Impl rule__Bind__Group__1
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
    // InternalIotlang.g:2902:1: rule__Bind__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Bind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2906:1: ( ( 'bind' ) )
            // InternalIotlang.g:2907:1: ( 'bind' )
            {
            // InternalIotlang.g:2907:1: ( 'bind' )
            // InternalIotlang.g:2908:2: 'bind'
            {
             before(grammarAccess.getBindAccess().getBindKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalIotlang.g:2917:1: rule__Bind__Group__1 : rule__Bind__Group__1__Impl rule__Bind__Group__2 ;
    public final void rule__Bind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2921:1: ( rule__Bind__Group__1__Impl rule__Bind__Group__2 )
            // InternalIotlang.g:2922:2: rule__Bind__Group__1__Impl rule__Bind__Group__2
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
    // InternalIotlang.g:2929:1: rule__Bind__Group__1__Impl : ( ( rule__Bind__NameAssignment_1 )? ) ;
    public final void rule__Bind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2933:1: ( ( ( rule__Bind__NameAssignment_1 )? ) )
            // InternalIotlang.g:2934:1: ( ( rule__Bind__NameAssignment_1 )? )
            {
            // InternalIotlang.g:2934:1: ( ( rule__Bind__NameAssignment_1 )? )
            // InternalIotlang.g:2935:2: ( rule__Bind__NameAssignment_1 )?
            {
             before(grammarAccess.getBindAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2936:2: ( rule__Bind__NameAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_ID) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalIotlang.g:2936:3: rule__Bind__NameAssignment_1
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
    // InternalIotlang.g:2944:1: rule__Bind__Group__2 : rule__Bind__Group__2__Impl rule__Bind__Group__3 ;
    public final void rule__Bind__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2948:1: ( rule__Bind__Group__2__Impl rule__Bind__Group__3 )
            // InternalIotlang.g:2949:2: rule__Bind__Group__2__Impl rule__Bind__Group__3
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
    // InternalIotlang.g:2956:1: rule__Bind__Group__2__Impl : ( ( rule__Bind__ThingInstanceAssignment_2 ) ) ;
    public final void rule__Bind__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2960:1: ( ( ( rule__Bind__ThingInstanceAssignment_2 ) ) )
            // InternalIotlang.g:2961:1: ( ( rule__Bind__ThingInstanceAssignment_2 ) )
            {
            // InternalIotlang.g:2961:1: ( ( rule__Bind__ThingInstanceAssignment_2 ) )
            // InternalIotlang.g:2962:2: ( rule__Bind__ThingInstanceAssignment_2 )
            {
             before(grammarAccess.getBindAccess().getThingInstanceAssignment_2()); 
            // InternalIotlang.g:2963:2: ( rule__Bind__ThingInstanceAssignment_2 )
            // InternalIotlang.g:2963:3: rule__Bind__ThingInstanceAssignment_2
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
    // InternalIotlang.g:2971:1: rule__Bind__Group__3 : rule__Bind__Group__3__Impl rule__Bind__Group__4 ;
    public final void rule__Bind__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2975:1: ( rule__Bind__Group__3__Impl rule__Bind__Group__4 )
            // InternalIotlang.g:2976:2: rule__Bind__Group__3__Impl rule__Bind__Group__4
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
    // InternalIotlang.g:2983:1: rule__Bind__Group__3__Impl : ( ( rule__Bind__DirectionAssignment_3 ) ) ;
    public final void rule__Bind__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2987:1: ( ( ( rule__Bind__DirectionAssignment_3 ) ) )
            // InternalIotlang.g:2988:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            {
            // InternalIotlang.g:2988:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            // InternalIotlang.g:2989:2: ( rule__Bind__DirectionAssignment_3 )
            {
             before(grammarAccess.getBindAccess().getDirectionAssignment_3()); 
            // InternalIotlang.g:2990:2: ( rule__Bind__DirectionAssignment_3 )
            // InternalIotlang.g:2990:3: rule__Bind__DirectionAssignment_3
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
    // InternalIotlang.g:2998:1: rule__Bind__Group__4 : rule__Bind__Group__4__Impl rule__Bind__Group__5 ;
    public final void rule__Bind__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3002:1: ( rule__Bind__Group__4__Impl rule__Bind__Group__5 )
            // InternalIotlang.g:3003:2: rule__Bind__Group__4__Impl rule__Bind__Group__5
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
    // InternalIotlang.g:3010:1: rule__Bind__Group__4__Impl : ( ( rule__Bind__ChannelInstanceAssignment_4 ) ) ;
    public final void rule__Bind__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3014:1: ( ( ( rule__Bind__ChannelInstanceAssignment_4 ) ) )
            // InternalIotlang.g:3015:1: ( ( rule__Bind__ChannelInstanceAssignment_4 ) )
            {
            // InternalIotlang.g:3015:1: ( ( rule__Bind__ChannelInstanceAssignment_4 ) )
            // InternalIotlang.g:3016:2: ( rule__Bind__ChannelInstanceAssignment_4 )
            {
             before(grammarAccess.getBindAccess().getChannelInstanceAssignment_4()); 
            // InternalIotlang.g:3017:2: ( rule__Bind__ChannelInstanceAssignment_4 )
            // InternalIotlang.g:3017:3: rule__Bind__ChannelInstanceAssignment_4
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
    // InternalIotlang.g:3025:1: rule__Bind__Group__5 : rule__Bind__Group__5__Impl rule__Bind__Group__6 ;
    public final void rule__Bind__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3029:1: ( rule__Bind__Group__5__Impl rule__Bind__Group__6 )
            // InternalIotlang.g:3030:2: rule__Bind__Group__5__Impl rule__Bind__Group__6
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
    // InternalIotlang.g:3037:1: rule__Bind__Group__5__Impl : ( '{' ) ;
    public final void rule__Bind__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3041:1: ( ( '{' ) )
            // InternalIotlang.g:3042:1: ( '{' )
            {
            // InternalIotlang.g:3042:1: ( '{' )
            // InternalIotlang.g:3043:2: '{'
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
    // InternalIotlang.g:3052:1: rule__Bind__Group__6 : rule__Bind__Group__6__Impl rule__Bind__Group__7 ;
    public final void rule__Bind__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3056:1: ( rule__Bind__Group__6__Impl rule__Bind__Group__7 )
            // InternalIotlang.g:3057:2: rule__Bind__Group__6__Impl rule__Bind__Group__7
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
    // InternalIotlang.g:3064:1: rule__Bind__Group__6__Impl : ( ( rule__Bind__TopicsAssignment_6 ) ) ;
    public final void rule__Bind__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3068:1: ( ( ( rule__Bind__TopicsAssignment_6 ) ) )
            // InternalIotlang.g:3069:1: ( ( rule__Bind__TopicsAssignment_6 ) )
            {
            // InternalIotlang.g:3069:1: ( ( rule__Bind__TopicsAssignment_6 ) )
            // InternalIotlang.g:3070:2: ( rule__Bind__TopicsAssignment_6 )
            {
             before(grammarAccess.getBindAccess().getTopicsAssignment_6()); 
            // InternalIotlang.g:3071:2: ( rule__Bind__TopicsAssignment_6 )
            // InternalIotlang.g:3071:3: rule__Bind__TopicsAssignment_6
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
    // InternalIotlang.g:3079:1: rule__Bind__Group__7 : rule__Bind__Group__7__Impl rule__Bind__Group__8 ;
    public final void rule__Bind__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3083:1: ( rule__Bind__Group__7__Impl rule__Bind__Group__8 )
            // InternalIotlang.g:3084:2: rule__Bind__Group__7__Impl rule__Bind__Group__8
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
    // InternalIotlang.g:3091:1: rule__Bind__Group__7__Impl : ( ( rule__Bind__Group_7__0 )* ) ;
    public final void rule__Bind__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3095:1: ( ( ( rule__Bind__Group_7__0 )* ) )
            // InternalIotlang.g:3096:1: ( ( rule__Bind__Group_7__0 )* )
            {
            // InternalIotlang.g:3096:1: ( ( rule__Bind__Group_7__0 )* )
            // InternalIotlang.g:3097:2: ( rule__Bind__Group_7__0 )*
            {
             before(grammarAccess.getBindAccess().getGroup_7()); 
            // InternalIotlang.g:3098:2: ( rule__Bind__Group_7__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIotlang.g:3098:3: rule__Bind__Group_7__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Bind__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalIotlang.g:3106:1: rule__Bind__Group__8 : rule__Bind__Group__8__Impl rule__Bind__Group__9 ;
    public final void rule__Bind__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3110:1: ( rule__Bind__Group__8__Impl rule__Bind__Group__9 )
            // InternalIotlang.g:3111:2: rule__Bind__Group__8__Impl rule__Bind__Group__9
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
    // InternalIotlang.g:3118:1: rule__Bind__Group__8__Impl : ( '}' ) ;
    public final void rule__Bind__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3122:1: ( ( '}' ) )
            // InternalIotlang.g:3123:1: ( '}' )
            {
            // InternalIotlang.g:3123:1: ( '}' )
            // InternalIotlang.g:3124:2: '}'
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
    // InternalIotlang.g:3133:1: rule__Bind__Group__9 : rule__Bind__Group__9__Impl ;
    public final void rule__Bind__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3137:1: ( rule__Bind__Group__9__Impl )
            // InternalIotlang.g:3138:2: rule__Bind__Group__9__Impl
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
    // InternalIotlang.g:3144:1: rule__Bind__Group__9__Impl : ( ( rule__Bind__AnnotationsAssignment_9 )* ) ;
    public final void rule__Bind__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3148:1: ( ( ( rule__Bind__AnnotationsAssignment_9 )* ) )
            // InternalIotlang.g:3149:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            {
            // InternalIotlang.g:3149:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            // InternalIotlang.g:3150:2: ( rule__Bind__AnnotationsAssignment_9 )*
            {
             before(grammarAccess.getBindAccess().getAnnotationsAssignment_9()); 
            // InternalIotlang.g:3151:2: ( rule__Bind__AnnotationsAssignment_9 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ANNOTATION_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalIotlang.g:3151:3: rule__Bind__AnnotationsAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Bind__AnnotationsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalIotlang.g:3160:1: rule__Bind__Group_7__0 : rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 ;
    public final void rule__Bind__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3164:1: ( rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 )
            // InternalIotlang.g:3165:2: rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1
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
    // InternalIotlang.g:3172:1: rule__Bind__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Bind__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3176:1: ( ( ',' ) )
            // InternalIotlang.g:3177:1: ( ',' )
            {
            // InternalIotlang.g:3177:1: ( ',' )
            // InternalIotlang.g:3178:2: ','
            {
             before(grammarAccess.getBindAccess().getCommaKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalIotlang.g:3187:1: rule__Bind__Group_7__1 : rule__Bind__Group_7__1__Impl ;
    public final void rule__Bind__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3191:1: ( rule__Bind__Group_7__1__Impl )
            // InternalIotlang.g:3192:2: rule__Bind__Group_7__1__Impl
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
    // InternalIotlang.g:3198:1: rule__Bind__Group_7__1__Impl : ( ( rule__Bind__TopicsAssignment_7_1 ) ) ;
    public final void rule__Bind__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3202:1: ( ( ( rule__Bind__TopicsAssignment_7_1 ) ) )
            // InternalIotlang.g:3203:1: ( ( rule__Bind__TopicsAssignment_7_1 ) )
            {
            // InternalIotlang.g:3203:1: ( ( rule__Bind__TopicsAssignment_7_1 ) )
            // InternalIotlang.g:3204:2: ( rule__Bind__TopicsAssignment_7_1 )
            {
             before(grammarAccess.getBindAccess().getTopicsAssignment_7_1()); 
            // InternalIotlang.g:3205:2: ( rule__Bind__TopicsAssignment_7_1 )
            // InternalIotlang.g:3205:3: rule__Bind__TopicsAssignment_7_1
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
    // InternalIotlang.g:3214:1: rule__IoTLangModel__ThingsAssignment_0 : ( ruleThing ) ;
    public final void rule__IoTLangModel__ThingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3218:1: ( ( ruleThing ) )
            // InternalIotlang.g:3219:2: ( ruleThing )
            {
            // InternalIotlang.g:3219:2: ( ruleThing )
            // InternalIotlang.g:3220:3: ruleThing
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
    // InternalIotlang.g:3229:1: rule__IoTLangModel__PoliciesAssignment_1 : ( rulePolicy ) ;
    public final void rule__IoTLangModel__PoliciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3233:1: ( ( rulePolicy ) )
            // InternalIotlang.g:3234:2: ( rulePolicy )
            {
            // InternalIotlang.g:3234:2: ( rulePolicy )
            // InternalIotlang.g:3235:3: rulePolicy
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
    // InternalIotlang.g:3244:1: rule__IoTLangModel__MessagesAssignment_2 : ( ruleMessage ) ;
    public final void rule__IoTLangModel__MessagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3248:1: ( ( ruleMessage ) )
            // InternalIotlang.g:3249:2: ( ruleMessage )
            {
            // InternalIotlang.g:3249:2: ( ruleMessage )
            // InternalIotlang.g:3250:3: ruleMessage
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
    // InternalIotlang.g:3259:1: rule__IoTLangModel__ChannelsAssignment_3 : ( ruleChannel ) ;
    public final void rule__IoTLangModel__ChannelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3263:1: ( ( ruleChannel ) )
            // InternalIotlang.g:3264:2: ( ruleChannel )
            {
            // InternalIotlang.g:3264:2: ( ruleChannel )
            // InternalIotlang.g:3265:3: ruleChannel
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
    // InternalIotlang.g:3274:1: rule__IoTLangModel__ProtocolsAssignment_4 : ( ruleProtocol ) ;
    public final void rule__IoTLangModel__ProtocolsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3278:1: ( ( ruleProtocol ) )
            // InternalIotlang.g:3279:2: ( ruleProtocol )
            {
            // InternalIotlang.g:3279:2: ( ruleProtocol )
            // InternalIotlang.g:3280:3: ruleProtocol
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
    // InternalIotlang.g:3289:1: rule__IoTLangModel__ConfigsAssignment_5 : ( ruleNetworkConfiguration ) ;
    public final void rule__IoTLangModel__ConfigsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3293:1: ( ( ruleNetworkConfiguration ) )
            // InternalIotlang.g:3294:2: ( ruleNetworkConfiguration )
            {
            // InternalIotlang.g:3294:2: ( ruleNetworkConfiguration )
            // InternalIotlang.g:3295:3: ruleNetworkConfiguration
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
    // InternalIotlang.g:3304:1: rule__PlatformAnnotation__NameAssignment_0 : ( RULE_ANNOTATION_ID ) ;
    public final void rule__PlatformAnnotation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3308:1: ( ( RULE_ANNOTATION_ID ) )
            // InternalIotlang.g:3309:2: ( RULE_ANNOTATION_ID )
            {
            // InternalIotlang.g:3309:2: ( RULE_ANNOTATION_ID )
            // InternalIotlang.g:3310:3: RULE_ANNOTATION_ID
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
    // InternalIotlang.g:3319:1: rule__PlatformAnnotation__ValueAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__PlatformAnnotation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3323:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:3324:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:3324:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:3325:3: RULE_STRING_LIT
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
    // InternalIotlang.g:3334:1: rule__Thing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Thing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3338:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3339:2: ( RULE_ID )
            {
            // InternalIotlang.g:3339:2: ( RULE_ID )
            // InternalIotlang.g:3340:3: RULE_ID
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
    // InternalIotlang.g:3349:1: rule__Thing__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__Thing__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3353:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3354:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3354:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3355:3: rulePlatformAnnotation
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
    // InternalIotlang.g:3364:1: rule__Thing__PortsAssignment_4 : ( rulePort ) ;
    public final void rule__Thing__PortsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3368:1: ( ( rulePort ) )
            // InternalIotlang.g:3369:2: ( rulePort )
            {
            // InternalIotlang.g:3369:2: ( rulePort )
            // InternalIotlang.g:3370:3: rulePort
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


    // $ANTLR start "rule__PubSub__NameAssignment_1"
    // InternalIotlang.g:3379:1: rule__PubSub__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PubSub__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3383:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3384:2: ( RULE_ID )
            {
            // InternalIotlang.g:3384:2: ( RULE_ID )
            // InternalIotlang.g:3385:3: RULE_ID
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
    // InternalIotlang.g:3394:1: rule__PubSub__HasTopicsAssignment_3 : ( ruleTopic ) ;
    public final void rule__PubSub__HasTopicsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3398:1: ( ( ruleTopic ) )
            // InternalIotlang.g:3399:2: ( ruleTopic )
            {
            // InternalIotlang.g:3399:2: ( ruleTopic )
            // InternalIotlang.g:3400:3: ruleTopic
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
    // InternalIotlang.g:3409:1: rule__PointToPoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PointToPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3413:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3414:2: ( RULE_ID )
            {
            // InternalIotlang.g:3414:2: ( RULE_ID )
            // InternalIotlang.g:3415:3: RULE_ID
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
    // InternalIotlang.g:3424:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3428:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3429:2: ( RULE_ID )
            {
            // InternalIotlang.g:3429:2: ( RULE_ID )
            // InternalIotlang.g:3430:3: RULE_ID
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
    // InternalIotlang.g:3439:1: rule__Policy__HasRulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Policy__HasRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3443:1: ( ( ruleRule ) )
            // InternalIotlang.g:3444:2: ( ruleRule )
            {
            // InternalIotlang.g:3444:2: ( ruleRule )
            // InternalIotlang.g:3445:3: ruleRule
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
    // InternalIotlang.g:3454:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3458:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3459:2: ( RULE_ID )
            {
            // InternalIotlang.g:3459:2: ( RULE_ID )
            // InternalIotlang.g:3460:3: RULE_ID
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
    // InternalIotlang.g:3469:1: rule__Protocol__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Protocol__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3473:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3474:2: ( RULE_ID )
            {
            // InternalIotlang.g:3474:2: ( RULE_ID )
            // InternalIotlang.g:3475:3: RULE_ID
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
    // InternalIotlang.g:3484:1: rule__Message__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3488:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3489:2: ( RULE_ID )
            {
            // InternalIotlang.g:3489:2: ( RULE_ID )
            // InternalIotlang.g:3490:3: RULE_ID
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
    // InternalIotlang.g:3499:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3503:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3504:2: ( RULE_ID )
            {
            // InternalIotlang.g:3504:2: ( RULE_ID )
            // InternalIotlang.g:3505:3: RULE_ID
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
    // InternalIotlang.g:3514:1: rule__Topic__AcceptedMessagesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Topic__AcceptedMessagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3518:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3519:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3519:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3520:3: ( RULE_ID )
            {
             before(grammarAccess.getTopicAccess().getAcceptedMessagesMessageCrossReference_3_0()); 
            // InternalIotlang.g:3521:3: ( RULE_ID )
            // InternalIotlang.g:3522:4: RULE_ID
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
    // InternalIotlang.g:3533:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3537:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3538:2: ( RULE_ID )
            {
            // InternalIotlang.g:3538:2: ( RULE_ID )
            // InternalIotlang.g:3539:3: RULE_ID
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
    // InternalIotlang.g:3548:1: rule__Rule__SubjectAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__SubjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3552:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3553:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3553:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3554:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getSubjectThingCrossReference_2_0()); 
            // InternalIotlang.g:3555:3: ( RULE_ID )
            // InternalIotlang.g:3556:4: RULE_ID
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
    // InternalIotlang.g:3567:1: rule__Rule__PermissionAssignment_3 : ( ( rule__Rule__PermissionAlternatives_3_0 ) ) ;
    public final void rule__Rule__PermissionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3571:1: ( ( ( rule__Rule__PermissionAlternatives_3_0 ) ) )
            // InternalIotlang.g:3572:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:3572:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            // InternalIotlang.g:3573:3: ( rule__Rule__PermissionAlternatives_3_0 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAlternatives_3_0()); 
            // InternalIotlang.g:3574:3: ( rule__Rule__PermissionAlternatives_3_0 )
            // InternalIotlang.g:3574:4: rule__Rule__PermissionAlternatives_3_0
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
    // InternalIotlang.g:3582:1: rule__Rule__ActionAssignment_5 : ( ( rule__Rule__ActionAlternatives_5_0 ) ) ;
    public final void rule__Rule__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3586:1: ( ( ( rule__Rule__ActionAlternatives_5_0 ) ) )
            // InternalIotlang.g:3587:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            {
            // InternalIotlang.g:3587:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            // InternalIotlang.g:3588:3: ( rule__Rule__ActionAlternatives_5_0 )
            {
             before(grammarAccess.getRuleAccess().getActionAlternatives_5_0()); 
            // InternalIotlang.g:3589:3: ( rule__Rule__ActionAlternatives_5_0 )
            // InternalIotlang.g:3589:4: rule__Rule__ActionAlternatives_5_0
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
    // InternalIotlang.g:3597:1: rule__Rule__ObjectAssignment_6_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__ObjectAssignment_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3601:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3602:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3602:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3603:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getObjectThingCrossReference_6_0_0_0()); 
            // InternalIotlang.g:3604:3: ( RULE_ID )
            // InternalIotlang.g:3605:4: RULE_ID
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
    // InternalIotlang.g:3616:1: rule__Rule__PortsAssignment_6_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__PortsAssignment_6_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3620:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3621:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3621:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3622:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getPortsPortCrossReference_6_0_1_1_0()); 
            // InternalIotlang.g:3623:3: ( RULE_ID )
            // InternalIotlang.g:3624:4: RULE_ID
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
    // InternalIotlang.g:3635:1: rule__Rule__ObjectMessageAssignment_6_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__ObjectMessageAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3639:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3640:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3640:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3641:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getObjectMessageMessageCrossReference_6_1_1_0()); 
            // InternalIotlang.g:3642:3: ( RULE_ID )
            // InternalIotlang.g:3643:4: RULE_ID
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
    // InternalIotlang.g:3654:1: rule__Domain__NameAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3658:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:3659:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:3659:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:3660:3: RULE_STRING_LIT
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
    // InternalIotlang.g:3669:1: rule__InstanceThing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstanceThing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3673:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3674:2: ( RULE_ID )
            {
            // InternalIotlang.g:3674:2: ( RULE_ID )
            // InternalIotlang.g:3675:3: RULE_ID
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
    // InternalIotlang.g:3684:1: rule__InstanceThing__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstanceThing__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3688:1: ( ( RULE_INT ) )
            // InternalIotlang.g:3689:2: ( RULE_INT )
            {
            // InternalIotlang.g:3689:2: ( RULE_INT )
            // InternalIotlang.g:3690:3: RULE_INT
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
    // InternalIotlang.g:3699:1: rule__InstanceThing__TypeThingAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceThing__TypeThingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3703:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3704:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3704:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3705:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingThingCrossReference_4_0()); 
            // InternalIotlang.g:3706:3: ( RULE_ID )
            // InternalIotlang.g:3707:4: RULE_ID
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
    // InternalIotlang.g:3718:1: rule__InstanceThing__AnnotationsAssignment_5 : ( rulePlatformAnnotation ) ;
    public final void rule__InstanceThing__AnnotationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3722:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3723:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3723:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3724:3: rulePlatformAnnotation
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
    // InternalIotlang.g:3733:1: rule__InstanceChannel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstanceChannel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3737:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3738:2: ( RULE_ID )
            {
            // InternalIotlang.g:3738:2: ( RULE_ID )
            // InternalIotlang.g:3739:3: RULE_ID
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
    // InternalIotlang.g:3748:1: rule__InstanceChannel__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstanceChannel__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3752:1: ( ( RULE_INT ) )
            // InternalIotlang.g:3753:2: ( RULE_INT )
            {
            // InternalIotlang.g:3753:2: ( RULE_INT )
            // InternalIotlang.g:3754:3: RULE_INT
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
    // InternalIotlang.g:3763:1: rule__InstanceChannel__TypeChannelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceChannel__TypeChannelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3767:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3768:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3768:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3769:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceChannelAccess().getTypeChannelChannelCrossReference_4_0()); 
            // InternalIotlang.g:3770:3: ( RULE_ID )
            // InternalIotlang.g:3771:4: RULE_ID
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
    // InternalIotlang.g:3782:1: rule__InstanceChannel__OverProtocolAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceChannel__OverProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3786:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3787:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3787:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3788:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceChannelAccess().getOverProtocolProtocolCrossReference_6_0()); 
            // InternalIotlang.g:3789:3: ( RULE_ID )
            // InternalIotlang.g:3790:4: RULE_ID
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
    // InternalIotlang.g:3801:1: rule__InstanceChannel__AnnotationsAssignment_7 : ( rulePlatformAnnotation ) ;
    public final void rule__InstanceChannel__AnnotationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3805:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3806:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3806:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3807:3: rulePlatformAnnotation
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
    // InternalIotlang.g:3816:1: rule__InstancePolicy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstancePolicy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3820:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3821:2: ( RULE_ID )
            {
            // InternalIotlang.g:3821:2: ( RULE_ID )
            // InternalIotlang.g:3822:3: RULE_ID
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
    // InternalIotlang.g:3831:1: rule__InstancePolicy__TypePolicyAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePolicy__TypePolicyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3835:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3836:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3836:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3837:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0()); 
            // InternalIotlang.g:3838:3: ( RULE_ID )
            // InternalIotlang.g:3839:4: RULE_ID
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
    // InternalIotlang.g:3850:1: rule__InstancePolicy__AnnotationsAssignment_4 : ( rulePlatformAnnotation ) ;
    public final void rule__InstancePolicy__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3854:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3855:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3855:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3856:3: rulePlatformAnnotation
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
    // InternalIotlang.g:3865:1: rule__NetworkConfiguration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NetworkConfiguration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3869:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3870:2: ( RULE_ID )
            {
            // InternalIotlang.g:3870:2: ( RULE_ID )
            // InternalIotlang.g:3871:3: RULE_ID
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
    // InternalIotlang.g:3880:1: rule__NetworkConfiguration__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__NetworkConfiguration__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3884:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3885:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3885:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3886:3: rulePlatformAnnotation
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
    // InternalIotlang.g:3895:1: rule__NetworkConfiguration__DomainAssignment_4_0 : ( ruleDomain ) ;
    public final void rule__NetworkConfiguration__DomainAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3899:1: ( ( ruleDomain ) )
            // InternalIotlang.g:3900:2: ( ruleDomain )
            {
            // InternalIotlang.g:3900:2: ( ruleDomain )
            // InternalIotlang.g:3901:3: ruleDomain
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
    // InternalIotlang.g:3910:1: rule__NetworkConfiguration__BindsAssignment_4_1 : ( ruleBind ) ;
    public final void rule__NetworkConfiguration__BindsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3914:1: ( ( ruleBind ) )
            // InternalIotlang.g:3915:2: ( ruleBind )
            {
            // InternalIotlang.g:3915:2: ( ruleBind )
            // InternalIotlang.g:3916:3: ruleBind
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
    // InternalIotlang.g:3925:1: rule__NetworkConfiguration__ThingInstancesAssignment_4_2 : ( ruleInstanceThing ) ;
    public final void rule__NetworkConfiguration__ThingInstancesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3929:1: ( ( ruleInstanceThing ) )
            // InternalIotlang.g:3930:2: ( ruleInstanceThing )
            {
            // InternalIotlang.g:3930:2: ( ruleInstanceThing )
            // InternalIotlang.g:3931:3: ruleInstanceThing
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
    // InternalIotlang.g:3940:1: rule__NetworkConfiguration__ChannelInstancesAssignment_4_3 : ( ruleInstanceChannel ) ;
    public final void rule__NetworkConfiguration__ChannelInstancesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3944:1: ( ( ruleInstanceChannel ) )
            // InternalIotlang.g:3945:2: ( ruleInstanceChannel )
            {
            // InternalIotlang.g:3945:2: ( ruleInstanceChannel )
            // InternalIotlang.g:3946:3: ruleInstanceChannel
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
    // InternalIotlang.g:3955:1: rule__NetworkConfiguration__EnforcesAssignment_4_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__NetworkConfiguration__EnforcesAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3959:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3960:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3960:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3961:3: ( RULE_ID )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_4_1_0()); 
            // InternalIotlang.g:3962:3: ( RULE_ID )
            // InternalIotlang.g:3963:4: RULE_ID
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
    // InternalIotlang.g:3974:1: rule__NetworkConfiguration__InstancePoliciyAssignment_4_5 : ( ruleInstancePolicy ) ;
    public final void rule__NetworkConfiguration__InstancePoliciyAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3978:1: ( ( ruleInstancePolicy ) )
            // InternalIotlang.g:3979:2: ( ruleInstancePolicy )
            {
            // InternalIotlang.g:3979:2: ( ruleInstancePolicy )
            // InternalIotlang.g:3980:3: ruleInstancePolicy
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
    // InternalIotlang.g:3989:1: rule__Bind__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3993:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3994:2: ( RULE_ID )
            {
            // InternalIotlang.g:3994:2: ( RULE_ID )
            // InternalIotlang.g:3995:3: RULE_ID
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
    // InternalIotlang.g:4004:1: rule__Bind__ThingInstanceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__ThingInstanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4008:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4009:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4009:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4010:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getThingInstanceInstanceThingCrossReference_2_0()); 
            // InternalIotlang.g:4011:3: ( RULE_ID )
            // InternalIotlang.g:4012:4: RULE_ID
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
    // InternalIotlang.g:4023:1: rule__Bind__DirectionAssignment_3 : ( ( rule__Bind__DirectionAlternatives_3_0 ) ) ;
    public final void rule__Bind__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4027:1: ( ( ( rule__Bind__DirectionAlternatives_3_0 ) ) )
            // InternalIotlang.g:4028:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:4028:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            // InternalIotlang.g:4029:3: ( rule__Bind__DirectionAlternatives_3_0 )
            {
             before(grammarAccess.getBindAccess().getDirectionAlternatives_3_0()); 
            // InternalIotlang.g:4030:3: ( rule__Bind__DirectionAlternatives_3_0 )
            // InternalIotlang.g:4030:4: rule__Bind__DirectionAlternatives_3_0
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
    // InternalIotlang.g:4038:1: rule__Bind__ChannelInstanceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__ChannelInstanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4042:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4043:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4043:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4044:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getChannelInstanceInstanceChannelCrossReference_4_0()); 
            // InternalIotlang.g:4045:3: ( RULE_ID )
            // InternalIotlang.g:4046:4: RULE_ID
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
    // InternalIotlang.g:4057:1: rule__Bind__TopicsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__TopicsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4061:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4062:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4062:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4063:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getTopicsTopicCrossReference_6_0()); 
            // InternalIotlang.g:4064:3: ( RULE_ID )
            // InternalIotlang.g:4065:4: RULE_ID
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
    // InternalIotlang.g:4076:1: rule__Bind__TopicsAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__TopicsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4080:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:4081:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:4081:2: ( ( RULE_ID ) )
            // InternalIotlang.g:4082:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getTopicsTopicCrossReference_7_1_0()); 
            // InternalIotlang.g:4083:3: ( RULE_ID )
            // InternalIotlang.g:4084:4: RULE_ID
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
    // InternalIotlang.g:4095:1: rule__Bind__AnnotationsAssignment_9 : ( rulePlatformAnnotation ) ;
    public final void rule__Bind__AnnotationsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:4099:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:4100:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:4100:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:4101:3: rulePlatformAnnotation
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000008001B900002L});
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
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000353000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000353000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000002L});

}