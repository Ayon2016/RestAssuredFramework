package com.wkhealth.reusable.resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener{
	
	ExtentReports extent = null;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		// Creating a test line on the report before @Test starts
		test = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case: "+result.getMethod().getMethodName()+" has Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.FAIL, "Test Case: "+result.getMethod().getMethodName()+" has Failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		extent = ExtentReportNG.getExtent();
	}

	public void onFinish(ITestContext context) {
		extent.flush();	
	}
}
