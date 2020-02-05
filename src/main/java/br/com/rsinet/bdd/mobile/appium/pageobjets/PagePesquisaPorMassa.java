package br.com.rsinet.bdd.mobile.appium.pageobjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PagePesquisaPorMassa {
	private AndroidDriver<?>  driver;
	private WebElement element;

	public PagePesquisaPorMassa(AndroidDriver<?> driver) {
		this.driver = driver;
	}

		
	@FindBy(how= How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
	private WebElement search;
	
	@FindBy(how= How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
	private WebElement lupa;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]/android.widget.TextView[1]")
	private WebElement escolhendolaptop;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")
	private WebElement adicionandocarinho;
	
	public void Search() {
		search.sendKeys("HP CHROMEBOOK 14");
	}
	public void Lupa() {
		lupa.click();
	}
	public void Produto() {
		escolhendolaptop.click();
	}
	public void Carinho() {
		adicionandocarinho.click();
	}
	public void SearchFalse() {
		search.sendKeys("celular");
	}
	
	
	
	

}
