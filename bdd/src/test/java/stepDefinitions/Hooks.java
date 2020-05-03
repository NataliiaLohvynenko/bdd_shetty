package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driverFactory.BaseTest;

import java.io.IOException;

public class Hooks extends BaseTest {

	public Hooks() throws IOException {
	}

	@Before("@MibileTest")
	public void beforeValidation() {
		System.out.println("before Mobile hook");
	}
	
	@After("@SmokeTest")
	public void AfterSmokeTestValidation() {
		System.out.println("after @SmokeTest hook");
	}
	
	
	@Before("@SmokeTest")
	public void beforeSmokeTestValidation() {
		System.out.println("before@SmokeTest hook");
	}
	
	@After("@MibileTest")
	public void AfterValidation() {
		System.out.println("after Mobile hook");
	}

	@After("@SeleniumTest1, @SeleniumTest2")
	public void closeBrowser(){
		driver.quit();
	}
	

}
