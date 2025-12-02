package dataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import ObjectRepoAE.signUpLogin;
import baseClassAE.baseClass;

@Listeners(ListinerAE.extentReport.class)
public class dataProvider extends baseClass{
	
	
	@DataProvider()
	public Object [][] getdata(){
		
		return new Object[][] {
		
			 {
	                "Shivam singh", "Shivam123456@gmail.com", "J@nnat123",
	                "Shivam", "singh", "automation", "mumbai",
	                "thane", "maharashtra", "thane", "400612", "8770147852"
	            }
		};
		
		
	}
	
	@Test(dataProvider = "getdata")
	public void getDataFromProvider(String name, String email,String pw,String fn, String ln, String company, String Add1, String Add2, String State, 
			String city, String zip, String mob) {
		
		homePage hu = new homePage(driver);
		hu.getLinkSignLogin().click();
		
		signUpLogin sl = new signUpLogin(driver);
		sl.SignUpAE(name, email);
		
	}

}
