package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.SearchResult;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.call.*;
import uk.ac.hutton.ics.brapi.resource.variant.*;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiSearchVariantServerResource
{
	@Post
	TokenBaseResult<ArrayResult<Variant>> postVariantSearch(VariantSearch search);

	@Post
	BaseResult<SearchResult> postVariantSearchAsync(VariantSearch search);

	@Get
	TokenBaseResult<ArrayResult<Variant>> getVariantSearchAsync();
}
