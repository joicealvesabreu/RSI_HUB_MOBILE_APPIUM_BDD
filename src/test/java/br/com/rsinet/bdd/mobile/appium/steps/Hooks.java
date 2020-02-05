package br.com.rsinet.bdd.mobile.appium.steps;

import java.net.MalformedURLException;

import br.com.rsinet.bdd.mobile.appium.pageobjets.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {
	
	public AndroidDriver<MobileElement>driver;
	
	@Before
	public void Inicializa() throws MalformedURLException {
		driver = DriverFactory.InicializaDriver();
	}

	@After
	public void finaliza() {
		driver = DriverFactory.FechandoDriver();
	}
}
