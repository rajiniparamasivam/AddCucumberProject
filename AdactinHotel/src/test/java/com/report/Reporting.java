package com.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



import com.base.BaseClass;

import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass{

	  public static void generateJvmReport(String json) throws FileNotFoundException, IOException {
		
		  File file = new File(System.getProperty("user.dir")+"target/cucumber/Report");
		//  File file = new File("target/maven_cucumber_report");
		  
		 net.masterthought.cucumber.Configuration configuration = new net.masterthought.cucumber.Configuration(file, "AdactinHotel");

		 configuration.addClassifications("browser", "chrome");
		 configuration.addClassifications("browserVersion", "123");
		 configuration.addClassifications("os", "mac os");
		 configuration.addClassifications("sprint", "4");
		 configuration.addClassifications("Testing", "Reg");
		 
		 List<String> j = new ArrayList<>();
		 j.add(json);
		 
		 ReportBuilder builder = new ReportBuilder(j, configuration);
		 builder.generateReports();
		 
	}
}
