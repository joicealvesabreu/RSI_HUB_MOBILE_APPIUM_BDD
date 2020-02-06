package br.com.rsinet.bdd.mobile.appium.steps;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import br.com.rsinet.bdd.mobile.appium.pageobjets.DriverFactory;
import br.com.rsinet.bdd.mobile.appium.pageobjets.PageAdvantage;
import br.com.rsinet.bdd.mobile.appium.pageobjets.PageCadastro;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class stepCadastrodeUsusario {
	
	public PageCadastro cadastro;

	public AndroidDriver<MobileElement>driver;
	
	public stepCadastrodeUsusario() throws MalformedURLException {
		driver =DriverFactory.InicializaDriver();
		cadastro =PageFactory.initElements(driver, PageCadastro.class);
	}

	
	@Dado("^que eu estiver na app$")
	public void que_eu_estiver_na_app() throws Throwable {
		cadastro.Menu();
	}

	@Quando("^selecionar a opcao login$")
	public void selecionar_a_opcao_login() throws Throwable {
		cadastro.Login();
	}

	@Quando("^clicar em nova conta$")
	public void clicar_em_nova_conta() throws Throwable {
		cadastro.cadastrar();
	}

	@Quando("^eu preencher o formulario$")
	public void eu_preencher_o_formulario() throws Throwable {
		cadastro.Username();
		cadastro.Email();
		cadastro.Password();
		cadastro.Passwordconfirm();
		cadastro.Firstname();
		cadastro.Lastname();
		cadastro.Phonenumber();
		cadastro.rolartela();
		cadastro.Country();
		cadastro.State();
		cadastro.Address();
		cadastro.City();
		cadastro.Zip();
		cadastro.rolartela1();

	}
	@Quando("^eu clicar em registrar$")
	public void eu_clicar_em_registrar() throws Throwable {
	   cadastro.Register();
	    
	}

	@Entao("^minha conta estar logada$")
	public void minha_conta_estar_logada() throws Throwable {
		cadastro.Esperar();
		String asserts = driver.findElement(By.id("com.Advantage.aShopping:id/textViewAdvantage")).getText();
		Assert.assertTrue(asserts.contains("Advantage"), "Advantage");
	}

	@Entao("^aparecerar que a conta ja existe$")
	public void aparecerar_que_a_conta_ja_existe() throws Throwable {
		cadastro.Esperar();
		String asserts = driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister")).getText();
		Assert.assertTrue(asserts.contains("REGISTER"), "REGISTER");
	}
}
