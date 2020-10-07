package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import java.sql.Timestamp;
import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;

public class AttributeValue extends BrapiObject
{
	private String          attributeDbId;
	private String          attributeName;
	private String          attributeValueDbId;
	private Timestamp       determinedDate;
	private List<Reference> externalReferences;
	private String          germplasmDbId;
	private String          germplasmName;
	private String          value;

	public String getAttributeDbId()
	{
		return attributeDbId;
	}

	public AttributeValue setAttributeDbId(String attributeDbId)
	{
		this.attributeDbId = attributeDbId;
		return this;
	}

	public String getAttributeName()
	{
		return attributeName;
	}

	public AttributeValue setAttributeName(String attributeName)
	{
		this.attributeName = attributeName;
		return this;
	}

	public String getAttributeValueDbId()
	{
		return attributeValueDbId;
	}

	public AttributeValue setAttributeValueDbId(String attributeValueDbId)
	{
		this.attributeValueDbId = attributeValueDbId;
		return this;
	}

	public Timestamp getDeterminedDate()
	{
		return determinedDate;
	}

	public AttributeValue setDeterminedDate(Timestamp determinedDate)
	{
		this.determinedDate = determinedDate;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public AttributeValue setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getGermplasmDbId()
	{
		return germplasmDbId;
	}

	public AttributeValue setGermplasmDbId(String germplasmDbId)
	{
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	public String getGermplasmName()
	{
		return germplasmName;
	}

	public AttributeValue setGermplasmName(String germplasmName)
	{
		this.germplasmName = germplasmName;
		return this;
	}

	public String getValue()
	{
		return value;
	}

	public AttributeValue setValue(String value)
	{
		this.value = value;
		return this;
	}
}