package tests;

import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import UtilityAE.webdriverUtil;
import baseClassAE.baseClass;

@Listeners(ListinerAE.extentReport.class)
public class test_8_verfiyProduct extends baseClass {
	
	webdriverUtil wu = new webdriverUtil();
	
	@Test
	public void verifyProduct() {
		
		homePage hp = new homePage(driver);
		hp.getLinkProduct().click();
		
		boolean ele = driver.findElement(By.xpath("//h2[@class=\"title text-center\"]")).isDisplayed();
		assertEquals(ele, true);
		
		WebElement pro = driver.findElement(By.xpath("//a[@href=\"/product_details/5\"]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(pro).perform();
		
		
		
		boolean elem = driver.findElement(By.xpath("//h2[text()=\"Blue Top\"]")).isDisplayed();
		assertEquals(elem, true);
		
		
	}

}
