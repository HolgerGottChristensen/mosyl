/**
 *
 * $Id$
 */
package org.mdse.pts.network.validation;

import org.eclipse.emf.common.util.EList;

import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;

/**
 * A sample validator interface for {@link org.mdse.pts.network.Network}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NetworkValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateStations(EList<Station> value);
	boolean validateLegs(EList<Leg> value);
}
