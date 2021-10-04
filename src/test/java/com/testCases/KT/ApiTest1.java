package com.testCases.KT;

import static io.restassured.RestAssured.*;

import com.aventstack.extentreports.gherkin.model.Then;

import io.restassured.RestAssured;

public class ApiTest1 {
	
	//BaseURI
	//Resource
	//Parameters (Query Parameters, Path Parameters)
	//Headers, Cookies
	//https://BaseLibrary/Row1/Clomun2/?book=myexpwithtruth
	
	public static void main(String[] args) {
		RestAssured.baseURI = "https://stg-extnahlt.cdn.wkgbssvcs.com";
		
		//given(), when(), then()
		//given you have a baseURI, and a header, and cookie; when you make a POST API call, then your response status = 200
			
	}

}
