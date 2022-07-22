package curs8;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumLocators {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize(); //maximizeaza browserul
		driver.get("https://keybooks.ro/");	
		
	}
	
	@Test
	public void login() throws InterruptedException {
		
		driver.findElement(By.className("menu_user_login")).click();
		driver.findElement(By.id("log")).sendKeys("TestUser");
		driver.findElement(By.id("password")).sendKeys("12345@67890");
		driver.findElement(By.className("submit_button")).click();
		Thread.sleep(4000);//opreste executia putin
		
		//driver.findElement(ByclassName("user_name)).isDisplayed();
		//WebEleemnt--> driver.findElement(By.className("user_name"))
		//isDisplayed()--> metoda selenium care verifica daca un element este prezent sau nu:
		//intoarce true-->assertTrue()
		
		WebElement userName = driver.findElement(By.className("user_name"));
		assertTrue(userName.isDisplayed());
		
		//<span class="user_name">Test User</span>
		
		String userLogat = userName.getText();
		System.out.println(userLogat);
		
		assertEquals(userName.getText(), "Test User");
		//assertEquals(userLogat.getText(), "Test User");
		
		//assertTrue.driver.findElement(By.className("user_name2")).isDisplayed());
		assertTrue(driver.findElement(By.className("user_name")).isDisplayed());
		
				
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
