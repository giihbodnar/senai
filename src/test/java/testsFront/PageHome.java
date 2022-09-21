package testsFront;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class PageHome {

	public WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getenv("Driver"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.sp.senai.br/");
	}

	@Test
	public void Testa() {
	
		driver.findElement(By.className("sub")).click();
		driver.findElement(By.id("MenuLateral_rptMenuEscola_rptSubMenu_1_lnkSubMenu_2")).click();
		driver.findElement(By.id("curso-01_lnkEscolaBtn")).click();

	}

	@After
	public void fecha() {

		driver.close();

	}

}
