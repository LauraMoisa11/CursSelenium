package curs10;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest{
	
	//       //@Test sau @Ignore
	@Test(priority = 0)
	public void xpathExample1() throws InterruptedException {
		
		// cand cautam tagul Xpath scriem in consola  tot timpul //li[@class='menu_user_login']
		driver.findElement(By.xpath( "//li[@class='menu_user_login']")).click();
		//logical OR
		driver.findElement(By.xpath("//input[@id='log' or @name='log']")).sendKeys("TestUser");
		//logical AND
		driver.findElement(By.xpath("//input[@id='password' and @name = 'pwd']")).sendKeys("12345@67890");
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		driver.findElement(By.xpath("//input[@class='submit_button']")).click();
		
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//span[@class='user_name']")).getText();
		assertEquals(text, "Test User");
		driver.findElement(By.xpath("//span[@class='user_name']")).click();
		driver.findElement(By.linkText("Settings")).click();
		Thread.sleep(4000);
		
		
	}
	@Test(priority = 1)
	public void xpathExample2() {
		
		//      //p/a - se duce pe copilul de la p
		//xpath     //p/a[contains(text(), 'recent orders')]
		// contains este similar cu * din cssSelector
		
		//driver.get("http://keybooks.ro/account/");
		driver.findElement(By.xpath("//p/a[contains(text(), 'recent orders')]")).click();
		boolean isOrderTabThere = driver.findElement(By.xpath("//th[contains(@class, 'woocommerce-orders-table__header-order-number')]")).isDisplayed();
		assertTrue(isOrderTabThere);
		
		//td[contains(@class,'woocommerce-orders-table__cell woocommerce-orders-table__cell-order-number'(text(),'#1675')]")).click();
		driver.findElement(By.xpath("//td[contains(@class,'woocommerce-orders-table__cell woocommerce-orders-table__cell-order-number')]/a[contains(text(),'#1675')]")).click();
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/account/view-order/1675/");
	
	}

}
