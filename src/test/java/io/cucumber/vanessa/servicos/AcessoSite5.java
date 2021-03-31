package io.cucumber.vanessa.servicos;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.vanessa.configuracao.Configuracao;


public class AcessoSite5 {
	
	@Dado("preencho os campos com os valores do produto")
	public void preencho_os_campos_com_os_valores_do_produto(io.cucumber.datatable.DataTable dataTable) {
		 Configuracao.browser.findElement(By.id("email")).sendKeys("teste@tes.com");
		 Configuracao.browser.findElement(By.id("phone")).sendKeys("1234567");
		 Configuracao.browser.findElement(By.id("username")).sendKeys("Maria");
		 Configuracao.browser.findElement(By.id("password")).sendKeys("12345");
		 Configuracao.browser.findElement(By.id("confirmpassword")).sendKeys("12345");

		 Configuracao.browser.findElement(By.id("Comments")).sendKeys("comments");
		  }

	@Entao("clico no botao send de quote")
	public void clico_no_botao_send_de_quote() throws InterruptedException {
		Thread.sleep(3000);
		Configuracao.browser.findElement(By.id("#sendemail")).click();
	}
	
	

}
