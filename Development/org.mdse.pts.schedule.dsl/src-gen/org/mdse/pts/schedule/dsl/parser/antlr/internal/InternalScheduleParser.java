package org.mdse.pts.schedule.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.pts.schedule.dsl.services.ScheduleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScheduleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_LETTER", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'schedule'", "'for'", "'with'", "','", "';'", "'train'", "'on'", "'and'", "':'", "'start'", "'at'", "'platform'", "'drive'", "'via'", "'stop'", "'min'", "'reverse'", "'terminate'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_DIGIT=8;
    public static final int RULE_LETTER=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalScheduleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScheduleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScheduleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSchedule.g"; }



     	private ScheduleGrammarAccess grammarAccess;

        public InternalScheduleParser(TokenStream input, ScheduleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Schedule";
       	}

       	@Override
       	protected ScheduleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSchedule"
    // InternalSchedule.g:65:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalSchedule.g:65:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalSchedule.g:66:2: iv_ruleSchedule= ruleSchedule EOF
            {
             newCompositeNode(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchedule=ruleSchedule();

            state._fsp--;

             current =iv_ruleSchedule; 
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
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // InternalSchedule.g:72:1: ruleSchedule returns [EObject current=null] : (otherlv_0= 'schedule' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' ( ( (lv_trains_8_0= ruleTrainSchedule ) ) otherlv_9= ';' )* ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_trains_8_0 = null;



        	enterRule();

        try {
            // InternalSchedule.g:78:2: ( (otherlv_0= 'schedule' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' ( ( (lv_trains_8_0= ruleTrainSchedule ) ) otherlv_9= ';' )* ) )
            // InternalSchedule.g:79:2: (otherlv_0= 'schedule' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' ( ( (lv_trains_8_0= ruleTrainSchedule ) ) otherlv_9= ';' )* )
            {
            // InternalSchedule.g:79:2: (otherlv_0= 'schedule' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' ( ( (lv_trains_8_0= ruleTrainSchedule ) ) otherlv_9= ';' )* )
            // InternalSchedule.g:80:3: otherlv_0= 'schedule' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ';' ( ( (lv_trains_8_0= ruleTrainSchedule ) ) otherlv_9= ';' )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getScheduleKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getForKeyword_1());
            		
            // InternalSchedule.g:88:3: ( (otherlv_2= RULE_ID ) )
            // InternalSchedule.g:89:4: (otherlv_2= RULE_ID )
            {
            // InternalSchedule.g:89:4: (otherlv_2= RULE_ID )
            // InternalSchedule.g:90:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getNetworkNetworkCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getWithKeyword_3());
            		
            // InternalSchedule.g:105:3: ( (otherlv_4= RULE_ID ) )
            // InternalSchedule.g:106:4: (otherlv_4= RULE_ID )
            {
            // InternalSchedule.g:106:4: (otherlv_4= RULE_ID )
            // InternalSchedule.g:107:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScheduleRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_4, grammarAccess.getScheduleAccess().getDepotRootCrossReference_4_0());
            				

            }


            }

            // InternalSchedule.g:118:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSchedule.g:119:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getScheduleAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSchedule.g:123:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalSchedule.g:124:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalSchedule.g:124:5: (otherlv_6= RULE_ID )
            	    // InternalSchedule.g:125:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getScheduleRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_6, grammarAccess.getScheduleAccess().getDepotRootCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getScheduleAccess().getSemicolonKeyword_6());
            		
            // InternalSchedule.g:141:3: ( ( (lv_trains_8_0= ruleTrainSchedule ) ) otherlv_9= ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSchedule.g:142:4: ( (lv_trains_8_0= ruleTrainSchedule ) ) otherlv_9= ';'
            	    {
            	    // InternalSchedule.g:142:4: ( (lv_trains_8_0= ruleTrainSchedule ) )
            	    // InternalSchedule.g:143:5: (lv_trains_8_0= ruleTrainSchedule )
            	    {
            	    // InternalSchedule.g:143:5: (lv_trains_8_0= ruleTrainSchedule )
            	    // InternalSchedule.g:144:6: lv_trains_8_0= ruleTrainSchedule
            	    {

            	    						newCompositeNode(grammarAccess.getScheduleAccess().getTrainsTrainScheduleParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_trains_8_0=ruleTrainSchedule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScheduleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"trains",
            	    							lv_trains_8_0,
            	    							"org.mdse.pts.schedule.dsl.Schedule.TrainSchedule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_9, grammarAccess.getScheduleAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleTrainSchedule"
    // InternalSchedule.g:170:1: entryRuleTrainSchedule returns [EObject current=null] : iv_ruleTrainSchedule= ruleTrainSchedule EOF ;
    public final EObject entryRuleTrainSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainSchedule = null;


        try {
            // InternalSchedule.g:170:54: (iv_ruleTrainSchedule= ruleTrainSchedule EOF )
            // InternalSchedule.g:171:2: iv_ruleTrainSchedule= ruleTrainSchedule EOF
            {
             newCompositeNode(grammarAccess.getTrainScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainSchedule=ruleTrainSchedule();

            state._fsp--;

             current =iv_ruleTrainSchedule; 
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
    // $ANTLR end "entryRuleTrainSchedule"


    // $ANTLR start "ruleTrainSchedule"
    // InternalSchedule.g:177:1: ruleTrainSchedule returns [EObject current=null] : (otherlv_0= 'schedule' otherlv_1= 'train' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (lv_starttimes_4_0= ruleStartTime ) ) (otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) ) )* otherlv_7= ':' ( (lv_stops_8_0= ruleStartAtStop ) ) ( ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) ) )* ( ( (lv_stops_10_1= ruleTerminalStop | lv_stops_10_2= ruleViaTerminalStop ) ) ) ) ;
    public final EObject ruleTrainSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_starttimes_4_0 = null;

        EObject lv_starttimes_6_0 = null;

        EObject lv_stops_8_0 = null;

        EObject lv_stops_9_1 = null;

        EObject lv_stops_9_2 = null;

        EObject lv_stops_10_1 = null;

        EObject lv_stops_10_2 = null;



        	enterRule();

        try {
            // InternalSchedule.g:183:2: ( (otherlv_0= 'schedule' otherlv_1= 'train' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (lv_starttimes_4_0= ruleStartTime ) ) (otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) ) )* otherlv_7= ':' ( (lv_stops_8_0= ruleStartAtStop ) ) ( ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) ) )* ( ( (lv_stops_10_1= ruleTerminalStop | lv_stops_10_2= ruleViaTerminalStop ) ) ) ) )
            // InternalSchedule.g:184:2: (otherlv_0= 'schedule' otherlv_1= 'train' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (lv_starttimes_4_0= ruleStartTime ) ) (otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) ) )* otherlv_7= ':' ( (lv_stops_8_0= ruleStartAtStop ) ) ( ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) ) )* ( ( (lv_stops_10_1= ruleTerminalStop | lv_stops_10_2= ruleViaTerminalStop ) ) ) )
            {
            // InternalSchedule.g:184:2: (otherlv_0= 'schedule' otherlv_1= 'train' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (lv_starttimes_4_0= ruleStartTime ) ) (otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) ) )* otherlv_7= ':' ( (lv_stops_8_0= ruleStartAtStop ) ) ( ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) ) )* ( ( (lv_stops_10_1= ruleTerminalStop | lv_stops_10_2= ruleViaTerminalStop ) ) ) )
            // InternalSchedule.g:185:3: otherlv_0= 'schedule' otherlv_1= 'train' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (lv_starttimes_4_0= ruleStartTime ) ) (otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) ) )* otherlv_7= ':' ( (lv_stops_8_0= ruleStartAtStop ) ) ( ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) ) )* ( ( (lv_stops_10_1= ruleTerminalStop | lv_stops_10_2= ruleViaTerminalStop ) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTrainScheduleAccess().getScheduleKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainScheduleAccess().getTrainKeyword_1());
            		
            // InternalSchedule.g:193:3: ( (otherlv_2= RULE_ID ) )
            // InternalSchedule.g:194:4: (otherlv_2= RULE_ID )
            {
            // InternalSchedule.g:194:4: (otherlv_2= RULE_ID )
            // InternalSchedule.g:195:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainScheduleRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getTrainScheduleAccess().getTrainTrainCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getTrainScheduleAccess().getOnKeyword_3());
            		
            // InternalSchedule.g:210:3: ( (lv_starttimes_4_0= ruleStartTime ) )
            // InternalSchedule.g:211:4: (lv_starttimes_4_0= ruleStartTime )
            {
            // InternalSchedule.g:211:4: (lv_starttimes_4_0= ruleStartTime )
            // InternalSchedule.g:212:5: lv_starttimes_4_0= ruleStartTime
            {

            					newCompositeNode(grammarAccess.getTrainScheduleAccess().getStarttimesStartTimeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_starttimes_4_0=ruleStartTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
            					}
            					add(
            						current,
            						"starttimes",
            						lv_starttimes_4_0,
            						"org.mdse.pts.schedule.dsl.Schedule.StartTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchedule.g:229:3: (otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSchedule.g:230:4: otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTrainScheduleAccess().getAndKeyword_5_0());
            	    			
            	    // InternalSchedule.g:234:4: ( (lv_starttimes_6_0= ruleStartTime ) )
            	    // InternalSchedule.g:235:5: (lv_starttimes_6_0= ruleStartTime )
            	    {
            	    // InternalSchedule.g:235:5: (lv_starttimes_6_0= ruleStartTime )
            	    // InternalSchedule.g:236:6: lv_starttimes_6_0= ruleStartTime
            	    {

            	    						newCompositeNode(grammarAccess.getTrainScheduleAccess().getStarttimesStartTimeParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_starttimes_6_0=ruleStartTime();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"starttimes",
            	    							lv_starttimes_6_0,
            	    							"org.mdse.pts.schedule.dsl.Schedule.StartTime");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getTrainScheduleAccess().getColonKeyword_6());
            		
            // InternalSchedule.g:258:3: ( (lv_stops_8_0= ruleStartAtStop ) )
            // InternalSchedule.g:259:4: (lv_stops_8_0= ruleStartAtStop )
            {
            // InternalSchedule.g:259:4: (lv_stops_8_0= ruleStartAtStop )
            // InternalSchedule.g:260:5: lv_stops_8_0= ruleStartAtStop
            {

            					newCompositeNode(grammarAccess.getTrainScheduleAccess().getStopsStartAtStopParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_stops_8_0=ruleStartAtStop();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
            					}
            					add(
            						current,
            						"stops",
            						lv_stops_8_0,
            						"org.mdse.pts.schedule.dsl.Schedule.StartAtStop");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchedule.g:277:3: ( ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==25) ) {
                        int LA5_4 = input.LA(3);

                        if ( (LA5_4==RULE_STRING) ) {
                            int LA5_5 = input.LA(4);

                            if ( (LA5_5==19) ) {
                                int LA5_6 = input.LA(5);

                                if ( (LA5_6==26) ) {
                                    alt5=1;
                                }


                            }


                        }


                    }


                }
                else if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSchedule.g:278:4: ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) )
            	    {
            	    // InternalSchedule.g:278:4: ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) )
            	    // InternalSchedule.g:279:5: (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop )
            	    {
            	    // InternalSchedule.g:279:5: (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==24) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==26) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalSchedule.g:280:6: lv_stops_9_1= ruleViaStop
            	            {

            	            						newCompositeNode(grammarAccess.getTrainScheduleAccess().getStopsViaStopParserRuleCall_8_0_0());
            	            					
            	            pushFollow(FOLLOW_14);
            	            lv_stops_9_1=ruleViaStop();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
            	            						}
            	            						add(
            	            							current,
            	            							"stops",
            	            							lv_stops_9_1,
            	            							"org.mdse.pts.schedule.dsl.Schedule.ViaStop");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalSchedule.g:296:6: lv_stops_9_2= ruleNormalStop
            	            {

            	            						newCompositeNode(grammarAccess.getTrainScheduleAccess().getStopsNormalStopParserRuleCall_8_0_1());
            	            					
            	            pushFollow(FOLLOW_14);
            	            lv_stops_9_2=ruleNormalStop();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
            	            						}
            	            						add(
            	            							current,
            	            							"stops",
            	            							lv_stops_9_2,
            	            							"org.mdse.pts.schedule.dsl.Schedule.NormalStop");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalSchedule.g:314:3: ( ( (lv_stops_10_1= ruleTerminalStop | lv_stops_10_2= ruleViaTerminalStop ) ) )
            // InternalSchedule.g:315:4: ( (lv_stops_10_1= ruleTerminalStop | lv_stops_10_2= ruleViaTerminalStop ) )
            {
            // InternalSchedule.g:315:4: ( (lv_stops_10_1= ruleTerminalStop | lv_stops_10_2= ruleViaTerminalStop ) )
            // InternalSchedule.g:316:5: (lv_stops_10_1= ruleTerminalStop | lv_stops_10_2= ruleViaTerminalStop )
            {
            // InternalSchedule.g:316:5: (lv_stops_10_1= ruleTerminalStop | lv_stops_10_2= ruleViaTerminalStop )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSchedule.g:317:6: lv_stops_10_1= ruleTerminalStop
                    {

                    						newCompositeNode(grammarAccess.getTrainScheduleAccess().getStopsTerminalStopParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_stops_10_1=ruleTerminalStop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
                    						}
                    						add(
                    							current,
                    							"stops",
                    							lv_stops_10_1,
                    							"org.mdse.pts.schedule.dsl.Schedule.TerminalStop");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalSchedule.g:333:6: lv_stops_10_2= ruleViaTerminalStop
                    {

                    						newCompositeNode(grammarAccess.getTrainScheduleAccess().getStopsViaTerminalStopParserRuleCall_9_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_stops_10_2=ruleViaTerminalStop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
                    						}
                    						add(
                    							current,
                    							"stops",
                    							lv_stops_10_2,
                    							"org.mdse.pts.schedule.dsl.Schedule.ViaTerminalStop");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleTrainSchedule"


    // $ANTLR start "entryRuleStartAtStop"
    // InternalSchedule.g:355:1: entryRuleStartAtStop returns [EObject current=null] : iv_ruleStartAtStop= ruleStartAtStop EOF ;
    public final EObject entryRuleStartAtStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartAtStop = null;


        try {
            // InternalSchedule.g:355:52: (iv_ruleStartAtStop= ruleStartAtStop EOF )
            // InternalSchedule.g:356:2: iv_ruleStartAtStop= ruleStartAtStop EOF
            {
             newCompositeNode(grammarAccess.getStartAtStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartAtStop=ruleStartAtStop();

            state._fsp--;

             current =iv_ruleStartAtStop; 
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
    // $ANTLR end "entryRuleStartAtStop"


    // $ANTLR start "ruleStartAtStop"
    // InternalSchedule.g:362:1: ruleStartAtStop returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleStartAtStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_platform_5_0=null;


        	enterRule();

        try {
            // InternalSchedule.g:368:2: ( (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) ) )
            // InternalSchedule.g:369:2: (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )
            {
            // InternalSchedule.g:369:2: (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )
            // InternalSchedule.g:370:3: otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getStartAtStopAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getStartAtStopAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:378:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSchedule.g:379:4: (otherlv_2= RULE_STRING )
            {
            // InternalSchedule.g:379:4: (otherlv_2= RULE_STRING )
            // InternalSchedule.g:380:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartAtStopRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getStartAtStopAccess().getStationStationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getStartAtStopAccess().getOnKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getStartAtStopAccess().getPlatformKeyword_4());
            		
            // InternalSchedule.g:399:3: ( (lv_platform_5_0= RULE_STRING ) )
            // InternalSchedule.g:400:4: (lv_platform_5_0= RULE_STRING )
            {
            // InternalSchedule.g:400:4: (lv_platform_5_0= RULE_STRING )
            // InternalSchedule.g:401:5: lv_platform_5_0= RULE_STRING
            {
            lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_platform_5_0, grammarAccess.getStartAtStopAccess().getPlatformSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartAtStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"platform",
            						lv_platform_5_0,
            						"org.mdse.pts.schedule.dsl.Schedule.STRING");
            				

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
    // $ANTLR end "ruleStartAtStop"


    // $ANTLR start "entryRuleViaStop"
    // InternalSchedule.g:421:1: entryRuleViaStop returns [EObject current=null] : iv_ruleViaStop= ruleViaStop EOF ;
    public final EObject entryRuleViaStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViaStop = null;


        try {
            // InternalSchedule.g:421:48: (iv_ruleViaStop= ruleViaStop EOF )
            // InternalSchedule.g:422:2: iv_ruleViaStop= ruleViaStop EOF
            {
             newCompositeNode(grammarAccess.getViaStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViaStop=ruleViaStop();

            state._fsp--;

             current =iv_ruleViaStop; 
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
    // $ANTLR end "entryRuleViaStop"


    // $ANTLR start "ruleViaStop"
    // InternalSchedule.g:428:1: ruleViaStop returns [EObject current=null] : (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'stop' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_STRING ) ) otherlv_10= 'for' ( (lv_stoppedTime_11_0= RULE_INT ) ) otherlv_12= 'min' (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )? ) ;
    public final EObject ruleViaStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_platform_9_0=null;
        Token otherlv_10=null;
        Token lv_stoppedTime_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_rotate_14_0=null;


        	enterRule();

        try {
            // InternalSchedule.g:434:2: ( (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'stop' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_STRING ) ) otherlv_10= 'for' ( (lv_stoppedTime_11_0= RULE_INT ) ) otherlv_12= 'min' (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )? ) )
            // InternalSchedule.g:435:2: (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'stop' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_STRING ) ) otherlv_10= 'for' ( (lv_stoppedTime_11_0= RULE_INT ) ) otherlv_12= 'min' (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )? )
            {
            // InternalSchedule.g:435:2: (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'stop' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_STRING ) ) otherlv_10= 'for' ( (lv_stoppedTime_11_0= RULE_INT ) ) otherlv_12= 'min' (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )? )
            // InternalSchedule.g:436:3: otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'stop' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_STRING ) ) otherlv_10= 'for' ( (lv_stoppedTime_11_0= RULE_INT ) ) otherlv_12= 'min' (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getViaStopAccess().getDriveKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getViaStopAccess().getViaKeyword_1());
            		
            // InternalSchedule.g:444:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSchedule.g:445:4: (otherlv_2= RULE_STRING )
            {
            // InternalSchedule.g:445:4: (otherlv_2= RULE_STRING )
            // InternalSchedule.g:446:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViaStopRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(otherlv_2, grammarAccess.getViaStopAccess().getViaLegCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getViaStopAccess().getAndKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getViaStopAccess().getStopKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getViaStopAccess().getAtKeyword_5());
            		
            // InternalSchedule.g:469:3: ( (otherlv_6= RULE_STRING ) )
            // InternalSchedule.g:470:4: (otherlv_6= RULE_STRING )
            {
            // InternalSchedule.g:470:4: (otherlv_6= RULE_STRING )
            // InternalSchedule.g:471:5: otherlv_6= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViaStopRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(otherlv_6, grammarAccess.getViaStopAccess().getStationStationCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getViaStopAccess().getOnKeyword_7());
            		
            otherlv_8=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getViaStopAccess().getPlatformKeyword_8());
            		
            // InternalSchedule.g:490:3: ( (lv_platform_9_0= RULE_STRING ) )
            // InternalSchedule.g:491:4: (lv_platform_9_0= RULE_STRING )
            {
            // InternalSchedule.g:491:4: (lv_platform_9_0= RULE_STRING )
            // InternalSchedule.g:492:5: lv_platform_9_0= RULE_STRING
            {
            lv_platform_9_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_platform_9_0, grammarAccess.getViaStopAccess().getPlatformSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViaStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"platform",
            						lv_platform_9_0,
            						"org.mdse.pts.schedule.dsl.Schedule.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_10, grammarAccess.getViaStopAccess().getForKeyword_10());
            		
            // InternalSchedule.g:512:3: ( (lv_stoppedTime_11_0= RULE_INT ) )
            // InternalSchedule.g:513:4: (lv_stoppedTime_11_0= RULE_INT )
            {
            // InternalSchedule.g:513:4: (lv_stoppedTime_11_0= RULE_INT )
            // InternalSchedule.g:514:5: lv_stoppedTime_11_0= RULE_INT
            {
            lv_stoppedTime_11_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_stoppedTime_11_0, grammarAccess.getViaStopAccess().getStoppedTimeINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViaStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stoppedTime",
            						lv_stoppedTime_11_0,
            						"org.mdse.pts.schedule.dsl.Schedule.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_12, grammarAccess.getViaStopAccess().getMinKeyword_12());
            		
            // InternalSchedule.g:534:3: (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSchedule.g:535:4: otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) )
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getViaStopAccess().getAndKeyword_13_0());
                    			
                    // InternalSchedule.g:539:4: ( (lv_rotate_14_0= 'reverse' ) )
                    // InternalSchedule.g:540:5: (lv_rotate_14_0= 'reverse' )
                    {
                    // InternalSchedule.g:540:5: (lv_rotate_14_0= 'reverse' )
                    // InternalSchedule.g:541:6: lv_rotate_14_0= 'reverse'
                    {
                    lv_rotate_14_0=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_rotate_14_0, grammarAccess.getViaStopAccess().getRotateReverseKeyword_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getViaStopRule());
                    						}
                    						setWithLastConsumed(current, "rotate", lv_rotate_14_0 != null, "reverse");
                    					

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
    // $ANTLR end "ruleViaStop"


    // $ANTLR start "entryRuleNormalStop"
    // InternalSchedule.g:558:1: entryRuleNormalStop returns [EObject current=null] : iv_ruleNormalStop= ruleNormalStop EOF ;
    public final EObject entryRuleNormalStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalStop = null;


        try {
            // InternalSchedule.g:558:51: (iv_ruleNormalStop= ruleNormalStop EOF )
            // InternalSchedule.g:559:2: iv_ruleNormalStop= ruleNormalStop EOF
            {
             newCompositeNode(grammarAccess.getNormalStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalStop=ruleNormalStop();

            state._fsp--;

             current =iv_ruleNormalStop; 
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
    // $ANTLR end "entryRuleNormalStop"


    // $ANTLR start "ruleNormalStop"
    // InternalSchedule.g:565:1: ruleNormalStop returns [EObject current=null] : (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) otherlv_6= 'for' ( (lv_stoppedTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )? ) ;
    public final EObject ruleNormalStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_platform_5_0=null;
        Token otherlv_6=null;
        Token lv_stoppedTime_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_rotate_10_0=null;


        	enterRule();

        try {
            // InternalSchedule.g:571:2: ( (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) otherlv_6= 'for' ( (lv_stoppedTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )? ) )
            // InternalSchedule.g:572:2: (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) otherlv_6= 'for' ( (lv_stoppedTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )? )
            {
            // InternalSchedule.g:572:2: (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) otherlv_6= 'for' ( (lv_stoppedTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )? )
            // InternalSchedule.g:573:3: otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) otherlv_6= 'for' ( (lv_stoppedTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalStopAccess().getStopKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalStopAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:581:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSchedule.g:582:4: (otherlv_2= RULE_STRING )
            {
            // InternalSchedule.g:582:4: (otherlv_2= RULE_STRING )
            // InternalSchedule.g:583:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNormalStopRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getNormalStopAccess().getStationStationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getNormalStopAccess().getOnKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getNormalStopAccess().getPlatformKeyword_4());
            		
            // InternalSchedule.g:602:3: ( (lv_platform_5_0= RULE_STRING ) )
            // InternalSchedule.g:603:4: (lv_platform_5_0= RULE_STRING )
            {
            // InternalSchedule.g:603:4: (lv_platform_5_0= RULE_STRING )
            // InternalSchedule.g:604:5: lv_platform_5_0= RULE_STRING
            {
            lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_platform_5_0, grammarAccess.getNormalStopAccess().getPlatformSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNormalStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"platform",
            						lv_platform_5_0,
            						"org.mdse.pts.schedule.dsl.Schedule.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getNormalStopAccess().getForKeyword_6());
            		
            // InternalSchedule.g:624:3: ( (lv_stoppedTime_7_0= RULE_INT ) )
            // InternalSchedule.g:625:4: (lv_stoppedTime_7_0= RULE_INT )
            {
            // InternalSchedule.g:625:4: (lv_stoppedTime_7_0= RULE_INT )
            // InternalSchedule.g:626:5: lv_stoppedTime_7_0= RULE_INT
            {
            lv_stoppedTime_7_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_stoppedTime_7_0, grammarAccess.getNormalStopAccess().getStoppedTimeINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNormalStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stoppedTime",
            						lv_stoppedTime_7_0,
            						"org.mdse.pts.schedule.dsl.Schedule.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getNormalStopAccess().getMinKeyword_8());
            		
            // InternalSchedule.g:646:3: (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSchedule.g:647:4: otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) )
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getNormalStopAccess().getAndKeyword_9_0());
                    			
                    // InternalSchedule.g:651:4: ( (lv_rotate_10_0= 'reverse' ) )
                    // InternalSchedule.g:652:5: (lv_rotate_10_0= 'reverse' )
                    {
                    // InternalSchedule.g:652:5: (lv_rotate_10_0= 'reverse' )
                    // InternalSchedule.g:653:6: lv_rotate_10_0= 'reverse'
                    {
                    lv_rotate_10_0=(Token)match(input,28,FOLLOW_2); 

                    						newLeafNode(lv_rotate_10_0, grammarAccess.getNormalStopAccess().getRotateReverseKeyword_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNormalStopRule());
                    						}
                    						setWithLastConsumed(current, "rotate", lv_rotate_10_0 != null, "reverse");
                    					

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
    // $ANTLR end "ruleNormalStop"


    // $ANTLR start "entryRuleTerminalStop"
    // InternalSchedule.g:670:1: entryRuleTerminalStop returns [EObject current=null] : iv_ruleTerminalStop= ruleTerminalStop EOF ;
    public final EObject entryRuleTerminalStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalStop = null;


        try {
            // InternalSchedule.g:670:53: (iv_ruleTerminalStop= ruleTerminalStop EOF )
            // InternalSchedule.g:671:2: iv_ruleTerminalStop= ruleTerminalStop EOF
            {
             newCompositeNode(grammarAccess.getTerminalStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalStop=ruleTerminalStop();

            state._fsp--;

             current =iv_ruleTerminalStop; 
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
    // $ANTLR end "entryRuleTerminalStop"


    // $ANTLR start "ruleTerminalStop"
    // InternalSchedule.g:677:1: ruleTerminalStop returns [EObject current=null] : (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleTerminalStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_platform_5_0=null;


        	enterRule();

        try {
            // InternalSchedule.g:683:2: ( (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) ) )
            // InternalSchedule.g:684:2: (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )
            {
            // InternalSchedule.g:684:2: (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) ) )
            // InternalSchedule.g:685:3: otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getTerminalStopAccess().getTerminateKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTerminalStopAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:693:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSchedule.g:694:4: (otherlv_2= RULE_STRING )
            {
            // InternalSchedule.g:694:4: (otherlv_2= RULE_STRING )
            // InternalSchedule.g:695:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminalStopRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getTerminalStopAccess().getStationStationCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getTerminalStopAccess().getOnKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getTerminalStopAccess().getPlatformKeyword_4());
            		
            // InternalSchedule.g:714:3: ( (lv_platform_5_0= RULE_STRING ) )
            // InternalSchedule.g:715:4: (lv_platform_5_0= RULE_STRING )
            {
            // InternalSchedule.g:715:4: (lv_platform_5_0= RULE_STRING )
            // InternalSchedule.g:716:5: lv_platform_5_0= RULE_STRING
            {
            lv_platform_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_platform_5_0, grammarAccess.getTerminalStopAccess().getPlatformSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminalStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"platform",
            						lv_platform_5_0,
            						"org.mdse.pts.schedule.dsl.Schedule.STRING");
            				

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
    // $ANTLR end "ruleTerminalStop"


    // $ANTLR start "entryRuleViaTerminalStop"
    // InternalSchedule.g:736:1: entryRuleViaTerminalStop returns [EObject current=null] : iv_ruleViaTerminalStop= ruleViaTerminalStop EOF ;
    public final EObject entryRuleViaTerminalStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViaTerminalStop = null;


        try {
            // InternalSchedule.g:736:56: (iv_ruleViaTerminalStop= ruleViaTerminalStop EOF )
            // InternalSchedule.g:737:2: iv_ruleViaTerminalStop= ruleViaTerminalStop EOF
            {
             newCompositeNode(grammarAccess.getViaTerminalStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViaTerminalStop=ruleViaTerminalStop();

            state._fsp--;

             current =iv_ruleViaTerminalStop; 
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
    // $ANTLR end "entryRuleViaTerminalStop"


    // $ANTLR start "ruleViaTerminalStop"
    // InternalSchedule.g:743:1: ruleViaTerminalStop returns [EObject current=null] : (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'terminate' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleViaTerminalStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_platform_9_0=null;


        	enterRule();

        try {
            // InternalSchedule.g:749:2: ( (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'terminate' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_STRING ) ) ) )
            // InternalSchedule.g:750:2: (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'terminate' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_STRING ) ) )
            {
            // InternalSchedule.g:750:2: (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'terminate' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_STRING ) ) )
            // InternalSchedule.g:751:3: otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'terminate' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getViaTerminalStopAccess().getDriveKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getViaTerminalStopAccess().getViaKeyword_1());
            		
            // InternalSchedule.g:759:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSchedule.g:760:4: (otherlv_2= RULE_STRING )
            {
            // InternalSchedule.g:760:4: (otherlv_2= RULE_STRING )
            // InternalSchedule.g:761:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViaTerminalStopRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(otherlv_2, grammarAccess.getViaTerminalStopAccess().getViaLegCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getViaTerminalStopAccess().getAndKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getViaTerminalStopAccess().getTerminateKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getViaTerminalStopAccess().getAtKeyword_5());
            		
            // InternalSchedule.g:784:3: ( (otherlv_6= RULE_STRING ) )
            // InternalSchedule.g:785:4: (otherlv_6= RULE_STRING )
            {
            // InternalSchedule.g:785:4: (otherlv_6= RULE_STRING )
            // InternalSchedule.g:786:5: otherlv_6= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViaTerminalStopRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(otherlv_6, grammarAccess.getViaTerminalStopAccess().getStationStationCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getViaTerminalStopAccess().getOnKeyword_7());
            		
            otherlv_8=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getViaTerminalStopAccess().getPlatformKeyword_8());
            		
            // InternalSchedule.g:805:3: ( (lv_platform_9_0= RULE_STRING ) )
            // InternalSchedule.g:806:4: (lv_platform_9_0= RULE_STRING )
            {
            // InternalSchedule.g:806:4: (lv_platform_9_0= RULE_STRING )
            // InternalSchedule.g:807:5: lv_platform_9_0= RULE_STRING
            {
            lv_platform_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_platform_9_0, grammarAccess.getViaTerminalStopAccess().getPlatformSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViaTerminalStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"platform",
            						lv_platform_9_0,
            						"org.mdse.pts.schedule.dsl.Schedule.STRING");
            				

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
    // $ANTLR end "ruleViaTerminalStop"


    // $ANTLR start "entryRuleStartTime"
    // InternalSchedule.g:827:1: entryRuleStartTime returns [EObject current=null] : iv_ruleStartTime= ruleStartTime EOF ;
    public final EObject entryRuleStartTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartTime = null;


        try {
            // InternalSchedule.g:827:50: (iv_ruleStartTime= ruleStartTime EOF )
            // InternalSchedule.g:828:2: iv_ruleStartTime= ruleStartTime EOF
            {
             newCompositeNode(grammarAccess.getStartTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartTime=ruleStartTime();

            state._fsp--;

             current =iv_ruleStartTime; 
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
    // $ANTLR end "entryRuleStartTime"


    // $ANTLR start "ruleStartTime"
    // InternalSchedule.g:834:1: ruleStartTime returns [EObject current=null] : ( ( (lv_weekdays_0_0= ruleWeekday ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )* otherlv_3= 'at' ( (lv_timestamps_4_0= ruleTime ) ) (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )* ) ;
    public final EObject ruleStartTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_weekdays_0_0 = null;

        Enumerator lv_weekdays_2_0 = null;

        EObject lv_timestamps_4_0 = null;

        EObject lv_timestamps_6_0 = null;



        	enterRule();

        try {
            // InternalSchedule.g:840:2: ( ( ( (lv_weekdays_0_0= ruleWeekday ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )* otherlv_3= 'at' ( (lv_timestamps_4_0= ruleTime ) ) (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )* ) )
            // InternalSchedule.g:841:2: ( ( (lv_weekdays_0_0= ruleWeekday ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )* otherlv_3= 'at' ( (lv_timestamps_4_0= ruleTime ) ) (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )* )
            {
            // InternalSchedule.g:841:2: ( ( (lv_weekdays_0_0= ruleWeekday ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )* otherlv_3= 'at' ( (lv_timestamps_4_0= ruleTime ) ) (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )* )
            // InternalSchedule.g:842:3: ( (lv_weekdays_0_0= ruleWeekday ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )* otherlv_3= 'at' ( (lv_timestamps_4_0= ruleTime ) ) (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )*
            {
            // InternalSchedule.g:842:3: ( (lv_weekdays_0_0= ruleWeekday ) )
            // InternalSchedule.g:843:4: (lv_weekdays_0_0= ruleWeekday )
            {
            // InternalSchedule.g:843:4: (lv_weekdays_0_0= ruleWeekday )
            // InternalSchedule.g:844:5: lv_weekdays_0_0= ruleWeekday
            {

            					newCompositeNode(grammarAccess.getStartTimeAccess().getWeekdaysWeekdayEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_weekdays_0_0=ruleWeekday();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartTimeRule());
            					}
            					add(
            						current,
            						"weekdays",
            						lv_weekdays_0_0,
            						"org.mdse.pts.schedule.dsl.Schedule.Weekday");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchedule.g:861:3: (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSchedule.g:862:4: otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStartTimeAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalSchedule.g:866:4: ( (lv_weekdays_2_0= ruleWeekday ) )
            	    // InternalSchedule.g:867:5: (lv_weekdays_2_0= ruleWeekday )
            	    {
            	    // InternalSchedule.g:867:5: (lv_weekdays_2_0= ruleWeekday )
            	    // InternalSchedule.g:868:6: lv_weekdays_2_0= ruleWeekday
            	    {

            	    						newCompositeNode(grammarAccess.getStartTimeAccess().getWeekdaysWeekdayEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_weekdays_2_0=ruleWeekday();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStartTimeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"weekdays",
            	    							lv_weekdays_2_0,
            	    							"org.mdse.pts.schedule.dsl.Schedule.Weekday");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getStartTimeAccess().getAtKeyword_2());
            		
            // InternalSchedule.g:890:3: ( (lv_timestamps_4_0= ruleTime ) )
            // InternalSchedule.g:891:4: (lv_timestamps_4_0= ruleTime )
            {
            // InternalSchedule.g:891:4: (lv_timestamps_4_0= ruleTime )
            // InternalSchedule.g:892:5: lv_timestamps_4_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getStartTimeAccess().getTimestampsTimeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_timestamps_4_0=ruleTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartTimeRule());
            					}
            					add(
            						current,
            						"timestamps",
            						lv_timestamps_4_0,
            						"org.mdse.pts.schedule.dsl.Schedule.Time");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSchedule.g:909:3: (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSchedule.g:910:4: otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_21); 

            	    				newLeafNode(otherlv_5, grammarAccess.getStartTimeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSchedule.g:914:4: ( (lv_timestamps_6_0= ruleTime ) )
            	    // InternalSchedule.g:915:5: (lv_timestamps_6_0= ruleTime )
            	    {
            	    // InternalSchedule.g:915:5: (lv_timestamps_6_0= ruleTime )
            	    // InternalSchedule.g:916:6: lv_timestamps_6_0= ruleTime
            	    {

            	    						newCompositeNode(grammarAccess.getStartTimeAccess().getTimestampsTimeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_timestamps_6_0=ruleTime();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStartTimeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"timestamps",
            	    							lv_timestamps_6_0,
            	    							"org.mdse.pts.schedule.dsl.Schedule.Time");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleStartTime"


    // $ANTLR start "entryRuleTime"
    // InternalSchedule.g:938:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalSchedule.g:938:45: (iv_ruleTime= ruleTime EOF )
            // InternalSchedule.g:939:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalSchedule.g:945:1: ruleTime returns [EObject current=null] : ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minute_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_hour_0_0=null;
        Token otherlv_1=null;
        Token lv_minute_2_0=null;


        	enterRule();

        try {
            // InternalSchedule.g:951:2: ( ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minute_2_0= RULE_INT ) ) ) )
            // InternalSchedule.g:952:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minute_2_0= RULE_INT ) ) )
            {
            // InternalSchedule.g:952:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minute_2_0= RULE_INT ) ) )
            // InternalSchedule.g:953:3: ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minute_2_0= RULE_INT ) )
            {
            // InternalSchedule.g:953:3: ( (lv_hour_0_0= RULE_INT ) )
            // InternalSchedule.g:954:4: (lv_hour_0_0= RULE_INT )
            {
            // InternalSchedule.g:954:4: (lv_hour_0_0= RULE_INT )
            // InternalSchedule.g:955:5: lv_hour_0_0= RULE_INT
            {
            lv_hour_0_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_hour_0_0, grammarAccess.getTimeAccess().getHourINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hour",
            						lv_hour_0_0,
            						"org.mdse.pts.schedule.dsl.Schedule.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getColonKeyword_1());
            		
            // InternalSchedule.g:975:3: ( (lv_minute_2_0= RULE_INT ) )
            // InternalSchedule.g:976:4: (lv_minute_2_0= RULE_INT )
            {
            // InternalSchedule.g:976:4: (lv_minute_2_0= RULE_INT )
            // InternalSchedule.g:977:5: lv_minute_2_0= RULE_INT
            {
            lv_minute_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_minute_2_0, grammarAccess.getTimeAccess().getMinuteINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minute",
            						lv_minute_2_0,
            						"org.mdse.pts.schedule.dsl.Schedule.INT");
            				

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "ruleWeekday"
    // InternalSchedule.g:997:1: ruleWeekday returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
    public final Enumerator ruleWeekday() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSchedule.g:1003:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalSchedule.g:1004:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalSchedule.g:1004:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            case 34:
                {
                alt11=5;
                }
                break;
            case 35:
                {
                alt11=6;
                }
                break;
            case 36:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSchedule.g:1005:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalSchedule.g:1005:3: (enumLiteral_0= 'Monday' )
                    // InternalSchedule.g:1006:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getMondayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekdayAccess().getMondayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSchedule.g:1013:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalSchedule.g:1013:3: (enumLiteral_1= 'Tuesday' )
                    // InternalSchedule.g:1014:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getTuesdayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekdayAccess().getTuesdayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSchedule.g:1021:3: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalSchedule.g:1021:3: (enumLiteral_2= 'Wednesday' )
                    // InternalSchedule.g:1022:4: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getWednesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekdayAccess().getWednesdayEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSchedule.g:1029:3: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalSchedule.g:1029:3: (enumLiteral_3= 'Thursday' )
                    // InternalSchedule.g:1030:4: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getThursdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekdayAccess().getThursdayEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSchedule.g:1037:3: (enumLiteral_4= 'Friday' )
                    {
                    // InternalSchedule.g:1037:3: (enumLiteral_4= 'Friday' )
                    // InternalSchedule.g:1038:4: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getFridayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekdayAccess().getFridayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSchedule.g:1045:3: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalSchedule.g:1045:3: (enumLiteral_5= 'Saturday' )
                    // InternalSchedule.g:1046:4: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getSaturdayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekdayAccess().getSaturdayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSchedule.g:1053:3: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalSchedule.g:1053:3: (enumLiteral_6= 'Sunday' )
                    // InternalSchedule.g:1054:4: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getSundayEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getWeekdayAccess().getSundayEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleWeekday"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001FC0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000025000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000100000L});

}