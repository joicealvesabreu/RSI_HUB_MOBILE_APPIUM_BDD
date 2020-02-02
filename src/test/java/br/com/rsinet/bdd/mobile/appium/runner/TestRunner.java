package br.com.rsinet.bdd.mobile.appium.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/",
glue = { "steps" }

)

public class TestRunner {

	
	  @AfterClass public static void ExtentReport() { Reporter.loadXMLConfig(new
	  File("config/extension-config.xml")); Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
	  Reporter.setSystemInfo("Time zone", System.getProperty("user.timezone")); 
	  Reporter.setSystemInfo("Mobile","Android 9" ); Reporter.setSystemInfo("Selenium", "3.141.59");
	
	  }
}
