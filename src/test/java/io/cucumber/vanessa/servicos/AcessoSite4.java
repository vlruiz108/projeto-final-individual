package io.cucumber.vanessa.servicos;

import org.openqa.selenium.By;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.vanessa.configuracao.Configuracao;


public class AcessoSite4 {
	
	@Entao("eu clico no botao PriceOption")
	public void eu_clico_no_botao_PriceOption() {
		Configuracao.browser.findElement(By.cssSelector("#selectsilver")).click();
	    
	}

	@Dado("clico no botao Select Option")
	public void clico_no_botao_Select_Option() throws InterruptedException {
		Thread.sleep(2000);
	    Configuracao.browser.findElement(By.cssSelector("#nextsendquote")).click();
	}

	
}
	
	
