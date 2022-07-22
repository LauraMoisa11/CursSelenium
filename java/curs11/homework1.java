package curs11;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utils.BaseTest;

public class homework1 extends BaseTest {
	
	@Test(priority = 0)
	public void author() throws InterruptedException {
		driver.findElement(By.linkText("Storm")).click();
		Thread.sleep(3000);
	} 
	@Test(priority = 1)
	
	public void scrollDown() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500) ");
		Thread.sleep(3000);
		
		WebElement review = driver.findElement(By.id("tab-title-reviews"));
		review.click();
		Thread.sleep(3000);
		
	}
		@Test(priority =2)
		public void acceptAlert() throws InterruptedException {
			
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			Thread.sleep(3000);
			Alert jsAlert = driver.switchTo().alert();
			driver.switchTo().alert().accept();
				
	}
		
		
		@Test(priority = 3)
		public void scrollUp() throws InterruptedException {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,-1000) ");
			Thread.sleep(3000);
		}
		@Test(priority = 4)
		public void addToCart() throws InterruptedException {
		driver.findElement(By.cssSelector("button[name*='add']")).click();
		WebElement alert = driver.findElement(By.cssSelector("div[role*='alert']"));
		Thread.sleep(3000);
		assertTrue(alert.isDisplayed());
		
		
	} 
		
		
		
}
