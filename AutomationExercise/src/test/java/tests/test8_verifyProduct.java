package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import ObjectRepoAE.productPage;
import baseClassAE.baseClass;

@Listeners(ListinerAE.extentReport.class)
public class test8_verifyProduct extends baseClass {
	
	
	@Test
	public void verifyProductDetails() {
		
		homePage hp = new homePage(driver);
		hp.getLinkProduct().click();
		
		productPage pp = new productPage(driver);
		pp.getBtnViewProduct().get(33).click();
		
		boolean ele = driver.findElement(By.xpath("//h2[text()=\"GRAPHIC DESIGN MEN T SHIRT - BLUE\"]")).isDisplayed();
		
		assertEquals(ele, true);
		
		
	}

}
