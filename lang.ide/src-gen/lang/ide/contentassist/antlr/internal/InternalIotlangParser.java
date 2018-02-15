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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_ID", "RULE_STRING_LIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "'!'", "'allow'", "'deny'", "'send'", "'receive'", "'=>'", "'<=>'", "'<='", "'thing'", "'{'", "'}'", "'channel'", "'policy'", "'topic'", "'('", "')'", "'rule'", "':'", "'domain'", "'instanceThing'", "'['", "']'", "'instanceBus'", "'over'", "'instancePolicy'", "'networkConfiguration'", "'enforce'", "'bind'", "','"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING_LIT=5;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_ANNOTATION_ID=4;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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

                if ( (LA1_0==22||(LA1_0>=25 && LA1_0<=26)||LA1_0==39) ) {
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
    // InternalIotlang.g:137:1: ruleChannel : ( ( rule__Channel__Group__0 ) ) ;
    public final void ruleChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:141:2: ( ( ( rule__Channel__Group__0 ) ) )
            // InternalIotlang.g:142:2: ( ( rule__Channel__Group__0 ) )
            {
            // InternalIotlang.g:142:2: ( ( rule__Channel__Group__0 ) )
            // InternalIotlang.g:143:3: ( rule__Channel__Group__0 )
            {
             before(grammarAccess.getChannelAccess().getGroup()); 
            // InternalIotlang.g:144:3: ( rule__Channel__Group__0 )
            // InternalIotlang.g:144:4: rule__Channel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePolicy"
    // InternalIotlang.g:153:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalIotlang.g:154:1: ( rulePolicy EOF )
            // InternalIotlang.g:155:1: rulePolicy EOF
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
    // InternalIotlang.g:162:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:166:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalIotlang.g:167:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalIotlang.g:167:2: ( ( rule__Policy__Group__0 ) )
            // InternalIotlang.g:168:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalIotlang.g:169:3: ( rule__Policy__Group__0 )
            // InternalIotlang.g:169:4: rule__Policy__Group__0
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


    // $ANTLR start "entryRuleTopic"
    // InternalIotlang.g:178:1: entryRuleTopic : ruleTopic EOF ;
    public final void entryRuleTopic() throws RecognitionException {
        try {
            // InternalIotlang.g:179:1: ( ruleTopic EOF )
            // InternalIotlang.g:180:1: ruleTopic EOF
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
    // InternalIotlang.g:187:1: ruleTopic : ( ( rule__Topic__Group__0 ) ) ;
    public final void ruleTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:191:2: ( ( ( rule__Topic__Group__0 ) ) )
            // InternalIotlang.g:192:2: ( ( rule__Topic__Group__0 ) )
            {
            // InternalIotlang.g:192:2: ( ( rule__Topic__Group__0 ) )
            // InternalIotlang.g:193:3: ( rule__Topic__Group__0 )
            {
             before(grammarAccess.getTopicAccess().getGroup()); 
            // InternalIotlang.g:194:3: ( rule__Topic__Group__0 )
            // InternalIotlang.g:194:4: rule__Topic__Group__0
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
    // InternalIotlang.g:203:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalIotlang.g:204:1: ( ruleRule EOF )
            // InternalIotlang.g:205:1: ruleRule EOF
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
    // InternalIotlang.g:212:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:216:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalIotlang.g:217:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalIotlang.g:217:2: ( ( rule__Rule__Group__0 ) )
            // InternalIotlang.g:218:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalIotlang.g:219:3: ( rule__Rule__Group__0 )
            // InternalIotlang.g:219:4: rule__Rule__Group__0
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
    // InternalIotlang.g:228:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalIotlang.g:229:1: ( ruleDomain EOF )
            // InternalIotlang.g:230:1: ruleDomain EOF
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
    // InternalIotlang.g:237:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:241:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalIotlang.g:242:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalIotlang.g:242:2: ( ( rule__Domain__Group__0 ) )
            // InternalIotlang.g:243:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalIotlang.g:244:3: ( rule__Domain__Group__0 )
            // InternalIotlang.g:244:4: rule__Domain__Group__0
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
    // InternalIotlang.g:253:1: entryRuleInstanceThing : ruleInstanceThing EOF ;
    public final void entryRuleInstanceThing() throws RecognitionException {
        try {
            // InternalIotlang.g:254:1: ( ruleInstanceThing EOF )
            // InternalIotlang.g:255:1: ruleInstanceThing EOF
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
    // InternalIotlang.g:262:1: ruleInstanceThing : ( ( rule__InstanceThing__Group__0 ) ) ;
    public final void ruleInstanceThing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:266:2: ( ( ( rule__InstanceThing__Group__0 ) ) )
            // InternalIotlang.g:267:2: ( ( rule__InstanceThing__Group__0 ) )
            {
            // InternalIotlang.g:267:2: ( ( rule__InstanceThing__Group__0 ) )
            // InternalIotlang.g:268:3: ( rule__InstanceThing__Group__0 )
            {
             before(grammarAccess.getInstanceThingAccess().getGroup()); 
            // InternalIotlang.g:269:3: ( rule__InstanceThing__Group__0 )
            // InternalIotlang.g:269:4: rule__InstanceThing__Group__0
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


    // $ANTLR start "entryRuleInstanceBus"
    // InternalIotlang.g:278:1: entryRuleInstanceBus : ruleInstanceBus EOF ;
    public final void entryRuleInstanceBus() throws RecognitionException {
        try {
            // InternalIotlang.g:279:1: ( ruleInstanceBus EOF )
            // InternalIotlang.g:280:1: ruleInstanceBus EOF
            {
             before(grammarAccess.getInstanceBusRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceBus();

            state._fsp--;

             after(grammarAccess.getInstanceBusRule()); 
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
    // $ANTLR end "entryRuleInstanceBus"


    // $ANTLR start "ruleInstanceBus"
    // InternalIotlang.g:287:1: ruleInstanceBus : ( ( rule__InstanceBus__Group__0 ) ) ;
    public final void ruleInstanceBus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:291:2: ( ( ( rule__InstanceBus__Group__0 ) ) )
            // InternalIotlang.g:292:2: ( ( rule__InstanceBus__Group__0 ) )
            {
            // InternalIotlang.g:292:2: ( ( rule__InstanceBus__Group__0 ) )
            // InternalIotlang.g:293:3: ( rule__InstanceBus__Group__0 )
            {
             before(grammarAccess.getInstanceBusAccess().getGroup()); 
            // InternalIotlang.g:294:3: ( rule__InstanceBus__Group__0 )
            // InternalIotlang.g:294:4: rule__InstanceBus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceBusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceBus"


    // $ANTLR start "entryRuleInstancePolicy"
    // InternalIotlang.g:303:1: entryRuleInstancePolicy : ruleInstancePolicy EOF ;
    public final void entryRuleInstancePolicy() throws RecognitionException {
        try {
            // InternalIotlang.g:304:1: ( ruleInstancePolicy EOF )
            // InternalIotlang.g:305:1: ruleInstancePolicy EOF
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
    // InternalIotlang.g:312:1: ruleInstancePolicy : ( ( rule__InstancePolicy__Group__0 ) ) ;
    public final void ruleInstancePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:316:2: ( ( ( rule__InstancePolicy__Group__0 ) ) )
            // InternalIotlang.g:317:2: ( ( rule__InstancePolicy__Group__0 ) )
            {
            // InternalIotlang.g:317:2: ( ( rule__InstancePolicy__Group__0 ) )
            // InternalIotlang.g:318:3: ( rule__InstancePolicy__Group__0 )
            {
             before(grammarAccess.getInstancePolicyAccess().getGroup()); 
            // InternalIotlang.g:319:3: ( rule__InstancePolicy__Group__0 )
            // InternalIotlang.g:319:4: rule__InstancePolicy__Group__0
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
    // InternalIotlang.g:328:1: entryRuleNetworkConfiguration : ruleNetworkConfiguration EOF ;
    public final void entryRuleNetworkConfiguration() throws RecognitionException {
        try {
            // InternalIotlang.g:329:1: ( ruleNetworkConfiguration EOF )
            // InternalIotlang.g:330:1: ruleNetworkConfiguration EOF
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
    // InternalIotlang.g:337:1: ruleNetworkConfiguration : ( ( rule__NetworkConfiguration__Group__0 ) ) ;
    public final void ruleNetworkConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:341:2: ( ( ( rule__NetworkConfiguration__Group__0 ) ) )
            // InternalIotlang.g:342:2: ( ( rule__NetworkConfiguration__Group__0 ) )
            {
            // InternalIotlang.g:342:2: ( ( rule__NetworkConfiguration__Group__0 ) )
            // InternalIotlang.g:343:3: ( rule__NetworkConfiguration__Group__0 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getGroup()); 
            // InternalIotlang.g:344:3: ( rule__NetworkConfiguration__Group__0 )
            // InternalIotlang.g:344:4: rule__NetworkConfiguration__Group__0
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
    // InternalIotlang.g:353:1: entryRuleBind : ruleBind EOF ;
    public final void entryRuleBind() throws RecognitionException {
        try {
            // InternalIotlang.g:354:1: ( ruleBind EOF )
            // InternalIotlang.g:355:1: ruleBind EOF
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
    // InternalIotlang.g:362:1: ruleBind : ( ( rule__Bind__Group__0 ) ) ;
    public final void ruleBind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:366:2: ( ( ( rule__Bind__Group__0 ) ) )
            // InternalIotlang.g:367:2: ( ( rule__Bind__Group__0 ) )
            {
            // InternalIotlang.g:367:2: ( ( rule__Bind__Group__0 ) )
            // InternalIotlang.g:368:3: ( rule__Bind__Group__0 )
            {
             before(grammarAccess.getBindAccess().getGroup()); 
            // InternalIotlang.g:369:3: ( rule__Bind__Group__0 )
            // InternalIotlang.g:369:4: rule__Bind__Group__0
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
    // InternalIotlang.g:377:1: rule__IoTLangModel__Alternatives : ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_2 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_3 ) ) );
    public final void rule__IoTLangModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:381:1: ( ( ( rule__IoTLangModel__ThingsAssignment_0 ) ) | ( ( rule__IoTLangModel__PoliciesAssignment_1 ) ) | ( ( rule__IoTLangModel__ChannelsAssignment_2 ) ) | ( ( rule__IoTLangModel__ConfigsAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 39:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalIotlang.g:382:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    {
                    // InternalIotlang.g:382:2: ( ( rule__IoTLangModel__ThingsAssignment_0 ) )
                    // InternalIotlang.g:383:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getThingsAssignment_0()); 
                    // InternalIotlang.g:384:3: ( rule__IoTLangModel__ThingsAssignment_0 )
                    // InternalIotlang.g:384:4: rule__IoTLangModel__ThingsAssignment_0
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
                    // InternalIotlang.g:388:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    {
                    // InternalIotlang.g:388:2: ( ( rule__IoTLangModel__PoliciesAssignment_1 ) )
                    // InternalIotlang.g:389:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getPoliciesAssignment_1()); 
                    // InternalIotlang.g:390:3: ( rule__IoTLangModel__PoliciesAssignment_1 )
                    // InternalIotlang.g:390:4: rule__IoTLangModel__PoliciesAssignment_1
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
                    // InternalIotlang.g:394:2: ( ( rule__IoTLangModel__ChannelsAssignment_2 ) )
                    {
                    // InternalIotlang.g:394:2: ( ( rule__IoTLangModel__ChannelsAssignment_2 ) )
                    // InternalIotlang.g:395:3: ( rule__IoTLangModel__ChannelsAssignment_2 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getChannelsAssignment_2()); 
                    // InternalIotlang.g:396:3: ( rule__IoTLangModel__ChannelsAssignment_2 )
                    // InternalIotlang.g:396:4: rule__IoTLangModel__ChannelsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__ChannelsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getChannelsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIotlang.g:400:2: ( ( rule__IoTLangModel__ConfigsAssignment_3 ) )
                    {
                    // InternalIotlang.g:400:2: ( ( rule__IoTLangModel__ConfigsAssignment_3 ) )
                    // InternalIotlang.g:401:3: ( rule__IoTLangModel__ConfigsAssignment_3 )
                    {
                     before(grammarAccess.getIoTLangModelAccess().getConfigsAssignment_3()); 
                    // InternalIotlang.g:402:3: ( rule__IoTLangModel__ConfigsAssignment_3 )
                    // InternalIotlang.g:402:4: rule__IoTLangModel__ConfigsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__IoTLangModel__ConfigsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getIoTLangModelAccess().getConfigsAssignment_3()); 

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


    // $ANTLR start "rule__Topic__TypeAlternatives_2_0"
    // InternalIotlang.g:410:1: rule__Topic__TypeAlternatives_2_0 : ( ( '?' ) | ( '!' ) );
    public final void rule__Topic__TypeAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:414:1: ( ( '?' ) | ( '!' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIotlang.g:415:2: ( '?' )
                    {
                    // InternalIotlang.g:415:2: ( '?' )
                    // InternalIotlang.g:416:3: '?'
                    {
                     before(grammarAccess.getTopicAccess().getTypeQuestionMarkKeyword_2_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTopicAccess().getTypeQuestionMarkKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:421:2: ( '!' )
                    {
                    // InternalIotlang.g:421:2: ( '!' )
                    // InternalIotlang.g:422:3: '!'
                    {
                     before(grammarAccess.getTopicAccess().getTypeExclamationMarkKeyword_2_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTopicAccess().getTypeExclamationMarkKeyword_2_0_1()); 

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
    // $ANTLR end "rule__Topic__TypeAlternatives_2_0"


    // $ANTLR start "rule__Rule__PermissionAlternatives_3_0"
    // InternalIotlang.g:431:1: rule__Rule__PermissionAlternatives_3_0 : ( ( 'allow' ) | ( 'deny' ) );
    public final void rule__Rule__PermissionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:435:1: ( ( 'allow' ) | ( 'deny' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalIotlang.g:436:2: ( 'allow' )
                    {
                    // InternalIotlang.g:436:2: ( 'allow' )
                    // InternalIotlang.g:437:3: 'allow'
                    {
                     before(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:442:2: ( 'deny' )
                    {
                    // InternalIotlang.g:442:2: ( 'deny' )
                    // InternalIotlang.g:443:3: 'deny'
                    {
                     before(grammarAccess.getRuleAccess().getPermissionDenyKeyword_3_0_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalIotlang.g:452:1: rule__Rule__ActionAlternatives_5_0 : ( ( 'send' ) | ( 'receive' ) );
    public final void rule__Rule__ActionAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:456:1: ( ( 'send' ) | ( 'receive' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalIotlang.g:457:2: ( 'send' )
                    {
                    // InternalIotlang.g:457:2: ( 'send' )
                    // InternalIotlang.g:458:3: 'send'
                    {
                     before(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:463:2: ( 'receive' )
                    {
                    // InternalIotlang.g:463:2: ( 'receive' )
                    // InternalIotlang.g:464:3: 'receive'
                    {
                     before(grammarAccess.getRuleAccess().getActionReceiveKeyword_5_0_1()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalIotlang.g:473:1: rule__NetworkConfiguration__Alternatives_4 : ( ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__InstancesAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__InstancesBusAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__Group_4_4__0 ) ) | ( ( rule__NetworkConfiguration__InstPoliciesAssignment_4_5 ) ) );
    public final void rule__NetworkConfiguration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:477:1: ( ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) ) | ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) ) | ( ( rule__NetworkConfiguration__InstancesAssignment_4_2 ) ) | ( ( rule__NetworkConfiguration__InstancesBusAssignment_4_3 ) ) | ( ( rule__NetworkConfiguration__Group_4_4__0 ) ) | ( ( rule__NetworkConfiguration__InstPoliciesAssignment_4_5 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt6=1;
                }
                break;
            case 41:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            case 36:
                {
                alt6=4;
                }
                break;
            case 40:
                {
                alt6=5;
                }
                break;
            case 38:
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
                    // InternalIotlang.g:478:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) )
                    {
                    // InternalIotlang.g:478:2: ( ( rule__NetworkConfiguration__DomainAssignment_4_0 ) )
                    // InternalIotlang.g:479:3: ( rule__NetworkConfiguration__DomainAssignment_4_0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getDomainAssignment_4_0()); 
                    // InternalIotlang.g:480:3: ( rule__NetworkConfiguration__DomainAssignment_4_0 )
                    // InternalIotlang.g:480:4: rule__NetworkConfiguration__DomainAssignment_4_0
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
                    // InternalIotlang.g:484:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) )
                    {
                    // InternalIotlang.g:484:2: ( ( rule__NetworkConfiguration__BindsAssignment_4_1 ) )
                    // InternalIotlang.g:485:3: ( rule__NetworkConfiguration__BindsAssignment_4_1 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getBindsAssignment_4_1()); 
                    // InternalIotlang.g:486:3: ( rule__NetworkConfiguration__BindsAssignment_4_1 )
                    // InternalIotlang.g:486:4: rule__NetworkConfiguration__BindsAssignment_4_1
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
                    // InternalIotlang.g:490:2: ( ( rule__NetworkConfiguration__InstancesAssignment_4_2 ) )
                    {
                    // InternalIotlang.g:490:2: ( ( rule__NetworkConfiguration__InstancesAssignment_4_2 ) )
                    // InternalIotlang.g:491:3: ( rule__NetworkConfiguration__InstancesAssignment_4_2 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getInstancesAssignment_4_2()); 
                    // InternalIotlang.g:492:3: ( rule__NetworkConfiguration__InstancesAssignment_4_2 )
                    // InternalIotlang.g:492:4: rule__NetworkConfiguration__InstancesAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__InstancesAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getInstancesAssignment_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIotlang.g:496:2: ( ( rule__NetworkConfiguration__InstancesBusAssignment_4_3 ) )
                    {
                    // InternalIotlang.g:496:2: ( ( rule__NetworkConfiguration__InstancesBusAssignment_4_3 ) )
                    // InternalIotlang.g:497:3: ( rule__NetworkConfiguration__InstancesBusAssignment_4_3 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getInstancesBusAssignment_4_3()); 
                    // InternalIotlang.g:498:3: ( rule__NetworkConfiguration__InstancesBusAssignment_4_3 )
                    // InternalIotlang.g:498:4: rule__NetworkConfiguration__InstancesBusAssignment_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__InstancesBusAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getInstancesBusAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIotlang.g:502:2: ( ( rule__NetworkConfiguration__Group_4_4__0 ) )
                    {
                    // InternalIotlang.g:502:2: ( ( rule__NetworkConfiguration__Group_4_4__0 ) )
                    // InternalIotlang.g:503:3: ( rule__NetworkConfiguration__Group_4_4__0 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getGroup_4_4()); 
                    // InternalIotlang.g:504:3: ( rule__NetworkConfiguration__Group_4_4__0 )
                    // InternalIotlang.g:504:4: rule__NetworkConfiguration__Group_4_4__0
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
                    // InternalIotlang.g:508:2: ( ( rule__NetworkConfiguration__InstPoliciesAssignment_4_5 ) )
                    {
                    // InternalIotlang.g:508:2: ( ( rule__NetworkConfiguration__InstPoliciesAssignment_4_5 ) )
                    // InternalIotlang.g:509:3: ( rule__NetworkConfiguration__InstPoliciesAssignment_4_5 )
                    {
                     before(grammarAccess.getNetworkConfigurationAccess().getInstPoliciesAssignment_4_5()); 
                    // InternalIotlang.g:510:3: ( rule__NetworkConfiguration__InstPoliciesAssignment_4_5 )
                    // InternalIotlang.g:510:4: rule__NetworkConfiguration__InstPoliciesAssignment_4_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConfiguration__InstPoliciesAssignment_4_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkConfigurationAccess().getInstPoliciesAssignment_4_5()); 

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
    // InternalIotlang.g:518:1: rule__Bind__DirectionAlternatives_3_0 : ( ( '=>' ) | ( '<=>' ) | ( '<=' ) );
    public final void rule__Bind__DirectionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:522:1: ( ( '=>' ) | ( '<=>' ) | ( '<=' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
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
                    // InternalIotlang.g:523:2: ( '=>' )
                    {
                    // InternalIotlang.g:523:2: ( '=>' )
                    // InternalIotlang.g:524:3: '=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:529:2: ( '<=>' )
                    {
                    // InternalIotlang.g:529:2: ( '<=>' )
                    // InternalIotlang.g:530:3: '<=>'
                    {
                     before(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIotlang.g:535:2: ( '<=' )
                    {
                    // InternalIotlang.g:535:2: ( '<=' )
                    // InternalIotlang.g:536:3: '<='
                    {
                     before(grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignKeyword_3_0_2()); 
                    match(input,21,FOLLOW_2); 
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
    // InternalIotlang.g:545:1: rule__PlatformAnnotation__Group__0 : rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 ;
    public final void rule__PlatformAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:549:1: ( rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1 )
            // InternalIotlang.g:550:2: rule__PlatformAnnotation__Group__0__Impl rule__PlatformAnnotation__Group__1
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
    // InternalIotlang.g:557:1: rule__PlatformAnnotation__Group__0__Impl : ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) ;
    public final void rule__PlatformAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:561:1: ( ( ( rule__PlatformAnnotation__NameAssignment_0 ) ) )
            // InternalIotlang.g:562:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            {
            // InternalIotlang.g:562:1: ( ( rule__PlatformAnnotation__NameAssignment_0 ) )
            // InternalIotlang.g:563:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0()); 
            // InternalIotlang.g:564:2: ( rule__PlatformAnnotation__NameAssignment_0 )
            // InternalIotlang.g:564:3: rule__PlatformAnnotation__NameAssignment_0
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
    // InternalIotlang.g:572:1: rule__PlatformAnnotation__Group__1 : rule__PlatformAnnotation__Group__1__Impl ;
    public final void rule__PlatformAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:576:1: ( rule__PlatformAnnotation__Group__1__Impl )
            // InternalIotlang.g:577:2: rule__PlatformAnnotation__Group__1__Impl
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
    // InternalIotlang.g:583:1: rule__PlatformAnnotation__Group__1__Impl : ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) ;
    public final void rule__PlatformAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:587:1: ( ( ( rule__PlatformAnnotation__ValueAssignment_1 ) ) )
            // InternalIotlang.g:588:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            {
            // InternalIotlang.g:588:1: ( ( rule__PlatformAnnotation__ValueAssignment_1 ) )
            // InternalIotlang.g:589:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            {
             before(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1()); 
            // InternalIotlang.g:590:2: ( rule__PlatformAnnotation__ValueAssignment_1 )
            // InternalIotlang.g:590:3: rule__PlatformAnnotation__ValueAssignment_1
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
    // InternalIotlang.g:599:1: rule__Thing__Group__0 : rule__Thing__Group__0__Impl rule__Thing__Group__1 ;
    public final void rule__Thing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:603:1: ( rule__Thing__Group__0__Impl rule__Thing__Group__1 )
            // InternalIotlang.g:604:2: rule__Thing__Group__0__Impl rule__Thing__Group__1
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
    // InternalIotlang.g:611:1: rule__Thing__Group__0__Impl : ( 'thing' ) ;
    public final void rule__Thing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:615:1: ( ( 'thing' ) )
            // InternalIotlang.g:616:1: ( 'thing' )
            {
            // InternalIotlang.g:616:1: ( 'thing' )
            // InternalIotlang.g:617:2: 'thing'
            {
             before(grammarAccess.getThingAccess().getThingKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalIotlang.g:626:1: rule__Thing__Group__1 : rule__Thing__Group__1__Impl rule__Thing__Group__2 ;
    public final void rule__Thing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:630:1: ( rule__Thing__Group__1__Impl rule__Thing__Group__2 )
            // InternalIotlang.g:631:2: rule__Thing__Group__1__Impl rule__Thing__Group__2
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
    // InternalIotlang.g:638:1: rule__Thing__Group__1__Impl : ( ( rule__Thing__NameAssignment_1 ) ) ;
    public final void rule__Thing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:642:1: ( ( ( rule__Thing__NameAssignment_1 ) ) )
            // InternalIotlang.g:643:1: ( ( rule__Thing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:643:1: ( ( rule__Thing__NameAssignment_1 ) )
            // InternalIotlang.g:644:2: ( rule__Thing__NameAssignment_1 )
            {
             before(grammarAccess.getThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:645:2: ( rule__Thing__NameAssignment_1 )
            // InternalIotlang.g:645:3: rule__Thing__NameAssignment_1
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
    // InternalIotlang.g:653:1: rule__Thing__Group__2 : rule__Thing__Group__2__Impl rule__Thing__Group__3 ;
    public final void rule__Thing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:657:1: ( rule__Thing__Group__2__Impl rule__Thing__Group__3 )
            // InternalIotlang.g:658:2: rule__Thing__Group__2__Impl rule__Thing__Group__3
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
    // InternalIotlang.g:665:1: rule__Thing__Group__2__Impl : ( ( rule__Thing__AnnotationsAssignment_2 )* ) ;
    public final void rule__Thing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:669:1: ( ( ( rule__Thing__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:670:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:670:1: ( ( rule__Thing__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:671:2: ( rule__Thing__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getThingAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:672:2: ( rule__Thing__AnnotationsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ANNOTATION_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIotlang.g:672:3: rule__Thing__AnnotationsAssignment_2
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
    // InternalIotlang.g:680:1: rule__Thing__Group__3 : rule__Thing__Group__3__Impl rule__Thing__Group__4 ;
    public final void rule__Thing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:684:1: ( rule__Thing__Group__3__Impl rule__Thing__Group__4 )
            // InternalIotlang.g:685:2: rule__Thing__Group__3__Impl rule__Thing__Group__4
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
    // InternalIotlang.g:692:1: rule__Thing__Group__3__Impl : ( '{' ) ;
    public final void rule__Thing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:696:1: ( ( '{' ) )
            // InternalIotlang.g:697:1: ( '{' )
            {
            // InternalIotlang.g:697:1: ( '{' )
            // InternalIotlang.g:698:2: '{'
            {
             before(grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalIotlang.g:707:1: rule__Thing__Group__4 : rule__Thing__Group__4__Impl ;
    public final void rule__Thing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:711:1: ( rule__Thing__Group__4__Impl )
            // InternalIotlang.g:712:2: rule__Thing__Group__4__Impl
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
    // InternalIotlang.g:718:1: rule__Thing__Group__4__Impl : ( '}' ) ;
    public final void rule__Thing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:722:1: ( ( '}' ) )
            // InternalIotlang.g:723:1: ( '}' )
            {
            // InternalIotlang.g:723:1: ( '}' )
            // InternalIotlang.g:724:2: '}'
            {
             before(grammarAccess.getThingAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__Channel__Group__0"
    // InternalIotlang.g:734:1: rule__Channel__Group__0 : rule__Channel__Group__0__Impl rule__Channel__Group__1 ;
    public final void rule__Channel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:738:1: ( rule__Channel__Group__0__Impl rule__Channel__Group__1 )
            // InternalIotlang.g:739:2: rule__Channel__Group__0__Impl rule__Channel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Channel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__0"


    // $ANTLR start "rule__Channel__Group__0__Impl"
    // InternalIotlang.g:746:1: rule__Channel__Group__0__Impl : ( 'channel' ) ;
    public final void rule__Channel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:750:1: ( ( 'channel' ) )
            // InternalIotlang.g:751:1: ( 'channel' )
            {
            // InternalIotlang.g:751:1: ( 'channel' )
            // InternalIotlang.g:752:2: 'channel'
            {
             before(grammarAccess.getChannelAccess().getChannelKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getChannelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__0__Impl"


    // $ANTLR start "rule__Channel__Group__1"
    // InternalIotlang.g:761:1: rule__Channel__Group__1 : rule__Channel__Group__1__Impl rule__Channel__Group__2 ;
    public final void rule__Channel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:765:1: ( rule__Channel__Group__1__Impl rule__Channel__Group__2 )
            // InternalIotlang.g:766:2: rule__Channel__Group__1__Impl rule__Channel__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Channel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__1"


    // $ANTLR start "rule__Channel__Group__1__Impl"
    // InternalIotlang.g:773:1: rule__Channel__Group__1__Impl : ( ( rule__Channel__NameAssignment_1 ) ) ;
    public final void rule__Channel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:777:1: ( ( ( rule__Channel__NameAssignment_1 ) ) )
            // InternalIotlang.g:778:1: ( ( rule__Channel__NameAssignment_1 ) )
            {
            // InternalIotlang.g:778:1: ( ( rule__Channel__NameAssignment_1 ) )
            // InternalIotlang.g:779:2: ( rule__Channel__NameAssignment_1 )
            {
             before(grammarAccess.getChannelAccess().getNameAssignment_1()); 
            // InternalIotlang.g:780:2: ( rule__Channel__NameAssignment_1 )
            // InternalIotlang.g:780:3: rule__Channel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Channel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__1__Impl"


    // $ANTLR start "rule__Channel__Group__2"
    // InternalIotlang.g:788:1: rule__Channel__Group__2 : rule__Channel__Group__2__Impl rule__Channel__Group__3 ;
    public final void rule__Channel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:792:1: ( rule__Channel__Group__2__Impl rule__Channel__Group__3 )
            // InternalIotlang.g:793:2: rule__Channel__Group__2__Impl rule__Channel__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Channel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__2"


    // $ANTLR start "rule__Channel__Group__2__Impl"
    // InternalIotlang.g:800:1: rule__Channel__Group__2__Impl : ( '{' ) ;
    public final void rule__Channel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:804:1: ( ( '{' ) )
            // InternalIotlang.g:805:1: ( '{' )
            {
            // InternalIotlang.g:805:1: ( '{' )
            // InternalIotlang.g:806:2: '{'
            {
             before(grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__2__Impl"


    // $ANTLR start "rule__Channel__Group__3"
    // InternalIotlang.g:815:1: rule__Channel__Group__3 : rule__Channel__Group__3__Impl rule__Channel__Group__4 ;
    public final void rule__Channel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:819:1: ( rule__Channel__Group__3__Impl rule__Channel__Group__4 )
            // InternalIotlang.g:820:2: rule__Channel__Group__3__Impl rule__Channel__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Channel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__3"


    // $ANTLR start "rule__Channel__Group__3__Impl"
    // InternalIotlang.g:827:1: rule__Channel__Group__3__Impl : ( ( rule__Channel__TopicsAssignment_3 )* ) ;
    public final void rule__Channel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:831:1: ( ( ( rule__Channel__TopicsAssignment_3 )* ) )
            // InternalIotlang.g:832:1: ( ( rule__Channel__TopicsAssignment_3 )* )
            {
            // InternalIotlang.g:832:1: ( ( rule__Channel__TopicsAssignment_3 )* )
            // InternalIotlang.g:833:2: ( rule__Channel__TopicsAssignment_3 )*
            {
             before(grammarAccess.getChannelAccess().getTopicsAssignment_3()); 
            // InternalIotlang.g:834:2: ( rule__Channel__TopicsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIotlang.g:834:3: rule__Channel__TopicsAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Channel__TopicsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getChannelAccess().getTopicsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__3__Impl"


    // $ANTLR start "rule__Channel__Group__4"
    // InternalIotlang.g:842:1: rule__Channel__Group__4 : rule__Channel__Group__4__Impl ;
    public final void rule__Channel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:846:1: ( rule__Channel__Group__4__Impl )
            // InternalIotlang.g:847:2: rule__Channel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__4"


    // $ANTLR start "rule__Channel__Group__4__Impl"
    // InternalIotlang.g:853:1: rule__Channel__Group__4__Impl : ( '}' ) ;
    public final void rule__Channel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:857:1: ( ( '}' ) )
            // InternalIotlang.g:858:1: ( '}' )
            {
            // InternalIotlang.g:858:1: ( '}' )
            // InternalIotlang.g:859:2: '}'
            {
             before(grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__4__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalIotlang.g:869:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:873:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalIotlang.g:874:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
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
    // InternalIotlang.g:881:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:885:1: ( ( 'policy' ) )
            // InternalIotlang.g:886:1: ( 'policy' )
            {
            // InternalIotlang.g:886:1: ( 'policy' )
            // InternalIotlang.g:887:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalIotlang.g:896:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:900:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalIotlang.g:901:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
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
    // InternalIotlang.g:908:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:912:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalIotlang.g:913:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:913:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalIotlang.g:914:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:915:2: ( rule__Policy__NameAssignment_1 )
            // InternalIotlang.g:915:3: rule__Policy__NameAssignment_1
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
    // InternalIotlang.g:923:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:927:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalIotlang.g:928:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
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
    // InternalIotlang.g:935:1: rule__Policy__Group__2__Impl : ( '{' ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:939:1: ( ( '{' ) )
            // InternalIotlang.g:940:1: ( '{' )
            {
            // InternalIotlang.g:940:1: ( '{' )
            // InternalIotlang.g:941:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalIotlang.g:950:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:954:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalIotlang.g:955:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
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
    // InternalIotlang.g:962:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__RulesAssignment_3 )* ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:966:1: ( ( ( rule__Policy__RulesAssignment_3 )* ) )
            // InternalIotlang.g:967:1: ( ( rule__Policy__RulesAssignment_3 )* )
            {
            // InternalIotlang.g:967:1: ( ( rule__Policy__RulesAssignment_3 )* )
            // InternalIotlang.g:968:2: ( rule__Policy__RulesAssignment_3 )*
            {
             before(grammarAccess.getPolicyAccess().getRulesAssignment_3()); 
            // InternalIotlang.g:969:2: ( rule__Policy__RulesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIotlang.g:969:3: rule__Policy__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Policy__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getRulesAssignment_3()); 

            }


            }

        }
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
    // InternalIotlang.g:977:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:981:1: ( rule__Policy__Group__4__Impl )
            // InternalIotlang.g:982:2: rule__Policy__Group__4__Impl
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
    // InternalIotlang.g:988:1: rule__Policy__Group__4__Impl : ( '}' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:992:1: ( ( '}' ) )
            // InternalIotlang.g:993:1: ( '}' )
            {
            // InternalIotlang.g:993:1: ( '}' )
            // InternalIotlang.g:994:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__Topic__Group__0"
    // InternalIotlang.g:1004:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1008:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // InternalIotlang.g:1009:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
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
    // InternalIotlang.g:1016:1: rule__Topic__Group__0__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1020:1: ( ( 'topic' ) )
            // InternalIotlang.g:1021:1: ( 'topic' )
            {
            // InternalIotlang.g:1021:1: ( 'topic' )
            // InternalIotlang.g:1022:2: 'topic'
            {
             before(grammarAccess.getTopicAccess().getTopicKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalIotlang.g:1031:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1035:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // InternalIotlang.g:1036:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
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
    // InternalIotlang.g:1043:1: rule__Topic__Group__1__Impl : ( ( rule__Topic__NameAssignment_1 ) ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1047:1: ( ( ( rule__Topic__NameAssignment_1 ) ) )
            // InternalIotlang.g:1048:1: ( ( rule__Topic__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1048:1: ( ( rule__Topic__NameAssignment_1 ) )
            // InternalIotlang.g:1049:2: ( rule__Topic__NameAssignment_1 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1050:2: ( rule__Topic__NameAssignment_1 )
            // InternalIotlang.g:1050:3: rule__Topic__NameAssignment_1
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
    // InternalIotlang.g:1058:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1062:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // InternalIotlang.g:1063:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalIotlang.g:1070:1: rule__Topic__Group__2__Impl : ( ( rule__Topic__TypeAssignment_2 ) ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1074:1: ( ( ( rule__Topic__TypeAssignment_2 ) ) )
            // InternalIotlang.g:1075:1: ( ( rule__Topic__TypeAssignment_2 ) )
            {
            // InternalIotlang.g:1075:1: ( ( rule__Topic__TypeAssignment_2 ) )
            // InternalIotlang.g:1076:2: ( rule__Topic__TypeAssignment_2 )
            {
             before(grammarAccess.getTopicAccess().getTypeAssignment_2()); 
            // InternalIotlang.g:1077:2: ( rule__Topic__TypeAssignment_2 )
            // InternalIotlang.g:1077:3: rule__Topic__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Topic__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getTypeAssignment_2()); 

            }


            }

        }
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
    // InternalIotlang.g:1085:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1089:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // InternalIotlang.g:1090:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalIotlang.g:1097:1: rule__Topic__Group__3__Impl : ( '(' ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1101:1: ( ( '(' ) )
            // InternalIotlang.g:1102:1: ( '(' )
            {
            // InternalIotlang.g:1102:1: ( '(' )
            // InternalIotlang.g:1103:2: '('
            {
             before(grammarAccess.getTopicAccess().getLeftParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalIotlang.g:1112:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl rule__Topic__Group__5 ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1116:1: ( rule__Topic__Group__4__Impl rule__Topic__Group__5 )
            // InternalIotlang.g:1117:2: rule__Topic__Group__4__Impl rule__Topic__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Topic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__5();

            state._fsp--;


            }

        }
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
    // InternalIotlang.g:1124:1: rule__Topic__Group__4__Impl : ( ( rule__Topic__MessagesAssignment_4 ) ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1128:1: ( ( ( rule__Topic__MessagesAssignment_4 ) ) )
            // InternalIotlang.g:1129:1: ( ( rule__Topic__MessagesAssignment_4 ) )
            {
            // InternalIotlang.g:1129:1: ( ( rule__Topic__MessagesAssignment_4 ) )
            // InternalIotlang.g:1130:2: ( rule__Topic__MessagesAssignment_4 )
            {
             before(grammarAccess.getTopicAccess().getMessagesAssignment_4()); 
            // InternalIotlang.g:1131:2: ( rule__Topic__MessagesAssignment_4 )
            // InternalIotlang.g:1131:3: rule__Topic__MessagesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Topic__MessagesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getMessagesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Topic__Group__5"
    // InternalIotlang.g:1139:1: rule__Topic__Group__5 : rule__Topic__Group__5__Impl ;
    public final void rule__Topic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1143:1: ( rule__Topic__Group__5__Impl )
            // InternalIotlang.g:1144:2: rule__Topic__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__5"


    // $ANTLR start "rule__Topic__Group__5__Impl"
    // InternalIotlang.g:1150:1: rule__Topic__Group__5__Impl : ( ')' ) ;
    public final void rule__Topic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1154:1: ( ( ')' ) )
            // InternalIotlang.g:1155:1: ( ')' )
            {
            // InternalIotlang.g:1155:1: ( ')' )
            // InternalIotlang.g:1156:2: ')'
            {
             before(grammarAccess.getTopicAccess().getRightParenthesisKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalIotlang.g:1166:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1170:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalIotlang.g:1171:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalIotlang.g:1178:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1182:1: ( ( 'rule' ) )
            // InternalIotlang.g:1183:1: ( 'rule' )
            {
            // InternalIotlang.g:1183:1: ( 'rule' )
            // InternalIotlang.g:1184:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalIotlang.g:1193:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1197:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalIotlang.g:1198:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalIotlang.g:1205:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1209:1: ( ( ( rule__Rule__NameAssignment_1 )? ) )
            // InternalIotlang.g:1210:1: ( ( rule__Rule__NameAssignment_1 )? )
            {
            // InternalIotlang.g:1210:1: ( ( rule__Rule__NameAssignment_1 )? )
            // InternalIotlang.g:1211:2: ( rule__Rule__NameAssignment_1 )?
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1212:2: ( rule__Rule__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalIotlang.g:1212:3: rule__Rule__NameAssignment_1
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
    // InternalIotlang.g:1220:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1224:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalIotlang.g:1225:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalIotlang.g:1232:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ThingsAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1236:1: ( ( ( rule__Rule__ThingsAssignment_2 ) ) )
            // InternalIotlang.g:1237:1: ( ( rule__Rule__ThingsAssignment_2 ) )
            {
            // InternalIotlang.g:1237:1: ( ( rule__Rule__ThingsAssignment_2 ) )
            // InternalIotlang.g:1238:2: ( rule__Rule__ThingsAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getThingsAssignment_2()); 
            // InternalIotlang.g:1239:2: ( rule__Rule__ThingsAssignment_2 )
            // InternalIotlang.g:1239:3: rule__Rule__ThingsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ThingsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getThingsAssignment_2()); 

            }


            }

        }
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
    // InternalIotlang.g:1247:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1251:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalIotlang.g:1252:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalIotlang.g:1259:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__PermissionAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1263:1: ( ( ( rule__Rule__PermissionAssignment_3 ) ) )
            // InternalIotlang.g:1264:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            {
            // InternalIotlang.g:1264:1: ( ( rule__Rule__PermissionAssignment_3 ) )
            // InternalIotlang.g:1265:2: ( rule__Rule__PermissionAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAssignment_3()); 
            // InternalIotlang.g:1266:2: ( rule__Rule__PermissionAssignment_3 )
            // InternalIotlang.g:1266:3: rule__Rule__PermissionAssignment_3
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
    // InternalIotlang.g:1274:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1278:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalIotlang.g:1279:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
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
    // InternalIotlang.g:1286:1: rule__Rule__Group__4__Impl : ( ':' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1290:1: ( ( ':' ) )
            // InternalIotlang.g:1291:1: ( ':' )
            {
            // InternalIotlang.g:1291:1: ( ':' )
            // InternalIotlang.g:1292:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalIotlang.g:1301:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1305:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalIotlang.g:1306:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
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
    // InternalIotlang.g:1313:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__ActionAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1317:1: ( ( ( rule__Rule__ActionAssignment_5 ) ) )
            // InternalIotlang.g:1318:1: ( ( rule__Rule__ActionAssignment_5 ) )
            {
            // InternalIotlang.g:1318:1: ( ( rule__Rule__ActionAssignment_5 ) )
            // InternalIotlang.g:1319:2: ( rule__Rule__ActionAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getActionAssignment_5()); 
            // InternalIotlang.g:1320:2: ( rule__Rule__ActionAssignment_5 )
            // InternalIotlang.g:1320:3: rule__Rule__ActionAssignment_5
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
    // InternalIotlang.g:1328:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1332:1: ( rule__Rule__Group__6__Impl )
            // InternalIotlang.g:1333:2: rule__Rule__Group__6__Impl
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
    // InternalIotlang.g:1339:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__ResAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1343:1: ( ( ( rule__Rule__ResAssignment_6 ) ) )
            // InternalIotlang.g:1344:1: ( ( rule__Rule__ResAssignment_6 ) )
            {
            // InternalIotlang.g:1344:1: ( ( rule__Rule__ResAssignment_6 ) )
            // InternalIotlang.g:1345:2: ( rule__Rule__ResAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getResAssignment_6()); 
            // InternalIotlang.g:1346:2: ( rule__Rule__ResAssignment_6 )
            // InternalIotlang.g:1346:3: rule__Rule__ResAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ResAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getResAssignment_6()); 

            }


            }

        }
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
    // InternalIotlang.g:1355:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1359:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalIotlang.g:1360:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalIotlang.g:1367:1: rule__Domain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1371:1: ( ( 'domain' ) )
            // InternalIotlang.g:1372:1: ( 'domain' )
            {
            // InternalIotlang.g:1372:1: ( 'domain' )
            // InternalIotlang.g:1373:2: 'domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalIotlang.g:1382:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1386:1: ( rule__Domain__Group__1__Impl )
            // InternalIotlang.g:1387:2: rule__Domain__Group__1__Impl
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
    // InternalIotlang.g:1393:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1397:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalIotlang.g:1398:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1398:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalIotlang.g:1399:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1400:2: ( rule__Domain__NameAssignment_1 )
            // InternalIotlang.g:1400:3: rule__Domain__NameAssignment_1
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
    // InternalIotlang.g:1409:1: rule__InstanceThing__Group__0 : rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 ;
    public final void rule__InstanceThing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1413:1: ( rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1 )
            // InternalIotlang.g:1414:2: rule__InstanceThing__Group__0__Impl rule__InstanceThing__Group__1
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
    // InternalIotlang.g:1421:1: rule__InstanceThing__Group__0__Impl : ( 'instanceThing' ) ;
    public final void rule__InstanceThing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1425:1: ( ( 'instanceThing' ) )
            // InternalIotlang.g:1426:1: ( 'instanceThing' )
            {
            // InternalIotlang.g:1426:1: ( 'instanceThing' )
            // InternalIotlang.g:1427:2: 'instanceThing'
            {
             before(grammarAccess.getInstanceThingAccess().getInstanceThingKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalIotlang.g:1436:1: rule__InstanceThing__Group__1 : rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 ;
    public final void rule__InstanceThing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1440:1: ( rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2 )
            // InternalIotlang.g:1441:2: rule__InstanceThing__Group__1__Impl rule__InstanceThing__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalIotlang.g:1448:1: rule__InstanceThing__Group__1__Impl : ( ( rule__InstanceThing__NameAssignment_1 ) ) ;
    public final void rule__InstanceThing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1452:1: ( ( ( rule__InstanceThing__NameAssignment_1 ) ) )
            // InternalIotlang.g:1453:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1453:1: ( ( rule__InstanceThing__NameAssignment_1 ) )
            // InternalIotlang.g:1454:2: ( rule__InstanceThing__NameAssignment_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1455:2: ( rule__InstanceThing__NameAssignment_1 )
            // InternalIotlang.g:1455:3: rule__InstanceThing__NameAssignment_1
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
    // InternalIotlang.g:1463:1: rule__InstanceThing__Group__2 : rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 ;
    public final void rule__InstanceThing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1467:1: ( rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3 )
            // InternalIotlang.g:1468:2: rule__InstanceThing__Group__2__Impl rule__InstanceThing__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalIotlang.g:1475:1: rule__InstanceThing__Group__2__Impl : ( ( rule__InstanceThing__Group_2__0 )* ) ;
    public final void rule__InstanceThing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1479:1: ( ( ( rule__InstanceThing__Group_2__0 )* ) )
            // InternalIotlang.g:1480:1: ( ( rule__InstanceThing__Group_2__0 )* )
            {
            // InternalIotlang.g:1480:1: ( ( rule__InstanceThing__Group_2__0 )* )
            // InternalIotlang.g:1481:2: ( rule__InstanceThing__Group_2__0 )*
            {
             before(grammarAccess.getInstanceThingAccess().getGroup_2()); 
            // InternalIotlang.g:1482:2: ( rule__InstanceThing__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIotlang.g:1482:3: rule__InstanceThing__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__InstanceThing__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalIotlang.g:1490:1: rule__InstanceThing__Group__3 : rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 ;
    public final void rule__InstanceThing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1494:1: ( rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4 )
            // InternalIotlang.g:1495:2: rule__InstanceThing__Group__3__Impl rule__InstanceThing__Group__4
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
    // InternalIotlang.g:1502:1: rule__InstanceThing__Group__3__Impl : ( ':' ) ;
    public final void rule__InstanceThing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1506:1: ( ( ':' ) )
            // InternalIotlang.g:1507:1: ( ':' )
            {
            // InternalIotlang.g:1507:1: ( ':' )
            // InternalIotlang.g:1508:2: ':'
            {
             before(grammarAccess.getInstanceThingAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalIotlang.g:1517:1: rule__InstanceThing__Group__4 : rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 ;
    public final void rule__InstanceThing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1521:1: ( rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5 )
            // InternalIotlang.g:1522:2: rule__InstanceThing__Group__4__Impl rule__InstanceThing__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalIotlang.g:1529:1: rule__InstanceThing__Group__4__Impl : ( ( rule__InstanceThing__TypeAssignment_4 ) ) ;
    public final void rule__InstanceThing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1533:1: ( ( ( rule__InstanceThing__TypeAssignment_4 ) ) )
            // InternalIotlang.g:1534:1: ( ( rule__InstanceThing__TypeAssignment_4 ) )
            {
            // InternalIotlang.g:1534:1: ( ( rule__InstanceThing__TypeAssignment_4 ) )
            // InternalIotlang.g:1535:2: ( rule__InstanceThing__TypeAssignment_4 )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeAssignment_4()); 
            // InternalIotlang.g:1536:2: ( rule__InstanceThing__TypeAssignment_4 )
            // InternalIotlang.g:1536:3: rule__InstanceThing__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InstanceThing__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInstanceThingAccess().getTypeAssignment_4()); 

            }


            }

        }
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
    // InternalIotlang.g:1544:1: rule__InstanceThing__Group__5 : rule__InstanceThing__Group__5__Impl ;
    public final void rule__InstanceThing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1548:1: ( rule__InstanceThing__Group__5__Impl )
            // InternalIotlang.g:1549:2: rule__InstanceThing__Group__5__Impl
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
    // InternalIotlang.g:1555:1: rule__InstanceThing__Group__5__Impl : ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) ;
    public final void rule__InstanceThing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1559:1: ( ( ( rule__InstanceThing__AnnotationsAssignment_5 )* ) )
            // InternalIotlang.g:1560:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            {
            // InternalIotlang.g:1560:1: ( ( rule__InstanceThing__AnnotationsAssignment_5 )* )
            // InternalIotlang.g:1561:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            {
             before(grammarAccess.getInstanceThingAccess().getAnnotationsAssignment_5()); 
            // InternalIotlang.g:1562:2: ( rule__InstanceThing__AnnotationsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ANNOTATION_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIotlang.g:1562:3: rule__InstanceThing__AnnotationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanceThing__AnnotationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalIotlang.g:1571:1: rule__InstanceThing__Group_2__0 : rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 ;
    public final void rule__InstanceThing__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1575:1: ( rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1 )
            // InternalIotlang.g:1576:2: rule__InstanceThing__Group_2__0__Impl rule__InstanceThing__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalIotlang.g:1583:1: rule__InstanceThing__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstanceThing__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1587:1: ( ( '[' ) )
            // InternalIotlang.g:1588:1: ( '[' )
            {
            // InternalIotlang.g:1588:1: ( '[' )
            // InternalIotlang.g:1589:2: '['
            {
             before(grammarAccess.getInstanceThingAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalIotlang.g:1598:1: rule__InstanceThing__Group_2__1 : rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 ;
    public final void rule__InstanceThing__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1602:1: ( rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2 )
            // InternalIotlang.g:1603:2: rule__InstanceThing__Group_2__1__Impl rule__InstanceThing__Group_2__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalIotlang.g:1610:1: rule__InstanceThing__Group_2__1__Impl : ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) ;
    public final void rule__InstanceThing__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1614:1: ( ( ( rule__InstanceThing__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:1615:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:1615:1: ( ( rule__InstanceThing__NumberAssignment_2_1 ) )
            // InternalIotlang.g:1616:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstanceThingAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:1617:2: ( rule__InstanceThing__NumberAssignment_2_1 )
            // InternalIotlang.g:1617:3: rule__InstanceThing__NumberAssignment_2_1
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
    // InternalIotlang.g:1625:1: rule__InstanceThing__Group_2__2 : rule__InstanceThing__Group_2__2__Impl ;
    public final void rule__InstanceThing__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1629:1: ( rule__InstanceThing__Group_2__2__Impl )
            // InternalIotlang.g:1630:2: rule__InstanceThing__Group_2__2__Impl
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
    // InternalIotlang.g:1636:1: rule__InstanceThing__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstanceThing__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1640:1: ( ( ']' ) )
            // InternalIotlang.g:1641:1: ( ']' )
            {
            // InternalIotlang.g:1641:1: ( ']' )
            // InternalIotlang.g:1642:2: ']'
            {
             before(grammarAccess.getInstanceThingAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,35,FOLLOW_2); 
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


    // $ANTLR start "rule__InstanceBus__Group__0"
    // InternalIotlang.g:1652:1: rule__InstanceBus__Group__0 : rule__InstanceBus__Group__0__Impl rule__InstanceBus__Group__1 ;
    public final void rule__InstanceBus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1656:1: ( rule__InstanceBus__Group__0__Impl rule__InstanceBus__Group__1 )
            // InternalIotlang.g:1657:2: rule__InstanceBus__Group__0__Impl rule__InstanceBus__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InstanceBus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__0"


    // $ANTLR start "rule__InstanceBus__Group__0__Impl"
    // InternalIotlang.g:1664:1: rule__InstanceBus__Group__0__Impl : ( 'instanceBus' ) ;
    public final void rule__InstanceBus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1668:1: ( ( 'instanceBus' ) )
            // InternalIotlang.g:1669:1: ( 'instanceBus' )
            {
            // InternalIotlang.g:1669:1: ( 'instanceBus' )
            // InternalIotlang.g:1670:2: 'instanceBus'
            {
             before(grammarAccess.getInstanceBusAccess().getInstanceBusKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInstanceBusAccess().getInstanceBusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__0__Impl"


    // $ANTLR start "rule__InstanceBus__Group__1"
    // InternalIotlang.g:1679:1: rule__InstanceBus__Group__1 : rule__InstanceBus__Group__1__Impl rule__InstanceBus__Group__2 ;
    public final void rule__InstanceBus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1683:1: ( rule__InstanceBus__Group__1__Impl rule__InstanceBus__Group__2 )
            // InternalIotlang.g:1684:2: rule__InstanceBus__Group__1__Impl rule__InstanceBus__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__InstanceBus__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__1"


    // $ANTLR start "rule__InstanceBus__Group__1__Impl"
    // InternalIotlang.g:1691:1: rule__InstanceBus__Group__1__Impl : ( ( rule__InstanceBus__NameAssignment_1 ) ) ;
    public final void rule__InstanceBus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1695:1: ( ( ( rule__InstanceBus__NameAssignment_1 ) ) )
            // InternalIotlang.g:1696:1: ( ( rule__InstanceBus__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1696:1: ( ( rule__InstanceBus__NameAssignment_1 ) )
            // InternalIotlang.g:1697:2: ( rule__InstanceBus__NameAssignment_1 )
            {
             before(grammarAccess.getInstanceBusAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1698:2: ( rule__InstanceBus__NameAssignment_1 )
            // InternalIotlang.g:1698:3: rule__InstanceBus__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBus__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceBusAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__1__Impl"


    // $ANTLR start "rule__InstanceBus__Group__2"
    // InternalIotlang.g:1706:1: rule__InstanceBus__Group__2 : rule__InstanceBus__Group__2__Impl rule__InstanceBus__Group__3 ;
    public final void rule__InstanceBus__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1710:1: ( rule__InstanceBus__Group__2__Impl rule__InstanceBus__Group__3 )
            // InternalIotlang.g:1711:2: rule__InstanceBus__Group__2__Impl rule__InstanceBus__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__InstanceBus__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__2"


    // $ANTLR start "rule__InstanceBus__Group__2__Impl"
    // InternalIotlang.g:1718:1: rule__InstanceBus__Group__2__Impl : ( ( rule__InstanceBus__Group_2__0 )* ) ;
    public final void rule__InstanceBus__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1722:1: ( ( ( rule__InstanceBus__Group_2__0 )* ) )
            // InternalIotlang.g:1723:1: ( ( rule__InstanceBus__Group_2__0 )* )
            {
            // InternalIotlang.g:1723:1: ( ( rule__InstanceBus__Group_2__0 )* )
            // InternalIotlang.g:1724:2: ( rule__InstanceBus__Group_2__0 )*
            {
             before(grammarAccess.getInstanceBusAccess().getGroup_2()); 
            // InternalIotlang.g:1725:2: ( rule__InstanceBus__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIotlang.g:1725:3: rule__InstanceBus__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__InstanceBus__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getInstanceBusAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__2__Impl"


    // $ANTLR start "rule__InstanceBus__Group__3"
    // InternalIotlang.g:1733:1: rule__InstanceBus__Group__3 : rule__InstanceBus__Group__3__Impl rule__InstanceBus__Group__4 ;
    public final void rule__InstanceBus__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1737:1: ( rule__InstanceBus__Group__3__Impl rule__InstanceBus__Group__4 )
            // InternalIotlang.g:1738:2: rule__InstanceBus__Group__3__Impl rule__InstanceBus__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__InstanceBus__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__3"


    // $ANTLR start "rule__InstanceBus__Group__3__Impl"
    // InternalIotlang.g:1745:1: rule__InstanceBus__Group__3__Impl : ( ':' ) ;
    public final void rule__InstanceBus__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1749:1: ( ( ':' ) )
            // InternalIotlang.g:1750:1: ( ':' )
            {
            // InternalIotlang.g:1750:1: ( ':' )
            // InternalIotlang.g:1751:2: ':'
            {
             before(grammarAccess.getInstanceBusAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInstanceBusAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__3__Impl"


    // $ANTLR start "rule__InstanceBus__Group__4"
    // InternalIotlang.g:1760:1: rule__InstanceBus__Group__4 : rule__InstanceBus__Group__4__Impl rule__InstanceBus__Group__5 ;
    public final void rule__InstanceBus__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1764:1: ( rule__InstanceBus__Group__4__Impl rule__InstanceBus__Group__5 )
            // InternalIotlang.g:1765:2: rule__InstanceBus__Group__4__Impl rule__InstanceBus__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__InstanceBus__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__4"


    // $ANTLR start "rule__InstanceBus__Group__4__Impl"
    // InternalIotlang.g:1772:1: rule__InstanceBus__Group__4__Impl : ( ( rule__InstanceBus__TypeChannelAssignment_4 ) ) ;
    public final void rule__InstanceBus__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1776:1: ( ( ( rule__InstanceBus__TypeChannelAssignment_4 ) ) )
            // InternalIotlang.g:1777:1: ( ( rule__InstanceBus__TypeChannelAssignment_4 ) )
            {
            // InternalIotlang.g:1777:1: ( ( rule__InstanceBus__TypeChannelAssignment_4 ) )
            // InternalIotlang.g:1778:2: ( rule__InstanceBus__TypeChannelAssignment_4 )
            {
             before(grammarAccess.getInstanceBusAccess().getTypeChannelAssignment_4()); 
            // InternalIotlang.g:1779:2: ( rule__InstanceBus__TypeChannelAssignment_4 )
            // InternalIotlang.g:1779:3: rule__InstanceBus__TypeChannelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBus__TypeChannelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInstanceBusAccess().getTypeChannelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__4__Impl"


    // $ANTLR start "rule__InstanceBus__Group__5"
    // InternalIotlang.g:1787:1: rule__InstanceBus__Group__5 : rule__InstanceBus__Group__5__Impl rule__InstanceBus__Group__6 ;
    public final void rule__InstanceBus__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1791:1: ( rule__InstanceBus__Group__5__Impl rule__InstanceBus__Group__6 )
            // InternalIotlang.g:1792:2: rule__InstanceBus__Group__5__Impl rule__InstanceBus__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__InstanceBus__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__5"


    // $ANTLR start "rule__InstanceBus__Group__5__Impl"
    // InternalIotlang.g:1799:1: rule__InstanceBus__Group__5__Impl : ( 'over' ) ;
    public final void rule__InstanceBus__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1803:1: ( ( 'over' ) )
            // InternalIotlang.g:1804:1: ( 'over' )
            {
            // InternalIotlang.g:1804:1: ( 'over' )
            // InternalIotlang.g:1805:2: 'over'
            {
             before(grammarAccess.getInstanceBusAccess().getOverKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInstanceBusAccess().getOverKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__5__Impl"


    // $ANTLR start "rule__InstanceBus__Group__6"
    // InternalIotlang.g:1814:1: rule__InstanceBus__Group__6 : rule__InstanceBus__Group__6__Impl rule__InstanceBus__Group__7 ;
    public final void rule__InstanceBus__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1818:1: ( rule__InstanceBus__Group__6__Impl rule__InstanceBus__Group__7 )
            // InternalIotlang.g:1819:2: rule__InstanceBus__Group__6__Impl rule__InstanceBus__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__InstanceBus__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__6"


    // $ANTLR start "rule__InstanceBus__Group__6__Impl"
    // InternalIotlang.g:1826:1: rule__InstanceBus__Group__6__Impl : ( ( rule__InstanceBus__ProtocolAssignment_6 ) ) ;
    public final void rule__InstanceBus__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1830:1: ( ( ( rule__InstanceBus__ProtocolAssignment_6 ) ) )
            // InternalIotlang.g:1831:1: ( ( rule__InstanceBus__ProtocolAssignment_6 ) )
            {
            // InternalIotlang.g:1831:1: ( ( rule__InstanceBus__ProtocolAssignment_6 ) )
            // InternalIotlang.g:1832:2: ( rule__InstanceBus__ProtocolAssignment_6 )
            {
             before(grammarAccess.getInstanceBusAccess().getProtocolAssignment_6()); 
            // InternalIotlang.g:1833:2: ( rule__InstanceBus__ProtocolAssignment_6 )
            // InternalIotlang.g:1833:3: rule__InstanceBus__ProtocolAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBus__ProtocolAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInstanceBusAccess().getProtocolAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__6__Impl"


    // $ANTLR start "rule__InstanceBus__Group__7"
    // InternalIotlang.g:1841:1: rule__InstanceBus__Group__7 : rule__InstanceBus__Group__7__Impl ;
    public final void rule__InstanceBus__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1845:1: ( rule__InstanceBus__Group__7__Impl )
            // InternalIotlang.g:1846:2: rule__InstanceBus__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__7"


    // $ANTLR start "rule__InstanceBus__Group__7__Impl"
    // InternalIotlang.g:1852:1: rule__InstanceBus__Group__7__Impl : ( ( rule__InstanceBus__AnnotationsAssignment_7 )* ) ;
    public final void rule__InstanceBus__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1856:1: ( ( ( rule__InstanceBus__AnnotationsAssignment_7 )* ) )
            // InternalIotlang.g:1857:1: ( ( rule__InstanceBus__AnnotationsAssignment_7 )* )
            {
            // InternalIotlang.g:1857:1: ( ( rule__InstanceBus__AnnotationsAssignment_7 )* )
            // InternalIotlang.g:1858:2: ( rule__InstanceBus__AnnotationsAssignment_7 )*
            {
             before(grammarAccess.getInstanceBusAccess().getAnnotationsAssignment_7()); 
            // InternalIotlang.g:1859:2: ( rule__InstanceBus__AnnotationsAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ANNOTATION_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIotlang.g:1859:3: rule__InstanceBus__AnnotationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstanceBus__AnnotationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInstanceBusAccess().getAnnotationsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group__7__Impl"


    // $ANTLR start "rule__InstanceBus__Group_2__0"
    // InternalIotlang.g:1868:1: rule__InstanceBus__Group_2__0 : rule__InstanceBus__Group_2__0__Impl rule__InstanceBus__Group_2__1 ;
    public final void rule__InstanceBus__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1872:1: ( rule__InstanceBus__Group_2__0__Impl rule__InstanceBus__Group_2__1 )
            // InternalIotlang.g:1873:2: rule__InstanceBus__Group_2__0__Impl rule__InstanceBus__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__InstanceBus__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group_2__0"


    // $ANTLR start "rule__InstanceBus__Group_2__0__Impl"
    // InternalIotlang.g:1880:1: rule__InstanceBus__Group_2__0__Impl : ( '[' ) ;
    public final void rule__InstanceBus__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1884:1: ( ( '[' ) )
            // InternalIotlang.g:1885:1: ( '[' )
            {
            // InternalIotlang.g:1885:1: ( '[' )
            // InternalIotlang.g:1886:2: '['
            {
             before(grammarAccess.getInstanceBusAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInstanceBusAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group_2__0__Impl"


    // $ANTLR start "rule__InstanceBus__Group_2__1"
    // InternalIotlang.g:1895:1: rule__InstanceBus__Group_2__1 : rule__InstanceBus__Group_2__1__Impl rule__InstanceBus__Group_2__2 ;
    public final void rule__InstanceBus__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1899:1: ( rule__InstanceBus__Group_2__1__Impl rule__InstanceBus__Group_2__2 )
            // InternalIotlang.g:1900:2: rule__InstanceBus__Group_2__1__Impl rule__InstanceBus__Group_2__2
            {
            pushFollow(FOLLOW_24);
            rule__InstanceBus__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group_2__1"


    // $ANTLR start "rule__InstanceBus__Group_2__1__Impl"
    // InternalIotlang.g:1907:1: rule__InstanceBus__Group_2__1__Impl : ( ( rule__InstanceBus__NumberAssignment_2_1 ) ) ;
    public final void rule__InstanceBus__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1911:1: ( ( ( rule__InstanceBus__NumberAssignment_2_1 ) ) )
            // InternalIotlang.g:1912:1: ( ( rule__InstanceBus__NumberAssignment_2_1 ) )
            {
            // InternalIotlang.g:1912:1: ( ( rule__InstanceBus__NumberAssignment_2_1 ) )
            // InternalIotlang.g:1913:2: ( rule__InstanceBus__NumberAssignment_2_1 )
            {
             before(grammarAccess.getInstanceBusAccess().getNumberAssignment_2_1()); 
            // InternalIotlang.g:1914:2: ( rule__InstanceBus__NumberAssignment_2_1 )
            // InternalIotlang.g:1914:3: rule__InstanceBus__NumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBus__NumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceBusAccess().getNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group_2__1__Impl"


    // $ANTLR start "rule__InstanceBus__Group_2__2"
    // InternalIotlang.g:1922:1: rule__InstanceBus__Group_2__2 : rule__InstanceBus__Group_2__2__Impl ;
    public final void rule__InstanceBus__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1926:1: ( rule__InstanceBus__Group_2__2__Impl )
            // InternalIotlang.g:1927:2: rule__InstanceBus__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceBus__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group_2__2"


    // $ANTLR start "rule__InstanceBus__Group_2__2__Impl"
    // InternalIotlang.g:1933:1: rule__InstanceBus__Group_2__2__Impl : ( ']' ) ;
    public final void rule__InstanceBus__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1937:1: ( ( ']' ) )
            // InternalIotlang.g:1938:1: ( ']' )
            {
            // InternalIotlang.g:1938:1: ( ']' )
            // InternalIotlang.g:1939:2: ']'
            {
             before(grammarAccess.getInstanceBusAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInstanceBusAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__Group_2__2__Impl"


    // $ANTLR start "rule__InstancePolicy__Group__0"
    // InternalIotlang.g:1949:1: rule__InstancePolicy__Group__0 : rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 ;
    public final void rule__InstancePolicy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1953:1: ( rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1 )
            // InternalIotlang.g:1954:2: rule__InstancePolicy__Group__0__Impl rule__InstancePolicy__Group__1
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
    // InternalIotlang.g:1961:1: rule__InstancePolicy__Group__0__Impl : ( 'instancePolicy' ) ;
    public final void rule__InstancePolicy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1965:1: ( ( 'instancePolicy' ) )
            // InternalIotlang.g:1966:1: ( 'instancePolicy' )
            {
            // InternalIotlang.g:1966:1: ( 'instancePolicy' )
            // InternalIotlang.g:1967:2: 'instancePolicy'
            {
             before(grammarAccess.getInstancePolicyAccess().getInstancePolicyKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalIotlang.g:1976:1: rule__InstancePolicy__Group__1 : rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 ;
    public final void rule__InstancePolicy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1980:1: ( rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2 )
            // InternalIotlang.g:1981:2: rule__InstancePolicy__Group__1__Impl rule__InstancePolicy__Group__2
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
    // InternalIotlang.g:1988:1: rule__InstancePolicy__Group__1__Impl : ( ( rule__InstancePolicy__NameAssignment_1 ) ) ;
    public final void rule__InstancePolicy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:1992:1: ( ( ( rule__InstancePolicy__NameAssignment_1 ) ) )
            // InternalIotlang.g:1993:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            {
            // InternalIotlang.g:1993:1: ( ( rule__InstancePolicy__NameAssignment_1 ) )
            // InternalIotlang.g:1994:2: ( rule__InstancePolicy__NameAssignment_1 )
            {
             before(grammarAccess.getInstancePolicyAccess().getNameAssignment_1()); 
            // InternalIotlang.g:1995:2: ( rule__InstancePolicy__NameAssignment_1 )
            // InternalIotlang.g:1995:3: rule__InstancePolicy__NameAssignment_1
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
    // InternalIotlang.g:2003:1: rule__InstancePolicy__Group__2 : rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 ;
    public final void rule__InstancePolicy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2007:1: ( rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3 )
            // InternalIotlang.g:2008:2: rule__InstancePolicy__Group__2__Impl rule__InstancePolicy__Group__3
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
    // InternalIotlang.g:2015:1: rule__InstancePolicy__Group__2__Impl : ( ':' ) ;
    public final void rule__InstancePolicy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2019:1: ( ( ':' ) )
            // InternalIotlang.g:2020:1: ( ':' )
            {
            // InternalIotlang.g:2020:1: ( ':' )
            // InternalIotlang.g:2021:2: ':'
            {
             before(grammarAccess.getInstancePolicyAccess().getColonKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalIotlang.g:2030:1: rule__InstancePolicy__Group__3 : rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 ;
    public final void rule__InstancePolicy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2034:1: ( rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4 )
            // InternalIotlang.g:2035:2: rule__InstancePolicy__Group__3__Impl rule__InstancePolicy__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalIotlang.g:2042:1: rule__InstancePolicy__Group__3__Impl : ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) ;
    public final void rule__InstancePolicy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2046:1: ( ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) ) )
            // InternalIotlang.g:2047:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            {
            // InternalIotlang.g:2047:1: ( ( rule__InstancePolicy__TypePolicyAssignment_3 ) )
            // InternalIotlang.g:2048:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyAssignment_3()); 
            // InternalIotlang.g:2049:2: ( rule__InstancePolicy__TypePolicyAssignment_3 )
            // InternalIotlang.g:2049:3: rule__InstancePolicy__TypePolicyAssignment_3
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
    // InternalIotlang.g:2057:1: rule__InstancePolicy__Group__4 : rule__InstancePolicy__Group__4__Impl ;
    public final void rule__InstancePolicy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2061:1: ( rule__InstancePolicy__Group__4__Impl )
            // InternalIotlang.g:2062:2: rule__InstancePolicy__Group__4__Impl
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
    // InternalIotlang.g:2068:1: rule__InstancePolicy__Group__4__Impl : ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) ;
    public final void rule__InstancePolicy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2072:1: ( ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* ) )
            // InternalIotlang.g:2073:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            {
            // InternalIotlang.g:2073:1: ( ( rule__InstancePolicy__AnnotationsAssignment_4 )* )
            // InternalIotlang.g:2074:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            {
             before(grammarAccess.getInstancePolicyAccess().getAnnotationsAssignment_4()); 
            // InternalIotlang.g:2075:2: ( rule__InstancePolicy__AnnotationsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ANNOTATION_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIotlang.g:2075:3: rule__InstancePolicy__AnnotationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__InstancePolicy__AnnotationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalIotlang.g:2084:1: rule__NetworkConfiguration__Group__0 : rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 ;
    public final void rule__NetworkConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2088:1: ( rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 )
            // InternalIotlang.g:2089:2: rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1
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
    // InternalIotlang.g:2096:1: rule__NetworkConfiguration__Group__0__Impl : ( 'networkConfiguration' ) ;
    public final void rule__NetworkConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2100:1: ( ( 'networkConfiguration' ) )
            // InternalIotlang.g:2101:1: ( 'networkConfiguration' )
            {
            // InternalIotlang.g:2101:1: ( 'networkConfiguration' )
            // InternalIotlang.g:2102:2: 'networkConfiguration'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalIotlang.g:2111:1: rule__NetworkConfiguration__Group__1 : rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 ;
    public final void rule__NetworkConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2115:1: ( rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 )
            // InternalIotlang.g:2116:2: rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2
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
    // InternalIotlang.g:2123:1: rule__NetworkConfiguration__Group__1__Impl : ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) ;
    public final void rule__NetworkConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2127:1: ( ( ( rule__NetworkConfiguration__NameAssignment_1 ) ) )
            // InternalIotlang.g:2128:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            {
            // InternalIotlang.g:2128:1: ( ( rule__NetworkConfiguration__NameAssignment_1 ) )
            // InternalIotlang.g:2129:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2130:2: ( rule__NetworkConfiguration__NameAssignment_1 )
            // InternalIotlang.g:2130:3: rule__NetworkConfiguration__NameAssignment_1
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
    // InternalIotlang.g:2138:1: rule__NetworkConfiguration__Group__2 : rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 ;
    public final void rule__NetworkConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2142:1: ( rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 )
            // InternalIotlang.g:2143:2: rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3
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
    // InternalIotlang.g:2150:1: rule__NetworkConfiguration__Group__2__Impl : ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) ;
    public final void rule__NetworkConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2154:1: ( ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* ) )
            // InternalIotlang.g:2155:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            {
            // InternalIotlang.g:2155:1: ( ( rule__NetworkConfiguration__AnnotationsAssignment_2 )* )
            // InternalIotlang.g:2156:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAnnotationsAssignment_2()); 
            // InternalIotlang.g:2157:2: ( rule__NetworkConfiguration__AnnotationsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ANNOTATION_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIotlang.g:2157:3: rule__NetworkConfiguration__AnnotationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__NetworkConfiguration__AnnotationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalIotlang.g:2165:1: rule__NetworkConfiguration__Group__3 : rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 ;
    public final void rule__NetworkConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2169:1: ( rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 )
            // InternalIotlang.g:2170:2: rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalIotlang.g:2177:1: rule__NetworkConfiguration__Group__3__Impl : ( '{' ) ;
    public final void rule__NetworkConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2181:1: ( ( '{' ) )
            // InternalIotlang.g:2182:1: ( '{' )
            {
            // InternalIotlang.g:2182:1: ( '{' )
            // InternalIotlang.g:2183:2: '{'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalIotlang.g:2192:1: rule__NetworkConfiguration__Group__4 : rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 ;
    public final void rule__NetworkConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2196:1: ( rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 )
            // InternalIotlang.g:2197:2: rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalIotlang.g:2204:1: rule__NetworkConfiguration__Group__4__Impl : ( ( rule__NetworkConfiguration__Alternatives_4 )* ) ;
    public final void rule__NetworkConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2208:1: ( ( ( rule__NetworkConfiguration__Alternatives_4 )* ) )
            // InternalIotlang.g:2209:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            {
            // InternalIotlang.g:2209:1: ( ( rule__NetworkConfiguration__Alternatives_4 )* )
            // InternalIotlang.g:2210:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            {
             before(grammarAccess.getNetworkConfigurationAccess().getAlternatives_4()); 
            // InternalIotlang.g:2211:2: ( rule__NetworkConfiguration__Alternatives_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=32 && LA18_0<=33)||LA18_0==36||LA18_0==38||(LA18_0>=40 && LA18_0<=41)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIotlang.g:2211:3: rule__NetworkConfiguration__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__NetworkConfiguration__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalIotlang.g:2219:1: rule__NetworkConfiguration__Group__5 : rule__NetworkConfiguration__Group__5__Impl ;
    public final void rule__NetworkConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2223:1: ( rule__NetworkConfiguration__Group__5__Impl )
            // InternalIotlang.g:2224:2: rule__NetworkConfiguration__Group__5__Impl
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
    // InternalIotlang.g:2230:1: rule__NetworkConfiguration__Group__5__Impl : ( '}' ) ;
    public final void rule__NetworkConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2234:1: ( ( '}' ) )
            // InternalIotlang.g:2235:1: ( '}' )
            {
            // InternalIotlang.g:2235:1: ( '}' )
            // InternalIotlang.g:2236:2: '}'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalIotlang.g:2246:1: rule__NetworkConfiguration__Group_4_4__0 : rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1 ;
    public final void rule__NetworkConfiguration__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2250:1: ( rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1 )
            // InternalIotlang.g:2251:2: rule__NetworkConfiguration__Group_4_4__0__Impl rule__NetworkConfiguration__Group_4_4__1
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
    // InternalIotlang.g:2258:1: rule__NetworkConfiguration__Group_4_4__0__Impl : ( 'enforce' ) ;
    public final void rule__NetworkConfiguration__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2262:1: ( ( 'enforce' ) )
            // InternalIotlang.g:2263:1: ( 'enforce' )
            {
            // InternalIotlang.g:2263:1: ( 'enforce' )
            // InternalIotlang.g:2264:2: 'enforce'
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_4_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalIotlang.g:2273:1: rule__NetworkConfiguration__Group_4_4__1 : rule__NetworkConfiguration__Group_4_4__1__Impl ;
    public final void rule__NetworkConfiguration__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2277:1: ( rule__NetworkConfiguration__Group_4_4__1__Impl )
            // InternalIotlang.g:2278:2: rule__NetworkConfiguration__Group_4_4__1__Impl
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
    // InternalIotlang.g:2284:1: rule__NetworkConfiguration__Group_4_4__1__Impl : ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) ) ;
    public final void rule__NetworkConfiguration__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2288:1: ( ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) ) )
            // InternalIotlang.g:2289:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) )
            {
            // InternalIotlang.g:2289:1: ( ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 ) )
            // InternalIotlang.g:2290:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesAssignment_4_4_1()); 
            // InternalIotlang.g:2291:2: ( rule__NetworkConfiguration__EnforcesAssignment_4_4_1 )
            // InternalIotlang.g:2291:3: rule__NetworkConfiguration__EnforcesAssignment_4_4_1
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
    // InternalIotlang.g:2300:1: rule__Bind__Group__0 : rule__Bind__Group__0__Impl rule__Bind__Group__1 ;
    public final void rule__Bind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2304:1: ( rule__Bind__Group__0__Impl rule__Bind__Group__1 )
            // InternalIotlang.g:2305:2: rule__Bind__Group__0__Impl rule__Bind__Group__1
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
    // InternalIotlang.g:2312:1: rule__Bind__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Bind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2316:1: ( ( 'bind' ) )
            // InternalIotlang.g:2317:1: ( 'bind' )
            {
            // InternalIotlang.g:2317:1: ( 'bind' )
            // InternalIotlang.g:2318:2: 'bind'
            {
             before(grammarAccess.getBindAccess().getBindKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalIotlang.g:2327:1: rule__Bind__Group__1 : rule__Bind__Group__1__Impl rule__Bind__Group__2 ;
    public final void rule__Bind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2331:1: ( rule__Bind__Group__1__Impl rule__Bind__Group__2 )
            // InternalIotlang.g:2332:2: rule__Bind__Group__1__Impl rule__Bind__Group__2
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
    // InternalIotlang.g:2339:1: rule__Bind__Group__1__Impl : ( ( rule__Bind__NameAssignment_1 )? ) ;
    public final void rule__Bind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2343:1: ( ( ( rule__Bind__NameAssignment_1 )? ) )
            // InternalIotlang.g:2344:1: ( ( rule__Bind__NameAssignment_1 )? )
            {
            // InternalIotlang.g:2344:1: ( ( rule__Bind__NameAssignment_1 )? )
            // InternalIotlang.g:2345:2: ( rule__Bind__NameAssignment_1 )?
            {
             before(grammarAccess.getBindAccess().getNameAssignment_1()); 
            // InternalIotlang.g:2346:2: ( rule__Bind__NameAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_ID) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalIotlang.g:2346:3: rule__Bind__NameAssignment_1
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
    // InternalIotlang.g:2354:1: rule__Bind__Group__2 : rule__Bind__Group__2__Impl rule__Bind__Group__3 ;
    public final void rule__Bind__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2358:1: ( rule__Bind__Group__2__Impl rule__Bind__Group__3 )
            // InternalIotlang.g:2359:2: rule__Bind__Group__2__Impl rule__Bind__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalIotlang.g:2366:1: rule__Bind__Group__2__Impl : ( ( rule__Bind__ThinginstAssignment_2 ) ) ;
    public final void rule__Bind__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2370:1: ( ( ( rule__Bind__ThinginstAssignment_2 ) ) )
            // InternalIotlang.g:2371:1: ( ( rule__Bind__ThinginstAssignment_2 ) )
            {
            // InternalIotlang.g:2371:1: ( ( rule__Bind__ThinginstAssignment_2 ) )
            // InternalIotlang.g:2372:2: ( rule__Bind__ThinginstAssignment_2 )
            {
             before(grammarAccess.getBindAccess().getThinginstAssignment_2()); 
            // InternalIotlang.g:2373:2: ( rule__Bind__ThinginstAssignment_2 )
            // InternalIotlang.g:2373:3: rule__Bind__ThinginstAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Bind__ThinginstAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getThinginstAssignment_2()); 

            }


            }

        }
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
    // InternalIotlang.g:2381:1: rule__Bind__Group__3 : rule__Bind__Group__3__Impl rule__Bind__Group__4 ;
    public final void rule__Bind__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2385:1: ( rule__Bind__Group__3__Impl rule__Bind__Group__4 )
            // InternalIotlang.g:2386:2: rule__Bind__Group__3__Impl rule__Bind__Group__4
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
    // InternalIotlang.g:2393:1: rule__Bind__Group__3__Impl : ( ( rule__Bind__DirectionAssignment_3 ) ) ;
    public final void rule__Bind__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2397:1: ( ( ( rule__Bind__DirectionAssignment_3 ) ) )
            // InternalIotlang.g:2398:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            {
            // InternalIotlang.g:2398:1: ( ( rule__Bind__DirectionAssignment_3 ) )
            // InternalIotlang.g:2399:2: ( rule__Bind__DirectionAssignment_3 )
            {
             before(grammarAccess.getBindAccess().getDirectionAssignment_3()); 
            // InternalIotlang.g:2400:2: ( rule__Bind__DirectionAssignment_3 )
            // InternalIotlang.g:2400:3: rule__Bind__DirectionAssignment_3
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
    // InternalIotlang.g:2408:1: rule__Bind__Group__4 : rule__Bind__Group__4__Impl rule__Bind__Group__5 ;
    public final void rule__Bind__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2412:1: ( rule__Bind__Group__4__Impl rule__Bind__Group__5 )
            // InternalIotlang.g:2413:2: rule__Bind__Group__4__Impl rule__Bind__Group__5
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
    // InternalIotlang.g:2420:1: rule__Bind__Group__4__Impl : ( ( rule__Bind__BusInstAssignment_4 ) ) ;
    public final void rule__Bind__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2424:1: ( ( ( rule__Bind__BusInstAssignment_4 ) ) )
            // InternalIotlang.g:2425:1: ( ( rule__Bind__BusInstAssignment_4 ) )
            {
            // InternalIotlang.g:2425:1: ( ( rule__Bind__BusInstAssignment_4 ) )
            // InternalIotlang.g:2426:2: ( rule__Bind__BusInstAssignment_4 )
            {
             before(grammarAccess.getBindAccess().getBusInstAssignment_4()); 
            // InternalIotlang.g:2427:2: ( rule__Bind__BusInstAssignment_4 )
            // InternalIotlang.g:2427:3: rule__Bind__BusInstAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Bind__BusInstAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getBusInstAssignment_4()); 

            }


            }

        }
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
    // InternalIotlang.g:2435:1: rule__Bind__Group__5 : rule__Bind__Group__5__Impl rule__Bind__Group__6 ;
    public final void rule__Bind__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2439:1: ( rule__Bind__Group__5__Impl rule__Bind__Group__6 )
            // InternalIotlang.g:2440:2: rule__Bind__Group__5__Impl rule__Bind__Group__6
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
    // InternalIotlang.g:2447:1: rule__Bind__Group__5__Impl : ( '{' ) ;
    public final void rule__Bind__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2451:1: ( ( '{' ) )
            // InternalIotlang.g:2452:1: ( '{' )
            {
            // InternalIotlang.g:2452:1: ( '{' )
            // InternalIotlang.g:2453:2: '{'
            {
             before(grammarAccess.getBindAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalIotlang.g:2462:1: rule__Bind__Group__6 : rule__Bind__Group__6__Impl rule__Bind__Group__7 ;
    public final void rule__Bind__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2466:1: ( rule__Bind__Group__6__Impl rule__Bind__Group__7 )
            // InternalIotlang.g:2467:2: rule__Bind__Group__6__Impl rule__Bind__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalIotlang.g:2474:1: rule__Bind__Group__6__Impl : ( ( rule__Bind__ChannelsAssignment_6 ) ) ;
    public final void rule__Bind__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2478:1: ( ( ( rule__Bind__ChannelsAssignment_6 ) ) )
            // InternalIotlang.g:2479:1: ( ( rule__Bind__ChannelsAssignment_6 ) )
            {
            // InternalIotlang.g:2479:1: ( ( rule__Bind__ChannelsAssignment_6 ) )
            // InternalIotlang.g:2480:2: ( rule__Bind__ChannelsAssignment_6 )
            {
             before(grammarAccess.getBindAccess().getChannelsAssignment_6()); 
            // InternalIotlang.g:2481:2: ( rule__Bind__ChannelsAssignment_6 )
            // InternalIotlang.g:2481:3: rule__Bind__ChannelsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Bind__ChannelsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getChannelsAssignment_6()); 

            }


            }

        }
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
    // InternalIotlang.g:2489:1: rule__Bind__Group__7 : rule__Bind__Group__7__Impl rule__Bind__Group__8 ;
    public final void rule__Bind__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2493:1: ( rule__Bind__Group__7__Impl rule__Bind__Group__8 )
            // InternalIotlang.g:2494:2: rule__Bind__Group__7__Impl rule__Bind__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalIotlang.g:2501:1: rule__Bind__Group__7__Impl : ( ( rule__Bind__Group_7__0 )* ) ;
    public final void rule__Bind__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2505:1: ( ( ( rule__Bind__Group_7__0 )* ) )
            // InternalIotlang.g:2506:1: ( ( rule__Bind__Group_7__0 )* )
            {
            // InternalIotlang.g:2506:1: ( ( rule__Bind__Group_7__0 )* )
            // InternalIotlang.g:2507:2: ( rule__Bind__Group_7__0 )*
            {
             before(grammarAccess.getBindAccess().getGroup_7()); 
            // InternalIotlang.g:2508:2: ( rule__Bind__Group_7__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIotlang.g:2508:3: rule__Bind__Group_7__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Bind__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalIotlang.g:2516:1: rule__Bind__Group__8 : rule__Bind__Group__8__Impl rule__Bind__Group__9 ;
    public final void rule__Bind__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2520:1: ( rule__Bind__Group__8__Impl rule__Bind__Group__9 )
            // InternalIotlang.g:2521:2: rule__Bind__Group__8__Impl rule__Bind__Group__9
            {
            pushFollow(FOLLOW_22);
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
    // InternalIotlang.g:2528:1: rule__Bind__Group__8__Impl : ( '}' ) ;
    public final void rule__Bind__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2532:1: ( ( '}' ) )
            // InternalIotlang.g:2533:1: ( '}' )
            {
            // InternalIotlang.g:2533:1: ( '}' )
            // InternalIotlang.g:2534:2: '}'
            {
             before(grammarAccess.getBindAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalIotlang.g:2543:1: rule__Bind__Group__9 : rule__Bind__Group__9__Impl ;
    public final void rule__Bind__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2547:1: ( rule__Bind__Group__9__Impl )
            // InternalIotlang.g:2548:2: rule__Bind__Group__9__Impl
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
    // InternalIotlang.g:2554:1: rule__Bind__Group__9__Impl : ( ( rule__Bind__AnnotationsAssignment_9 )* ) ;
    public final void rule__Bind__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2558:1: ( ( ( rule__Bind__AnnotationsAssignment_9 )* ) )
            // InternalIotlang.g:2559:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            {
            // InternalIotlang.g:2559:1: ( ( rule__Bind__AnnotationsAssignment_9 )* )
            // InternalIotlang.g:2560:2: ( rule__Bind__AnnotationsAssignment_9 )*
            {
             before(grammarAccess.getBindAccess().getAnnotationsAssignment_9()); 
            // InternalIotlang.g:2561:2: ( rule__Bind__AnnotationsAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ANNOTATION_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIotlang.g:2561:3: rule__Bind__AnnotationsAssignment_9
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Bind__AnnotationsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalIotlang.g:2570:1: rule__Bind__Group_7__0 : rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 ;
    public final void rule__Bind__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2574:1: ( rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1 )
            // InternalIotlang.g:2575:2: rule__Bind__Group_7__0__Impl rule__Bind__Group_7__1
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
    // InternalIotlang.g:2582:1: rule__Bind__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Bind__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2586:1: ( ( ',' ) )
            // InternalIotlang.g:2587:1: ( ',' )
            {
            // InternalIotlang.g:2587:1: ( ',' )
            // InternalIotlang.g:2588:2: ','
            {
             before(grammarAccess.getBindAccess().getCommaKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalIotlang.g:2597:1: rule__Bind__Group_7__1 : rule__Bind__Group_7__1__Impl ;
    public final void rule__Bind__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2601:1: ( rule__Bind__Group_7__1__Impl )
            // InternalIotlang.g:2602:2: rule__Bind__Group_7__1__Impl
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
    // InternalIotlang.g:2608:1: rule__Bind__Group_7__1__Impl : ( ( rule__Bind__ChannelsAssignment_7_1 ) ) ;
    public final void rule__Bind__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2612:1: ( ( ( rule__Bind__ChannelsAssignment_7_1 ) ) )
            // InternalIotlang.g:2613:1: ( ( rule__Bind__ChannelsAssignment_7_1 ) )
            {
            // InternalIotlang.g:2613:1: ( ( rule__Bind__ChannelsAssignment_7_1 ) )
            // InternalIotlang.g:2614:2: ( rule__Bind__ChannelsAssignment_7_1 )
            {
             before(grammarAccess.getBindAccess().getChannelsAssignment_7_1()); 
            // InternalIotlang.g:2615:2: ( rule__Bind__ChannelsAssignment_7_1 )
            // InternalIotlang.g:2615:3: rule__Bind__ChannelsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Bind__ChannelsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBindAccess().getChannelsAssignment_7_1()); 

            }


            }

        }
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
    // InternalIotlang.g:2624:1: rule__IoTLangModel__ThingsAssignment_0 : ( ruleThing ) ;
    public final void rule__IoTLangModel__ThingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2628:1: ( ( ruleThing ) )
            // InternalIotlang.g:2629:2: ( ruleThing )
            {
            // InternalIotlang.g:2629:2: ( ruleThing )
            // InternalIotlang.g:2630:3: ruleThing
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
    // InternalIotlang.g:2639:1: rule__IoTLangModel__PoliciesAssignment_1 : ( rulePolicy ) ;
    public final void rule__IoTLangModel__PoliciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2643:1: ( ( rulePolicy ) )
            // InternalIotlang.g:2644:2: ( rulePolicy )
            {
            // InternalIotlang.g:2644:2: ( rulePolicy )
            // InternalIotlang.g:2645:3: rulePolicy
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


    // $ANTLR start "rule__IoTLangModel__ChannelsAssignment_2"
    // InternalIotlang.g:2654:1: rule__IoTLangModel__ChannelsAssignment_2 : ( ruleChannel ) ;
    public final void rule__IoTLangModel__ChannelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2658:1: ( ( ruleChannel ) )
            // InternalIotlang.g:2659:2: ( ruleChannel )
            {
            // InternalIotlang.g:2659:2: ( ruleChannel )
            // InternalIotlang.g:2660:3: ruleChannel
            {
             before(grammarAccess.getIoTLangModelAccess().getChannelsChannelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getChannelsChannelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__ChannelsAssignment_2"


    // $ANTLR start "rule__IoTLangModel__ConfigsAssignment_3"
    // InternalIotlang.g:2669:1: rule__IoTLangModel__ConfigsAssignment_3 : ( ruleNetworkConfiguration ) ;
    public final void rule__IoTLangModel__ConfigsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2673:1: ( ( ruleNetworkConfiguration ) )
            // InternalIotlang.g:2674:2: ( ruleNetworkConfiguration )
            {
            // InternalIotlang.g:2674:2: ( ruleNetworkConfiguration )
            // InternalIotlang.g:2675:3: ruleNetworkConfiguration
            {
             before(grammarAccess.getIoTLangModelAccess().getConfigsNetworkConfigurationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNetworkConfiguration();

            state._fsp--;

             after(grammarAccess.getIoTLangModelAccess().getConfigsNetworkConfigurationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTLangModel__ConfigsAssignment_3"


    // $ANTLR start "rule__PlatformAnnotation__NameAssignment_0"
    // InternalIotlang.g:2684:1: rule__PlatformAnnotation__NameAssignment_0 : ( RULE_ANNOTATION_ID ) ;
    public final void rule__PlatformAnnotation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2688:1: ( ( RULE_ANNOTATION_ID ) )
            // InternalIotlang.g:2689:2: ( RULE_ANNOTATION_ID )
            {
            // InternalIotlang.g:2689:2: ( RULE_ANNOTATION_ID )
            // InternalIotlang.g:2690:3: RULE_ANNOTATION_ID
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
    // InternalIotlang.g:2699:1: rule__PlatformAnnotation__ValueAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__PlatformAnnotation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2703:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:2704:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:2704:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:2705:3: RULE_STRING_LIT
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
    // InternalIotlang.g:2714:1: rule__Thing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Thing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2718:1: ( ( RULE_ID ) )
            // InternalIotlang.g:2719:2: ( RULE_ID )
            {
            // InternalIotlang.g:2719:2: ( RULE_ID )
            // InternalIotlang.g:2720:3: RULE_ID
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
    // InternalIotlang.g:2729:1: rule__Thing__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__Thing__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2733:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:2734:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:2734:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:2735:3: rulePlatformAnnotation
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


    // $ANTLR start "rule__Channel__NameAssignment_1"
    // InternalIotlang.g:2744:1: rule__Channel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Channel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2748:1: ( ( RULE_ID ) )
            // InternalIotlang.g:2749:2: ( RULE_ID )
            {
            // InternalIotlang.g:2749:2: ( RULE_ID )
            // InternalIotlang.g:2750:3: RULE_ID
            {
             before(grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__NameAssignment_1"


    // $ANTLR start "rule__Channel__TopicsAssignment_3"
    // InternalIotlang.g:2759:1: rule__Channel__TopicsAssignment_3 : ( ruleTopic ) ;
    public final void rule__Channel__TopicsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2763:1: ( ( ruleTopic ) )
            // InternalIotlang.g:2764:2: ( ruleTopic )
            {
            // InternalIotlang.g:2764:2: ( ruleTopic )
            // InternalIotlang.g:2765:3: ruleTopic
            {
             before(grammarAccess.getChannelAccess().getTopicsTopicParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getChannelAccess().getTopicsTopicParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__TopicsAssignment_3"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalIotlang.g:2774:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2778:1: ( ( RULE_ID ) )
            // InternalIotlang.g:2779:2: ( RULE_ID )
            {
            // InternalIotlang.g:2779:2: ( RULE_ID )
            // InternalIotlang.g:2780:3: RULE_ID
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


    // $ANTLR start "rule__Policy__RulesAssignment_3"
    // InternalIotlang.g:2789:1: rule__Policy__RulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Policy__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2793:1: ( ( ruleRule ) )
            // InternalIotlang.g:2794:2: ( ruleRule )
            {
            // InternalIotlang.g:2794:2: ( ruleRule )
            // InternalIotlang.g:2795:3: ruleRule
            {
             before(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__RulesAssignment_3"


    // $ANTLR start "rule__Topic__NameAssignment_1"
    // InternalIotlang.g:2804:1: rule__Topic__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Topic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2808:1: ( ( RULE_ID ) )
            // InternalIotlang.g:2809:2: ( RULE_ID )
            {
            // InternalIotlang.g:2809:2: ( RULE_ID )
            // InternalIotlang.g:2810:3: RULE_ID
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


    // $ANTLR start "rule__Topic__TypeAssignment_2"
    // InternalIotlang.g:2819:1: rule__Topic__TypeAssignment_2 : ( ( rule__Topic__TypeAlternatives_2_0 ) ) ;
    public final void rule__Topic__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2823:1: ( ( ( rule__Topic__TypeAlternatives_2_0 ) ) )
            // InternalIotlang.g:2824:2: ( ( rule__Topic__TypeAlternatives_2_0 ) )
            {
            // InternalIotlang.g:2824:2: ( ( rule__Topic__TypeAlternatives_2_0 ) )
            // InternalIotlang.g:2825:3: ( rule__Topic__TypeAlternatives_2_0 )
            {
             before(grammarAccess.getTopicAccess().getTypeAlternatives_2_0()); 
            // InternalIotlang.g:2826:3: ( rule__Topic__TypeAlternatives_2_0 )
            // InternalIotlang.g:2826:4: rule__Topic__TypeAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Topic__TypeAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getTypeAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__TypeAssignment_2"


    // $ANTLR start "rule__Topic__MessagesAssignment_4"
    // InternalIotlang.g:2834:1: rule__Topic__MessagesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Topic__MessagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2838:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:2839:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:2839:2: ( ( RULE_ID ) )
            // InternalIotlang.g:2840:3: ( RULE_ID )
            {
             before(grammarAccess.getTopicAccess().getMessagesMessageCrossReference_4_0()); 
            // InternalIotlang.g:2841:3: ( RULE_ID )
            // InternalIotlang.g:2842:4: RULE_ID
            {
             before(grammarAccess.getTopicAccess().getMessagesMessageIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getMessagesMessageIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTopicAccess().getMessagesMessageCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__MessagesAssignment_4"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalIotlang.g:2853:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2857:1: ( ( RULE_ID ) )
            // InternalIotlang.g:2858:2: ( RULE_ID )
            {
            // InternalIotlang.g:2858:2: ( RULE_ID )
            // InternalIotlang.g:2859:3: RULE_ID
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


    // $ANTLR start "rule__Rule__ThingsAssignment_2"
    // InternalIotlang.g:2868:1: rule__Rule__ThingsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__ThingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2872:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:2873:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:2873:2: ( ( RULE_ID ) )
            // InternalIotlang.g:2874:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getThingsThingCrossReference_2_0()); 
            // InternalIotlang.g:2875:3: ( RULE_ID )
            // InternalIotlang.g:2876:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getThingsThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getThingsThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getThingsThingCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ThingsAssignment_2"


    // $ANTLR start "rule__Rule__PermissionAssignment_3"
    // InternalIotlang.g:2887:1: rule__Rule__PermissionAssignment_3 : ( ( rule__Rule__PermissionAlternatives_3_0 ) ) ;
    public final void rule__Rule__PermissionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2891:1: ( ( ( rule__Rule__PermissionAlternatives_3_0 ) ) )
            // InternalIotlang.g:2892:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:2892:2: ( ( rule__Rule__PermissionAlternatives_3_0 ) )
            // InternalIotlang.g:2893:3: ( rule__Rule__PermissionAlternatives_3_0 )
            {
             before(grammarAccess.getRuleAccess().getPermissionAlternatives_3_0()); 
            // InternalIotlang.g:2894:3: ( rule__Rule__PermissionAlternatives_3_0 )
            // InternalIotlang.g:2894:4: rule__Rule__PermissionAlternatives_3_0
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
    // InternalIotlang.g:2902:1: rule__Rule__ActionAssignment_5 : ( ( rule__Rule__ActionAlternatives_5_0 ) ) ;
    public final void rule__Rule__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2906:1: ( ( ( rule__Rule__ActionAlternatives_5_0 ) ) )
            // InternalIotlang.g:2907:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            {
            // InternalIotlang.g:2907:2: ( ( rule__Rule__ActionAlternatives_5_0 ) )
            // InternalIotlang.g:2908:3: ( rule__Rule__ActionAlternatives_5_0 )
            {
             before(grammarAccess.getRuleAccess().getActionAlternatives_5_0()); 
            // InternalIotlang.g:2909:3: ( rule__Rule__ActionAlternatives_5_0 )
            // InternalIotlang.g:2909:4: rule__Rule__ActionAlternatives_5_0
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


    // $ANTLR start "rule__Rule__ResAssignment_6"
    // InternalIotlang.g:2917:1: rule__Rule__ResAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__ResAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2921:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:2922:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:2922:2: ( ( RULE_ID ) )
            // InternalIotlang.g:2923:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getResThingCrossReference_6_0()); 
            // InternalIotlang.g:2924:3: ( RULE_ID )
            // InternalIotlang.g:2925:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getResThingIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getResThingIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getResThingCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ResAssignment_6"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalIotlang.g:2936:1: rule__Domain__NameAssignment_1 : ( RULE_STRING_LIT ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2940:1: ( ( RULE_STRING_LIT ) )
            // InternalIotlang.g:2941:2: ( RULE_STRING_LIT )
            {
            // InternalIotlang.g:2941:2: ( RULE_STRING_LIT )
            // InternalIotlang.g:2942:3: RULE_STRING_LIT
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
    // InternalIotlang.g:2951:1: rule__InstanceThing__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstanceThing__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2955:1: ( ( RULE_ID ) )
            // InternalIotlang.g:2956:2: ( RULE_ID )
            {
            // InternalIotlang.g:2956:2: ( RULE_ID )
            // InternalIotlang.g:2957:3: RULE_ID
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
    // InternalIotlang.g:2966:1: rule__InstanceThing__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstanceThing__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2970:1: ( ( RULE_INT ) )
            // InternalIotlang.g:2971:2: ( RULE_INT )
            {
            // InternalIotlang.g:2971:2: ( RULE_INT )
            // InternalIotlang.g:2972:3: RULE_INT
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


    // $ANTLR start "rule__InstanceThing__TypeAssignment_4"
    // InternalIotlang.g:2981:1: rule__InstanceThing__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceThing__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:2985:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:2986:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:2986:2: ( ( RULE_ID ) )
            // InternalIotlang.g:2987:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingCrossReference_4_0()); 
            // InternalIotlang.g:2988:3: ( RULE_ID )
            // InternalIotlang.g:2989:4: RULE_ID
            {
             before(grammarAccess.getInstanceThingAccess().getTypeThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceThingAccess().getTypeThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInstanceThingAccess().getTypeThingCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceThing__TypeAssignment_4"


    // $ANTLR start "rule__InstanceThing__AnnotationsAssignment_5"
    // InternalIotlang.g:3000:1: rule__InstanceThing__AnnotationsAssignment_5 : ( rulePlatformAnnotation ) ;
    public final void rule__InstanceThing__AnnotationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3004:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3005:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3005:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3006:3: rulePlatformAnnotation
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


    // $ANTLR start "rule__InstanceBus__NameAssignment_1"
    // InternalIotlang.g:3015:1: rule__InstanceBus__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstanceBus__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3019:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3020:2: ( RULE_ID )
            {
            // InternalIotlang.g:3020:2: ( RULE_ID )
            // InternalIotlang.g:3021:3: RULE_ID
            {
             before(grammarAccess.getInstanceBusAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceBusAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__NameAssignment_1"


    // $ANTLR start "rule__InstanceBus__NumberAssignment_2_1"
    // InternalIotlang.g:3030:1: rule__InstanceBus__NumberAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__InstanceBus__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3034:1: ( ( RULE_INT ) )
            // InternalIotlang.g:3035:2: ( RULE_INT )
            {
            // InternalIotlang.g:3035:2: ( RULE_INT )
            // InternalIotlang.g:3036:3: RULE_INT
            {
             before(grammarAccess.getInstanceBusAccess().getNumberINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInstanceBusAccess().getNumberINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__NumberAssignment_2_1"


    // $ANTLR start "rule__InstanceBus__TypeChannelAssignment_4"
    // InternalIotlang.g:3045:1: rule__InstanceBus__TypeChannelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceBus__TypeChannelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3049:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3050:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3050:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3051:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceBusAccess().getTypeChannelChannelCrossReference_4_0()); 
            // InternalIotlang.g:3052:3: ( RULE_ID )
            // InternalIotlang.g:3053:4: RULE_ID
            {
             before(grammarAccess.getInstanceBusAccess().getTypeChannelChannelIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceBusAccess().getTypeChannelChannelIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInstanceBusAccess().getTypeChannelChannelCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__TypeChannelAssignment_4"


    // $ANTLR start "rule__InstanceBus__ProtocolAssignment_6"
    // InternalIotlang.g:3064:1: rule__InstanceBus__ProtocolAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceBus__ProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3068:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3069:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3069:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3070:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceBusAccess().getProtocolProtocolCrossReference_6_0()); 
            // InternalIotlang.g:3071:3: ( RULE_ID )
            // InternalIotlang.g:3072:4: RULE_ID
            {
             before(grammarAccess.getInstanceBusAccess().getProtocolProtocolIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceBusAccess().getProtocolProtocolIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getInstanceBusAccess().getProtocolProtocolCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__ProtocolAssignment_6"


    // $ANTLR start "rule__InstanceBus__AnnotationsAssignment_7"
    // InternalIotlang.g:3083:1: rule__InstanceBus__AnnotationsAssignment_7 : ( rulePlatformAnnotation ) ;
    public final void rule__InstanceBus__AnnotationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3087:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3088:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3088:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3089:3: rulePlatformAnnotation
            {
             before(grammarAccess.getInstanceBusAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePlatformAnnotation();

            state._fsp--;

             after(grammarAccess.getInstanceBusAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceBus__AnnotationsAssignment_7"


    // $ANTLR start "rule__InstancePolicy__NameAssignment_1"
    // InternalIotlang.g:3098:1: rule__InstancePolicy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstancePolicy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3102:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3103:2: ( RULE_ID )
            {
            // InternalIotlang.g:3103:2: ( RULE_ID )
            // InternalIotlang.g:3104:3: RULE_ID
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
    // InternalIotlang.g:3113:1: rule__InstancePolicy__TypePolicyAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InstancePolicy__TypePolicyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3117:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3118:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3118:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3119:3: ( RULE_ID )
            {
             before(grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0()); 
            // InternalIotlang.g:3120:3: ( RULE_ID )
            // InternalIotlang.g:3121:4: RULE_ID
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
    // InternalIotlang.g:3132:1: rule__InstancePolicy__AnnotationsAssignment_4 : ( rulePlatformAnnotation ) ;
    public final void rule__InstancePolicy__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3136:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3137:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3137:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3138:3: rulePlatformAnnotation
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
    // InternalIotlang.g:3147:1: rule__NetworkConfiguration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NetworkConfiguration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3151:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3152:2: ( RULE_ID )
            {
            // InternalIotlang.g:3152:2: ( RULE_ID )
            // InternalIotlang.g:3153:3: RULE_ID
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
    // InternalIotlang.g:3162:1: rule__NetworkConfiguration__AnnotationsAssignment_2 : ( rulePlatformAnnotation ) ;
    public final void rule__NetworkConfiguration__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3166:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3167:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3167:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3168:3: rulePlatformAnnotation
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
    // InternalIotlang.g:3177:1: rule__NetworkConfiguration__DomainAssignment_4_0 : ( ruleDomain ) ;
    public final void rule__NetworkConfiguration__DomainAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3181:1: ( ( ruleDomain ) )
            // InternalIotlang.g:3182:2: ( ruleDomain )
            {
            // InternalIotlang.g:3182:2: ( ruleDomain )
            // InternalIotlang.g:3183:3: ruleDomain
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
    // InternalIotlang.g:3192:1: rule__NetworkConfiguration__BindsAssignment_4_1 : ( ruleBind ) ;
    public final void rule__NetworkConfiguration__BindsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3196:1: ( ( ruleBind ) )
            // InternalIotlang.g:3197:2: ( ruleBind )
            {
            // InternalIotlang.g:3197:2: ( ruleBind )
            // InternalIotlang.g:3198:3: ruleBind
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


    // $ANTLR start "rule__NetworkConfiguration__InstancesAssignment_4_2"
    // InternalIotlang.g:3207:1: rule__NetworkConfiguration__InstancesAssignment_4_2 : ( ruleInstanceThing ) ;
    public final void rule__NetworkConfiguration__InstancesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3211:1: ( ( ruleInstanceThing ) )
            // InternalIotlang.g:3212:2: ( ruleInstanceThing )
            {
            // InternalIotlang.g:3212:2: ( ruleInstanceThing )
            // InternalIotlang.g:3213:3: ruleInstanceThing
            {
             before(grammarAccess.getNetworkConfigurationAccess().getInstancesInstanceThingParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceThing();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getInstancesInstanceThingParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__InstancesAssignment_4_2"


    // $ANTLR start "rule__NetworkConfiguration__InstancesBusAssignment_4_3"
    // InternalIotlang.g:3222:1: rule__NetworkConfiguration__InstancesBusAssignment_4_3 : ( ruleInstanceBus ) ;
    public final void rule__NetworkConfiguration__InstancesBusAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3226:1: ( ( ruleInstanceBus ) )
            // InternalIotlang.g:3227:2: ( ruleInstanceBus )
            {
            // InternalIotlang.g:3227:2: ( ruleInstanceBus )
            // InternalIotlang.g:3228:3: ruleInstanceBus
            {
             before(grammarAccess.getNetworkConfigurationAccess().getInstancesBusInstanceBusParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceBus();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getInstancesBusInstanceBusParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__InstancesBusAssignment_4_3"


    // $ANTLR start "rule__NetworkConfiguration__EnforcesAssignment_4_4_1"
    // InternalIotlang.g:3237:1: rule__NetworkConfiguration__EnforcesAssignment_4_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__NetworkConfiguration__EnforcesAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3241:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3242:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3242:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3243:3: ( RULE_ID )
            {
             before(grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_4_1_0()); 
            // InternalIotlang.g:3244:3: ( RULE_ID )
            // InternalIotlang.g:3245:4: RULE_ID
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


    // $ANTLR start "rule__NetworkConfiguration__InstPoliciesAssignment_4_5"
    // InternalIotlang.g:3256:1: rule__NetworkConfiguration__InstPoliciesAssignment_4_5 : ( ruleInstancePolicy ) ;
    public final void rule__NetworkConfiguration__InstPoliciesAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3260:1: ( ( ruleInstancePolicy ) )
            // InternalIotlang.g:3261:2: ( ruleInstancePolicy )
            {
            // InternalIotlang.g:3261:2: ( ruleInstancePolicy )
            // InternalIotlang.g:3262:3: ruleInstancePolicy
            {
             before(grammarAccess.getNetworkConfigurationAccess().getInstPoliciesInstancePolicyParserRuleCall_4_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInstancePolicy();

            state._fsp--;

             after(grammarAccess.getNetworkConfigurationAccess().getInstPoliciesInstancePolicyParserRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__InstPoliciesAssignment_4_5"


    // $ANTLR start "rule__Bind__NameAssignment_1"
    // InternalIotlang.g:3271:1: rule__Bind__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3275:1: ( ( RULE_ID ) )
            // InternalIotlang.g:3276:2: ( RULE_ID )
            {
            // InternalIotlang.g:3276:2: ( RULE_ID )
            // InternalIotlang.g:3277:3: RULE_ID
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


    // $ANTLR start "rule__Bind__ThinginstAssignment_2"
    // InternalIotlang.g:3286:1: rule__Bind__ThinginstAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__ThinginstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3290:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3291:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3291:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3292:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getThinginstInstanceThingCrossReference_2_0()); 
            // InternalIotlang.g:3293:3: ( RULE_ID )
            // InternalIotlang.g:3294:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getThinginstInstanceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getThinginstInstanceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBindAccess().getThinginstInstanceThingCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ThinginstAssignment_2"


    // $ANTLR start "rule__Bind__DirectionAssignment_3"
    // InternalIotlang.g:3305:1: rule__Bind__DirectionAssignment_3 : ( ( rule__Bind__DirectionAlternatives_3_0 ) ) ;
    public final void rule__Bind__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3309:1: ( ( ( rule__Bind__DirectionAlternatives_3_0 ) ) )
            // InternalIotlang.g:3310:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            {
            // InternalIotlang.g:3310:2: ( ( rule__Bind__DirectionAlternatives_3_0 ) )
            // InternalIotlang.g:3311:3: ( rule__Bind__DirectionAlternatives_3_0 )
            {
             before(grammarAccess.getBindAccess().getDirectionAlternatives_3_0()); 
            // InternalIotlang.g:3312:3: ( rule__Bind__DirectionAlternatives_3_0 )
            // InternalIotlang.g:3312:4: rule__Bind__DirectionAlternatives_3_0
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


    // $ANTLR start "rule__Bind__BusInstAssignment_4"
    // InternalIotlang.g:3320:1: rule__Bind__BusInstAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__BusInstAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3324:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3325:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3325:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3326:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getBusInstInstanceBusCrossReference_4_0()); 
            // InternalIotlang.g:3327:3: ( RULE_ID )
            // InternalIotlang.g:3328:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getBusInstInstanceBusIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getBusInstInstanceBusIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBindAccess().getBusInstInstanceBusCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__BusInstAssignment_4"


    // $ANTLR start "rule__Bind__ChannelsAssignment_6"
    // InternalIotlang.g:3339:1: rule__Bind__ChannelsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__ChannelsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3343:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3344:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3344:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3345:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getChannelsTopicCrossReference_6_0()); 
            // InternalIotlang.g:3346:3: ( RULE_ID )
            // InternalIotlang.g:3347:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getChannelsTopicIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getChannelsTopicIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getBindAccess().getChannelsTopicCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ChannelsAssignment_6"


    // $ANTLR start "rule__Bind__ChannelsAssignment_7_1"
    // InternalIotlang.g:3358:1: rule__Bind__ChannelsAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bind__ChannelsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3362:1: ( ( ( RULE_ID ) ) )
            // InternalIotlang.g:3363:2: ( ( RULE_ID ) )
            {
            // InternalIotlang.g:3363:2: ( ( RULE_ID ) )
            // InternalIotlang.g:3364:3: ( RULE_ID )
            {
             before(grammarAccess.getBindAccess().getChannelsTopicCrossReference_7_1_0()); 
            // InternalIotlang.g:3365:3: ( RULE_ID )
            // InternalIotlang.g:3366:4: RULE_ID
            {
             before(grammarAccess.getBindAccess().getChannelsTopicIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindAccess().getChannelsTopicIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getBindAccess().getChannelsTopicCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bind__ChannelsAssignment_7_1"


    // $ANTLR start "rule__Bind__AnnotationsAssignment_9"
    // InternalIotlang.g:3377:1: rule__Bind__AnnotationsAssignment_9 : ( rulePlatformAnnotation ) ;
    public final void rule__Bind__AnnotationsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIotlang.g:3381:1: ( ( rulePlatformAnnotation ) )
            // InternalIotlang.g:3382:2: ( rulePlatformAnnotation )
            {
            // InternalIotlang.g:3382:2: ( rulePlatformAnnotation )
            // InternalIotlang.g:3383:3: rulePlatformAnnotation
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008006400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000035301000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000035300000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000002L});

}