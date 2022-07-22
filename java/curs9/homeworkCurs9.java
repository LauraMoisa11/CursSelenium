package curs9;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homeworkCurs9 {
	
WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro/");	
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void tagLocator() throws InterruptedException {
		
		WebElement book = driver.findElement(By.linkText("The forest"));
		List<WebElement> tabLocator = driver.findElements(By.cssSelector("li[class*='sc_tabs_title']") );
		for (int i = 0; i < tabLocator.size(); i++) {
			
			Thread.sleep(2000);
			tabLocator.get(i).click();
			book = driver.findElement(By.linkText("The forest"));
			assertTrue(book.isDisplayed());
		}
		book.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
		
	}

	}

