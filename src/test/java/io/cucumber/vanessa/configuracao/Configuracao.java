package io.cucumber.vanessa.configuracao;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class Configuracao {
		
	    public static WebDriver browser;
	    public static void abrir(String url){
	        
	        if(browser == null){
	        	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	            ChromeOptions options = new ChromeOptions();
	            options.addArguments("--start-maximized");
	            browser = new ChromeDriver(options);
	        }
	        
	        browser.get(url);
	    }

	    public static void fechar(){
	        browser.close();
	        browser = null;
	    }
	}


