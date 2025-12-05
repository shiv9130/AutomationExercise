package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import baseClassAE.baseClass;

public class test11_cart extends baseClass {
	
	@Test
	public void cartSubs() throws InterruptedException {
		
		homePage hp = new homePage(driver);
		hp.getLinkcart().click();
		WebElement ele = driver.findElement(By.xpath("//h2[text()=\"Subscription\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("shiv1234@gmail,com");
		
		
	}

}
