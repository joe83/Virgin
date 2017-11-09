package com.virginvoyages.model.crossreference;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.virginvoyages.crossreference.data.entities.ReferenceData;
import com.virginvoyages.crossreference.data.entities.ReferenceTypeData;

import lombok.Data;
import lombok.experimental.Accessors;
/**
 * Core entity to store the cross references for the enterprise.
 */
@Data
@Accessors(fluent = true, chain = true)
public class Reference   {
	
  @JsonProperty("referenceID")
  private String referenceID = null;

  @JsonProperty("nativeSourceIDValue")
  private String nativeSourceIDValue = null;

  @JsonProperty("masterID")
  private String masterID;
  
  @JsonProperty("referenceTypeID")
  private String referenceTypeID = null;
  
  public ReferenceData convertToDataEntity() {
	  return new ReferenceData()
			  .nativeSourceIDValue(this.nativeSourceIDValue())
			  .masterID(this.masterID())
			  .referenceTypeData(new ReferenceTypeData().referenceTypeID(this.referenceTypeID()));
			  
  }
}

