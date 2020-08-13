package uk.ac.hutton.ics.brapi.server.genotyping.reference;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.ReferenceSet;

public interface BrapiReferenceSetIndividualServerResource
{
	@Get
	BaseResult<ReferenceSet> getReferenceSetById();
}
