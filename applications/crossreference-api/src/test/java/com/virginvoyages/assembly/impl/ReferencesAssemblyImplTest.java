package com.virginvoyages.assembly.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.virginvoyages.crossreference.exceptions.DataNotFoundException;
import com.virginvoyages.crossreference.exceptions.DataUpdationException;
import com.virginvoyages.crossreference.helper.TestDataHelper;
import com.virginvoyages.crossreference.references.Reference;
import com.virginvoyages.data.entities.ReferenceData;
import com.virginvoyages.data.repositories.ReferenceRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReferencesAssemblyImplTest {
	

	@Mock
	private ReferenceRepository referenceRepository;
	
	@InjectMocks
	private ReferencesAssemblyImpl referencesAssemblyImpl;
	
	@Autowired
	private TestDataHelper testDataHelper;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void givenRepositorySavesReferenceTypeDataAddReferenceTypeShouldReturnSavedEntity() {
		ReferenceData mockReferenceData = testDataHelper.getReferenceDataEntity();
		when(referenceRepository.save((any(ReferenceData.class)))).thenReturn(mockReferenceData);
		Reference createdReference = referencesAssemblyImpl.addReference(mockReferenceData.convertToBusinessEntity());
		assertThat(createdReference, notNullValue());
		assertThat(createdReference.referenceID(), notNullValue());
		assertThat(createdReference.masterID(), equalTo(mockReferenceData.masterID()));
	}
	
	@Test
	public void givenRepositorySavesReferenceDataUpdateReferenceShouldReturnSavedEntity() {
		ReferenceData mockReferenceData = testDataHelper.getReferenceDataEntity();
		when(referenceRepository.findOne((any(String.class)))).thenReturn(mockReferenceData);
		when(referenceRepository.save(any(ReferenceData.class))).thenReturn(mockReferenceData);
		Reference createdReference = referencesAssemblyImpl.updateReference(mockReferenceData.convertToBusinessEntity());
		assertThat(createdReference, notNullValue());
		assertThat(createdReference.referenceID(), notNullValue());
		assertThat(createdReference.masterID(), equalTo(mockReferenceData.masterID()));
	}
	
	@Test(expected = DataNotFoundException.class)
	public void givenRepositoryInvalidReferenceIDInDeleteReferenceByIDShouldThrowDataNotFoundException() {
		String InvalidReferenceID = testDataHelper.getRandomAlphanumericString();
		doThrow(new DataNotFoundException()).when(referenceRepository).delete(InvalidReferenceID);
		referencesAssemblyImpl.deleteReferenceByID(InvalidReferenceID);
	  }
	
	@Test(expected = DataNotFoundException.class)
	public void givenRepositoryvalidReferenceIDInDeleteReferenceByIDShouldReturnEmptyReference() {
		Mockito.spy(ReferenceData.class);
		ReferenceData mockReferenceData = testDataHelper.getReferenceDataEntity();
		doNothing().when(referenceRepository).delete(mockReferenceData.referenceID());
		referencesAssemblyImpl.deleteReferenceByID(mockReferenceData.referenceID());
		doThrow(new DataNotFoundException()).when(referenceRepository).findOne(mockReferenceData.referenceID());
		Reference findReference = referencesAssemblyImpl.findReferenceByID(mockReferenceData.referenceID());
		assertThat(findReference, is(nullValue()));
		
	}
	
	@Test(expected = DataUpdationException.class)
	public void givenRepositorySavesReferenceDataWithInvalidReferenceIDInUpdateReferenceItShouldThrowDataUpdationException() {
		ReferenceData mockReferenceData = testDataHelper.getReferenceDataEntity();
		when(referenceRepository.save(any(ReferenceData.class))).thenReturn(mockReferenceData);
		Reference createdReference = referencesAssemblyImpl.updateReference(mockReferenceData.convertToBusinessEntity());
		assertThat(createdReference, notNullValue());
		assertThat(createdReference.referenceID(), notNullValue());
		assertThat(createdReference.masterID(), equalTo(mockReferenceData.masterID()));
	}
}
