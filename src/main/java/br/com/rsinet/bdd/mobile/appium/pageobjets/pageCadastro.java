package br.com.rsinet.bdd.mobile.appium.pageobjets;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rsinet.bdd.mobile.appium.gerenciador.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class pageCadastro {

	public WebElement element;
	public WebDriver driver;

	public WebElement menu(WebDriver driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
		return element;
	}

	public WebElement login(WebDriver driver) {
		element = driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutLogin"));
		return element;
	}

	public WebElement cadastrar(WebDriver driver) {
		element = driver.findElement(By.id(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout"));
		return element;
	}

	public WebElement username(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement email(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement passaword(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement passaworconfirm(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement firtname(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement lastname(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement phonenumber(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement country(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement state(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement address(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement city(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement zip(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement term1(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement term2(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public WebElement register(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
		return element;
	}

	public  WebElement enter(WebDriver driver) {
		element =  driver.findElement(By.xpath(""));
		return element;
	}

	public void Enter() throws MalformedURLException {
		(new TouchAction(DriverFactory.InicializaDriver())).tap(PointOption.point(989, 1701)).perform();
	}

}
