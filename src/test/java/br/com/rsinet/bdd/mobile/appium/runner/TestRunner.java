package br.com.rsinet.bdd.mobile.appium.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = { "br.com.rsinet.bdd.mobile.appium.steps" },
//tags = {"@telainicial1,@telainicial1 "},
tags = {"@tag2"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" }, 
monochrome = true)

public class TestRunner {
	
	@AfterClass
	public static void ExtentReport() {
	
		Reporter.loadXMLConfig(new File("C:\\Users\\joice.abreu\\Desktop\\RSI_HUB_MOBILE_APPIUM_BDD\\config\\extension-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("Joice.Abreu"));
		Reporter.setSystemInfo("Time zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("cucumber-java", "1.2.5");
		Reporter.setSystemInfo("cucumber-junit", "1.2.5");
		Reporter.setSystemInfo("Maven", "4.0.0");

	}
}
