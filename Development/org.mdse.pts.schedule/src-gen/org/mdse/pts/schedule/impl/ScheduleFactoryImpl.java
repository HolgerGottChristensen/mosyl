/**
 */
package org.mdse.pts.schedule.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mdse.pts.schedule.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScheduleFactoryImpl extends EFactoryImpl implements ScheduleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScheduleFactory init() {
		try {
			ScheduleFactory theScheduleFactory = (ScheduleFactory)EPackage.Registry.INSTANCE.getEFactory(SchedulePackage.eNS_URI);
			if (theScheduleFactory != null) {
				return theScheduleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScheduleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SchedulePackage.SCHEDULE: return createSchedule();
			case SchedulePackage.TRAIN_SCHEDULE: return createTrainSchedule();
			case SchedulePackage.START_TIME: return createStartTime();
			case SchedulePackage.TIME: return createTime();
			case SchedulePackage.STOP: return createStop();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainSchedule createTrainSchedule() {
		TrainScheduleImpl trainSchedule = new TrainScheduleImpl();
		return trainSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartTime createStartTime() {
		StartTimeImpl startTime = new StartTimeImpl();
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulePackage getSchedulePackage() {
		return (SchedulePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchedulePackage getPackage() {
		return SchedulePackage.eINSTANCE;
	}

} //ScheduleFactoryImpl
