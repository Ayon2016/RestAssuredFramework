package io.restassured.kt;

import java.util.Arrays;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wkhealth.reusable.resources.ReusableFunctions;

import freemarker.template._TemplateAPI;


public class TestNgBasics {
	
	@BeforeTest ()
	public static void beforeTest() {
		System.out.println("This is Before Test");
	}
	
	@BeforeMethod ()
	public static void beforeMethod() {
		System.out.println("This is Before Method");
	}
	
	@Parameters({"URL"})
	@Test(description="Verify that a placeOrder Transactions from MOZU-LWW is successful")
	public static void Test1(String url) {
		System.out.println("This is my Test 1");
	}
	
	@Test(dependsOnMethods = "Test1")
	public static void MangoTest2() {
		System.out.println("This is my Test 2");
	}
	
	@Test()
	public static void Test3() {
		System.out.println("This is my Test 3");
	}
	
	@AfterMethod ()
	public static void afterMethod() {
		System.out.println("This is after Method");
	}
	
	@AfterTest ()
	public static void afterTest() {
		System.out.println("This is After Test");
	}
	
	@AfterTest ()
	public static void afterTest2() {
		System.out.println("This is After Test");
	}

}
