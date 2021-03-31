package io.cucumber.vanessa.servicos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.vanessa.configuracao.Configuracao;


public class AcessoSiteSteps {
	
	@Dado("preencho o formulario, aba {string}")
	public void preencho_o_formulario_aba(String string, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		WebElement elem = Configuracao.browser.findElement(By.xpath("//select[@id='make']"));
		Select select = new Select(elem);
		select.selectByIndex(2);
		Configuracao.browser.findElement(By.cssSelector("#model")).click();
		Configuracao.browser.findElement(By.cssSelector("#model>option:nth-child(2)")).click();
		
		WebElement txtFirstName = Configuracao.browser.findElement(By.name("Cylinder Capacity"));
		txtFirstName.sendKeys("123");
		
		Configuracao.browser.findElement(By.name("[kW]")).sendKeys("123");
		
		Configuracao.browser.findElement(By.cssSelector("button#opendateofmanufacturecalender")).click();
		Thread.sleep(3000);
		Configuracao.browser.findElement(By.cssSelector(".ui-state-default.ui-state-hover")).click();
		
		Configuracao.browser.findElement(By.cssSelector("#numberofseats")).click();
		Configuracao.browser.findElement(By.cssSelector("select#numberofseats > option[value='4']")).click();
		Configuracao.browser.findElement(By.cssSelector("#numberofseats")).click();
		
		Configuracao.browser.findElement(By.cssSelector("#numberofseatsmotorcycle")).click();
		Configuracao.browser.findElement(By.cssSelector("#numberofseatsmotorcycle > option[value='3']")).click();
		Configuracao.browser.findElement(By.cssSelector("#numberofseatsmotorcycle")).click();
		Configuracao.browser.findElement(By.cssSelector("#fuel")).click();
		Configuracao.browser.findElement(By.cssSelector("#fuel option:nth-child(4)")).click();
		Configuracao.browser.findElement(By.cssSelector("#payload")).sendKeys("1000");
		Configuracao.browser.findElement(By.cssSelector("#totalweight")).sendKeys("1000");
		Configuracao.browser.findElement(By.cssSelector("#licenseplatenumber")).sendKeys("1000");
		Configuracao.browser.findElement(By.cssSelector("#listprice")).sendKeys("800");
		Configuracao.browser.findElement(By.cssSelector("#licenseplatenumber")).sendKeys("vlz108");
		Configuracao.browser.findElement(By.cssSelector("#annualmileage")).sendKeys("400");	
	}
	@Entao("clico no botao Next")
	public void clico_no_botao_Next() throws InterruptedException {
		Thread.sleep(3000);
		Configuracao.browser.findElement(By.id("nextenterinsurantdata")).click();
	}
	
		
	}
	
	
	

