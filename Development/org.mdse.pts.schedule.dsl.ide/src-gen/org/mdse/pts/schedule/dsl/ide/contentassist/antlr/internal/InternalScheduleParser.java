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


    // $ANTLR start "entryRuleViaTerminalStop"
    // InternalSchedule.g:203:1: entryRuleViaTerminalStop : ruleViaTerminalStop EOF ;
    public final void entryRuleViaTerminalStop() throws RecognitionException {
        try {
            // InternalSchedule.g:204:1: ( ruleViaTerminalStop EOF )
            // InternalSchedule.g:205:1: ruleViaTerminalStop EOF
            {
             before(grammarAccess.getViaTerminalStopRule()); 
            pushFollow(FOLLOW_1);
            ruleViaTerminalStop();

            state._fsp--;

             after(grammarAccess.getViaTerminalStopRule()); 
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
    // $ANTLR end "entryRuleViaTerminalStop"


    // $ANTLR start "ruleViaTerminalStop"
    // InternalSchedule.g:212:1: ruleViaTerminalStop : ( ( rule__ViaTerminalStop__Group__0 ) ) ;
    public final void ruleViaTerminalStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:216:2: ( ( ( rule__ViaTerminalStop__Group__0 ) ) )
            // InternalSchedule.g:217:2: ( ( rule__ViaTerminalStop__Group__0 ) )
            {
            // InternalSchedule.g:217:2: ( ( rule__ViaTerminalStop__Group__0 ) )
            // InternalSchedule.g:218:3: ( rule__ViaTerminalStop__Group__0 )
            {
             before(grammarAccess.getViaTerminalStopAccess().getGroup()); 
            // InternalSchedule.g:219:3: ( rule__ViaTerminalStop__Group__0 )
            // InternalSchedule.g:219:4: rule__ViaTerminalStop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViaTerminalStopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViaTerminalStop"


    // $ANTLR start "entryRuleStartTime"
    // InternalSchedule.g:228:1: entryRuleStartTime : ruleStartTime EOF ;
    public final void entryRuleStartTime() throws RecognitionException {
        try {
            // InternalSchedule.g:229:1: ( ruleStartTime EOF )
            // InternalSchedule.g:230:1: ruleStartTime EOF
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
    // InternalSchedule.g:237:1: ruleStartTime : ( ( rule__StartTime__Group__0 ) ) ;
    public final void ruleStartTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:241:2: ( ( ( rule__StartTime__Group__0 ) ) )
            // InternalSchedule.g:242:2: ( ( rule__StartTime__Group__0 ) )
            {
            // InternalSchedule.g:242:2: ( ( rule__StartTime__Group__0 ) )
            // InternalSchedule.g:243:3: ( rule__StartTime__Group__0 )
            {
             before(grammarAccess.getStartTimeAccess().getGroup()); 
            // InternalSchedule.g:244:3: ( rule__StartTime__Group__0 )
            // InternalSchedule.g:244:4: rule__StartTime__Group__0
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
    // InternalSchedule.g:253:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalSchedule.g:254:1: ( ruleTime EOF )
            // InternalSchedule.g:255:1: ruleTime EOF
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
    // InternalSchedule.g:262:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:266:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalSchedule.g:267:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalSchedule.g:267:2: ( ( rule__Time__Group__0 ) )
            // InternalSchedule.g:268:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalSchedule.g:269:3: ( rule__Time__Group__0 )
            // InternalSchedule.g:269:4: rule__Time__Group__0
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
    // InternalSchedule.g:278:1: ruleWeekday : ( ( rule__Weekday__Alternatives ) ) ;
    public final void ruleWeekday() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:282:1: ( ( ( rule__Weekday__Alternatives ) ) )
            // InternalSchedule.g:283:2: ( ( rule__Weekday__Alternatives ) )
            {
            // InternalSchedule.g:283:2: ( ( rule__Weekday__Alternatives ) )
            // InternalSchedule.g:284:3: ( rule__Weekday__Alternatives )
            {
             before(grammarAccess.getWeekdayAccess().getAlternatives()); 
            // InternalSchedule.g:285:3: ( rule__Weekday__Alternatives )
            // InternalSchedule.g:285:4: rule__Weekday__Alternatives
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
    // InternalSchedule.g:293:1: rule__TrainSchedule__StopsAlternatives_8_0 : ( ( ruleViaStop ) | ( ruleNormalStop ) );
    public final void rule__TrainSchedule__StopsAlternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:297:1: ( ( ruleViaStop ) | ( ruleNormalStop ) )
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
                    // InternalSchedule.g:298:2: ( ruleViaStop )
                    {
                    // InternalSchedule.g:298:2: ( ruleViaStop )
                    // InternalSchedule.g:299:3: ruleViaStop
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
                    // InternalSchedule.g:304:2: ( ruleNormalStop )
                    {
                    // InternalSchedule.g:304:2: ( ruleNormalStop )
                    // InternalSchedule.g:305:3: ruleNormalStop
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


    // $ANTLR start "rule__TrainSchedule__StopsAlternatives_9_0"
    // InternalSchedule.g:314:1: rule__TrainSchedule__StopsAlternatives_9_0 : ( ( ruleTerminalStop ) | ( ruleViaTerminalStop ) );
    public final void rule__TrainSchedule__StopsAlternatives_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:318:1: ( ( ruleTerminalStop ) | ( ruleViaTerminalStop ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==35) ) {
                alt2=1;
            }
            else if ( (LA2_0==31) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSchedule.g:319:2: ( ruleTerminalStop )
                    {
                    // InternalSchedule.g:319:2: ( ruleTerminalStop )
                    // InternalSchedule.g:320:3: ruleTerminalStop
                    {
                     before(grammarAccess.getTrainScheduleAccess().getStopsTerminalStopParserRuleCall_9_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTerminalStop();

                    state._fsp--;

                     after(grammarAccess.getTrainScheduleAccess().getStopsTerminalStopParserRuleCall_9_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSchedule.g:325:2: ( ruleViaTerminalStop )
                    {
                    // InternalSchedule.g:325:2: ( ruleViaTerminalStop )
                    // InternalSchedule.g:326:3: ruleViaTerminalStop
                    {
                     before(grammarAccess.getTrainScheduleAccess().getStopsViaTerminalStopParserRuleCall_9_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleViaTerminalStop();

                    state._fsp--;

                     after(grammarAccess.getTrainScheduleAccess().getStopsViaTerminalStopParserRuleCall_9_0_1()); 

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
    // $ANTLR end "rule__TrainSchedule__StopsAlternatives_9_0"


    // $ANTLR start "rule__Weekday__Alternatives"
    // InternalSchedule.g:335:1: rule__Weekday__Alternatives : ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) );
    public final void rule__Weekday__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:339:1: ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSchedule.g:340:2: ( ( 'Monday' ) )
                    {
                    // InternalSchedule.g:340:2: ( ( 'Monday' ) )
                    // InternalSchedule.g:341:3: ( 'Monday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getMondayEnumLiteralDeclaration_0()); 
                    // InternalSchedule.g:342:3: ( 'Monday' )
                    // InternalSchedule.g:342:4: 'Monday'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getMondayEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSchedule.g:346:2: ( ( 'Tuesday' ) )
                    {
                    // InternalSchedule.g:346:2: ( ( 'Tuesday' ) )
                    // InternalSchedule.g:347:3: ( 'Tuesday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getTuesdayEnumLiteralDeclaration_1()); 
                    // InternalSchedule.g:348:3: ( 'Tuesday' )
                    // InternalSchedule.g:348:4: 'Tuesday'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getTuesdayEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSchedule.g:352:2: ( ( 'Wednesday' ) )
                    {
                    // InternalSchedule.g:352:2: ( ( 'Wednesday' ) )
                    // InternalSchedule.g:353:3: ( 'Wednesday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getWednesdayEnumLiteralDeclaration_2()); 
                    // InternalSchedule.g:354:3: ( 'Wednesday' )
                    // InternalSchedule.g:354:4: 'Wednesday'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getWednesdayEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSchedule.g:358:2: ( ( 'Thursday' ) )
                    {
                    // InternalSchedule.g:358:2: ( ( 'Thursday' ) )
                    // InternalSchedule.g:359:3: ( 'Thursday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getThursdayEnumLiteralDeclaration_3()); 
                    // InternalSchedule.g:360:3: ( 'Thursday' )
                    // InternalSchedule.g:360:4: 'Thursday'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getThursdayEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSchedule.g:364:2: ( ( 'Friday' ) )
                    {
                    // InternalSchedule.g:364:2: ( ( 'Friday' ) )
                    // InternalSchedule.g:365:3: ( 'Friday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getFridayEnumLiteralDeclaration_4()); 
                    // InternalSchedule.g:366:3: ( 'Friday' )
                    // InternalSchedule.g:366:4: 'Friday'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getFridayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSchedule.g:370:2: ( ( 'Saturday' ) )
                    {
                    // InternalSchedule.g:370:2: ( ( 'Saturday' ) )
                    // InternalSchedule.g:371:3: ( 'Saturday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getSaturdayEnumLiteralDeclaration_5()); 
                    // InternalSchedule.g:372:3: ( 'Saturday' )
                    // InternalSchedule.g:372:4: 'Saturday'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getSaturdayEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSchedule.g:376:2: ( ( 'Sunday' ) )
                    {
                    // InternalSchedule.g:376:2: ( ( 'Sunday' ) )
                    // InternalSchedule.g:377:3: ( 'Sunday' )
                    {
                     before(grammarAccess.getWeekdayAccess().getSundayEnumLiteralDeclaration_6()); 
                    // InternalSchedule.g:378:3: ( 'Sunday' )
                    // InternalSchedule.g:378:4: 'Sunday'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekdayAccess().getSundayEnumLiteralDeclaration_6()); 

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
    // InternalSchedule.g:386:1: rule__Schedule__Group__0 : rule__Schedule__Group__0__Impl rule__Schedule__Group__1 ;
    public final void rule__Schedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:390:1: ( rule__Schedule__Group__0__Impl rule__Schedule__Group__1 )
            // InternalSchedule.g:391:2: rule__Schedule__Group__0__Impl rule__Schedule__Group__1
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
    // InternalSchedule.g:398:1: rule__Schedule__Group__0__Impl : ( 'schedule' ) ;
    public final void rule__Schedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:402:1: ( ( 'schedule' ) )
            // InternalSchedule.g:403:1: ( 'schedule' )
            {
            // InternalSchedule.g:403:1: ( 'schedule' )
            // InternalSchedule.g:404:2: 'schedule'
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
    // InternalSchedule.g:413:1: rule__Schedule__Group__1 : rule__Schedule__Group__1__Impl rule__Schedule__Group__2 ;
    public final void rule__Schedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:417:1: ( rule__Schedule__Group__1__Impl rule__Schedule__Group__2 )
            // InternalSchedule.g:418:2: rule__Schedule__Group__1__Impl rule__Schedule__Group__2
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
    // InternalSchedule.g:425:1: rule__Schedule__Group__1__Impl : ( 'for' ) ;
    public final void rule__Schedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:429:1: ( ( 'for' ) )
            // InternalSchedule.g:430:1: ( 'for' )
            {
            // InternalSchedule.g:430:1: ( 'for' )
            // InternalSchedule.g:431:2: 'for'
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
    // InternalSchedule.g:440:1: rule__Schedule__Group__2 : rule__Schedule__Group__2__Impl rule__Schedule__Group__3 ;
    public final void rule__Schedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:444:1: ( rule__Schedule__Group__2__Impl rule__Schedule__Group__3 )
            // InternalSchedule.g:445:2: rule__Schedule__Group__2__Impl rule__Schedule__Group__3
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
    // InternalSchedule.g:452:1: rule__Schedule__Group__2__Impl : ( ( rule__Schedule__NetworkAssignment_2 ) ) ;
    public final void rule__Schedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:456:1: ( ( ( rule__Schedule__NetworkAssignment_2 ) ) )
            // InternalSchedule.g:457:1: ( ( rule__Schedule__NetworkAssignment_2 ) )
            {
            // InternalSchedule.g:457:1: ( ( rule__Schedule__NetworkAssignment_2 ) )
            // InternalSchedule.g:458:2: ( rule__Schedule__NetworkAssignment_2 )
            {
             before(grammarAccess.getScheduleAccess().getNetworkAssignment_2()); 
            // InternalSchedule.g:459:2: ( rule__Schedule__NetworkAssignment_2 )
            // InternalSchedule.g:459:3: rule__Schedule__NetworkAssignment_2
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
    // InternalSchedule.g:467:1: rule__Schedule__Group__3 : rule__Schedule__Group__3__Impl rule__Schedule__Group__4 ;
    public final void rule__Schedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:471:1: ( rule__Schedule__Group__3__Impl rule__Schedule__Group__4 )
            // InternalSchedule.g:472:2: rule__Schedule__Group__3__Impl rule__Schedule__Group__4
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
    // InternalSchedule.g:479:1: rule__Schedule__Group__3__Impl : ( 'with' ) ;
    public final void rule__Schedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:483:1: ( ( 'with' ) )
            // InternalSchedule.g:484:1: ( 'with' )
            {
            // InternalSchedule.g:484:1: ( 'with' )
            // InternalSchedule.g:485:2: 'with'
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
    // InternalSchedule.g:494:1: rule__Schedule__Group__4 : rule__Schedule__Group__4__Impl rule__Schedule__Group__5 ;
    public final void rule__Schedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:498:1: ( rule__Schedule__Group__4__Impl rule__Schedule__Group__5 )
            // InternalSchedule.g:499:2: rule__Schedule__Group__4__Impl rule__Schedule__Group__5
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
    // InternalSchedule.g:506:1: rule__Schedule__Group__4__Impl : ( ( rule__Schedule__DepotAssignment_4 ) ) ;
    public final void rule__Schedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:510:1: ( ( ( rule__Schedule__DepotAssignment_4 ) ) )
            // InternalSchedule.g:511:1: ( ( rule__Schedule__DepotAssignment_4 ) )
            {
            // InternalSchedule.g:511:1: ( ( rule__Schedule__DepotAssignment_4 ) )
            // InternalSchedule.g:512:2: ( rule__Schedule__DepotAssignment_4 )
            {
             before(grammarAccess.getScheduleAccess().getDepotAssignment_4()); 
            // InternalSchedule.g:513:2: ( rule__Schedule__DepotAssignment_4 )
            // InternalSchedule.g:513:3: rule__Schedule__DepotAssignment_4
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
    // InternalSchedule.g:521:1: rule__Schedule__Group__5 : rule__Schedule__Group__5__Impl rule__Schedule__Group__6 ;
    public final void rule__Schedule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:525:1: ( rule__Schedule__Group__5__Impl rule__Schedule__Group__6 )
            // InternalSchedule.g:526:2: rule__Schedule__Group__5__Impl rule__Schedule__Group__6
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
    // InternalSchedule.g:533:1: rule__Schedule__Group__5__Impl : ( ( rule__Schedule__Group_5__0 )* ) ;
    public final void rule__Schedule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:537:1: ( ( ( rule__Schedule__Group_5__0 )* ) )
            // InternalSchedule.g:538:1: ( ( rule__Schedule__Group_5__0 )* )
            {
            // InternalSchedule.g:538:1: ( ( rule__Schedule__Group_5__0 )* )
            // InternalSchedule.g:539:2: ( rule__Schedule__Group_5__0 )*
            {
             before(grammarAccess.getScheduleAccess().getGroup_5()); 
            // InternalSchedule.g:540:2: ( rule__Schedule__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSchedule.g:540:3: rule__Schedule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Schedule__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalSchedule.g:548:1: rule__Schedule__Group__6 : rule__Schedule__Group__6__Impl rule__Schedule__Group__7 ;
    public final void rule__Schedule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:552:1: ( rule__Schedule__Group__6__Impl rule__Schedule__Group__7 )
            // InternalSchedule.g:553:2: rule__Schedule__Group__6__Impl rule__Schedule__Group__7
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
    // InternalSchedule.g:560:1: rule__Schedule__Group__6__Impl : ( ';' ) ;
    public final void rule__Schedule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:564:1: ( ( ';' ) )
            // InternalSchedule.g:565:1: ( ';' )
            {
            // InternalSchedule.g:565:1: ( ';' )
            // InternalSchedule.g:566:2: ';'
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
    // InternalSchedule.g:575:1: rule__Schedule__Group__7 : rule__Schedule__Group__7__Impl ;
    public final void rule__Schedule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:579:1: ( rule__Schedule__Group__7__Impl )
            // InternalSchedule.g:580:2: rule__Schedule__Group__7__Impl
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
    // InternalSchedule.g:586:1: rule__Schedule__Group__7__Impl : ( ( rule__Schedule__Group_7__0 )* ) ;
    public final void rule__Schedule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:590:1: ( ( ( rule__Schedule__Group_7__0 )* ) )
            // InternalSchedule.g:591:1: ( ( rule__Schedule__Group_7__0 )* )
            {
            // InternalSchedule.g:591:1: ( ( rule__Schedule__Group_7__0 )* )
            // InternalSchedule.g:592:2: ( rule__Schedule__Group_7__0 )*
            {
             before(grammarAccess.getScheduleAccess().getGroup_7()); 
            // InternalSchedule.g:593:2: ( rule__Schedule__Group_7__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSchedule.g:593:3: rule__Schedule__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Schedule__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalSchedule.g:602:1: rule__Schedule__Group_5__0 : rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1 ;
    public final void rule__Schedule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:606:1: ( rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1 )
            // InternalSchedule.g:607:2: rule__Schedule__Group_5__0__Impl rule__Schedule__Group_5__1
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
    // InternalSchedule.g:614:1: rule__Schedule__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Schedule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:618:1: ( ( ',' ) )
            // InternalSchedule.g:619:1: ( ',' )
            {
            // InternalSchedule.g:619:1: ( ',' )
            // InternalSchedule.g:620:2: ','
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
    // InternalSchedule.g:629:1: rule__Schedule__Group_5__1 : rule__Schedule__Group_5__1__Impl ;
    public final void rule__Schedule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:633:1: ( rule__Schedule__Group_5__1__Impl )
            // InternalSchedule.g:634:2: rule__Schedule__Group_5__1__Impl
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
    // InternalSchedule.g:640:1: rule__Schedule__Group_5__1__Impl : ( ( rule__Schedule__DepotAssignment_5_1 ) ) ;
    public final void rule__Schedule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:644:1: ( ( ( rule__Schedule__DepotAssignment_5_1 ) ) )
            // InternalSchedule.g:645:1: ( ( rule__Schedule__DepotAssignment_5_1 ) )
            {
            // InternalSchedule.g:645:1: ( ( rule__Schedule__DepotAssignment_5_1 ) )
            // InternalSchedule.g:646:2: ( rule__Schedule__DepotAssignment_5_1 )
            {
             before(grammarAccess.getScheduleAccess().getDepotAssignment_5_1()); 
            // InternalSchedule.g:647:2: ( rule__Schedule__DepotAssignment_5_1 )
            // InternalSchedule.g:647:3: rule__Schedule__DepotAssignment_5_1
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
    // InternalSchedule.g:656:1: rule__Schedule__Group_7__0 : rule__Schedule__Group_7__0__Impl rule__Schedule__Group_7__1 ;
    public final void rule__Schedule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:660:1: ( rule__Schedule__Group_7__0__Impl rule__Schedule__Group_7__1 )
            // InternalSchedule.g:661:2: rule__Schedule__Group_7__0__Impl rule__Schedule__Group_7__1
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
    // InternalSchedule.g:668:1: rule__Schedule__Group_7__0__Impl : ( ( rule__Schedule__TrainsAssignment_7_0 ) ) ;
    public final void rule__Schedule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:672:1: ( ( ( rule__Schedule__TrainsAssignment_7_0 ) ) )
            // InternalSchedule.g:673:1: ( ( rule__Schedule__TrainsAssignment_7_0 ) )
            {
            // InternalSchedule.g:673:1: ( ( rule__Schedule__TrainsAssignment_7_0 ) )
            // InternalSchedule.g:674:2: ( rule__Schedule__TrainsAssignment_7_0 )
            {
             before(grammarAccess.getScheduleAccess().getTrainsAssignment_7_0()); 
            // InternalSchedule.g:675:2: ( rule__Schedule__TrainsAssignment_7_0 )
            // InternalSchedule.g:675:3: rule__Schedule__TrainsAssignment_7_0
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
    // InternalSchedule.g:683:1: rule__Schedule__Group_7__1 : rule__Schedule__Group_7__1__Impl ;
    public final void rule__Schedule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:687:1: ( rule__Schedule__Group_7__1__Impl )
            // InternalSchedule.g:688:2: rule__Schedule__Group_7__1__Impl
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
    // InternalSchedule.g:694:1: rule__Schedule__Group_7__1__Impl : ( ';' ) ;
    public final void rule__Schedule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:698:1: ( ( ';' ) )
            // InternalSchedule.g:699:1: ( ';' )
            {
            // InternalSchedule.g:699:1: ( ';' )
            // InternalSchedule.g:700:2: ';'
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
    // InternalSchedule.g:710:1: rule__TrainSchedule__Group__0 : rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1 ;
    public final void rule__TrainSchedule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:714:1: ( rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1 )
            // InternalSchedule.g:715:2: rule__TrainSchedule__Group__0__Impl rule__TrainSchedule__Group__1
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
    // InternalSchedule.g:722:1: rule__TrainSchedule__Group__0__Impl : ( 'schedule' ) ;
    public final void rule__TrainSchedule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:726:1: ( ( 'schedule' ) )
            // InternalSchedule.g:727:1: ( 'schedule' )
            {
            // InternalSchedule.g:727:1: ( 'schedule' )
            // InternalSchedule.g:728:2: 'schedule'
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
    // InternalSchedule.g:737:1: rule__TrainSchedule__Group__1 : rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2 ;
    public final void rule__TrainSchedule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:741:1: ( rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2 )
            // InternalSchedule.g:742:2: rule__TrainSchedule__Group__1__Impl rule__TrainSchedule__Group__2
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
    // InternalSchedule.g:749:1: rule__TrainSchedule__Group__1__Impl : ( 'train' ) ;
    public final void rule__TrainSchedule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:753:1: ( ( 'train' ) )
            // InternalSchedule.g:754:1: ( 'train' )
            {
            // InternalSchedule.g:754:1: ( 'train' )
            // InternalSchedule.g:755:2: 'train'
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
    // InternalSchedule.g:764:1: rule__TrainSchedule__Group__2 : rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3 ;
    public final void rule__TrainSchedule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:768:1: ( rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3 )
            // InternalSchedule.g:769:2: rule__TrainSchedule__Group__2__Impl rule__TrainSchedule__Group__3
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
    // InternalSchedule.g:776:1: rule__TrainSchedule__Group__2__Impl : ( ( rule__TrainSchedule__TrainAssignment_2 ) ) ;
    public final void rule__TrainSchedule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:780:1: ( ( ( rule__TrainSchedule__TrainAssignment_2 ) ) )
            // InternalSchedule.g:781:1: ( ( rule__TrainSchedule__TrainAssignment_2 ) )
            {
            // InternalSchedule.g:781:1: ( ( rule__TrainSchedule__TrainAssignment_2 ) )
            // InternalSchedule.g:782:2: ( rule__TrainSchedule__TrainAssignment_2 )
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainAssignment_2()); 
            // InternalSchedule.g:783:2: ( rule__TrainSchedule__TrainAssignment_2 )
            // InternalSchedule.g:783:3: rule__TrainSchedule__TrainAssignment_2
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
    // InternalSchedule.g:791:1: rule__TrainSchedule__Group__3 : rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4 ;
    public final void rule__TrainSchedule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:795:1: ( rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4 )
            // InternalSchedule.g:796:2: rule__TrainSchedule__Group__3__Impl rule__TrainSchedule__Group__4
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
    // InternalSchedule.g:803:1: rule__TrainSchedule__Group__3__Impl : ( 'on' ) ;
    public final void rule__TrainSchedule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:807:1: ( ( 'on' ) )
            // InternalSchedule.g:808:1: ( 'on' )
            {
            // InternalSchedule.g:808:1: ( 'on' )
            // InternalSchedule.g:809:2: 'on'
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
    // InternalSchedule.g:818:1: rule__TrainSchedule__Group__4 : rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5 ;
    public final void rule__TrainSchedule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:822:1: ( rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5 )
            // InternalSchedule.g:823:2: rule__TrainSchedule__Group__4__Impl rule__TrainSchedule__Group__5
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
    // InternalSchedule.g:830:1: rule__TrainSchedule__Group__4__Impl : ( ( rule__TrainSchedule__StarttimesAssignment_4 ) ) ;
    public final void rule__TrainSchedule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:834:1: ( ( ( rule__TrainSchedule__StarttimesAssignment_4 ) ) )
            // InternalSchedule.g:835:1: ( ( rule__TrainSchedule__StarttimesAssignment_4 ) )
            {
            // InternalSchedule.g:835:1: ( ( rule__TrainSchedule__StarttimesAssignment_4 ) )
            // InternalSchedule.g:836:2: ( rule__TrainSchedule__StarttimesAssignment_4 )
            {
             before(grammarAccess.getTrainScheduleAccess().getStarttimesAssignment_4()); 
            // InternalSchedule.g:837:2: ( rule__TrainSchedule__StarttimesAssignment_4 )
            // InternalSchedule.g:837:3: rule__TrainSchedule__StarttimesAssignment_4
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
    // InternalSchedule.g:845:1: rule__TrainSchedule__Group__5 : rule__TrainSchedule__Group__5__Impl rule__TrainSchedule__Group__6 ;
    public final void rule__TrainSchedule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:849:1: ( rule__TrainSchedule__Group__5__Impl rule__TrainSchedule__Group__6 )
            // InternalSchedule.g:850:2: rule__TrainSchedule__Group__5__Impl rule__TrainSchedule__Group__6
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
    // InternalSchedule.g:857:1: rule__TrainSchedule__Group__5__Impl : ( ( rule__TrainSchedule__Group_5__0 )* ) ;
    public final void rule__TrainSchedule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:861:1: ( ( ( rule__TrainSchedule__Group_5__0 )* ) )
            // InternalSchedule.g:862:1: ( ( rule__TrainSchedule__Group_5__0 )* )
            {
            // InternalSchedule.g:862:1: ( ( rule__TrainSchedule__Group_5__0 )* )
            // InternalSchedule.g:863:2: ( rule__TrainSchedule__Group_5__0 )*
            {
             before(grammarAccess.getTrainScheduleAccess().getGroup_5()); 
            // InternalSchedule.g:864:2: ( rule__TrainSchedule__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSchedule.g:864:3: rule__TrainSchedule__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TrainSchedule__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalSchedule.g:872:1: rule__TrainSchedule__Group__6 : rule__TrainSchedule__Group__6__Impl rule__TrainSchedule__Group__7 ;
    public final void rule__TrainSchedule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:876:1: ( rule__TrainSchedule__Group__6__Impl rule__TrainSchedule__Group__7 )
            // InternalSchedule.g:877:2: rule__TrainSchedule__Group__6__Impl rule__TrainSchedule__Group__7
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
    // InternalSchedule.g:884:1: rule__TrainSchedule__Group__6__Impl : ( ':' ) ;
    public final void rule__TrainSchedule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:888:1: ( ( ':' ) )
            // InternalSchedule.g:889:1: ( ':' )
            {
            // InternalSchedule.g:889:1: ( ':' )
            // InternalSchedule.g:890:2: ':'
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
    // InternalSchedule.g:899:1: rule__TrainSchedule__Group__7 : rule__TrainSchedule__Group__7__Impl rule__TrainSchedule__Group__8 ;
    public final void rule__TrainSchedule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:903:1: ( rule__TrainSchedule__Group__7__Impl rule__TrainSchedule__Group__8 )
            // InternalSchedule.g:904:2: rule__TrainSchedule__Group__7__Impl rule__TrainSchedule__Group__8
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
    // InternalSchedule.g:911:1: rule__TrainSchedule__Group__7__Impl : ( ( rule__TrainSchedule__StopsAssignment_7 ) ) ;
    public final void rule__TrainSchedule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:915:1: ( ( ( rule__TrainSchedule__StopsAssignment_7 ) ) )
            // InternalSchedule.g:916:1: ( ( rule__TrainSchedule__StopsAssignment_7 ) )
            {
            // InternalSchedule.g:916:1: ( ( rule__TrainSchedule__StopsAssignment_7 ) )
            // InternalSchedule.g:917:2: ( rule__TrainSchedule__StopsAssignment_7 )
            {
             before(grammarAccess.getTrainScheduleAccess().getStopsAssignment_7()); 
            // InternalSchedule.g:918:2: ( rule__TrainSchedule__StopsAssignment_7 )
            // InternalSchedule.g:918:3: rule__TrainSchedule__StopsAssignment_7
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
    // InternalSchedule.g:926:1: rule__TrainSchedule__Group__8 : rule__TrainSchedule__Group__8__Impl rule__TrainSchedule__Group__9 ;
    public final void rule__TrainSchedule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:930:1: ( rule__TrainSchedule__Group__8__Impl rule__TrainSchedule__Group__9 )
            // InternalSchedule.g:931:2: rule__TrainSchedule__Group__8__Impl rule__TrainSchedule__Group__9
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
    // InternalSchedule.g:938:1: rule__TrainSchedule__Group__8__Impl : ( ( rule__TrainSchedule__StopsAssignment_8 )* ) ;
    public final void rule__TrainSchedule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:942:1: ( ( ( rule__TrainSchedule__StopsAssignment_8 )* ) )
            // InternalSchedule.g:943:1: ( ( rule__TrainSchedule__StopsAssignment_8 )* )
            {
            // InternalSchedule.g:943:1: ( ( rule__TrainSchedule__StopsAssignment_8 )* )
            // InternalSchedule.g:944:2: ( rule__TrainSchedule__StopsAssignment_8 )*
            {
             before(grammarAccess.getTrainScheduleAccess().getStopsAssignment_8()); 
            // InternalSchedule.g:945:2: ( rule__TrainSchedule__StopsAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==32) ) {
                        int LA7_4 = input.LA(3);

                        if ( (LA7_4==RULE_STRING) ) {
                            int LA7_5 = input.LA(4);

                            if ( (LA7_5==27) ) {
                                int LA7_6 = input.LA(5);

                                if ( (LA7_6==33) ) {
                                    alt7=1;
                                }


                            }


                        }


                    }


                }
                else if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSchedule.g:945:3: rule__TrainSchedule__StopsAssignment_8
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TrainSchedule__StopsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSchedule.g:953:1: rule__TrainSchedule__Group__9 : rule__TrainSchedule__Group__9__Impl ;
    public final void rule__TrainSchedule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:957:1: ( rule__TrainSchedule__Group__9__Impl )
            // InternalSchedule.g:958:2: rule__TrainSchedule__Group__9__Impl
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
    // InternalSchedule.g:964:1: rule__TrainSchedule__Group__9__Impl : ( ( rule__TrainSchedule__StopsAssignment_9 ) ) ;
    public final void rule__TrainSchedule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:968:1: ( ( ( rule__TrainSchedule__StopsAssignment_9 ) ) )
            // InternalSchedule.g:969:1: ( ( rule__TrainSchedule__StopsAssignment_9 ) )
            {
            // InternalSchedule.g:969:1: ( ( rule__TrainSchedule__StopsAssignment_9 ) )
            // InternalSchedule.g:970:2: ( rule__TrainSchedule__StopsAssignment_9 )
            {
             before(grammarAccess.getTrainScheduleAccess().getStopsAssignment_9()); 
            // InternalSchedule.g:971:2: ( rule__TrainSchedule__StopsAssignment_9 )
            // InternalSchedule.g:971:3: rule__TrainSchedule__StopsAssignment_9
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
    // InternalSchedule.g:980:1: rule__TrainSchedule__Group_5__0 : rule__TrainSchedule__Group_5__0__Impl rule__TrainSchedule__Group_5__1 ;
    public final void rule__TrainSchedule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:984:1: ( rule__TrainSchedule__Group_5__0__Impl rule__TrainSchedule__Group_5__1 )
            // InternalSchedule.g:985:2: rule__TrainSchedule__Group_5__0__Impl rule__TrainSchedule__Group_5__1
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
    // InternalSchedule.g:992:1: rule__TrainSchedule__Group_5__0__Impl : ( 'and' ) ;
    public final void rule__TrainSchedule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:996:1: ( ( 'and' ) )
            // InternalSchedule.g:997:1: ( 'and' )
            {
            // InternalSchedule.g:997:1: ( 'and' )
            // InternalSchedule.g:998:2: 'and'
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
    // InternalSchedule.g:1007:1: rule__TrainSchedule__Group_5__1 : rule__TrainSchedule__Group_5__1__Impl ;
    public final void rule__TrainSchedule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1011:1: ( rule__TrainSchedule__Group_5__1__Impl )
            // InternalSchedule.g:1012:2: rule__TrainSchedule__Group_5__1__Impl
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
    // InternalSchedule.g:1018:1: rule__TrainSchedule__Group_5__1__Impl : ( ( rule__TrainSchedule__StarttimesAssignment_5_1 ) ) ;
    public final void rule__TrainSchedule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1022:1: ( ( ( rule__TrainSchedule__StarttimesAssignment_5_1 ) ) )
            // InternalSchedule.g:1023:1: ( ( rule__TrainSchedule__StarttimesAssignment_5_1 ) )
            {
            // InternalSchedule.g:1023:1: ( ( rule__TrainSchedule__StarttimesAssignment_5_1 ) )
            // InternalSchedule.g:1024:2: ( rule__TrainSchedule__StarttimesAssignment_5_1 )
            {
             before(grammarAccess.getTrainScheduleAccess().getStarttimesAssignment_5_1()); 
            // InternalSchedule.g:1025:2: ( rule__TrainSchedule__StarttimesAssignment_5_1 )
            // InternalSchedule.g:1025:3: rule__TrainSchedule__StarttimesAssignment_5_1
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
    // InternalSchedule.g:1034:1: rule__StartAtStop__Group__0 : rule__StartAtStop__Group__0__Impl rule__StartAtStop__Group__1 ;
    public final void rule__StartAtStop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1038:1: ( rule__StartAtStop__Group__0__Impl rule__StartAtStop__Group__1 )
            // InternalSchedule.g:1039:2: rule__StartAtStop__Group__0__Impl rule__StartAtStop__Group__1
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
    // InternalSchedule.g:1046:1: rule__StartAtStop__Group__0__Impl : ( 'start' ) ;
    public final void rule__StartAtStop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1050:1: ( ( 'start' ) )
            // InternalSchedule.g:1051:1: ( 'start' )
            {
            // InternalSchedule.g:1051:1: ( 'start' )
            // InternalSchedule.g:1052:2: 'start'
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
    // InternalSchedule.g:1061:1: rule__StartAtStop__Group__1 : rule__StartAtStop__Group__1__Impl rule__StartAtStop__Group__2 ;
    public final void rule__StartAtStop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1065:1: ( rule__StartAtStop__Group__1__Impl rule__StartAtStop__Group__2 )
            // InternalSchedule.g:1066:2: rule__StartAtStop__Group__1__Impl rule__StartAtStop__Group__2
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
    // InternalSchedule.g:1073:1: rule__StartAtStop__Group__1__Impl : ( 'at' ) ;
    public final void rule__StartAtStop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1077:1: ( ( 'at' ) )
            // InternalSchedule.g:1078:1: ( 'at' )
            {
            // InternalSchedule.g:1078:1: ( 'at' )
            // InternalSchedule.g:1079:2: 'at'
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
    // InternalSchedule.g:1088:1: rule__StartAtStop__Group__2 : rule__StartAtStop__Group__2__Impl rule__StartAtStop__Group__3 ;
    public final void rule__StartAtStop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1092:1: ( rule__StartAtStop__Group__2__Impl rule__StartAtStop__Group__3 )
            // InternalSchedule.g:1093:2: rule__StartAtStop__Group__2__Impl rule__StartAtStop__Group__3
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
    // InternalSchedule.g:1100:1: rule__StartAtStop__Group__2__Impl : ( ( rule__StartAtStop__StationAssignment_2 ) ) ;
    public final void rule__StartAtStop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1104:1: ( ( ( rule__StartAtStop__StationAssignment_2 ) ) )
            // InternalSchedule.g:1105:1: ( ( rule__StartAtStop__StationAssignment_2 ) )
            {
            // InternalSchedule.g:1105:1: ( ( rule__StartAtStop__StationAssignment_2 ) )
            // InternalSchedule.g:1106:2: ( rule__StartAtStop__StationAssignment_2 )
            {
             before(grammarAccess.getStartAtStopAccess().getStationAssignment_2()); 
            // InternalSchedule.g:1107:2: ( rule__StartAtStop__StationAssignment_2 )
            // InternalSchedule.g:1107:3: rule__StartAtStop__StationAssignment_2
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
    // InternalSchedule.g:1115:1: rule__StartAtStop__Group__3 : rule__StartAtStop__Group__3__Impl rule__StartAtStop__Group__4 ;
    public final void rule__StartAtStop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1119:1: ( rule__StartAtStop__Group__3__Impl rule__StartAtStop__Group__4 )
            // InternalSchedule.g:1120:2: rule__StartAtStop__Group__3__Impl rule__StartAtStop__Group__4
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
    // InternalSchedule.g:1127:1: rule__StartAtStop__Group__3__Impl : ( 'on' ) ;
    public final void rule__StartAtStop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1131:1: ( ( 'on' ) )
            // InternalSchedule.g:1132:1: ( 'on' )
            {
            // InternalSchedule.g:1132:1: ( 'on' )
            // InternalSchedule.g:1133:2: 'on'
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
    // InternalSchedule.g:1142:1: rule__StartAtStop__Group__4 : rule__StartAtStop__Group__4__Impl rule__StartAtStop__Group__5 ;
    public final void rule__StartAtStop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1146:1: ( rule__StartAtStop__Group__4__Impl rule__StartAtStop__Group__5 )
            // InternalSchedule.g:1147:2: rule__StartAtStop__Group__4__Impl rule__StartAtStop__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalSchedule.g:1154:1: rule__StartAtStop__Group__4__Impl : ( 'platform' ) ;
    public final void rule__StartAtStop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1158:1: ( ( 'platform' ) )
            // InternalSchedule.g:1159:1: ( 'platform' )
            {
            // InternalSchedule.g:1159:1: ( 'platform' )
            // InternalSchedule.g:1160:2: 'platform'
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
    // InternalSchedule.g:1169:1: rule__StartAtStop__Group__5 : rule__StartAtStop__Group__5__Impl ;
    public final void rule__StartAtStop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1173:1: ( rule__StartAtStop__Group__5__Impl )
            // InternalSchedule.g:1174:2: rule__StartAtStop__Group__5__Impl
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
    // InternalSchedule.g:1180:1: rule__StartAtStop__Group__5__Impl : ( ( rule__StartAtStop__PlatformAssignment_5 ) ) ;
    public final void rule__StartAtStop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1184:1: ( ( ( rule__StartAtStop__PlatformAssignment_5 ) ) )
            // InternalSchedule.g:1185:1: ( ( rule__StartAtStop__PlatformAssignment_5 ) )
            {
            // InternalSchedule.g:1185:1: ( ( rule__StartAtStop__PlatformAssignment_5 ) )
            // InternalSchedule.g:1186:2: ( rule__StartAtStop__PlatformAssignment_5 )
            {
             before(grammarAccess.getStartAtStopAccess().getPlatformAssignment_5()); 
            // InternalSchedule.g:1187:2: ( rule__StartAtStop__PlatformAssignment_5 )
            // InternalSchedule.g:1187:3: rule__StartAtStop__PlatformAssignment_5
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
    // InternalSchedule.g:1196:1: rule__ViaStop__Group__0 : rule__ViaStop__Group__0__Impl rule__ViaStop__Group__1 ;
    public final void rule__ViaStop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1200:1: ( rule__ViaStop__Group__0__Impl rule__ViaStop__Group__1 )
            // InternalSchedule.g:1201:2: rule__ViaStop__Group__0__Impl rule__ViaStop__Group__1
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
    // InternalSchedule.g:1208:1: rule__ViaStop__Group__0__Impl : ( 'drive' ) ;
    public final void rule__ViaStop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1212:1: ( ( 'drive' ) )
            // InternalSchedule.g:1213:1: ( 'drive' )
            {
            // InternalSchedule.g:1213:1: ( 'drive' )
            // InternalSchedule.g:1214:2: 'drive'
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
    // InternalSchedule.g:1223:1: rule__ViaStop__Group__1 : rule__ViaStop__Group__1__Impl rule__ViaStop__Group__2 ;
    public final void rule__ViaStop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1227:1: ( rule__ViaStop__Group__1__Impl rule__ViaStop__Group__2 )
            // InternalSchedule.g:1228:2: rule__ViaStop__Group__1__Impl rule__ViaStop__Group__2
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
    // InternalSchedule.g:1235:1: rule__ViaStop__Group__1__Impl : ( 'via' ) ;
    public final void rule__ViaStop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1239:1: ( ( 'via' ) )
            // InternalSchedule.g:1240:1: ( 'via' )
            {
            // InternalSchedule.g:1240:1: ( 'via' )
            // InternalSchedule.g:1241:2: 'via'
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
    // InternalSchedule.g:1250:1: rule__ViaStop__Group__2 : rule__ViaStop__Group__2__Impl rule__ViaStop__Group__3 ;
    public final void rule__ViaStop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1254:1: ( rule__ViaStop__Group__2__Impl rule__ViaStop__Group__3 )
            // InternalSchedule.g:1255:2: rule__ViaStop__Group__2__Impl rule__ViaStop__Group__3
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
    // InternalSchedule.g:1262:1: rule__ViaStop__Group__2__Impl : ( ( rule__ViaStop__ViaAssignment_2 ) ) ;
    public final void rule__ViaStop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1266:1: ( ( ( rule__ViaStop__ViaAssignment_2 ) ) )
            // InternalSchedule.g:1267:1: ( ( rule__ViaStop__ViaAssignment_2 ) )
            {
            // InternalSchedule.g:1267:1: ( ( rule__ViaStop__ViaAssignment_2 ) )
            // InternalSchedule.g:1268:2: ( rule__ViaStop__ViaAssignment_2 )
            {
             before(grammarAccess.getViaStopAccess().getViaAssignment_2()); 
            // InternalSchedule.g:1269:2: ( rule__ViaStop__ViaAssignment_2 )
            // InternalSchedule.g:1269:3: rule__ViaStop__ViaAssignment_2
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
    // InternalSchedule.g:1277:1: rule__ViaStop__Group__3 : rule__ViaStop__Group__3__Impl rule__ViaStop__Group__4 ;
    public final void rule__ViaStop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1281:1: ( rule__ViaStop__Group__3__Impl rule__ViaStop__Group__4 )
            // InternalSchedule.g:1282:2: rule__ViaStop__Group__3__Impl rule__ViaStop__Group__4
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
    // InternalSchedule.g:1289:1: rule__ViaStop__Group__3__Impl : ( 'and' ) ;
    public final void rule__ViaStop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1293:1: ( ( 'and' ) )
            // InternalSchedule.g:1294:1: ( 'and' )
            {
            // InternalSchedule.g:1294:1: ( 'and' )
            // InternalSchedule.g:1295:2: 'and'
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
    // InternalSchedule.g:1304:1: rule__ViaStop__Group__4 : rule__ViaStop__Group__4__Impl rule__ViaStop__Group__5 ;
    public final void rule__ViaStop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1308:1: ( rule__ViaStop__Group__4__Impl rule__ViaStop__Group__5 )
            // InternalSchedule.g:1309:2: rule__ViaStop__Group__4__Impl rule__ViaStop__Group__5
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
    // InternalSchedule.g:1316:1: rule__ViaStop__Group__4__Impl : ( 'stop' ) ;
    public final void rule__ViaStop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1320:1: ( ( 'stop' ) )
            // InternalSchedule.g:1321:1: ( 'stop' )
            {
            // InternalSchedule.g:1321:1: ( 'stop' )
            // InternalSchedule.g:1322:2: 'stop'
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
    // InternalSchedule.g:1331:1: rule__ViaStop__Group__5 : rule__ViaStop__Group__5__Impl rule__ViaStop__Group__6 ;
    public final void rule__ViaStop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1335:1: ( rule__ViaStop__Group__5__Impl rule__ViaStop__Group__6 )
            // InternalSchedule.g:1336:2: rule__ViaStop__Group__5__Impl rule__ViaStop__Group__6
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
    // InternalSchedule.g:1343:1: rule__ViaStop__Group__5__Impl : ( 'at' ) ;
    public final void rule__ViaStop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1347:1: ( ( 'at' ) )
            // InternalSchedule.g:1348:1: ( 'at' )
            {
            // InternalSchedule.g:1348:1: ( 'at' )
            // InternalSchedule.g:1349:2: 'at'
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
    // InternalSchedule.g:1358:1: rule__ViaStop__Group__6 : rule__ViaStop__Group__6__Impl rule__ViaStop__Group__7 ;
    public final void rule__ViaStop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1362:1: ( rule__ViaStop__Group__6__Impl rule__ViaStop__Group__7 )
            // InternalSchedule.g:1363:2: rule__ViaStop__Group__6__Impl rule__ViaStop__Group__7
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
    // InternalSchedule.g:1370:1: rule__ViaStop__Group__6__Impl : ( ( rule__ViaStop__StationAssignment_6 ) ) ;
    public final void rule__ViaStop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1374:1: ( ( ( rule__ViaStop__StationAssignment_6 ) ) )
            // InternalSchedule.g:1375:1: ( ( rule__ViaStop__StationAssignment_6 ) )
            {
            // InternalSchedule.g:1375:1: ( ( rule__ViaStop__StationAssignment_6 ) )
            // InternalSchedule.g:1376:2: ( rule__ViaStop__StationAssignment_6 )
            {
             before(grammarAccess.getViaStopAccess().getStationAssignment_6()); 
            // InternalSchedule.g:1377:2: ( rule__ViaStop__StationAssignment_6 )
            // InternalSchedule.g:1377:3: rule__ViaStop__StationAssignment_6
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
    // InternalSchedule.g:1385:1: rule__ViaStop__Group__7 : rule__ViaStop__Group__7__Impl rule__ViaStop__Group__8 ;
    public final void rule__ViaStop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1389:1: ( rule__ViaStop__Group__7__Impl rule__ViaStop__Group__8 )
            // InternalSchedule.g:1390:2: rule__ViaStop__Group__7__Impl rule__ViaStop__Group__8
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
    // InternalSchedule.g:1397:1: rule__ViaStop__Group__7__Impl : ( 'on' ) ;
    public final void rule__ViaStop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1401:1: ( ( 'on' ) )
            // InternalSchedule.g:1402:1: ( 'on' )
            {
            // InternalSchedule.g:1402:1: ( 'on' )
            // InternalSchedule.g:1403:2: 'on'
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
    // InternalSchedule.g:1412:1: rule__ViaStop__Group__8 : rule__ViaStop__Group__8__Impl rule__ViaStop__Group__9 ;
    public final void rule__ViaStop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1416:1: ( rule__ViaStop__Group__8__Impl rule__ViaStop__Group__9 )
            // InternalSchedule.g:1417:2: rule__ViaStop__Group__8__Impl rule__ViaStop__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalSchedule.g:1424:1: rule__ViaStop__Group__8__Impl : ( 'platform' ) ;
    public final void rule__ViaStop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1428:1: ( ( 'platform' ) )
            // InternalSchedule.g:1429:1: ( 'platform' )
            {
            // InternalSchedule.g:1429:1: ( 'platform' )
            // InternalSchedule.g:1430:2: 'platform'
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
    // InternalSchedule.g:1439:1: rule__ViaStop__Group__9 : rule__ViaStop__Group__9__Impl rule__ViaStop__Group__10 ;
    public final void rule__ViaStop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1443:1: ( rule__ViaStop__Group__9__Impl rule__ViaStop__Group__10 )
            // InternalSchedule.g:1444:2: rule__ViaStop__Group__9__Impl rule__ViaStop__Group__10
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
    // InternalSchedule.g:1451:1: rule__ViaStop__Group__9__Impl : ( ( rule__ViaStop__PlatformAssignment_9 ) ) ;
    public final void rule__ViaStop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1455:1: ( ( ( rule__ViaStop__PlatformAssignment_9 ) ) )
            // InternalSchedule.g:1456:1: ( ( rule__ViaStop__PlatformAssignment_9 ) )
            {
            // InternalSchedule.g:1456:1: ( ( rule__ViaStop__PlatformAssignment_9 ) )
            // InternalSchedule.g:1457:2: ( rule__ViaStop__PlatformAssignment_9 )
            {
             before(grammarAccess.getViaStopAccess().getPlatformAssignment_9()); 
            // InternalSchedule.g:1458:2: ( rule__ViaStop__PlatformAssignment_9 )
            // InternalSchedule.g:1458:3: rule__ViaStop__PlatformAssignment_9
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
    // InternalSchedule.g:1466:1: rule__ViaStop__Group__10 : rule__ViaStop__Group__10__Impl rule__ViaStop__Group__11 ;
    public final void rule__ViaStop__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1470:1: ( rule__ViaStop__Group__10__Impl rule__ViaStop__Group__11 )
            // InternalSchedule.g:1471:2: rule__ViaStop__Group__10__Impl rule__ViaStop__Group__11
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
    // InternalSchedule.g:1478:1: rule__ViaStop__Group__10__Impl : ( 'for' ) ;
    public final void rule__ViaStop__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1482:1: ( ( 'for' ) )
            // InternalSchedule.g:1483:1: ( 'for' )
            {
            // InternalSchedule.g:1483:1: ( 'for' )
            // InternalSchedule.g:1484:2: 'for'
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
    // InternalSchedule.g:1493:1: rule__ViaStop__Group__11 : rule__ViaStop__Group__11__Impl rule__ViaStop__Group__12 ;
    public final void rule__ViaStop__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1497:1: ( rule__ViaStop__Group__11__Impl rule__ViaStop__Group__12 )
            // InternalSchedule.g:1498:2: rule__ViaStop__Group__11__Impl rule__ViaStop__Group__12
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
    // InternalSchedule.g:1505:1: rule__ViaStop__Group__11__Impl : ( ( rule__ViaStop__StoppedTimeAssignment_11 ) ) ;
    public final void rule__ViaStop__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1509:1: ( ( ( rule__ViaStop__StoppedTimeAssignment_11 ) ) )
            // InternalSchedule.g:1510:1: ( ( rule__ViaStop__StoppedTimeAssignment_11 ) )
            {
            // InternalSchedule.g:1510:1: ( ( rule__ViaStop__StoppedTimeAssignment_11 ) )
            // InternalSchedule.g:1511:2: ( rule__ViaStop__StoppedTimeAssignment_11 )
            {
             before(grammarAccess.getViaStopAccess().getStoppedTimeAssignment_11()); 
            // InternalSchedule.g:1512:2: ( rule__ViaStop__StoppedTimeAssignment_11 )
            // InternalSchedule.g:1512:3: rule__ViaStop__StoppedTimeAssignment_11
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
    // InternalSchedule.g:1520:1: rule__ViaStop__Group__12 : rule__ViaStop__Group__12__Impl rule__ViaStop__Group__13 ;
    public final void rule__ViaStop__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1524:1: ( rule__ViaStop__Group__12__Impl rule__ViaStop__Group__13 )
            // InternalSchedule.g:1525:2: rule__ViaStop__Group__12__Impl rule__ViaStop__Group__13
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
    // InternalSchedule.g:1532:1: rule__ViaStop__Group__12__Impl : ( 'min' ) ;
    public final void rule__ViaStop__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1536:1: ( ( 'min' ) )
            // InternalSchedule.g:1537:1: ( 'min' )
            {
            // InternalSchedule.g:1537:1: ( 'min' )
            // InternalSchedule.g:1538:2: 'min'
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
    // InternalSchedule.g:1547:1: rule__ViaStop__Group__13 : rule__ViaStop__Group__13__Impl ;
    public final void rule__ViaStop__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1551:1: ( rule__ViaStop__Group__13__Impl )
            // InternalSchedule.g:1552:2: rule__ViaStop__Group__13__Impl
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
    // InternalSchedule.g:1558:1: rule__ViaStop__Group__13__Impl : ( ( rule__ViaStop__Group_13__0 )? ) ;
    public final void rule__ViaStop__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1562:1: ( ( ( rule__ViaStop__Group_13__0 )? ) )
            // InternalSchedule.g:1563:1: ( ( rule__ViaStop__Group_13__0 )? )
            {
            // InternalSchedule.g:1563:1: ( ( rule__ViaStop__Group_13__0 )? )
            // InternalSchedule.g:1564:2: ( rule__ViaStop__Group_13__0 )?
            {
             before(grammarAccess.getViaStopAccess().getGroup_13()); 
            // InternalSchedule.g:1565:2: ( rule__ViaStop__Group_13__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSchedule.g:1565:3: rule__ViaStop__Group_13__0
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
    // InternalSchedule.g:1574:1: rule__ViaStop__Group_13__0 : rule__ViaStop__Group_13__0__Impl rule__ViaStop__Group_13__1 ;
    public final void rule__ViaStop__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1578:1: ( rule__ViaStop__Group_13__0__Impl rule__ViaStop__Group_13__1 )
            // InternalSchedule.g:1579:2: rule__ViaStop__Group_13__0__Impl rule__ViaStop__Group_13__1
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
    // InternalSchedule.g:1586:1: rule__ViaStop__Group_13__0__Impl : ( 'and' ) ;
    public final void rule__ViaStop__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1590:1: ( ( 'and' ) )
            // InternalSchedule.g:1591:1: ( 'and' )
            {
            // InternalSchedule.g:1591:1: ( 'and' )
            // InternalSchedule.g:1592:2: 'and'
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
    // InternalSchedule.g:1601:1: rule__ViaStop__Group_13__1 : rule__ViaStop__Group_13__1__Impl ;
    public final void rule__ViaStop__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1605:1: ( rule__ViaStop__Group_13__1__Impl )
            // InternalSchedule.g:1606:2: rule__ViaStop__Group_13__1__Impl
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
    // InternalSchedule.g:1612:1: rule__ViaStop__Group_13__1__Impl : ( ( rule__ViaStop__RotateAssignment_13_1 ) ) ;
    public final void rule__ViaStop__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1616:1: ( ( ( rule__ViaStop__RotateAssignment_13_1 ) ) )
            // InternalSchedule.g:1617:1: ( ( rule__ViaStop__RotateAssignment_13_1 ) )
            {
            // InternalSchedule.g:1617:1: ( ( rule__ViaStop__RotateAssignment_13_1 ) )
            // InternalSchedule.g:1618:2: ( rule__ViaStop__RotateAssignment_13_1 )
            {
             before(grammarAccess.getViaStopAccess().getRotateAssignment_13_1()); 
            // InternalSchedule.g:1619:2: ( rule__ViaStop__RotateAssignment_13_1 )
            // InternalSchedule.g:1619:3: rule__ViaStop__RotateAssignment_13_1
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
    // InternalSchedule.g:1628:1: rule__NormalStop__Group__0 : rule__NormalStop__Group__0__Impl rule__NormalStop__Group__1 ;
    public final void rule__NormalStop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1632:1: ( rule__NormalStop__Group__0__Impl rule__NormalStop__Group__1 )
            // InternalSchedule.g:1633:2: rule__NormalStop__Group__0__Impl rule__NormalStop__Group__1
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
    // InternalSchedule.g:1640:1: rule__NormalStop__Group__0__Impl : ( 'stop' ) ;
    public final void rule__NormalStop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1644:1: ( ( 'stop' ) )
            // InternalSchedule.g:1645:1: ( 'stop' )
            {
            // InternalSchedule.g:1645:1: ( 'stop' )
            // InternalSchedule.g:1646:2: 'stop'
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
    // InternalSchedule.g:1655:1: rule__NormalStop__Group__1 : rule__NormalStop__Group__1__Impl rule__NormalStop__Group__2 ;
    public final void rule__NormalStop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1659:1: ( rule__NormalStop__Group__1__Impl rule__NormalStop__Group__2 )
            // InternalSchedule.g:1660:2: rule__NormalStop__Group__1__Impl rule__NormalStop__Group__2
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
    // InternalSchedule.g:1667:1: rule__NormalStop__Group__1__Impl : ( 'at' ) ;
    public final void rule__NormalStop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1671:1: ( ( 'at' ) )
            // InternalSchedule.g:1672:1: ( 'at' )
            {
            // InternalSchedule.g:1672:1: ( 'at' )
            // InternalSchedule.g:1673:2: 'at'
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
    // InternalSchedule.g:1682:1: rule__NormalStop__Group__2 : rule__NormalStop__Group__2__Impl rule__NormalStop__Group__3 ;
    public final void rule__NormalStop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1686:1: ( rule__NormalStop__Group__2__Impl rule__NormalStop__Group__3 )
            // InternalSchedule.g:1687:2: rule__NormalStop__Group__2__Impl rule__NormalStop__Group__3
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
    // InternalSchedule.g:1694:1: rule__NormalStop__Group__2__Impl : ( ( rule__NormalStop__StationAssignment_2 ) ) ;
    public final void rule__NormalStop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1698:1: ( ( ( rule__NormalStop__StationAssignment_2 ) ) )
            // InternalSchedule.g:1699:1: ( ( rule__NormalStop__StationAssignment_2 ) )
            {
            // InternalSchedule.g:1699:1: ( ( rule__NormalStop__StationAssignment_2 ) )
            // InternalSchedule.g:1700:2: ( rule__NormalStop__StationAssignment_2 )
            {
             before(grammarAccess.getNormalStopAccess().getStationAssignment_2()); 
            // InternalSchedule.g:1701:2: ( rule__NormalStop__StationAssignment_2 )
            // InternalSchedule.g:1701:3: rule__NormalStop__StationAssignment_2
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
    // InternalSchedule.g:1709:1: rule__NormalStop__Group__3 : rule__NormalStop__Group__3__Impl rule__NormalStop__Group__4 ;
    public final void rule__NormalStop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1713:1: ( rule__NormalStop__Group__3__Impl rule__NormalStop__Group__4 )
            // InternalSchedule.g:1714:2: rule__NormalStop__Group__3__Impl rule__NormalStop__Group__4
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
    // InternalSchedule.g:1721:1: rule__NormalStop__Group__3__Impl : ( 'on' ) ;
    public final void rule__NormalStop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1725:1: ( ( 'on' ) )
            // InternalSchedule.g:1726:1: ( 'on' )
            {
            // InternalSchedule.g:1726:1: ( 'on' )
            // InternalSchedule.g:1727:2: 'on'
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
    // InternalSchedule.g:1736:1: rule__NormalStop__Group__4 : rule__NormalStop__Group__4__Impl rule__NormalStop__Group__5 ;
    public final void rule__NormalStop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1740:1: ( rule__NormalStop__Group__4__Impl rule__NormalStop__Group__5 )
            // InternalSchedule.g:1741:2: rule__NormalStop__Group__4__Impl rule__NormalStop__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalSchedule.g:1748:1: rule__NormalStop__Group__4__Impl : ( 'platform' ) ;
    public final void rule__NormalStop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1752:1: ( ( 'platform' ) )
            // InternalSchedule.g:1753:1: ( 'platform' )
            {
            // InternalSchedule.g:1753:1: ( 'platform' )
            // InternalSchedule.g:1754:2: 'platform'
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
    // InternalSchedule.g:1763:1: rule__NormalStop__Group__5 : rule__NormalStop__Group__5__Impl rule__NormalStop__Group__6 ;
    public final void rule__NormalStop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1767:1: ( rule__NormalStop__Group__5__Impl rule__NormalStop__Group__6 )
            // InternalSchedule.g:1768:2: rule__NormalStop__Group__5__Impl rule__NormalStop__Group__6
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
    // InternalSchedule.g:1775:1: rule__NormalStop__Group__5__Impl : ( ( rule__NormalStop__PlatformAssignment_5 ) ) ;
    public final void rule__NormalStop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1779:1: ( ( ( rule__NormalStop__PlatformAssignment_5 ) ) )
            // InternalSchedule.g:1780:1: ( ( rule__NormalStop__PlatformAssignment_5 ) )
            {
            // InternalSchedule.g:1780:1: ( ( rule__NormalStop__PlatformAssignment_5 ) )
            // InternalSchedule.g:1781:2: ( rule__NormalStop__PlatformAssignment_5 )
            {
             before(grammarAccess.getNormalStopAccess().getPlatformAssignment_5()); 
            // InternalSchedule.g:1782:2: ( rule__NormalStop__PlatformAssignment_5 )
            // InternalSchedule.g:1782:3: rule__NormalStop__PlatformAssignment_5
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
    // InternalSchedule.g:1790:1: rule__NormalStop__Group__6 : rule__NormalStop__Group__6__Impl rule__NormalStop__Group__7 ;
    public final void rule__NormalStop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1794:1: ( rule__NormalStop__Group__6__Impl rule__NormalStop__Group__7 )
            // InternalSchedule.g:1795:2: rule__NormalStop__Group__6__Impl rule__NormalStop__Group__7
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
    // InternalSchedule.g:1802:1: rule__NormalStop__Group__6__Impl : ( 'for' ) ;
    public final void rule__NormalStop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1806:1: ( ( 'for' ) )
            // InternalSchedule.g:1807:1: ( 'for' )
            {
            // InternalSchedule.g:1807:1: ( 'for' )
            // InternalSchedule.g:1808:2: 'for'
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
    // InternalSchedule.g:1817:1: rule__NormalStop__Group__7 : rule__NormalStop__Group__7__Impl rule__NormalStop__Group__8 ;
    public final void rule__NormalStop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1821:1: ( rule__NormalStop__Group__7__Impl rule__NormalStop__Group__8 )
            // InternalSchedule.g:1822:2: rule__NormalStop__Group__7__Impl rule__NormalStop__Group__8
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
    // InternalSchedule.g:1829:1: rule__NormalStop__Group__7__Impl : ( ( rule__NormalStop__StoppedTimeAssignment_7 ) ) ;
    public final void rule__NormalStop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1833:1: ( ( ( rule__NormalStop__StoppedTimeAssignment_7 ) ) )
            // InternalSchedule.g:1834:1: ( ( rule__NormalStop__StoppedTimeAssignment_7 ) )
            {
            // InternalSchedule.g:1834:1: ( ( rule__NormalStop__StoppedTimeAssignment_7 ) )
            // InternalSchedule.g:1835:2: ( rule__NormalStop__StoppedTimeAssignment_7 )
            {
             before(grammarAccess.getNormalStopAccess().getStoppedTimeAssignment_7()); 
            // InternalSchedule.g:1836:2: ( rule__NormalStop__StoppedTimeAssignment_7 )
            // InternalSchedule.g:1836:3: rule__NormalStop__StoppedTimeAssignment_7
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
    // InternalSchedule.g:1844:1: rule__NormalStop__Group__8 : rule__NormalStop__Group__8__Impl rule__NormalStop__Group__9 ;
    public final void rule__NormalStop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1848:1: ( rule__NormalStop__Group__8__Impl rule__NormalStop__Group__9 )
            // InternalSchedule.g:1849:2: rule__NormalStop__Group__8__Impl rule__NormalStop__Group__9
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
    // InternalSchedule.g:1856:1: rule__NormalStop__Group__8__Impl : ( 'min' ) ;
    public final void rule__NormalStop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1860:1: ( ( 'min' ) )
            // InternalSchedule.g:1861:1: ( 'min' )
            {
            // InternalSchedule.g:1861:1: ( 'min' )
            // InternalSchedule.g:1862:2: 'min'
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
    // InternalSchedule.g:1871:1: rule__NormalStop__Group__9 : rule__NormalStop__Group__9__Impl ;
    public final void rule__NormalStop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1875:1: ( rule__NormalStop__Group__9__Impl )
            // InternalSchedule.g:1876:2: rule__NormalStop__Group__9__Impl
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
    // InternalSchedule.g:1882:1: rule__NormalStop__Group__9__Impl : ( ( rule__NormalStop__Group_9__0 )? ) ;
    public final void rule__NormalStop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1886:1: ( ( ( rule__NormalStop__Group_9__0 )? ) )
            // InternalSchedule.g:1887:1: ( ( rule__NormalStop__Group_9__0 )? )
            {
            // InternalSchedule.g:1887:1: ( ( rule__NormalStop__Group_9__0 )? )
            // InternalSchedule.g:1888:2: ( rule__NormalStop__Group_9__0 )?
            {
             before(grammarAccess.getNormalStopAccess().getGroup_9()); 
            // InternalSchedule.g:1889:2: ( rule__NormalStop__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSchedule.g:1889:3: rule__NormalStop__Group_9__0
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
    // InternalSchedule.g:1898:1: rule__NormalStop__Group_9__0 : rule__NormalStop__Group_9__0__Impl rule__NormalStop__Group_9__1 ;
    public final void rule__NormalStop__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1902:1: ( rule__NormalStop__Group_9__0__Impl rule__NormalStop__Group_9__1 )
            // InternalSchedule.g:1903:2: rule__NormalStop__Group_9__0__Impl rule__NormalStop__Group_9__1
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
    // InternalSchedule.g:1910:1: rule__NormalStop__Group_9__0__Impl : ( 'and' ) ;
    public final void rule__NormalStop__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1914:1: ( ( 'and' ) )
            // InternalSchedule.g:1915:1: ( 'and' )
            {
            // InternalSchedule.g:1915:1: ( 'and' )
            // InternalSchedule.g:1916:2: 'and'
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
    // InternalSchedule.g:1925:1: rule__NormalStop__Group_9__1 : rule__NormalStop__Group_9__1__Impl ;
    public final void rule__NormalStop__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1929:1: ( rule__NormalStop__Group_9__1__Impl )
            // InternalSchedule.g:1930:2: rule__NormalStop__Group_9__1__Impl
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
    // InternalSchedule.g:1936:1: rule__NormalStop__Group_9__1__Impl : ( ( rule__NormalStop__RotateAssignment_9_1 ) ) ;
    public final void rule__NormalStop__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1940:1: ( ( ( rule__NormalStop__RotateAssignment_9_1 ) ) )
            // InternalSchedule.g:1941:1: ( ( rule__NormalStop__RotateAssignment_9_1 ) )
            {
            // InternalSchedule.g:1941:1: ( ( rule__NormalStop__RotateAssignment_9_1 ) )
            // InternalSchedule.g:1942:2: ( rule__NormalStop__RotateAssignment_9_1 )
            {
             before(grammarAccess.getNormalStopAccess().getRotateAssignment_9_1()); 
            // InternalSchedule.g:1943:2: ( rule__NormalStop__RotateAssignment_9_1 )
            // InternalSchedule.g:1943:3: rule__NormalStop__RotateAssignment_9_1
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
    // InternalSchedule.g:1952:1: rule__TerminalStop__Group__0 : rule__TerminalStop__Group__0__Impl rule__TerminalStop__Group__1 ;
    public final void rule__TerminalStop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1956:1: ( rule__TerminalStop__Group__0__Impl rule__TerminalStop__Group__1 )
            // InternalSchedule.g:1957:2: rule__TerminalStop__Group__0__Impl rule__TerminalStop__Group__1
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
    // InternalSchedule.g:1964:1: rule__TerminalStop__Group__0__Impl : ( 'terminate' ) ;
    public final void rule__TerminalStop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1968:1: ( ( 'terminate' ) )
            // InternalSchedule.g:1969:1: ( 'terminate' )
            {
            // InternalSchedule.g:1969:1: ( 'terminate' )
            // InternalSchedule.g:1970:2: 'terminate'
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
    // InternalSchedule.g:1979:1: rule__TerminalStop__Group__1 : rule__TerminalStop__Group__1__Impl rule__TerminalStop__Group__2 ;
    public final void rule__TerminalStop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1983:1: ( rule__TerminalStop__Group__1__Impl rule__TerminalStop__Group__2 )
            // InternalSchedule.g:1984:2: rule__TerminalStop__Group__1__Impl rule__TerminalStop__Group__2
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
    // InternalSchedule.g:1991:1: rule__TerminalStop__Group__1__Impl : ( 'at' ) ;
    public final void rule__TerminalStop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:1995:1: ( ( 'at' ) )
            // InternalSchedule.g:1996:1: ( 'at' )
            {
            // InternalSchedule.g:1996:1: ( 'at' )
            // InternalSchedule.g:1997:2: 'at'
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
    // InternalSchedule.g:2006:1: rule__TerminalStop__Group__2 : rule__TerminalStop__Group__2__Impl rule__TerminalStop__Group__3 ;
    public final void rule__TerminalStop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2010:1: ( rule__TerminalStop__Group__2__Impl rule__TerminalStop__Group__3 )
            // InternalSchedule.g:2011:2: rule__TerminalStop__Group__2__Impl rule__TerminalStop__Group__3
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
    // InternalSchedule.g:2018:1: rule__TerminalStop__Group__2__Impl : ( ( rule__TerminalStop__StationAssignment_2 ) ) ;
    public final void rule__TerminalStop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2022:1: ( ( ( rule__TerminalStop__StationAssignment_2 ) ) )
            // InternalSchedule.g:2023:1: ( ( rule__TerminalStop__StationAssignment_2 ) )
            {
            // InternalSchedule.g:2023:1: ( ( rule__TerminalStop__StationAssignment_2 ) )
            // InternalSchedule.g:2024:2: ( rule__TerminalStop__StationAssignment_2 )
            {
             before(grammarAccess.getTerminalStopAccess().getStationAssignment_2()); 
            // InternalSchedule.g:2025:2: ( rule__TerminalStop__StationAssignment_2 )
            // InternalSchedule.g:2025:3: rule__TerminalStop__StationAssignment_2
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
    // InternalSchedule.g:2033:1: rule__TerminalStop__Group__3 : rule__TerminalStop__Group__3__Impl rule__TerminalStop__Group__4 ;
    public final void rule__TerminalStop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2037:1: ( rule__TerminalStop__Group__3__Impl rule__TerminalStop__Group__4 )
            // InternalSchedule.g:2038:2: rule__TerminalStop__Group__3__Impl rule__TerminalStop__Group__4
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
    // InternalSchedule.g:2045:1: rule__TerminalStop__Group__3__Impl : ( 'on' ) ;
    public final void rule__TerminalStop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2049:1: ( ( 'on' ) )
            // InternalSchedule.g:2050:1: ( 'on' )
            {
            // InternalSchedule.g:2050:1: ( 'on' )
            // InternalSchedule.g:2051:2: 'on'
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
    // InternalSchedule.g:2060:1: rule__TerminalStop__Group__4 : rule__TerminalStop__Group__4__Impl rule__TerminalStop__Group__5 ;
    public final void rule__TerminalStop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2064:1: ( rule__TerminalStop__Group__4__Impl rule__TerminalStop__Group__5 )
            // InternalSchedule.g:2065:2: rule__TerminalStop__Group__4__Impl rule__TerminalStop__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalSchedule.g:2072:1: rule__TerminalStop__Group__4__Impl : ( 'platform' ) ;
    public final void rule__TerminalStop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2076:1: ( ( 'platform' ) )
            // InternalSchedule.g:2077:1: ( 'platform' )
            {
            // InternalSchedule.g:2077:1: ( 'platform' )
            // InternalSchedule.g:2078:2: 'platform'
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
    // InternalSchedule.g:2087:1: rule__TerminalStop__Group__5 : rule__TerminalStop__Group__5__Impl ;
    public final void rule__TerminalStop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2091:1: ( rule__TerminalStop__Group__5__Impl )
            // InternalSchedule.g:2092:2: rule__TerminalStop__Group__5__Impl
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
    // InternalSchedule.g:2098:1: rule__TerminalStop__Group__5__Impl : ( ( rule__TerminalStop__PlatformAssignment_5 ) ) ;
    public final void rule__TerminalStop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2102:1: ( ( ( rule__TerminalStop__PlatformAssignment_5 ) ) )
            // InternalSchedule.g:2103:1: ( ( rule__TerminalStop__PlatformAssignment_5 ) )
            {
            // InternalSchedule.g:2103:1: ( ( rule__TerminalStop__PlatformAssignment_5 ) )
            // InternalSchedule.g:2104:2: ( rule__TerminalStop__PlatformAssignment_5 )
            {
             before(grammarAccess.getTerminalStopAccess().getPlatformAssignment_5()); 
            // InternalSchedule.g:2105:2: ( rule__TerminalStop__PlatformAssignment_5 )
            // InternalSchedule.g:2105:3: rule__TerminalStop__PlatformAssignment_5
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


    // $ANTLR start "rule__ViaTerminalStop__Group__0"
    // InternalSchedule.g:2114:1: rule__ViaTerminalStop__Group__0 : rule__ViaTerminalStop__Group__0__Impl rule__ViaTerminalStop__Group__1 ;
    public final void rule__ViaTerminalStop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2118:1: ( rule__ViaTerminalStop__Group__0__Impl rule__ViaTerminalStop__Group__1 )
            // InternalSchedule.g:2119:2: rule__ViaTerminalStop__Group__0__Impl rule__ViaTerminalStop__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ViaTerminalStop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__0"


    // $ANTLR start "rule__ViaTerminalStop__Group__0__Impl"
    // InternalSchedule.g:2126:1: rule__ViaTerminalStop__Group__0__Impl : ( 'drive' ) ;
    public final void rule__ViaTerminalStop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2130:1: ( ( 'drive' ) )
            // InternalSchedule.g:2131:1: ( 'drive' )
            {
            // InternalSchedule.g:2131:1: ( 'drive' )
            // InternalSchedule.g:2132:2: 'drive'
            {
             before(grammarAccess.getViaTerminalStopAccess().getDriveKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getViaTerminalStopAccess().getDriveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__0__Impl"


    // $ANTLR start "rule__ViaTerminalStop__Group__1"
    // InternalSchedule.g:2141:1: rule__ViaTerminalStop__Group__1 : rule__ViaTerminalStop__Group__1__Impl rule__ViaTerminalStop__Group__2 ;
    public final void rule__ViaTerminalStop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2145:1: ( rule__ViaTerminalStop__Group__1__Impl rule__ViaTerminalStop__Group__2 )
            // InternalSchedule.g:2146:2: rule__ViaTerminalStop__Group__1__Impl rule__ViaTerminalStop__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ViaTerminalStop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__1"


    // $ANTLR start "rule__ViaTerminalStop__Group__1__Impl"
    // InternalSchedule.g:2153:1: rule__ViaTerminalStop__Group__1__Impl : ( 'via' ) ;
    public final void rule__ViaTerminalStop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2157:1: ( ( 'via' ) )
            // InternalSchedule.g:2158:1: ( 'via' )
            {
            // InternalSchedule.g:2158:1: ( 'via' )
            // InternalSchedule.g:2159:2: 'via'
            {
             before(grammarAccess.getViaTerminalStopAccess().getViaKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getViaTerminalStopAccess().getViaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__1__Impl"


    // $ANTLR start "rule__ViaTerminalStop__Group__2"
    // InternalSchedule.g:2168:1: rule__ViaTerminalStop__Group__2 : rule__ViaTerminalStop__Group__2__Impl rule__ViaTerminalStop__Group__3 ;
    public final void rule__ViaTerminalStop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2172:1: ( rule__ViaTerminalStop__Group__2__Impl rule__ViaTerminalStop__Group__3 )
            // InternalSchedule.g:2173:2: rule__ViaTerminalStop__Group__2__Impl rule__ViaTerminalStop__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ViaTerminalStop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__2"


    // $ANTLR start "rule__ViaTerminalStop__Group__2__Impl"
    // InternalSchedule.g:2180:1: rule__ViaTerminalStop__Group__2__Impl : ( ( rule__ViaTerminalStop__ViaAssignment_2 ) ) ;
    public final void rule__ViaTerminalStop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2184:1: ( ( ( rule__ViaTerminalStop__ViaAssignment_2 ) ) )
            // InternalSchedule.g:2185:1: ( ( rule__ViaTerminalStop__ViaAssignment_2 ) )
            {
            // InternalSchedule.g:2185:1: ( ( rule__ViaTerminalStop__ViaAssignment_2 ) )
            // InternalSchedule.g:2186:2: ( rule__ViaTerminalStop__ViaAssignment_2 )
            {
             before(grammarAccess.getViaTerminalStopAccess().getViaAssignment_2()); 
            // InternalSchedule.g:2187:2: ( rule__ViaTerminalStop__ViaAssignment_2 )
            // InternalSchedule.g:2187:3: rule__ViaTerminalStop__ViaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__ViaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getViaTerminalStopAccess().getViaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__2__Impl"


    // $ANTLR start "rule__ViaTerminalStop__Group__3"
    // InternalSchedule.g:2195:1: rule__ViaTerminalStop__Group__3 : rule__ViaTerminalStop__Group__3__Impl rule__ViaTerminalStop__Group__4 ;
    public final void rule__ViaTerminalStop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2199:1: ( rule__ViaTerminalStop__Group__3__Impl rule__ViaTerminalStop__Group__4 )
            // InternalSchedule.g:2200:2: rule__ViaTerminalStop__Group__3__Impl rule__ViaTerminalStop__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ViaTerminalStop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__3"


    // $ANTLR start "rule__ViaTerminalStop__Group__3__Impl"
    // InternalSchedule.g:2207:1: rule__ViaTerminalStop__Group__3__Impl : ( 'and' ) ;
    public final void rule__ViaTerminalStop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2211:1: ( ( 'and' ) )
            // InternalSchedule.g:2212:1: ( 'and' )
            {
            // InternalSchedule.g:2212:1: ( 'and' )
            // InternalSchedule.g:2213:2: 'and'
            {
             before(grammarAccess.getViaTerminalStopAccess().getAndKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getViaTerminalStopAccess().getAndKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__3__Impl"


    // $ANTLR start "rule__ViaTerminalStop__Group__4"
    // InternalSchedule.g:2222:1: rule__ViaTerminalStop__Group__4 : rule__ViaTerminalStop__Group__4__Impl rule__ViaTerminalStop__Group__5 ;
    public final void rule__ViaTerminalStop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2226:1: ( rule__ViaTerminalStop__Group__4__Impl rule__ViaTerminalStop__Group__5 )
            // InternalSchedule.g:2227:2: rule__ViaTerminalStop__Group__4__Impl rule__ViaTerminalStop__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ViaTerminalStop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__4"


    // $ANTLR start "rule__ViaTerminalStop__Group__4__Impl"
    // InternalSchedule.g:2234:1: rule__ViaTerminalStop__Group__4__Impl : ( 'terminate' ) ;
    public final void rule__ViaTerminalStop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2238:1: ( ( 'terminate' ) )
            // InternalSchedule.g:2239:1: ( 'terminate' )
            {
            // InternalSchedule.g:2239:1: ( 'terminate' )
            // InternalSchedule.g:2240:2: 'terminate'
            {
             before(grammarAccess.getViaTerminalStopAccess().getTerminateKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getViaTerminalStopAccess().getTerminateKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__4__Impl"


    // $ANTLR start "rule__ViaTerminalStop__Group__5"
    // InternalSchedule.g:2249:1: rule__ViaTerminalStop__Group__5 : rule__ViaTerminalStop__Group__5__Impl rule__ViaTerminalStop__Group__6 ;
    public final void rule__ViaTerminalStop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2253:1: ( rule__ViaTerminalStop__Group__5__Impl rule__ViaTerminalStop__Group__6 )
            // InternalSchedule.g:2254:2: rule__ViaTerminalStop__Group__5__Impl rule__ViaTerminalStop__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ViaTerminalStop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__5"


    // $ANTLR start "rule__ViaTerminalStop__Group__5__Impl"
    // InternalSchedule.g:2261:1: rule__ViaTerminalStop__Group__5__Impl : ( 'at' ) ;
    public final void rule__ViaTerminalStop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2265:1: ( ( 'at' ) )
            // InternalSchedule.g:2266:1: ( 'at' )
            {
            // InternalSchedule.g:2266:1: ( 'at' )
            // InternalSchedule.g:2267:2: 'at'
            {
             before(grammarAccess.getViaTerminalStopAccess().getAtKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getViaTerminalStopAccess().getAtKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__5__Impl"


    // $ANTLR start "rule__ViaTerminalStop__Group__6"
    // InternalSchedule.g:2276:1: rule__ViaTerminalStop__Group__6 : rule__ViaTerminalStop__Group__6__Impl rule__ViaTerminalStop__Group__7 ;
    public final void rule__ViaTerminalStop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2280:1: ( rule__ViaTerminalStop__Group__6__Impl rule__ViaTerminalStop__Group__7 )
            // InternalSchedule.g:2281:2: rule__ViaTerminalStop__Group__6__Impl rule__ViaTerminalStop__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ViaTerminalStop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__6"


    // $ANTLR start "rule__ViaTerminalStop__Group__6__Impl"
    // InternalSchedule.g:2288:1: rule__ViaTerminalStop__Group__6__Impl : ( ( rule__ViaTerminalStop__StationAssignment_6 ) ) ;
    public final void rule__ViaTerminalStop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2292:1: ( ( ( rule__ViaTerminalStop__StationAssignment_6 ) ) )
            // InternalSchedule.g:2293:1: ( ( rule__ViaTerminalStop__StationAssignment_6 ) )
            {
            // InternalSchedule.g:2293:1: ( ( rule__ViaTerminalStop__StationAssignment_6 ) )
            // InternalSchedule.g:2294:2: ( rule__ViaTerminalStop__StationAssignment_6 )
            {
             before(grammarAccess.getViaTerminalStopAccess().getStationAssignment_6()); 
            // InternalSchedule.g:2295:2: ( rule__ViaTerminalStop__StationAssignment_6 )
            // InternalSchedule.g:2295:3: rule__ViaTerminalStop__StationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__StationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getViaTerminalStopAccess().getStationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__6__Impl"


    // $ANTLR start "rule__ViaTerminalStop__Group__7"
    // InternalSchedule.g:2303:1: rule__ViaTerminalStop__Group__7 : rule__ViaTerminalStop__Group__7__Impl rule__ViaTerminalStop__Group__8 ;
    public final void rule__ViaTerminalStop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2307:1: ( rule__ViaTerminalStop__Group__7__Impl rule__ViaTerminalStop__Group__8 )
            // InternalSchedule.g:2308:2: rule__ViaTerminalStop__Group__7__Impl rule__ViaTerminalStop__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__ViaTerminalStop__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__7"


    // $ANTLR start "rule__ViaTerminalStop__Group__7__Impl"
    // InternalSchedule.g:2315:1: rule__ViaTerminalStop__Group__7__Impl : ( 'on' ) ;
    public final void rule__ViaTerminalStop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2319:1: ( ( 'on' ) )
            // InternalSchedule.g:2320:1: ( 'on' )
            {
            // InternalSchedule.g:2320:1: ( 'on' )
            // InternalSchedule.g:2321:2: 'on'
            {
             before(grammarAccess.getViaTerminalStopAccess().getOnKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getViaTerminalStopAccess().getOnKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__7__Impl"


    // $ANTLR start "rule__ViaTerminalStop__Group__8"
    // InternalSchedule.g:2330:1: rule__ViaTerminalStop__Group__8 : rule__ViaTerminalStop__Group__8__Impl rule__ViaTerminalStop__Group__9 ;
    public final void rule__ViaTerminalStop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2334:1: ( rule__ViaTerminalStop__Group__8__Impl rule__ViaTerminalStop__Group__9 )
            // InternalSchedule.g:2335:2: rule__ViaTerminalStop__Group__8__Impl rule__ViaTerminalStop__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__ViaTerminalStop__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__8"


    // $ANTLR start "rule__ViaTerminalStop__Group__8__Impl"
    // InternalSchedule.g:2342:1: rule__ViaTerminalStop__Group__8__Impl : ( 'platform' ) ;
    public final void rule__ViaTerminalStop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2346:1: ( ( 'platform' ) )
            // InternalSchedule.g:2347:1: ( 'platform' )
            {
            // InternalSchedule.g:2347:1: ( 'platform' )
            // InternalSchedule.g:2348:2: 'platform'
            {
             before(grammarAccess.getViaTerminalStopAccess().getPlatformKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getViaTerminalStopAccess().getPlatformKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__8__Impl"


    // $ANTLR start "rule__ViaTerminalStop__Group__9"
    // InternalSchedule.g:2357:1: rule__ViaTerminalStop__Group__9 : rule__ViaTerminalStop__Group__9__Impl ;
    public final void rule__ViaTerminalStop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2361:1: ( rule__ViaTerminalStop__Group__9__Impl )
            // InternalSchedule.g:2362:2: rule__ViaTerminalStop__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__9"


    // $ANTLR start "rule__ViaTerminalStop__Group__9__Impl"
    // InternalSchedule.g:2368:1: rule__ViaTerminalStop__Group__9__Impl : ( ( rule__ViaTerminalStop__PlatformAssignment_9 ) ) ;
    public final void rule__ViaTerminalStop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2372:1: ( ( ( rule__ViaTerminalStop__PlatformAssignment_9 ) ) )
            // InternalSchedule.g:2373:1: ( ( rule__ViaTerminalStop__PlatformAssignment_9 ) )
            {
            // InternalSchedule.g:2373:1: ( ( rule__ViaTerminalStop__PlatformAssignment_9 ) )
            // InternalSchedule.g:2374:2: ( rule__ViaTerminalStop__PlatformAssignment_9 )
            {
             before(grammarAccess.getViaTerminalStopAccess().getPlatformAssignment_9()); 
            // InternalSchedule.g:2375:2: ( rule__ViaTerminalStop__PlatformAssignment_9 )
            // InternalSchedule.g:2375:3: rule__ViaTerminalStop__PlatformAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ViaTerminalStop__PlatformAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getViaTerminalStopAccess().getPlatformAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__Group__9__Impl"


    // $ANTLR start "rule__StartTime__Group__0"
    // InternalSchedule.g:2384:1: rule__StartTime__Group__0 : rule__StartTime__Group__0__Impl rule__StartTime__Group__1 ;
    public final void rule__StartTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2388:1: ( rule__StartTime__Group__0__Impl rule__StartTime__Group__1 )
            // InternalSchedule.g:2389:2: rule__StartTime__Group__0__Impl rule__StartTime__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSchedule.g:2396:1: rule__StartTime__Group__0__Impl : ( ( rule__StartTime__WeekdaysAssignment_0 ) ) ;
    public final void rule__StartTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2400:1: ( ( ( rule__StartTime__WeekdaysAssignment_0 ) ) )
            // InternalSchedule.g:2401:1: ( ( rule__StartTime__WeekdaysAssignment_0 ) )
            {
            // InternalSchedule.g:2401:1: ( ( rule__StartTime__WeekdaysAssignment_0 ) )
            // InternalSchedule.g:2402:2: ( rule__StartTime__WeekdaysAssignment_0 )
            {
             before(grammarAccess.getStartTimeAccess().getWeekdaysAssignment_0()); 
            // InternalSchedule.g:2403:2: ( rule__StartTime__WeekdaysAssignment_0 )
            // InternalSchedule.g:2403:3: rule__StartTime__WeekdaysAssignment_0
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
    // InternalSchedule.g:2411:1: rule__StartTime__Group__1 : rule__StartTime__Group__1__Impl rule__StartTime__Group__2 ;
    public final void rule__StartTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2415:1: ( rule__StartTime__Group__1__Impl rule__StartTime__Group__2 )
            // InternalSchedule.g:2416:2: rule__StartTime__Group__1__Impl rule__StartTime__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSchedule.g:2423:1: rule__StartTime__Group__1__Impl : ( ( rule__StartTime__Group_1__0 )* ) ;
    public final void rule__StartTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2427:1: ( ( ( rule__StartTime__Group_1__0 )* ) )
            // InternalSchedule.g:2428:1: ( ( rule__StartTime__Group_1__0 )* )
            {
            // InternalSchedule.g:2428:1: ( ( rule__StartTime__Group_1__0 )* )
            // InternalSchedule.g:2429:2: ( rule__StartTime__Group_1__0 )*
            {
             before(grammarAccess.getStartTimeAccess().getGroup_1()); 
            // InternalSchedule.g:2430:2: ( rule__StartTime__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSchedule.g:2430:3: rule__StartTime__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StartTime__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSchedule.g:2438:1: rule__StartTime__Group__2 : rule__StartTime__Group__2__Impl rule__StartTime__Group__3 ;
    public final void rule__StartTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2442:1: ( rule__StartTime__Group__2__Impl rule__StartTime__Group__3 )
            // InternalSchedule.g:2443:2: rule__StartTime__Group__2__Impl rule__StartTime__Group__3
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
    // InternalSchedule.g:2450:1: rule__StartTime__Group__2__Impl : ( 'at' ) ;
    public final void rule__StartTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2454:1: ( ( 'at' ) )
            // InternalSchedule.g:2455:1: ( 'at' )
            {
            // InternalSchedule.g:2455:1: ( 'at' )
            // InternalSchedule.g:2456:2: 'at'
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
    // InternalSchedule.g:2465:1: rule__StartTime__Group__3 : rule__StartTime__Group__3__Impl rule__StartTime__Group__4 ;
    public final void rule__StartTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2469:1: ( rule__StartTime__Group__3__Impl rule__StartTime__Group__4 )
            // InternalSchedule.g:2470:2: rule__StartTime__Group__3__Impl rule__StartTime__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalSchedule.g:2477:1: rule__StartTime__Group__3__Impl : ( ( rule__StartTime__TimestampsAssignment_3 ) ) ;
    public final void rule__StartTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2481:1: ( ( ( rule__StartTime__TimestampsAssignment_3 ) ) )
            // InternalSchedule.g:2482:1: ( ( rule__StartTime__TimestampsAssignment_3 ) )
            {
            // InternalSchedule.g:2482:1: ( ( rule__StartTime__TimestampsAssignment_3 ) )
            // InternalSchedule.g:2483:2: ( rule__StartTime__TimestampsAssignment_3 )
            {
             before(grammarAccess.getStartTimeAccess().getTimestampsAssignment_3()); 
            // InternalSchedule.g:2484:2: ( rule__StartTime__TimestampsAssignment_3 )
            // InternalSchedule.g:2484:3: rule__StartTime__TimestampsAssignment_3
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
    // InternalSchedule.g:2492:1: rule__StartTime__Group__4 : rule__StartTime__Group__4__Impl ;
    public final void rule__StartTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2496:1: ( rule__StartTime__Group__4__Impl )
            // InternalSchedule.g:2497:2: rule__StartTime__Group__4__Impl
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
    // InternalSchedule.g:2503:1: rule__StartTime__Group__4__Impl : ( ( rule__StartTime__Group_4__0 )* ) ;
    public final void rule__StartTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2507:1: ( ( ( rule__StartTime__Group_4__0 )* ) )
            // InternalSchedule.g:2508:1: ( ( rule__StartTime__Group_4__0 )* )
            {
            // InternalSchedule.g:2508:1: ( ( rule__StartTime__Group_4__0 )* )
            // InternalSchedule.g:2509:2: ( rule__StartTime__Group_4__0 )*
            {
             before(grammarAccess.getStartTimeAccess().getGroup_4()); 
            // InternalSchedule.g:2510:2: ( rule__StartTime__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSchedule.g:2510:3: rule__StartTime__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StartTime__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSchedule.g:2519:1: rule__StartTime__Group_1__0 : rule__StartTime__Group_1__0__Impl rule__StartTime__Group_1__1 ;
    public final void rule__StartTime__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2523:1: ( rule__StartTime__Group_1__0__Impl rule__StartTime__Group_1__1 )
            // InternalSchedule.g:2524:2: rule__StartTime__Group_1__0__Impl rule__StartTime__Group_1__1
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
    // InternalSchedule.g:2531:1: rule__StartTime__Group_1__0__Impl : ( ',' ) ;
    public final void rule__StartTime__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2535:1: ( ( ',' ) )
            // InternalSchedule.g:2536:1: ( ',' )
            {
            // InternalSchedule.g:2536:1: ( ',' )
            // InternalSchedule.g:2537:2: ','
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
    // InternalSchedule.g:2546:1: rule__StartTime__Group_1__1 : rule__StartTime__Group_1__1__Impl ;
    public final void rule__StartTime__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2550:1: ( rule__StartTime__Group_1__1__Impl )
            // InternalSchedule.g:2551:2: rule__StartTime__Group_1__1__Impl
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
    // InternalSchedule.g:2557:1: rule__StartTime__Group_1__1__Impl : ( ( rule__StartTime__WeekdaysAssignment_1_1 ) ) ;
    public final void rule__StartTime__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2561:1: ( ( ( rule__StartTime__WeekdaysAssignment_1_1 ) ) )
            // InternalSchedule.g:2562:1: ( ( rule__StartTime__WeekdaysAssignment_1_1 ) )
            {
            // InternalSchedule.g:2562:1: ( ( rule__StartTime__WeekdaysAssignment_1_1 ) )
            // InternalSchedule.g:2563:2: ( rule__StartTime__WeekdaysAssignment_1_1 )
            {
             before(grammarAccess.getStartTimeAccess().getWeekdaysAssignment_1_1()); 
            // InternalSchedule.g:2564:2: ( rule__StartTime__WeekdaysAssignment_1_1 )
            // InternalSchedule.g:2564:3: rule__StartTime__WeekdaysAssignment_1_1
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
    // InternalSchedule.g:2573:1: rule__StartTime__Group_4__0 : rule__StartTime__Group_4__0__Impl rule__StartTime__Group_4__1 ;
    public final void rule__StartTime__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2577:1: ( rule__StartTime__Group_4__0__Impl rule__StartTime__Group_4__1 )
            // InternalSchedule.g:2578:2: rule__StartTime__Group_4__0__Impl rule__StartTime__Group_4__1
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
    // InternalSchedule.g:2585:1: rule__StartTime__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StartTime__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2589:1: ( ( ',' ) )
            // InternalSchedule.g:2590:1: ( ',' )
            {
            // InternalSchedule.g:2590:1: ( ',' )
            // InternalSchedule.g:2591:2: ','
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
    // InternalSchedule.g:2600:1: rule__StartTime__Group_4__1 : rule__StartTime__Group_4__1__Impl ;
    public final void rule__StartTime__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2604:1: ( rule__StartTime__Group_4__1__Impl )
            // InternalSchedule.g:2605:2: rule__StartTime__Group_4__1__Impl
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
    // InternalSchedule.g:2611:1: rule__StartTime__Group_4__1__Impl : ( ( rule__StartTime__TimestampsAssignment_4_1 ) ) ;
    public final void rule__StartTime__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2615:1: ( ( ( rule__StartTime__TimestampsAssignment_4_1 ) ) )
            // InternalSchedule.g:2616:1: ( ( rule__StartTime__TimestampsAssignment_4_1 ) )
            {
            // InternalSchedule.g:2616:1: ( ( rule__StartTime__TimestampsAssignment_4_1 ) )
            // InternalSchedule.g:2617:2: ( rule__StartTime__TimestampsAssignment_4_1 )
            {
             before(grammarAccess.getStartTimeAccess().getTimestampsAssignment_4_1()); 
            // InternalSchedule.g:2618:2: ( rule__StartTime__TimestampsAssignment_4_1 )
            // InternalSchedule.g:2618:3: rule__StartTime__TimestampsAssignment_4_1
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
    // InternalSchedule.g:2627:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2631:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalSchedule.g:2632:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSchedule.g:2639:1: rule__Time__Group__0__Impl : ( ( rule__Time__HourAssignment_0 ) ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2643:1: ( ( ( rule__Time__HourAssignment_0 ) ) )
            // InternalSchedule.g:2644:1: ( ( rule__Time__HourAssignment_0 ) )
            {
            // InternalSchedule.g:2644:1: ( ( rule__Time__HourAssignment_0 ) )
            // InternalSchedule.g:2645:2: ( rule__Time__HourAssignment_0 )
            {
             before(grammarAccess.getTimeAccess().getHourAssignment_0()); 
            // InternalSchedule.g:2646:2: ( rule__Time__HourAssignment_0 )
            // InternalSchedule.g:2646:3: rule__Time__HourAssignment_0
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
    // InternalSchedule.g:2654:1: rule__Time__Group__1 : rule__Time__Group__1__Impl rule__Time__Group__2 ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2658:1: ( rule__Time__Group__1__Impl rule__Time__Group__2 )
            // InternalSchedule.g:2659:2: rule__Time__Group__1__Impl rule__Time__Group__2
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
    // InternalSchedule.g:2666:1: rule__Time__Group__1__Impl : ( ':' ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2670:1: ( ( ':' ) )
            // InternalSchedule.g:2671:1: ( ':' )
            {
            // InternalSchedule.g:2671:1: ( ':' )
            // InternalSchedule.g:2672:2: ':'
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
    // InternalSchedule.g:2681:1: rule__Time__Group__2 : rule__Time__Group__2__Impl ;
    public final void rule__Time__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2685:1: ( rule__Time__Group__2__Impl )
            // InternalSchedule.g:2686:2: rule__Time__Group__2__Impl
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
    // InternalSchedule.g:2692:1: rule__Time__Group__2__Impl : ( ( rule__Time__MinuteAssignment_2 ) ) ;
    public final void rule__Time__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2696:1: ( ( ( rule__Time__MinuteAssignment_2 ) ) )
            // InternalSchedule.g:2697:1: ( ( rule__Time__MinuteAssignment_2 ) )
            {
            // InternalSchedule.g:2697:1: ( ( rule__Time__MinuteAssignment_2 ) )
            // InternalSchedule.g:2698:2: ( rule__Time__MinuteAssignment_2 )
            {
             before(grammarAccess.getTimeAccess().getMinuteAssignment_2()); 
            // InternalSchedule.g:2699:2: ( rule__Time__MinuteAssignment_2 )
            // InternalSchedule.g:2699:3: rule__Time__MinuteAssignment_2
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
    // InternalSchedule.g:2708:1: rule__Schedule__NetworkAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Schedule__NetworkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2712:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2713:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2713:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2714:3: ( RULE_ID )
            {
             before(grammarAccess.getScheduleAccess().getNetworkNetworkCrossReference_2_0()); 
            // InternalSchedule.g:2715:3: ( RULE_ID )
            // InternalSchedule.g:2716:4: RULE_ID
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
    // InternalSchedule.g:2727:1: rule__Schedule__DepotAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Schedule__DepotAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2731:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2732:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2732:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2733:3: ( RULE_ID )
            {
             before(grammarAccess.getScheduleAccess().getDepotRootCrossReference_4_0()); 
            // InternalSchedule.g:2734:3: ( RULE_ID )
            // InternalSchedule.g:2735:4: RULE_ID
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
    // InternalSchedule.g:2746:1: rule__Schedule__DepotAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Schedule__DepotAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2750:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2751:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2751:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2752:3: ( RULE_ID )
            {
             before(grammarAccess.getScheduleAccess().getDepotRootCrossReference_5_1_0()); 
            // InternalSchedule.g:2753:3: ( RULE_ID )
            // InternalSchedule.g:2754:4: RULE_ID
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
    // InternalSchedule.g:2765:1: rule__Schedule__TrainsAssignment_7_0 : ( ruleTrainSchedule ) ;
    public final void rule__Schedule__TrainsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2769:1: ( ( ruleTrainSchedule ) )
            // InternalSchedule.g:2770:2: ( ruleTrainSchedule )
            {
            // InternalSchedule.g:2770:2: ( ruleTrainSchedule )
            // InternalSchedule.g:2771:3: ruleTrainSchedule
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
    // InternalSchedule.g:2780:1: rule__TrainSchedule__TrainAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TrainSchedule__TrainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2784:1: ( ( ( RULE_ID ) ) )
            // InternalSchedule.g:2785:2: ( ( RULE_ID ) )
            {
            // InternalSchedule.g:2785:2: ( ( RULE_ID ) )
            // InternalSchedule.g:2786:3: ( RULE_ID )
            {
             before(grammarAccess.getTrainScheduleAccess().getTrainTrainCrossReference_2_0()); 
            // InternalSchedule.g:2787:3: ( RULE_ID )
            // InternalSchedule.g:2788:4: RULE_ID
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
    // InternalSchedule.g:2799:1: rule__TrainSchedule__StarttimesAssignment_4 : ( ruleStartTime ) ;
    public final void rule__TrainSchedule__StarttimesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2803:1: ( ( ruleStartTime ) )
            // InternalSchedule.g:2804:2: ( ruleStartTime )
            {
            // InternalSchedule.g:2804:2: ( ruleStartTime )
            // InternalSchedule.g:2805:3: ruleStartTime
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
    // InternalSchedule.g:2814:1: rule__TrainSchedule__StarttimesAssignment_5_1 : ( ruleStartTime ) ;
    public final void rule__TrainSchedule__StarttimesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2818:1: ( ( ruleStartTime ) )
            // InternalSchedule.g:2819:2: ( ruleStartTime )
            {
            // InternalSchedule.g:2819:2: ( ruleStartTime )
            // InternalSchedule.g:2820:3: ruleStartTime
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
    // InternalSchedule.g:2829:1: rule__TrainSchedule__StopsAssignment_7 : ( ruleStartAtStop ) ;
    public final void rule__TrainSchedule__StopsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2833:1: ( ( ruleStartAtStop ) )
            // InternalSchedule.g:2834:2: ( ruleStartAtStop )
            {
            // InternalSchedule.g:2834:2: ( ruleStartAtStop )
            // InternalSchedule.g:2835:3: ruleStartAtStop
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
    // InternalSchedule.g:2844:1: rule__TrainSchedule__StopsAssignment_8 : ( ( rule__TrainSchedule__StopsAlternatives_8_0 ) ) ;
    public final void rule__TrainSchedule__StopsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2848:1: ( ( ( rule__TrainSchedule__StopsAlternatives_8_0 ) ) )
            // InternalSchedule.g:2849:2: ( ( rule__TrainSchedule__StopsAlternatives_8_0 ) )
            {
            // InternalSchedule.g:2849:2: ( ( rule__TrainSchedule__StopsAlternatives_8_0 ) )
            // InternalSchedule.g:2850:3: ( rule__TrainSchedule__StopsAlternatives_8_0 )
            {
             before(grammarAccess.getTrainScheduleAccess().getStopsAlternatives_8_0()); 
            // InternalSchedule.g:2851:3: ( rule__TrainSchedule__StopsAlternatives_8_0 )
            // InternalSchedule.g:2851:4: rule__TrainSchedule__StopsAlternatives_8_0
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
    // InternalSchedule.g:2859:1: rule__TrainSchedule__StopsAssignment_9 : ( ( rule__TrainSchedule__StopsAlternatives_9_0 ) ) ;
    public final void rule__TrainSchedule__StopsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2863:1: ( ( ( rule__TrainSchedule__StopsAlternatives_9_0 ) ) )
            // InternalSchedule.g:2864:2: ( ( rule__TrainSchedule__StopsAlternatives_9_0 ) )
            {
            // InternalSchedule.g:2864:2: ( ( rule__TrainSchedule__StopsAlternatives_9_0 ) )
            // InternalSchedule.g:2865:3: ( rule__TrainSchedule__StopsAlternatives_9_0 )
            {
             before(grammarAccess.getTrainScheduleAccess().getStopsAlternatives_9_0()); 
            // InternalSchedule.g:2866:3: ( rule__TrainSchedule__StopsAlternatives_9_0 )
            // InternalSchedule.g:2866:4: rule__TrainSchedule__StopsAlternatives_9_0
            {
            pushFollow(FOLLOW_2);
            rule__TrainSchedule__StopsAlternatives_9_0();

            state._fsp--;


            }

             after(grammarAccess.getTrainScheduleAccess().getStopsAlternatives_9_0()); 

            }


            }

        }
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
    // InternalSchedule.g:2874:1: rule__StartAtStop__StationAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__StartAtStop__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2878:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2879:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2879:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2880:3: ( RULE_STRING )
            {
             before(grammarAccess.getStartAtStopAccess().getStationStationCrossReference_2_0()); 
            // InternalSchedule.g:2881:3: ( RULE_STRING )
            // InternalSchedule.g:2882:4: RULE_STRING
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
    // InternalSchedule.g:2893:1: rule__StartAtStop__PlatformAssignment_5 : ( RULE_STRING ) ;
    public final void rule__StartAtStop__PlatformAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2897:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:2898:2: ( RULE_STRING )
            {
            // InternalSchedule.g:2898:2: ( RULE_STRING )
            // InternalSchedule.g:2899:3: RULE_STRING
            {
             before(grammarAccess.getStartAtStopAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStartAtStopAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
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
    // InternalSchedule.g:2908:1: rule__ViaStop__ViaAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__ViaStop__ViaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2912:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2913:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2913:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2914:3: ( RULE_STRING )
            {
             before(grammarAccess.getViaStopAccess().getViaLegCrossReference_2_0()); 
            // InternalSchedule.g:2915:3: ( RULE_STRING )
            // InternalSchedule.g:2916:4: RULE_STRING
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
    // InternalSchedule.g:2927:1: rule__ViaStop__StationAssignment_6 : ( ( RULE_STRING ) ) ;
    public final void rule__ViaStop__StationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2931:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:2932:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:2932:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:2933:3: ( RULE_STRING )
            {
             before(grammarAccess.getViaStopAccess().getStationStationCrossReference_6_0()); 
            // InternalSchedule.g:2934:3: ( RULE_STRING )
            // InternalSchedule.g:2935:4: RULE_STRING
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
    // InternalSchedule.g:2946:1: rule__ViaStop__PlatformAssignment_9 : ( RULE_STRING ) ;
    public final void rule__ViaStop__PlatformAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2950:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:2951:2: ( RULE_STRING )
            {
            // InternalSchedule.g:2951:2: ( RULE_STRING )
            // InternalSchedule.g:2952:3: RULE_STRING
            {
             before(grammarAccess.getViaStopAccess().getPlatformSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViaStopAccess().getPlatformSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
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
    // InternalSchedule.g:2961:1: rule__ViaStop__StoppedTimeAssignment_11 : ( RULE_INT ) ;
    public final void rule__ViaStop__StoppedTimeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2965:1: ( ( RULE_INT ) )
            // InternalSchedule.g:2966:2: ( RULE_INT )
            {
            // InternalSchedule.g:2966:2: ( RULE_INT )
            // InternalSchedule.g:2967:3: RULE_INT
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
    // InternalSchedule.g:2976:1: rule__ViaStop__RotateAssignment_13_1 : ( ( 'reverse' ) ) ;
    public final void rule__ViaStop__RotateAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2980:1: ( ( ( 'reverse' ) ) )
            // InternalSchedule.g:2981:2: ( ( 'reverse' ) )
            {
            // InternalSchedule.g:2981:2: ( ( 'reverse' ) )
            // InternalSchedule.g:2982:3: ( 'reverse' )
            {
             before(grammarAccess.getViaStopAccess().getRotateReverseKeyword_13_1_0()); 
            // InternalSchedule.g:2983:3: ( 'reverse' )
            // InternalSchedule.g:2984:4: 'reverse'
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
    // InternalSchedule.g:2995:1: rule__NormalStop__StationAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__NormalStop__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:2999:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:3000:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:3000:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:3001:3: ( RULE_STRING )
            {
             before(grammarAccess.getNormalStopAccess().getStationStationCrossReference_2_0()); 
            // InternalSchedule.g:3002:3: ( RULE_STRING )
            // InternalSchedule.g:3003:4: RULE_STRING
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
    // InternalSchedule.g:3014:1: rule__NormalStop__PlatformAssignment_5 : ( RULE_STRING ) ;
    public final void rule__NormalStop__PlatformAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3018:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:3019:2: ( RULE_STRING )
            {
            // InternalSchedule.g:3019:2: ( RULE_STRING )
            // InternalSchedule.g:3020:3: RULE_STRING
            {
             before(grammarAccess.getNormalStopAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNormalStopAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
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
    // InternalSchedule.g:3029:1: rule__NormalStop__StoppedTimeAssignment_7 : ( RULE_INT ) ;
    public final void rule__NormalStop__StoppedTimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3033:1: ( ( RULE_INT ) )
            // InternalSchedule.g:3034:2: ( RULE_INT )
            {
            // InternalSchedule.g:3034:2: ( RULE_INT )
            // InternalSchedule.g:3035:3: RULE_INT
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
    // InternalSchedule.g:3044:1: rule__NormalStop__RotateAssignment_9_1 : ( ( 'reverse' ) ) ;
    public final void rule__NormalStop__RotateAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3048:1: ( ( ( 'reverse' ) ) )
            // InternalSchedule.g:3049:2: ( ( 'reverse' ) )
            {
            // InternalSchedule.g:3049:2: ( ( 'reverse' ) )
            // InternalSchedule.g:3050:3: ( 'reverse' )
            {
             before(grammarAccess.getNormalStopAccess().getRotateReverseKeyword_9_1_0()); 
            // InternalSchedule.g:3051:3: ( 'reverse' )
            // InternalSchedule.g:3052:4: 'reverse'
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
    // InternalSchedule.g:3063:1: rule__TerminalStop__StationAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__TerminalStop__StationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3067:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:3068:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:3068:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:3069:3: ( RULE_STRING )
            {
             before(grammarAccess.getTerminalStopAccess().getStationStationCrossReference_2_0()); 
            // InternalSchedule.g:3070:3: ( RULE_STRING )
            // InternalSchedule.g:3071:4: RULE_STRING
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
    // InternalSchedule.g:3082:1: rule__TerminalStop__PlatformAssignment_5 : ( RULE_STRING ) ;
    public final void rule__TerminalStop__PlatformAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3086:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:3087:2: ( RULE_STRING )
            {
            // InternalSchedule.g:3087:2: ( RULE_STRING )
            // InternalSchedule.g:3088:3: RULE_STRING
            {
             before(grammarAccess.getTerminalStopAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTerminalStopAccess().getPlatformSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ViaTerminalStop__ViaAssignment_2"
    // InternalSchedule.g:3097:1: rule__ViaTerminalStop__ViaAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__ViaTerminalStop__ViaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3101:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:3102:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:3102:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:3103:3: ( RULE_STRING )
            {
             before(grammarAccess.getViaTerminalStopAccess().getViaLegCrossReference_2_0()); 
            // InternalSchedule.g:3104:3: ( RULE_STRING )
            // InternalSchedule.g:3105:4: RULE_STRING
            {
             before(grammarAccess.getViaTerminalStopAccess().getViaLegSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViaTerminalStopAccess().getViaLegSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getViaTerminalStopAccess().getViaLegCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__ViaAssignment_2"


    // $ANTLR start "rule__ViaTerminalStop__StationAssignment_6"
    // InternalSchedule.g:3116:1: rule__ViaTerminalStop__StationAssignment_6 : ( ( RULE_STRING ) ) ;
    public final void rule__ViaTerminalStop__StationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3120:1: ( ( ( RULE_STRING ) ) )
            // InternalSchedule.g:3121:2: ( ( RULE_STRING ) )
            {
            // InternalSchedule.g:3121:2: ( ( RULE_STRING ) )
            // InternalSchedule.g:3122:3: ( RULE_STRING )
            {
             before(grammarAccess.getViaTerminalStopAccess().getStationStationCrossReference_6_0()); 
            // InternalSchedule.g:3123:3: ( RULE_STRING )
            // InternalSchedule.g:3124:4: RULE_STRING
            {
             before(grammarAccess.getViaTerminalStopAccess().getStationStationSTRINGTerminalRuleCall_6_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViaTerminalStopAccess().getStationStationSTRINGTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getViaTerminalStopAccess().getStationStationCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__StationAssignment_6"


    // $ANTLR start "rule__ViaTerminalStop__PlatformAssignment_9"
    // InternalSchedule.g:3135:1: rule__ViaTerminalStop__PlatformAssignment_9 : ( RULE_STRING ) ;
    public final void rule__ViaTerminalStop__PlatformAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3139:1: ( ( RULE_STRING ) )
            // InternalSchedule.g:3140:2: ( RULE_STRING )
            {
            // InternalSchedule.g:3140:2: ( RULE_STRING )
            // InternalSchedule.g:3141:3: RULE_STRING
            {
             before(grammarAccess.getViaTerminalStopAccess().getPlatformSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getViaTerminalStopAccess().getPlatformSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViaTerminalStop__PlatformAssignment_9"


    // $ANTLR start "rule__StartTime__WeekdaysAssignment_0"
    // InternalSchedule.g:3150:1: rule__StartTime__WeekdaysAssignment_0 : ( ruleWeekday ) ;
    public final void rule__StartTime__WeekdaysAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3154:1: ( ( ruleWeekday ) )
            // InternalSchedule.g:3155:2: ( ruleWeekday )
            {
            // InternalSchedule.g:3155:2: ( ruleWeekday )
            // InternalSchedule.g:3156:3: ruleWeekday
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
    // InternalSchedule.g:3165:1: rule__StartTime__WeekdaysAssignment_1_1 : ( ruleWeekday ) ;
    public final void rule__StartTime__WeekdaysAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3169:1: ( ( ruleWeekday ) )
            // InternalSchedule.g:3170:2: ( ruleWeekday )
            {
            // InternalSchedule.g:3170:2: ( ruleWeekday )
            // InternalSchedule.g:3171:3: ruleWeekday
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
    // InternalSchedule.g:3180:1: rule__StartTime__TimestampsAssignment_3 : ( ruleTime ) ;
    public final void rule__StartTime__TimestampsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3184:1: ( ( ruleTime ) )
            // InternalSchedule.g:3185:2: ( ruleTime )
            {
            // InternalSchedule.g:3185:2: ( ruleTime )
            // InternalSchedule.g:3186:3: ruleTime
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
    // InternalSchedule.g:3195:1: rule__StartTime__TimestampsAssignment_4_1 : ( ruleTime ) ;
    public final void rule__StartTime__TimestampsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3199:1: ( ( ruleTime ) )
            // InternalSchedule.g:3200:2: ( ruleTime )
            {
            // InternalSchedule.g:3200:2: ( ruleTime )
            // InternalSchedule.g:3201:3: ruleTime
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
    // InternalSchedule.g:3210:1: rule__Time__HourAssignment_0 : ( RULE_INT ) ;
    public final void rule__Time__HourAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3214:1: ( ( RULE_INT ) )
            // InternalSchedule.g:3215:2: ( RULE_INT )
            {
            // InternalSchedule.g:3215:2: ( RULE_INT )
            // InternalSchedule.g:3216:3: RULE_INT
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
    // InternalSchedule.g:3225:1: rule__Time__MinuteAssignment_2 : ( RULE_INT ) ;
    public final void rule__Time__MinuteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSchedule.g:3229:1: ( ( RULE_INT ) )
            // InternalSchedule.g:3230:2: ( RULE_INT )
            {
            // InternalSchedule.g:3230:2: ( RULE_INT )
            // InternalSchedule.g:3231:3: RULE_INT
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
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000000L});

}