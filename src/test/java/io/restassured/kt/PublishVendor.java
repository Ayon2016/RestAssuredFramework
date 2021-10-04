package io.restassured.kt;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wkhealth.reusable.resources.ApiPayloads;


public class PublishVendor {
	
	// Verify that a status of OK is returned
	// Verify that the firstName is Sohan
	// Verify that the number of communication info is 3
	
	static String expectedStatus= "OK";
	String expectedFirstNameString = "Mohan";
	int expectedcommInfo = 3;
	//Step1 - To declare the base URI
	static String baseURI = "https://stg-extnahlt.cdn.wkgbssvcs.com";
	
	@Test
	public static void verifyStatusinResponse() {			
		RestAssured.baseURI = baseURI;
		//Step2 - Build your input using given()
		String response = given().log().all().header("Content-Type", "application/json")
		.body(ApiPayloads.publishVendorPayload())
		//Step3 - Submit your request (VERB, Resource)
		.when().post("Health/Services/CustomerServices/CustomerLookup/V2.0")
		//Step4 - Validations
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
		
		//Class inside Rest_Assured that gives you ability to parse a Json
		JsonPath js = new JsonPath(response);
		String actualStatus = js.getString("customerLookupResponse.customerLookupResponseInfo.status");
		
		//Assertion
		Assert.assertEquals(actualStatus, expectedStatus);
		
		
	}
}
