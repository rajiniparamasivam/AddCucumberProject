package com.runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
                  glue = "com.stepdefinition",
                  dryRun = false,
                  plugin = {"pretty",
                		   "html:target/report/cucumber.html",
                		   "json:target/report/cucumber.json"
},
                  monochrome = false,
                  publish = true
		
		
		)
public class RunnerClass {

	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		
	//	Reporting.generateJvmReport(System.getProperty("user.dir")+"target/cucumber/Report.json");

	/*	 File file = new File("target/maven_cucumber_report");
		  
		 net.masterthought.cucumber.Configuration configuration = new net.masterthought.cucumber.Configuration(file, "AdactinHotel");

		 configuration.addClassifications("browser", "chrome");
		 configuration.addClassifications("browserVersion", "123");
		 configuration.addClassifications("os", "mac os");
		 configuration.addClassifications("sprint", "4");
		 configuration.addClassifications("Testing", "Reg");
		 
		 List<String> j = new ArrayList<>();
		 j.add("json:target/report/cucumber.json");
		 
		 ReportBuilder builder = new ReportBuilder(j, configuration);
		 builder.generateReports();   */
		
		File reportOutputDirectory = new File("target/maven-cucumber-report");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("target/cucumber-report/cucumber,json");
		Configuration configuration = new Configuration (reportOutputDirectory, "Sample Test Project");
		configuration.setBuildNumber ("011");
		configuration.addClassifications("Environment", "QA");
		configuration.addClassifications("Browser","Chrome");
		configuration.addClassifications("platform",System.getProperty("os.name").toUpperCase() );
		configuration.setSortingMethod(SortingMethod.NATURAL);
		configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
		configuration.setTrendsStatsFile(new File("target/test-classes/demo-trends.json"));
		ReportBuilder reportBuilder = new ReportBuilder (jsonFiles, configuration);
		reportBuilder. generateReports ();
		 
	}
}
