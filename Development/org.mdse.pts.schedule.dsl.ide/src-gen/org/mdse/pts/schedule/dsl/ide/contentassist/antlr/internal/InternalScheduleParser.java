package org.mdse.pts.schedule.dsl.ide.contentassist.antlr.internal;

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
import org.mdse.pts.schedule.dsl.services.ScheduleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScheduleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_LETTER", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "'schedule'", "'for'", "'with'", "';'", "','", "'train'", "'on'", "':'", "'and'", "'start'", "'at'", "'platform'", "'drive'", "'via'", "'stop'", "'min'", "'terminate'", "'reverse'"
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

    	public void setGrammarAccess(ScheduleGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSchedule"
    // InternalSchedule.g:53:1: entryRuleSchedule : ruleSchedule EOF ;
    public final void entryRuleSchedule() throws RecognitionException {
        try {
            // InternalSchedule.g:54:1: ( ruleSchedule EOF )
            // InternalSchedule.g:55:1: ruleSchedule EOF
            {
             before(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_1);
            ruleSchedule();

            state._fsp--;

             after(grammarAccess.getScheduleRule()); 
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
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // InternalSchedule.g:62:1: ruleSchedule : ( ( rule__Schedule__Group__0 ) ) ;
    public final void ruleSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:66:2: ( ( ( rule__Schedule__Group__0 ) ) )
            // InternalSchedule.g:67:2: ( ( rule__Schedule__Group__0 ) )
            {
            // InternalSchedule.g:67:2: ( ( rule__Schedule__Group__0 ) )
            // InternalSchedule.g:68:3: ( rule__Schedule__Group__0 )
            {
             before(grammarAccess.getScheduleAccess().getGroup()); 
            // InternalSchedule.g:69:3: ( rule__Schedule__Group__0 )
            // InternalSchedule.g:69:4: rule__Schedule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleTrainSchedule"
    // InternalSchedule.g:78:1: entryRuleTrainSchedule : ruleTrainSchedule EOF ;
    public final void entryRuleTrainSchedule() throws RecognitionException {
        try {
            // InternalSchedule.g:79:1: ( ruleTrainSchedule EOF )
            // InternalSchedule.g:80:1: ruleTrainSchedule EOF
            {
             before(grammarAccess.getTrainScheduleRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainSchedule();

            state._fsp--;

             after(grammarAccess.getTrainScheduleRule()); 
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
    // $ANTLR end "entryRuleTrainSchedule"


    // $ANTLR start "ruleTrainSchedule"
    // InternalSchedule.g:87:1: ruleTrainSchedule : ( ( rule__TrainSchedule__Group__0 ) ) ;
    public final void ruleTrainSchedule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:91:2: ( ( ( rule__TrainSchedule__Group__0 ) ) )
            // InternalSchedule.g:92:2: ( ( rule__TrainSchedule__Group__0 ) )
            {
            // InternalSchedule.g:92:2: ( ( rule__TrainSchedule__Group__0 ) )
            // InternalSchedule.g:93:3: ( rule__TrainSchedule__Group__0 )
            {
             before(grammarAccess.getTrainScheduleAccess().getGroup()); 
            // InternalSchedule.g:94:3: ( rule__TrainSchedule__Group__0 )
            // InternalSchedule.g:94:4: rule__TrainSchedule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainSchedule"


    // $ANTLR start "entryRuleStartAtStop"
    // InternalSchedule.g:103:1: entryRuleStartAtStop : ruleStartAtStop EOF ;
    public final void entryRuleStartAtStop() throws RecognitionException {
        try {
            // InternalSchedule.g:104:1: ( ruleStartAtStop EOF )
            // InternalSchedule.g:105:1: ruleStartAtStop EOF
            {
             before(grammarAccess.getStartAtStopRule()); 
            pushFollow(FOLLOW_1);
            ruleStartAtStop();

            state._fsp--;

             after(grammarAccess.getStartAtStopRule()); 
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
    // $ANTLR end "entryRuleStartAtStop"


    // $ANTLR start "ruleStartAtStop"
    // InternalSchedule.g:112:1: ruleStartAtStop : ( ( rule__StartAtStop__Group__0 ) ) ;
    public final void ruleStartAtStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:116:2: ( ( ( rule__StartAtStop__Group__0 ) ) )
            // InternalSchedule.g:117:2: ( ( rule__StartAtStop__Group__0 ) )
            {
            // InternalSchedule.g:117:2: ( ( rule__StartAtStop__Group__0 ) )
            // InternalSchedule.g:118:3: ( rule__StartAtStop__Group__0 )
            {
             before(grammarAccess.getStartAtStopAccess().getGroup()); 
            // InternalSchedule.g:119:3: ( rule__StartAtStop__Group__0 )
            // InternalSchedule.g:119:4: rule__StartAtStop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartAtStop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartAtStopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartAtStop"


    // $ANTLR start "entryRuleViaStop"
    // InternalSchedule.g:128:1: entryRuleViaStop : ruleViaStop EOF ;
    public final void entryRuleViaStop() throws RecognitionException {
        try {
            // InternalSchedule.g:129:1: ( ruleViaStop EOF )
            // InternalSchedule.g:130:1: ruleViaStop EOF
            {
             before(grammarAccess.getViaStopRule()); 
            pushFollow(FOLLOW_1);
            ruleViaStop();

            state._fsp--;

             after(grammarAccess.getViaStopRule()); 
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
    // $ANTLR end "entryRuleViaStop"


    // $ANTLR start "ruleViaStop"
    // InternalSchedule.g:137:1: ruleViaStop : ( ( rule__ViaStop__Group__0 ) ) ;
    public final void ruleViaStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:141:2: ( ( ( rule__ViaStop__Group__0 ) ) )
            // InternalSchedule.g:142:2: ( ( rule__ViaStop__Group__0 ) )
            {
            // InternalSchedule.g:142:2: ( ( rule__ViaStop__Group__0 ) )
            // InternalSchedule.g:143:3: ( rule__ViaStop__Group__0 )
            {
             before(grammarAccess.getViaStopAccess().getGroup()); 
            // InternalSchedule.g:144:3: ( rule__ViaStop__Group__0 )
            // InternalSchedule.g:144:4: rule__ViaStop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViaStopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViaStop"


    // $ANTLR start "entryRuleNormalStop"
    // InternalSchedule.g:153:1: entryRuleNormalStop : ruleNormalStop EOF ;
    public final void entryRuleNormalStop() throws RecognitionException {
        try {
            // InternalSchedule.g:154:1: ( ruleNormalStop EOF )
            // InternalSchedule.g:155:1: ruleNormalStop EOF
            {
             before(grammarAccess.getNormalStopRule()); 
            pushFollow(FOLLOW_1);
            ruleNormalStop();

            state._fsp--;

             after(grammarAccess.getNormalStopRule()); 
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
    // $ANTLR end "entryRuleNormalStop"


    // $ANTLR start "ruleNormalStop"
    // InternalSchedule.g:162:1: ruleNormalStop : ( ( rule__NormalStop__Group__0 ) ) ;
    public final void ruleNormalStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:166:2: ( ( ( rule__NormalStop__Group__0 ) ) )
            // InternalSchedule.g:167:2: ( ( rule__NormalStop__Group__0 ) )
            {
            // InternalSchedule.g:167:2: ( ( rule__NormalStop__Group__0 ) )
            // InternalSchedule.g:168:3: ( rule__NormalStop__Group__0 )
            {
             before(grammarAccess.getNormalStopAccess().getGroup()); 
            // InternalSchedule.g:169:3: ( rule__NormalStop__Group__0 )
            // InternalSchedule.g:169:4: rule__NormalStop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NormalStop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormalStopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNormalStop"


    // $ANTLR start "entryRuleTerminalStop"
    // InternalSchedule.g:178:1: entryRuleTerminalStop : ruleTerminalStop EOF ;
    public final void entryRuleTerminalStop() throws RecognitionException {
        try {
            // InternalSchedule.g:179:1: ( ruleTerminalStop EOF )
            // InternalSchedule.g:180:1: ruleTerminalStop EOF
            {
             before(grammarAccess.getTerminalStopRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminalStop();

            state._fsp--;

             after(grammarAccess.getTerminalStopRule()); 
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
    // $ANTLR end "entryRuleTerminalStop"


    // $ANTLR start "ruleTerminalStop"
    // InternalSchedule.g:187:1: ruleTerminalStop : ( ( rule__TerminalStop__Group__0 ) ) ;
    public final void ruleTerminalStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:191:2: ( ( ( rule__TerminalStop__Group__0 ) ) )
            // InternalSchedule.g:192:2: ( ( rule__TerminalStop__Group__0 ) )
            {
            // InternalSchedule.g:192:2: ( ( rule__TerminalStop__Group__0 ) )
            // InternalSchedule.g:193:3: ( rule__TerminalStop__Group__0 )
            {
             before(grammarAccess.getTerminalStopAccess().getGroup()); 
            // InternalSchedule.g:194:3: ( rule__TerminalStop__Group__0 )
            // InternalSchedule.g:194:4: rule__TerminalStop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TerminalStop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminalStopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalStop"


    // $ANTLR start "entryRuleStartTime"
    // InternalSchedule.g:203:1: entryRuleStartTime : ruleStartTime EOF ;
    public final void entryRuleStartTime() throws RecognitionException {
        try {
            // InternalSchedule.g:204:1: ( ruleStartTime EOF )
            // InternalSchedule.g:205:1: ruleStartTime EOF
            {
             before(grammarAccess.getStartTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleStartTime();

            state._fsp--;

             after(grammarAccess.getStartTimeRule()); 
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
    // $ANTLR end "entryRuleStartTime"


    // $ANTLR start "ruleStartTime"
    // InternalSchedule.g:212:1: ruleStartTime : ( ( rule__StartTime__Group__0 ) ) ;
    public final void ruleStartTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:216:2: ( ( ( rule__StartTime__Group__0 ) ) )
            // InternalSchedule.g:217:2: ( ( rule__StartTime__Group__0 ) )
            {
            // InternalSchedule.g:217:2: ( ( rule__StartTime__Group__0 ) )
            // InternalSchedule.g:218:3: ( rule__StartTime__Group__0 )
            {
             before(grammarAccess.getStartTimeAccess().getGroup()); 
            // InternalSchedule.g:219:3: ( rule__StartTime__Group__0 )
            // InternalSchedule.g:219:4: rule__StartTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartTime"


    // $ANTLR start "entryRuleTime"
    // InternalSchedule.g:228:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalSchedule.g:229:1: ( ruleTime EOF )
            // InternalSchedule.g:230:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalSchedule.g:237:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:241:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalSchedule.g:242:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalSchedule.g:242:2: ( ( rule__Time__Group__0 ) )
            // InternalSchedule.g:243:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalSchedule.g:244:3: ( rule__Time__Group__0 )
            // InternalSchedule.g:244:4: rule__Time__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "ruleWeekday"
    // InternalSchedule.g:253:1: ruleWeekday : ( ( rule__Weekday__Alternatives ) ) ;
    public final void ruleWeekday() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:257:1: ( ( ( rule__Weekday__Alternatives ) ) )
            // InternalSchedule.g:258:2: ( ( rule__Weekday__Alternatives ) )
            {
            // InternalSchedule.g:258:2: ( ( rule__Weekday__Alternatives ) )
            // InternalSchedule.g:259:3: ( rule__Weekday__Alternatives )
            {
             before(grammarAccess.getWeekdayAccess().getAlternatives()); 
            // InternalSchedule.g:260:3: ( rule__Weekday__Alternatives )
            // InternalSchedule.g:260:4: rule__Weekday__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Weekday__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWeekdayAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeekday"


    // $ANTLR start "rule__TrainSchedule__StopsAlternatives_8_0"
    // InternalSchedule.g:268:1: rule__TrainSchedule__StopsAlternatives_8_0 : ( ( ruleViaStop ) | ( ruleNormalStop ) );
    public final void rule__TrainSchedule__StopsAlternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:272:1: ( ( ruleViaStop ) | ( ruleNormalStop ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==31) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSchedule.g:273:2: ( ruleViaStop )
                    {
                    // InternalSchedule.g:273:2: ( ruleViaStop )
                    // InternalSchedule.g:274:3: ruleViaStop
                    {
                     before(grammarAccess.getTrainScheduleAccess().getStopsViaStopParserRuleCall_8_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleViaStop();

                    state._fsp--;

                     after(grammarAccess.getTrainScheduleAccess().getStopsViaStopParserRuleCall_8_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSchedule.g:279:2: ( ruleNormalStop )
                    {
                    // InternalSchedule.g:279:2: ( ruleNormalStop )
                    // InternalSchedule.g:280:3: ruleNormalStop
                    {
                     before(grammarAccess.getTrainScheduleAccess().getStopsNormalStopParserRuleCall_8_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNormalStop();

                    state._fsp--;

                     after(grammarAccess.getTrainScheduleAccess().getStopsNormalStopParserRuleCall_8_0_1()); 

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
    // $ANTLR end "rule__TrainSchedule__StopsAlternatives_8_0"


    // $ANTLR start "rule__Weekday__Alternatives"
    // InternalSchedule.g:289:1: rule__Weekday__Alternatives : ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) );
    public final void rule__Weekday__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:293:1: ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSchedule.g:294:2: ( ( 'Monday' ) )
                    {
                    // InternalSchedule.g:294:2: ( ( 'Monday' ) )
                    // InternalSchedule.g:295:3: ( 'Monday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getMONDAYEnumLiteralDeclaration_0()); 
                    // InternalSchedule.g:296:3: ( 'Monday' )
                    // InternalSchedule.g:296:4: 'Monday'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getMONDAYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSchedule.g:300:2: ( ( 'Tuesday' ) )
                    {
                    // InternalSchedule.g:300:2: ( ( 'Tuesday' ) )
                    // InternalSchedule.g:301:3: ( 'Tuesday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getTUESDAYEnumLiteralDeclaration_1()); 
                    // InternalSchedule.g:302:3: ( 'Tuesday' )
                    // InternalSchedule.g:302:4: 'Tuesday'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getTUESDAYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSchedule.g:306:2: ( ( 'Wednesday' ) )
                    {
                    // InternalSchedule.g:306:2: ( ( 'Wednesday' ) )
                    // InternalSchedule.g:307:3: ( 'Wednesday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getWEDNESDAYEnumLiteralDeclaration_2()); 
                    // InternalSchedule.g:308:3: ( 'Wednesday' )
                    // InternalSchedule.g:308:4: 'Wednesday'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getWEDNESDAYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSchedule.g:312:2: ( ( 'Thursday' ) )
                    {
                    // InternalSchedule.g:312:2: ( ( 'Thursday' ) )
                    // InternalSchedule.g:313:3: ( 'Thursday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getTHURSDAYEnumLiteralDeclaration_3()); 
                    // InternalSchedule.g:314:3: ( 'Thursday' )
                    // InternalSchedule.g:314:4: 'Thursday'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getTHURSDAYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSchedule.g:318:2: ( ( 'Friday' ) )
                    {
                    // InternalSchedule.g:318:2: ( ( 'Friday' ) )
                    // InternalSchedule.g:319:3: ( 'Friday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getFRIDAYEnumLiteralDeclaration_4()); 
                    // InternalSchedule.g:320:3: ( 'Friday' )
                    // InternalSchedule.g:320:4: 'Friday'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getFRIDAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSchedule.g:324:2: ( ( 'Saturday' ) )
                    {
                    // InternalSchedule.g:324:2: ( ( 'Saturday' ) )
                    // InternalSchedule.g:325:3: ( 'Saturday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getSATURDAYEnumLiteralDeclaration_5()); 
                    // InternalSchedule.g:326:3: ( 'Saturday' )
                    // InternalSchedule.g:326:4: 'Saturday'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getSATURDAYEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSchedule.g:330:2: ( ( 'Sunday' ) )
                    {
                    // InternalSchedule.g:330:2: ( ( 'Sunday' ) )
                    // InternalSchedule.g:331:3: ( 'Sunday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getSUNDAYEnumLiteralDeclaration_6()); 
                    // InternalSchedule.g:332:3: ( 'Sunday' )
                    // InternalSchedule.g:332:4: 'Sunday'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getSUNDAYEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__Weekday__Alternatives"


    // $ANTLR start "rule__Schedule__Group__0"
    // InternalSchedule.g:340:1: rule__Schedule__Group__0 : rule__Schedule__Group__0__Impl rule__Schedule__Group__1 ;
    public final void rule__Schedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:344:1: ( rule__Schedule__Group__0__Impl rule__Schedule__Group__1 )
            // InternalSchedule.g:345:2: rule__Schedule__Group__0__Impl rule__Schedule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Schedule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__0"


    // $ANTLR start "rule__Schedule__Group__0__Impl"
    // InternalSchedule.g:352:1: rule__Schedule__Group__0__Impl : ( 'schedule' ) ;
    public final void rule__Schedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:356:1: ( ( 'schedule' ) )
            // InternalSchedule.g:357:1: ( 'schedule' )
            {
            // InternalSchedule.g:357:1: ( 'schedule' )
            // InternalSchedule.g:358:2: 'schedule'
            {
             before(grammarAccess.getScheduleAccess().getScheduleKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getScheduleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__0__Impl"


    // $ANTLR start "rule__Schedule__Group__1"
    // InternalSchedule.g:367:1: rule__Schedule__Group__1 : rule__Schedule__Group__1__Impl rule__Schedule__Group__2 ;
    public final void rule__Schedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:371:1: ( rule__Schedule__Group__1__Impl rule__Schedule__Group__2 )
            // InternalSchedule.g:372:2: rule__Schedule__Group__1__Impl rule__Schedule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Schedule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__1"


    // $ANTLR start "rule__Schedule__Group__1__Impl"
    // InternalSchedule.g:379:1: rule__Schedule__Group__1__Impl : ( 'for' ) ;
    public final void rule__Schedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:383:1: ( ( 'for' ) )
            // InternalSchedule.g:384:1: ( 'for' )
            {
            // InternalSchedule.g:384:1: ( 'for' )
            // InternalSchedule.g:385:2: 'for'
            {
             before(grammarAccess.getScheduleAccess().getForKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getForKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__1__Impl"


    // $ANTLR start "rule__Schedule__Group__2"
    // InternalSchedule.g:394:1: rule__Schedule__Group__2 : rule__Schedule__Group__2__Impl rule__Schedule__Group__3 ;
    public final void rule__Schedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:398:1: ( rule__Schedule__Group__2__Impl rule__Schedule__Group__3 )
            // InternalSchedule.g:399:2: rule__Schedule__Group__2__Impl rule__Schedule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Schedule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__2"


    // $ANTLR start "rule__Schedule__Group__2__Impl"
    // InternalSchedule.g:406:1: rule__Schedule__Group__2__Impl : ( ( rule__Schedule__NetworkAssignment_2 ) ) ;
    public final void rule__Schedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:410:1: ( ( ( rule__Schedule__NetworkAssignment_2 ) ) )
            // InternalSchedule.g:411:1: ( ( rule__Schedule__NetworkAssignment_2 ) )
            {
            // InternalSchedule.g:411:1: ( ( rule__Schedule__NetworkAssignment_2 ) )
            // InternalSchedule.g:412:2: ( rule__Schedule__NetworkAssignment_2 )
            {
             before(grammarAccess.getScheduleAccess().getNetworkAssignment_2()); 
            // InternalSchedule.g:413:2: ( rule__Schedule__NetworkAssignment_2 )
            // InternalSchedule.g:413:3: rule__Schedule__NetworkAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__NetworkAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getNetworkAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__2__Impl"


    // $ANTLR start "rule__Schedule__Group__3"
    // InternalSchedule.g:421:1: rule__Schedule__Group__3 : rule__Schedule__Group__3__Impl rule__Schedule__Group__4 ;
    public final void rule__Schedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:425:1: ( rule__Schedule__Group__3__Impl rule__Schedule__Group__4 )
            // InternalSchedule.g:426:2: rule__Schedule__Group__3__Impl rule__Schedule__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Schedule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__3"


    // $ANTLR start "rule__Schedule__Group__3__Impl"
    // InternalSchedule.g:433:1: rule__Schedule__Group__3__Impl : ( 'with' ) ;
    public final void rule__Schedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:437:1: ( ( 'with' ) )
            // InternalSchedule.g:438:1: ( 'with' )
            {
            // InternalSchedule.g:438:1: ( 'with' )
            // InternalSchedule.g:439:2: 'with'
            {
             before(grammarAccess.getScheduleAccess().getWithKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__3__Impl"


    // $ANTLR start "rule__Schedule__Group__4"
    // InternalSchedule.g:448:1: rule__Schedule__Group__4 : rule__Schedule__Group__4__Impl rule__Schedule__Group__5 ;
    public final void rule__Schedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:452:1: ( rule__Schedule__Group__4__Impl rule__Schedule__Group__5 )
            // InternalSchedule.g:453:2: rule__Schedule__Group__4__Impl rule__Schedule__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Schedule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__4"


    // $ANTLR start "rule__Schedule__Group__4__Impl"
    // InternalSchedule.g:460:1: rule__Schedule__Group__4__Impl : ( ( rule__Schedule__DepotAssignment_4 ) ) ;
    public final void rule__Schedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:464:1: ( ( ( rule__Schedule__DepotAssignment_4 ) ) )
            // InternalSchedule.g:465:1: ( ( rule__Schedule__DepotAssignment_4 ) )
            {
            // InternalSchedule.g:465:1: ( ( rule__Schedule__DepotAssignment_4 ) )
            // InternalSchedule.g:466:2: ( rule__Schedule__DepotAssignment_4 )
            {
             before(grammarAccess.getScheduleAccess().getDepotAssignment_4()); 
            // InternalSchedule.g:467:2: ( rule__Schedule__DepotAssignment_4 )
            // InternalSchedule.g:467:3: rule__Schedule__DepotAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__DepotAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getDepotAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__4__Impl"


    // $ANTLR start "rule__Schedule__Group__5"
    // InternalSchedule.g:475:1: rule__Schedule__Group__5 : rule__Schedule__Group__5__Impl rule__Schedule__Group__6 ;
    public final void rule__Schedule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:479:1: ( rule__Schedule__Group__5__Impl rule__Schedule__Group__6 )
            // InternalSchedule.g:480:2: rule__Schedule__Group__5__Impl rule__Schedule__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Schedule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__5"


    // $ANTLR start "rule__Schedule__Group__5__Impl"
    // InternalSchedule.g:487:1: rule__Schedule__Group__5__Impl : ( ( rule__Schedule__Group_5__0 )* ) ;
    public final void rule__Schedule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:491:1: ( ( ( rule__Schedule__Group_5__0 )* ) )
            // InternalSchedule.g:492:1: ( ( rule__Schedule__Group_5__0 )* )
            {
            // InternalSchedule.g:492:1: ( ( rule__Schedule__Group_5__0 )* )
            // InternalSchedule.g:493:2: ( rule__Schedule__Group_5__0 )*
            {
             before(grammarAccess.getScheduleAccess().getGroup_5()); 
            // InternalSchedule.g:494:2: ( rule__Schedule__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSchedule.g:494:3: rule__Schedule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Schedule__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getScheduleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__5__Impl"


    // $ANTLR start "rule__Schedule__Group__6"
    // InternalSchedule.g:502:1: rule__Schedule__Group__6 : rule__Schedule__Group__6__Impl rule__Schedule__Group__7 ;
    public final void rule__Schedule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:506:1: ( rule__Schedule__Group__6__Impl rule__Schedule__Group__7 )
            // InternalSchedule.g:507:2: rule__Schedule__Group__6__Impl rule__Schedule__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Schedule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__6"


    // $ANTLR start "rule__Schedule__Group__6__Impl"
    // InternalSchedule.g:514:1: rule__Schedule__Group__6__Impl : ( ';' ) ;
    public final void rule__Schedule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:518:1: ( ( ';' ) )
            // InternalSchedule.g:519:1: ( ';' )
            {
            // InternalSchedule.g:519:1: ( ';' )
            // InternalSchedule.g:520:2: ';'
            {
             before(grammarAccess.getScheduleAccess().getSemicolonKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__6__Impl"


    // $ANTLR start "rule__Schedule__Group__7"
    // InternalSchedule.g:529:1: rule__Schedule__Group__7 : rule__Schedule__Group__7__Impl ;
    public final void rule__Schedule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:533:1: ( rule__Schedule__Group__7__Impl )
            // InternalSchedule.g:534:2: rule__Schedule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__7"


    // $ANTLR start "rule__Schedule__Group__7__Impl"
    // InternalSchedule.g:540:1: rule__Schedule__Group__7__Impl : ( ( rule__Schedule__Group_7__0 )* ) ;
    public final void rule__Schedule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:544:1: ( ( ( rule__Schedule__Group_7__0 )* ) )
            // InternalSchedule.g:545:1: ( ( rule__Schedule__Group_7__0 )* )
            {
            // InternalSchedule.g:545:1: ( ( rule__Schedule__Group_7__0 )* )
            // InternalSchedule.g:546:2: ( rule__Schedule__Group_7__0 )*
            {
             before(grammarAccess.getScheduleAccess().getGroup_7()); 
            // InternalSchedule.g:547:2: ( rule__Schedule__Group_7__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSchedule.g:547:3: rule__Schedule__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Schedule__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getScheduleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group__7__Impl"


    // $ANTLR start "rule__Schedule__Group_5__0"
    // InternalSchedule.g:556:1: rule__Schedule__Group_5__0 : rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1 ;
    public final void rule__Schedule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:560:1: ( rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1 )
            // InternalSchedule.g:561:2: rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Schedule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_5__0"


    // $ANTLR start "rule__Schedule__Group_5__0__Impl"
    // InternalSchedule.g:568:1: rule__Schedule__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Schedule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:572:1: ( ( ',' ) )
            // InternalSchedule.g:573:1: ( ',' )
            {
            // InternalSchedule.g:573:1: ( ',' )
            // InternalSchedule.g:574:2: ','
            {
             before(grammarAccess.getScheduleAccess().getCommaKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_5__0__Impl"


    // $ANTLR start "rule__Schedule__Group_5__1"
    // InternalSchedule.g:583:1: rule__Schedule__Group_5__1 : rule__Schedule__Group_5__1__Impl ;
    public final void rule__Schedule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:587:1: ( rule__Schedule__Group_5__1__Impl )
            // InternalSchedule.g:588:2: rule__Schedule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_5__1"


    // $ANTLR start "rule__Schedule__Group_5__1__Impl"
    // InternalSchedule.g:594:1: rule__Schedule__Group_5__1__Impl : ( ( rule__Schedule__DepotAssignment_5_1 ) ) ;
    public final void rule__Schedule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:598:1: ( ( ( rule__Schedule__DepotAssignment_5_1 ) ) )
            // InternalSchedule.g:599:1: ( ( rule__Schedule__DepotAssignment_5_1 ) )
            {
            // InternalSchedule.g:599:1: ( ( rule__Schedule__DepotAssignment_5_1 ) )
            // InternalSchedule.g:600:2: ( rule__Schedule__DepotAssignment_5_1 )
            {
             before(grammarAccess.getScheduleAccess().getDepotAssignment_5_1()); 
            // InternalSchedule.g:601:2: ( rule__Schedule__DepotAssignment_5_1 )
            // InternalSchedule.g:601:3: rule__Schedule__DepotAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__DepotAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getDepotAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_5__1__Impl"


    // $ANTLR start "rule__Schedule__Group_7__0"
    // InternalSchedule.g:610:1: rule__Schedule__Group_7__0 : rule__Schedule__Group_7__0__Impl rule__Schedule__Group_7__1 ;
    public final void rule__Schedule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:614:1: ( rule__Schedule__Group_7__0__Impl rule__Schedule__Group_7__1 )
            // InternalSchedule.g:615:2: rule__Schedule__Group_7__0__Impl rule__Schedule__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__Schedule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schedule__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_7__0"


    // $ANTLR start "rule__Schedule__Group_7__0__Impl"
    // InternalSchedule.g:622:1: rule__Schedule__Group_7__0__Impl : ( ( rule__Schedule__TrainsAssignment_7_0 ) ) ;
    public final void rule__Schedule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:626:1: ( ( ( rule__Schedule__TrainsAssignment_7_0 ) ) )
            // InternalSchedule.g:627:1: ( ( rule__Schedule__TrainsAssignment_7_0 ) )
            {
            // InternalSchedule.g:627:1: ( ( rule__Schedule__TrainsAssignment_7_0 ) )
            // InternalSchedule.g:628:2: ( rule__Schedule__TrainsAssignment_7_0 )
            {
             before(grammarAccess.getScheduleAccess().getTrainsAssignment_7_0()); 
            // InternalSchedule.g:629:2: ( rule__Schedule__TrainsAssignment_7_0 )
            // InternalSchedule.g:629:3: rule__Schedule__TrainsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__TrainsAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getScheduleAccess().getTrainsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_7__0__Impl"


    // $ANTLR start "rule__Schedule__Group_7__1"
    // InternalSchedule.g:637:1: rule__Schedule__Group_7__1 : rule__Schedule__Group_7__1__Impl ;
    public final void rule__Schedule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:641:1: ( rule__Schedule__Group_7__1__Impl )
            // InternalSchedule.g:642:2: rule__Schedule__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schedule__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_7__1"


    // $ANTLR start "rule__Schedule__Group_7__1__Impl"
    // InternalSchedule.g:648:1: rule__Schedule__Group_7__1__Impl : ( ';' ) ;
    public final void rule__Schedule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:652:1: ( ( ';' ) )
            // InternalSchedule.g:653:1: ( ';' )
            {
            // InternalSchedule.g:653:1: ( ';' )
            // InternalSchedule.g:654:2: ';'
            {
             before(grammarAccess.getScheduleAccess().getSemicolonKeyword_7_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getSemicolonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__Group_7__1__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__0"
    // InternalSchedule.g:664:1: rule__TrainSchedule__Group__0 : rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1 ;
    public final void rule__TrainSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:668:1: ( rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1 )
            // InternalSchedule.g:669:2: rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TrainSchedule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__0"


    // $ANTLR start "rule__TrainSchedule__Group__0__Impl"
    // InternalSchedule.g:676:1: rule__TrainSchedule__Group__0__Impl : ( 'schedule' ) ;
    public final void rule__TrainSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:680:1: ( ( 'schedule' ) )
            // InternalSchedule.g:681:1: ( 'schedule' )
            {
            // InternalSchedule.g:681:1: ( 'schedule' )
            // InternalSchedule.g:682:2: 'schedule'
            {
             before(grammarAccess.getTrainScheduleAccess().getScheduleKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getScheduleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__0__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__1"
    // InternalSchedule.g:691:1: rule__TrainSchedule__Group__1 : rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2 ;
    public final void rule__TrainSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:695:1: ( rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2 )
            // InternalSchedule.g:696:2: rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TrainSchedule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__1"


    // $ANTLR start "rule__TrainSchedule__Group__1__Impl"
    // InternalSchedule.g:703:1: rule__TrainSchedule__Group__1__Impl : ( 'train' ) ;
    public final void rule__TrainSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:707:1: ( ( 'train' ) )
            // InternalSchedule.g:708:1: ( 'train' )
            {
            // InternalSchedule.g:708:1: ( 'train' )
            // InternalSchedule.g:709:2: 'train'
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getTrainKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__1__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__2"
    // InternalSchedule.g:718:1: rule__TrainSchedule__Group__2 : rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3 ;
    public final void rule__TrainSchedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:722:1: ( rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3 )
            // InternalSchedule.g:723:2: rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__TrainSchedule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__2"


    // $ANTLR start "rule__TrainSchedule__Group__2__Impl"
    // InternalSchedule.g:730:1: rule__TrainSchedule__Group__2__Impl : ( ( rule__TrainSchedule__TrainAssignment_2 ) ) ;
    public final void rule__TrainSchedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:734:1: ( ( ( rule__TrainSchedule__TrainAssignment_2 ) ) )
            // InternalSchedule.g:735:1: ( ( rule__TrainSchedule__TrainAssignment_2 ) )
            {
            // InternalSchedule.g:735:1: ( ( rule__TrainSchedule__TrainAssignment_2 ) )
            // InternalSchedule.g:736:2: ( rule__TrainSchedule__TrainAssignment_2 )
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainAssignment_2()); 
            // InternalSchedule.g:737:2: ( rule__TrainSchedule__TrainAssignment_2 )
            // InternalSchedule.g:737:3: rule__TrainSchedule__TrainAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__TrainAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getTrainAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__2__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__3"
    // InternalSchedule.g:745:1: rule__TrainSchedule__Group__3 : rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4 ;
    public final void rule__TrainSchedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:749:1: ( rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4 )
            // InternalSchedule.g:750:2: rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__TrainSchedule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__3"


    // $ANTLR start "rule__TrainSchedule__Group__3__Impl"
    // InternalSchedule.g:757:1: rule__TrainSchedule__Group__3__Impl : ( 'on' ) ;
    public final void rule__TrainSchedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:761:1: ( ( 'on' ) )
            // InternalSchedule.g:762:1: ( 'on' )
            {
            // InternalSchedule.g:762:1: ( 'on' )
            // InternalSchedule.g:763:2: 'on'
            {
             before(grammarAccess.getTrainScheduleAccess().getOnKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__3__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__4"
    // InternalSchedule.g:772:1: rule__TrainSchedule__Group__4 : rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5 ;
    public final void rule__TrainSchedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:776:1: ( rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5 )
            // InternalSchedule.g:777:2: rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__TrainSchedule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__4"


    // $ANTLR start "rule__TrainSchedule__Group__4__Impl"
    // InternalSchedule.g:784:1: rule__TrainSchedule__Group__4__Impl : ( ( rule__TrainSchedule__StarttimesAssignment_4 ) ) ;
    public final void rule__TrainSchedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:788:1: ( ( ( rule__TrainSchedule__StarttimesAssignment_4 ) ) )
            // InternalSchedule.g:789:1: ( ( rule__TrainSchedule__StarttimesAssignment_4 ) )
            {
            // InternalSchedule.g:789:1: ( ( rule__TrainSchedule__StarttimesAssignment_4 ) )
            // InternalSchedule.g:790:2: ( rule__TrainSchedule__StarttimesAssignment_4 )
            {
             before(grammarAccess.getTrainScheduleAccess().getStarttimesAssignment_4()); 
            // InternalSchedule.g:791:2: ( rule__TrainSchedule__StarttimesAssignment_4 )
            // InternalSchedule.g:791:3: rule__TrainSchedule__StarttimesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__StarttimesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getStarttimesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__4__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__5"
    // InternalSchedule.g:799:1: rule__TrainSchedule__Group__5 : rule__TrainSchedule__Group__5__Impl rule__TrainSchedule__Group__6 ;
    public final void rule__TrainSchedule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:803:1: ( rule__TrainSchedule__Group__5__Impl rule__TrainSchedule__Group__6 )
            // InternalSchedule.g:804:2: rule__TrainSchedule__Group__5__Impl rule__TrainSchedule__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__TrainSchedule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__5"


    // $ANTLR start "rule__TrainSchedule__Group__5__Impl"
    // InternalSchedule.g:811:1: rule__TrainSchedule__Group__5__Impl : ( ( rule__TrainSchedule__Group_5__0 )* ) ;
    public final void rule__TrainSchedule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:815:1: ( ( ( rule__TrainSchedule__Group_5__0 )* ) )
            // InternalSchedule.g:816:1: ( ( rule__TrainSchedule__Group_5__0 )* )
            {
            // InternalSchedule.g:816:1: ( ( rule__TrainSchedule__Group_5__0 )* )
            // InternalSchedule.g:817:2: ( rule__TrainSchedule__Group_5__0 )*
            {
             before(grammarAccess.getTrainScheduleAccess().getGroup_5()); 
            // InternalSchedule.g:818:2: ( rule__TrainSchedule__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSchedule.g:818:3: rule__TrainSchedule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TrainSchedule__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTrainScheduleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__5__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__6"
    // InternalSchedule.g:826:1: rule__TrainSchedule__Group__6 : rule__TrainSchedule__Group__6__Impl rule__TrainSchedule__Group__7 ;
    public final void rule__TrainSchedule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:830:1: ( rule__TrainSchedule__Group__6__Impl rule__TrainSchedule__Group__7 )
            // InternalSchedule.g:831:2: rule__TrainSchedule__Group__6__Impl rule__TrainSchedule__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__TrainSchedule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__6"


    // $ANTLR start "rule__TrainSchedule__Group__6__Impl"
    // InternalSchedule.g:838:1: rule__TrainSchedule__Group__6__Impl : ( ':' ) ;
    public final void rule__TrainSchedule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:842:1: ( ( ':' ) )
            // InternalSchedule.g:843:1: ( ':' )
            {
            // InternalSchedule.g:843:1: ( ':' )
            // InternalSchedule.g:844:2: ':'
            {
             before(grammarAccess.getTrainScheduleAccess().getColonKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__6__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__7"
    // InternalSchedule.g:853:1: rule__TrainSchedule__Group__7 : rule__TrainSchedule__Group__7__Impl rule__TrainSchedule__Group__8 ;
    public final void rule__TrainSchedule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:857:1: ( rule__TrainSchedule__Group__7__Impl rule__TrainSchedule__Group__8 )
            // InternalSchedule.g:858:2: rule__TrainSchedule__Group__7__Impl rule__TrainSchedule__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__TrainSchedule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__7"


    // $ANTLR start "rule__TrainSchedule__Group__7__Impl"
    // InternalSchedule.g:865:1: rule__TrainSchedule__Group__7__Impl : ( ( rule__TrainSchedule__StopsAssignment_7 ) ) ;
    public final void rule__TrainSchedule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:869:1: ( ( ( rule__TrainSchedule__StopsAssignment_7 ) ) )
            // InternalSchedule.g:870:1: ( ( rule__TrainSchedule__StopsAssignment_7 ) )
            {
            // InternalSchedule.g:870:1: ( ( rule__TrainSchedule__StopsAssignment_7 ) )
            // InternalSchedule.g:871:2: ( rule__TrainSchedule__StopsAssignment_7 )
            {
             before(grammarAccess.getTrainScheduleAccess().getStopsAssignment_7()); 
            // InternalSchedule.g:872:2: ( rule__TrainSchedule__StopsAssignment_7 )
            // InternalSchedule.g:872:3: rule__TrainSchedule__StopsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__StopsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getStopsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__7__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__8"
    // InternalSchedule.g:880:1: rule__TrainSchedule__Group__8 : rule__TrainSchedule__Group__8__Impl rule__TrainSchedule__Group__9 ;
    public final void rule__TrainSchedule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:884:1: ( rule__TrainSchedule__Group__8__Impl rule__TrainSchedule__Group__9 )
            // InternalSchedule.g:885:2: rule__TrainSchedule__Group__8__Impl rule__TrainSchedule__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__TrainSchedule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__8"


    // $ANTLR start "rule__TrainSchedule__Group__8__Impl"
    // InternalSchedule.g:892:1: rule__TrainSchedule__Group__8__Impl : ( ( rule__TrainSchedule__StopsAssignment_8 )* ) ;
    public final void rule__TrainSchedule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:896:1: ( ( ( rule__TrainSchedule__StopsAssignment_8 )* ) )
            // InternalSchedule.g:897:1: ( ( rule__TrainSchedule__StopsAssignment_8 )* )
            {
            // InternalSchedule.g:897:1: ( ( rule__TrainSchedule__StopsAssignment_8 )* )
            // InternalSchedule.g:898:2: ( rule__TrainSchedule__StopsAssignment_8 )*
            {
             before(grammarAccess.getTrainScheduleAccess().getStopsAssignment_8()); 
            // InternalSchedule.g:899:2: ( rule__TrainSchedule__StopsAssignment_8 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31||LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSchedule.g:899:3: rule__TrainSchedule__StopsAssignment_8
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TrainSchedule__StopsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTrainScheduleAccess().getStopsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__8__Impl"


    // $ANTLR start "rule__TrainSchedule__Group__9"
    // InternalSchedule.g:907:1: rule__TrainSchedule__Group__9 : rule__TrainSchedule__Group__9__Impl ;
    public final void rule__TrainSchedule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:911:1: ( rule__TrainSchedule__Group__9__Impl )
            // InternalSchedule.g:912:2: rule__TrainSchedule__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__9"


    // $ANTLR start "rule__TrainSchedule__Group__9__Impl"
    // InternalSchedule.g:918:1: rule__TrainSchedule__Group__9__Impl : ( ( rule__TrainSchedule__StopsAssignment_9 ) ) ;
    public final void rule__TrainSchedule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:922:1: ( ( ( rule__TrainSchedule__StopsAssignment_9 ) ) )
            // InternalSchedule.g:923:1: ( ( rule__TrainSchedule__StopsAssignment_9 ) )
            {
            // InternalSchedule.g:923:1: ( ( rule__TrainSchedule__StopsAssignment_9 ) )
            // InternalSchedule.g:924:2: ( rule__TrainSchedule__StopsAssignment_9 )
            {
             before(grammarAccess.getTrainScheduleAccess().getStopsAssignment_9()); 
            // InternalSchedule.g:925:2: ( rule__TrainSchedule__StopsAssignment_9 )
            // InternalSchedule.g:925:3: rule__TrainSchedule__StopsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__StopsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getStopsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group__9__Impl"


    // $ANTLR start "rule__TrainSchedule__Group_5__0"
    // InternalSchedule.g:934:1: rule__TrainSchedule__Group_5__0 : rule__TrainSchedule__Group_5__0__Impl rule__TrainSchedule__Group_5__1 ;
    public final void rule__TrainSchedule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:938:1: ( rule__TrainSchedule__Group_5__0__Impl rule__TrainSchedule__Group_5__1 )
            // InternalSchedule.g:939:2: rule__TrainSchedule__Group_5__0__Impl rule__TrainSchedule__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__TrainSchedule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_5__0"


    // $ANTLR start "rule__TrainSchedule__Group_5__0__Impl"
    // InternalSchedule.g:946:1: rule__TrainSchedule__Group_5__0__Impl : ( 'and' ) ;
    public final void rule__TrainSchedule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:950:1: ( ( 'and' ) )
            // InternalSchedule.g:951:1: ( 'and' )
            {
            // InternalSchedule.g:951:1: ( 'and' )
            // InternalSchedule.g:952:2: 'and'
            {
             before(grammarAccess.getTrainScheduleAccess().getAndKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getAndKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_5__0__Impl"


    // $ANTLR start "rule__TrainSchedule__Group_5__1"
    // InternalSchedule.g:961:1: rule__TrainSchedule__Group_5__1 : rule__TrainSchedule__Group_5__1__Impl ;
    public final void rule__TrainSchedule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:965:1: ( rule__TrainSchedule__Group_5__1__Impl )
            // InternalSchedule.g:966:2: rule__TrainSchedule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_5__1"


    // $ANTLR start "rule__TrainSchedule__Group_5__1__Impl"
    // InternalSchedule.g:972:1: rule__TrainSchedule__Group_5__1__Impl : ( ( rule__TrainSchedule__StarttimesAssignment_5_1 ) ) ;
    public final void rule__TrainSchedule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:976:1: ( ( ( rule__TrainSchedule__StarttimesAssignment_5_1 ) ) )
            // InternalSchedule.g:977:1: ( ( rule__TrainSchedule__StarttimesAssignment_5_1 ) )
            {
            // InternalSchedule.g:977:1: ( ( rule__TrainSchedule__StarttimesAssignment_5_1 ) )
            // InternalSchedule.g:978:2: ( rule__TrainSchedule__StarttimesAssignment_5_1 )
            {
             before(grammarAccess.getTrainScheduleAccess().getStarttimesAssignment_5_1()); 
            // InternalSchedule.g:979:2: ( rule__TrainSchedule__StarttimesAssignment_5_1 )
            // InternalSchedule.g:979:3: rule__TrainSchedule__StarttimesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__StarttimesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getStarttimesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__Group_5__1__Impl"


    // $ANTLR start "rule__StartAtStop__Group__0"
    // InternalSchedule.g:988:1: rule__StartAtStop__Group__0 : rule__StartAtStop__Group__0__Impl rule__StartAtStop__Group__1 ;
    public final void rule__StartAtStop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:992:1: ( rule__StartAtStop__Group__0__Impl rule__StartAtStop__Group__1 )
            // InternalSchedule.g:993:2: rule__StartAtStop__Group__0__Impl rule__StartAtStop__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__StartAtStop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartAtStop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__0"


    // $ANTLR start "rule__StartAtStop__Group__0__Impl"
    // InternalSchedule.g:1000:1: rule__StartAtStop__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartAtStop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1004:1: ( ( 'start' ) )
            // InternalSchedule.g:1005:1: ( 'start' )
            {
            // InternalSchedule.g:1005:1: ( 'start' )
            // InternalSchedule.g:1006:2: 'start'
            {
             before(grammarAccess.getStartAtStopAccess().getStartKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStartAtStopAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__0__Impl"


    // $ANTLR start "rule__StartAtStop__Group__1"
    // InternalSchedule.g:1015:1: rule__StartAtStop__Group__1 : rule__StartAtStop__Group__1__Impl rule__StartAtStop__Group__2 ;
    public final void rule__StartAtStop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1019:1: ( rule__StartAtStop__Group__1__Impl rule__StartAtStop__Group__2 )
            // InternalSchedule.g:1020:2: rule__StartAtStop__Group__1__Impl rule__StartAtStop__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__StartAtStop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartAtStop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__1"


    // $ANTLR start "rule__StartAtStop__Group__1__Impl"
    // InternalSchedule.g:1027:1: rule__StartAtStop__Group__1__Impl : ( 'at' ) ;
    public final void rule__StartAtStop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1031:1: ( ( 'at' ) )
            // InternalSchedule.g:1032:1: ( 'at' )
            {
            // InternalSchedule.g:1032:1: ( 'at' )
            // InternalSchedule.g:1033:2: 'at'
            {
             before(grammarAccess.getStartAtStopAccess().getAtKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStartAtStopAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__1__Impl"


    // $ANTLR start "rule__StartAtStop__Group__2"
    // InternalSchedule.g:1042:1: rule__StartAtStop__Group__2 : rule__StartAtStop__Group__2__Impl rule__StartAtStop__Group__3 ;
    public final void rule__StartAtStop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1046:1: ( rule__StartAtStop__Group__2__Impl rule__StartAtStop__Group__3 )
            // InternalSchedule.g:1047:2: rule__StartAtStop__Group__2__Impl rule__StartAtStop__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__StartAtStop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartAtStop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__2"


    // $ANTLR start "rule__StartAtStop__Group__2__Impl"
    // InternalSchedule.g:1054:1: rule__StartAtStop__Group__2__Impl : ( ( rule__StartAtStop__StationAssignment_2 ) ) ;
    public final void rule__StartAtStop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1058:1: ( ( ( rule__StartAtStop__StationAssignment_2 ) ) )
            // InternalSchedule.g:1059:1: ( ( rule__StartAtStop__StationAssignment_2 ) )
            {
            // InternalSchedule.g:1059:1: ( ( rule__StartAtStop__StationAssignment_2 ) )
            // InternalSchedule.g:1060:2: ( rule__StartAtStop__StationAssignment_2 )
            {
             before(grammarAccess.getStartAtStopAccess().getStationAssignment_2()); 
            // InternalSchedule.g:1061:2: ( rule__StartAtStop__StationAssignment_2 )
            // InternalSchedule.g:1061:3: rule__StartAtStop__StationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StartAtStop__StationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartAtStopAccess().getStationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__2__Impl"


    // $ANTLR start "rule__StartAtStop__Group__3"
    // InternalSchedule.g:1069:1: rule__StartAtStop__Group__3 : rule__StartAtStop__Group__3__Impl rule__StartAtStop__Group__4 ;
    public final void rule__StartAtStop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1073:1: ( rule__StartAtStop__Group__3__Impl rule__StartAtStop__Group__4 )
            // InternalSchedule.g:1074:2: rule__StartAtStop__Group__3__Impl rule__StartAtStop__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__StartAtStop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartAtStop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__3"


    // $ANTLR start "rule__StartAtStop__Group__3__Impl"
    // InternalSchedule.g:1081:1: rule__StartAtStop__Group__3__Impl : ( 'on' ) ;
    public final void rule__StartAtStop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1085:1: ( ( 'on' ) )
            // InternalSchedule.g:1086:1: ( 'on' )
            {
            // InternalSchedule.g:1086:1: ( 'on' )
            // InternalSchedule.g:1087:2: 'on'
            {
             before(grammarAccess.getStartAtStopAccess().getOnKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStartAtStopAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__3__Impl"


    // $ANTLR start "rule__StartAtStop__Group__4"
    // InternalSchedule.g:1096:1: rule__StartAtStop__Group__4 : rule__StartAtStop__Group__4__Impl rule__StartAtStop__Group__5 ;
    public final void rule__StartAtStop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1100:1: ( rule__StartAtStop__Group__4__Impl rule__StartAtStop__Group__5 )
            // InternalSchedule.g:1101:2: rule__StartAtStop__Group__4__Impl rule__StartAtStop__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__StartAtStop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartAtStop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__4"


    // $ANTLR start "rule__StartAtStop__Group__4__Impl"
    // InternalSchedule.g:1108:1: rule__StartAtStop__Group__4__Impl : ( 'platform' ) ;
    public final void rule__StartAtStop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1112:1: ( ( 'platform' ) )
            // InternalSchedule.g:1113:1: ( 'platform' )
            {
            // InternalSchedule.g:1113:1: ( 'platform' )
            // InternalSchedule.g:1114:2: 'platform'
            {
             before(grammarAccess.getStartAtStopAccess().getPlatformKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStartAtStopAccess().getPlatformKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__4__Impl"


    // $ANTLR start "rule__StartAtStop__Group__5"
    // InternalSchedule.g:1123:1: rule__StartAtStop__Group__5 : rule__StartAtStop__Group__5__Impl ;
    public final void rule__StartAtStop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1127:1: ( rule__StartAtStop__Group__5__Impl )
            // InternalSchedule.g:1128:2: rule__StartAtStop__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartAtStop__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__5"


    // $ANTLR start "rule__StartAtStop__Group__5__Impl"
    // InternalSchedule.g:1134:1: rule__StartAtStop__Group__5__Impl : ( ( rule__StartAtStop__PlatformAssignment_5 ) ) ;
    public final void rule__StartAtStop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1138:1: ( ( ( rule__StartAtStop__PlatformAssignment_5 ) ) )
            // InternalSchedule.g:1139:1: ( ( rule__StartAtStop__PlatformAssignment_5 ) )
            {
            // InternalSchedule.g:1139:1: ( ( rule__StartAtStop__PlatformAssignment_5 ) )
            // InternalSchedule.g:1140:2: ( rule__StartAtStop__PlatformAssignment_5 )
            {
             before(grammarAccess.getStartAtStopAccess().getPlatformAssignment_5()); 
            // InternalSchedule.g:1141:2: ( rule__StartAtStop__PlatformAssignment_5 )
            // InternalSchedule.g:1141:3: rule__StartAtStop__PlatformAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__StartAtStop__PlatformAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStartAtStopAccess().getPlatformAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__Group__5__Impl"


    // $ANTLR start "rule__ViaStop__Group__0"
    // InternalSchedule.g:1150:1: rule__ViaStop__Group__0 : rule__ViaStop__Group__0__Impl rule__ViaStop__Group__1 ;
    public final void rule__ViaStop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1154:1: ( rule__ViaStop__Group__0__Impl rule__ViaStop__Group__1 )
            // InternalSchedule.g:1155:2: rule__ViaStop__Group__0__Impl rule__ViaStop__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ViaStop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__0"


    // $ANTLR start "rule__ViaStop__Group__0__Impl"
    // InternalSchedule.g:1162:1: rule__ViaStop__Group__0__Impl : ( 'drive' ) ;
    public final void rule__ViaStop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1166:1: ( ( 'drive' ) )
            // InternalSchedule.g:1167:1: ( 'drive' )
            {
            // InternalSchedule.g:1167:1: ( 'drive' )
            // InternalSchedule.g:1168:2: 'drive'
            {
             before(grammarAccess.getViaStopAccess().getDriveKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getDriveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__0__Impl"


    // $ANTLR start "rule__ViaStop__Group__1"
    // InternalSchedule.g:1177:1: rule__ViaStop__Group__1 : rule__ViaStop__Group__1__Impl rule__ViaStop__Group__2 ;
    public final void rule__ViaStop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1181:1: ( rule__ViaStop__Group__1__Impl rule__ViaStop__Group__2 )
            // InternalSchedule.g:1182:2: rule__ViaStop__Group__1__Impl rule__ViaStop__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ViaStop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__1"


    // $ANTLR start "rule__ViaStop__Group__1__Impl"
    // InternalSchedule.g:1189:1: rule__ViaStop__Group__1__Impl : ( 'via' ) ;
    public final void rule__ViaStop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1193:1: ( ( 'via' ) )
            // InternalSchedule.g:1194:1: ( 'via' )
            {
            // InternalSchedule.g:1194:1: ( 'via' )
            // InternalSchedule.g:1195:2: 'via'
            {
             before(grammarAccess.getViaStopAccess().getViaKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getViaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__1__Impl"


    // $ANTLR start "rule__ViaStop__Group__2"
    // InternalSchedule.g:1204:1: rule__ViaStop__Group__2 : rule__ViaStop__Group__2__Impl rule__ViaStop__Group__3 ;
    public final void rule__ViaStop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1208:1: ( rule__ViaStop__Group__2__Impl rule__ViaStop__Group__3 )
            // InternalSchedule.g:1209:2: rule__ViaStop__Group__2__Impl rule__ViaStop__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ViaStop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__2"


    // $ANTLR start "rule__ViaStop__Group__2__Impl"
    // InternalSchedule.g:1216:1: rule__ViaStop__Group__2__Impl : ( ( rule__ViaStop__ViaAssignment_2 ) ) ;
    public final void rule__ViaStop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1220:1: ( ( ( rule__ViaStop__ViaAssignment_2 ) ) )
            // InternalSchedule.g:1221:1: ( ( rule__ViaStop__ViaAssignment_2 ) )
            {
            // InternalSchedule.g:1221:1: ( ( rule__ViaStop__ViaAssignment_2 ) )
            // InternalSchedule.g:1222:2: ( rule__ViaStop__ViaAssignment_2 )
            {
             before(grammarAccess.getViaStopAccess().getViaAssignment_2()); 
            // InternalSchedule.g:1223:2: ( rule__ViaStop__ViaAssignment_2 )
            // InternalSchedule.g:1223:3: rule__ViaStop__ViaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ViaStop__ViaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getViaStopAccess().getViaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__2__Impl"


    // $ANTLR start "rule__ViaStop__Group__3"
    // InternalSchedule.g:1231:1: rule__ViaStop__Group__3 : rule__ViaStop__Group__3__Impl rule__ViaStop__Group__4 ;
    public final void rule__ViaStop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1235:1: ( rule__ViaStop__Group__3__Impl rule__ViaStop__Group__4 )
            // InternalSchedule.g:1236:2: rule__ViaStop__Group__3__Impl rule__ViaStop__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ViaStop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__3"


    // $ANTLR start "rule__ViaStop__Group__3__Impl"
    // InternalSchedule.g:1243:1: rule__ViaStop__Group__3__Impl : ( 'and' ) ;
    public final void rule__ViaStop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1247:1: ( ( 'and' ) )
            // InternalSchedule.g:1248:1: ( 'and' )
            {
            // InternalSchedule.g:1248:1: ( 'and' )
            // InternalSchedule.g:1249:2: 'and'
            {
             before(grammarAccess.getViaStopAccess().getAndKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getAndKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__3__Impl"


    // $ANTLR start "rule__ViaStop__Group__4"
    // InternalSchedule.g:1258:1: rule__ViaStop__Group__4 : rule__ViaStop__Group__4__Impl rule__ViaStop__Group__5 ;
    public final void rule__ViaStop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1262:1: ( rule__ViaStop__Group__4__Impl rule__ViaStop__Group__5 )
            // InternalSchedule.g:1263:2: rule__ViaStop__Group__4__Impl rule__ViaStop__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ViaStop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__4"


    // $ANTLR start "rule__ViaStop__Group__4__Impl"
    // InternalSchedule.g:1270:1: rule__ViaStop__Group__4__Impl : ( 'stop' ) ;
    public final void rule__ViaStop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1274:1: ( ( 'stop' ) )
            // InternalSchedule.g:1275:1: ( 'stop' )
            {
            // InternalSchedule.g:1275:1: ( 'stop' )
            // InternalSchedule.g:1276:2: 'stop'
            {
             before(grammarAccess.getViaStopAccess().getStopKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__4__Impl"


    // $ANTLR start "rule__ViaStop__Group__5"
    // InternalSchedule.g:1285:1: rule__ViaStop__Group__5 : rule__ViaStop__Group__5__Impl rule__ViaStop__Group__6 ;
    public final void rule__ViaStop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1289:1: ( rule__ViaStop__Group__5__Impl rule__ViaStop__Group__6 )
            // InternalSchedule.g:1290:2: rule__ViaStop__Group__5__Impl rule__ViaStop__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ViaStop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__5"


    // $ANTLR start "rule__ViaStop__Group__5__Impl"
    // InternalSchedule.g:1297:1: rule__ViaStop__Group__5__Impl : ( 'at' ) ;
    public final void rule__ViaStop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1301:1: ( ( 'at' ) )
            // InternalSchedule.g:1302:1: ( 'at' )
            {
            // InternalSchedule.g:1302:1: ( 'at' )
            // InternalSchedule.g:1303:2: 'at'
            {
             before(grammarAccess.getViaStopAccess().getAtKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getAtKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__5__Impl"


    // $ANTLR start "rule__ViaStop__Group__6"
    // InternalSchedule.g:1312:1: rule__ViaStop__Group__6 : rule__ViaStop__Group__6__Impl rule__ViaStop__Group__7 ;
    public final void rule__ViaStop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1316:1: ( rule__ViaStop__Group__6__Impl rule__ViaStop__Group__7 )
            // InternalSchedule.g:1317:2: rule__ViaStop__Group__6__Impl rule__ViaStop__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ViaStop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__6"


    // $ANTLR start "rule__ViaStop__Group__6__Impl"
    // InternalSchedule.g:1324:1: rule__ViaStop__Group__6__Impl : ( ( rule__ViaStop__StationAssignment_6 ) ) ;
    public final void rule__ViaStop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1328:1: ( ( ( rule__ViaStop__StationAssignment_6 ) ) )
            // InternalSchedule.g:1329:1: ( ( rule__ViaStop__StationAssignment_6 ) )
            {
            // InternalSchedule.g:1329:1: ( ( rule__ViaStop__StationAssignment_6 ) )
            // InternalSchedule.g:1330:2: ( rule__ViaStop__StationAssignment_6 )
            {
             before(grammarAccess.getViaStopAccess().getStationAssignment_6()); 
            // InternalSchedule.g:1331:2: ( rule__ViaStop__StationAssignment_6 )
            // InternalSchedule.g:1331:3: rule__ViaStop__StationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ViaStop__StationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getViaStopAccess().getStationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__6__Impl"


    // $ANTLR start "rule__ViaStop__Group__7"
    // InternalSchedule.g:1339:1: rule__ViaStop__Group__7 : rule__ViaStop__Group__7__Impl rule__ViaStop__Group__8 ;
    public final void rule__ViaStop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1343:1: ( rule__ViaStop__Group__7__Impl rule__ViaStop__Group__8 )
            // InternalSchedule.g:1344:2: rule__ViaStop__Group__7__Impl rule__ViaStop__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__ViaStop__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__7"


    // $ANTLR start "rule__ViaStop__Group__7__Impl"
    // InternalSchedule.g:1351:1: rule__ViaStop__Group__7__Impl : ( 'on' ) ;
    public final void rule__ViaStop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1355:1: ( ( 'on' ) )
            // InternalSchedule.g:1356:1: ( 'on' )
            {
            // InternalSchedule.g:1356:1: ( 'on' )
            // InternalSchedule.g:1357:2: 'on'
            {
             before(grammarAccess.getViaStopAccess().getOnKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getOnKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__7__Impl"


    // $ANTLR start "rule__ViaStop__Group__8"
    // InternalSchedule.g:1366:1: rule__ViaStop__Group__8 : rule__ViaStop__Group__8__Impl rule__ViaStop__Group__9 ;
    public final void rule__ViaStop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1370:1: ( rule__ViaStop__Group__8__Impl rule__ViaStop__Group__9 )
            // InternalSchedule.g:1371:2: rule__ViaStop__Group__8__Impl rule__ViaStop__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__ViaStop__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__8"


    // $ANTLR start "rule__ViaStop__Group__8__Impl"
    // InternalSchedule.g:1378:1: rule__ViaStop__Group__8__Impl : ( 'platform' ) ;
    public final void rule__ViaStop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1382:1: ( ( 'platform' ) )
            // InternalSchedule.g:1383:1: ( 'platform' )
            {
            // InternalSchedule.g:1383:1: ( 'platform' )
            // InternalSchedule.g:1384:2: 'platform'
            {
             before(grammarAccess.getViaStopAccess().getPlatformKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getPlatformKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__8__Impl"


    // $ANTLR start "rule__ViaStop__Group__9"
    // InternalSchedule.g:1393:1: rule__ViaStop__Group__9 : rule__ViaStop__Group__9__Impl rule__ViaStop__Group__10 ;
    public final void rule__ViaStop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1397:1: ( rule__ViaStop__Group__9__Impl rule__ViaStop__Group__10 )
            // InternalSchedule.g:1398:2: rule__ViaStop__Group__9__Impl rule__ViaStop__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__ViaStop__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__9"


    // $ANTLR start "rule__ViaStop__Group__9__Impl"
    // InternalSchedule.g:1405:1: rule__ViaStop__Group__9__Impl : ( ( rule__ViaStop__PlatformAssignment_9 ) ) ;
    public final void rule__ViaStop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1409:1: ( ( ( rule__ViaStop__PlatformAssignment_9 ) ) )
            // InternalSchedule.g:1410:1: ( ( rule__ViaStop__PlatformAssignment_9 ) )
            {
            // InternalSchedule.g:1410:1: ( ( rule__ViaStop__PlatformAssignment_9 ) )
            // InternalSchedule.g:1411:2: ( rule__ViaStop__PlatformAssignment_9 )
            {
             before(grammarAccess.getViaStopAccess().getPlatformAssignment_9()); 
            // InternalSchedule.g:1412:2: ( rule__ViaStop__PlatformAssignment_9 )
            // InternalSchedule.g:1412:3: rule__ViaStop__PlatformAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ViaStop__PlatformAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getViaStopAccess().getPlatformAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__9__Impl"


    // $ANTLR start "rule__ViaStop__Group__10"
    // InternalSchedule.g:1420:1: rule__ViaStop__Group__10 : rule__ViaStop__Group__10__Impl rule__ViaStop__Group__11 ;
    public final void rule__ViaStop__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1424:1: ( rule__ViaStop__Group__10__Impl rule__ViaStop__Group__11 )
            // InternalSchedule.g:1425:2: rule__ViaStop__Group__10__Impl rule__ViaStop__Group__11
            {
            pushFollow(FOLLOW_25);
            rule__ViaStop__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__10"


    // $ANTLR start "rule__ViaStop__Group__10__Impl"
    // InternalSchedule.g:1432:1: rule__ViaStop__Group__10__Impl : ( 'for' ) ;
    public final void rule__ViaStop__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1436:1: ( ( 'for' ) )
            // InternalSchedule.g:1437:1: ( 'for' )
            {
            // InternalSchedule.g:1437:1: ( 'for' )
            // InternalSchedule.g:1438:2: 'for'
            {
             before(grammarAccess.getViaStopAccess().getForKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getForKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__10__Impl"


    // $ANTLR start "rule__ViaStop__Group__11"
    // InternalSchedule.g:1447:1: rule__ViaStop__Group__11 : rule__ViaStop__Group__11__Impl rule__ViaStop__Group__12 ;
    public final void rule__ViaStop__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1451:1: ( rule__ViaStop__Group__11__Impl rule__ViaStop__Group__12 )
            // InternalSchedule.g:1452:2: rule__ViaStop__Group__11__Impl rule__ViaStop__Group__12
            {
            pushFollow(FOLLOW_26);
            rule__ViaStop__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__11"


    // $ANTLR start "rule__ViaStop__Group__11__Impl"
    // InternalSchedule.g:1459:1: rule__ViaStop__Group__11__Impl : ( ( rule__ViaStop__StoppedTimeAssignment_11 ) ) ;
    public final void rule__ViaStop__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1463:1: ( ( ( rule__ViaStop__StoppedTimeAssignment_11 ) ) )
            // InternalSchedule.g:1464:1: ( ( rule__ViaStop__StoppedTimeAssignment_11 ) )
            {
            // InternalSchedule.g:1464:1: ( ( rule__ViaStop__StoppedTimeAssignment_11 ) )
            // InternalSchedule.g:1465:2: ( rule__ViaStop__StoppedTimeAssignment_11 )
            {
             before(grammarAccess.getViaStopAccess().getStoppedTimeAssignment_11()); 
            // InternalSchedule.g:1466:2: ( rule__ViaStop__StoppedTimeAssignment_11 )
            // InternalSchedule.g:1466:3: rule__ViaStop__StoppedTimeAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__ViaStop__StoppedTimeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getViaStopAccess().getStoppedTimeAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__11__Impl"


    // $ANTLR start "rule__ViaStop__Group__12"
    // InternalSchedule.g:1474:1: rule__ViaStop__Group__12 : rule__ViaStop__Group__12__Impl rule__ViaStop__Group__13 ;
    public final void rule__ViaStop__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1478:1: ( rule__ViaStop__Group__12__Impl rule__ViaStop__Group__13 )
            // InternalSchedule.g:1479:2: rule__ViaStop__Group__12__Impl rule__ViaStop__Group__13
            {
            pushFollow(FOLLOW_23);
            rule__ViaStop__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__12"


    // $ANTLR start "rule__ViaStop__Group__12__Impl"
    // InternalSchedule.g:1486:1: rule__ViaStop__Group__12__Impl : ( 'min' ) ;
    public final void rule__ViaStop__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1490:1: ( ( 'min' ) )
            // InternalSchedule.g:1491:1: ( 'min' )
            {
            // InternalSchedule.g:1491:1: ( 'min' )
            // InternalSchedule.g:1492:2: 'min'
            {
             before(grammarAccess.getViaStopAccess().getMinKeyword_12()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getMinKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__12__Impl"


    // $ANTLR start "rule__ViaStop__Group__13"
    // InternalSchedule.g:1501:1: rule__ViaStop__Group__13 : rule__ViaStop__Group__13__Impl ;
    public final void rule__ViaStop__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1505:1: ( rule__ViaStop__Group__13__Impl )
            // InternalSchedule.g:1506:2: rule__ViaStop__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViaStop__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__13"


    // $ANTLR start "rule__ViaStop__Group__13__Impl"
    // InternalSchedule.g:1512:1: rule__ViaStop__Group__13__Impl : ( ( rule__ViaStop__Group_13__0 )? ) ;
    public final void rule__ViaStop__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1516:1: ( ( ( rule__ViaStop__Group_13__0 )? ) )
            // InternalSchedule.g:1517:1: ( ( rule__ViaStop__Group_13__0 )? )
            {
            // InternalSchedule.g:1517:1: ( ( rule__ViaStop__Group_13__0 )? )
            // InternalSchedule.g:1518:2: ( rule__ViaStop__Group_13__0 )?
            {
             before(grammarAccess.getViaStopAccess().getGroup_13()); 
            // InternalSchedule.g:1519:2: ( rule__ViaStop__Group_13__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSchedule.g:1519:3: rule__ViaStop__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ViaStop__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViaStopAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group__13__Impl"


    // $ANTLR start "rule__ViaStop__Group_13__0"
    // InternalSchedule.g:1528:1: rule__ViaStop__Group_13__0 : rule__ViaStop__Group_13__0__Impl rule__ViaStop__Group_13__1 ;
    public final void rule__ViaStop__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1532:1: ( rule__ViaStop__Group_13__0__Impl rule__ViaStop__Group_13__1 )
            // InternalSchedule.g:1533:2: rule__ViaStop__Group_13__0__Impl rule__ViaStop__Group_13__1
            {
            pushFollow(FOLLOW_27);
            rule__ViaStop__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaStop__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group_13__0"


    // $ANTLR start "rule__ViaStop__Group_13__0__Impl"
    // InternalSchedule.g:1540:1: rule__ViaStop__Group_13__0__Impl : ( 'and' ) ;
    public final void rule__ViaStop__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1544:1: ( ( 'and' ) )
            // InternalSchedule.g:1545:1: ( 'and' )
            {
            // InternalSchedule.g:1545:1: ( 'and' )
            // InternalSchedule.g:1546:2: 'and'
            {
             before(grammarAccess.getViaStopAccess().getAndKeyword_13_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getAndKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group_13__0__Impl"


    // $ANTLR start "rule__ViaStop__Group_13__1"
    // InternalSchedule.g:1555:1: rule__ViaStop__Group_13__1 : rule__ViaStop__Group_13__1__Impl ;
    public final void rule__ViaStop__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1559:1: ( rule__ViaStop__Group_13__1__Impl )
            // InternalSchedule.g:1560:2: rule__ViaStop__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViaStop__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group_13__1"


    // $ANTLR start "rule__ViaStop__Group_13__1__Impl"
    // InternalSchedule.g:1566:1: rule__ViaStop__Group_13__1__Impl : ( ( rule__ViaStop__RotateAssignment_13_1 ) ) ;
    public final void rule__ViaStop__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1570:1: ( ( ( rule__ViaStop__RotateAssignment_13_1 ) ) )
            // InternalSchedule.g:1571:1: ( ( rule__ViaStop__RotateAssignment_13_1 ) )
            {
            // InternalSchedule.g:1571:1: ( ( rule__ViaStop__RotateAssignment_13_1 ) )
            // InternalSchedule.g:1572:2: ( rule__ViaStop__RotateAssignment_13_1 )
            {
             before(grammarAccess.getViaStopAccess().getRotateAssignment_13_1()); 
            // InternalSchedule.g:1573:2: ( rule__ViaStop__RotateAssignment_13_1 )
            // InternalSchedule.g:1573:3: rule__ViaStop__RotateAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__ViaStop__RotateAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getViaStopAccess().getRotateAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__Group_13__1__Impl"


    // $ANTLR start "rule__NormalStop__Group__0"
    // InternalSchedule.g:1582:1: rule__NormalStop__Group__0 : rule__NormalStop__Group__0__Impl rule__NormalStop__Group__1 ;
    public final void rule__NormalStop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1586:1: ( rule__NormalStop__Group__0__Impl rule__NormalStop__Group__1 )
            // InternalSchedule.g:1587:2: rule__NormalStop__Group__0__Impl rule__NormalStop__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__NormalStop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalStop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__0"


    // $ANTLR start "rule__NormalStop__Group__0__Impl"
    // InternalSchedule.g:1594:1: rule__NormalStop__Group__0__Impl : ( 'stop' ) ;
    public final void rule__NormalStop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1598:1: ( ( 'stop' ) )
            // InternalSchedule.g:1599:1: ( 'stop' )
            {
            // InternalSchedule.g:1599:1: ( 'stop' )
            // InternalSchedule.g:1600:2: 'stop'
            {
             before(grammarAccess.getNormalStopAccess().getStopKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__0__Impl"


    // $ANTLR start "rule__NormalStop__Group__1"
    // InternalSchedule.g:1609:1: rule__NormalStop__Group__1 : rule__NormalStop__Group__1__Impl rule__NormalStop__Group__2 ;
    public final void rule__NormalStop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1613:1: ( rule__NormalStop__Group__1__Impl rule__NormalStop__Group__2 )
            // InternalSchedule.g:1614:2: rule__NormalStop__Group__1__Impl rule__NormalStop__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__NormalStop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalStop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__1"


    // $ANTLR start "rule__NormalStop__Group__1__Impl"
    // InternalSchedule.g:1621:1: rule__NormalStop__Group__1__Impl : ( 'at' ) ;
    public final void rule__NormalStop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1625:1: ( ( 'at' ) )
            // InternalSchedule.g:1626:1: ( 'at' )
            {
            // InternalSchedule.g:1626:1: ( 'at' )
            // InternalSchedule.g:1627:2: 'at'
            {
             before(grammarAccess.getNormalStopAccess().getAtKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__1__Impl"


    // $ANTLR start "rule__NormalStop__Group__2"
    // InternalSchedule.g:1636:1: rule__NormalStop__Group__2 : rule__NormalStop__Group__2__Impl rule__NormalStop__Group__3 ;
    public final void rule__NormalStop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1640:1: ( rule__NormalStop__Group__2__Impl rule__NormalStop__Group__3 )
            // InternalSchedule.g:1641:2: rule__NormalStop__Group__2__Impl rule__NormalStop__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__NormalStop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalStop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__2"


    // $ANTLR start "rule__NormalStop__Group__2__Impl"
    // InternalSchedule.g:1648:1: rule__NormalStop__Group__2__Impl : ( ( rule__NormalStop__StationAssignment_2 ) ) ;
    public final void rule__NormalStop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1652:1: ( ( ( rule__NormalStop__StationAssignment_2 ) ) )
            // InternalSchedule.g:1653:1: ( ( rule__NormalStop__StationAssignment_2 ) )
            {
            // InternalSchedule.g:1653:1: ( ( rule__NormalStop__StationAssignment_2 ) )
            // InternalSchedule.g:1654:2: ( rule__NormalStop__StationAssignment_2 )
            {
             before(grammarAccess.getNormalStopAccess().getStationAssignment_2()); 
            // InternalSchedule.g:1655:2: ( rule__NormalStop__StationAssignment_2 )
            // InternalSchedule.g:1655:3: rule__NormalStop__StationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NormalStop__StationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormalStopAccess().getStationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__2__Impl"


    // $ANTLR start "rule__NormalStop__Group__3"
    // InternalSchedule.g:1663:1: rule__NormalStop__Group__3 : rule__NormalStop__Group__3__Impl rule__NormalStop__Group__4 ;
    public final void rule__NormalStop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1667:1: ( rule__NormalStop__Group__3__Impl rule__NormalStop__Group__4 )
            // InternalSchedule.g:1668:2: rule__NormalStop__Group__3__Impl rule__NormalStop__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__NormalStop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalStop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__3"


    // $ANTLR start "rule__NormalStop__Group__3__Impl"
    // InternalSchedule.g:1675:1: rule__NormalStop__Group__3__Impl : ( 'on' ) ;
    public final void rule__NormalStop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1679:1: ( ( 'on' ) )
            // InternalSchedule.g:1680:1: ( 'on' )
            {
            // InternalSchedule.g:1680:1: ( 'on' )
            // InternalSchedule.g:1681:2: 'on'
            {
             before(grammarAccess.getNormalStopAccess().getOnKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__3__Impl"


    // $ANTLR start "rule__NormalStop__Group__4"
    // InternalSchedule.g:1690:1: rule__NormalStop__Group__4 : rule__NormalStop__Group__4__Impl rule__NormalStop__Group__5 ;
    public final void rule__NormalStop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1694:1: ( rule__NormalStop__Group__4__Impl rule__NormalStop__Group__5 )
            // InternalSchedule.g:1695:2: rule__NormalStop__Group__4__Impl rule__NormalStop__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__NormalStop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalStop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__4"


    // $ANTLR start "rule__NormalStop__Group__4__Impl"
    // InternalSchedule.g:1702:1: rule__NormalStop__Group__4__Impl : ( 'platform' ) ;
    public final void rule__NormalStop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1706:1: ( ( 'platform' ) )
            // InternalSchedule.g:1707:1: ( 'platform' )
            {
            // InternalSchedule.g:1707:1: ( 'platform' )
            // InternalSchedule.g:1708:2: 'platform'
            {
             before(grammarAccess.getNormalStopAccess().getPlatformKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getPlatformKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__4__Impl"


    // $ANTLR start "rule__NormalStop__Group__5"
    // InternalSchedule.g:1717:1: rule__NormalStop__Group__5 : rule__NormalStop__Group__5__Impl rule__NormalStop__Group__6 ;
    public final void rule__NormalStop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1721:1: ( rule__NormalStop__Group__5__Impl rule__NormalStop__Group__6 )
            // InternalSchedule.g:1722:2: rule__NormalStop__Group__5__Impl rule__NormalStop__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__NormalStop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalStop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__5"


    // $ANTLR start "rule__NormalStop__Group__5__Impl"
    // InternalSchedule.g:1729:1: rule__NormalStop__Group__5__Impl : ( ( rule__NormalStop__PlatformAssignment_5 ) ) ;
    public final void rule__NormalStop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1733:1: ( ( ( rule__NormalStop__PlatformAssignment_5 ) ) )
            // InternalSchedule.g:1734:1: ( ( rule__NormalStop__PlatformAssignment_5 ) )
            {
            // InternalSchedule.g:1734:1: ( ( rule__NormalStop__PlatformAssignment_5 ) )
            // InternalSchedule.g:1735:2: ( rule__NormalStop__PlatformAssignment_5 )
            {
             before(grammarAccess.getNormalStopAccess().getPlatformAssignment_5()); 
            // InternalSchedule.g:1736:2: ( rule__NormalStop__PlatformAssignment_5 )
            // InternalSchedule.g:1736:3: rule__NormalStop__PlatformAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NormalStop__PlatformAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNormalStopAccess().getPlatformAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__5__Impl"


    // $ANTLR start "rule__NormalStop__Group__6"
    // InternalSchedule.g:1744:1: rule__NormalStop__Group__6 : rule__NormalStop__Group__6__Impl rule__NormalStop__Group__7 ;
    public final void rule__NormalStop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1748:1: ( rule__NormalStop__Group__6__Impl rule__NormalStop__Group__7 )
            // InternalSchedule.g:1749:2: rule__NormalStop__Group__6__Impl rule__NormalStop__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__NormalStop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalStop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__6"


    // $ANTLR start "rule__NormalStop__Group__6__Impl"
    // InternalSchedule.g:1756:1: rule__NormalStop__Group__6__Impl : ( 'for' ) ;
    public final void rule__NormalStop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1760:1: ( ( 'for' ) )
            // InternalSchedule.g:1761:1: ( 'for' )
            {
            // InternalSchedule.g:1761:1: ( 'for' )
            // InternalSchedule.g:1762:2: 'for'
            {
             before(grammarAccess.getNormalStopAccess().getForKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getForKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__6__Impl"


    // $ANTLR start "rule__NormalStop__Group__7"
    // InternalSchedule.g:1771:1: rule__NormalStop__Group__7 : rule__NormalStop__Group__7__Impl rule__NormalStop__Group__8 ;
    public final void rule__NormalStop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1775:1: ( rule__NormalStop__Group__7__Impl rule__NormalStop__Group__8 )
            // InternalSchedule.g:1776:2: rule__NormalStop__Group__7__Impl rule__NormalStop__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__NormalStop__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalStop__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__7"


    // $ANTLR start "rule__NormalStop__Group__7__Impl"
    // InternalSchedule.g:1783:1: rule__NormalStop__Group__7__Impl : ( ( rule__NormalStop__StoppedTimeAssignment_7 ) ) ;
    public final void rule__NormalStop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1787:1: ( ( ( rule__NormalStop__StoppedTimeAssignment_7 ) ) )
            // InternalSchedule.g:1788:1: ( ( rule__NormalStop__StoppedTimeAssignment_7 ) )
            {
            // InternalSchedule.g:1788:1: ( ( rule__NormalStop__StoppedTimeAssignment_7 ) )
            // InternalSchedule.g:1789:2: ( rule__NormalStop__StoppedTimeAssignment_7 )
            {
             before(grammarAccess.getNormalStopAccess().getStoppedTimeAssignment_7()); 
            // InternalSchedule.g:1790:2: ( rule__NormalStop__StoppedTimeAssignment_7 )
            // InternalSchedule.g:1790:3: rule__NormalStop__StoppedTimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__NormalStop__StoppedTimeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getNormalStopAccess().getStoppedTimeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__7__Impl"


    // $ANTLR start "rule__NormalStop__Group__8"
    // InternalSchedule.g:1798:1: rule__NormalStop__Group__8 : rule__NormalStop__Group__8__Impl rule__NormalStop__Group__9 ;
    public final void rule__NormalStop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1802:1: ( rule__NormalStop__Group__8__Impl rule__NormalStop__Group__9 )
            // InternalSchedule.g:1803:2: rule__NormalStop__Group__8__Impl rule__NormalStop__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__NormalStop__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalStop__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__8"


    // $ANTLR start "rule__NormalStop__Group__8__Impl"
    // InternalSchedule.g:1810:1: rule__NormalStop__Group__8__Impl : ( 'min' ) ;
    public final void rule__NormalStop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1814:1: ( ( 'min' ) )
            // InternalSchedule.g:1815:1: ( 'min' )
            {
            // InternalSchedule.g:1815:1: ( 'min' )
            // InternalSchedule.g:1816:2: 'min'
            {
             before(grammarAccess.getNormalStopAccess().getMinKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getMinKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__8__Impl"


    // $ANTLR start "rule__NormalStop__Group__9"
    // InternalSchedule.g:1825:1: rule__NormalStop__Group__9 : rule__NormalStop__Group__9__Impl ;
    public final void rule__NormalStop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1829:1: ( rule__NormalStop__Group__9__Impl )
            // InternalSchedule.g:1830:2: rule__NormalStop__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NormalStop__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__9"


    // $ANTLR start "rule__NormalStop__Group__9__Impl"
    // InternalSchedule.g:1836:1: rule__NormalStop__Group__9__Impl : ( ( rule__NormalStop__Group_9__0 )? ) ;
    public final void rule__NormalStop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1840:1: ( ( ( rule__NormalStop__Group_9__0 )? ) )
            // InternalSchedule.g:1841:1: ( ( rule__NormalStop__Group_9__0 )? )
            {
            // InternalSchedule.g:1841:1: ( ( rule__NormalStop__Group_9__0 )? )
            // InternalSchedule.g:1842:2: ( rule__NormalStop__Group_9__0 )?
            {
             before(grammarAccess.getNormalStopAccess().getGroup_9()); 
            // InternalSchedule.g:1843:2: ( rule__NormalStop__Group_9__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSchedule.g:1843:3: rule__NormalStop__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NormalStop__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNormalStopAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group__9__Impl"


    // $ANTLR start "rule__NormalStop__Group_9__0"
    // InternalSchedule.g:1852:1: rule__NormalStop__Group_9__0 : rule__NormalStop__Group_9__0__Impl rule__NormalStop__Group_9__1 ;
    public final void rule__NormalStop__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1856:1: ( rule__NormalStop__Group_9__0__Impl rule__NormalStop__Group_9__1 )
            // InternalSchedule.g:1857:2: rule__NormalStop__Group_9__0__Impl rule__NormalStop__Group_9__1
            {
            pushFollow(FOLLOW_27);
            rule__NormalStop__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalStop__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group_9__0"


    // $ANTLR start "rule__NormalStop__Group_9__0__Impl"
    // InternalSchedule.g:1864:1: rule__NormalStop__Group_9__0__Impl : ( 'and' ) ;
    public final void rule__NormalStop__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1868:1: ( ( 'and' ) )
            // InternalSchedule.g:1869:1: ( 'and' )
            {
            // InternalSchedule.g:1869:1: ( 'and' )
            // InternalSchedule.g:1870:2: 'and'
            {
             before(grammarAccess.getNormalStopAccess().getAndKeyword_9_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getAndKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group_9__0__Impl"


    // $ANTLR start "rule__NormalStop__Group_9__1"
    // InternalSchedule.g:1879:1: rule__NormalStop__Group_9__1 : rule__NormalStop__Group_9__1__Impl ;
    public final void rule__NormalStop__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1883:1: ( rule__NormalStop__Group_9__1__Impl )
            // InternalSchedule.g:1884:2: rule__NormalStop__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NormalStop__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group_9__1"


    // $ANTLR start "rule__NormalStop__Group_9__1__Impl"
    // InternalSchedule.g:1890:1: rule__NormalStop__Group_9__1__Impl : ( ( rule__NormalStop__RotateAssignment_9_1 ) ) ;
    public final void rule__NormalStop__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1894:1: ( ( ( rule__NormalStop__RotateAssignment_9_1 ) ) )
            // InternalSchedule.g:1895:1: ( ( rule__NormalStop__RotateAssignment_9_1 ) )
            {
            // InternalSchedule.g:1895:1: ( ( rule__NormalStop__RotateAssignment_9_1 ) )
            // InternalSchedule.g:1896:2: ( rule__NormalStop__RotateAssignment_9_1 )
            {
             before(grammarAccess.getNormalStopAccess().getRotateAssignment_9_1()); 
            // InternalSchedule.g:1897:2: ( rule__NormalStop__RotateAssignment_9_1 )
            // InternalSchedule.g:1897:3: rule__NormalStop__RotateAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__NormalStop__RotateAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getNormalStopAccess().getRotateAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__Group_9__1__Impl"


    // $ANTLR start "rule__TerminalStop__Group__0"
    // InternalSchedule.g:1906:1: rule__TerminalStop__Group__0 : rule__TerminalStop__Group__0__Impl rule__TerminalStop__Group__1 ;
    public final void rule__TerminalStop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1910:1: ( rule__TerminalStop__Group__0__Impl rule__TerminalStop__Group__1 )
            // InternalSchedule.g:1911:2: rule__TerminalStop__Group__0__Impl rule__TerminalStop__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TerminalStop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalStop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__0"


    // $ANTLR start "rule__TerminalStop__Group__0__Impl"
    // InternalSchedule.g:1918:1: rule__TerminalStop__Group__0__Impl : ( 'terminate' ) ;
    public final void rule__TerminalStop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1922:1: ( ( 'terminate' ) )
            // InternalSchedule.g:1923:1: ( 'terminate' )
            {
            // InternalSchedule.g:1923:1: ( 'terminate' )
            // InternalSchedule.g:1924:2: 'terminate'
            {
             before(grammarAccess.getTerminalStopAccess().getTerminateKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTerminalStopAccess().getTerminateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__0__Impl"


    // $ANTLR start "rule__TerminalStop__Group__1"
    // InternalSchedule.g:1933:1: rule__TerminalStop__Group__1 : rule__TerminalStop__Group__1__Impl rule__TerminalStop__Group__2 ;
    public final void rule__TerminalStop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1937:1: ( rule__TerminalStop__Group__1__Impl rule__TerminalStop__Group__2 )
            // InternalSchedule.g:1938:2: rule__TerminalStop__Group__1__Impl rule__TerminalStop__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__TerminalStop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalStop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__1"


    // $ANTLR start "rule__TerminalStop__Group__1__Impl"
    // InternalSchedule.g:1945:1: rule__TerminalStop__Group__1__Impl : ( 'at' ) ;
    public final void rule__TerminalStop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1949:1: ( ( 'at' ) )
            // InternalSchedule.g:1950:1: ( 'at' )
            {
            // InternalSchedule.g:1950:1: ( 'at' )
            // InternalSchedule.g:1951:2: 'at'
            {
             before(grammarAccess.getTerminalStopAccess().getAtKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTerminalStopAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__1__Impl"


    // $ANTLR start "rule__TerminalStop__Group__2"
    // InternalSchedule.g:1960:1: rule__TerminalStop__Group__2 : rule__TerminalStop__Group__2__Impl rule__TerminalStop__Group__3 ;
    public final void rule__TerminalStop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1964:1: ( rule__TerminalStop__Group__2__Impl rule__TerminalStop__Group__3 )
            // InternalSchedule.g:1965:2: rule__TerminalStop__Group__2__Impl rule__TerminalStop__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__TerminalStop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalStop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__2"


    // $ANTLR start "rule__TerminalStop__Group__2__Impl"
    // InternalSchedule.g:1972:1: rule__TerminalStop__Group__2__Impl : ( ( rule__TerminalStop__StationAssignment_2 ) ) ;
    public final void rule__TerminalStop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1976:1: ( ( ( rule__TerminalStop__StationAssignment_2 ) ) )
            // InternalSchedule.g:1977:1: ( ( rule__TerminalStop__StationAssignment_2 ) )
            {
            // InternalSchedule.g:1977:1: ( ( rule__TerminalStop__StationAssignment_2 ) )
            // InternalSchedule.g:1978:2: ( rule__TerminalStop__StationAssignment_2 )
            {
             before(grammarAccess.getTerminalStopAccess().getStationAssignment_2()); 
            // InternalSchedule.g:1979:2: ( rule__TerminalStop__StationAssignment_2 )
            // InternalSchedule.g:1979:3: rule__TerminalStop__StationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TerminalStop__StationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTerminalStopAccess().getStationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__2__Impl"


    // $ANTLR start "rule__TerminalStop__Group__3"
    // InternalSchedule.g:1987:1: rule__TerminalStop__Group__3 : rule__TerminalStop__Group__3__Impl rule__TerminalStop__Group__4 ;
    public final void rule__TerminalStop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1991:1: ( rule__TerminalStop__Group__3__Impl rule__TerminalStop__Group__4 )
            // InternalSchedule.g:1992:2: rule__TerminalStop__Group__3__Impl rule__TerminalStop__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__TerminalStop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalStop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__3"


    // $ANTLR start "rule__TerminalStop__Group__3__Impl"
    // InternalSchedule.g:1999:1: rule__TerminalStop__Group__3__Impl : ( 'on' ) ;
    public final void rule__TerminalStop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2003:1: ( ( 'on' ) )
            // InternalSchedule.g:2004:1: ( 'on' )
            {
            // InternalSchedule.g:2004:1: ( 'on' )
            // InternalSchedule.g:2005:2: 'on'
            {
             before(grammarAccess.getTerminalStopAccess().getOnKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTerminalStopAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__3__Impl"


    // $ANTLR start "rule__TerminalStop__Group__4"
    // InternalSchedule.g:2014:1: rule__TerminalStop__Group__4 : rule__TerminalStop__Group__4__Impl rule__TerminalStop__Group__5 ;
    public final void rule__TerminalStop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2018:1: ( rule__TerminalStop__Group__4__Impl rule__TerminalStop__Group__5 )
            // InternalSchedule.g:2019:2: rule__TerminalStop__Group__4__Impl rule__TerminalStop__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__TerminalStop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalStop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__4"


    // $ANTLR start "rule__TerminalStop__Group__4__Impl"
    // InternalSchedule.g:2026:1: rule__TerminalStop__Group__4__Impl : ( 'platform' ) ;
    public final void rule__TerminalStop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2030:1: ( ( 'platform' ) )
            // InternalSchedule.g:2031:1: ( 'platform' )
            {
            // InternalSchedule.g:2031:1: ( 'platform' )
            // InternalSchedule.g:2032:2: 'platform'
            {
             before(grammarAccess.getTerminalStopAccess().getPlatformKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTerminalStopAccess().getPlatformKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__4__Impl"


    // $ANTLR start "rule__TerminalStop__Group__5"
    // InternalSchedule.g:2041:1: rule__TerminalStop__Group__5 : rule__TerminalStop__Group__5__Impl ;
    public final void rule__TerminalStop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2045:1: ( rule__TerminalStop__Group__5__Impl )
            // InternalSchedule.g:2046:2: rule__TerminalStop__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalStop__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__5"


    // $ANTLR start "rule__TerminalStop__Group__5__Impl"
    // InternalSchedule.g:2052:1: rule__TerminalStop__Group__5__Impl : ( ( rule__TerminalStop__PlatformAssignment_5 ) ) ;
    public final void rule__TerminalStop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2056:1: ( ( ( rule__TerminalStop__PlatformAssignment_5 ) ) )
            // InternalSchedule.g:2057:1: ( ( rule__TerminalStop__PlatformAssignment_5 ) )
            {
            // InternalSchedule.g:2057:1: ( ( rule__TerminalStop__PlatformAssignment_5 ) )
            // InternalSchedule.g:2058:2: ( rule__TerminalStop__PlatformAssignment_5 )
            {
             before(grammarAccess.getTerminalStopAccess().getPlatformAssignment_5()); 
            // InternalSchedule.g:2059:2: ( rule__TerminalStop__PlatformAssignment_5 )
            // InternalSchedule.g:2059:3: rule__TerminalStop__PlatformAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TerminalStop__PlatformAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTerminalStopAccess().getPlatformAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__Group__5__Impl"


    // $ANTLR start "rule__StartTime__Group__0"
    // InternalSchedule.g:2068:1: rule__StartTime__Group__0 : rule__StartTime__Group__0__Impl rule__StartTime__Group__1 ;
    public final void rule__StartTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2072:1: ( rule__StartTime__Group__0__Impl rule__StartTime__Group__1 )
            // InternalSchedule.g:2073:2: rule__StartTime__Group__0__Impl rule__StartTime__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__StartTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group__0"


    // $ANTLR start "rule__StartTime__Group__0__Impl"
    // InternalSchedule.g:2080:1: rule__StartTime__Group__0__Impl : ( ( rule__StartTime__WeekdaysAssignment_0 ) ) ;
    public final void rule__StartTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2084:1: ( ( ( rule__StartTime__WeekdaysAssignment_0 ) ) )
            // InternalSchedule.g:2085:1: ( ( rule__StartTime__WeekdaysAssignment_0 ) )
            {
            // InternalSchedule.g:2085:1: ( ( rule__StartTime__WeekdaysAssignment_0 ) )
            // InternalSchedule.g:2086:2: ( rule__StartTime__WeekdaysAssignment_0 )
            {
             before(grammarAccess.getStartTimeAccess().getWeekdaysAssignment_0()); 
            // InternalSchedule.g:2087:2: ( rule__StartTime__WeekdaysAssignment_0 )
            // InternalSchedule.g:2087:3: rule__StartTime__WeekdaysAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StartTime__WeekdaysAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStartTimeAccess().getWeekdaysAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group__0__Impl"


    // $ANTLR start "rule__StartTime__Group__1"
    // InternalSchedule.g:2095:1: rule__StartTime__Group__1 : rule__StartTime__Group__1__Impl rule__StartTime__Group__2 ;
    public final void rule__StartTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2099:1: ( rule__StartTime__Group__1__Impl rule__StartTime__Group__2 )
            // InternalSchedule.g:2100:2: rule__StartTime__Group__1__Impl rule__StartTime__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__StartTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartTime__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group__1"


    // $ANTLR start "rule__StartTime__Group__1__Impl"
    // InternalSchedule.g:2107:1: rule__StartTime__Group__1__Impl : ( ( rule__StartTime__Group_1__0 )* ) ;
    public final void rule__StartTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2111:1: ( ( ( rule__StartTime__Group_1__0 )* ) )
            // InternalSchedule.g:2112:1: ( ( rule__StartTime__Group_1__0 )* )
            {
            // InternalSchedule.g:2112:1: ( ( rule__StartTime__Group_1__0 )* )
            // InternalSchedule.g:2113:2: ( rule__StartTime__Group_1__0 )*
            {
             before(grammarAccess.getStartTimeAccess().getGroup_1()); 
            // InternalSchedule.g:2114:2: ( rule__StartTime__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSchedule.g:2114:3: rule__StartTime__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StartTime__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStartTimeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group__1__Impl"


    // $ANTLR start "rule__StartTime__Group__2"
    // InternalSchedule.g:2122:1: rule__StartTime__Group__2 : rule__StartTime__Group__2__Impl rule__StartTime__Group__3 ;
    public final void rule__StartTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2126:1: ( rule__StartTime__Group__2__Impl rule__StartTime__Group__3 )
            // InternalSchedule.g:2127:2: rule__StartTime__Group__2__Impl rule__StartTime__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__StartTime__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartTime__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group__2"


    // $ANTLR start "rule__StartTime__Group__2__Impl"
    // InternalSchedule.g:2134:1: rule__StartTime__Group__2__Impl : ( 'at' ) ;
    public final void rule__StartTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2138:1: ( ( 'at' ) )
            // InternalSchedule.g:2139:1: ( 'at' )
            {
            // InternalSchedule.g:2139:1: ( 'at' )
            // InternalSchedule.g:2140:2: 'at'
            {
             before(grammarAccess.getStartTimeAccess().getAtKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStartTimeAccess().getAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group__2__Impl"


    // $ANTLR start "rule__StartTime__Group__3"
    // InternalSchedule.g:2149:1: rule__StartTime__Group__3 : rule__StartTime__Group__3__Impl rule__StartTime__Group__4 ;
    public final void rule__StartTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2153:1: ( rule__StartTime__Group__3__Impl rule__StartTime__Group__4 )
            // InternalSchedule.g:2154:2: rule__StartTime__Group__3__Impl rule__StartTime__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__StartTime__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartTime__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group__3"


    // $ANTLR start "rule__StartTime__Group__3__Impl"
    // InternalSchedule.g:2161:1: rule__StartTime__Group__3__Impl : ( ( rule__StartTime__TimestampsAssignment_3 ) ) ;
    public final void rule__StartTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2165:1: ( ( ( rule__StartTime__TimestampsAssignment_3 ) ) )
            // InternalSchedule.g:2166:1: ( ( rule__StartTime__TimestampsAssignment_3 ) )
            {
            // InternalSchedule.g:2166:1: ( ( rule__StartTime__TimestampsAssignment_3 ) )
            // InternalSchedule.g:2167:2: ( rule__StartTime__TimestampsAssignment_3 )
            {
             before(grammarAccess.getStartTimeAccess().getTimestampsAssignment_3()); 
            // InternalSchedule.g:2168:2: ( rule__StartTime__TimestampsAssignment_3 )
            // InternalSchedule.g:2168:3: rule__StartTime__TimestampsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StartTime__TimestampsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStartTimeAccess().getTimestampsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group__3__Impl"


    // $ANTLR start "rule__StartTime__Group__4"
    // InternalSchedule.g:2176:1: rule__StartTime__Group__4 : rule__StartTime__Group__4__Impl ;
    public final void rule__StartTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2180:1: ( rule__StartTime__Group__4__Impl )
            // InternalSchedule.g:2181:2: rule__StartTime__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartTime__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group__4"


    // $ANTLR start "rule__StartTime__Group__4__Impl"
    // InternalSchedule.g:2187:1: rule__StartTime__Group__4__Impl : ( ( rule__StartTime__Group_4__0 )* ) ;
    public final void rule__StartTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2191:1: ( ( ( rule__StartTime__Group_4__0 )* ) )
            // InternalSchedule.g:2192:1: ( ( rule__StartTime__Group_4__0 )* )
            {
            // InternalSchedule.g:2192:1: ( ( rule__StartTime__Group_4__0 )* )
            // InternalSchedule.g:2193:2: ( rule__StartTime__Group_4__0 )*
            {
             before(grammarAccess.getStartTimeAccess().getGroup_4()); 
            // InternalSchedule.g:2194:2: ( rule__StartTime__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSchedule.g:2194:3: rule__StartTime__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StartTime__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStartTimeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group__4__Impl"


    // $ANTLR start "rule__StartTime__Group_1__0"
    // InternalSchedule.g:2203:1: rule__StartTime__Group_1__0 : rule__StartTime__Group_1__0__Impl rule__StartTime__Group_1__1 ;
    public final void rule__StartTime__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2207:1: ( rule__StartTime__Group_1__0__Impl rule__StartTime__Group_1__1 )
            // InternalSchedule.g:2208:2: rule__StartTime__Group_1__0__Impl rule__StartTime__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__StartTime__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartTime__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group_1__0"


    // $ANTLR start "rule__StartTime__Group_1__0__Impl"
    // InternalSchedule.g:2215:1: rule__StartTime__Group_1__0__Impl : ( ',' ) ;
    public final void rule__StartTime__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2219:1: ( ( ',' ) )
            // InternalSchedule.g:2220:1: ( ',' )
            {
            // InternalSchedule.g:2220:1: ( ',' )
            // InternalSchedule.g:2221:2: ','
            {
             before(grammarAccess.getStartTimeAccess().getCommaKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStartTimeAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group_1__0__Impl"


    // $ANTLR start "rule__StartTime__Group_1__1"
    // InternalSchedule.g:2230:1: rule__StartTime__Group_1__1 : rule__StartTime__Group_1__1__Impl ;
    public final void rule__StartTime__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2234:1: ( rule__StartTime__Group_1__1__Impl )
            // InternalSchedule.g:2235:2: rule__StartTime__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartTime__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group_1__1"


    // $ANTLR start "rule__StartTime__Group_1__1__Impl"
    // InternalSchedule.g:2241:1: rule__StartTime__Group_1__1__Impl : ( ( rule__StartTime__WeekdaysAssignment_1_1 ) ) ;
    public final void rule__StartTime__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2245:1: ( ( ( rule__StartTime__WeekdaysAssignment_1_1 ) ) )
            // InternalSchedule.g:2246:1: ( ( rule__StartTime__WeekdaysAssignment_1_1 ) )
            {
            // InternalSchedule.g:2246:1: ( ( rule__StartTime__WeekdaysAssignment_1_1 ) )
            // InternalSchedule.g:2247:2: ( rule__StartTime__WeekdaysAssignment_1_1 )
            {
             before(grammarAccess.getStartTimeAccess().getWeekdaysAssignment_1_1()); 
            // InternalSchedule.g:2248:2: ( rule__StartTime__WeekdaysAssignment_1_1 )
            // InternalSchedule.g:2248:3: rule__StartTime__WeekdaysAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StartTime__WeekdaysAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStartTimeAccess().getWeekdaysAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group_1__1__Impl"


    // $ANTLR start "rule__StartTime__Group_4__0"
    // InternalSchedule.g:2257:1: rule__StartTime__Group_4__0 : rule__StartTime__Group_4__0__Impl rule__StartTime__Group_4__1 ;
    public final void rule__StartTime__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2261:1: ( rule__StartTime__Group_4__0__Impl rule__StartTime__Group_4__1 )
            // InternalSchedule.g:2262:2: rule__StartTime__Group_4__0__Impl rule__StartTime__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__StartTime__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartTime__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group_4__0"


    // $ANTLR start "rule__StartTime__Group_4__0__Impl"
    // InternalSchedule.g:2269:1: rule__StartTime__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StartTime__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2273:1: ( ( ',' ) )
            // InternalSchedule.g:2274:1: ( ',' )
            {
            // InternalSchedule.g:2274:1: ( ',' )
            // InternalSchedule.g:2275:2: ','
            {
             before(grammarAccess.getStartTimeAccess().getCommaKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStartTimeAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group_4__0__Impl"


    // $ANTLR start "rule__StartTime__Group_4__1"
    // InternalSchedule.g:2284:1: rule__StartTime__Group_4__1 : rule__StartTime__Group_4__1__Impl ;
    public final void rule__StartTime__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2288:1: ( rule__StartTime__Group_4__1__Impl )
            // InternalSchedule.g:2289:2: rule__StartTime__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartTime__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group_4__1"


    // $ANTLR start "rule__StartTime__Group_4__1__Impl"
    // InternalSchedule.g:2295:1: rule__StartTime__Group_4__1__Impl : ( ( rule__StartTime__TimestampsAssignment_4_1 ) ) ;
    public final void rule__StartTime__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2299:1: ( ( ( rule__StartTime__TimestampsAssignment_4_1 ) ) )
            // InternalSchedule.g:2300:1: ( ( rule__StartTime__TimestampsAssignment_4_1 ) )
            {
            // InternalSchedule.g:2300:1: ( ( rule__StartTime__TimestampsAssignment_4_1 ) )
            // InternalSchedule.g:2301:2: ( rule__StartTime__TimestampsAssignment_4_1 )
            {
             before(grammarAccess.getStartTimeAccess().getTimestampsAssignment_4_1()); 
            // InternalSchedule.g:2302:2: ( rule__StartTime__TimestampsAssignment_4_1 )
            // InternalSchedule.g:2302:3: rule__StartTime__TimestampsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StartTime__TimestampsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStartTimeAccess().getTimestampsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__Group_4__1__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // InternalSchedule.g:2311:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2315:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalSchedule.g:2316:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // InternalSchedule.g:2323:1: rule__Time__Group__0__Impl : ( ( rule__Time__HourAssignment_0 ) ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2327:1: ( ( ( rule__Time__HourAssignment_0 ) ) )
            // InternalSchedule.g:2328:1: ( ( rule__Time__HourAssignment_0 ) )
            {
            // InternalSchedule.g:2328:1: ( ( rule__Time__HourAssignment_0 ) )
            // InternalSchedule.g:2329:2: ( rule__Time__HourAssignment_0 )
            {
             before(grammarAccess.getTimeAccess().getHourAssignment_0()); 
            // InternalSchedule.g:2330:2: ( rule__Time__HourAssignment_0 )
            // InternalSchedule.g:2330:3: rule__Time__HourAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Time__HourAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getHourAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // InternalSchedule.g:2338:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2342:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
            // InternalSchedule.g:2343:2: rule__Time__Group__1__Impl rule__Time__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Time__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // InternalSchedule.g:2350:1: rule__Time__Group__1__Impl : ( ':' ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2354:1: ( ( ':' ) )
            // InternalSchedule.g:2355:1: ( ':' )
            {
            // InternalSchedule.g:2355:1: ( ':' )
            // InternalSchedule.g:2356:2: ':'
            {
             before(grammarAccess.getTimeAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__Time__Group__2"
    // InternalSchedule.g:2365:1: rule__Time__Group__2 : rule__Time__Group__2__Impl ;
    public final void rule__Time__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2369:1: ( rule__Time__Group__2__Impl )
            // InternalSchedule.g:2370:2: rule__Time__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__2"


    // $ANTLR start "rule__Time__Group__2__Impl"
    // InternalSchedule.g:2376:1: rule__Time__Group__2__Impl : ( ( rule__Time__MinuteAssignment_2 ) ) ;
    public final void rule__Time__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2380:1: ( ( ( rule__Time__MinuteAssignment_2 ) ) )
            // InternalSchedule.g:2381:1: ( ( rule__Time__MinuteAssignment_2 ) )
            {
            // InternalSchedule.g:2381:1: ( ( rule__Time__MinuteAssignment_2 ) )
            // InternalSchedule.g:2382:2: ( rule__Time__MinuteAssignment_2 )
            {
             before(grammarAccess.getTimeAccess().getMinuteAssignment_2()); 
            // InternalSchedule.g:2383:2: ( rule__Time__MinuteAssignment_2 )
            // InternalSchedule.g:2383:3: rule__Time__MinuteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Time__MinuteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getMinuteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__2__Impl"


    // $ANTLR start "rule__Schedule__NetworkAssignment_2"
    // InternalSchedule.g:2392:1: rule__Schedule__NetworkAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Schedule__NetworkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2396:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2397:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2397:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2398:3: ( RULE_ID )
            {
             before(grammarAccess.getScheduleAccess().getNetworkNetworkCrossReference_2_0()); 
            // InternalSchedule.g:2399:3: ( RULE_ID )
            // InternalSchedule.g:2400:4: RULE_ID
            {
             before(grammarAccess.getScheduleAccess().getNetworkNetworkIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getNetworkNetworkIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getScheduleAccess().getNetworkNetworkCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__NetworkAssignment_2"


    // $ANTLR start "rule__Schedule__DepotAssignment_4"
    // InternalSchedule.g:2411:1: rule__Schedule__DepotAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Schedule__DepotAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2415:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2416:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2416:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2417:3: ( RULE_ID )
            {
             before(grammarAccess.getScheduleAccess().getDepotRootCrossReference_4_0()); 
            // InternalSchedule.g:2418:3: ( RULE_ID )
            // InternalSchedule.g:2419:4: RULE_ID
            {
             before(grammarAccess.getScheduleAccess().getDepotRootIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getDepotRootIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getScheduleAccess().getDepotRootCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__DepotAssignment_4"


    // $ANTLR start "rule__Schedule__DepotAssignment_5_1"
    // InternalSchedule.g:2430:1: rule__Schedule__DepotAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Schedule__DepotAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2434:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2435:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2435:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2436:3: ( RULE_ID )
            {
             before(grammarAccess.getScheduleAccess().getDepotRootCrossReference_5_1_0()); 
            // InternalSchedule.g:2437:3: ( RULE_ID )
            // InternalSchedule.g:2438:4: RULE_ID
            {
             before(grammarAccess.getScheduleAccess().getDepotRootIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScheduleAccess().getDepotRootIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getScheduleAccess().getDepotRootCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__DepotAssignment_5_1"


    // $ANTLR start "rule__Schedule__TrainsAssignment_7_0"
    // InternalSchedule.g:2449:1: rule__Schedule__TrainsAssignment_7_0 : ( ruleTrainSchedule ) ;
    public final void rule__Schedule__TrainsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2453:1: ( ( ruleTrainSchedule ) )
            // InternalSchedule.g:2454:2: ( ruleTrainSchedule )
            {
            // InternalSchedule.g:2454:2: ( ruleTrainSchedule )
            // InternalSchedule.g:2455:3: ruleTrainSchedule
            {
             before(grammarAccess.getScheduleAccess().getTrainsTrainScheduleParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTrainSchedule();

            state._fsp--;

             after(grammarAccess.getScheduleAccess().getTrainsTrainScheduleParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schedule__TrainsAssignment_7_0"


    // $ANTLR start "rule__TrainSchedule__TrainAssignment_2"
    // InternalSchedule.g:2464:1: rule__TrainSchedule__TrainAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TrainSchedule__TrainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2468:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2469:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2469:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2470:3: ( RULE_ID )
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainTrainCrossReference_2_0()); 
            // InternalSchedule.g:2471:3: ( RULE_ID )
            // InternalSchedule.g:2472:4: RULE_ID
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainTrainIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTrainScheduleAccess().getTrainTrainIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTrainScheduleAccess().getTrainTrainCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__TrainAssignment_2"


    // $ANTLR start "rule__TrainSchedule__StarttimesAssignment_4"
    // InternalSchedule.g:2483:1: rule__TrainSchedule__StarttimesAssignment_4 : ( ruleStartTime ) ;
    public final void rule__TrainSchedule__StarttimesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2487:1: ( ( ruleStartTime ) )
            // InternalSchedule.g:2488:2: ( ruleStartTime )
            {
            // InternalSchedule.g:2488:2: ( ruleStartTime )
            // InternalSchedule.g:2489:3: ruleStartTime
            {
             before(grammarAccess.getTrainScheduleAccess().getStarttimesStartTimeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStartTime();

            state._fsp--;

             after(grammarAccess.getTrainScheduleAccess().getStarttimesStartTimeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__StarttimesAssignment_4"


    // $ANTLR start "rule__TrainSchedule__StarttimesAssignment_5_1"
    // InternalSchedule.g:2498:1: rule__TrainSchedule__StarttimesAssignment_5_1 : ( ruleStartTime ) ;
    public final void rule__TrainSchedule__StarttimesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2502:1: ( ( ruleStartTime ) )
            // InternalSchedule.g:2503:2: ( ruleStartTime )
            {
            // InternalSchedule.g:2503:2: ( ruleStartTime )
            // InternalSchedule.g:2504:3: ruleStartTime
            {
             before(grammarAccess.getTrainScheduleAccess().getStarttimesStartTimeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStartTime();

            state._fsp--;

             after(grammarAccess.getTrainScheduleAccess().getStarttimesStartTimeParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__StarttimesAssignment_5_1"


    // $ANTLR start "rule__TrainSchedule__StopsAssignment_7"
    // InternalSchedule.g:2513:1: rule__TrainSchedule__StopsAssignment_7 : ( ruleStartAtStop ) ;
    public final void rule__TrainSchedule__StopsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2517:1: ( ( ruleStartAtStop ) )
            // InternalSchedule.g:2518:2: ( ruleStartAtStop )
            {
            // InternalSchedule.g:2518:2: ( ruleStartAtStop )
            // InternalSchedule.g:2519:3: ruleStartAtStop
            {
             before(grammarAccess.getTrainScheduleAccess().getStopsStartAtStopParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStartAtStop();

            state._fsp--;

             after(grammarAccess.getTrainScheduleAccess().getStopsStartAtStopParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__StopsAssignment_7"


    // $ANTLR start "rule__TrainSchedule__StopsAssignment_8"
    // InternalSchedule.g:2528:1: rule__TrainSchedule__StopsAssignment_8 : ( ( rule__TrainSchedule__StopsAlternatives_8_0 ) ) ;
    public final void rule__TrainSchedule__StopsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2532:1: ( ( ( rule__TrainSchedule__StopsAlternatives_8_0 ) ) )
            // InternalSchedule.g:2533:2: ( ( rule__TrainSchedule__StopsAlternatives_8_0 ) )
            {
            // InternalSchedule.g:2533:2: ( ( rule__TrainSchedule__StopsAlternatives_8_0 ) )
            // InternalSchedule.g:2534:3: ( rule__TrainSchedule__StopsAlternatives_8_0 )
            {
             before(grammarAccess.getTrainScheduleAccess().getStopsAlternatives_8_0()); 
            // InternalSchedule.g:2535:3: ( rule__TrainSchedule__StopsAlternatives_8_0 )
            // InternalSchedule.g:2535:4: rule__TrainSchedule__StopsAlternatives_8_0
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__StopsAlternatives_8_0();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getStopsAlternatives_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__StopsAssignment_8"


    // $ANTLR start "rule__TrainSchedule__StopsAssignment_9"
    // InternalSchedule.g:2543:1: rule__TrainSchedule__StopsAssignment_9 : ( ruleTerminalStop ) ;
    public final void rule__TrainSchedule__StopsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2547:1: ( ( ruleTerminalStop ) )
            // InternalSchedule.g:2548:2: ( ruleTerminalStop )
            {
            // InternalSchedule.g:2548:2: ( ruleTerminalStop )
            // InternalSchedule.g:2549:3: ruleTerminalStop
            {
             before(grammarAccess.getTrainScheduleAccess().getStopsTerminalStopParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalStop();

            state._fsp--;

             after(grammarAccess.getTrainScheduleAccess().getStopsTerminalStopParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainSchedule__StopsAssignment_9"


    // $ANTLR start "rule__StartAtStop__StationAssignment_2"
    // InternalSchedule.g:2558:1: rule__StartAtStop__StationAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__StartAtStop__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2562:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2563:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2563:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2564:3: ( RULE_STRING )
            {
             before(grammarAccess.getStartAtStopAccess().getStationStationCrossReference_2_0()); 
            // InternalSchedule.g:2565:3: ( RULE_STRING )
            // InternalSchedule.g:2566:4: RULE_STRING
            {
             before(grammarAccess.getStartAtStopAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStartAtStopAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStartAtStopAccess().getStationStationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__StationAssignment_2"


    // $ANTLR start "rule__StartAtStop__PlatformAssignment_5"
    // InternalSchedule.g:2577:1: rule__StartAtStop__PlatformAssignment_5 : ( RULE_ID ) ;
    public final void rule__StartAtStop__PlatformAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2581:1: ( ( RULE_ID ) )
            // InternalSchedule.g:2582:2: ( RULE_ID )
            {
            // InternalSchedule.g:2582:2: ( RULE_ID )
            // InternalSchedule.g:2583:3: RULE_ID
            {
             before(grammarAccess.getStartAtStopAccess().getPlatformIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStartAtStopAccess().getPlatformIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartAtStop__PlatformAssignment_5"


    // $ANTLR start "rule__ViaStop__ViaAssignment_2"
    // InternalSchedule.g:2592:1: rule__ViaStop__ViaAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__ViaStop__ViaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2596:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2597:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2597:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2598:3: ( RULE_STRING )
            {
             before(grammarAccess.getViaStopAccess().getViaLegCrossReference_2_0()); 
            // InternalSchedule.g:2599:3: ( RULE_STRING )
            // InternalSchedule.g:2600:4: RULE_STRING
            {
             before(grammarAccess.getViaStopAccess().getViaLegSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getViaLegSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getViaStopAccess().getViaLegCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__ViaAssignment_2"


    // $ANTLR start "rule__ViaStop__StationAssignment_6"
    // InternalSchedule.g:2611:1: rule__ViaStop__StationAssignment_6 : ( ( RULE_STRING ) ) ;
    public final void rule__ViaStop__StationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2615:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2616:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2616:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2617:3: ( RULE_STRING )
            {
             before(grammarAccess.getViaStopAccess().getStationStationCrossReference_6_0()); 
            // InternalSchedule.g:2618:3: ( RULE_STRING )
            // InternalSchedule.g:2619:4: RULE_STRING
            {
             before(grammarAccess.getViaStopAccess().getStationStationSTRINGTerminalRuleCall_6_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getStationStationSTRINGTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getViaStopAccess().getStationStationCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__StationAssignment_6"


    // $ANTLR start "rule__ViaStop__PlatformAssignment_9"
    // InternalSchedule.g:2630:1: rule__ViaStop__PlatformAssignment_9 : ( RULE_ID ) ;
    public final void rule__ViaStop__PlatformAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2634:1: ( ( RULE_ID ) )
            // InternalSchedule.g:2635:2: ( RULE_ID )
            {
            // InternalSchedule.g:2635:2: ( RULE_ID )
            // InternalSchedule.g:2636:3: RULE_ID
            {
             before(grammarAccess.getViaStopAccess().getPlatformIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getPlatformIDTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__PlatformAssignment_9"


    // $ANTLR start "rule__ViaStop__StoppedTimeAssignment_11"
    // InternalSchedule.g:2645:1: rule__ViaStop__StoppedTimeAssignment_11 : ( RULE_INT ) ;
    public final void rule__ViaStop__StoppedTimeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2649:1: ( ( RULE_INT ) )
            // InternalSchedule.g:2650:2: ( RULE_INT )
            {
            // InternalSchedule.g:2650:2: ( RULE_INT )
            // InternalSchedule.g:2651:3: RULE_INT
            {
             before(grammarAccess.getViaStopAccess().getStoppedTimeINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getStoppedTimeINTTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__StoppedTimeAssignment_11"


    // $ANTLR start "rule__ViaStop__RotateAssignment_13_1"
    // InternalSchedule.g:2660:1: rule__ViaStop__RotateAssignment_13_1 : ( ( 'reverse' ) ) ;
    public final void rule__ViaStop__RotateAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2664:1: ( ( ( 'reverse' ) ) )
            // InternalSchedule.g:2665:2: ( ( 'reverse' ) )
            {
            // InternalSchedule.g:2665:2: ( ( 'reverse' ) )
            // InternalSchedule.g:2666:3: ( 'reverse' )
            {
             before(grammarAccess.getViaStopAccess().getRotateReverseKeyword_13_1_0()); 
            // InternalSchedule.g:2667:3: ( 'reverse' )
            // InternalSchedule.g:2668:4: 'reverse'
            {
             before(grammarAccess.getViaStopAccess().getRotateReverseKeyword_13_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getRotateReverseKeyword_13_1_0()); 

            }

             after(grammarAccess.getViaStopAccess().getRotateReverseKeyword_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaStop__RotateAssignment_13_1"


    // $ANTLR start "rule__NormalStop__StationAssignment_2"
    // InternalSchedule.g:2679:1: rule__NormalStop__StationAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__NormalStop__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2683:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2684:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2684:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2685:3: ( RULE_STRING )
            {
             before(grammarAccess.getNormalStopAccess().getStationStationCrossReference_2_0()); 
            // InternalSchedule.g:2686:3: ( RULE_STRING )
            // InternalSchedule.g:2687:4: RULE_STRING
            {
             before(grammarAccess.getNormalStopAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getNormalStopAccess().getStationStationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__StationAssignment_2"


    // $ANTLR start "rule__NormalStop__PlatformAssignment_5"
    // InternalSchedule.g:2698:1: rule__NormalStop__PlatformAssignment_5 : ( RULE_ID ) ;
    public final void rule__NormalStop__PlatformAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2702:1: ( ( RULE_ID ) )
            // InternalSchedule.g:2703:2: ( RULE_ID )
            {
            // InternalSchedule.g:2703:2: ( RULE_ID )
            // InternalSchedule.g:2704:3: RULE_ID
            {
             before(grammarAccess.getNormalStopAccess().getPlatformIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getPlatformIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__PlatformAssignment_5"


    // $ANTLR start "rule__NormalStop__StoppedTimeAssignment_7"
    // InternalSchedule.g:2713:1: rule__NormalStop__StoppedTimeAssignment_7 : ( RULE_INT ) ;
    public final void rule__NormalStop__StoppedTimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2717:1: ( ( RULE_INT ) )
            // InternalSchedule.g:2718:2: ( RULE_INT )
            {
            // InternalSchedule.g:2718:2: ( RULE_INT )
            // InternalSchedule.g:2719:3: RULE_INT
            {
             before(grammarAccess.getNormalStopAccess().getStoppedTimeINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getStoppedTimeINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__StoppedTimeAssignment_7"


    // $ANTLR start "rule__NormalStop__RotateAssignment_9_1"
    // InternalSchedule.g:2728:1: rule__NormalStop__RotateAssignment_9_1 : ( ( 'reverse' ) ) ;
    public final void rule__NormalStop__RotateAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2732:1: ( ( ( 'reverse' ) ) )
            // InternalSchedule.g:2733:2: ( ( 'reverse' ) )
            {
            // InternalSchedule.g:2733:2: ( ( 'reverse' ) )
            // InternalSchedule.g:2734:3: ( 'reverse' )
            {
             before(grammarAccess.getNormalStopAccess().getRotateReverseKeyword_9_1_0()); 
            // InternalSchedule.g:2735:3: ( 'reverse' )
            // InternalSchedule.g:2736:4: 'reverse'
            {
             before(grammarAccess.getNormalStopAccess().getRotateReverseKeyword_9_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getRotateReverseKeyword_9_1_0()); 

            }

             after(grammarAccess.getNormalStopAccess().getRotateReverseKeyword_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStop__RotateAssignment_9_1"


    // $ANTLR start "rule__TerminalStop__StationAssignment_2"
    // InternalSchedule.g:2747:1: rule__TerminalStop__StationAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__TerminalStop__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2751:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2752:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2752:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2753:3: ( RULE_STRING )
            {
             before(grammarAccess.getTerminalStopAccess().getStationStationCrossReference_2_0()); 
            // InternalSchedule.g:2754:3: ( RULE_STRING )
            // InternalSchedule.g:2755:4: RULE_STRING
            {
             before(grammarAccess.getTerminalStopAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTerminalStopAccess().getStationStationSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTerminalStopAccess().getStationStationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__StationAssignment_2"


    // $ANTLR start "rule__TerminalStop__PlatformAssignment_5"
    // InternalSchedule.g:2766:1: rule__TerminalStop__PlatformAssignment_5 : ( RULE_ID ) ;
    public final void rule__TerminalStop__PlatformAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2770:1: ( ( RULE_ID ) )
            // InternalSchedule.g:2771:2: ( RULE_ID )
            {
            // InternalSchedule.g:2771:2: ( RULE_ID )
            // InternalSchedule.g:2772:3: RULE_ID
            {
             before(grammarAccess.getTerminalStopAccess().getPlatformIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerminalStopAccess().getPlatformIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalStop__PlatformAssignment_5"


    // $ANTLR start "rule__StartTime__WeekdaysAssignment_0"
    // InternalSchedule.g:2781:1: rule__StartTime__WeekdaysAssignment_0 : ( ruleWeekday ) ;
    public final void rule__StartTime__WeekdaysAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2785:1: ( ( ruleWeekday ) )
            // InternalSchedule.g:2786:2: ( ruleWeekday )
            {
            // InternalSchedule.g:2786:2: ( ruleWeekday )
            // InternalSchedule.g:2787:3: ruleWeekday
            {
             before(grammarAccess.getStartTimeAccess().getWeekdaysWeekdayEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWeekday();

            state._fsp--;

             after(grammarAccess.getStartTimeAccess().getWeekdaysWeekdayEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__WeekdaysAssignment_0"


    // $ANTLR start "rule__StartTime__WeekdaysAssignment_1_1"
    // InternalSchedule.g:2796:1: rule__StartTime__WeekdaysAssignment_1_1 : ( ruleWeekday ) ;
    public final void rule__StartTime__WeekdaysAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2800:1: ( ( ruleWeekday ) )
            // InternalSchedule.g:2801:2: ( ruleWeekday )
            {
            // InternalSchedule.g:2801:2: ( ruleWeekday )
            // InternalSchedule.g:2802:3: ruleWeekday
            {
             before(grammarAccess.getStartTimeAccess().getWeekdaysWeekdayEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWeekday();

            state._fsp--;

             after(grammarAccess.getStartTimeAccess().getWeekdaysWeekdayEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__WeekdaysAssignment_1_1"


    // $ANTLR start "rule__StartTime__TimestampsAssignment_3"
    // InternalSchedule.g:2811:1: rule__StartTime__TimestampsAssignment_3 : ( ruleTime ) ;
    public final void rule__StartTime__TimestampsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2815:1: ( ( ruleTime ) )
            // InternalSchedule.g:2816:2: ( ruleTime )
            {
            // InternalSchedule.g:2816:2: ( ruleTime )
            // InternalSchedule.g:2817:3: ruleTime
            {
             before(grammarAccess.getStartTimeAccess().getTimestampsTimeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getStartTimeAccess().getTimestampsTimeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__TimestampsAssignment_3"


    // $ANTLR start "rule__StartTime__TimestampsAssignment_4_1"
    // InternalSchedule.g:2826:1: rule__StartTime__TimestampsAssignment_4_1 : ( ruleTime ) ;
    public final void rule__StartTime__TimestampsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2830:1: ( ( ruleTime ) )
            // InternalSchedule.g:2831:2: ( ruleTime )
            {
            // InternalSchedule.g:2831:2: ( ruleTime )
            // InternalSchedule.g:2832:3: ruleTime
            {
             before(grammarAccess.getStartTimeAccess().getTimestampsTimeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getStartTimeAccess().getTimestampsTimeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartTime__TimestampsAssignment_4_1"


    // $ANTLR start "rule__Time__HourAssignment_0"
    // InternalSchedule.g:2841:1: rule__Time__HourAssignment_0 : ( RULE_INT ) ;
    public final void rule__Time__HourAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2845:1: ( ( RULE_INT ) )
            // InternalSchedule.g:2846:2: ( RULE_INT )
            {
            // InternalSchedule.g:2846:2: ( RULE_INT )
            // InternalSchedule.g:2847:3: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getHourINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getHourINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__HourAssignment_0"


    // $ANTLR start "rule__Time__MinuteAssignment_2"
    // InternalSchedule.g:2856:1: rule__Time__MinuteAssignment_2 : ( RULE_INT ) ;
    public final void rule__Time__MinuteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2860:1: ( ( RULE_INT ) )
            // InternalSchedule.g:2861:2: ( RULE_INT )
            {
            // InternalSchedule.g:2861:2: ( RULE_INT )
            // InternalSchedule.g:2862:3: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getMinuteINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getMinuteINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__MinuteAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000A80000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000000L});

}