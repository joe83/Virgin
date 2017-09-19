/**
 * 
 */
package com.virginvoyages.dao.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Repository;

import com.virginvoyages.crossreference.model.Audited;
import com.virginvoyages.crossreference.references.Reference;
import com.virginvoyages.crossreference.sources.ReferenceSource;
import com.virginvoyages.crossreference.types.ReferenceType;
import com.virginvoyages.dao.ReferencesDAO;

import lombok.extern.slf4j.Slf4j;

/**
 * Data access layer for ReferenceTypes.
 * Stubbed out now as data source yet to be finalized
 * @author snarthu
 *
 */
@Repository
@Slf4j
public class ReferencesDAOImpl implements ReferencesDAO {

	private Map<Object, Reference> parameters = new ConcurrentHashMap<>();
	
	@Override
	public void addReference(Reference reference) {
		log.debug("adding referenceType to References ");
		getDataForCreateReference(reference);
	}

	/**
	 * @param reference
	 */
	private void getDataForCreateReference(Reference reference) {

		parameters.put(reference.referenceID(),reference);
		parameters.put(reference.masterID(),reference);
		parameters.put(reference.nativeSourceID(),reference);
		parameters.put(reference.details(),reference);
		parameters.put(reference.expiry(),reference);
		parameters.put(reference.referenceSource(),reference);
		parameters.put(reference.referenceType(),reference);
		parameters.put(reference.auditData(),reference);
		
	}

	@Override
	public Reference findReferenceID(String referenceID) {
		Reference reference = parameters.get(referenceID);
		return reference;
	}

	
}
