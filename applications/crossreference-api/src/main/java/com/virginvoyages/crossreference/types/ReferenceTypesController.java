package com.virginvoyages.crossreference.types;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.virginvoyages.api.MockCrossReferenceAPI;
import com.virginvoyages.assembly.ReferenceTypesAssembly;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Controller class to handle API requests for operations related to
 * ReferenceTypes.
 * 
 * @author snarthu
 *
 */
@RestController
@Api(value = "ReferenceType", tags = "ReferenceType", description = "Reference Type operations")
@Slf4j
@RequiredArgsConstructor
@ExposesResourceFor(ReferenceType.class)
public class ReferenceTypesController {

	@Autowired
	private MockCrossReferenceAPI mockAPI;

	@Autowired
	private ReferenceTypesAssembly referenceTypesAssembly;

	/**
	 * It is adding new ReferenceType Record
	 * 
	 * @param ReferenceType
	 * @param xCorrelationID
	 *            - Correlation ID across the enterprise application components.
	 * @param xVVClientID
	 *            - Application identifier of client.
	 * @return
	 */
	@ApiOperation(value = "", notes = "Add a new `ReferenceType`.", response = Void.class, tags = { "ReferenceType", })
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created", response = Void.class),
			@ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
	@RequestMapping(value = "/types", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<Void> addReferenceType(
			@ApiParam(value = "Reference object that needs to be created", required = true) @RequestBody ReferenceType body,
			@ApiParam(value = "Correlation ID across the enterprise application components.") @RequestHeader(value = "X-Correlation-ID", required = false) String xCorrelationID,
			@ApiParam(value = "Application identifier of client.") @RequestHeader(value = "X-VV-Client-ID", required = false) String xVVClientID) {
		log.debug("Adding Reference Type");
		referenceTypesAssembly.addReferenceType(body);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@ApiOperation(value = "", notes = "Remove the ReferenceType", response = Void.class, tags = { "ReferenceType", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful response", response = Void.class),
			@ApiResponse(code = 404, message = "ReferenceType not found", response = Void.class) })
	@RequestMapping(value = "/types/{referenceTypeID}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteReferenceTypeByID(
			@ApiParam(value = "The reference type identifier", required = true) @PathVariable("referenceTypeID") String referenceTypeID,
			@ApiParam(value = "Correlation ID across the enterprise application components.") @RequestHeader(value = "X-Correlation-ID", required = false) String xCorrelationID,
			@ApiParam(value = "Application identifier of client.") @RequestHeader(value = "X-VV-Client-ID", required = false) String xVVClientID) {

		mockAPI.deleteReferenceTypeByID(referenceTypeID);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	/**
	 * @param referenceTypeID
	 *            - Find reference type by ID
	 * @param xCorrelationID
	 *            - Correlation ID across the enterprise application components.
	 * @param xVVClientID
	 *            - Application identifier of client.
	 * @return ReferenceType - returns a referenceType
	 */
	@ApiOperation(value = "Find reference type by ID", notes = "Returns a reference source for a specified reference source identity.  This identity is a univeral reference identity.", response = ReferenceType.class, tags = {
			"ReferenceType", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful response", response = ReferenceType.class) })
	@RequestMapping(value = "/types/{referenceTypeID}", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<ReferenceType> findReferenceTypeByID(
			@ApiParam(value = "The reference type identifier", required = true) @PathVariable("referenceTypeID") String referenceTypeID,
			@ApiParam(value = "Correlation ID across the enterprise application components.") @RequestHeader(value = "X-Correlation-ID", required = false) String xCorrelationID,
			@ApiParam(value = "Application identifier of client.") @RequestHeader(value = "X-VV-Client-ID", required = false) String xVVClientID) {

		return new ResponseEntity<ReferenceType>(referenceTypesAssembly.findReferenceTypeByID(referenceTypeID),
				HttpStatus.OK);
	}

	@ApiOperation(value = "", notes = "Gets `ReferenceType` objects.", response = ReferenceType.class, responseContainer = "List", tags = {
			"ReferenceType", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful response", response = ReferenceType.class) })
	@RequestMapping(value = "/types", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<List<ReferenceType>> findTypes(
			@ApiParam(value = "Correlation ID across the enterprise application components.") @RequestHeader(value = "X-Correlation-ID", required = false) String xCorrelationID,
			@ApiParam(value = "Application identifier of client.") @RequestHeader(value = "X-VV-Client-ID", required = false) String xVVClientID,
			@ApiParam(value = "") @RequestParam(value = "page", required = false) Integer page,
			@ApiParam(value = "") @RequestParam(value = "size", required = false) Integer size) {

		return new ResponseEntity<List<ReferenceType>>(mockAPI.findTypes(), HttpStatus.OK);
	}

	@ApiOperation(value = "", notes = "Update a `ReferenceType` object.", response = Void.class, tags = {
			"ReferenceType", })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
			@ApiResponse(code = 404, message = "ReferenceSource not found", response = Void.class),
			@ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
	@RequestMapping(value = "/types/{referenceTypeID}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<Void> updateReferenceType(
			@ApiParam(value = "The reference type identifier", required = true) @PathVariable("referenceTypeID") String referenceTypeID,
			@ApiParam(value = "Reference object that needs to be updated", required = true) @RequestBody ReferenceType body,
			@ApiParam(value = "Correlation ID across the enterprise application components.") @RequestHeader(value = "X-Correlation-ID", required = false) String xCorrelationID,
			@ApiParam(value = "Application identifier of client.") @RequestHeader(value = "X-VV-Client-ID", required = false) String xVVClientID) {
		mockAPI.updateReferenceType(referenceTypeID, body);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
