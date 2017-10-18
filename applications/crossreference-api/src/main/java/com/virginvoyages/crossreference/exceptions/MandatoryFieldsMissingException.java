package com.virginvoyages.crossreference.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Mandatory fields missing in ReferenceSource")
public class MandatoryFieldsMissingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MandatoryFieldsMissingException() {

	}
}
