package pageActions;


import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Blog {
 WebDriver driver; 
 
 By inputBusca = By.cssSelector("section.elementor-element-1b0845e input.elementor-search-form__input");

 
 
public void buscarCategoria(String categoria) {
	
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(inputBusca));
	WebElement elemento = driver.findElement(inputBusca);
	wait.until(ExpectedConditions.visibilityOf(elemento));
	
	elemento.clear();
	elemento.sendKeys(categoria + Keys.ENTER);
}

public void abrirBrowser() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
	
}

public void entrarSite() {
	String url = " https://ww2.soc.com.br/blog/";
    driver.get(url);
}

public void fecharPagina() {
	driver.close();
	
}

public void validaPesquisa() {
	assertTrue(driver.getCurrentUrl().contains("saude"));
	
}

}
