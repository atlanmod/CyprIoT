package lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lang.services.IotlangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIotlangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_ID", "RULE_STRING_LIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'thing'", "'{'", "'}'", "'channel'", "'policy'", "'topic'", "'?'", "'!'", "'('", "')'", "'rule'", "'allow'", "'deny'", "':'", "'send'", "'receive'", "'domain'", "'instanceThing'", "'['", "']'", "'instanceBus'", "'over'", "'instancePolicy'", "'networkConfiguration'", "'enforce'", "'bind'", "'=>'", "'<=>'", "'<='", "','"
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

        public InternalIotlangParser(TokenStream input, IotlangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IoTLangModel";
       	}

       	@Override
       	protected IotlangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIoTLangModel"
    // InternalIotlang.g:64:1: entryRuleIoTLangModel returns [EObject current=null] : iv_ruleIoTLangModel= ruleIoTLangModel EOF ;
    public final EObject entryRuleIoTLangModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIoTLangModel = null;


        try {
            // InternalIotlang.g:64:53: (iv_ruleIoTLangModel= ruleIoTLangModel EOF )
            // InternalIotlang.g:65:2: iv_ruleIoTLangModel= ruleIoTLangModel EOF
            {
             newCompositeNode(grammarAccess.getIoTLangModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIoTLangModel=ruleIoTLangModel();

            state._fsp--;

             current =iv_ruleIoTLangModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIoTLangModel"


    // $ANTLR start "ruleIoTLangModel"
    // InternalIotlang.g:71:1: ruleIoTLangModel returns [EObject current=null] : ( ( (lv_things_0_0= ruleThing ) ) | ( (lv_policies_1_0= rulePolicy ) ) | ( (lv_channels_2_0= ruleChannel ) ) | ( (lv_configs_3_0= ruleNetworkConfiguration ) ) )* ;
    public final EObject ruleIoTLangModel() throws RecognitionException {
        EObject current = null;

        EObject lv_things_0_0 = null;

        EObject lv_policies_1_0 = null;

        EObject lv_channels_2_0 = null;

        EObject lv_configs_3_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:77:2: ( ( ( (lv_things_0_0= ruleThing ) ) | ( (lv_policies_1_0= rulePolicy ) ) | ( (lv_channels_2_0= ruleChannel ) ) | ( (lv_configs_3_0= ruleNetworkConfiguration ) ) )* )
            // InternalIotlang.g:78:2: ( ( (lv_things_0_0= ruleThing ) ) | ( (lv_policies_1_0= rulePolicy ) ) | ( (lv_channels_2_0= ruleChannel ) ) | ( (lv_configs_3_0= ruleNetworkConfiguration ) ) )*
            {
            // InternalIotlang.g:78:2: ( ( (lv_things_0_0= ruleThing ) ) | ( (lv_policies_1_0= rulePolicy ) ) | ( (lv_channels_2_0= ruleChannel ) ) | ( (lv_configs_3_0= ruleNetworkConfiguration ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt1=1;
                    }
                    break;
                case 17:
                    {
                    alt1=2;
                    }
                    break;
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                case 36:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalIotlang.g:79:3: ( (lv_things_0_0= ruleThing ) )
            	    {
            	    // InternalIotlang.g:79:3: ( (lv_things_0_0= ruleThing ) )
            	    // InternalIotlang.g:80:4: (lv_things_0_0= ruleThing )
            	    {
            	    // InternalIotlang.g:80:4: (lv_things_0_0= ruleThing )
            	    // InternalIotlang.g:81:5: lv_things_0_0= ruleThing
            	    {

            	    					newCompositeNode(grammarAccess.getIoTLangModelAccess().getThingsThingParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_things_0_0=ruleThing();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"things",
            	    						lv_things_0_0,
            	    						"lang.Iotlang.Thing");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIotlang.g:99:3: ( (lv_policies_1_0= rulePolicy ) )
            	    {
            	    // InternalIotlang.g:99:3: ( (lv_policies_1_0= rulePolicy ) )
            	    // InternalIotlang.g:100:4: (lv_policies_1_0= rulePolicy )
            	    {
            	    // InternalIotlang.g:100:4: (lv_policies_1_0= rulePolicy )
            	    // InternalIotlang.g:101:5: lv_policies_1_0= rulePolicy
            	    {

            	    					newCompositeNode(grammarAccess.getIoTLangModelAccess().getPoliciesPolicyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_policies_1_0=rulePolicy();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"policies",
            	    						lv_policies_1_0,
            	    						"lang.Iotlang.Policy");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIotlang.g:119:3: ( (lv_channels_2_0= ruleChannel ) )
            	    {
            	    // InternalIotlang.g:119:3: ( (lv_channels_2_0= ruleChannel ) )
            	    // InternalIotlang.g:120:4: (lv_channels_2_0= ruleChannel )
            	    {
            	    // InternalIotlang.g:120:4: (lv_channels_2_0= ruleChannel )
            	    // InternalIotlang.g:121:5: lv_channels_2_0= ruleChannel
            	    {

            	    					newCompositeNode(grammarAccess.getIoTLangModelAccess().getChannelsChannelParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_channels_2_0=ruleChannel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"channels",
            	    						lv_channels_2_0,
            	    						"lang.Iotlang.Channel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIotlang.g:139:3: ( (lv_configs_3_0= ruleNetworkConfiguration ) )
            	    {
            	    // InternalIotlang.g:139:3: ( (lv_configs_3_0= ruleNetworkConfiguration ) )
            	    // InternalIotlang.g:140:4: (lv_configs_3_0= ruleNetworkConfiguration )
            	    {
            	    // InternalIotlang.g:140:4: (lv_configs_3_0= ruleNetworkConfiguration )
            	    // InternalIotlang.g:141:5: lv_configs_3_0= ruleNetworkConfiguration
            	    {

            	    					newCompositeNode(grammarAccess.getIoTLangModelAccess().getConfigsNetworkConfigurationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_configs_3_0=ruleNetworkConfiguration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configs",
            	    						lv_configs_3_0,
            	    						"lang.Iotlang.NetworkConfiguration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIoTLangModel"


    // $ANTLR start "entryRulePlatformAnnotation"
    // InternalIotlang.g:162:1: entryRulePlatformAnnotation returns [EObject current=null] : iv_rulePlatformAnnotation= rulePlatformAnnotation EOF ;
    public final EObject entryRulePlatformAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformAnnotation = null;


        try {
            // InternalIotlang.g:162:59: (iv_rulePlatformAnnotation= rulePlatformAnnotation EOF )
            // InternalIotlang.g:163:2: iv_rulePlatformAnnotation= rulePlatformAnnotation EOF
            {
             newCompositeNode(grammarAccess.getPlatformAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatformAnnotation=rulePlatformAnnotation();

            state._fsp--;

             current =iv_rulePlatformAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlatformAnnotation"


    // $ANTLR start "rulePlatformAnnotation"
    // InternalIotlang.g:169:1: rulePlatformAnnotation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( (lv_value_1_0= RULE_STRING_LIT ) ) ) ;
    public final EObject rulePlatformAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalIotlang.g:175:2: ( ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( (lv_value_1_0= RULE_STRING_LIT ) ) ) )
            // InternalIotlang.g:176:2: ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( (lv_value_1_0= RULE_STRING_LIT ) ) )
            {
            // InternalIotlang.g:176:2: ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( (lv_value_1_0= RULE_STRING_LIT ) ) )
            // InternalIotlang.g:177:3: ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( (lv_value_1_0= RULE_STRING_LIT ) )
            {
            // InternalIotlang.g:177:3: ( (lv_name_0_0= RULE_ANNOTATION_ID ) )
            // InternalIotlang.g:178:4: (lv_name_0_0= RULE_ANNOTATION_ID )
            {
            // InternalIotlang.g:178:4: (lv_name_0_0= RULE_ANNOTATION_ID )
            // InternalIotlang.g:179:5: lv_name_0_0= RULE_ANNOTATION_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ANNOTATION_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"lang.Iotlang.ANNOTATION_ID");
            				

            }


            }

            // InternalIotlang.g:195:3: ( (lv_value_1_0= RULE_STRING_LIT ) )
            // InternalIotlang.g:196:4: (lv_value_1_0= RULE_STRING_LIT )
            {
            // InternalIotlang.g:196:4: (lv_value_1_0= RULE_STRING_LIT )
            // InternalIotlang.g:197:5: lv_value_1_0= RULE_STRING_LIT
            {
            lv_value_1_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getPlatformAnnotationAccess().getValueSTRING_LITTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlatformAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"lang.Iotlang.STRING_LIT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlatformAnnotation"


    // $ANTLR start "entryRuleThing"
    // InternalIotlang.g:217:1: entryRuleThing returns [EObject current=null] : iv_ruleThing= ruleThing EOF ;
    public final EObject entryRuleThing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThing = null;


        try {
            // InternalIotlang.g:217:46: (iv_ruleThing= ruleThing EOF )
            // InternalIotlang.g:218:2: iv_ruleThing= ruleThing EOF
            {
             newCompositeNode(grammarAccess.getThingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThing=ruleThing();

            state._fsp--;

             current =iv_ruleThing; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThing"


    // $ANTLR start "ruleThing"
    // InternalIotlang.g:224:1: ruleThing returns [EObject current=null] : (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleThing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_annotations_2_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:230:2: ( (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' otherlv_4= '}' ) )
            // InternalIotlang.g:231:2: (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalIotlang.g:231:2: (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' otherlv_4= '}' )
            // InternalIotlang.g:232:3: otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getThingAccess().getThingKeyword_0());
            		
            // InternalIotlang.g:236:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:237:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:237:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:238:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getThingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIotlang.g:254:3: ( (lv_annotations_2_0= rulePlatformAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ANNOTATION_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIotlang.g:255:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:255:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:256:5: lv_annotations_2_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_annotations_2_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getThingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_2_0,
            	    						"lang.Iotlang.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getThingAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThing"


    // $ANTLR start "entryRuleChannel"
    // InternalIotlang.g:285:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalIotlang.g:285:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalIotlang.g:286:2: iv_ruleChannel= ruleChannel EOF
            {
             newCompositeNode(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannel=ruleChannel();

            state._fsp--;

             current =iv_ruleChannel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalIotlang.g:292:1: ruleChannel returns [EObject current=null] : (otherlv_0= 'channel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_topics_3_0= ruleTopic ) )* otherlv_4= '}' ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_topics_3_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:298:2: ( (otherlv_0= 'channel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_topics_3_0= ruleTopic ) )* otherlv_4= '}' ) )
            // InternalIotlang.g:299:2: (otherlv_0= 'channel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_topics_3_0= ruleTopic ) )* otherlv_4= '}' )
            {
            // InternalIotlang.g:299:2: (otherlv_0= 'channel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_topics_3_0= ruleTopic ) )* otherlv_4= '}' )
            // InternalIotlang.g:300:3: otherlv_0= 'channel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_topics_3_0= ruleTopic ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getChannelKeyword_0());
            		
            // InternalIotlang.g:304:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:305:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:305:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:306:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChannelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIotlang.g:326:3: ( (lv_topics_3_0= ruleTopic ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIotlang.g:327:4: (lv_topics_3_0= ruleTopic )
            	    {
            	    // InternalIotlang.g:327:4: (lv_topics_3_0= ruleTopic )
            	    // InternalIotlang.g:328:5: lv_topics_3_0= ruleTopic
            	    {

            	    					newCompositeNode(grammarAccess.getChannelAccess().getTopicsTopicParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_topics_3_0=ruleTopic();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChannelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"topics",
            	    						lv_topics_3_0,
            	    						"lang.Iotlang.Topic");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRulePolicy"
    // InternalIotlang.g:353:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalIotlang.g:353:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalIotlang.g:354:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalIotlang.g:360:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:366:2: ( (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' ) )
            // InternalIotlang.g:367:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' )
            {
            // InternalIotlang.g:367:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}' )
            // InternalIotlang.g:368:3: otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalIotlang.g:372:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:373:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:373:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:374:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolicyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIotlang.g:394:3: ( (lv_rules_3_0= ruleRule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIotlang.g:395:4: (lv_rules_3_0= ruleRule )
            	    {
            	    // InternalIotlang.g:395:4: (lv_rules_3_0= ruleRule )
            	    // InternalIotlang.g:396:5: lv_rules_3_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_rules_3_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_3_0,
            	    						"lang.Iotlang.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleTopic"
    // InternalIotlang.g:421:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalIotlang.g:421:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalIotlang.g:422:2: iv_ruleTopic= ruleTopic EOF
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalIotlang.g:428:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_type_2_1= '?' | lv_type_2_2= '!' ) ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIotlang.g:434:2: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_type_2_1= '?' | lv_type_2_2= '!' ) ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalIotlang.g:435:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_type_2_1= '?' | lv_type_2_2= '!' ) ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalIotlang.g:435:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_type_2_1= '?' | lv_type_2_2= '!' ) ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalIotlang.g:436:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_type_2_1= '?' | lv_type_2_2= '!' ) ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
            		
            // InternalIotlang.g:440:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:441:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:441:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:442:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTopicAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIotlang.g:458:3: ( ( (lv_type_2_1= '?' | lv_type_2_2= '!' ) ) )
            // InternalIotlang.g:459:4: ( (lv_type_2_1= '?' | lv_type_2_2= '!' ) )
            {
            // InternalIotlang.g:459:4: ( (lv_type_2_1= '?' | lv_type_2_2= '!' ) )
            // InternalIotlang.g:460:5: (lv_type_2_1= '?' | lv_type_2_2= '!' )
            {
            // InternalIotlang.g:460:5: (lv_type_2_1= '?' | lv_type_2_2= '!' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalIotlang.g:461:6: lv_type_2_1= '?'
                    {
                    lv_type_2_1=(Token)match(input,19,FOLLOW_12); 

                    						newLeafNode(lv_type_2_1, grammarAccess.getTopicAccess().getTypeQuestionMarkKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:472:6: lv_type_2_2= '!'
                    {
                    lv_type_2_2=(Token)match(input,20,FOLLOW_12); 

                    						newLeafNode(lv_type_2_2, grammarAccess.getTopicAccess().getTypeExclamationMarkKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicAccess().getLeftParenthesisKeyword_3());
            		
            // InternalIotlang.g:489:3: ( (otherlv_4= RULE_ID ) )
            // InternalIotlang.g:490:4: (otherlv_4= RULE_ID )
            {
            // InternalIotlang.g:490:4: (otherlv_4= RULE_ID )
            // InternalIotlang.g:491:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getMessagesMessageCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTopicAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRuleRule"
    // InternalIotlang.g:510:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalIotlang.g:510:45: (iv_ruleRule= ruleRule EOF )
            // InternalIotlang.g:511:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalIotlang.g:517:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_permission_3_1=null;
        Token lv_permission_3_2=null;
        Token otherlv_4=null;
        Token lv_action_5_1=null;
        Token lv_action_5_2=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalIotlang.g:523:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( (otherlv_6= RULE_ID ) ) ) )
            // InternalIotlang.g:524:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalIotlang.g:524:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( (otherlv_6= RULE_ID ) ) )
            // InternalIotlang.g:525:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalIotlang.g:529:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalIotlang.g:530:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalIotlang.g:530:4: (lv_name_1_0= RULE_ID )
                    // InternalIotlang.g:531:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalIotlang.g:547:3: ( (otherlv_2= RULE_ID ) )
            // InternalIotlang.g:548:4: (otherlv_2= RULE_ID )
            {
            // InternalIotlang.g:548:4: (otherlv_2= RULE_ID )
            // InternalIotlang.g:549:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getThingsThingCrossReference_2_0());
            				

            }


            }

            // InternalIotlang.g:560:3: ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) )
            // InternalIotlang.g:561:4: ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) )
            {
            // InternalIotlang.g:561:4: ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) )
            // InternalIotlang.g:562:5: (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' )
            {
            // InternalIotlang.g:562:5: (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIotlang.g:563:6: lv_permission_3_1= 'allow'
                    {
                    lv_permission_3_1=(Token)match(input,24,FOLLOW_15); 

                    						newLeafNode(lv_permission_3_1, grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "permission", lv_permission_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:574:6: lv_permission_3_2= 'deny'
                    {
                    lv_permission_3_2=(Token)match(input,25,FOLLOW_15); 

                    						newLeafNode(lv_permission_3_2, grammarAccess.getRuleAccess().getPermissionDenyKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "permission", lv_permission_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getColonKeyword_4());
            		
            // InternalIotlang.g:591:3: ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) )
            // InternalIotlang.g:592:4: ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) )
            {
            // InternalIotlang.g:592:4: ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) )
            // InternalIotlang.g:593:5: (lv_action_5_1= 'send' | lv_action_5_2= 'receive' )
            {
            // InternalIotlang.g:593:5: (lv_action_5_1= 'send' | lv_action_5_2= 'receive' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalIotlang.g:594:6: lv_action_5_1= 'send'
                    {
                    lv_action_5_1=(Token)match(input,27,FOLLOW_5); 

                    						newLeafNode(lv_action_5_1, grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "action", lv_action_5_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:605:6: lv_action_5_2= 'receive'
                    {
                    lv_action_5_2=(Token)match(input,28,FOLLOW_5); 

                    						newLeafNode(lv_action_5_2, grammarAccess.getRuleAccess().getActionReceiveKeyword_5_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "action", lv_action_5_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalIotlang.g:618:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:619:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:619:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:620:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getResThingCrossReference_6_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDomain"
    // InternalIotlang.g:635:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalIotlang.g:635:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalIotlang.g:636:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalIotlang.g:642:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIotlang.g:648:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) ) )
            // InternalIotlang.g:649:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) )
            {
            // InternalIotlang.g:649:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) )
            // InternalIotlang.g:650:3: otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalIotlang.g:654:3: ( (lv_name_1_0= RULE_STRING_LIT ) )
            // InternalIotlang.g:655:4: (lv_name_1_0= RULE_STRING_LIT )
            {
            // InternalIotlang.g:655:4: (lv_name_1_0= RULE_STRING_LIT )
            // InternalIotlang.g:656:5: lv_name_1_0= RULE_STRING_LIT
            {
            lv_name_1_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainAccess().getNameSTRING_LITTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"lang.Iotlang.STRING_LIT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleInstanceThing"
    // InternalIotlang.g:676:1: entryRuleInstanceThing returns [EObject current=null] : iv_ruleInstanceThing= ruleInstanceThing EOF ;
    public final EObject entryRuleInstanceThing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceThing = null;


        try {
            // InternalIotlang.g:676:54: (iv_ruleInstanceThing= ruleInstanceThing EOF )
            // InternalIotlang.g:677:2: iv_ruleInstanceThing= ruleInstanceThing EOF
            {
             newCompositeNode(grammarAccess.getInstanceThingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceThing=ruleInstanceThing();

            state._fsp--;

             current =iv_ruleInstanceThing; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceThing"


    // $ANTLR start "ruleInstanceThing"
    // InternalIotlang.g:683:1: ruleInstanceThing returns [EObject current=null] : (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleInstanceThing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_annotations_7_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:689:2: ( (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:690:2: (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:690:2: (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:691:3: otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceThingAccess().getInstanceThingKeyword_0());
            		
            // InternalIotlang.g:695:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:696:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:696:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:697:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInstanceThingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceThingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIotlang.g:713:3: (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIotlang.g:714:4: otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInstanceThingAccess().getLeftSquareBracketKeyword_2_0());
            	    			
            	    // InternalIotlang.g:718:4: ( (lv_number_3_0= RULE_INT ) )
            	    // InternalIotlang.g:719:5: (lv_number_3_0= RULE_INT )
            	    {
            	    // InternalIotlang.g:719:5: (lv_number_3_0= RULE_INT )
            	    // InternalIotlang.g:720:6: lv_number_3_0= RULE_INT
            	    {
            	    lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    						newLeafNode(lv_number_3_0, grammarAccess.getInstanceThingAccess().getNumberINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInstanceThingRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"number",
            	    							lv_number_3_0,
            	    							"lang.Iotlang.INT");
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,32,FOLLOW_17); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInstanceThingAccess().getRightSquareBracketKeyword_2_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getInstanceThingAccess().getColonKeyword_3());
            		
            // InternalIotlang.g:745:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:746:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:746:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:747:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceThingRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_6, grammarAccess.getInstanceThingAccess().getTypeThingCrossReference_4_0());
            				

            }


            }

            // InternalIotlang.g:758:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ANNOTATION_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIotlang.g:759:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:759:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:760:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInstanceThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_annotations_7_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstanceThingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_7_0,
            	    						"lang.Iotlang.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceThing"


    // $ANTLR start "entryRuleInstanceBus"
    // InternalIotlang.g:781:1: entryRuleInstanceBus returns [EObject current=null] : iv_ruleInstanceBus= ruleInstanceBus EOF ;
    public final EObject entryRuleInstanceBus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceBus = null;


        try {
            // InternalIotlang.g:781:52: (iv_ruleInstanceBus= ruleInstanceBus EOF )
            // InternalIotlang.g:782:2: iv_ruleInstanceBus= ruleInstanceBus EOF
            {
             newCompositeNode(grammarAccess.getInstanceBusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceBus=ruleInstanceBus();

            state._fsp--;

             current =iv_ruleInstanceBus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceBus"


    // $ANTLR start "ruleInstanceBus"
    // InternalIotlang.g:788:1: ruleInstanceBus returns [EObject current=null] : (otherlv_0= 'instanceBus' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleInstanceBus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_annotations_9_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:794:2: ( (otherlv_0= 'instanceBus' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:795:2: (otherlv_0= 'instanceBus' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:795:2: (otherlv_0= 'instanceBus' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:796:3: otherlv_0= 'instanceBus' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceBusAccess().getInstanceBusKeyword_0());
            		
            // InternalIotlang.g:800:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:801:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:801:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:802:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInstanceBusAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceBusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIotlang.g:818:3: (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIotlang.g:819:4: otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInstanceBusAccess().getLeftSquareBracketKeyword_2_0());
            	    			
            	    // InternalIotlang.g:823:4: ( (lv_number_3_0= RULE_INT ) )
            	    // InternalIotlang.g:824:5: (lv_number_3_0= RULE_INT )
            	    {
            	    // InternalIotlang.g:824:5: (lv_number_3_0= RULE_INT )
            	    // InternalIotlang.g:825:6: lv_number_3_0= RULE_INT
            	    {
            	    lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    						newLeafNode(lv_number_3_0, grammarAccess.getInstanceBusAccess().getNumberINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInstanceBusRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"number",
            	    							lv_number_3_0,
            	    							"lang.Iotlang.INT");
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,32,FOLLOW_17); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInstanceBusAccess().getRightSquareBracketKeyword_2_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getInstanceBusAccess().getColonKeyword_3());
            		
            // InternalIotlang.g:850:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:851:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:851:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:852:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceBusRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_6, grammarAccess.getInstanceBusAccess().getTypeChannelChannelCrossReference_4_0());
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getInstanceBusAccess().getOverKeyword_5());
            		
            // InternalIotlang.g:867:3: ( (otherlv_8= RULE_ID ) )
            // InternalIotlang.g:868:4: (otherlv_8= RULE_ID )
            {
            // InternalIotlang.g:868:4: (otherlv_8= RULE_ID )
            // InternalIotlang.g:869:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceBusRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_8, grammarAccess.getInstanceBusAccess().getProtocolProtocolCrossReference_6_0());
            				

            }


            }

            // InternalIotlang.g:880:3: ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ANNOTATION_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIotlang.g:881:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:881:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:882:5: lv_annotations_9_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInstanceBusAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_annotations_9_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstanceBusRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_9_0,
            	    						"lang.Iotlang.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceBus"


    // $ANTLR start "entryRuleInstancePolicy"
    // InternalIotlang.g:903:1: entryRuleInstancePolicy returns [EObject current=null] : iv_ruleInstancePolicy= ruleInstancePolicy EOF ;
    public final EObject entryRuleInstancePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstancePolicy = null;


        try {
            // InternalIotlang.g:903:55: (iv_ruleInstancePolicy= ruleInstancePolicy EOF )
            // InternalIotlang.g:904:2: iv_ruleInstancePolicy= ruleInstancePolicy EOF
            {
             newCompositeNode(grammarAccess.getInstancePolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstancePolicy=ruleInstancePolicy();

            state._fsp--;

             current =iv_ruleInstancePolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstancePolicy"


    // $ANTLR start "ruleInstancePolicy"
    // InternalIotlang.g:910:1: ruleInstancePolicy returns [EObject current=null] : (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleInstancePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_annotations_4_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:916:2: ( (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:917:2: (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:917:2: (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:918:3: otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstancePolicyAccess().getInstancePolicyKeyword_0());
            		
            // InternalIotlang.g:922:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:923:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:923:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:924:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInstancePolicyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstancePolicyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInstancePolicyAccess().getColonKeyword_2());
            		
            // InternalIotlang.g:944:3: ( (otherlv_3= RULE_ID ) )
            // InternalIotlang.g:945:4: (otherlv_3= RULE_ID )
            {
            // InternalIotlang.g:945:4: (otherlv_3= RULE_ID )
            // InternalIotlang.g:946:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstancePolicyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_3, grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0());
            				

            }


            }

            // InternalIotlang.g:957:3: ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ANNOTATION_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIotlang.g:958:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:958:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:959:5: lv_annotations_4_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInstancePolicyAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_annotations_4_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstancePolicyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_4_0,
            	    						"lang.Iotlang.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstancePolicy"


    // $ANTLR start "entryRuleNetworkConfiguration"
    // InternalIotlang.g:980:1: entryRuleNetworkConfiguration returns [EObject current=null] : iv_ruleNetworkConfiguration= ruleNetworkConfiguration EOF ;
    public final EObject entryRuleNetworkConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConfiguration = null;


        try {
            // InternalIotlang.g:980:61: (iv_ruleNetworkConfiguration= ruleNetworkConfiguration EOF )
            // InternalIotlang.g:981:2: iv_ruleNetworkConfiguration= ruleNetworkConfiguration EOF
            {
             newCompositeNode(grammarAccess.getNetworkConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkConfiguration=ruleNetworkConfiguration();

            state._fsp--;

             current =iv_ruleNetworkConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetworkConfiguration"


    // $ANTLR start "ruleNetworkConfiguration"
    // InternalIotlang.g:987:1: ruleNetworkConfiguration returns [EObject current=null] : (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_instances_6_0= ruleInstanceThing ) ) | ( (lv_instancesBus_7_0= ruleInstanceBus ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instPolicies_10_0= ruleInstancePolicy ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleNetworkConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_annotations_2_0 = null;

        EObject lv_domain_4_0 = null;

        EObject lv_binds_5_0 = null;

        EObject lv_instances_6_0 = null;

        EObject lv_instancesBus_7_0 = null;

        EObject lv_instPolicies_10_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:993:2: ( (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_instances_6_0= ruleInstanceThing ) ) | ( (lv_instancesBus_7_0= ruleInstanceBus ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instPolicies_10_0= ruleInstancePolicy ) ) )* otherlv_11= '}' ) )
            // InternalIotlang.g:994:2: (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_instances_6_0= ruleInstanceThing ) ) | ( (lv_instancesBus_7_0= ruleInstanceBus ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instPolicies_10_0= ruleInstancePolicy ) ) )* otherlv_11= '}' )
            {
            // InternalIotlang.g:994:2: (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_instances_6_0= ruleInstanceThing ) ) | ( (lv_instancesBus_7_0= ruleInstanceBus ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instPolicies_10_0= ruleInstancePolicy ) ) )* otherlv_11= '}' )
            // InternalIotlang.g:995:3: otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_instances_6_0= ruleInstanceThing ) ) | ( (lv_instancesBus_7_0= ruleInstanceBus ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instPolicies_10_0= ruleInstancePolicy ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationKeyword_0());
            		
            // InternalIotlang.g:999:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:1000:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:1000:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:1001:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNetworkConfigurationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIotlang.g:1017:3: ( (lv_annotations_2_0= rulePlatformAnnotation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ANNOTATION_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIotlang.g:1018:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1018:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1019:5: lv_annotations_2_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_annotations_2_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_2_0,
            	    						"lang.Iotlang.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkConfigurationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIotlang.g:1040:3: ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_instances_6_0= ruleInstanceThing ) ) | ( (lv_instancesBus_7_0= ruleInstanceBus ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instPolicies_10_0= ruleInstancePolicy ) ) )*
            loop15:
            do {
                int alt15=7;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt15=1;
                    }
                    break;
                case 38:
                    {
                    alt15=2;
                    }
                    break;
                case 30:
                    {
                    alt15=3;
                    }
                    break;
                case 33:
                    {
                    alt15=4;
                    }
                    break;
                case 37:
                    {
                    alt15=5;
                    }
                    break;
                case 35:
                    {
                    alt15=6;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalIotlang.g:1041:4: ( (lv_domain_4_0= ruleDomain ) )
            	    {
            	    // InternalIotlang.g:1041:4: ( (lv_domain_4_0= ruleDomain ) )
            	    // InternalIotlang.g:1042:5: (lv_domain_4_0= ruleDomain )
            	    {
            	    // InternalIotlang.g:1042:5: (lv_domain_4_0= ruleDomain )
            	    // InternalIotlang.g:1043:6: lv_domain_4_0= ruleDomain
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getDomainDomainParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_domain_4_0=ruleDomain();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"domain",
            	    							lv_domain_4_0,
            	    							"lang.Iotlang.Domain");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIotlang.g:1061:4: ( (lv_binds_5_0= ruleBind ) )
            	    {
            	    // InternalIotlang.g:1061:4: ( (lv_binds_5_0= ruleBind ) )
            	    // InternalIotlang.g:1062:5: (lv_binds_5_0= ruleBind )
            	    {
            	    // InternalIotlang.g:1062:5: (lv_binds_5_0= ruleBind )
            	    // InternalIotlang.g:1063:6: lv_binds_5_0= ruleBind
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getBindsBindParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_binds_5_0=ruleBind();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"binds",
            	    							lv_binds_5_0,
            	    							"lang.Iotlang.Bind");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIotlang.g:1081:4: ( (lv_instances_6_0= ruleInstanceThing ) )
            	    {
            	    // InternalIotlang.g:1081:4: ( (lv_instances_6_0= ruleInstanceThing ) )
            	    // InternalIotlang.g:1082:5: (lv_instances_6_0= ruleInstanceThing )
            	    {
            	    // InternalIotlang.g:1082:5: (lv_instances_6_0= ruleInstanceThing )
            	    // InternalIotlang.g:1083:6: lv_instances_6_0= ruleInstanceThing
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getInstancesInstanceThingParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_instances_6_0=ruleInstanceThing();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"instances",
            	    							lv_instances_6_0,
            	    							"lang.Iotlang.InstanceThing");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIotlang.g:1101:4: ( (lv_instancesBus_7_0= ruleInstanceBus ) )
            	    {
            	    // InternalIotlang.g:1101:4: ( (lv_instancesBus_7_0= ruleInstanceBus ) )
            	    // InternalIotlang.g:1102:5: (lv_instancesBus_7_0= ruleInstanceBus )
            	    {
            	    // InternalIotlang.g:1102:5: (lv_instancesBus_7_0= ruleInstanceBus )
            	    // InternalIotlang.g:1103:6: lv_instancesBus_7_0= ruleInstanceBus
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getInstancesBusInstanceBusParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_instancesBus_7_0=ruleInstanceBus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"instancesBus",
            	    							lv_instancesBus_7_0,
            	    							"lang.Iotlang.InstanceBus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIotlang.g:1121:4: (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) )
            	    {
            	    // InternalIotlang.g:1121:4: (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) )
            	    // InternalIotlang.g:1122:5: otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,37,FOLLOW_5); 

            	    					newLeafNode(otherlv_8, grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_4_0());
            	    				
            	    // InternalIotlang.g:1126:5: ( (otherlv_9= RULE_ID ) )
            	    // InternalIotlang.g:1127:6: (otherlv_9= RULE_ID )
            	    {
            	    // InternalIotlang.g:1127:6: (otherlv_9= RULE_ID )
            	    // InternalIotlang.g:1128:7: otherlv_9= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getNetworkConfigurationRule());
            	    							}
            	    						
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    							newLeafNode(otherlv_9, grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_4_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalIotlang.g:1141:4: ( (lv_instPolicies_10_0= ruleInstancePolicy ) )
            	    {
            	    // InternalIotlang.g:1141:4: ( (lv_instPolicies_10_0= ruleInstancePolicy ) )
            	    // InternalIotlang.g:1142:5: (lv_instPolicies_10_0= ruleInstancePolicy )
            	    {
            	    // InternalIotlang.g:1142:5: (lv_instPolicies_10_0= ruleInstancePolicy )
            	    // InternalIotlang.g:1143:6: lv_instPolicies_10_0= ruleInstancePolicy
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getInstPoliciesInstancePolicyParserRuleCall_4_5_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_instPolicies_10_0=ruleInstancePolicy();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"instPolicies",
            	    							lv_instPolicies_10_0,
            	    							"lang.Iotlang.InstancePolicy");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getNetworkConfigurationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetworkConfiguration"


    // $ANTLR start "entryRuleBind"
    // InternalIotlang.g:1169:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // InternalIotlang.g:1169:45: (iv_ruleBind= ruleBind EOF )
            // InternalIotlang.g:1170:2: iv_ruleBind= ruleBind EOF
            {
             newCompositeNode(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBind=ruleBind();

            state._fsp--;

             current =iv_ruleBind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // InternalIotlang.g:1176:1: ruleBind returns [EObject current=null] : (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleBind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_direction_3_1=null;
        Token lv_direction_3_2=null;
        Token lv_direction_3_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_annotations_10_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:1182:2: ( (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:1183:2: (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:1183:2: (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:1184:3: otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBindAccess().getBindKeyword_0());
            		
            // InternalIotlang.g:1188:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_ID) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalIotlang.g:1189:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalIotlang.g:1189:4: (lv_name_1_0= RULE_ID )
                    // InternalIotlang.g:1190:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getBindAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBindRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalIotlang.g:1206:3: ( (otherlv_2= RULE_ID ) )
            // InternalIotlang.g:1207:4: (otherlv_2= RULE_ID )
            {
            // InternalIotlang.g:1207:4: (otherlv_2= RULE_ID )
            // InternalIotlang.g:1208:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getBindAccess().getThinginstInstanceThingCrossReference_2_0());
            				

            }


            }

            // InternalIotlang.g:1219:3: ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) )
            // InternalIotlang.g:1220:4: ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) )
            {
            // InternalIotlang.g:1220:4: ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) )
            // InternalIotlang.g:1221:5: (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' )
            {
            // InternalIotlang.g:1221:5: (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalIotlang.g:1222:6: lv_direction_3_1= '=>'
                    {
                    lv_direction_3_1=(Token)match(input,39,FOLLOW_5); 

                    						newLeafNode(lv_direction_3_1, grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:1233:6: lv_direction_3_2= '<=>'
                    {
                    lv_direction_3_2=(Token)match(input,40,FOLLOW_5); 

                    						newLeafNode(lv_direction_3_2, grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalIotlang.g:1244:6: lv_direction_3_3= '<='
                    {
                    lv_direction_3_3=(Token)match(input,41,FOLLOW_5); 

                    						newLeafNode(lv_direction_3_3, grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_3_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalIotlang.g:1257:3: ( (otherlv_4= RULE_ID ) )
            // InternalIotlang.g:1258:4: (otherlv_4= RULE_ID )
            {
            // InternalIotlang.g:1258:4: (otherlv_4= RULE_ID )
            // InternalIotlang.g:1259:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_4, grammarAccess.getBindAccess().getBusInstInstanceBusCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getBindAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalIotlang.g:1274:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:1275:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:1275:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:1276:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_6, grammarAccess.getBindAccess().getChannelsTopicCrossReference_6_0());
            				

            }


            }

            // InternalIotlang.g:1287:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIotlang.g:1288:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,42,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getBindAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalIotlang.g:1292:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalIotlang.g:1293:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalIotlang.g:1293:5: (otherlv_8= RULE_ID )
            	    // InternalIotlang.g:1294:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBindRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_8, grammarAccess.getBindAccess().getChannelsTopicCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getBindAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalIotlang.g:1310:3: ( (lv_annotations_10_0= rulePlatformAnnotation ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ANNOTATION_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIotlang.g:1311:4: (lv_annotations_10_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1311:4: (lv_annotations_10_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1312:5: lv_annotations_10_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getBindAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_annotations_10_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBindRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_10_0,
            	    						"lang.Iotlang.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000032002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000006A60008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000008000L});

}