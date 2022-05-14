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
    // InternalSchedule.g:177:1: ruleTrainSchedule returns [EObject current=null] : (otherlv_0= 'schedule' otherlv_1= 'train' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (lv_starttimes_4_0= ruleStartTime ) ) (otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) ) )* otherlv_7= ':' ( (lv_stops_8_0= ruleStartAtStop ) ) ( ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) ) )* ( (lv_stops_10_0= ruleTerminalStop ) ) ) ;
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

        EObject lv_stops_10_0 = null;



        	enterRule();

        try {
            // InternalSchedule.g:183:2: ( (otherlv_0= 'schedule' otherlv_1= 'train' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (lv_starttimes_4_0= ruleStartTime ) ) (otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) ) )* otherlv_7= ':' ( (lv_stops_8_0= ruleStartAtStop ) ) ( ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) ) )* ( (lv_stops_10_0= ruleTerminalStop ) ) ) )
            // InternalSchedule.g:184:2: (otherlv_0= 'schedule' otherlv_1= 'train' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (lv_starttimes_4_0= ruleStartTime ) ) (otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) ) )* otherlv_7= ':' ( (lv_stops_8_0= ruleStartAtStop ) ) ( ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) ) )* ( (lv_stops_10_0= ruleTerminalStop ) ) )
            {
            // InternalSchedule.g:184:2: (otherlv_0= 'schedule' otherlv_1= 'train' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (lv_starttimes_4_0= ruleStartTime ) ) (otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) ) )* otherlv_7= ':' ( (lv_stops_8_0= ruleStartAtStop ) ) ( ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) ) )* ( (lv_stops_10_0= ruleTerminalStop ) ) )
            // InternalSchedule.g:185:3: otherlv_0= 'schedule' otherlv_1= 'train' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (lv_starttimes_4_0= ruleStartTime ) ) (otherlv_5= 'and' ( (lv_starttimes_6_0= ruleStartTime ) ) )* otherlv_7= ':' ( (lv_stops_8_0= ruleStartAtStop ) ) ( ( (lv_stops_9_1= ruleViaStop | lv_stops_9_2= ruleNormalStop ) ) )* ( (lv_stops_10_0= ruleTerminalStop ) )
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

                if ( (LA5_0==24||LA5_0==26) ) {
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

            // InternalSchedule.g:314:3: ( (lv_stops_10_0= ruleTerminalStop ) )
            // InternalSchedule.g:315:4: (lv_stops_10_0= ruleTerminalStop )
            {
            // InternalSchedule.g:315:4: (lv_stops_10_0= ruleTerminalStop )
            // InternalSchedule.g:316:5: lv_stops_10_0= ruleTerminalStop
            {

            					newCompositeNode(grammarAccess.getTrainScheduleAccess().getStopsTerminalStopParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_stops_10_0=ruleTerminalStop();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
            					}
            					add(
            						current,
            						"stops",
            						lv_stops_10_0,
            						"org.mdse.pts.schedule.dsl.Schedule.TerminalStop");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalSchedule.g:337:1: entryRuleStartAtStop returns [EObject current=null] : iv_ruleStartAtStop= ruleStartAtStop EOF ;
    public final EObject entryRuleStartAtStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartAtStop = null;


        try {
            // InternalSchedule.g:337:52: (iv_ruleStartAtStop= ruleStartAtStop EOF )
            // InternalSchedule.g:338:2: iv_ruleStartAtStop= ruleStartAtStop EOF
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
    // InternalSchedule.g:344:1: ruleStartAtStop returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) ) ;
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
            // InternalSchedule.g:350:2: ( (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) ) )
            // InternalSchedule.g:351:2: (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) )
            {
            // InternalSchedule.g:351:2: (otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) )
            // InternalSchedule.g:352:3: otherlv_0= 'start' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getStartAtStopAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getStartAtStopAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:360:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSchedule.g:361:4: (otherlv_2= RULE_STRING )
            {
            // InternalSchedule.g:361:4: (otherlv_2= RULE_STRING )
            // InternalSchedule.g:362:5: otherlv_2= RULE_STRING
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
            		
            otherlv_4=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getStartAtStopAccess().getPlatformKeyword_4());
            		
            // InternalSchedule.g:381:3: ( (lv_platform_5_0= RULE_ID ) )
            // InternalSchedule.g:382:4: (lv_platform_5_0= RULE_ID )
            {
            // InternalSchedule.g:382:4: (lv_platform_5_0= RULE_ID )
            // InternalSchedule.g:383:5: lv_platform_5_0= RULE_ID
            {
            lv_platform_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_platform_5_0, grammarAccess.getStartAtStopAccess().getPlatformIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartAtStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"platform",
            						lv_platform_5_0,
            						"org.mdse.pts.schedule.dsl.Schedule.ID");
            				

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
    // InternalSchedule.g:403:1: entryRuleViaStop returns [EObject current=null] : iv_ruleViaStop= ruleViaStop EOF ;
    public final EObject entryRuleViaStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViaStop = null;


        try {
            // InternalSchedule.g:403:48: (iv_ruleViaStop= ruleViaStop EOF )
            // InternalSchedule.g:404:2: iv_ruleViaStop= ruleViaStop EOF
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
    // InternalSchedule.g:410:1: ruleViaStop returns [EObject current=null] : (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'stop' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_ID ) ) otherlv_10= 'for' ( (lv_stoppedTime_11_0= RULE_INT ) ) otherlv_12= 'min' (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )? ) ;
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
            // InternalSchedule.g:416:2: ( (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'stop' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_ID ) ) otherlv_10= 'for' ( (lv_stoppedTime_11_0= RULE_INT ) ) otherlv_12= 'min' (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )? ) )
            // InternalSchedule.g:417:2: (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'stop' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_ID ) ) otherlv_10= 'for' ( (lv_stoppedTime_11_0= RULE_INT ) ) otherlv_12= 'min' (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )? )
            {
            // InternalSchedule.g:417:2: (otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'stop' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_ID ) ) otherlv_10= 'for' ( (lv_stoppedTime_11_0= RULE_INT ) ) otherlv_12= 'min' (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )? )
            // InternalSchedule.g:418:3: otherlv_0= 'drive' otherlv_1= 'via' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'and' otherlv_4= 'stop' otherlv_5= 'at' ( (otherlv_6= RULE_STRING ) ) otherlv_7= 'on' otherlv_8= 'platform' ( (lv_platform_9_0= RULE_ID ) ) otherlv_10= 'for' ( (lv_stoppedTime_11_0= RULE_INT ) ) otherlv_12= 'min' (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getViaStopAccess().getDriveKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getViaStopAccess().getViaKeyword_1());
            		
            // InternalSchedule.g:426:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSchedule.g:427:4: (otherlv_2= RULE_STRING )
            {
            // InternalSchedule.g:427:4: (otherlv_2= RULE_STRING )
            // InternalSchedule.g:428:5: otherlv_2= RULE_STRING
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
            		
            // InternalSchedule.g:451:3: ( (otherlv_6= RULE_STRING ) )
            // InternalSchedule.g:452:4: (otherlv_6= RULE_STRING )
            {
            // InternalSchedule.g:452:4: (otherlv_6= RULE_STRING )
            // InternalSchedule.g:453:5: otherlv_6= RULE_STRING
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
            		
            otherlv_8=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getViaStopAccess().getPlatformKeyword_8());
            		
            // InternalSchedule.g:472:3: ( (lv_platform_9_0= RULE_ID ) )
            // InternalSchedule.g:473:4: (lv_platform_9_0= RULE_ID )
            {
            // InternalSchedule.g:473:4: (lv_platform_9_0= RULE_ID )
            // InternalSchedule.g:474:5: lv_platform_9_0= RULE_ID
            {
            lv_platform_9_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_platform_9_0, grammarAccess.getViaStopAccess().getPlatformIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getViaStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"platform",
            						lv_platform_9_0,
            						"org.mdse.pts.schedule.dsl.Schedule.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_10, grammarAccess.getViaStopAccess().getForKeyword_10());
            		
            // InternalSchedule.g:494:3: ( (lv_stoppedTime_11_0= RULE_INT ) )
            // InternalSchedule.g:495:4: (lv_stoppedTime_11_0= RULE_INT )
            {
            // InternalSchedule.g:495:4: (lv_stoppedTime_11_0= RULE_INT )
            // InternalSchedule.g:496:5: lv_stoppedTime_11_0= RULE_INT
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
            		
            // InternalSchedule.g:516:3: (otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSchedule.g:517:4: otherlv_13= 'and' ( (lv_rotate_14_0= 'reverse' ) )
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getViaStopAccess().getAndKeyword_13_0());
                    			
                    // InternalSchedule.g:521:4: ( (lv_rotate_14_0= 'reverse' ) )
                    // InternalSchedule.g:522:5: (lv_rotate_14_0= 'reverse' )
                    {
                    // InternalSchedule.g:522:5: (lv_rotate_14_0= 'reverse' )
                    // InternalSchedule.g:523:6: lv_rotate_14_0= 'reverse'
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
    // InternalSchedule.g:540:1: entryRuleNormalStop returns [EObject current=null] : iv_ruleNormalStop= ruleNormalStop EOF ;
    public final EObject entryRuleNormalStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalStop = null;


        try {
            // InternalSchedule.g:540:51: (iv_ruleNormalStop= ruleNormalStop EOF )
            // InternalSchedule.g:541:2: iv_ruleNormalStop= ruleNormalStop EOF
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
    // InternalSchedule.g:547:1: ruleNormalStop returns [EObject current=null] : (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) otherlv_6= 'for' ( (lv_stoppedTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )? ) ;
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
            // InternalSchedule.g:553:2: ( (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) otherlv_6= 'for' ( (lv_stoppedTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )? ) )
            // InternalSchedule.g:554:2: (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) otherlv_6= 'for' ( (lv_stoppedTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )? )
            {
            // InternalSchedule.g:554:2: (otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) otherlv_6= 'for' ( (lv_stoppedTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )? )
            // InternalSchedule.g:555:3: otherlv_0= 'stop' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) otherlv_6= 'for' ( (lv_stoppedTime_7_0= RULE_INT ) ) otherlv_8= 'min' (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalStopAccess().getStopKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalStopAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:563:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSchedule.g:564:4: (otherlv_2= RULE_STRING )
            {
            // InternalSchedule.g:564:4: (otherlv_2= RULE_STRING )
            // InternalSchedule.g:565:5: otherlv_2= RULE_STRING
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
            		
            otherlv_4=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getNormalStopAccess().getPlatformKeyword_4());
            		
            // InternalSchedule.g:584:3: ( (lv_platform_5_0= RULE_ID ) )
            // InternalSchedule.g:585:4: (lv_platform_5_0= RULE_ID )
            {
            // InternalSchedule.g:585:4: (lv_platform_5_0= RULE_ID )
            // InternalSchedule.g:586:5: lv_platform_5_0= RULE_ID
            {
            lv_platform_5_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_platform_5_0, grammarAccess.getNormalStopAccess().getPlatformIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNormalStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"platform",
            						lv_platform_5_0,
            						"org.mdse.pts.schedule.dsl.Schedule.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getNormalStopAccess().getForKeyword_6());
            		
            // InternalSchedule.g:606:3: ( (lv_stoppedTime_7_0= RULE_INT ) )
            // InternalSchedule.g:607:4: (lv_stoppedTime_7_0= RULE_INT )
            {
            // InternalSchedule.g:607:4: (lv_stoppedTime_7_0= RULE_INT )
            // InternalSchedule.g:608:5: lv_stoppedTime_7_0= RULE_INT
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
            		
            // InternalSchedule.g:628:3: (otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSchedule.g:629:4: otherlv_9= 'and' ( (lv_rotate_10_0= 'reverse' ) )
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getNormalStopAccess().getAndKeyword_9_0());
                    			
                    // InternalSchedule.g:633:4: ( (lv_rotate_10_0= 'reverse' ) )
                    // InternalSchedule.g:634:5: (lv_rotate_10_0= 'reverse' )
                    {
                    // InternalSchedule.g:634:5: (lv_rotate_10_0= 'reverse' )
                    // InternalSchedule.g:635:6: lv_rotate_10_0= 'reverse'
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
    // InternalSchedule.g:652:1: entryRuleTerminalStop returns [EObject current=null] : iv_ruleTerminalStop= ruleTerminalStop EOF ;
    public final EObject entryRuleTerminalStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalStop = null;


        try {
            // InternalSchedule.g:652:53: (iv_ruleTerminalStop= ruleTerminalStop EOF )
            // InternalSchedule.g:653:2: iv_ruleTerminalStop= ruleTerminalStop EOF
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
    // InternalSchedule.g:659:1: ruleTerminalStop returns [EObject current=null] : (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) ) ;
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
            // InternalSchedule.g:665:2: ( (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) ) )
            // InternalSchedule.g:666:2: (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) )
            {
            // InternalSchedule.g:666:2: (otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) ) )
            // InternalSchedule.g:667:3: otherlv_0= 'terminate' otherlv_1= 'at' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'on' otherlv_4= 'platform' ( (lv_platform_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getTerminalStopAccess().getTerminateKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTerminalStopAccess().getAtKeyword_1());
            		
            // InternalSchedule.g:675:3: ( (otherlv_2= RULE_STRING ) )
            // InternalSchedule.g:676:4: (otherlv_2= RULE_STRING )
            {
            // InternalSchedule.g:676:4: (otherlv_2= RULE_STRING )
            // InternalSchedule.g:677:5: otherlv_2= RULE_STRING
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
            		
            otherlv_4=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getTerminalStopAccess().getPlatformKeyword_4());
            		
            // InternalSchedule.g:696:3: ( (lv_platform_5_0= RULE_ID ) )
            // InternalSchedule.g:697:4: (lv_platform_5_0= RULE_ID )
            {
            // InternalSchedule.g:697:4: (lv_platform_5_0= RULE_ID )
            // InternalSchedule.g:698:5: lv_platform_5_0= RULE_ID
            {
            lv_platform_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_platform_5_0, grammarAccess.getTerminalStopAccess().getPlatformIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerminalStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"platform",
            						lv_platform_5_0,
            						"org.mdse.pts.schedule.dsl.Schedule.ID");
            				

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


    // $ANTLR start "entryRuleStartTime"
    // InternalSchedule.g:718:1: entryRuleStartTime returns [EObject current=null] : iv_ruleStartTime= ruleStartTime EOF ;
    public final EObject entryRuleStartTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartTime = null;


        try {
            // InternalSchedule.g:718:50: (iv_ruleStartTime= ruleStartTime EOF )
            // InternalSchedule.g:719:2: iv_ruleStartTime= ruleStartTime EOF
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
    // InternalSchedule.g:725:1: ruleStartTime returns [EObject current=null] : ( ( (lv_weekdays_0_0= ruleWeekday ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )* otherlv_3= 'at' ( (lv_timestamps_4_0= ruleTime ) ) (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )* ) ;
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
            // InternalSchedule.g:731:2: ( ( ( (lv_weekdays_0_0= ruleWeekday ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )* otherlv_3= 'at' ( (lv_timestamps_4_0= ruleTime ) ) (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )* ) )
            // InternalSchedule.g:732:2: ( ( (lv_weekdays_0_0= ruleWeekday ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )* otherlv_3= 'at' ( (lv_timestamps_4_0= ruleTime ) ) (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )* )
            {
            // InternalSchedule.g:732:2: ( ( (lv_weekdays_0_0= ruleWeekday ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )* otherlv_3= 'at' ( (lv_timestamps_4_0= ruleTime ) ) (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )* )
            // InternalSchedule.g:733:3: ( (lv_weekdays_0_0= ruleWeekday ) ) (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )* otherlv_3= 'at' ( (lv_timestamps_4_0= ruleTime ) ) (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )*
            {
            // InternalSchedule.g:733:3: ( (lv_weekdays_0_0= ruleWeekday ) )
            // InternalSchedule.g:734:4: (lv_weekdays_0_0= ruleWeekday )
            {
            // InternalSchedule.g:734:4: (lv_weekdays_0_0= ruleWeekday )
            // InternalSchedule.g:735:5: lv_weekdays_0_0= ruleWeekday
            {

            					newCompositeNode(grammarAccess.getStartTimeAccess().getWeekdaysWeekdayEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalSchedule.g:752:3: (otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSchedule.g:753:4: otherlv_1= ',' ( (lv_weekdays_2_0= ruleWeekday ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStartTimeAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalSchedule.g:757:4: ( (lv_weekdays_2_0= ruleWeekday ) )
            	    // InternalSchedule.g:758:5: (lv_weekdays_2_0= ruleWeekday )
            	    {
            	    // InternalSchedule.g:758:5: (lv_weekdays_2_0= ruleWeekday )
            	    // InternalSchedule.g:759:6: lv_weekdays_2_0= ruleWeekday
            	    {

            	    						newCompositeNode(grammarAccess.getStartTimeAccess().getWeekdaysWeekdayEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getStartTimeAccess().getAtKeyword_2());
            		
            // InternalSchedule.g:781:3: ( (lv_timestamps_4_0= ruleTime ) )
            // InternalSchedule.g:782:4: (lv_timestamps_4_0= ruleTime )
            {
            // InternalSchedule.g:782:4: (lv_timestamps_4_0= ruleTime )
            // InternalSchedule.g:783:5: lv_timestamps_4_0= ruleTime
            {

            					newCompositeNode(grammarAccess.getStartTimeAccess().getTimestampsTimeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalSchedule.g:800:3: (otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSchedule.g:801:4: otherlv_5= ',' ( (lv_timestamps_6_0= ruleTime ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_21); 

            	    				newLeafNode(otherlv_5, grammarAccess.getStartTimeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSchedule.g:805:4: ( (lv_timestamps_6_0= ruleTime ) )
            	    // InternalSchedule.g:806:5: (lv_timestamps_6_0= ruleTime )
            	    {
            	    // InternalSchedule.g:806:5: (lv_timestamps_6_0= ruleTime )
            	    // InternalSchedule.g:807:6: lv_timestamps_6_0= ruleTime
            	    {

            	    						newCompositeNode(grammarAccess.getStartTimeAccess().getTimestampsTimeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
            	    break loop9;
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
    // InternalSchedule.g:829:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalSchedule.g:829:45: (iv_ruleTime= ruleTime EOF )
            // InternalSchedule.g:830:2: iv_ruleTime= ruleTime EOF
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
    // InternalSchedule.g:836:1: ruleTime returns [EObject current=null] : ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minute_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_hour_0_0=null;
        Token otherlv_1=null;
        Token lv_minute_2_0=null;


        	enterRule();

        try {
            // InternalSchedule.g:842:2: ( ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minute_2_0= RULE_INT ) ) ) )
            // InternalSchedule.g:843:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minute_2_0= RULE_INT ) ) )
            {
            // InternalSchedule.g:843:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minute_2_0= RULE_INT ) ) )
            // InternalSchedule.g:844:3: ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minute_2_0= RULE_INT ) )
            {
            // InternalSchedule.g:844:3: ( (lv_hour_0_0= RULE_INT ) )
            // InternalSchedule.g:845:4: (lv_hour_0_0= RULE_INT )
            {
            // InternalSchedule.g:845:4: (lv_hour_0_0= RULE_INT )
            // InternalSchedule.g:846:5: lv_hour_0_0= RULE_INT
            {
            lv_hour_0_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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
            		
            // InternalSchedule.g:866:3: ( (lv_minute_2_0= RULE_INT ) )
            // InternalSchedule.g:867:4: (lv_minute_2_0= RULE_INT )
            {
            // InternalSchedule.g:867:4: (lv_minute_2_0= RULE_INT )
            // InternalSchedule.g:868:5: lv_minute_2_0= RULE_INT
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
    // InternalSchedule.g:888:1: ruleWeekday returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
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
            // InternalSchedule.g:894:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalSchedule.g:895:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalSchedule.g:895:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            case 34:
                {
                alt10=5;
                }
                break;
            case 35:
                {
                alt10=6;
                }
                break;
            case 36:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSchedule.g:896:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalSchedule.g:896:3: (enumLiteral_0= 'Monday' )
                    // InternalSchedule.g:897:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getMONDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekdayAccess().getMONDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSchedule.g:904:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalSchedule.g:904:3: (enumLiteral_1= 'Tuesday' )
                    // InternalSchedule.g:905:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getTUESDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekdayAccess().getTUESDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSchedule.g:912:3: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalSchedule.g:912:3: (enumLiteral_2= 'Wednesday' )
                    // InternalSchedule.g:913:4: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getWEDNESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekdayAccess().getWEDNESDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSchedule.g:920:3: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalSchedule.g:920:3: (enumLiteral_3= 'Thursday' )
                    // InternalSchedule.g:921:4: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getTHURSDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekdayAccess().getTHURSDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSchedule.g:928:3: (enumLiteral_4= 'Friday' )
                    {
                    // InternalSchedule.g:928:3: (enumLiteral_4= 'Friday' )
                    // InternalSchedule.g:929:4: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getFRIDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekdayAccess().getFRIDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSchedule.g:936:3: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalSchedule.g:936:3: (enumLiteral_5= 'Saturday' )
                    // InternalSchedule.g:937:4: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getSATURDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekdayAccess().getSATURDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSchedule.g:944:3: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalSchedule.g:944:3: (enumLiteral_6= 'Sunday' )
                    // InternalSchedule.g:945:4: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getWeekdayAccess().getSUNDAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getWeekdayAccess().getSUNDAYEnumLiteralDeclaration_6());
                    			

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
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100000L});

}