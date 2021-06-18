 package com.adactin.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.base.Base_Class;
import com.adactin.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature_file",glue="com.adactin.step_definition",
 monochrome=true,
 dryRun=false,
 strict=false,
 tags=("@SmokeTest,@SanTest"),
 plugin= {"html:Report/HTML_Report",
		 "pretty",
		 "json:Report/CucumberJSON_Report.json",
		 "com.cucumber.listener.ExtentCucumberFormatter:Reportss/ExtentReport.html"}
 )
public class Test_Runner {
	 public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().get_browser();
		driver=Base_Class.getbrowser(browser);
	}
	
	@AfterClass
	public static void tear_Down() {
		driver.close();
		

	}
		

	

	}
	

