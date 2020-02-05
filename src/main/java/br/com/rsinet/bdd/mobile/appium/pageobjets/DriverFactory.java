package br.com.rsinet.bdd.mobile.appium.pageobjets;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> InicializaDriver() throws MalformedURLException {

		if (driver == null) {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "JoiceAbreu");
			capabilities.setCapability("platformVersion", "9");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", "com.Advantage.aShopping");
			capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
			capabilities.setCapability("unicodeKeyboard", true);
			capabilities.setCapability("resetKeyboard", true);
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
		return driver;

	}

	public static AndroidDriver<MobileElement> FechandoDriver() {
		if (driver != null) {
			driver.quit();
		}
		return driver = null;
	}

}
