package uk.ac.hutton.ics.brapi.server.genotyping.vendor;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.vendor.Plate;

public interface BrapiVendorOrderPlateServerResource
{
	@Get
	BaseResult<ArrayResult<Plate>> getVendorOrderByIdPlates();
}
