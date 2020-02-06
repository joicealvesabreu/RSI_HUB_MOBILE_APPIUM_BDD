
package br.com.rsinet.bdd.mobile.appium.steps;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;

import br.com.rsinet.bdd.mobile.appium.pageobjets.DriverFactory;
import br.com.rsinet.bdd.mobile.appium.pageobjets.PagePesquisaPorLupa;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class stepPesquisaPorLupa {
	
	public PagePesquisaPorLupa lupa;

	public AndroidDriver<MobileElement>driver;
	
	public stepPesquisaPorLupa() throws MalformedURLException{
		driver =DriverFactory.InicializaDriver();
		lupa =PageFactory.initElements(driver, PagePesquisaPorLupa.class);
	}

	@Dado("^que eu esteja na aplicacao$")
	public void que_eu_esteja_na_aplicacao() throws Throwable {
	
	}

	@Quando("^eu escrevar o nome do produto$")
	public void eu_escrevar_o_nome_do_produto() throws Throwable {
		lupa.Search();
	}

	@Quando("^eu clicar na pesquisar$")
	public void eu_clicar_na_pesquisar() throws Throwable {
		lupa.Lupa();
	}

	@Quando("^clicar no produto$")
	public void clicar_no_produto() throws Throwable {
		lupa.Produto();;
	}

	@Quando("^eu adicioanar no carinho$")
	public void eu_adicioanar_no_carinho() throws Throwable {
		lupa.Carinho();
	}

	@Entao("^serei direcionado a tela de login para cadastro$")
	public void serei_direcionado_a_tela_de_login_para_cadastro() throws Throwable {
		String chegounologin = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"))
				.getText();
		Assert.assertTrue(chegounologin.contains("Login"));
		Reporter.addStepLog("O produto foi encontra");
	}

	@Entao("^tera a mensagem que nao existe o produto pesquisado$")
	public void tera_a_mensagem_que_nao_existe_o_produto_pesquisado() throws Throwable {
		boolean naoExisteesseproduto = driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow"))
				.isDisplayed();
		Assert.assertTrue(naoExisteesseproduto);
		System.out.println(naoExisteesseproduto);
		Reporter.addStepLog("O produto não existe resultado");
	}

}
