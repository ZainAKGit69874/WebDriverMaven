import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;

	@BeforeSuite
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
	}

	@Test
	public void doLogin() {
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("zainahmadkhan99@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("sddsf");
		driver.findElement(By.xpath("//input[@name = 'zain']"));
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}

}
