package curs10;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class homeworkCurs10 extends BaseTest {
	@Test(priority = 0)
	public void author() {
		driver.findElement(By.linkText("SINGLE AUTHOR")).click();
	}

	@Test(priority = 1)
	public void checkSkill1() throws InterruptedException {
		
		WebElement drama = driver.findElement(By.xpath("(//div[@class=\"sc_skills_total\"])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(drama, "95%"));
		assertEquals(drama.getText(),"95%");
	}
	@Test(priority = 2)
	public void checkSkill2() throws InterruptedException {
		
		
		WebElement biography = driver.findElement(By.xpath("(//div[@class=\"sc_skills_total\"])[2]"));
		
		assertEquals(biography.getText(),"75%");
	}
	@Test(priority = 3)
	public void checkSkill3() throws InterruptedException {
		
		
		WebElement cookbooks = driver.findElement(By.xpath("(//div[@class=\"sc_skills_total\"])[3]"));
		
		assertEquals(cookbooks.getText(),"82%");
		
	} 
	
	
}
