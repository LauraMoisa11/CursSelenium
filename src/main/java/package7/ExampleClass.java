package package7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExampleClass {
	
	@Test
	public void testCeva() {
		System.out.println("Print test!");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.google.com");	
		driver.quit();
		
	}
	
	

}
