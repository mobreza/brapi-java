package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationUnit;

public interface BrapiObservationUnitIndividualServerResource
{
	@Get
	BaseResult<ObservationUnit> getObservationUnitById();

	@Put
	BaseResult<ObservationUnit> putObservationUnitById(ObservationUnit observationUnit);
}
