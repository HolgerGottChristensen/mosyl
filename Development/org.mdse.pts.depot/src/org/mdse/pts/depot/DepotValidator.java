package org.mdse.pts.depot;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;
import org.w3c.dom.html.HTMLOptGroupElement;

public class DepotValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		// TODO Auto-generated method stub
		EValidator.Registry.INSTANCE.put(DepotPackage.eINSTANCE, new DepotValidator());
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		//Delegate to validate method with EClass
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}
	
	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		
		this.diagnostics = diagnostics;
		
		if (DepotPackage.eINSTANCE.getDepot().equals(eClass)) {
			Depot depot = (Depot) eObject;
			
			modelIsValid &= validateDepot(depot);
		}
		
		if (DepotPackage.eINSTANCE.getTrain().equals(eClass)) {
			Train train = (Train) eObject;
			
			modelIsValid &= validateTrain(train);
		}
		
		return modelIsValid;
	}

	private boolean validateDepot(Depot depot) {
		boolean modelIsValid = true;
		
		
		return modelIsValid;
	}
	
	private boolean validateTrain(Train train) {
		boolean modelIsValid = true;
		modelIsValid &= validateContainsAtLeastOneLocomotive(train);
		modelIsValid &= validateNoMoreThanTwoLocomotives(train);
		modelIsValid &= validateLocomotiveAsFirstOrLastCoach(train);
		modelIsValid &= validateLocomotiveNotBeetweenOtherCoaches(train);
		modelIsValid &= validateAtMostOneDiningCoach(train);
		modelIsValid &= validateCoacheClassesInSequenceWithOptionalDiningCoach(train);

		
		if(train.getType().equals(TrainType.INTERCITY)) {
			modelIsValid &= validateIntercityHasAtLeastOneFirstclass(train);
			modelIsValid &= validateIntercityHasAtLeastOneDiningCoach(train);

		}
		
		return modelIsValid;
	}


	private boolean validateCoacheClassesInSequenceWithOptionalDiningCoach(Train train) {
		
		List<Coach> coaches = train.getCoach().stream()
				.filter(c -> !c.getClass().equals(Locomotive.class))
				.collect(Collectors.toList());
		
		Set<CoachClass> visited = new HashSet<>();
		
		Coach prev  = coaches.get(0);
		if (prev.getClass().equals(PassengerCoach.class)) {
			CoachClass prevClass = ((PassengerCoach) prev).getClass_();
			for (int i = 1; i < coaches.size()-1; i++) {
				visited.add(prevClass);
				CoachClass currClass = ((PassengerCoach) coaches.get(i)).getClass_();
				prev = coaches.get(i);
				if (currClass.equals(prevClass)) {
					continue;
				} else if (visited.contains(currClass)) {
					constraintViolated(train, train.getName() + " coach classes mut be in sequence");
				}
			}
		}
		if (visited.size() > 2) {
			if (coaches.get(0).getClass().equals(DiningCoach.class) || coaches.get(coaches.size()-1).getClass().equals(DiningCoach.class)) {
				constraintViolated(train, train.getName() + " dining coach must be between coach classes");
			}
		}
		
		return false;
	}

	private boolean validateAtMostOneDiningCoach(Train train) {
		boolean constraintViolated = train.getCoach().stream()
				.filter(DiningCoach.class::isInstance)
				.count() > 1;
		
		if (constraintViolated) {
			constraintViolated(train, train.getName() + " may have at most one dining coach");
		}
		return false;
	}
	
	private boolean validateIntercityHasAtLeastOneDiningCoach(Train train) {
		boolean constraintViolated = train.getCoach().stream()
				.filter(DiningCoach.class::isInstance)
				.count() < 1;
		
		if (constraintViolated) {
			constraintViolated(train, train.getName() + " must have a dining coach");
		}
		return false;
	}

	private boolean validateIntercityHasAtLeastOneFirstclass(Train train) {
		boolean constraintViolated = train.getCoach().stream()
				.filter(PassengerCoach.class::isInstance)
				.map(PassengerCoach.class::cast)
				.filter(pc -> pc.getClass_().equals(CoachClass.FIRST_CLASS))
				.count() < 1;
		
		if (constraintViolated) {
			constraintViolated(train, train.getName() + " must contain at least one first class coach");
		}
		return false;
	}

	private boolean validateLocomotiveNotBeetweenOtherCoaches(Train train) {
		//TODO figure out how to skip the last element 
		boolean constraintViolated = train.getCoach().stream()
				.skip(1)
				.filter(Locomotive.class::isInstance)
				.count() > 2;
		
		if (constraintViolated) {
			constraintViolated(train, train.getName() + " must not contain more than two locomotives");
		}
		return false;
	}public DepotValidator() {
		// TODO Auto-generated constructor stub
	}
	private boolean validateLocomotiveAsFirstOrLastCoach(Train train) {
		Optional<Coach> firstCoach = train.getCoach().stream()
				.findFirst()
				.filter(Locomotive.class::isInstance);
		
		boolean firstIsNotLocomotive = firstCoach.isEmpty();
		
		Coach lastCoach = train.getCoach()
				.get(train.getCoach().size()-1);
		
		boolean lastIsNotLocomotive = !(lastCoach instanceof Locomotive);
		if (firstIsNotLocomotive && lastIsNotLocomotive) {
			constraintViolated(train, train.getName() + " must have at least one locomotve in either end of the train");
		}
		return false;
	}

	private boolean validateNoMoreThanTwoLocomotives(Train train) {
		boolean constraintViolated = train.getCoach().stream()
				.filter(Locomotive.class::isInstance)
				.count() > 2;
		
		if (constraintViolated) {
			constraintViolated(train, train.getName() + " must not contain more than two locomotives");
		}
		return false;
	}

	private boolean validateContainsAtLeastOneLocomotive(Train train) {
		boolean constraintViolated = train.getCoach().stream()
				.filter(Locomotive.class::isInstance)
				.count() < 1;
		
		if (constraintViolated) {
			constraintViolated(train, train.getName() + " must contain at least one locomotive");
		}
		return false;
	}
	
	//Utility method
		protected boolean constraintViolated(EObject object, String message) {
			Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
			diagnostics.add(diagnostic);
			return false;
		}

}
