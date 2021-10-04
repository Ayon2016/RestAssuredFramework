package com.testCases.KT;

import static io.restassured.RestAssured.given;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.Static;
import com.wkhealth.reusable.resources.Payloads;

import CustomerLookupPojoClasses.CustomerLookupRequest;
import CustomerLookupPojoClasses.CustomerLookupRequestInfo;
import CustomerLookupPojoClasses.CustomerLookupRequestParent;
import CustomerLookupPojoClasses.UuidMetaDataRequest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class pojoCUstomerLookup {
	
	static CustomerLookupRequestParent cParent;
	static CustomerLookupRequest cRequest;
	static CustomerLookupRequestInfo cInfo;
	static UuidMetaDataRequest uDataRequest;
	
	public static void CustomerLookupTest3() {
		RestAssured.baseURI = "https://stg-extnahlt.cdn.wkgbssvcs.com";
		cParent = new CustomerLookupRequestParent();
		cRequest = new CustomerLookupRequest();
		cInfo = new CustomerLookupRequestInfo();
		uDataRequest = new UuidMetaDataRequest();
		
		uDataRequest.setUuid("MOZU-LWW_109d6a21-0637-4c4a-5d27-46ac7aeab438");
		uDataRequest.setTargetSystemName("Advantage");
		uDataRequest.setCallingSystemName("MOZU-LWW");
		uDataRequest.setRequestDateTime("2020-4-27T19:30:16");
		uDataRequest.setServiceName("CustomerLookup");
		uDataRequest.setServiceVersion("V2");
		uDataRequest.setSvcPassword("Q3VzdG9tZXJMb29rdXBfU1RH");
		uDataRequest.setSvcUsername("CustomerLookup");
		uDataRequest.setUniqueCallingUserId("MOZU-LWW");
		
		cInfo.setClientId("MOZU-LWW");
		cInfo.setCustomerNumber("000000080685");
		
		cRequest.setCustomerLookupRequestInfo(cInfo);
		cRequest.setUuidMetaDataRequest(uDataRequest);
		
		cParent.setCustomerLookupRequest(cRequest);
		
		String response = given().log().all().header("Content-Type","application/json").body(cParent)
				.when().post("/Health/Services/CustomerServices/CustomerLookup/V2.0").
				then().log().all().assertThat().statusCode(200)
				// To Extract response as String
				.extract().response().asString();
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerLookupTest3();

	}
}
	

