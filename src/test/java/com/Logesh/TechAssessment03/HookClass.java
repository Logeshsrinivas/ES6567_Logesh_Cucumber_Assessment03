package com.Logesh.TechAssessment03;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass {
	@Before
	public void Start() {
		HelperClass.setUpDriver();
	}
	@After
	public void close(Scenario scenario) {
//		if(scenario.isFailed()) {
//			final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot,"image/png",scenario.getName());
//		}
//		HelperClass.tearDown();
	}

}
