package com.virginvoyages.crossreference.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author snarthu
 * Table containing ReferenceTypeData
 *
 */
@Entity
@Table(name = "REFERENCE_TYPE")
@Data
@Accessors(fluent = true, chain = true)
public class ReferenceTypeData {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy = "uuid")
	@Column(name="REFERENCE_TYPE_ID")
	private String referenceTypeID;	

	@Column(name="REFERENCE_TYPE")
	private String referenceType = null;
	
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "REFERENCE_SOURCE_ID")
	private ReferenceSourceData referenceSourceData;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ReferenceTypeData)) {
			return false;
		}
		ReferenceTypeData other = (ReferenceTypeData) obj;
		return referenceTypeID().equals(other.referenceTypeID());
	}
	
	@Override
	public int hashCode() {
		return referenceTypeID().hashCode();
	}

}
