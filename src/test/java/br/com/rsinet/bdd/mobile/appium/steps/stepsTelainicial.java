package br.com.rsinet.bdd.mobile.appium.steps;




import br.com.rsinet.bdd.mobile.appium.pageobjets.DriverFactory;

import br.com.rsinet.bdd.mobile.appium.pageobjets.PageAdvantage;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class stepsTelainicial {

	public PageAdvantage principal;

	public AndroidDriver<MobileElement>driver;


	@Dado("^que eu estiver na aplicacao$")
	public void que_eu_estiver_na_aplicacao() throws Throwable {
		
		driver =DriverFactory.getDriver();
	}

	@Quando("^cliclar e escolher o produto$")
	public void cliclar_e_escolher_o_produto() throws Throwable {
		principal.ClicarLaptop().click();
	}

	@Quando("^Adicionar no carinho$")
	public void adicionar_no_carinho() throws Throwable {

	}

	@Entao("^serei direcionado a tela de login$")
	public void serei_direcionado_a_tela_de_login() throws Throwable {

	}

	@Dado("^que estiver na aplicacao$")
	public void que_estiver_na_aplicacao() throws Throwable {

	}

	@Quando("^eu clicar na imagem$")
	public void eu_clicar_na_imagem() throws Throwable {

	}

	@Entao("^sere direcionado a tela de produto incorreto$")
	public void sere_direcionado_a_tela_de_produto_incorreto() throws Throwable {

	}

	@After
	public void encerra() {
		
	driver=DriverFactory.FechandoDriver();
	}
}
