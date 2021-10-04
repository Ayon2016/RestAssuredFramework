package com.wkhealth.reusable.resources;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportNG {
	
	//Writing a method to retrieve the Extent Report Object
	public static ExtentReports getExtent() {
		//Define a path
		String path = System.getProperty("user.dir")+"\\reports\\ExecutionResults.html";
		//Your actual physical Report
		File file = new File(path);
		//Define reporter Object, file level changes
		ExtentSparkReporter reporter = new ExtentSparkReporter(file);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Rest Assured KT");
		reporter.config().setDocumentTitle("Rest Assured KT");
		//Attach extent Report
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
	}

}
