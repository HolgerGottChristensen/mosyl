/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.mdse.pts.schedule.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.StartTime;
import org.mdse.pts.schedule.Stop;
import org.mdse.pts.schedule.Time;
import org.mdse.pts.schedule.TrainSchedule;
import org.mdse.pts.schedule.dsl.services.ScheduleGrammarAccess;

@SuppressWarnings("all")
public class ScheduleSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ScheduleGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SchedulePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SchedulePackage.SCHEDULE:
				sequence_Schedule(context, (Schedule) semanticObject); 
				return; 
			case SchedulePackage.START_TIME:
				sequence_StartTime(context, (StartTime) semanticObject); 
				return; 
			case SchedulePackage.STOP:
				if (rule == grammarAccess.getNormalStopRule()) {
					sequence_NormalStop(context, (Stop) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getStartAtStopRule()) {
					sequence_StartAtStop(context, (Stop) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTerminalStopRule()) {
					sequence_TerminalStop(context, (Stop) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getViaStopRule()) {
					sequence_ViaStop(context, (Stop) semanticObject); 
					return; 
				}
				else break;
			case SchedulePackage.TIME:
				sequence_Time(context, (Time) semanticObject); 
				return; 
			case SchedulePackage.TRAIN_SCHEDULE:
				sequence_TrainSchedule(context, (TrainSchedule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     NormalStop returns Stop
	 *
	 * Constraint:
	 *     (station=[Station|ID] platform=ID stoppedTime=INT rotate?='reverse'?)
	 * </pre>
	 */
	protected void sequence_NormalStop(ISerializationContext context, Stop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Schedule returns Schedule
	 *
	 * Constraint:
	 *     (network=[Network|ID] depot+=[Root|ID] depot+=[Root|ID]* trains+=TrainSchedule*)
	 * </pre>
	 */
	protected void sequence_Schedule(ISerializationContext context, Schedule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StartAtStop returns Stop
	 *
	 * Constraint:
	 *     (station=[Station|ID] platform=ID)
	 * </pre>
	 */
	protected void sequence_StartAtStop(ISerializationContext context, Stop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SchedulePackage.Literals.STOP__STATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchedulePackage.Literals.STOP__STATION));
			if (transientValues.isValueTransient(semanticObject, SchedulePackage.Literals.STOP__PLATFORM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchedulePackage.Literals.STOP__PLATFORM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStartAtStopAccess().getStationStationIDTerminalRuleCall_2_0_1(), semanticObject.eGet(SchedulePackage.Literals.STOP__STATION, false));
		feeder.accept(grammarAccess.getStartAtStopAccess().getPlatformIDTerminalRuleCall_5_0(), semanticObject.getPlatform());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StartTime returns StartTime
	 *
	 * Constraint:
	 *     (weekdays+=Weekday weekdays+=Weekday* timestamps+=Time timestamps+=Time*)
	 * </pre>
	 */
	protected void sequence_StartTime(ISerializationContext context, StartTime semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TerminalStop returns Stop
	 *
	 * Constraint:
	 *     (station=[Station|ID] platform=ID)
	 * </pre>
	 */
	protected void sequence_TerminalStop(ISerializationContext context, Stop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SchedulePackage.Literals.STOP__STATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchedulePackage.Literals.STOP__STATION));
			if (transientValues.isValueTransient(semanticObject, SchedulePackage.Literals.STOP__PLATFORM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchedulePackage.Literals.STOP__PLATFORM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalStopAccess().getStationStationIDTerminalRuleCall_2_0_1(), semanticObject.eGet(SchedulePackage.Literals.STOP__STATION, false));
		feeder.accept(grammarAccess.getTerminalStopAccess().getPlatformIDTerminalRuleCall_5_0(), semanticObject.getPlatform());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Time returns Time
	 *
	 * Constraint:
	 *     (hour=INT minute=INT)
	 * </pre>
	 */
	protected void sequence_Time(ISerializationContext context, Time semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SchedulePackage.Literals.TIME__HOUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchedulePackage.Literals.TIME__HOUR));
			if (transientValues.isValueTransient(semanticObject, SchedulePackage.Literals.TIME__MINUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SchedulePackage.Literals.TIME__MINUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeAccess().getHourINTTerminalRuleCall_0_0(), semanticObject.getHour());
		feeder.accept(grammarAccess.getTimeAccess().getMinuteINTTerminalRuleCall_2_0(), semanticObject.getMinute());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TrainSchedule returns TrainSchedule
	 *
	 * Constraint:
	 *     (
	 *         train=[Train|ID] 
	 *         starttimes+=StartTime 
	 *         starttimes+=StartTime* 
	 *         stops+=StartAtStop 
	 *         (stops+=ViaStop | stops+=NormalStop)* 
	 *         stops+=TerminalStop
	 *     )
	 * </pre>
	 */
	protected void sequence_TrainSchedule(ISerializationContext context, TrainSchedule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ViaStop returns Stop
	 *
	 * Constraint:
	 *     (via=[Leg|ID] station=[Station|ID] platform=ID stoppedTime=INT rotate?='reverse'?)
	 * </pre>
	 */
	protected void sequence_ViaStop(ISerializationContext context, Stop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
