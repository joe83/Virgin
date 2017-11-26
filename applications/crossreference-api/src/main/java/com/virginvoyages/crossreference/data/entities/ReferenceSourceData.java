package com.virginvoyages.crossreference.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.virginvoyages.crossreference.model.ReferenceSource;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Table containing ReferenceSourceData
 * @author snarthu
 *
 */
@Entity
@Table(name = "REFERENCE_SOURCE")
@Data
@Accessors(fluent = true, chain = true)
public class ReferenceSourceData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy = "uuid")
    @Column(name="REFERENCE_SOURCE_ID")
	private String referenceSourceID;

	@Column(name="REFERENCE_SOURCE",nullable = false)
	private String referenceSource;

	@Column(name="INACTIVE")
	private Boolean inActive = false;

    // TODO move to Mapper/Factory
	public ReferenceSource convertToBusinessEntity() {
		return new ReferenceSource()
				.referenceSource(this.referenceSource())
				.referenceSourceID(String.valueOf(this.referenceSourceID()))
				.inActive(this.inActive());
			
	}

    // TODO move to Mapper/Factory
    public static ReferenceSourceData convertToDataEntity(ReferenceSource source) {
        return new ReferenceSourceData()
                .referenceSource(source.referenceSource())
                .referenceSourceID(source.referenceSourceID())
                .inActive(source.inActive());
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ReferenceSourceData)) {
			return false;
		}
		ReferenceSourceData other = (ReferenceSourceData) obj;
		return referenceSourceID().equals(other.referenceSourceID());
	}
	
	@Override
	public int hashCode() {
		return referenceSourceID().hashCode();
	}
	
}
