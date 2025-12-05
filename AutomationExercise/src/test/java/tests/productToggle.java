package tests;

import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import ObjectRepoAE.productPage;
import baseClassAE.baseClass;

public class productToggle extends baseClass{
	
	@Test
	public void toggle() throws InterruptedException {
		
		homePage hp = new homePage(driver);
		hp.getLinkProduct().click();
		
		productPage pp = new productPage(driver);
		
		pp.getToggleProduct().get(2).click();
		
		Thread.sleep(2000);
	}

}
