package br.com.rsinet.bdd.mobile.appium.screenfactory;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.bdd.mobile.appium.testdate.Excel;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ScreenCadastro {

	private WebDriver driver;
	private WebElement element;

	Excel excel = new Excel();

	public void PageCadastro(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement menu;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement login;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout")
	private WebElement cadastrar;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement username;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement eemail;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement passaword;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement passawordcomfirm;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement firtname;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement llastname;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement pphonenumber;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCountriesTitle")
	private WebElement ccountry;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
	private WebElement paisAlbania;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement sstate;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement aaddress;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement ccity;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement zzip;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/checkBoxRecieveOffers")
	private WebElement termo1;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/checkBoxAgreeConditions")
	private WebElement termo2;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement register;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement menuverificacao;

	public void Enter() throws MalformedURLException {
		(new TouchAction(DriverFactory.InicializaDriver())).tap(PointOption.point(989, 1701)).perform();
	}

	public void rolartela() throws MalformedURLException, InterruptedException {
		Thread.sleep(5000);
		(new TouchAction(DriverFactory.InicializaDriver())).press(PointOption.point(458, 1353))
				.moveTo(PointOption.point(542, 412)).release().perform();

	}

	public void rolartela1() throws MalformedURLException {
		(new TouchAction(DriverFactory.InicializaDriver())).press(PointOption.point(487, 1752))
				.moveTo(PointOption.point(504, 1025)).release().perform();

	}

	public void Menu() {
		menu.click();
	}

	public void Login() {
		login.click();
	}

	public void cadastrar() {
		cadastrar.click();
	}

	public void Username(String usuario) throws Exception {
		username.click();
		username.sendKeys(usuario); // "JGANA23"
	}

	public void Email(String email) throws InterruptedException {

		eemail.click();
		eemail.sendKeys(email);
	}

	public void Password(String password) throws InterruptedException {
		passaword.click();
		passaword.sendKeys(password);
	}

	public void Passwordconfirm(String passwordconfirm) {
		passawordcomfirm.click();
		passawordcomfirm.sendKeys(passwordconfirm);

	}

	public void Firstname(String firstname) {
		firtname.click();
		firtname.sendKeys(firstname);
	}

	public void Lastname(String lastname) {
		llastname.click();
		llastname.sendKeys(lastname);
	}

	public void Phonenumber(String phonenumber) {
		pphonenumber.click();
		pphonenumber.sendKeys(phonenumber);
	}

	public void Country(String country) {
		ccountry.click();
		paisAlbania.click();

	}

	public void State(String state) {
		sstate.click();
		sstate.sendKeys(state);
	}

	public void Address(String address) {
		aaddress.click();
		aaddress.sendKeys(address);
	}

	public void City(String city) {
		ccity.click();
		ccity.sendKeys(city);
	}

	public void Zip(String zip) {
		zzip.click();
		zzip.sendKeys(zip);
	}

	public void Termo1() {
		termo1.click();
	}

	public void Termo2() {
		termo2.click();
	}

	public void Register() {
		register.click();
	}

	public void Esperar() throws InterruptedException {
		Thread.sleep(5000);
	}

	public String usernamevericacao() {
		return menuverificacao.getText();
	}

	public String verificamsgderror() {
		return register.getText();

	}
}
