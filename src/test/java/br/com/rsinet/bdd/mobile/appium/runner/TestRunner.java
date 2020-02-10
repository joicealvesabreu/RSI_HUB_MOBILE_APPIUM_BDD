package br.com.rsinet.bdd.mobile.appium.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.SnippetType;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = { "br.com.rsinet.bdd.mobile.appium.steps" },
//tags = {"@telainicial1,@telainicial1 "},
tags = {"@tag2"},
plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\joice.abreu\\Desktop\\RSI_HUB_MOBILE_APPIUM_BDD\\target\\cucumber-reports\\report.html"}, 
snippets = SnippetType.CAMELCASE, 
monochrome = true)

public class TestRunner {
	
	@AfterClass
	public static  void initReport() {
	
		Reporter.loadXMLConfig(new File("src/test/resources/config/extension-config.xml"));;
		Reporter.setSystemInfo("User Name", System.getProperty("Joice.Abreu"));
		Reporter.setSystemInfo("Time zone", System.getProperty("user.timezone"));

	}
}
