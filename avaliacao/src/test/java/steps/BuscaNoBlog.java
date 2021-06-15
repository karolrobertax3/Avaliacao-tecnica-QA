package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageActions.Blog;


public class BuscaNoBlog {
	String url;
	WebDriver driver;
	
	
	Blog blog= new Blog();
	
	@Dado("que o usuario que esteja no site soc tenha clicado no botao de pesquisa")
	public void que_o_usuario_que_esteja_no_site_soc_tenha_clicado_no_botao_de_pesquisa() {
		blog.abrirBrowser();
		blog.entrarSite();
		
	}
	
	@Quando("busca por uma categoria saude na barra de pesquisa E pressiona Enter")
	public void busca_por_uma_categoria_na_barra_de_pesquisa_e_pressiona_enter() {
	   blog.buscarCategoria("saude");
	}

	@Entao("deve aparecer os resultados relacionados com a pesquisa")
	public void deve_aparecer_os_resultados_relacionados_com_a_pesquisa() {
		blog.validaPesquisa();
		blog.fecharPagina();
	  
	  
	}


}
