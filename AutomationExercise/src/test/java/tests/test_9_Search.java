package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import ObjectRepoAE.productPage;
import UtilityAE.properties;
import baseClassAE.baseClass;

@Listeners(ListinerAE.extentReport.class)
public class test_9_Search extends baseClass{
	
	properties pu = new properties();
	
	@Test
	public void search() {
		
		homePage hp = new homePage(driver);
		hp.getLinkProduct().click();
		
		productPage pp = new productPage(driver);
		
		String pro = pu.propUtil("product");
		
		pp.getTxtSearch().sendKeys(pro);
		pp.getBtnSearch();
		driver.findElement(By.xpath("//a[@href=\"/product_details/43\"]")).click();
		WebElement ele = driver.findElement(By.xpath("//p[text()=\" Mast & Harbour\"]"));
		String t = ele.getText();
		Reporter.log(t,true);
	
		
	}

}
