	package io.cucumber.vanessa.servicos;
			
	
import io.cucumber.vanessa.configuracao.Configuracao;
import static org.junit.Assert.assertTrue;
	
	import io.cucumber.java.pt.*;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	
	import org.openqa.selenium.support.ui.Select;
		public class AcessoSite3 {
			
			@Dado("que eu estou na aba Product Data do formulario")
		    public void que_eu_estou_na_aba_Product_Data_do_formulario() {
			
	          WebElement input = Configuracao.browser.findElement(By.cssSelector("#startdate"));
	          input.sendKeys("05/05/2021");
	
	          Configuracao.browser.findElement(By.cssSelector("#insurancesum>option:nth-child(2)"));
	          assertTrue(input.isDisplayed());
	          input.click();
	
	          Select meritrating = new Select(Configuracao.browser.findElement(By.name("Merit Rating")));
	          meritrating.selectByVisibleText("Bonus 2");
	
	          Select damageinsurance = new Select(Configuracao.browser.findElement(By.name("Damage Insurance")));
	          damageinsurance.selectByVisibleText("No Coverage");
	
	          Configuracao.browser.findElement(By.cssSelector("#insurance-form>div>section:nth-child(3)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(1)>span")).click();
	
	          Select courtesycar = new Select(Configuracao.browser.findElement(By.name("Courtesy Car")));
	          courtesycar.selectByVisibleText("No");
	   }
	    
			@Entao("clico no botao PriceOption")
		    public void clico_no_botao_PriceOption() throws InterruptedException {
				Thread.sleep(2000);		
	            Configuracao.browser.findElement(By.cssSelector("#preventerinsurancedata")).click();
	  }
	}

		
	
