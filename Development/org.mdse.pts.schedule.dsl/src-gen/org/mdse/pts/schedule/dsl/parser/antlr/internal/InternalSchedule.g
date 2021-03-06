/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
grammar InternalSchedule;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.mdse.pts.schedule.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSchedule
entryRuleSchedule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScheduleRule()); }
	iv_ruleSchedule=ruleSchedule
	{ $current=$iv_ruleSchedule.current; }
	EOF;

// Rule Schedule
ruleSchedule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='schedule'
		{
			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getScheduleKeyword_0());
		}
		otherlv_1='for'
		{
			newLeafNode(otherlv_1, grammarAccess.getScheduleAccess().getForKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScheduleRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getNetworkNetworkCrossReference_2_0());
				}
			)
		)
		otherlv_3='with'
		{
			newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getWithKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScheduleRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getScheduleAccess().getDepotRootCrossReference_4_0());
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getScheduleAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getScheduleRule());
						}
					}
					otherlv_6=RULE_ID
					{
						newLeafNode(otherlv_6, grammarAccess.getScheduleAccess().getDepotRootCrossReference_5_1_0());
					}
				)
			)
		)*
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getScheduleAccess().getSemicolonKeyword_6());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getScheduleAccess().getTrainsTrainScheduleParserRuleCall_7_0_0());
					}
					lv_trains_8_0=ruleTrainSchedule
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getScheduleRule());
						}
						add(
							$current,
							"trains",
							lv_trains_8_0,
							"org.mdse.pts.schedule.dsl.Schedule.TrainSchedule");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getScheduleAccess().getSemicolonKeyword_7_1());
			}
		)*
	)
;

// Entry rule entryRuleTrainSchedule
entryRuleTrainSchedule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrainScheduleRule()); }
	iv_ruleTrainSchedule=ruleTrainSchedule
	{ $current=$iv_ruleTrainSchedule.current; }
	EOF;

// Rule TrainSchedule
ruleTrainSchedule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='schedule'
		{
			newLeafNode(otherlv_0, grammarAccess.getTrainScheduleAccess().getScheduleKeyword_0());
		}
		otherlv_1='train'
		{
			newLeafNode(otherlv_1, grammarAccess.getTrainScheduleAccess().getTrainKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTrainScheduleRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTrainScheduleAccess().getTrainTrainCrossReference_2_0());
				}
			)
		)
		otherlv_3='on'
		{
			newLeafNode(otherlv_3, grammarAccess.getTrainScheduleAccess().getOnKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTrainScheduleAccess().getStarttimesStartTimeParserRuleCall_4_0());
				}
				lv_starttimes_4_0=ruleStartTime
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
					}
					add(
						$current,
						"starttimes",
						lv_starttimes_4_0,
						"org.mdse.pts.schedule.dsl.Schedule.StartTime");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='and'
			{
				newLeafNode(otherlv_5, grammarAccess.getTrainScheduleAccess().getAndKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTrainScheduleAccess().getStarttimesStartTimeParserRuleCall_5_1_0());
					}
					lv_starttimes_6_0=ruleStartTime
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
						}
						add(
							$current,
							"starttimes",
							lv_starttimes_6_0,
							"org.mdse.pts.schedule.dsl.Schedule.StartTime");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7=':'
		{
			newLeafNode(otherlv_7, grammarAccess.getTrainScheduleAccess().getColonKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTrainScheduleAccess().getStopsStartAtStopParserRuleCall_7_0());
				}
				lv_stops_8_0=ruleStartAtStop
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
					}
					add(
						$current,
						"stops",
						lv_stops_8_0,
						"org.mdse.pts.schedule.dsl.Schedule.StartAtStop");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTrainScheduleAccess().getStopsViaStopParserRuleCall_8_0_0());
					}
					lv_stops_9_1=ruleViaStop
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
						}
						add(
							$current,
							"stops",
							lv_stops_9_1,
							"org.mdse.pts.schedule.dsl.Schedule.ViaStop");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getTrainScheduleAccess().getStopsNormalStopParserRuleCall_8_0_1());
					}
					lv_stops_9_2=ruleNormalStop
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
						}
						add(
							$current,
							"stops",
							lv_stops_9_2,
							"org.mdse.pts.schedule.dsl.Schedule.NormalStop");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTrainScheduleAccess().getStopsTerminalStopParserRuleCall_9_0_0());
					}
					lv_stops_10_1=ruleTerminalStop
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
						}
						add(
							$current,
							"stops",
							lv_stops_10_1,
							"org.mdse.pts.schedule.dsl.Schedule.TerminalStop");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getTrainScheduleAccess().getStopsViaTerminalStopParserRuleCall_9_0_1());
					}
					lv_stops_10_2=ruleViaTerminalStop
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTrainScheduleRule());
						}
						add(
							$current,
							"stops",
							lv_stops_10_2,
							"org.mdse.pts.schedule.dsl.Schedule.ViaTerminalStop");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleStartAtStop
entryRuleStartAtStop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStartAtStopRule()); }
	iv_ruleStartAtStop=ruleStartAtStop
	{ $current=$iv_ruleStartAtStop.current; }
	EOF;

// Rule StartAtStop
ruleStartAtStop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='start'
		{
			newLeafNode(otherlv_0, grammarAccess.getStartAtStopAccess().getStartKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getStartAtStopAccess().getAtKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStartAtStopRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getStartAtStopAccess().getStationStationCrossReference_2_0());
				}
			)
		)
		otherlv_3='on'
		{
			newLeafNode(otherlv_3, grammarAccess.getStartAtStopAccess().getOnKeyword_3());
		}
		otherlv_4='platform'
		{
			newLeafNode(otherlv_4, grammarAccess.getStartAtStopAccess().getPlatformKeyword_4());
		}
		(
			(
				lv_platform_5_0=RULE_STRING
				{
					newLeafNode(lv_platform_5_0, grammarAccess.getStartAtStopAccess().getPlatformSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStartAtStopRule());
					}
					setWithLastConsumed(
						$current,
						"platform",
						lv_platform_5_0,
						"org.mdse.pts.schedule.dsl.Schedule.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleViaStop
entryRuleViaStop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getViaStopRule()); }
	iv_ruleViaStop=ruleViaStop
	{ $current=$iv_ruleViaStop.current; }
	EOF;

// Rule ViaStop
ruleViaStop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='drive'
		{
			newLeafNode(otherlv_0, grammarAccess.getViaStopAccess().getDriveKeyword_0());
		}
		otherlv_1='via'
		{
			newLeafNode(otherlv_1, grammarAccess.getViaStopAccess().getViaKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getViaStopRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getViaStopAccess().getViaLegCrossReference_2_0());
				}
			)
		)
		otherlv_3='and'
		{
			newLeafNode(otherlv_3, grammarAccess.getViaStopAccess().getAndKeyword_3());
		}
		otherlv_4='stop'
		{
			newLeafNode(otherlv_4, grammarAccess.getViaStopAccess().getStopKeyword_4());
		}
		otherlv_5='at'
		{
			newLeafNode(otherlv_5, grammarAccess.getViaStopAccess().getAtKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getViaStopRule());
					}
				}
				otherlv_6=RULE_STRING
				{
					newLeafNode(otherlv_6, grammarAccess.getViaStopAccess().getStationStationCrossReference_6_0());
				}
			)
		)
		otherlv_7='on'
		{
			newLeafNode(otherlv_7, grammarAccess.getViaStopAccess().getOnKeyword_7());
		}
		otherlv_8='platform'
		{
			newLeafNode(otherlv_8, grammarAccess.getViaStopAccess().getPlatformKeyword_8());
		}
		(
			(
				lv_platform_9_0=RULE_STRING
				{
					newLeafNode(lv_platform_9_0, grammarAccess.getViaStopAccess().getPlatformSTRINGTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getViaStopRule());
					}
					setWithLastConsumed(
						$current,
						"platform",
						lv_platform_9_0,
						"org.mdse.pts.schedule.dsl.Schedule.STRING");
				}
			)
		)
		otherlv_10='for'
		{
			newLeafNode(otherlv_10, grammarAccess.getViaStopAccess().getForKeyword_10());
		}
		(
			(
				lv_stoppedTime_11_0=RULE_INT
				{
					newLeafNode(lv_stoppedTime_11_0, grammarAccess.getViaStopAccess().getStoppedTimeINTTerminalRuleCall_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getViaStopRule());
					}
					setWithLastConsumed(
						$current,
						"stoppedTime",
						lv_stoppedTime_11_0,
						"org.mdse.pts.schedule.dsl.Schedule.INT");
				}
			)
		)
		otherlv_12='min'
		{
			newLeafNode(otherlv_12, grammarAccess.getViaStopAccess().getMinKeyword_12());
		}
		(
			otherlv_13='and'
			{
				newLeafNode(otherlv_13, grammarAccess.getViaStopAccess().getAndKeyword_13_0());
			}
			(
				(
					lv_rotate_14_0='reverse'
					{
						newLeafNode(lv_rotate_14_0, grammarAccess.getViaStopAccess().getRotateReverseKeyword_13_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getViaStopRule());
						}
						setWithLastConsumed($current, "rotate", lv_rotate_14_0 != null, "reverse");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleNormalStop
entryRuleNormalStop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNormalStopRule()); }
	iv_ruleNormalStop=ruleNormalStop
	{ $current=$iv_ruleNormalStop.current; }
	EOF;

// Rule NormalStop
ruleNormalStop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='stop'
		{
			newLeafNode(otherlv_0, grammarAccess.getNormalStopAccess().getStopKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getNormalStopAccess().getAtKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNormalStopRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getNormalStopAccess().getStationStationCrossReference_2_0());
				}
			)
		)
		otherlv_3='on'
		{
			newLeafNode(otherlv_3, grammarAccess.getNormalStopAccess().getOnKeyword_3());
		}
		otherlv_4='platform'
		{
			newLeafNode(otherlv_4, grammarAccess.getNormalStopAccess().getPlatformKeyword_4());
		}
		(
			(
				lv_platform_5_0=RULE_STRING
				{
					newLeafNode(lv_platform_5_0, grammarAccess.getNormalStopAccess().getPlatformSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNormalStopRule());
					}
					setWithLastConsumed(
						$current,
						"platform",
						lv_platform_5_0,
						"org.mdse.pts.schedule.dsl.Schedule.STRING");
				}
			)
		)
		otherlv_6='for'
		{
			newLeafNode(otherlv_6, grammarAccess.getNormalStopAccess().getForKeyword_6());
		}
		(
			(
				lv_stoppedTime_7_0=RULE_INT
				{
					newLeafNode(lv_stoppedTime_7_0, grammarAccess.getNormalStopAccess().getStoppedTimeINTTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNormalStopRule());
					}
					setWithLastConsumed(
						$current,
						"stoppedTime",
						lv_stoppedTime_7_0,
						"org.mdse.pts.schedule.dsl.Schedule.INT");
				}
			)
		)
		otherlv_8='min'
		{
			newLeafNode(otherlv_8, grammarAccess.getNormalStopAccess().getMinKeyword_8());
		}
		(
			otherlv_9='and'
			{
				newLeafNode(otherlv_9, grammarAccess.getNormalStopAccess().getAndKeyword_9_0());
			}
			(
				(
					lv_rotate_10_0='reverse'
					{
						newLeafNode(lv_rotate_10_0, grammarAccess.getNormalStopAccess().getRotateReverseKeyword_9_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNormalStopRule());
						}
						setWithLastConsumed($current, "rotate", lv_rotate_10_0 != null, "reverse");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleTerminalStop
entryRuleTerminalStop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalStopRule()); }
	iv_ruleTerminalStop=ruleTerminalStop
	{ $current=$iv_ruleTerminalStop.current; }
	EOF;

// Rule TerminalStop
ruleTerminalStop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='terminate'
		{
			newLeafNode(otherlv_0, grammarAccess.getTerminalStopAccess().getTerminateKeyword_0());
		}
		otherlv_1='at'
		{
			newLeafNode(otherlv_1, grammarAccess.getTerminalStopAccess().getAtKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminalStopRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getTerminalStopAccess().getStationStationCrossReference_2_0());
				}
			)
		)
		otherlv_3='on'
		{
			newLeafNode(otherlv_3, grammarAccess.getTerminalStopAccess().getOnKeyword_3());
		}
		otherlv_4='platform'
		{
			newLeafNode(otherlv_4, grammarAccess.getTerminalStopAccess().getPlatformKeyword_4());
		}
		(
			(
				lv_platform_5_0=RULE_STRING
				{
					newLeafNode(lv_platform_5_0, grammarAccess.getTerminalStopAccess().getPlatformSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTerminalStopRule());
					}
					setWithLastConsumed(
						$current,
						"platform",
						lv_platform_5_0,
						"org.mdse.pts.schedule.dsl.Schedule.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleViaTerminalStop
entryRuleViaTerminalStop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getViaTerminalStopRule()); }
	iv_ruleViaTerminalStop=ruleViaTerminalStop
	{ $current=$iv_ruleViaTerminalStop.current; }
	EOF;

// Rule ViaTerminalStop
ruleViaTerminalStop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='drive'
		{
			newLeafNode(otherlv_0, grammarAccess.getViaTerminalStopAccess().getDriveKeyword_0());
		}
		otherlv_1='via'
		{
			newLeafNode(otherlv_1, grammarAccess.getViaTerminalStopAccess().getViaKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getViaTerminalStopRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getViaTerminalStopAccess().getViaLegCrossReference_2_0());
				}
			)
		)
		otherlv_3='and'
		{
			newLeafNode(otherlv_3, grammarAccess.getViaTerminalStopAccess().getAndKeyword_3());
		}
		otherlv_4='terminate'
		{
			newLeafNode(otherlv_4, grammarAccess.getViaTerminalStopAccess().getTerminateKeyword_4());
		}
		otherlv_5='at'
		{
			newLeafNode(otherlv_5, grammarAccess.getViaTerminalStopAccess().getAtKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getViaTerminalStopRule());
					}
				}
				otherlv_6=RULE_STRING
				{
					newLeafNode(otherlv_6, grammarAccess.getViaTerminalStopAccess().getStationStationCrossReference_6_0());
				}
			)
		)
		otherlv_7='on'
		{
			newLeafNode(otherlv_7, grammarAccess.getViaTerminalStopAccess().getOnKeyword_7());
		}
		otherlv_8='platform'
		{
			newLeafNode(otherlv_8, grammarAccess.getViaTerminalStopAccess().getPlatformKeyword_8());
		}
		(
			(
				lv_platform_9_0=RULE_STRING
				{
					newLeafNode(lv_platform_9_0, grammarAccess.getViaTerminalStopAccess().getPlatformSTRINGTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getViaTerminalStopRule());
					}
					setWithLastConsumed(
						$current,
						"platform",
						lv_platform_9_0,
						"org.mdse.pts.schedule.dsl.Schedule.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleStartTime
entryRuleStartTime returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStartTimeRule()); }
	iv_ruleStartTime=ruleStartTime
	{ $current=$iv_ruleStartTime.current; }
	EOF;

// Rule StartTime
ruleStartTime returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStartTimeAccess().getWeekdaysWeekdayEnumRuleCall_0_0());
				}
				lv_weekdays_0_0=ruleWeekday
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStartTimeRule());
					}
					add(
						$current,
						"weekdays",
						lv_weekdays_0_0,
						"org.mdse.pts.schedule.dsl.Schedule.Weekday");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getStartTimeAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStartTimeAccess().getWeekdaysWeekdayEnumRuleCall_1_1_0());
					}
					lv_weekdays_2_0=ruleWeekday
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStartTimeRule());
						}
						add(
							$current,
							"weekdays",
							lv_weekdays_2_0,
							"org.mdse.pts.schedule.dsl.Schedule.Weekday");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_3='at'
		{
			newLeafNode(otherlv_3, grammarAccess.getStartTimeAccess().getAtKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStartTimeAccess().getTimestampsTimeParserRuleCall_3_0());
				}
				lv_timestamps_4_0=ruleTime
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStartTimeRule());
					}
					add(
						$current,
						"timestamps",
						lv_timestamps_4_0,
						"org.mdse.pts.schedule.dsl.Schedule.Time");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getStartTimeAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStartTimeAccess().getTimestampsTimeParserRuleCall_4_1_0());
					}
					lv_timestamps_6_0=ruleTime
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStartTimeRule());
						}
						add(
							$current,
							"timestamps",
							lv_timestamps_6_0,
							"org.mdse.pts.schedule.dsl.Schedule.Time");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTime
entryRuleTime returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimeRule()); }
	iv_ruleTime=ruleTime
	{ $current=$iv_ruleTime.current; }
	EOF;

// Rule Time
ruleTime returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_hour_0_0=RULE_INT
				{
					newLeafNode(lv_hour_0_0, grammarAccess.getTimeAccess().getHourINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTimeRule());
					}
					setWithLastConsumed(
						$current,
						"hour",
						lv_hour_0_0,
						"org.mdse.pts.schedule.dsl.Schedule.INT");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getColonKeyword_1());
		}
		(
			(
				lv_minute_2_0=RULE_INT
				{
					newLeafNode(lv_minute_2_0, grammarAccess.getTimeAccess().getMinuteINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTimeRule());
					}
					setWithLastConsumed(
						$current,
						"minute",
						lv_minute_2_0,
						"org.mdse.pts.schedule.dsl.Schedule.INT");
				}
			)
		)
	)
;

// Rule Weekday
ruleWeekday returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Monday'
			{
				$current = grammarAccess.getWeekdayAccess().getMondayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getWeekdayAccess().getMondayEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Tuesday'
			{
				$current = grammarAccess.getWeekdayAccess().getTuesdayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getWeekdayAccess().getTuesdayEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Wednesday'
			{
				$current = grammarAccess.getWeekdayAccess().getWednesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getWeekdayAccess().getWednesdayEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Thursday'
			{
				$current = grammarAccess.getWeekdayAccess().getThursdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getWeekdayAccess().getThursdayEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='Friday'
			{
				$current = grammarAccess.getWeekdayAccess().getFridayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getWeekdayAccess().getFridayEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='Saturday'
			{
				$current = grammarAccess.getWeekdayAccess().getSaturdayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getWeekdayAccess().getSaturdayEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='Sunday'
			{
				$current = grammarAccess.getWeekdayAccess().getSundayEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getWeekdayAccess().getSundayEnumLiteralDeclaration_6());
			}
		)
	)
;

fragment RULE_LETTER : ('a'..'z'|'A'..'Z');

fragment RULE_DIGIT : '0'..'9';

RULE_ID : '^'? ('_'|RULE_LETTER) ('_'|RULE_LETTER|RULE_DIGIT)*;

RULE_INT : RULE_DIGIT+;

RULE_STRING : '"' ('\\' .|~(('\\'|'"')))* '"';

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;
