package com.wkhealth.reusable.resources;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class ReusableFunctions {
	
	public static String dir = System.getProperty("user.dir");
	
	//Function to return JsonPath (like X-path) to navigate json
	public static JsonPath jsonParser(String response) {
			JsonPath js = new JsonPath (response);
			return js;
		}
	
	//Function to return string from json for body, where json is in a file
	public static String generateStringfromJsonFile(File file) throws IOException {
		return new String(Files.readAllBytes(Paths.get(file.toURI())));
	}
	
	public RequestSpecification getRequestSpecification(String serviceName, String fileName) throws IOException {
		RequestSpecification reqSpec=null;		
				try {				
					//create folder for request response if not already exist CancelSubscription
					   String PATH = dir+"/reports/RequestResponse_logs/";
					    String directoryName = PATH.concat(serviceName);
					    File directory = new File(directoryName);
					    if (! directory.exists()){
					        directory.mkdir();
					    }
					 //Hardcoded Base URl   
					PrintStream log = new PrintStream(new FileOutputStream(dir+"//reports//RequestResponse_logs//"+serviceName+"//"+fileName));				
					reqSpec = new RequestSpecBuilder().setBaseUri("https://stg-extnahlt.cdn.wkgbssvcs.com").
					addFilter(RequestLoggingFilter.logRequestTo(log)).
					addFilter(ResponseLoggingFilter.logResponseTo(log)).
					setContentType(ContentType.JSON).build();
					//testNumber = testNumber+1;
				} catch (IOException e) {
					e.printStackTrace();
				}
		return reqSpec;
	}

}
