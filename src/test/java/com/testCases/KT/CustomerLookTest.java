package com.testCases.KT;
import io.restassured.RestAssured;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CustomerLookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Defne the baseURI
		RestAssured.baseURI = "https://stg-extnahlt.cdn.wkgbssvcs.com";
		
		//given() - all inputs (base URl, Payload body, headers, QueryParams, PathParams, Auth)
		given().log().all().header("Content-Type","application/json").body("{\r\n" + 
				"  \"customerLookupRequest\": {\r\n" + 
				"    \"uuidMetaDataRequest\": {\r\n" + 
				"      \"uuid\": \"MOZU-LWW_109d6a21-0637-4c4a-5d27-46ac7aeab438\",\r\n" + 
				"      \"targetSystemName\": \"Advantage\",\r\n" + 
				"      \"callingSystemName\": \"MOZU-LWW\",\r\n" + 
				"      \"uniqueCallingUserId\": \"MOZU-LWW\",\r\n" + 
				"      \"requestDateTime\": \"2020-4-27T19:30:16\",\r\n" + 
				"      \"serviceVersion\": \"V2\",\r\n" + 
				"      \"svcUsername\": \"CustomerLookup\",\r\n" + 
				"      \"svcPassword\": \"Q3VzdG9tZXJMb29rdXBfU1RH\",\r\n" + 
				"      \"serviceName\": \"CustomerLookup\"\r\n" + 
				"    },\r\n" + 
				"    \"customerLookupRequestInfo\": {\r\n" + 
				"      \"clientId\": \"MOZU-LWW\",\r\n" + 
				"      \"customerNumber\": \"000000018769\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}").
		
		
		//when() - When you do something - Method Type, Resource (when you make a post request with your resource)
		when().post("/Health/Services/CustomerServices/CustomerLookup/V2.0").
		
		//then() - Assertions (Expect a status code of 200 OK)
		then().log().all().assertThat().statusCode(200);
	}

}
