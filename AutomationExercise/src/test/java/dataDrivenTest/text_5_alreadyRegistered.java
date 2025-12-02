package dataDrivenTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import ObjectRepoAE.signUpLogin;
import UtilityAE.excelUtil;
import baseClassAE.baseClass;

@Listeners(ListinerAE.extentReport.class)
public class text_5_alreadyRegistered extends baseClass{
	
	excelUtil eu = new  excelUtil();
	
	@Test
	public void registeruser() {
		
		String un = eu.ExcelFileUtil("datafile", 1, 0);
		String email = eu.ExcelFileUtil("datafile", 1, 1);
		
		homePage hp = new homePage(driver);
		hp.getLinkSignLogin().click();
		
		signUpLogin sl = new signUpLogin(driver);
		sl.SignUpAE(un, email);
		
		WebElement ele = driver.findElement(By.xpath("//p[text()=\"Email Address already exist!\"]"));
		String text = ele.getText();	
		System.out.println("already exist:"+ text);
		
		boolean t = ele.isDisplayed();
		assertEquals(t, true);
		
	}
	
	

}
