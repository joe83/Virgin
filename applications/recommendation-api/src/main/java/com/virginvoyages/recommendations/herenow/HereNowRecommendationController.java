package com.virginvoyages.recommendations.herenow;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.virginvoyages.recommendations.herenow.model.HereNowRecommendation;
import com.virginvoyages.recommendations.herenow.model.HereNowRecommendations;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Api(value = "HereNowRecommendation", tags = "HereNowRecommendation", description = "HereNow Recommendation")
@Slf4j
@RequiredArgsConstructor
@ExposesResourceFor(HereNowRecommendation.class)
public class HereNowRecommendationController {

	@ApiOperation(value = "", notes = "TBD", response = HereNowRecommendations.class, tags = {
			"Here Now Recommendation", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successful response", response = HereNowRecommendations.class) })
	@RequestMapping(value = "/hereNowRecommendation", method = RequestMethod.POST)
	public ResponseEntity<HereNowRecommendations> hereNowRecommendationPost(
			@NotNull @ApiParam(value = "The system making the request, use the sailor ID + system to leverage the x-ref to find the data lake identifier", required = true) @RequestParam(value = "requestSource", required = true) String requestSource,
			@NotNull @ApiParam(value = "The END system identifier for the sailor", required = true) @RequestParam(value = "sailorID", required = true) String sailorID,
			@NotNull @ApiParam(value = "timestamp when the request was generated", required = true) @RequestParam(value = "requestTime", required = true) String requestTime,
			@NotNull @ApiParam(value = "Channel identifier - Mobile, Web, Ship Screen, Voice, Call Centre - what is the end requesting medium this is an enumerate", required = true, allowableValues = "MOBILE, WEB, SHIP_SCREEN, VOICE, CALL_CENTRE") @RequestParam(value = "channel", required = true) String channel,
			@NotNull @ApiParam(value = "The place identifier for the recommendation. This will an array of places consisting of PlaceID and PlaceName separated by '|' (pipe)- e.g. 01|Spa, 02|Cabin, etc this is a defined enumerate that is constant between channels (Spa on the ship is Spa on the web)", required = true) @RequestParam(value = "place", required = true) List<String> place,
			@ApiParam(value = "an identifier generated by the calling application for its own purposes") @RequestHeader(value = "X-Correlation-ID", required = false) String xCorrelationID,
			@ApiParam(value = "Application identifier of client") @RequestHeader(value = "X-VV-Client-ID", required = false) String xVVClientID,
			@ApiParam(value = "A variable tuple envelop of additional meta-data that is not used at this stage but may be of use in future (e.g. cookies, URIs, etc) this is used for machine learning in the future, not the individual request. The format of meta-data tuple would be pipe separated key value pair.  e.g [\"URL\"| \"www.example.com\", ...]") @RequestParam(value = "metaData", required = false) List<String> metaData) {
		
		log.debug("Entering hereNowRecommendationPost");
		return new ResponseEntity<HereNowRecommendations>(HttpStatus.OK);
	}

}
