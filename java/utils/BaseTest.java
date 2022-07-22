package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize(); //maximizeaza browserul
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //asteapta ca elementuls a fie prezent si trece mai departe
		driver.get("https://keybooks.ro/");	
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
