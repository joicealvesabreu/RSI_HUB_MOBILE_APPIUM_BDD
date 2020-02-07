package br.com.rsinet.bdd.mobile.appium.steps;




import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;

import br.com.rsinet.bdd.mobile.appium.screenfactory.DriverFactory;
import br.com.rsinet.bdd.mobile.appium.screenfactory.ScreenTelaInicial;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class stepsTelainicial {

	public ScreenTelaInicial principal;

	public AndroidDriver<MobileElement>driver;
	
	public  stepsTelainicial() throws MalformedURLException {
		driver =DriverFactory.InicializaDriver();
		principal =PageFactory.initElements(driver, ScreenTelaInicial.class);
	}

	@Dado("^que eu estiver na aplicacao$")
	public void que_eu_estiver_na_aplicacao() throws Throwable {
	   
	}

	@Quando("^eu escolher o produto$")
	public void eu_escolher_o_produto() throws Throwable {
	 principal.ClicarLaptop();
	}

	@Quando("^Adicionar no carinho$")
	public void adicionar_no_carinho() throws Throwable {
	principal.EscolhendoLaptop();
	principal.Adicionandooproduto();
	}

	@Entao("^serei direcionado a tela de login$")
	public void serei_direcionado_a_tela_de_login() throws Throwable {
		String chegounologin = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"))
				.getText();
		Assert.assertTrue(chegounologin.contains("Login"));
		Reporter.addStepLog("O produto foi encontra");
	}

	@Entao("^serei direcionado a tela errada$")
	public void serei_direcionado_a_tela_errada() throws Throwable {
	System.out.println("chegouaqui");
	Reporter.addStepLog("O produto não existe resultado");
	}
	
	


}
