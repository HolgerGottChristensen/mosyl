package org.mdse.pts.depot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.imageio.spi.ImageInputStreamSpi;

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
		boolean modelIsValid = true; // super.validate(eClass, eObject, diagnostics, context);
		
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
		modelIsValid &= validateNoDuplicateTrainNames(depot);
		
		return modelIsValid;
	}
	
	private boolean validateTrain(Train train) {
		boolean modelIsValid = true;
		modelIsValid &= validateContainsAtLeastOneLocomotive(train);
		modelIsValid &= validateNoMoreThanTwoLocomotives(train);
		modelIsValid &= validateLocomotiveAsFirstOrLastCoach(train);
		modelIsValid &= validateLocomotiveNotBeetweenOtherCoaches(train);
		modelIsValid &= validateAtMostOneDiningCoach(train);
		modelIsValid &= validateCoachClassesInSequence(train);
		modelIsValid &= validateDiningCoachBetweenPassengerCoaches(train);
		modelIsValid &= validateNoSpaceInTrainName(train);
		modelIsValid &= validateNoduplicateWagonNumber(train);
		
		if(train.getType().equals(TrainType.INTERCITY)) {
			modelIsValid &= validateIntercityHasAtLeastOneFirstclass(train);
			modelIsValid &= validateIntercityHasAtLeastOneDiningCoach(train);

		}
		
		return modelIsValid;
	}
	
	private boolean validateNoduplicateWagonNumber(Train train) {
		//Check if all wagon numbers in a train are unique		
		
		Set<Integer> wagonNumbers = new HashSet<>();
		// If there are duplicates allMatch returns early with false
		boolean hasDuplicateName = !train.getCoach().stream()
				.filter(c -> !(c instanceof Locomotive))
				.allMatch(c -> wagonNumbers.add(c.getWagonNumber()));
		
		if (hasDuplicateName) {
			constraintViolated(train, "Wagon numbers for " + train.getName() + " must be unique");
		}
		return false;
	}


	private boolean validateNoDuplicateTrainNames(Depot depot) {
		// Check that all train names are unique
		
		Set<String> trainNames = new HashSet<>();
		// If there are duplicates allMatch returns early with false
		boolean hasDuplicateName = !depot.getTrain().stream().allMatch(t -> trainNames.add(t.getName()));
		
		if (hasDuplicateName) {
			constraintViolated(depot, "Depot may not contain trains with the same name");
		}
		return false;
	}

	private boolean validateNoSpaceInTrainName(Train train) {
		// Check if there is a space in the name and that the name does not begin with a number
		
		if (train.getName().contains(" ")) {
			constraintViolated(train, train.getName() + ", name may not contain whitespace");
		} else if (Character.isDigit(train.getName().charAt(0))) {
			constraintViolated(train, train.getName() + ", name may not begin with a number");
		}
		return false;
	}

	private boolean validateDiningCoachBetweenPassengerCoaches(Train train) {
		/*
		 * Check that if there is a dining coach 
		 * then it will be between coaches of different classes.
		 * If there only is one passenger coach present, then it will not matter
		 * as long as the dining coach is not between the passenger coaches
		 * */
		
		List<Coach> coaches = train.getCoach().stream()
				.filter(c -> !(c instanceof Locomotive))
				.collect(Collectors.toList());
		
		boolean hasFirstClassCoach = coaches.stream()
				.filter(c -> c instanceof PassengerCoach)
				.map(PassengerCoach.class::cast)
				.filter(pc -> pc.getClass_().equals(CoachClass.FIRST_CLASS))
				.count() > 0;
				
		boolean hasEconomyCoach = coaches.stream()
				.filter(c -> c instanceof PassengerCoach)
				.map(PassengerCoach.class::cast)
				.filter(pc -> pc.getClass_().equals(CoachClass.ECONOMY))
				.count() > 0;

		
		for (int i = 0; i < coaches.size(); i++) {
			if(coaches.get(i) instanceof DiningCoach) {

				//Check if the dining coach has a coach on both sides
				if(i > 0 && i < coaches.size()-1) {
					CoachClass left = ((PassengerCoach) coaches.get(i-1)).getClass_();
					CoachClass right = ((PassengerCoach) coaches.get(i+1)).getClass_();
					
					if (left.equals(right)) {
						constraintViolated(train, train.getName() + ", dining coach may not be between two coaches of the same class");
						break;
					}
				} else if(hasEconomyCoach && hasFirstClassCoach) {
					constraintViolated(train, train.getName() + ", dining coach must be between the two passenger classes");
					break;
				} 
			}
		}
		
		
		return false;
	}

	private boolean validateCoachClassesInSequence(Train train) {
		// Validate that all coach classes are in sequence. 
		// E.g. all first class coaches are one after the other, followed by the economy coaches
		
		System.out.println("Train: " + train.getName());
		List<Coach> coaches = train.getCoach().stream()
				.filter(c -> !(c instanceof Locomotive))
				.filter(c -> !(c instanceof DiningCoach))
				.collect(Collectors.toList());
		
		Set<CoachClass> visited = new HashSet<>();

		Coach prevCoach  = coaches.get(0);
		if (prevCoach instanceof PassengerCoach) {
			for (int i = 1; i <= coaches.size()-1; i++) {				
				CoachClass prevClass = ((PassengerCoach) prevCoach).getClass_();
				visited.add(prevClass);
				
				Coach currCoach = coaches.get(i);
				CoachClass currClass = ((PassengerCoach) currCoach).getClass_();
				
				prevCoach = currCoach;
				if (currClass.equals(prevClass)) {
					continue;
				} else if (visited.contains(currClass)) {
					constraintViolated(train, train.getName() + ", coach classes mut be in sequence");
				}
			}
		}
		return false;
	}

	private boolean validateAtMostOneDiningCoach(Train train) {
		// Check if there is at most one dining coach in any train
		
		boolean constraintViolated = train.getCoach().stream()
				.filter(DiningCoach.class::isInstance)
				.count() > 1;
		
		if (constraintViolated) {
			constraintViolated(train, train.getName() + " may have at most one dining coach");
		}
		return false;
	}
	
	private boolean validateIntercityHasAtLeastOneDiningCoach(Train train) {
		// Check that intercity coach has at least one diner
		
		boolean constraintViolated = train.getCoach().stream()
				.filter(DiningCoach.class::isInstance)
				.count() < 1;
		
		if (constraintViolated) {
			constraintViolated(train, train.getName() + " must have a dining coach");
		}
		return false;
	}

	private boolean validateIntercityHasAtLeastOneFirstclass(Train train) {
		// Check that intercity coach has at least one first class coach
		
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
		// Check that locomotives are not located between coaches
		
		List<Coach> coaches = new ArrayList<>(train.getCoach());
		coaches.remove(coaches.size()-1);
		coaches.remove(0);
		
		boolean constraintViolated = coaches.stream()
				.filter(x -> x instanceof Locomotive)
				.count() > 0;
		
		if (constraintViolated) {
			constraintViolated(train, train.getName() + " locomotives may not be between coaches");
		}
		return false;
	}
	
	private boolean validateLocomotiveAsFirstOrLastCoach(Train train) {
		// Check that locomotives are only located at either end of the train
		
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
		// Check that the number of locomotives does not exceed 2
		
		boolean constraintViolated = train.getCoach().stream()
				.filter(Locomotive.class::isInstance)
				.count() > 2;
		
		if (constraintViolated) {
			constraintViolated(train, train.getName() + " must not contain more than two locomotives");
		}
		return false;
	}

	private boolean validateContainsAtLeastOneLocomotive(Train train) {
		// Check that a train has at least one locomotive
		
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
