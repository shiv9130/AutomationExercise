package dataDrivenTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import ObjectRepoAE.signUpLogin;
import baseClassAE.baseClass;

@Listeners(ListinerAE.extentReport.class)
public class test_2_loginuserverify extends baseClass {
	
	@DataProvider
	public Object[][] getData(){
		
	
		return new Object[][] {
		{
			"shiv1234@gmail.com", "J@nnat123"
		}
		
	};

  }
	
	@Test(dataProvider = "getData")
	public void getDataFromprovider(String email, String Password) {
		homePage hp = new homePage(driver);
		hp.getLinkSignLogin().click();
		
		signUpLogin sl = new signUpLogin(driver);
		
		sl.loginAE(email, Password);
		
		boolean us = driver.findElement(By.xpath("//b[text()=\"SHIVAM SINGH\"]")).isDisplayed();
		assertEquals(us, true);
		
		driver.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//b[text()=\"Account Deleted!\"]"));
		String text = ele.getText();
		System.out.println("visible text :"+text);
		
		boolean t = ele.isDisplayed();
		
		assertEquals(t, true);
		
		
		
		
	}
	
	
}
