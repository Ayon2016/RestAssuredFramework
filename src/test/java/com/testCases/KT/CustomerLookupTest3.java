package com.testCases.KT;

import static io.restassured.RestAssured.given;

import com.wkhealth.reusable.resources.Payloads;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class CustomerLookupTest3 {
	public static void CustomerLookupTest3() {
	
	RestAssured.baseURI = "https://stg-extnahlt.cdn.wkgbssvcs.com";
	
	String response = given().log().all().header("Content-Type","application/json").body(Payloads.returnCustomerLookupPayload(""))
	.when().post("/Health/Services/CustomerServices/CustomerLookup/V2.0").
	then().log().all().assertThat().statusCode(200)
	// To Extract response as String
	.extract().response().asString();
	
	// How to Parse a JSON
	JsonPath path = new JsonPath(response);
	String actualStatus = path.getString("customerLookupResponse.customerLookupResponseInfo.status");
	String actualcommtype1= path.getString("customerLookupResponse.customerLookupResponseInfo.communicationInfo[0].communicationType");
	System.out.println("The status return from the response is: "+ actualStatus);
	System.out.println("The Communication type 1 is: " + actualcommtype1);
	//path.getString("customerLookupResponse.customerLookupResponseInfo.communicationInfo[0].communicationType");
	int getSize = path.getInt("customerLookupResponse.customerLookupResponseInfo.communicationInfo.size()");
	System.out.println("The Size of the Array is: "+ getSize);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
