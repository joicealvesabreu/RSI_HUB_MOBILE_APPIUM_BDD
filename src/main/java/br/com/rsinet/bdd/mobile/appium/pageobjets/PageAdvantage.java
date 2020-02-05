package br.com.rsinet.bdd.mobile.appium.pageobjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageAdvantage {

	public WebDriver driver;
	

	public void PageAdvance(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement ClicarLaptop() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView"));

	}

	public WebElement EscolhendoLaptop() {
		return driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]/android.widget.TextView[1]"));

	}

	public WebElement Adicionandooproduto() {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button"));

	}
}
