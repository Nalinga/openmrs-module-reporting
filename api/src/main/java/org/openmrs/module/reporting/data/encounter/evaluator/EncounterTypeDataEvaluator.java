/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.reporting.data.encounter.evaluator;

import org.openmrs.annotation.Handler;
import org.openmrs.module.reporting.data.encounter.definition.EncounterTypeDataDefinition;

/**
 * Evaluates a EncounterTypeDataDefinition to produce a EncounterData
 */
@Handler(supports=EncounterTypeDataDefinition.class, order=50)
public class EncounterTypeDataEvaluator extends EncounterPropertyDataEvaluator {

	@Override
	public String getPropertyName() {
		return "encounterType";
	}
}
