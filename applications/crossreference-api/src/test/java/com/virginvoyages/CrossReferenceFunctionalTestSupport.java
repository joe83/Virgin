package com.virginvoyages;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.virginvoyages.crossreference.helper.TestDataHelper;
import com.virginvoyages.crossreference.model.Reference;
import com.virginvoyages.crossreference.model.ReferenceSource;
import com.virginvoyages.helper.Oauth2TokenFeignClient;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CrossReferenceFunctionalTestSupport extends FunctionalTestSupport {
	
	@Autowired
	private TestDataHelper testDataHelper;
	
	public Map<String, Object> parameters = new HashMap<String, Object>();

	public Map<String, Object> referenceParam = new HashMap<String, Object>();


	@Autowired
	private Oauth2TokenFeignClient oauth2TokenFeignClient;
	
	
	private String  getToken() {
		final JsonPath jsonResponse = new JsonPath(oauth2TokenFeignClient.getTokenResponse("client_credentials"));
    	final String accessToken = jsonResponse.getString("access_token");
    	
    	return accessToken;
    	
	}
	@Test
    public void contextLoads() {
    }

	public JsonPath createTestReferenceSource() {

		ReferenceSource referenceSource = testDataHelper.getReferenceSourceBusinessEntity();

		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("referenceSourceID", referenceSource.referenceSourceID());
		parameters.put("referenceSource", referenceSource.referenceSource());
		parameters.put("inActive", referenceSource.inActive());

		JsonPath jsonResponse = given()
			.contentType("application/json")
			.header("Authorization", "Bearer " + getToken())
			.body(parameters)
			.post("/xref-api/v1/sources").

		then()
			.statusCode(200).extract().response().jsonPath();

		return jsonResponse;
	}
	
	public void deleteTestReferenceSource(String referenceSourceID) {

		given()
			.contentType("application/json")
			.header("Authorization", "Bearer " + getToken())
			.delete("/xref-api/v1/sources/" + referenceSourceID).

		then()
			.statusCode(200);
	}

	public JsonPath createTestReferenceType(JsonPath referenceSourceJson) {
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("referenceType", testDataHelper.getRandomAlphabeticString());
		parameters.put("referenceSourceID", referenceSourceJson.getString("referenceSourceID"));
		
		// create reference type
		Response response = given()
			.contentType("application/json")
			.header("Authorization", "Bearer " + getToken())
			.body(parameters)
			.post("/xref-api/v1/types/").

		then()
			.assertThat()
			.statusCode(200).extract().response();
		

		return response.jsonPath();
	}
	
	public JsonPath createTestReferenceType() {
		return createTestReferenceType(createTestReferenceSource());
	}
	
	public void deleteTestReferenceType(String referenceTypeID) {

		given()
			.contentType("application/json")
			.header("Authorization", "Bearer " + getToken())
			.delete("/xref-api/v1/types/" + referenceTypeID).

		then()
			.statusCode(200);
	}
	
	public JsonPath createTestReference(JsonPath referenceTypeResponse) {
		
		Reference reference = testDataHelper.getReferenceBusinessEntity();
		Map<String, Object> parameters = new HashMap<String, Object>();

		parameters.put("referenceID", reference.referenceID());
		parameters.put("masterID", reference.masterID());
		parameters.put("nativeSourceIDValue", reference.nativeSourceIDValue());
		parameters.put("referenceTypeID", referenceTypeResponse.getString("referenceTypeID"));
		parameters.put("targetReferenceTypeID", reference.referenceID());
		referenceParam.put("referenceSourceID", referenceTypeResponse.getString("referenceSourceID"));

		
		// create references 
		Response response = given()
		     .contentType("application/json") 
		     .header("Authorization", "Bearer " + getToken())
		     .body(parameters)
		     .post("/xref-api/v1/references/").

		then()
		 	.assertThat()
		 	.statusCode(200)
		 	.log()
		 	.all()
		 	.extract()
		 	.response();
			
		return response.jsonPath();

	}
	
	public JsonPath createTestReference() {
		return createTestReference(getReferenceType());
			
	}
	
	public void deleteTestReference(String referenceID) {
		
		given()
			.contentType("application/json")
			.header("Authorization", "Bearer " + getToken())
			.delete("/xref-api/v1/references/" + referenceID).

		then()
			.statusCode(200);
	}
	
	public JsonPath getReferenceType() {
		
		Response response = 
				given()
				.contentType("application/json")
				.header("Authorization", "Bearer " + getToken())
				.param("page", 0)
				.param("size", 1)
				.get("/xref-api/v1/types/")

			.then()
				.assertThat()
				.statusCode(200)
				.log()
				.all()
			 	.extract()
			 	.response();
					
		return response.jsonPath();
		
	}
}
