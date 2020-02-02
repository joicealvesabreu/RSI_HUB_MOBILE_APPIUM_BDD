package br.com.rsinet.bdd.mobile.appium.pageobjets;

import java.net.MalformedURLException;

import br.com.rsinet.bdd.mobile.appium.gerenciador.ContextodeTeste;
import br.com.rsinet.bdd.mobile.appium.gerenciador.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public DriverFactory driver;
	public ContextodeTeste contexto;

	public Hooks(ContextodeTeste contexto) {
		this.contexto = contexto;
	}

	@Before
	public void Inicializa() throws MalformedURLException {
		contexto.getWebDriverManager().InicializaDriver();
	}

	@After
	public void finaliza() {
		contexto.getWebDriverManager().FechandoDriver();
	}

}
