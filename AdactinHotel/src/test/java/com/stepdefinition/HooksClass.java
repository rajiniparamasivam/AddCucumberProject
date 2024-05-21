package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass{

	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		
		getDrivers(getPropertyFileValue("browser"));
		openUrl(getPropertyFileValue("url"));
		maximizeWindow();
		
		

	}
	
	@After
	public void afterScenario(Scenario scenario) {
		
		boolean failed = scenario.isFailed();
		if (failed) {
			scenario.attach(screenShot(),"img/png", "Take a Failed Screenshot ");
		}
		
		
		
		 quitWindow();

	}
}
