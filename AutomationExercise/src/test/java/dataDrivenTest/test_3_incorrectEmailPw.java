package dataDrivenTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import ObjectRepoAE.signUpLogin;
import baseClassAE.baseClass;

@Listeners(ListinerAE.extentReport.class)
public class test_3_incorrectEmailPw extends baseClass{

	
	@DataProvider
	public Object[] getData() {
		
		return new Object[][] {
			{
				"shiv12345@gmail.com","J2nnat12345"
			}
		};
			
	}
	
	
	@Test(dataProvider = "getData")
	public void getDataFromProvider(String email, String password) {
		
		homePage hp = new homePage(driver);
		hp.getLinkSignLogin().click();
		
		signUpLogin sl = new signUpLogin(driver);
		sl.loginAE(email, password);
		
		boolean text = driver.findElement(By.xpath("//p[@style=\"color: red;\"]")).isDisplayed();
		assertEquals(text, true);
		
	}
}
