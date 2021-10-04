package io.restassured.kt;

import org.testng.annotations.Test;

public class TestNgBasics2 {
	
	@Test(groups = {"smoke"})
	public void MobileTest() {
		System.out.println("This is Mobile Test");
	}
	
	@Test(description = "This is Linux Test",dependsOnMethods = {"MobileTest"})
	public void LinuxTest() {
		System.out.println("This is Linux Test");
	}
	
	@Test
	public void WindowsTest() {
		System.out.println("This is Windows Test");
	}

}
