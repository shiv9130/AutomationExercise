package tests;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import ObjectRepoAE.signUpLogin;
import ObjectRepoAE.signupUser;
import UtilityAE.excelUtil;
import baseClassAE.baseClass;

@Listeners(ListinerAE.extentReport.class)
public class test_1_signup extends baseClass {
	
	excelUtil eu = new excelUtil();
	
	
      
	@Test(groups="smokeTest")
	  public void Signupuser() throws InterruptedException {
		
		homePage hp  = new homePage(driver);
		hp.getLinkSignLogin().click();
		
		
		
		signUpLogin su = new signUpLogin(driver);
		
		WebElement text = su.getSignupconfirm();
		boolean displayedtext = text.isDisplayed();
		
		String t = text.getText();
		System.out.println("text :"+t);
	
		
		assertEquals(displayedtext, true);
		
		
		String name = eu.ExcelFileUtil("datafile", 1, 0);
		String email = eu.ExcelFileUtil("datafile", 1, 1);
		
		su.SignUpAE(name, email);
		
		String pw = eu.ExcelFileUtil("datafile", 1, 2);
		String fn = eu.ExcelFileUtil("datafile", 1, 3);
		String ln = eu.ExcelFileUtil("datafile", 1, 4);
		String company = eu.ExcelFileUtil("datafile", 1, 5);
		String Add1 = eu.ExcelFileUtil("datafile", 1, 6);
		String Add2 = eu.ExcelFileUtil("datafile", 1, 7);
		String state = eu.ExcelFileUtil("datafile", 1, 8);
		String city = eu.ExcelFileUtil("datafile", 1, 9);
		String zip = eu.ExcelFileUtil("datafile", 1, 10);
		String mob = eu.ExcelFileUtil("datafile", 1, 11);
		
		signupUser spu = new signupUser(driver);
		spu.getRadioGenM().click();
	spu.DOB("30", "September", "1998");
	spu.signUpusers(pw,fn, ln, company, Add1, Add2, state, city, zip,  mob );
	
   boolean ac = driver.findElement(By.xpath("//b[text()='Account Created!']")).isDisplayed();
    
   assertEquals(ac, true);
   
   driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
   driver.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();
   driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
   
   
   

 
 
 
		
		
		
		
		
		  
		  
	  }

}
