package br.com.rsinet.bdd.mobile.appium.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.bdd.mobile.appium.pageobjets.DriverFactory;
import br.com.rsinet.bdd.mobile.appium.pageobjets.pageCadastro;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class stepsPesquisaBarradDados {

	public AndroidDriver driver;
	public pageCadastro cadastro;
	
	@Dado("^que eu esteja na aplicacao$")
	public void que_eu_esteja_na_aplicacao() throws Throwable {
		driver= DriverFactory.InicializaDriver();
		cadastro=PageFactory.initElements(driver, pageCadastro.class);
	}

	@Quando("^eu escrevar o nome do produto$")
	public void eu_escrevar_o_nome_do_produto() throws Throwable {
	cadastro.menu();
	}

	@Quando("^eu clicar na pesquisar$")
	public void eu_clicar_na_pesquisar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^clicar no produto$")
	public void clicar_no_produto() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^eu adicioanar no carinho$")
	public void eu_adicioanar_no_carinho() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^serei direcionado a tela de login para cadastro$")
	public void serei_direcionado_a_tela_de_login_para_cadastro() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^eu escrever o nome do produto  que nao existe$")
	public void eu_escrever_o_nome_do_produto_que_nao_existe() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^clicar na barra de pesquisa$")
	public void clicar_na_barra_de_pesquisa() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^tera a mensagem que nao existe o produto pesquisado$")
	public void tera_a_mensagem_que_nao_existe_o_produto_pesquisado() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
