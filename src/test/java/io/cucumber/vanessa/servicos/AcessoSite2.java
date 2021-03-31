package io.cucumber.vanessa.servicos;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
	
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.vanessa.configuracao.Configuracao;

	
	public class AcessoSite2 {
	
		@Dado("que preencho o formulario, aba Insurant Data")
	public void que_preencho_o_formulario_aba_Insurant_Data(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		WebElement txtFirstName = Configuracao.browser.findElement(By.name("First Name"));
		txtFirstName.sendKeys("Maria");
	
		Configuracao.browser.findElement(By.name("Last Name")).sendKeys("Silva");
	
		Configuracao.browser.findElement(By.id("birthdate")).sendKeys("01/01/2000");
	
		Select drpCountry = new Select(Configuracao.browser.findElement(By.name("Country")));
		Thread.sleep(2000);
		drpCountry.selectByVisibleText("Brazil");
		
		Configuracao.browser.findElement(By.name("Zip Code")).sendKeys("0203");
		
		Select drpOccupation = new Select(Configuracao.browser.findElement(By.name("Occupation")));
		drpOccupation.selectByVisibleText("Employee");
		
		WebElement input = Configuracao.browser.findElement(By.cssSelector("#insurance-form>div>section:nth-child(2)>div.field.idealforms-field.idealforms-field-checkbox>p>label:nth-child(1)>span"));
		input.click();
	}
	
	    @Entao("clico botao Next")
	public void clico_botao_Next() throws InterruptedException {
		Thread.sleep(3000);
		Configuracao.browser.findElement(By.id("nextenterproductdata")).click();
	}
	    
	}
	    
	
