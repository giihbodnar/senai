package testeEcommerce;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Cadastro {

	public WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getenv("Driver"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:4200/");
	}

	@Test
	public void testa() {

		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("cadastro")).click();
		driver.findElement(By.id("usuario")).sendKeys("TestedeCadastro");
		driver.findElement(By.id("senha")).sendKeys("teste123");
		driver.findElement(By.id("senha")).sendKeys(Keys.ENTER);

	}

	@After
	public void fecha() {

		driver.close();

	}

}
