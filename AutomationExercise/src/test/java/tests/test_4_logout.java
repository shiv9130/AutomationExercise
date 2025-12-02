package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import ObjectRepoAE.signUpLogin;
import UtilityAE.properties;
import baseClassAE.baseClass;

@Listeners(ListinerAE.extentReport.class)
public class test_4_logout extends baseClass {
	
	properties prop = new properties();
	
	@Test
	public void logoutUser() {
		
		String em = prop.propUtil("email");
		String pw = prop.propUtil("password");
		
		homePage hp = new homePage(driver);
		hp.getLinkSignLogin().click();
		
		signUpLogin sl = new signUpLogin(driver);
		sl.loginAE(em, pw);
		
		driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//h2[text()=\"Login to your account\"]"));
		String text = ele.getText();
		System.out.println(text);
		
		boolean t = ele.isDisplayed();
		assertEquals(t, true);	
		
	}
	
	

}
