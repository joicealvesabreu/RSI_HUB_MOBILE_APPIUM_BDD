package br.com.rsinet.bdd.mobile.appium.steps;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


import br.com.rsinet.bdd.mobile.appium.screenfactory.DriverFactory;
import br.com.rsinet.bdd.mobile.appium.screenfactory.ScreenTelaInicial;
import br.com.rsinet.bdd.mobile.appium.screenfactory.ScreenCadastro;
import br.com.rsinet.bdd.mobile.appium.testdate.Excel;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class stepCadastrodeUsusario {
	
	private ScreenCadastro cadastro;

	public AndroidDriver<MobileElement>driver;
	
	private Excel excel;
	
	public stepCadastrodeUsusario() throws MalformedURLException {
		driver =DriverFactory.InicializaDriver();
		cadastro =PageFactory.initElements(driver, ScreenCadastro.class);
		excel = new Excel();
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
		cadastro.Username(excel.sUsuario());
		cadastro.Email(excel.sEmail());
		cadastro.Password(excel.sSenha());
		cadastro.Passwordconfirm(excel.sConfirmarSenha());
		cadastro.Firstname(excel.sPrimeiroNome());
		cadastro.Lastname(excel.sUltimoNome());
		cadastro.Phonenumber(excel.sTelefone());
		cadastro.rolartela();
		cadastro.Country(excel.sPais());
		cadastro.State(excel.sEstado());
		cadastro.Address(excel.sEndereco());
		cadastro.City(excel.sCidade());
		cadastro.Zip(excel.sCep());
		cadastro.rolartela1();

	}
	@Quando("^eu clicar em registrar$")
	public void eu_clicar_em_registrar() throws Throwable {
	   cadastro.Register();
	   cadastro.Esperar();
	    
	}

	@Entao("^minha conta estar logada$")
	public void minha_conta_estar_logada() throws Throwable {
		cadastro.Esperar();
		String asserts = cadastro.usernamevericacao();
		Assert.assertTrue(asserts.contains(excel.sUsuario()));
	}

	@Entao("^aparecerar que a conta ja existe$")
	public void aparecerar_que_a_conta_ja_existe() throws Throwable {
		
		String asserts = cadastro.verificamsgderror();
		Assert.assertTrue(asserts.contains("REGISTER"));
	}
}
