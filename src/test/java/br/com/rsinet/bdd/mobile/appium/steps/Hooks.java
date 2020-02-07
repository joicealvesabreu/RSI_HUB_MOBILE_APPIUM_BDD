package br.com.rsinet.bdd.mobile.appium.steps;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.bdd.mobile.appium.screenfactory.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {

	public AndroidDriver<MobileElement> driver;
	public ExtentReports extent;
	public ExtentTest logger;
	public Reporter report;
	
	public void hooks() {
		
		this.driver = driver;

	}
	

	@After(order =0)
	public void finaliza() {

		driver = DriverFactory.FechandoDriver();
	}

	@After(order = 1)
	public void finalizarreport(Scenario scenario) {

		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
			File sourcePath = ((TakesScreenshot) DriverFactory.InicializaDriver())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(
					System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);
			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
		}
	
	}
}
