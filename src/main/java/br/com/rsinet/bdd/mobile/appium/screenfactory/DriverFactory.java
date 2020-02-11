package br.com.rsinet.bdd.mobile.appium.screenfactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

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
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "120");
			capabilities.setCapability("unicodeKeyboard", true);
			capabilities.setCapability("resetKeyboard", true);
		
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		}catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
