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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION_ID", "RULE_STRING_LIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'thing'", "'{'", "'}'", "'channel:pubsub'", "'channel:ptp'", "'policy'", "'port'", "'protocol'", "'message'", "'topic'", "'('", "')'", "'rule'", "'allow'", "'deny'", "':'", "'send'", "'receive'", "'.'", "'message:'", "'domain'", "'instanceThing'", "'['", "']'", "'instancePubSub'", "'over'", "'instancePTP'", "'instancePolicy'", "'networkConfiguration'", "'enforce'", "'bind'", "'=>'", "'<=>'", "'<='", "','", "'connect'"
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
                case 21:
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
                case 20:
                    {
                    alt1=5;
                    }
                    break;
                case 41:
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
    // InternalIotlang.g:264:1: ruleThing returns [EObject current=null] : (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( (lv_ports_4_0= rulePort ) ) otherlv_5= '}' ) ;
    public final EObject ruleThing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotations_2_0 = null;

        EObject lv_ports_4_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:270:2: ( (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( (lv_ports_4_0= rulePort ) ) otherlv_5= '}' ) )
            // InternalIotlang.g:271:2: (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( (lv_ports_4_0= rulePort ) ) otherlv_5= '}' )
            {
            // InternalIotlang.g:271:2: (otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( (lv_ports_4_0= rulePort ) ) otherlv_5= '}' )
            // InternalIotlang.g:272:3: otherlv_0= 'thing' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( (lv_ports_4_0= rulePort ) ) otherlv_5= '}'
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
            		
            // InternalIotlang.g:317:3: ( (lv_ports_4_0= rulePort ) )
            // InternalIotlang.g:318:4: (lv_ports_4_0= rulePort )
            {
            // InternalIotlang.g:318:4: (lv_ports_4_0= rulePort )
            // InternalIotlang.g:319:5: lv_ports_4_0= rulePort
            {

            					newCompositeNode(grammarAccess.getThingAccess().getPortsPortParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_ports_4_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThingRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_4_0,
            						"lang.Iotlang.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getThingAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalIotlang.g:344:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalIotlang.g:344:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalIotlang.g:345:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalIotlang.g:351:1: ruleChannel returns [EObject current=null] : ( ( (lv_pubSub_0_0= rulePubSub ) ) | ( (lv_pointToPoint_1_0= rulePointToPoint ) ) ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        EObject lv_pubSub_0_0 = null;

        EObject lv_pointToPoint_1_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:357:2: ( ( ( (lv_pubSub_0_0= rulePubSub ) ) | ( (lv_pointToPoint_1_0= rulePointToPoint ) ) ) )
            // InternalIotlang.g:358:2: ( ( (lv_pubSub_0_0= rulePubSub ) ) | ( (lv_pointToPoint_1_0= rulePointToPoint ) ) )
            {
            // InternalIotlang.g:358:2: ( ( (lv_pubSub_0_0= rulePubSub ) ) | ( (lv_pointToPoint_1_0= rulePointToPoint ) ) )
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
                    // InternalIotlang.g:359:3: ( (lv_pubSub_0_0= rulePubSub ) )
                    {
                    // InternalIotlang.g:359:3: ( (lv_pubSub_0_0= rulePubSub ) )
                    // InternalIotlang.g:360:4: (lv_pubSub_0_0= rulePubSub )
                    {
                    // InternalIotlang.g:360:4: (lv_pubSub_0_0= rulePubSub )
                    // InternalIotlang.g:361:5: lv_pubSub_0_0= rulePubSub
                    {

                    					newCompositeNode(grammarAccess.getChannelAccess().getPubSubPubSubParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pubSub_0_0=rulePubSub();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChannelRule());
                    					}
                    					add(
                    						current,
                    						"pubSub",
                    						lv_pubSub_0_0,
                    						"lang.Iotlang.PubSub");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:379:3: ( (lv_pointToPoint_1_0= rulePointToPoint ) )
                    {
                    // InternalIotlang.g:379:3: ( (lv_pointToPoint_1_0= rulePointToPoint ) )
                    // InternalIotlang.g:380:4: (lv_pointToPoint_1_0= rulePointToPoint )
                    {
                    // InternalIotlang.g:380:4: (lv_pointToPoint_1_0= rulePointToPoint )
                    // InternalIotlang.g:381:5: lv_pointToPoint_1_0= rulePointToPoint
                    {

                    					newCompositeNode(grammarAccess.getChannelAccess().getPointToPointPointToPointParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pointToPoint_1_0=rulePointToPoint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getChannelRule());
                    					}
                    					add(
                    						current,
                    						"pointToPoint",
                    						lv_pointToPoint_1_0,
                    						"lang.Iotlang.PointToPoint");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // InternalIotlang.g:402:1: entryRulePubSub returns [EObject current=null] : iv_rulePubSub= rulePubSub EOF ;
    public final EObject entryRulePubSub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePubSub = null;


        try {
            // InternalIotlang.g:402:47: (iv_rulePubSub= rulePubSub EOF )
            // InternalIotlang.g:403:2: iv_rulePubSub= rulePubSub EOF
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
    // InternalIotlang.g:409:1: rulePubSub returns [EObject current=null] : (otherlv_0= 'channel:pubsub' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' ) ;
    public final EObject rulePubSub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_hasTopics_3_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:415:2: ( (otherlv_0= 'channel:pubsub' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' ) )
            // InternalIotlang.g:416:2: (otherlv_0= 'channel:pubsub' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' )
            {
            // InternalIotlang.g:416:2: (otherlv_0= 'channel:pubsub' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}' )
            // InternalIotlang.g:417:3: otherlv_0= 'channel:pubsub' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasTopics_3_0= ruleTopic ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPubSubAccess().getChannelPubsubKeyword_0());
            		
            // InternalIotlang.g:421:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:422:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:422:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:423:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPubSubAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIotlang.g:443:3: ( (lv_hasTopics_3_0= ruleTopic ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIotlang.g:444:4: (lv_hasTopics_3_0= ruleTopic )
            	    {
            	    // InternalIotlang.g:444:4: (lv_hasTopics_3_0= ruleTopic )
            	    // InternalIotlang.g:445:5: lv_hasTopics_3_0= ruleTopic
            	    {

            	    					newCompositeNode(grammarAccess.getPubSubAccess().getHasTopicsTopicParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // InternalIotlang.g:470:1: entryRulePointToPoint returns [EObject current=null] : iv_rulePointToPoint= rulePointToPoint EOF ;
    public final EObject entryRulePointToPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointToPoint = null;


        try {
            // InternalIotlang.g:470:53: (iv_rulePointToPoint= rulePointToPoint EOF )
            // InternalIotlang.g:471:2: iv_rulePointToPoint= rulePointToPoint EOF
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
    // InternalIotlang.g:477:1: rulePointToPoint returns [EObject current=null] : (otherlv_0= 'channel:ptp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject rulePointToPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalIotlang.g:483:2: ( (otherlv_0= 'channel:ptp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalIotlang.g:484:2: (otherlv_0= 'channel:ptp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalIotlang.g:484:2: (otherlv_0= 'channel:ptp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalIotlang.g:485:3: otherlv_0= 'channel:ptp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPointToPointAccess().getChannelPtpKeyword_0());
            		
            // InternalIotlang.g:489:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:490:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:490:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:491:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPointToPointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPointToPointAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalIotlang.g:519:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalIotlang.g:519:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalIotlang.g:520:2: iv_rulePolicy= rulePolicy EOF
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
    // InternalIotlang.g:526:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasRules_3_0= ruleRule ) )* otherlv_4= '}' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_hasRules_3_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:532:2: ( (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasRules_3_0= ruleRule ) )* otherlv_4= '}' ) )
            // InternalIotlang.g:533:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasRules_3_0= ruleRule ) )* otherlv_4= '}' )
            {
            // InternalIotlang.g:533:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasRules_3_0= ruleRule ) )* otherlv_4= '}' )
            // InternalIotlang.g:534:3: otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hasRules_3_0= ruleRule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalIotlang.g:538:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:539:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:539:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:540:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIotlang.g:560:3: ( (lv_hasRules_3_0= ruleRule ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIotlang.g:561:4: (lv_hasRules_3_0= ruleRule )
            	    {
            	    // InternalIotlang.g:561:4: (lv_hasRules_3_0= ruleRule )
            	    // InternalIotlang.g:562:5: lv_hasRules_3_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getPolicyAccess().getHasRulesRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop5;
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


    // $ANTLR start "entryRulePort"
    // InternalIotlang.g:587:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalIotlang.g:587:45: (iv_rulePort= rulePort EOF )
            // InternalIotlang.g:588:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalIotlang.g:594:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIotlang.g:600:2: ( (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIotlang.g:601:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIotlang.g:601:2: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIotlang.g:602:3: otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
            		
            // InternalIotlang.g:606:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:607:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:607:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:608:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleProtocol"
    // InternalIotlang.g:628:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalIotlang.g:628:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalIotlang.g:629:2: iv_ruleProtocol= ruleProtocol EOF
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
    // InternalIotlang.g:635:1: ruleProtocol returns [EObject current=null] : (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIotlang.g:641:2: ( (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIotlang.g:642:2: (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIotlang.g:642:2: (otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIotlang.g:643:3: otherlv_0= 'protocol' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getProtocolKeyword_0());
            		
            // InternalIotlang.g:647:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:648:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:648:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:649:5: lv_name_1_0= RULE_ID
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
    // InternalIotlang.g:669:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalIotlang.g:669:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalIotlang.g:670:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalIotlang.g:676:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIotlang.g:682:2: ( (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIotlang.g:683:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIotlang.g:683:2: (otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIotlang.g:684:3: otherlv_0= 'message' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
            		
            // InternalIotlang.g:688:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:689:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:689:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:690:5: lv_name_1_0= RULE_ID
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
    // InternalIotlang.g:710:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalIotlang.g:710:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalIotlang.g:711:2: iv_ruleTopic= ruleTopic EOF
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
    // InternalIotlang.g:717:1: ruleTopic returns [EObject current=null] : (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalIotlang.g:723:2: ( (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalIotlang.g:724:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalIotlang.g:724:2: (otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // InternalIotlang.g:725:3: otherlv_0= 'topic' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTopicAccess().getTopicKeyword_0());
            		
            // InternalIotlang.g:729:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:730:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:730:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:731:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTopicAccess().getLeftParenthesisKeyword_2());
            		
            // InternalIotlang.g:751:3: ( (otherlv_3= RULE_ID ) )
            // InternalIotlang.g:752:4: (otherlv_3= RULE_ID )
            {
            // InternalIotlang.g:752:4: (otherlv_3= RULE_ID )
            // InternalIotlang.g:753:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getTopicAccess().getAcceptedMessagesMessageCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

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
    // InternalIotlang.g:772:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalIotlang.g:772:45: (iv_ruleRule= ruleRule EOF )
            // InternalIotlang.g:773:2: iv_ruleRule= ruleRule EOF
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
    // InternalIotlang.g:779:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'message:' ( (otherlv_10= RULE_ID ) ) ) ) ) ;
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
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalIotlang.g:785:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'message:' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            // InternalIotlang.g:786:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'message:' ( (otherlv_10= RULE_ID ) ) ) ) )
            {
            // InternalIotlang.g:786:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'message:' ( (otherlv_10= RULE_ID ) ) ) ) )
            // InternalIotlang.g:787:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) ) otherlv_4= ':' ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) ) ( ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'message:' ( (otherlv_10= RULE_ID ) ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalIotlang.g:791:3: ( (lv_name_1_0= RULE_ID ) )?
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
                    // InternalIotlang.g:792:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalIotlang.g:792:4: (lv_name_1_0= RULE_ID )
                    // InternalIotlang.g:793:5: lv_name_1_0= RULE_ID
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

            // InternalIotlang.g:809:3: ( (otherlv_2= RULE_ID ) )
            // InternalIotlang.g:810:4: (otherlv_2= RULE_ID )
            {
            // InternalIotlang.g:810:4: (otherlv_2= RULE_ID )
            // InternalIotlang.g:811:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getSubjectThingCrossReference_2_0());
            				

            }


            }

            // InternalIotlang.g:822:3: ( ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) ) )
            // InternalIotlang.g:823:4: ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) )
            {
            // InternalIotlang.g:823:4: ( (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' ) )
            // InternalIotlang.g:824:5: (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' )
            {
            // InternalIotlang.g:824:5: (lv_permission_3_1= 'allow' | lv_permission_3_2= 'deny' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIotlang.g:825:6: lv_permission_3_1= 'allow'
                    {
                    lv_permission_3_1=(Token)match(input,26,FOLLOW_15); 

                    						newLeafNode(lv_permission_3_1, grammarAccess.getRuleAccess().getPermissionAllowKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "permission", lv_permission_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:836:6: lv_permission_3_2= 'deny'
                    {
                    lv_permission_3_2=(Token)match(input,27,FOLLOW_15); 

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

            otherlv_4=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getColonKeyword_4());
            		
            // InternalIotlang.g:853:3: ( ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) ) )
            // InternalIotlang.g:854:4: ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) )
            {
            // InternalIotlang.g:854:4: ( (lv_action_5_1= 'send' | lv_action_5_2= 'receive' ) )
            // InternalIotlang.g:855:5: (lv_action_5_1= 'send' | lv_action_5_2= 'receive' )
            {
            // InternalIotlang.g:855:5: (lv_action_5_1= 'send' | lv_action_5_2= 'receive' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalIotlang.g:856:6: lv_action_5_1= 'send'
                    {
                    lv_action_5_1=(Token)match(input,29,FOLLOW_17); 

                    						newLeafNode(lv_action_5_1, grammarAccess.getRuleAccess().getActionSendKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "action", lv_action_5_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:867:6: lv_action_5_2= 'receive'
                    {
                    lv_action_5_2=(Token)match(input,30,FOLLOW_17); 

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

            // InternalIotlang.g:880:3: ( ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'message:' ( (otherlv_10= RULE_ID ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIotlang.g:881:4: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* )
                    {
                    // InternalIotlang.g:881:4: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* )
                    // InternalIotlang.g:882:5: ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    // InternalIotlang.g:882:5: ( (otherlv_6= RULE_ID ) )
                    // InternalIotlang.g:883:6: (otherlv_6= RULE_ID )
                    {
                    // InternalIotlang.g:883:6: (otherlv_6= RULE_ID )
                    // InternalIotlang.g:884:7: otherlv_6= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRuleRule());
                    							}
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_18); 

                    							newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getObjectThingCrossReference_6_0_0_0());
                    						

                    }


                    }

                    // InternalIotlang.g:895:5: (otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==31) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalIotlang.g:896:6: otherlv_7= '.' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,31,FOLLOW_5); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getFullStopKeyword_6_0_1_0());
                    	    					
                    	    // InternalIotlang.g:900:6: ( (otherlv_8= RULE_ID ) )
                    	    // InternalIotlang.g:901:7: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalIotlang.g:901:7: (otherlv_8= RULE_ID )
                    	    // InternalIotlang.g:902:8: otherlv_8= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getRuleRule());
                    	    								}
                    	    							
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    								newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getPortsPortCrossReference_6_0_1_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:916:4: (otherlv_9= 'message:' ( (otherlv_10= RULE_ID ) ) )
                    {
                    // InternalIotlang.g:916:4: (otherlv_9= 'message:' ( (otherlv_10= RULE_ID ) ) )
                    // InternalIotlang.g:917:5: otherlv_9= 'message:' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_5); 

                    					newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getMessageKeyword_6_1_0());
                    				
                    // InternalIotlang.g:921:5: ( (otherlv_10= RULE_ID ) )
                    // InternalIotlang.g:922:6: (otherlv_10= RULE_ID )
                    {
                    // InternalIotlang.g:922:6: (otherlv_10= RULE_ID )
                    // InternalIotlang.g:923:7: otherlv_10= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRuleRule());
                    							}
                    						
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getObjectMessageMessageCrossReference_6_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // InternalIotlang.g:940:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalIotlang.g:940:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalIotlang.g:941:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalIotlang.g:947:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIotlang.g:953:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) ) )
            // InternalIotlang.g:954:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) )
            {
            // InternalIotlang.g:954:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) ) )
            // InternalIotlang.g:955:3: otherlv_0= 'domain' ( (lv_name_1_0= RULE_STRING_LIT ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalIotlang.g:959:3: ( (lv_name_1_0= RULE_STRING_LIT ) )
            // InternalIotlang.g:960:4: (lv_name_1_0= RULE_STRING_LIT )
            {
            // InternalIotlang.g:960:4: (lv_name_1_0= RULE_STRING_LIT )
            // InternalIotlang.g:961:5: lv_name_1_0= RULE_STRING_LIT
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
    // InternalIotlang.g:981:1: entryRuleInstanceThing returns [EObject current=null] : iv_ruleInstanceThing= ruleInstanceThing EOF ;
    public final EObject entryRuleInstanceThing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceThing = null;


        try {
            // InternalIotlang.g:981:54: (iv_ruleInstanceThing= ruleInstanceThing EOF )
            // InternalIotlang.g:982:2: iv_ruleInstanceThing= ruleInstanceThing EOF
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
    // InternalIotlang.g:988:1: ruleInstanceThing returns [EObject current=null] : (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) ;
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
            // InternalIotlang.g:994:2: ( (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:995:2: (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:995:2: (otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:996:3: otherlv_0= 'instanceThing' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceThingAccess().getInstanceThingKeyword_0());
            		
            // InternalIotlang.g:1000:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:1001:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:1001:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:1002:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalIotlang.g:1018:3: (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIotlang.g:1019:4: otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInstanceThingAccess().getLeftSquareBracketKeyword_2_0());
            	    			
            	    // InternalIotlang.g:1023:4: ( (lv_number_3_0= RULE_INT ) )
            	    // InternalIotlang.g:1024:5: (lv_number_3_0= RULE_INT )
            	    {
            	    // InternalIotlang.g:1024:5: (lv_number_3_0= RULE_INT )
            	    // InternalIotlang.g:1025:6: lv_number_3_0= RULE_INT
            	    {
            	    lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

            	    otherlv_4=(Token)match(input,36,FOLLOW_19); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInstanceThingAccess().getRightSquareBracketKeyword_2_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getInstanceThingAccess().getColonKeyword_3());
            		
            // InternalIotlang.g:1050:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:1051:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:1051:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:1052:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceThingRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_6, grammarAccess.getInstanceThingAccess().getTypeThingThingCrossReference_4_0());
            				

            }


            }

            // InternalIotlang.g:1063:3: ( (lv_annotations_7_0= rulePlatformAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ANNOTATION_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIotlang.g:1064:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1064:4: (lv_annotations_7_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1065:5: lv_annotations_7_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInstanceThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
    // $ANTLR end "ruleInstanceThing"


    // $ANTLR start "entryRuleInstancePubSub"
    // InternalIotlang.g:1086:1: entryRuleInstancePubSub returns [EObject current=null] : iv_ruleInstancePubSub= ruleInstancePubSub EOF ;
    public final EObject entryRuleInstancePubSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstancePubSub = null;


        try {
            // InternalIotlang.g:1086:55: (iv_ruleInstancePubSub= ruleInstancePubSub EOF )
            // InternalIotlang.g:1087:2: iv_ruleInstancePubSub= ruleInstancePubSub EOF
            {
             newCompositeNode(grammarAccess.getInstancePubSubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstancePubSub=ruleInstancePubSub();

            state._fsp--;

             current =iv_ruleInstancePubSub; 
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
    // $ANTLR end "entryRuleInstancePubSub"


    // $ANTLR start "ruleInstancePubSub"
    // InternalIotlang.g:1093:1: ruleInstancePubSub returns [EObject current=null] : (otherlv_0= 'instancePubSub' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleInstancePubSub() throws RecognitionException {
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
            // InternalIotlang.g:1099:2: ( (otherlv_0= 'instancePubSub' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:1100:2: (otherlv_0= 'instancePubSub' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:1100:2: (otherlv_0= 'instancePubSub' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:1101:3: otherlv_0= 'instancePubSub' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstancePubSubAccess().getInstancePubSubKeyword_0());
            		
            // InternalIotlang.g:1105:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:1106:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:1106:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:1107:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInstancePubSubAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstancePubSubRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIotlang.g:1123:3: (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIotlang.g:1124:4: otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInstancePubSubAccess().getLeftSquareBracketKeyword_2_0());
            	    			
            	    // InternalIotlang.g:1128:4: ( (lv_number_3_0= RULE_INT ) )
            	    // InternalIotlang.g:1129:5: (lv_number_3_0= RULE_INT )
            	    {
            	    // InternalIotlang.g:1129:5: (lv_number_3_0= RULE_INT )
            	    // InternalIotlang.g:1130:6: lv_number_3_0= RULE_INT
            	    {
            	    lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            	    						newLeafNode(lv_number_3_0, grammarAccess.getInstancePubSubAccess().getNumberINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInstancePubSubRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"number",
            	    							lv_number_3_0,
            	    							"lang.Iotlang.INT");
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,36,FOLLOW_19); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInstancePubSubAccess().getRightSquareBracketKeyword_2_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getInstancePubSubAccess().getColonKeyword_3());
            		
            // InternalIotlang.g:1155:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:1156:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:1156:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:1157:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstancePubSubRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_6, grammarAccess.getInstancePubSubAccess().getTypeChannelPubSubCrossReference_4_0());
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getInstancePubSubAccess().getOverKeyword_5());
            		
            // InternalIotlang.g:1172:3: ( (otherlv_8= RULE_ID ) )
            // InternalIotlang.g:1173:4: (otherlv_8= RULE_ID )
            {
            // InternalIotlang.g:1173:4: (otherlv_8= RULE_ID )
            // InternalIotlang.g:1174:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstancePubSubRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_8, grammarAccess.getInstancePubSubAccess().getOverProtocolProtocolCrossReference_6_0());
            				

            }


            }

            // InternalIotlang.g:1185:3: ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ANNOTATION_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIotlang.g:1186:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1186:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1187:5: lv_annotations_9_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInstancePubSubAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_9_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstancePubSubRule());
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
    // $ANTLR end "ruleInstancePubSub"


    // $ANTLR start "entryRuleInstancePtP"
    // InternalIotlang.g:1208:1: entryRuleInstancePtP returns [EObject current=null] : iv_ruleInstancePtP= ruleInstancePtP EOF ;
    public final EObject entryRuleInstancePtP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstancePtP = null;


        try {
            // InternalIotlang.g:1208:52: (iv_ruleInstancePtP= ruleInstancePtP EOF )
            // InternalIotlang.g:1209:2: iv_ruleInstancePtP= ruleInstancePtP EOF
            {
             newCompositeNode(grammarAccess.getInstancePtPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstancePtP=ruleInstancePtP();

            state._fsp--;

             current =iv_ruleInstancePtP; 
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
    // $ANTLR end "entryRuleInstancePtP"


    // $ANTLR start "ruleInstancePtP"
    // InternalIotlang.g:1215:1: ruleInstancePtP returns [EObject current=null] : (otherlv_0= 'instancePTP' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleInstancePtP() throws RecognitionException {
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
            // InternalIotlang.g:1221:2: ( (otherlv_0= 'instancePTP' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:1222:2: (otherlv_0= 'instancePTP' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:1222:2: (otherlv_0= 'instancePTP' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:1223:3: otherlv_0= 'instancePTP' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )* otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'over' ( (otherlv_8= RULE_ID ) ) ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstancePtPAccess().getInstancePTPKeyword_0());
            		
            // InternalIotlang.g:1227:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:1228:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:1228:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:1229:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInstancePtPAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstancePtPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIotlang.g:1245:3: (otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIotlang.g:1246:4: otherlv_2= '[' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInstancePtPAccess().getLeftSquareBracketKeyword_2_0());
            	    			
            	    // InternalIotlang.g:1250:4: ( (lv_number_3_0= RULE_INT ) )
            	    // InternalIotlang.g:1251:5: (lv_number_3_0= RULE_INT )
            	    {
            	    // InternalIotlang.g:1251:5: (lv_number_3_0= RULE_INT )
            	    // InternalIotlang.g:1252:6: lv_number_3_0= RULE_INT
            	    {
            	    lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            	    						newLeafNode(lv_number_3_0, grammarAccess.getInstancePtPAccess().getNumberINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInstancePtPRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"number",
            	    							lv_number_3_0,
            	    							"lang.Iotlang.INT");
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,36,FOLLOW_19); 

            	    				newLeafNode(otherlv_4, grammarAccess.getInstancePtPAccess().getRightSquareBracketKeyword_2_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getInstancePtPAccess().getColonKeyword_3());
            		
            // InternalIotlang.g:1277:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:1278:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:1278:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:1279:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstancePtPRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_6, grammarAccess.getInstancePtPAccess().getTypeChannelPointToPointCrossReference_4_0());
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getInstancePtPAccess().getOverKeyword_5());
            		
            // InternalIotlang.g:1294:3: ( (otherlv_8= RULE_ID ) )
            // InternalIotlang.g:1295:4: (otherlv_8= RULE_ID )
            {
            // InternalIotlang.g:1295:4: (otherlv_8= RULE_ID )
            // InternalIotlang.g:1296:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstancePtPRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_8, grammarAccess.getInstancePtPAccess().getOverProtocolProtocolCrossReference_6_0());
            				

            }


            }

            // InternalIotlang.g:1307:3: ( (lv_annotations_9_0= rulePlatformAnnotation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ANNOTATION_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIotlang.g:1308:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1308:4: (lv_annotations_9_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1309:5: lv_annotations_9_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInstancePtPAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_9_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstancePtPRule());
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
            	    break loop16;
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
    // $ANTLR end "ruleInstancePtP"


    // $ANTLR start "entryRuleInstanceChannel"
    // InternalIotlang.g:1330:1: entryRuleInstanceChannel returns [EObject current=null] : iv_ruleInstanceChannel= ruleInstanceChannel EOF ;
    public final EObject entryRuleInstanceChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceChannel = null;


        try {
            // InternalIotlang.g:1330:56: (iv_ruleInstanceChannel= ruleInstanceChannel EOF )
            // InternalIotlang.g:1331:2: iv_ruleInstanceChannel= ruleInstanceChannel EOF
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
    // InternalIotlang.g:1337:1: ruleInstanceChannel returns [EObject current=null] : ( ( (lv_instancesPubSub_0_0= ruleInstancePubSub ) ) | ( (lv_instancesPtp_1_0= ruleInstancePtP ) ) ) ;
    public final EObject ruleInstanceChannel() throws RecognitionException {
        EObject current = null;

        EObject lv_instancesPubSub_0_0 = null;

        EObject lv_instancesPtp_1_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:1343:2: ( ( ( (lv_instancesPubSub_0_0= ruleInstancePubSub ) ) | ( (lv_instancesPtp_1_0= ruleInstancePtP ) ) ) )
            // InternalIotlang.g:1344:2: ( ( (lv_instancesPubSub_0_0= ruleInstancePubSub ) ) | ( (lv_instancesPtp_1_0= ruleInstancePtP ) ) )
            {
            // InternalIotlang.g:1344:2: ( ( (lv_instancesPubSub_0_0= ruleInstancePubSub ) ) | ( (lv_instancesPtp_1_0= ruleInstancePtP ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            else if ( (LA17_0==39) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalIotlang.g:1345:3: ( (lv_instancesPubSub_0_0= ruleInstancePubSub ) )
                    {
                    // InternalIotlang.g:1345:3: ( (lv_instancesPubSub_0_0= ruleInstancePubSub ) )
                    // InternalIotlang.g:1346:4: (lv_instancesPubSub_0_0= ruleInstancePubSub )
                    {
                    // InternalIotlang.g:1346:4: (lv_instancesPubSub_0_0= ruleInstancePubSub )
                    // InternalIotlang.g:1347:5: lv_instancesPubSub_0_0= ruleInstancePubSub
                    {

                    					newCompositeNode(grammarAccess.getInstanceChannelAccess().getInstancesPubSubInstancePubSubParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_instancesPubSub_0_0=ruleInstancePubSub();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstanceChannelRule());
                    					}
                    					add(
                    						current,
                    						"instancesPubSub",
                    						lv_instancesPubSub_0_0,
                    						"lang.Iotlang.InstancePubSub");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIotlang.g:1365:3: ( (lv_instancesPtp_1_0= ruleInstancePtP ) )
                    {
                    // InternalIotlang.g:1365:3: ( (lv_instancesPtp_1_0= ruleInstancePtP ) )
                    // InternalIotlang.g:1366:4: (lv_instancesPtp_1_0= ruleInstancePtP )
                    {
                    // InternalIotlang.g:1366:4: (lv_instancesPtp_1_0= ruleInstancePtP )
                    // InternalIotlang.g:1367:5: lv_instancesPtp_1_0= ruleInstancePtP
                    {

                    					newCompositeNode(grammarAccess.getInstanceChannelAccess().getInstancesPtpInstancePtPParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_instancesPtp_1_0=ruleInstancePtP();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstanceChannelRule());
                    					}
                    					add(
                    						current,
                    						"instancesPtp",
                    						lv_instancesPtp_1_0,
                    						"lang.Iotlang.InstancePtP");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleInstanceChannel"


    // $ANTLR start "entryRuleInstancePolicy"
    // InternalIotlang.g:1388:1: entryRuleInstancePolicy returns [EObject current=null] : iv_ruleInstancePolicy= ruleInstancePolicy EOF ;
    public final EObject entryRuleInstancePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstancePolicy = null;


        try {
            // InternalIotlang.g:1388:55: (iv_ruleInstancePolicy= ruleInstancePolicy EOF )
            // InternalIotlang.g:1389:2: iv_ruleInstancePolicy= ruleInstancePolicy EOF
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
    // InternalIotlang.g:1395:1: ruleInstancePolicy returns [EObject current=null] : (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleInstancePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_annotations_4_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:1401:2: ( (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:1402:2: (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:1402:2: (otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:1403:3: otherlv_0= 'instancePolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInstancePolicyAccess().getInstancePolicyKeyword_0());
            		
            // InternalIotlang.g:1407:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:1408:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:1408:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:1409:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInstancePolicyAccess().getColonKeyword_2());
            		
            // InternalIotlang.g:1429:3: ( (otherlv_3= RULE_ID ) )
            // InternalIotlang.g:1430:4: (otherlv_3= RULE_ID )
            {
            // InternalIotlang.g:1430:4: (otherlv_3= RULE_ID )
            // InternalIotlang.g:1431:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstancePolicyRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_3, grammarAccess.getInstancePolicyAccess().getTypePolicyPolicyCrossReference_3_0());
            				

            }


            }

            // InternalIotlang.g:1442:3: ( (lv_annotations_4_0= rulePlatformAnnotation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ANNOTATION_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIotlang.g:1443:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1443:4: (lv_annotations_4_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1444:5: lv_annotations_4_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInstancePolicyAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
            	    break loop18;
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
    // InternalIotlang.g:1465:1: entryRuleNetworkConfiguration returns [EObject current=null] : iv_ruleNetworkConfiguration= ruleNetworkConfiguration EOF ;
    public final EObject entryRuleNetworkConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkConfiguration = null;


        try {
            // InternalIotlang.g:1465:61: (iv_ruleNetworkConfiguration= ruleNetworkConfiguration EOF )
            // InternalIotlang.g:1466:2: iv_ruleNetworkConfiguration= ruleNetworkConfiguration EOF
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
    // InternalIotlang.g:1472:1: ruleNetworkConfiguration returns [EObject current=null] : (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_connects_4_0= ruleConnect ) ) | ( (lv_domain_5_0= ruleDomain ) ) | ( (lv_binds_6_0= ruleBind ) ) | ( (lv_thingInstances_7_0= ruleInstanceThing ) ) | ( (lv_channelInstances_8_0= ruleInstanceChannel ) ) | (otherlv_9= 'enforce' ( (otherlv_10= RULE_ID ) ) ) | ( (lv_instancePoliciy_11_0= ruleInstancePolicy ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleNetworkConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_annotations_2_0 = null;

        EObject lv_connects_4_0 = null;

        EObject lv_domain_5_0 = null;

        EObject lv_binds_6_0 = null;

        EObject lv_thingInstances_7_0 = null;

        EObject lv_channelInstances_8_0 = null;

        EObject lv_instancePoliciy_11_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:1478:2: ( (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_connects_4_0= ruleConnect ) ) | ( (lv_domain_5_0= ruleDomain ) ) | ( (lv_binds_6_0= ruleBind ) ) | ( (lv_thingInstances_7_0= ruleInstanceThing ) ) | ( (lv_channelInstances_8_0= ruleInstanceChannel ) ) | (otherlv_9= 'enforce' ( (otherlv_10= RULE_ID ) ) ) | ( (lv_instancePoliciy_11_0= ruleInstancePolicy ) ) )* otherlv_12= '}' ) )
            // InternalIotlang.g:1479:2: (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_connects_4_0= ruleConnect ) ) | ( (lv_domain_5_0= ruleDomain ) ) | ( (lv_binds_6_0= ruleBind ) ) | ( (lv_thingInstances_7_0= ruleInstanceThing ) ) | ( (lv_channelInstances_8_0= ruleInstanceChannel ) ) | (otherlv_9= 'enforce' ( (otherlv_10= RULE_ID ) ) ) | ( (lv_instancePoliciy_11_0= ruleInstancePolicy ) ) )* otherlv_12= '}' )
            {
            // InternalIotlang.g:1479:2: (otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_connects_4_0= ruleConnect ) ) | ( (lv_domain_5_0= ruleDomain ) ) | ( (lv_binds_6_0= ruleBind ) ) | ( (lv_thingInstances_7_0= ruleInstanceThing ) ) | ( (lv_channelInstances_8_0= ruleInstanceChannel ) ) | (otherlv_9= 'enforce' ( (otherlv_10= RULE_ID ) ) ) | ( (lv_instancePoliciy_11_0= ruleInstancePolicy ) ) )* otherlv_12= '}' )
            // InternalIotlang.g:1480:3: otherlv_0= 'networkConfiguration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_annotations_2_0= rulePlatformAnnotation ) )* otherlv_3= '{' ( ( (lv_connects_4_0= ruleConnect ) ) | ( (lv_domain_5_0= ruleDomain ) ) | ( (lv_binds_6_0= ruleBind ) ) | ( (lv_thingInstances_7_0= ruleInstanceThing ) ) | ( (lv_channelInstances_8_0= ruleInstanceChannel ) ) | (otherlv_9= 'enforce' ( (otherlv_10= RULE_ID ) ) ) | ( (lv_instancePoliciy_11_0= ruleInstancePolicy ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationKeyword_0());
            		
            // InternalIotlang.g:1484:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIotlang.g:1485:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIotlang.g:1485:4: (lv_name_1_0= RULE_ID )
            // InternalIotlang.g:1486:5: lv_name_1_0= RULE_ID
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

            // InternalIotlang.g:1502:3: ( (lv_annotations_2_0= rulePlatformAnnotation ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ANNOTATION_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIotlang.g:1503:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1503:4: (lv_annotations_2_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1504:5: lv_annotations_2_0= rulePlatformAnnotation
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
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkConfigurationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalIotlang.g:1525:3: ( ( (lv_connects_4_0= ruleConnect ) ) | ( (lv_domain_5_0= ruleDomain ) ) | ( (lv_binds_6_0= ruleBind ) ) | ( (lv_thingInstances_7_0= ruleInstanceThing ) ) | ( (lv_channelInstances_8_0= ruleInstanceChannel ) ) | (otherlv_9= 'enforce' ( (otherlv_10= RULE_ID ) ) ) | ( (lv_instancePoliciy_11_0= ruleInstancePolicy ) ) )*
            loop20:
            do {
                int alt20=8;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    alt20=1;
                    }
                    break;
                case 33:
                    {
                    alt20=2;
                    }
                    break;
                case 43:
                    {
                    alt20=3;
                    }
                    break;
                case 34:
                    {
                    alt20=4;
                    }
                    break;
                case 37:
                case 39:
                    {
                    alt20=5;
                    }
                    break;
                case 42:
                    {
                    alt20=6;
                    }
                    break;
                case 40:
                    {
                    alt20=7;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalIotlang.g:1526:4: ( (lv_connects_4_0= ruleConnect ) )
            	    {
            	    // InternalIotlang.g:1526:4: ( (lv_connects_4_0= ruleConnect ) )
            	    // InternalIotlang.g:1527:5: (lv_connects_4_0= ruleConnect )
            	    {
            	    // InternalIotlang.g:1527:5: (lv_connects_4_0= ruleConnect )
            	    // InternalIotlang.g:1528:6: lv_connects_4_0= ruleConnect
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getConnectsConnectParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_connects_4_0=ruleConnect();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connects",
            	    							lv_connects_4_0,
            	    							"lang.Iotlang.Connect");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIotlang.g:1546:4: ( (lv_domain_5_0= ruleDomain ) )
            	    {
            	    // InternalIotlang.g:1546:4: ( (lv_domain_5_0= ruleDomain ) )
            	    // InternalIotlang.g:1547:5: (lv_domain_5_0= ruleDomain )
            	    {
            	    // InternalIotlang.g:1547:5: (lv_domain_5_0= ruleDomain )
            	    // InternalIotlang.g:1548:6: lv_domain_5_0= ruleDomain
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getDomainDomainParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_domain_5_0=ruleDomain();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"domain",
            	    							lv_domain_5_0,
            	    							"lang.Iotlang.Domain");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIotlang.g:1566:4: ( (lv_binds_6_0= ruleBind ) )
            	    {
            	    // InternalIotlang.g:1566:4: ( (lv_binds_6_0= ruleBind ) )
            	    // InternalIotlang.g:1567:5: (lv_binds_6_0= ruleBind )
            	    {
            	    // InternalIotlang.g:1567:5: (lv_binds_6_0= ruleBind )
            	    // InternalIotlang.g:1568:6: lv_binds_6_0= ruleBind
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getBindsBindParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_binds_6_0=ruleBind();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"binds",
            	    							lv_binds_6_0,
            	    							"lang.Iotlang.Bind");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIotlang.g:1586:4: ( (lv_thingInstances_7_0= ruleInstanceThing ) )
            	    {
            	    // InternalIotlang.g:1586:4: ( (lv_thingInstances_7_0= ruleInstanceThing ) )
            	    // InternalIotlang.g:1587:5: (lv_thingInstances_7_0= ruleInstanceThing )
            	    {
            	    // InternalIotlang.g:1587:5: (lv_thingInstances_7_0= ruleInstanceThing )
            	    // InternalIotlang.g:1588:6: lv_thingInstances_7_0= ruleInstanceThing
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getThingInstancesInstanceThingParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_thingInstances_7_0=ruleInstanceThing();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"thingInstances",
            	    							lv_thingInstances_7_0,
            	    							"lang.Iotlang.InstanceThing");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIotlang.g:1606:4: ( (lv_channelInstances_8_0= ruleInstanceChannel ) )
            	    {
            	    // InternalIotlang.g:1606:4: ( (lv_channelInstances_8_0= ruleInstanceChannel ) )
            	    // InternalIotlang.g:1607:5: (lv_channelInstances_8_0= ruleInstanceChannel )
            	    {
            	    // InternalIotlang.g:1607:5: (lv_channelInstances_8_0= ruleInstanceChannel )
            	    // InternalIotlang.g:1608:6: lv_channelInstances_8_0= ruleInstanceChannel
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getChannelInstancesInstanceChannelParserRuleCall_4_4_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_channelInstances_8_0=ruleInstanceChannel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"channelInstances",
            	    							lv_channelInstances_8_0,
            	    							"lang.Iotlang.InstanceChannel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalIotlang.g:1626:4: (otherlv_9= 'enforce' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    // InternalIotlang.g:1626:4: (otherlv_9= 'enforce' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalIotlang.g:1627:5: otherlv_9= 'enforce' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,42,FOLLOW_5); 

            	    					newLeafNode(otherlv_9, grammarAccess.getNetworkConfigurationAccess().getEnforceKeyword_4_5_0());
            	    				
            	    // InternalIotlang.g:1631:5: ( (otherlv_10= RULE_ID ) )
            	    // InternalIotlang.g:1632:6: (otherlv_10= RULE_ID )
            	    {
            	    // InternalIotlang.g:1632:6: (otherlv_10= RULE_ID )
            	    // InternalIotlang.g:1633:7: otherlv_10= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getNetworkConfigurationRule());
            	    							}
            	    						
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    							newLeafNode(otherlv_10, grammarAccess.getNetworkConfigurationAccess().getEnforcesInstancePolicyCrossReference_4_5_1_0());
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalIotlang.g:1646:4: ( (lv_instancePoliciy_11_0= ruleInstancePolicy ) )
            	    {
            	    // InternalIotlang.g:1646:4: ( (lv_instancePoliciy_11_0= ruleInstancePolicy ) )
            	    // InternalIotlang.g:1647:5: (lv_instancePoliciy_11_0= ruleInstancePolicy )
            	    {
            	    // InternalIotlang.g:1647:5: (lv_instancePoliciy_11_0= ruleInstancePolicy )
            	    // InternalIotlang.g:1648:6: lv_instancePoliciy_11_0= ruleInstancePolicy
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkConfigurationAccess().getInstancePoliciyInstancePolicyParserRuleCall_4_6_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_instancePoliciy_11_0=ruleInstancePolicy();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkConfigurationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"instancePoliciy",
            	    							lv_instancePoliciy_11_0,
            	    							"lang.Iotlang.InstancePolicy");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getNetworkConfigurationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalIotlang.g:1674:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // InternalIotlang.g:1674:45: (iv_ruleBind= ruleBind EOF )
            // InternalIotlang.g:1675:2: iv_ruleBind= ruleBind EOF
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
    // InternalIotlang.g:1681:1: ruleBind returns [EObject current=null] : (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* ) ;
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
            // InternalIotlang.g:1687:2: ( (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:1688:2: (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:1688:2: (otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:1689:3: otherlv_0= 'bind' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' ( (lv_annotations_10_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBindAccess().getBindKeyword_0());
            		
            // InternalIotlang.g:1693:3: ( (lv_name_1_0= RULE_ID ) )?
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
                    // InternalIotlang.g:1694:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalIotlang.g:1694:4: (lv_name_1_0= RULE_ID )
                    // InternalIotlang.g:1695:5: lv_name_1_0= RULE_ID
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

            // InternalIotlang.g:1711:3: ( (otherlv_2= RULE_ID ) )
            // InternalIotlang.g:1712:4: (otherlv_2= RULE_ID )
            {
            // InternalIotlang.g:1712:4: (otherlv_2= RULE_ID )
            // InternalIotlang.g:1713:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getBindAccess().getThingInstanceInstanceThingCrossReference_2_0());
            				

            }


            }

            // InternalIotlang.g:1724:3: ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) )
            // InternalIotlang.g:1725:4: ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) )
            {
            // InternalIotlang.g:1725:4: ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) )
            // InternalIotlang.g:1726:5: (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' )
            {
            // InternalIotlang.g:1726:5: (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt22=1;
                }
                break;
            case 45:
                {
                alt22=2;
                }
                break;
            case 46:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalIotlang.g:1727:6: lv_direction_3_1= '=>'
                    {
                    lv_direction_3_1=(Token)match(input,44,FOLLOW_5); 

                    						newLeafNode(lv_direction_3_1, grammarAccess.getBindAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:1738:6: lv_direction_3_2= '<=>'
                    {
                    lv_direction_3_2=(Token)match(input,45,FOLLOW_5); 

                    						newLeafNode(lv_direction_3_2, grammarAccess.getBindAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalIotlang.g:1749:6: lv_direction_3_3= '<='
                    {
                    lv_direction_3_3=(Token)match(input,46,FOLLOW_5); 

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

            // InternalIotlang.g:1762:3: ( (otherlv_4= RULE_ID ) )
            // InternalIotlang.g:1763:4: (otherlv_4= RULE_ID )
            {
            // InternalIotlang.g:1763:4: (otherlv_4= RULE_ID )
            // InternalIotlang.g:1764:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_4, grammarAccess.getBindAccess().getPubSubInstanceInstancePubSubCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getBindAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalIotlang.g:1779:3: ( (otherlv_6= RULE_ID ) )
            // InternalIotlang.g:1780:4: (otherlv_6= RULE_ID )
            {
            // InternalIotlang.g:1780:4: (otherlv_6= RULE_ID )
            // InternalIotlang.g:1781:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_6, grammarAccess.getBindAccess().getTopicsTopicCrossReference_6_0());
            				

            }


            }

            // InternalIotlang.g:1792:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==47) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalIotlang.g:1793:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,47,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getBindAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalIotlang.g:1797:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalIotlang.g:1798:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalIotlang.g:1798:5: (otherlv_8= RULE_ID )
            	    // InternalIotlang.g:1799:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBindRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    						newLeafNode(otherlv_8, grammarAccess.getBindAccess().getTopicsTopicCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getBindAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalIotlang.g:1815:3: ( (lv_annotations_10_0= rulePlatformAnnotation ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ANNOTATION_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalIotlang.g:1816:4: (lv_annotations_10_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1816:4: (lv_annotations_10_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1817:5: lv_annotations_10_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getBindAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
            	    break loop24;
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


    // $ANTLR start "entryRuleConnect"
    // InternalIotlang.g:1838:1: entryRuleConnect returns [EObject current=null] : iv_ruleConnect= ruleConnect EOF ;
    public final EObject entryRuleConnect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnect = null;


        try {
            // InternalIotlang.g:1838:48: (iv_ruleConnect= ruleConnect EOF )
            // InternalIotlang.g:1839:2: iv_ruleConnect= ruleConnect EOF
            {
             newCompositeNode(grammarAccess.getConnectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnect=ruleConnect();

            state._fsp--;

             current =iv_ruleConnect; 
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
    // $ANTLR end "entryRuleConnect"


    // $ANTLR start "ruleConnect"
    // InternalIotlang.g:1845:1: ruleConnect returns [EObject current=null] : (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )* ) ;
    public final EObject ruleConnect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_direction_3_1=null;
        Token lv_direction_3_2=null;
        Token lv_direction_3_3=null;
        Token otherlv_4=null;
        EObject lv_annotations_5_0 = null;



        	enterRule();

        try {
            // InternalIotlang.g:1851:2: ( (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )* ) )
            // InternalIotlang.g:1852:2: (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )* )
            {
            // InternalIotlang.g:1852:2: (otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )* )
            // InternalIotlang.g:1853:3: otherlv_0= 'connect' ( (lv_name_1_0= RULE_ID ) )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_annotations_5_0= rulePlatformAnnotation ) )*
            {
            otherlv_0=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectAccess().getConnectKeyword_0());
            		
            // InternalIotlang.g:1857:3: ( (lv_name_1_0= RULE_ID ) )?
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
                    // InternalIotlang.g:1858:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalIotlang.g:1858:4: (lv_name_1_0= RULE_ID )
                    // InternalIotlang.g:1859:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getConnectAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConnectRule());
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

            // InternalIotlang.g:1875:3: ( (otherlv_2= RULE_ID ) )
            // InternalIotlang.g:1876:4: (otherlv_2= RULE_ID )
            {
            // InternalIotlang.g:1876:4: (otherlv_2= RULE_ID )
            // InternalIotlang.g:1877:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_2, grammarAccess.getConnectAccess().getThingInstanceInstanceThingCrossReference_2_0());
            				

            }


            }

            // InternalIotlang.g:1888:3: ( ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) ) )
            // InternalIotlang.g:1889:4: ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) )
            {
            // InternalIotlang.g:1889:4: ( (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' ) )
            // InternalIotlang.g:1890:5: (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' )
            {
            // InternalIotlang.g:1890:5: (lv_direction_3_1= '=>' | lv_direction_3_2= '<=>' | lv_direction_3_3= '<=' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt26=1;
                }
                break;
            case 45:
                {
                alt26=2;
                }
                break;
            case 46:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalIotlang.g:1891:6: lv_direction_3_1= '=>'
                    {
                    lv_direction_3_1=(Token)match(input,44,FOLLOW_5); 

                    						newLeafNode(lv_direction_3_1, grammarAccess.getConnectAccess().getDirectionEqualsSignGreaterThanSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalIotlang.g:1902:6: lv_direction_3_2= '<=>'
                    {
                    lv_direction_3_2=(Token)match(input,45,FOLLOW_5); 

                    						newLeafNode(lv_direction_3_2, grammarAccess.getConnectAccess().getDirectionLessThanSignEqualsSignGreaterThanSignKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalIotlang.g:1913:6: lv_direction_3_3= '<='
                    {
                    lv_direction_3_3=(Token)match(input,46,FOLLOW_5); 

                    						newLeafNode(lv_direction_3_3, grammarAccess.getConnectAccess().getDirectionLessThanSignEqualsSignKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectRule());
                    						}
                    						setWithLastConsumed(current, "direction", lv_direction_3_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalIotlang.g:1926:3: ( (otherlv_4= RULE_ID ) )
            // InternalIotlang.g:1927:4: (otherlv_4= RULE_ID )
            {
            // InternalIotlang.g:1927:4: (otherlv_4= RULE_ID )
            // InternalIotlang.g:1928:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_4, grammarAccess.getConnectAccess().getPtpInstanceInstancePtPCrossReference_4_0());
            				

            }


            }

            // InternalIotlang.g:1939:3: ( (lv_annotations_5_0= rulePlatformAnnotation ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ANNOTATION_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalIotlang.g:1940:4: (lv_annotations_5_0= rulePlatformAnnotation )
            	    {
            	    // InternalIotlang.g:1940:4: (lv_annotations_5_0= rulePlatformAnnotation )
            	    // InternalIotlang.g:1941:5: lv_annotations_5_0= rulePlatformAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getConnectAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_5_0=rulePlatformAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConnectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_5_0,
            	    						"lang.Iotlang.PlatformAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleConnect"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000020000372002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00010DA600008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000008000L});

}