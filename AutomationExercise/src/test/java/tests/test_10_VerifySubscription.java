package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import UtilityAE.properties;
import baseClassAE.baseClass;

@Listeners(ListinerAE.extentReport.class)
public class test_10_VerifySubscription extends baseClass{
	
	properties pu = new properties();
	@Test
	public void Subscription() throws InterruptedException {
		
		Actions act = new Actions(driver);
		
		homePage hp = new homePage(driver);
		
		WebElement ele = hp.getFotterSubs();
		
		String txt = ele.getText();
		Reporter.log(txt,true);
		
		act.moveToElement(ele);
		
		String email = pu.propUtil("email");
		
		Thread.sleep(3000);
		hp.email(email);
		
	}

}
