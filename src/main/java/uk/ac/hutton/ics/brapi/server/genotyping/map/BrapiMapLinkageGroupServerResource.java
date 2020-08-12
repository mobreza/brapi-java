package uk.ac.hutton.ics.brapi.server.genotyping.map;

import uk.ac.hutton.ics.brapi.resource.LinkageGroup;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiMapLinkageGroupServerResource
{
	BaseResult<ArrayResult<LinkageGroup>> getMapLinkageGroups();
}
