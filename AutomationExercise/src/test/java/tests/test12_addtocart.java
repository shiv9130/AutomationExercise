package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import UtilityAE.webdriverUtil;
import baseClassAE.baseClass;


@Listeners(ListinerAE.extentReport.class)
public class test12_addtocart extends baseClass{
	
	webdriverUtil wu = new webdriverUtil();
	
	@Test
	public void addcart() {
		
		//WebElement ele = driver.findElement(By.xpath("(//a[text()=\"Add to cart\"])[1]"));
		WebElement ele = driver.findElement(By.xpath("//a[@href=\"/product_details/2\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		

       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click()", ele);
		
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//u[text()=\"View Cart\"]")).click();
     boolean pro = driver.findElement(By.xpath("//h2[text()=\"Men Tshirt\"]")).isDisplayed();
     assertEquals(pro, true);
       WebElement quantity = driver.findElement(By.xpath("//input[@id=\"quantity\"]"));
       
       quantity.clear();
       quantity.sendKeys("4");
       
       driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
       
       driver.findElement(By.xpath("//u[text()=\"View Cart\"]")).click();
       WebElement no = driver.findElement(By.xpath("//button[text()=\"4\"]"));
       String t = no.getText();
      boolean n = no.isDisplayed();
      assertEquals(n, true);
      System.out.println(t);
      
		
	}
	
	

}
