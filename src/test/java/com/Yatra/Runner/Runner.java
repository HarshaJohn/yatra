package com.Yatra.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Yatra.BaseClass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Yatra//Feature//Yatra.Feature", 
glue = "com\\Yatra\\Stepdefinition",
plugin = {"pretty", "html:Report", "com.cucumber.listener.ExtentCucumberFormatter:Report//extentReport.html",
		//"rerun: Report//failedtestcase.txt",
		"json:target//cucumber-reports//CucumberTestReport.json"}, 

monochrome = false, 
dryRun = false, 
strict = true)
 

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver=BaseClass.browserLaunch("chrome");
	}
	
	
	@AfterClass
	public static void tearDown()  {
		//BaseClass.close();
	}

}

