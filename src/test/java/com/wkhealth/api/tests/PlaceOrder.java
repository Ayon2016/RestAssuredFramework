package com.wkhealth.api.tests;

import org.testng.annotations.Test;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.wkhealth.reusable.resources.ExtentReportNG;
import com.wkhealth.reusable.resources.ReusableFunctions;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.io.File;
import java.io.IOException;

public class PlaceOrder extends ReusableFunctions {
	public static RequestSpecification request;
	
	@Test 
	public void placeOrderTestthroughFile() throws IOException {
		
		String response;
		JSONParser jsonParser = new JSONParser();
		Object object;
		try {
			File dir = new File("C:\\Users\\Ayon.Choudhury\\RestAssuredKT\\src\\main\\java\\com\\wkhealth\\requestfiles");
				for(File file : dir.listFiles()) {
					//Logging File Name
					System.out.println("Data from File " + file.getName());
					//Parsing the String to replace uuid to uuid_retry
					String jsonStr = ReusableFunctions.generateStringfromJsonFile(file);
					object = jsonParser.parse(jsonStr);
					JSONObject jsonObject = (JSONObject) object;
					JSONObject customerLookupRequest = (JSONObject) jsonObject.get("customerLookupRequest");
					JSONObject uuidMetaDataRequest = (JSONObject) customerLookupRequest.get("uuidMetaDataRequest");
					String uuidString = (String) uuidMetaDataRequest.get("uuid");
					uuidMetaDataRequest.remove("uuid");
					uuidMetaDataRequest.put("uuid", uuidString+"_Retry");
					
					//Request
					request = given().spec(getRequestSpecification("placeOrder",file.getName())).body(jsonObject);
					//given().log().all().header("Content-Type", "application/json").body(ReusableFunctions.generateStringfromJsonFile(file))
					
					//Response + 200 OK
					response = request.when().post("/Health/Services/CustomerServices/CustomerLookup/V2.0").
							   then().log().all().assertThat().
							   //Validate Header
							   header("X-Original-HTTP-Status-Code", "200").extract().response().asString();
					// For Parsing Json
					JsonPath js = ReusableFunctions.jsonParser(response);
					String status = js.getString("customerLookupResponse.customerLookupResponseInfo.status");
					
					//Asserting Status
					Assert.assertEquals("OK", status);
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
	}

}
