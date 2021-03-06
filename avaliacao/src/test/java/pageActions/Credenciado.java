package pageActions;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Credenciado {
	WebDriver driver;
	By filtro = By.cssSelector("#ipt-busca-credenciado-2");
	By resultados = By.cssSelector(".estrutura-resultados-mapa");
	

	public void buscaCredenciado(String busca) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(filtro));
		WebElement elemento = driver.findElement(filtro);
		wait.until(ExpectedConditions.visibilityOf(elemento));
		
		elemento.clear();
		elemento.sendKeys(busca + Keys.ENTER);
	}
	public void abrirBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		
	}
	public void entrarSiteSoc() {
		String url = " https://socnet.soc.com.br/";
	    driver.get(url);
	}
	public void validaResultado() {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(resultados));
		List<WebElement>lista = driver.findElements(resultados);
		assertTrue(lista.size() >= 1);
	}
	public void fecharPagina() {
		driver.close();
		
	}
	
}
