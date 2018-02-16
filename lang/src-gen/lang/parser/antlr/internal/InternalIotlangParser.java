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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_ID", "RULE_STRING_LIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'thing'", "'{'", "'}'", "'channel:pubsub'", "'channel:ptp'", "'policy'", "'protocol'", "'message'", "'topic'", "'('", "')'", "'rule'", "'allow'", "'deny'", "':'", "'send'", "'receive'", "'domain'", "'instanceThing'", "'['", "']'", "'instanceChannel'", "'over'", "'instancePolicy'", "'networkConfiguration'", "'enforce'", "'bind'", "'=>'", "'<=>'", "'<='", "','"
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
    // InternalIotlang.g:71:1: ruleIoTLangModel returns [EObject current=null] : ( ( (lv_things_0_0= ruleThing ) ) | ( (lv_policies_1_0= rulePolicy ) ) | ( (lv_messages_2_0= ruleMessage ) ) | ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_protocols_4_0= ruleProtocol ) ) | ( (lv_configs_5_0= ruleNetworkConfiguration ) ) )* ;
    public final EObject ruleIoTLangModel() throws RecognitionException {
        EObject current = null;

        EObject lv_things_0_0 = null;

        EObject lv_policies_1_0 = null;

        EObject lv_messages_2_0 = null;

        EObject lv_channels_3_0 = null;

        EObject lv_protocols_4_0 = null;

        EObject lv_configs_5_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:77:2: ( ( ( (lv_things_0_0= ruleThing ) ) | ( (lv_policies_1_0= rulePolicy ) ) | ( (lv_messages_2_0= ruleMessage ) ) | ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_protocols_4_0= ruleProtocol ) ) | ( (lv_configs_5_0= ruleNetworkConfiguration ) ) )* )
            // InternalIotlang.g:78:2: ( ( (lv_things_0_0= ruleThing ) ) | ( (lv_policies_1_0= rulePolicy ) ) | ( (lv_messages_2_0= ruleMessage ) ) | ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_protocols_4_0= ruleProtocol ) ) | ( (lv_configs_5_0= ruleNetworkConfiguration ) ) )*
            {
            // InternalIotlang.g:78:2: ( ( (lv_things_0_0= ruleThing ) ) | ( (lv_policies_1_0= rulePolicy ) ) | ( (lv_messages_2_0= ruleMessage ) ) | ( (lv_channels_3_0= ruleChannel ) ) | ( (lv_protocols_4_0= ruleProtocol ) ) | ( (lv_configs_5_0= ruleNetworkConfiguration ) ) )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt1=1;
                    }
                    break;
                case 18:
                    {
                    alt1=2;
                    }
                    break;
                case 20:
                    {
                    alt1=3;
                    }
                    break;
                case 16:
                case 17:
                    {
                    alt1=4;
                    }
                    break;
                case 19:
                    {
                    alt1=5;
                    }
                    break;
                case 37:
                    {
                    alt1=6;
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
            	    // InternalIotlang.g:119:3: ( (lv_messages_2_0= ruleMessage ) )
            	    {
            	    // InternalIotlang.g:119:3: ( (lv_messages_2_0= ruleMessage ) )
            	    // InternalIotlang.g:120:4: (lv_messages_2_0= ruleMessage )
            	    {
            	    // InternalIotlang.g:120:4: (lv_messages_2_0= ruleMessage )
            	    // InternalIotlang.g:121:5: lv_messages_2_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getIoTLangModelAccess().getMessagesMessageParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_messages_2_0=ruleMessage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"messages",
            	    						lv_messages_2_0,
            	    						"lang.Iotlang.Message");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIotlang.g:139:3: ( (lv_channels_3_0= ruleChannel ) )
            	    {
            	    // InternalIotlang.g:139:3: ( (lv_channels_3_0= ruleChannel ) )
            	    // InternalIotlang.g:140:4: (lv_channels_3_0= ruleChannel )
            	    {
            	    // InternalIotlang.g:140:4: (lv_channels_3_0= ruleChannel )
            	    // InternalIotlang.g:141:5: lv_channels_3_0= ruleChannel
            	    {

            	    					newCompositeNode(grammarAccess.getIoTLangModelAccess().getChannelsChannelParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_channels_3_0=ruleChannel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"channels",
            	    						lv_channels_3_0,
            	    						"lang.Iotlang.Channel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIotlang.g:159:3: ( (lv_protocols_4_0= ruleProtocol ) )
            	    {
            	    // InternalIotlang.g:159:3: ( (lv_protocols_4_0= ruleProtocol ) )
            	    // InternalIotlang.g:160:4: (lv_protocols_4_0= ruleProtocol )
            	    {
            	    // InternalIotlang.g:160:4: (lv_protocols_4_0= ruleProtocol )
            	    // InternalIotlang.g:161:5: lv_protocols_4_0= ruleProtocol
            	    {

            	    					newCompositeNode(grammarAccess.getIoTLangModelAccess().getProtocolsProtocolParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_protocols_4_0=ruleProtocol();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"protocols",
            	    						lv_protocols_4_0,
            	    						"lang.Iotlang.Protocol");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalIotlang.g:179:3: ( (lv_configs_5_0= ruleNetworkConfiguration ) )
            	    {
            	    // InternalIotlang.g:179:3: ( (lv_configs_5_0= ruleNetworkConfiguration ) )
            	    // InternalIotlang.g:180:4: (lv_configs_5_0= ruleNetworkConfiguration )
            	    {
            	    // InternalIotlang.g:180:4: (lv_configs_5_0= ruleNetworkConfiguration )
            	    // InternalIotlang.g:181:5: lv_configs_5_0= ruleNetworkConfiguration
            	    {

            	    					newCompositeNode(grammarAccess.getIoTLangModelAccess().getConfigsNetworkConfigurationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_configs_5_0=ruleNetworkConfiguration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIoTLangModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configs",
            	    						lv_configs_5_0,
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
    // InternalIotlang.g:202:1: entryRulePlatformAnnotation returns [EObject current=null] : iv_rulePlatformAnnotation= rulePlatformAnnotation EOF ;
    public final EObject entryRulePlatformAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformAnnotation = null;


        try {
            // InternalIotlang.g:202:59: (iv_rulePlatformAnnotation= rulePlatformAnnotation EOF )
            // InternalIotlang.g:203:2: iv_rulePlatformAnnotation= rulePlatformAnnotation EOF
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
    // InternalIotlang.g:209:1: rulePlatformAnnotation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( (lv_value_1_0= RULE_STRING_LIT ) ) ) ;
    public final EObject rulePlatformAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalIotlang.g:215:2: ( ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( (lv_value_1_0= RULE_STRING_LIT ) ) ) )
            // InternalIotlang.g:216:2: ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( (lv_value_1_0= RULE_STRING_LIT ) ) )
            {
            // InternalIotlang.g:216:2: ( ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( (lv_value_1_0= RULE_STRING_LIT ) ) )
            // InternalIotlang.g:217:3: ( (lv_name_0_0= RULE_ANNOTATION_ID ) ) ( (lv_value_1_0= RULE_STRING_LIT ) )
            {
            // InternalIotlang.g:217:3: ( (lv_name_0_0= RULE_ANNOTATION_ID ) )
            // InternalIotlang.g:218:4: (lv_name_0_0= RULE_ANNOTATION_ID )
            {
            // InternalIotlang.g:218:4: (lv_name_0_0= RULE_ANNOTATION_ID )
            // InternalIotlang.g:219:5: lv_name_0_0= RULE_ANNOTATION_ID
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

            // InternalIotlang.g:235:3: ( (lv_value_1_0= RULE_STRING_LIT ) )
            // InternalIotlang.g:236:4: (lv_value_1_0= RULE_STRING_LIT )
            {
            // InternalIotlang.g:236:4: (lv_value_1_0= RULE_STRING_LIT )
            // InternalIotlang.g:237:5: lv_value_1_0= RULE_STRING_LIT
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
    // InternalIotlang.g:257:1: entryRuleThing returns [EObject current=null] : iv_ruleThing= ruleThing EOF ;
    public final EObject entryRuleThing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThing = null;


        try {
            // InternalIotlang.g:257:46: (iv_ruleThing= ruleThing EOF )
            // InternalIotlang.g:258:2: iv_ruleThing= ruleThing EOF
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
    // InternalIotlang.g:264:1: ruleThing returns [EObject current=null] : (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleThing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_annotations_2_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:270:2: ( (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' otherlv_4= '}' ) )
            // InternalIotlang.g:271:2: (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalIotlang.g:271:2: (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' otherlv_4= '}' )
            // InternalIotlang.g:272:3: otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getThingAccess().getThingKeyword_0());
            		
            // InternalIotlang.g:276:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:277:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:277:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:278:5: lv_name_1_0= RULE_ID
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

            // InternalIotlang.g:294:3: ( (lv_annotations_2_0= rulePlatformAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ANNOTATION_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIotlang.g:295:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:295:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:296:5: lv_annotations_2_0= rulePlatformAnnotation
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
    // InternalIotlang.g:325:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalIotlang.g:325:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalIotlang.g:326:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalIotlang.g:332:1: ruleChannel returns [EObject current=null] : (this_PubSub_0= rulePubSub | this_PointToPoint_1= rulePointToPoint ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        EObject this_PubSub_0 = null;

        EObject this_PointToPoint_1 = null;



        	enterRule();

        try {
            // InternalIotlang.g:338:2: ( (this_PubSub_0= rulePubSub | this_PointToPoint_1= rulePointToPoint ) )
            // InternalIotlang.g:339:2: (this_PubSub_0= rulePubSub | this_PointToPoint_1= rulePointToPoint )
            {
            // InternalIotlang.g:339:2: (this_PubSub_0= rulePubSub | this_PointToPoint_1= rulePointToPoint )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIotlang.g:340:3: this_PubSub_0= rulePubSub
                    {

                    			newCompositeNode(grammarAccess.getChannelAccess().getPubSubParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PubSub_0=rulePubSub();

                    state._fsp--;


                    			current = this_PubSub_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:349:3: this_PointToPoint_1= rulePointToPoint
                    {

                    			newCompositeNode(grammarAccess.getChannelAccess().getPointToPointParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PointToPoint_1=rulePointToPoint();

                    state._fsp--;


                    			current = this_PointToPoint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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


    // $ANTLR start "entryRulePubSub"
    // InternalIotlang.g:361:1: entryRulePubSub returns [EObject current=null] : iv_rulePubSub= rulePubSub EOF ;
    public final EObject entryRulePubSub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePubSub = null;


        try {
            // InternalIotlang.g:361:47: (iv_rulePubSub= rulePubSub EOF )
            // InternalIotlang.g:362:2: iv_rulePubSub= rulePubSub EOF
            {
             newCompositeNode(grammarAccess.getPubSubRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePubSub=rulePubSub();

            state._fsp--;

             current =iv_rulePubSub; 
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
    // $ANTLR end "entryRulePubSub"


    // $ANTLR start "rulePubSub"
    // InternalIotlang.g:368:1: rulePubSub returns [EObject current=null] : (otherlv_0= 'channel:pubsub' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' ) ;
    public final EObject rulePubSub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_hasTopics_3_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:374:2: ( (otherlv_0= 'channel:pubsub' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' ) )
            // InternalIotlang.g:375:2: (otherlv_0= 'channel:pubsub' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' )
            {
            // InternalIotlang.g:375:2: (otherlv_0= 'channel:pubsub' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' )
            // InternalIotlang.g:376:3: otherlv_0= 'channel:pubsub' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPubSubAccess().getChannelPubsubKeyword_0());
            		
            // InternalIotlang.g:380:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:381:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:381:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:382:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPubSubAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPubSubRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPubSubAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIotlang.g:402:3: ( (lv_hasTopics_3_0= ruleTopic ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIotlang.g:403:4: (lv_hasTopics_3_0= ruleTopic )
            	    {
            	    // InternalIotlang.g:403:4: (lv_hasTopics_3_0= ruleTopic )
            	    // InternalIotlang.g:404:5: lv_hasTopics_3_0= ruleTopic
            	    {

            	    					newCompositeNode(grammarAccess.getPubSubAccess().getHasTopicsTopicParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_hasTopics_3_0=ruleTopic();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPubSubRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hasTopics",
            	    						lv_hasTopics_3_0,
            	    						"lang.Iotlang.Topic");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPubSubAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePubSub"


    // $ANTLR start "entryRulePointToPoint"
    // InternalIotlang.g:429:1: entryRulePointToPoint returns [EObject current=null] : iv_rulePointToPoint= rulePointToPoint EOF ;
    public final EObject entryRulePointToPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointToPoint = null;


        try {
            // InternalIotlang.g:429:53: (iv_rulePointToPoint= rulePointToPoint EOF )
            // InternalIotlang.g:430:2: iv_rulePointToPoint= rulePointToPoint EOF
            {
             newCompositeNode(grammarAccess.getPointToPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointToPoint=rulePointToPoint();

            state._fsp--;

             current =iv_rulePointToPoint; 
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
    // $ANTLR end "entryRulePointToPoint"


    // $ANTLR start "rulePointToPoint"
    // InternalIotlang.g:436:1: rulePointToPoint returns [EObject current=null] : (otherlv_0= 'channel:ptp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' ) ;
    public final EObject rulePointToPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_hasTopics_3_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:442:2: ( (otherlv_0= 'channel:ptp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' ) )
            // InternalIotlang.g:443:2: (otherlv_0= 'channel:ptp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' )
            {
            // InternalIotlang.g:443:2: (otherlv_0= 'channel:ptp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' )
            // InternalIotlang.g:444:3: otherlv_0= 'channel:ptp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPointToPointAccess().getChannelPtpKeyword_0());
            		
            // InternalIotlang.g:448:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:449:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:449:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:450:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPointToPointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointToPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPointToPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIotlang.g:470:3: ( (lv_hasTopics_3_0= ruleTopic ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIotlang.g:471:4: (lv_hasTopics_3_0= ruleTopic )
            	    {
            	    // InternalIotlang.g:471:4: (lv_hasTopics_3_0= ruleTopic )
            	    // InternalIotlang.g:472:5: lv_hasTopics_3_0= ruleTopic
            	    {

            	    					newCompositeNode(grammarAccess.getPointToPointAccess().getHasTopicsTopicParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_hasTopics_3_0=ruleTopic();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPointToPointRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hasTopics",
            	    						lv_hasTopics_3_0,
            	    						"lang.Iotlang.Topic");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPointToPointAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePointToPoint"


    // $ANTLR start "entryRulePolicy"
    // InternalIotlang.g:497:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalIotlang.g:497:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalIotlang.g:498:2: iv_rulePolicy= rulePolicy EOF
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
    // InternalIotlang.g:504:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasRules_3_0= ruleRule ) )* otherlv_4= '}' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_hasRules_3_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:510:2: ( (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasRules_3_0= ruleRule ) )* otherlv_4= '}' ) )
            // InternalIotlang.g:511:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasRules_3_0= ruleRule ) )* otherlv_4= '}' )
            {
            // InternalIotlang.g:511:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasRules_3_0= ruleRule ) )* otherlv_4= '}' )
            // InternalIotlang.g:512:3: otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasRules_3_0= ruleRule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalIotlang.g:516:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:517:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:517:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:518:5: lv_name_1_0= RULE_ID
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
            		
            // InternalIotlang.g:538:3: ( (lv_hasRules_3_0= ruleRule ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIotlang.g:539:4: (lv_hasRules_3_0= ruleRule )
            	    {
            	    // InternalIotlang.g:539:4: (lv_hasRules_3_0= ruleRule )
            	    // InternalIotlang.g:540:5: lv_hasRules_3_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getPolicyAccess().getHasRulesRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_hasRules_3_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hasRules",
            	    						lv_hasRules_3_0,
            	    						"lang.Iotlang.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "entryRuleProtocol"
    // InternalIotlang.g:565:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalIotlang.g:565:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalIotlang.g:566:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
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
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalIotlang.g:572:1: ruleProtocol returns [EObject current=null] : (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIotlang.g:578:2: ( (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIotlang.g:579:2: (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIotlang.g:579:2: (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIotlang.g:580:3: otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getProtocolKeyword_0());
            		
            // InternalIotlang.g:584:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:585:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:585:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:586:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtocolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleMessage"
    // InternalIotlang.g:606:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalIotlang.g:606:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalIotlang.g:607:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalIotlang.g:613:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIotlang.g:619:2: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIotlang.g:620:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIotlang.g:620:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIotlang.g:621:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
            // InternalIotlang.g:625:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:626:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:626:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:627:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleTopic"
    // InternalIotlang.g:647:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalIotlang.g:647:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalIotlang.g:648:2: iv_ruleTopic= ruleTopic EOF
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
    // InternalIotlang.g:654:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalIotlang.g:660:2: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalIotlang.g:661:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalIotlang.g:661:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // InternalIotlang.g:662:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
            		
            // InternalIotlang.g:666:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:667:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:667:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:668:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTopicAccess().getLeftParenthesisKeyword_2());
            		
            // InternalIotlang.g:688:3: ( (otherlv_3= RULE_ID ) )
            // InternalIotlang.g:689:4: (otherlv_3= RULE_ID )
            {
            // InternalIotlang.g:689:4: (otherlv_3= RULE_ID )
            // InternalIotlang.g:690:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getTopicAccess().getAcceptedMessagesMessageCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalIotlang.g:709:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalIotlang.g:709:45: (iv_ruleRule= ruleRule EOF )
            // InternalIotlang.g:710:2: iv_ruleRule= ruleRule EOF
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
    // InternalIotlang.g:716:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( (otherlv_6= RULE_ID ) ) ) ;
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
            // InternalIotlang.g:722:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( (otherlv_6= RULE_ID ) ) ) )
            // InternalIotlang.g:723:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalIotlang.g:723:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( (otherlv_6= RULE_ID ) ) )
            // InternalIotlang.g:724:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalIotlang.g:728:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalIotlang.g:729:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalIotlang.g:729:4: (lv_name_1_0= RULE_ID )
                    // InternalIotlang.g:730:5: lv_name_1_0= RULE_ID
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

            // InternalIotlang.g:746:3: ( (otherlv_2= RULE_ID ) )
            // InternalIotlang.g:747:4: (otherlv_2= RULE_ID )
            {
            // InternalIotlang.g:747:4: (otherlv_2= RULE_ID )
            // InternalIotlang.g:748:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getSubjectThingCrossReference_2_0());
            				

            }


            }

            // InternalIotlang.g:759:3: ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) )
            // InternalIotlang.g:760:4: ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) )
            {
            // InternalIotlang.g:760:4: ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) )
            // InternalIotlang.g:761:5: (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' )
            {
            // InternalIotlang.g:761:5: (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalIotlang.g:762:6: lv_permission_3_1= 'allow'
                    {
                    lv_permission_3_1=(Token)match(input,25,FOLLOW_14); 

                    						newLeafNode(lv_permission_3_1, grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "permission", lv_permission_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:773:6: lv_permission_3_2= 'deny'
                    {
                    lv_permission_3_2=(Token)match(input,26,FOLLOW_14); 

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

            otherlv_4=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getColonKeyword_4());
            		
            // InternalIotlang.g:790:3: ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) )
            // InternalIotlang.g:791:4: ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) )
            {
            // InternalIotlang.g:791:4: ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) )
            // InternalIotlang.g:792:5: (lv_action_5_1= 'send' | lv_action_5_2= 'receive' )
            {
            // InternalIotlang.g:792:5: (lv_action_5_1= 'send' | lv_action_5_2= 'receive' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==29) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIotlang.g:793:6: lv_action_5_1= 'send'
                    {
                    lv_action_5_1=(Token)match(input,28,FOLLOW_5); 

                    						newLeafNode(lv_action_5_1, grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "action", lv_action_5_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:804:6: lv_action_5_2= 'receive'
                    {
                    lv_action_5_2=(Token)match(input,29,FOLLOW_5); 

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

            // InternalIotlang.g:817:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:818:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:818:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:819:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getObjectThingCrossReference_6_0());
            				

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
    // InternalIotlang.g:834:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalIotlang.g:834:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalIotlang.g:835:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalIotlang.g:841:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIotlang.g:847:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) ) )
            // InternalIotlang.g:848:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) )
            {
            // InternalIotlang.g:848:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) )
            // InternalIotlang.g:849:3: otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalIotlang.g:853:3: ( (lv_name_1_0= RULE_STRING_LIT ) )
            // InternalIotlang.g:854:4: (lv_name_1_0= RULE_STRING_LIT )
            {
            // InternalIotlang.g:854:4: (lv_name_1_0= RULE_STRING_LIT )
            // InternalIotlang.g:855:5: lv_name_1_0= RULE_STRING_LIT
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
    // InternalIotlang.g:875:1: entryRuleInstanceThing returns [EObject current=null] : iv_ruleInstanceThing= ruleInstanceThing EOF ;
    public final EObject entryRuleInstanceThing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceThing = null;


        try {
            // InternalIotlang.g:875:54: (iv_ruleInstanceThing= ruleInstanceThing EOF )
            // InternalIotlang.g:876:2: iv_ruleInstanceThing= ruleInstanceThing EOF
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
    // InternalIotlang.g:882:1: ruleInstanceThing returns [EObject current=null] : (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) ;
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
            // InternalIotlang.g:888:2: ( (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:889:2: (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:889:2: (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:890:3: otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceThingAccess().getInstanceThingKeyword_0());
            		
            // InternalIotlang.g:894:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:895:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:895:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:896:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalIotlang.g:912:3: (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIotlang.g:913:4: otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInstanceThingAccess().getLeftSquareBracketKeyword_2_0());
            	    			
            	    // InternalIotlang.g:917:4: ( (lv_number_3_0= RULE_INT ) )
            	    // InternalIotlang.g:918:5: (lv_number_3_0= RULE_INT )
            	    {
            	    // InternalIotlang.g:918:5: (lv_number_3_0= RULE_INT )
            	    // InternalIotlang.g:919:6: lv_number_3_0= RULE_INT
            	    {
            	    lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

            	    otherlv_4=(Token)match(input,33,FOLLOW_16); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInstanceThingAccess().getRightSquareBracketKeyword_2_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getInstanceThingAccess().getColonKeyword_3());
            		
            // InternalIotlang.g:944:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:945:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:945:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:946:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceThingRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_6, grammarAccess.getInstanceThingAccess().getTypeThingThingCrossReference_4_0());
            				

            }


            }

            // InternalIotlang.g:957:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ANNOTATION_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIotlang.g:958:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:958:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:959:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInstanceThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop11;
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


    // $ANTLR start "entryRuleInstanceChannel"
    // InternalIotlang.g:980:1: entryRuleInstanceChannel returns [EObject current=null] : iv_ruleInstanceChannel= ruleInstanceChannel EOF ;
    public final EObject entryRuleInstanceChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceChannel = null;


        try {
            // InternalIotlang.g:980:56: (iv_ruleInstanceChannel= ruleInstanceChannel EOF )
            // InternalIotlang.g:981:2: iv_ruleInstanceChannel= ruleInstanceChannel EOF
            {
             newCompositeNode(grammarAccess.getInstanceChannelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceChannel=ruleInstanceChannel();

            state._fsp--;

             current =iv_ruleInstanceChannel; 
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
    // $ANTLR end "entryRuleInstanceChannel"


    // $ANTLR start "ruleInstanceChannel"
    // InternalIotlang.g:987:1: ruleInstanceChannel returns [EObject current=null] : (otherlv_0= 'instanceChannel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleInstanceChannel() throws RecognitionException {
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
            // InternalIotlang.g:993:2: ( (otherlv_0= 'instanceChannel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:994:2: (otherlv_0= 'instanceChannel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:994:2: (otherlv_0= 'instanceChannel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:995:3: otherlv_0= 'instanceChannel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceChannelAccess().getInstanceChannelKeyword_0());
            		
            // InternalIotlang.g:999:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:1000:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:1000:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:1001:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInstanceChannelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceChannelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIotlang.g:1017:3: (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIotlang.g:1018:4: otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInstanceChannelAccess().getLeftSquareBracketKeyword_2_0());
            	    			
            	    // InternalIotlang.g:1022:4: ( (lv_number_3_0= RULE_INT ) )
            	    // InternalIotlang.g:1023:5: (lv_number_3_0= RULE_INT )
            	    {
            	    // InternalIotlang.g:1023:5: (lv_number_3_0= RULE_INT )
            	    // InternalIotlang.g:1024:6: lv_number_3_0= RULE_INT
            	    {
            	    lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    						newLeafNode(lv_number_3_0, grammarAccess.getInstanceChannelAccess().getNumberINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInstanceChannelRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"number",
            	    							lv_number_3_0,
            	    							"lang.Iotlang.INT");
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,33,FOLLOW_16); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInstanceChannelAccess().getRightSquareBracketKeyword_2_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getInstanceChannelAccess().getColonKeyword_3());
            		
            // InternalIotlang.g:1049:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:1050:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:1050:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:1051:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceChannelRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_6, grammarAccess.getInstanceChannelAccess().getTypeChannelChannelCrossReference_4_0());
            				

            }


            }

            otherlv_7=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getInstanceChannelAccess().getOverKeyword_5());
            		
            // InternalIotlang.g:1066:3: ( (otherlv_8= RULE_ID ) )
            // InternalIotlang.g:1067:4: (otherlv_8= RULE_ID )
            {
            // InternalIotlang.g:1067:4: (otherlv_8= RULE_ID )
            // InternalIotlang.g:1068:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceChannelRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_8, grammarAccess.getInstanceChannelAccess().getOverProtocolProtocolCrossReference_6_0());
            				

            }


            }

            // InternalIotlang.g:1079:3: ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ANNOTATION_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIotlang.g:1080:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1080:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1081:5: lv_annotations_9_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInstanceChannelAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_annotations_9_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstanceChannelRule());
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
    // $ANTLR end "ruleInstanceChannel"


    // $ANTLR start "entryRuleInstancePolicy"
    // InternalIotlang.g:1102:1: entryRuleInstancePolicy returns [EObject current=null] : iv_ruleInstancePolicy= ruleInstancePolicy EOF ;
    public final EObject entryRuleInstancePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstancePolicy = null;


        try {
            // InternalIotlang.g:1102:55: (iv_ruleInstancePolicy= ruleInstancePolicy EOF )
            // InternalIotlang.g:1103:2: iv_ruleInstancePolicy= ruleInstancePolicy EOF
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
    // InternalIotlang.g:1109:1: ruleInstancePolicy returns [EObject current=null] : (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleInstancePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_annotations_4_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:1115:2: ( (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:1116:2: (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:1116:2: (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:1117:3: otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstancePolicyAccess().getInstancePolicyKeyword_0());
            		
            // InternalIotlang.g:1121:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:1122:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:1122:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:1123:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInstancePolicyAccess().getColonKeyword_2());
            		
            // InternalIotlang.g:1143:3: ( (otherlv_3= RULE_ID ) )
            // InternalIotlang.g:1144:4: (otherlv_3= RULE_ID )
            {
            // InternalIotlang.g:1144:4: (otherlv_3= RULE_ID )
            // InternalIotlang.g:1145:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstancePolicyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_3, grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0());
            				

            }


            }

            // InternalIotlang.g:1156:3: ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ANNOTATION_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIotlang.g:1157:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1157:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1158:5: lv_annotations_4_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInstancePolicyAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop14;
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
    // InternalIotlang.g:1179:1: entryRuleNetworkConfiguration returns [EObject current=null] : iv_ruleNetworkConfiguration= ruleNetworkConfiguration EOF ;
    public final EObject entryRuleNetworkConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConfiguration = null;


        try {
            // InternalIotlang.g:1179:61: (iv_ruleNetworkConfiguration= ruleNetworkConfiguration EOF )
            // InternalIotlang.g:1180:2: iv_ruleNetworkConfiguration= ruleNetworkConfiguration EOF
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
    // InternalIotlang.g:1186:1: ruleNetworkConfiguration returns [EObject current=null] : (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_thingInstances_6_0= ruleInstanceThing ) ) | ( (lv_channelInstances_7_0= ruleInstanceChannel ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instancePoliciy_10_0= ruleInstancePolicy ) ) )* otherlv_11= '}' ) ;
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

        EObject lv_thingInstances_6_0 = null;

        EObject lv_channelInstances_7_0 = null;

        EObject lv_instancePoliciy_10_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:1192:2: ( (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_thingInstances_6_0= ruleInstanceThing ) ) | ( (lv_channelInstances_7_0= ruleInstanceChannel ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instancePoliciy_10_0= ruleInstancePolicy ) ) )* otherlv_11= '}' ) )
            // InternalIotlang.g:1193:2: (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_thingInstances_6_0= ruleInstanceThing ) ) | ( (lv_channelInstances_7_0= ruleInstanceChannel ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instancePoliciy_10_0= ruleInstancePolicy ) ) )* otherlv_11= '}' )
            {
            // InternalIotlang.g:1193:2: (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_thingInstances_6_0= ruleInstanceThing ) ) | ( (lv_channelInstances_7_0= ruleInstanceChannel ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instancePoliciy_10_0= ruleInstancePolicy ) ) )* otherlv_11= '}' )
            // InternalIotlang.g:1194:3: otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_thingInstances_6_0= ruleInstanceThing ) ) | ( (lv_channelInstances_7_0= ruleInstanceChannel ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instancePoliciy_10_0= ruleInstancePolicy ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationKeyword_0());
            		
            // InternalIotlang.g:1198:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:1199:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:1199:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:1200:5: lv_name_1_0= RULE_ID
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

            // InternalIotlang.g:1216:3: ( (lv_annotations_2_0= rulePlatformAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ANNOTATION_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIotlang.g:1217:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1217:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1218:5: lv_annotations_2_0= rulePlatformAnnotation
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
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkConfigurationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIotlang.g:1239:3: ( ( (lv_domain_4_0= ruleDomain ) ) | ( (lv_binds_5_0= ruleBind ) ) | ( (lv_thingInstances_6_0= ruleInstanceThing ) ) | ( (lv_channelInstances_7_0= ruleInstanceChannel ) ) | (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) ) | ( (lv_instancePoliciy_10_0= ruleInstancePolicy ) ) )*
            loop16:
            do {
                int alt16=7;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt16=1;
                    }
                    break;
                case 39:
                    {
                    alt16=2;
                    }
                    break;
                case 31:
                    {
                    alt16=3;
                    }
                    break;
                case 34:
                    {
                    alt16=4;
                    }
                    break;
                case 38:
                    {
                    alt16=5;
                    }
                    break;
                case 36:
                    {
                    alt16=6;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalIotlang.g:1240:4: ( (lv_domain_4_0= ruleDomain ) )
            	    {
            	    // InternalIotlang.g:1240:4: ( (lv_domain_4_0= ruleDomain ) )
            	    // InternalIotlang.g:1241:5: (lv_domain_4_0= ruleDomain )
            	    {
            	    // InternalIotlang.g:1241:5: (lv_domain_4_0= ruleDomain )
            	    // InternalIotlang.g:1242:6: lv_domain_4_0= ruleDomain
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getDomainDomainParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    // InternalIotlang.g:1260:4: ( (lv_binds_5_0= ruleBind ) )
            	    {
            	    // InternalIotlang.g:1260:4: ( (lv_binds_5_0= ruleBind ) )
            	    // InternalIotlang.g:1261:5: (lv_binds_5_0= ruleBind )
            	    {
            	    // InternalIotlang.g:1261:5: (lv_binds_5_0= ruleBind )
            	    // InternalIotlang.g:1262:6: lv_binds_5_0= ruleBind
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getBindsBindParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    // InternalIotlang.g:1280:4: ( (lv_thingInstances_6_0= ruleInstanceThing ) )
            	    {
            	    // InternalIotlang.g:1280:4: ( (lv_thingInstances_6_0= ruleInstanceThing ) )
            	    // InternalIotlang.g:1281:5: (lv_thingInstances_6_0= ruleInstanceThing )
            	    {
            	    // InternalIotlang.g:1281:5: (lv_thingInstances_6_0= ruleInstanceThing )
            	    // InternalIotlang.g:1282:6: lv_thingInstances_6_0= ruleInstanceThing
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getThingInstancesInstanceThingParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_thingInstances_6_0=ruleInstanceThing();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"thingInstances",
            	    							lv_thingInstances_6_0,
            	    							"lang.Iotlang.InstanceThing");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIotlang.g:1300:4: ( (lv_channelInstances_7_0= ruleInstanceChannel ) )
            	    {
            	    // InternalIotlang.g:1300:4: ( (lv_channelInstances_7_0= ruleInstanceChannel ) )
            	    // InternalIotlang.g:1301:5: (lv_channelInstances_7_0= ruleInstanceChannel )
            	    {
            	    // InternalIotlang.g:1301:5: (lv_channelInstances_7_0= ruleInstanceChannel )
            	    // InternalIotlang.g:1302:6: lv_channelInstances_7_0= ruleInstanceChannel
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesInstanceChannelParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_channelInstances_7_0=ruleInstanceChannel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"channelInstances",
            	    							lv_channelInstances_7_0,
            	    							"lang.Iotlang.InstanceChannel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIotlang.g:1320:4: (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) )
            	    {
            	    // InternalIotlang.g:1320:4: (otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) ) )
            	    // InternalIotlang.g:1321:5: otherlv_8= 'enforce' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,38,FOLLOW_5); 

            	    					newLeafNode(otherlv_8, grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_4_0());
            	    				
            	    // InternalIotlang.g:1325:5: ( (otherlv_9= RULE_ID ) )
            	    // InternalIotlang.g:1326:6: (otherlv_9= RULE_ID )
            	    {
            	    // InternalIotlang.g:1326:6: (otherlv_9= RULE_ID )
            	    // InternalIotlang.g:1327:7: otherlv_9= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getNetworkConfigurationRule());
            	    							}
            	    						
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    							newLeafNode(otherlv_9, grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_4_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalIotlang.g:1340:4: ( (lv_instancePoliciy_10_0= ruleInstancePolicy ) )
            	    {
            	    // InternalIotlang.g:1340:4: ( (lv_instancePoliciy_10_0= ruleInstancePolicy ) )
            	    // InternalIotlang.g:1341:5: (lv_instancePoliciy_10_0= ruleInstancePolicy )
            	    {
            	    // InternalIotlang.g:1341:5: (lv_instancePoliciy_10_0= ruleInstancePolicy )
            	    // InternalIotlang.g:1342:6: lv_instancePoliciy_10_0= ruleInstancePolicy
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyInstancePolicyParserRuleCall_4_5_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_instancePoliciy_10_0=ruleInstancePolicy();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"instancePoliciy",
            	    							lv_instancePoliciy_10_0,
            	    							"lang.Iotlang.InstancePolicy");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalIotlang.g:1368:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // InternalIotlang.g:1368:45: (iv_ruleBind= ruleBind EOF )
            // InternalIotlang.g:1369:2: iv_ruleBind= ruleBind EOF
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
    // InternalIotlang.g:1375:1: ruleBind returns [EObject current=null] : (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* ) ;
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
            // InternalIotlang.g:1381:2: ( (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:1382:2: (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:1382:2: (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:1383:3: otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBindAccess().getBindKeyword_0());
            		
            // InternalIotlang.g:1387:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_ID) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalIotlang.g:1388:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalIotlang.g:1388:4: (lv_name_1_0= RULE_ID )
                    // InternalIotlang.g:1389:5: lv_name_1_0= RULE_ID
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

            // InternalIotlang.g:1405:3: ( (otherlv_2= RULE_ID ) )
            // InternalIotlang.g:1406:4: (otherlv_2= RULE_ID )
            {
            // InternalIotlang.g:1406:4: (otherlv_2= RULE_ID )
            // InternalIotlang.g:1407:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getBindAccess().getThingInstanceInstanceThingCrossReference_2_0());
            				

            }


            }

            // InternalIotlang.g:1418:3: ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) )
            // InternalIotlang.g:1419:4: ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) )
            {
            // InternalIotlang.g:1419:4: ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) )
            // InternalIotlang.g:1420:5: (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' )
            {
            // InternalIotlang.g:1420:5: (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt18=1;
                }
                break;
            case 41:
                {
                alt18=2;
                }
                break;
            case 42:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalIotlang.g:1421:6: lv_direction_3_1= '=>'
                    {
                    lv_direction_3_1=(Token)match(input,40,FOLLOW_5); 

                    						newLeafNode(lv_direction_3_1, grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:1432:6: lv_direction_3_2= '<=>'
                    {
                    lv_direction_3_2=(Token)match(input,41,FOLLOW_5); 

                    						newLeafNode(lv_direction_3_2, grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalIotlang.g:1443:6: lv_direction_3_3= '<='
                    {
                    lv_direction_3_3=(Token)match(input,42,FOLLOW_5); 

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

            // InternalIotlang.g:1456:3: ( (otherlv_4= RULE_ID ) )
            // InternalIotlang.g:1457:4: (otherlv_4= RULE_ID )
            {
            // InternalIotlang.g:1457:4: (otherlv_4= RULE_ID )
            // InternalIotlang.g:1458:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_4, grammarAccess.getBindAccess().getChannelInstanceInstanceChannelCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getBindAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalIotlang.g:1473:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:1474:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:1474:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:1475:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_6, grammarAccess.getBindAccess().getTopicsTopicCrossReference_6_0());
            				

            }


            }

            // InternalIotlang.g:1486:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIotlang.g:1487:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,43,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getBindAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalIotlang.g:1491:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalIotlang.g:1492:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalIotlang.g:1492:5: (otherlv_8= RULE_ID )
            	    // InternalIotlang.g:1493:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBindRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    						newLeafNode(otherlv_8, grammarAccess.getBindAccess().getTopicsTopicCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getBindAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalIotlang.g:1509:3: ( (lv_annotations_10_0= rulePlatformAnnotation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ANNOTATION_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIotlang.g:1510:4: (lv_annotations_10_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1510:4: (lv_annotations_10_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1511:5: lv_annotations_10_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getBindAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop20;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000020001F2002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000D4C0008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000008000L});

}