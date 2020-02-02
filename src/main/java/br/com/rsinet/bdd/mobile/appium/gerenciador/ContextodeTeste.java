package br.com.rsinet.bdd.mobile.appium.gerenciador;

import java.net.MalformedURLException;

public class ContextodeTeste {
	
    private  DriverFactory webDriverManager;
    private PageObjectManager pageObjectManager;
    
    
    public ContextodeTeste() throws MalformedURLException{
        webDriverManager = new DriverFactory();
        pageObjectManager = new PageObjectManager(webDriverManager.InicializaDriver());    
    }
    
    public  DriverFactory getWebDriverManager() {
        return webDriverManager;
    }
    
    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

}
