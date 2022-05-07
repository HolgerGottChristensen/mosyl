/**
 *
 * $Id$
 */
package depot.validation;

import depot.Train;

/**
 * A sample validator interface for {@link depot.Coach}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CoachValidator {
	boolean validate();

	boolean validateWagonNumber(int value);
	boolean validateTrain(Train value);
}