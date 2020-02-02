package br.com.rsinet.bdd.mobile.appium.gerenciador;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.bdd.mobile.appium.pageobjets.PageAdvantage;
import br.com.rsinet.bdd.mobile.appium.pageobjets.PagePesquisaPorMassa;
import br.com.rsinet.bdd.mobile.appium.pageobjets.pageCadastro;

public class PageObjectManager {

	private WebDriver driver;

	private PagePesquisaPorMassa massadedados;

	private pageCadastro cadastro;

	private PageAdvantage telaprincipal;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public pageCadastro getCadastrarPage() {

		return (cadastro == null) ? cadastro = new pageCadastro () : cadastro;

	}

	public PageAdvantage getBuscaProdutoPage() {

		return (telaprincipal == null) ? telaprincipal = new PageAdvantage() : telaprincipal;

	}

	public PagePesquisaPorMassa  getMassadedadosPage() {

		return (massadedados == null) ? massadedados = new PagePesquisaPorMassa() : massadedados;

	}
}
