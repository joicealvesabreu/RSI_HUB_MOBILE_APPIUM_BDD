package br.com.rsinet.bdd.mobile.appium.runner;



import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/Features",
	glue = {"br.com.rsinet.bdd.mobile.appium.steps"},
	//tags= {"@Cadastro1","@Cadastro2"+"@cenario1","@cenario2"+"@Telainicial1", "@TelaInicial2"},
	plugin = {"com.cucumber.listener.ExtentCucumberFormatter:relatorio/report.html"},
	monochrome = true, 
	snippets = SnippetType.CAMELCASE
	 )
	public class TestRunner {
	
		@AfterClass
		public static void  ExtentReport() {
			Reporter.loadXMLConfig(new File("config/extension-config.xml"));
			Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
			Reporter.setSystemInfo("Time zone", System.getProperty("user.timezone"));
			Reporter.setSystemInfo("Mobile", "Android 9" );
			Reporter.setSystemInfo("Selenium", "3.141.59");
			Reporter.setSystemInfo("cucumber-java", "1.2.5");
			Reporter.setSystemInfo("cucumber-junit", "1.2.5");
			Reporter.setSystemInfo("Maven", "4.0.0");
		    
		}
}
