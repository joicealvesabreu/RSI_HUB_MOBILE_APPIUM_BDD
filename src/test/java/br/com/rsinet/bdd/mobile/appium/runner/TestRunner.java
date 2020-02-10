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
tags = {"@telainicial1"},

plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
monochrome = true)

public class TestRunner {
	
	@AfterClass
	public static  void initReport() {
	
		Reporter.loadXMLConfig(new File("src/test/resources/config/extension-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("Joice.Abreu"));
	
	}
}
