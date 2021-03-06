package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageActions.Credenciado;

public class BuscaDeCredenciado {
	
	Credenciado credenciado = new Credenciado();
	
	@Dado("que o usuario esteja na pagina busca de credenciado")
	public void que_o_usuario_esteja_na_pagina_busca_de_credenciado() {
		credenciado.abrirBrowser();
		credenciado.entrarSiteSoc();
		    
	}

	@Quando("busca por {string} na barra de pesquisa E pressiona Enter")
	public void busca_por_na_barra_de_pesquisa_E_pressiona_Enter(String busca) {
		credenciado.buscaCredenciado(busca);
	  
	}

	@Entao("deve aparecer os credenciados proximos")
	public void deve_aparecer_os_credenciados_proximos() {
		credenciado.validaResultado();
		credenciado.fecharPagina();
	}
}
