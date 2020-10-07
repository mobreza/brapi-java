package uk.ac.hutton.ics.brapi.server.core.list;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.list.Lists;

public interface BrapiListIndividualServerResource
{
	@Get
	BaseResult<Lists> getListsById();

	@Put
	BaseResult<Lists> putListById(Lists updatedLists);
}