package br.com.rsinet.bdd.mobile.appium.steps;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.bdd.mobile.appium.screenfactory.DriverFactory;
import br.com.rsinet.bdd.mobile.appium.utility.Generator;
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
	public void finalizarreport(Scenario scenario) throws Exception, MalformedURLException {
		
		File screenshot = ((TakesScreenshot) DriverFactory.InicializaDriver()).getScreenshotAs(OutputType.FILE);
		String caminho = System.getProperty("user.dir") + "/cucumber-reports/screenshots/" + scenario.getName() + "-"
				+ Generator.dataHoraParaArquivo() + ".png";
		try {
			FileUtils.copyFile(screenshot, new File(caminho));
			Reporter.addScreenCaptureFromPath(caminho.toString());
		} catch (Exception e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
		}
	}
}
