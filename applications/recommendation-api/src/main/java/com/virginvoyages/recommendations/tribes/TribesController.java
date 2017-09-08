package com.virginvoyages.recommendations.tribes;

import javax.validation.constraints.NotNull;

import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Api(value = "Tribe", tags = "Tribe", description = "Tribe operations")
@Slf4j
@RequiredArgsConstructor
@ExposesResourceFor(Tribe.class)
public class TribesController {

	@ApiOperation(value = "", notes = "To request a tribe for a given sailor ID", response = Tribe.class, tags = {
			"Tribe", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successful response", response = Tribe.class) })
	@RequestMapping(value = "/tribe", method = RequestMethod.GET)
	public ResponseEntity<Tribe> tribeGet(
			@NotNull @ApiParam(value = "the source or caller of the API request - this will be an application code to be defined later", required = true) @RequestParam(value = "requestSource", required = true) String requestSource,
			@NotNull @ApiParam(value = "the unique sailorID which may or may not be a CRM C360 profile", required = true) @RequestParam(value = "sailorId", required = true) String sailorId,
			@ApiParam(value = "an identifier generated by the calling application for its own purposes") @RequestHeader(value = "X-Correlation-ID", required = false) String xCorrelationID,
			@ApiParam(value = "Application identifier of client") @RequestHeader(value = "X-VV-Client-ID", required = false) String xVVClientID) {
		
		log.debug("Entering tribeGet");
		return new ResponseEntity<Tribe>(HttpStatus.OK);
	}

	@ApiOperation(value = "", notes = "To request a tribes for a given sailor ID", response = Tribes.class, tags = {
			"Tribes", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successful response", response = Tribes.class) })
	@RequestMapping(value = "/tribes", method = RequestMethod.GET)
	public ResponseEntity<Tribes> tribesGet(
			@NotNull @ApiParam(value = "the source or caller of the API request - this will be an application code to be defined later", required = true) @RequestParam(value = "requestSource", required = true) String requestSource,
			@NotNull @ApiParam(value = "the unique sailorID which may or may not be a CRM C360 profile", required = true) @RequestParam(value = "sailorId", required = true) String sailorId,
			@ApiParam(value = "an identifier generated by the calling application for its own purposes") @RequestHeader(value = "X-Correlation-ID", required = false) String xCorrelationID,
			@ApiParam(value = "Application identifier of client") @RequestHeader(value = "X-VV-Client-ID", required = false) String xVVClientID) {
		
		return new ResponseEntity<Tribes>(HttpStatus.OK);
	}

}