package io.cucumber.vanessa.servicos;

import io.cucumber.java.pt.Dado;
import io.cucumber.vanessa.configuracao.Configuracao;


public class CompartilhadoSteps {
	
	@Dado("que acesso o site {string}")
	public void que_acesso_o_site(String string) {
	    Configuracao.abrir(string);
	    
	}
	
	
		
	}

	

