package com.virginvoyages.crossreference.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Data creation is failing in database")
public class DataInsertionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DataInsertionException(String exception) {
		
	}

}
