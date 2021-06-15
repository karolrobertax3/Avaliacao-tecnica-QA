package config;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SOC {
	String url;
	WebDriver driver;

	@Before
	public void iniciar() {
		url = " https://ww2.soc.com.br/blog/";

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

	}

	@After
	public void finalizar() {
		driver.quit();
	}

	@Test
	public void abrirPagina() {
		driver.get(url);
		assertEquals("https://ww2.soc.com.br/blog/.", driver.getCurrentUrl());
	}

}

