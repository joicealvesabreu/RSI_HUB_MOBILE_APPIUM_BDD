package br.com.rsinet.bdd.mobile.appium.pageobjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class PagePesquisaPorLupa {
	private WebDriver driver;
	private WebElement element;
	

	public void PagePesquisaPorMassa(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(how= How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
	@FindBy(how= How.ID, using ="com.Advantage.aShopping:id/editTextSearch")
	private WebElement search;
	
	@FindBy(how= How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
	private WebElement lupa;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]/android.widget.TextView[1]")
	private WebElement escolhendolaptop;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")
	private WebElement adicionandocarinho;
	
	public void Search() throws Throwable {
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
