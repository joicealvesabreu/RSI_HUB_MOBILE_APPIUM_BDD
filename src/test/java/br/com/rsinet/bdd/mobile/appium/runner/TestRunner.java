package br.com.rsinet.bdd.mobile.appium.runner;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature",
glue = { "br.com.rsinet.bdd.mobile.appium.steps" }, 
tags = {"@telainicial1, @telainicial2 "}

)

public class TestRunner {

	
	 
}
