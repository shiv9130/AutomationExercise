package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepoAE.homePage;
import ObjectRepoAE.signUpLogin;
import ObjectRepoAE.signupUser;
import UtilityAE.excelUtil;
import UtilityAE.properties;
import UtilityAE.webdriverUtil;
import baseClassAE.baseClass;

@Listeners(ListinerAE.extentReport.class)
public class test_14_checkout extends baseClass{
	
	properties pu = new properties();
	excelUtil eu = new excelUtil();
	webdriverUtil wu = new webdriverUtil();	
	@Test
	public void testCheckout() {
		//Verify that home page is visible successfully
		boolean ele = driver.findElement(By.xpath("//h2[text()=\"Features Items\"]")).isDisplayed();
		assertEquals(ele, true);
		
		// Add products to cart, Click 'Cart' button
		
		WebElement ele1 = driver.findElement(By.xpath("//a[@data-product-id=\"5\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		
		driver.findElement(By.xpath("//u[text()=\"View Cart\"]")).click();
		// Verify that cart page is displayed
		boolean ele2 = driver.findElement(By.xpath("//a[@href=\"/product_details/5\"]")).isDisplayed();
		assertEquals(ele2, true);
		
		// Click Proceed To Checkout, Click 'Register / Login' button
		driver.findElement(By.xpath("//a[text()=\"Proceed To Checkout\"]")).click();
		driver.findElement(By.xpath("//u[text()=\"Register / Login\"]")).click();
		
		signUpLogin sl = new signUpLogin(driver);
		/*String email = pu.propUtil("email");
		String pass = pu.propUtil("password");
		sl.loginAE(email, pass);*/
		
		//Fill all details in Signup and create account
		String un = eu.ExcelFileUtil("datafile", 1, 0);
		String email = eu.ExcelFileUtil("datafile", 1, 1);
		sl.SignUpAE(un, email);
		signupUser su = new signupUser(driver);
		su.getRadioGenM().click();
		su.getChkBNewsL().click();
		su.getChkBox2().click();
		String pw = eu.ExcelFileUtil("datafile", 1, 2);
		String fn = eu.ExcelFileUtil("datafile", 1, 3);
		String ln = eu.ExcelFileUtil("datafile", 1, 4);
		String comp = eu.ExcelFileUtil("datafile", 1, 5);
		String add1 = eu.ExcelFileUtil("datafile", 1, 6);
		String add2 = eu.ExcelFileUtil("datafile", 1, 7);
		String state = eu.ExcelFileUtil("datafile", 1, 8);
		String city = eu.ExcelFileUtil("datafile", 1, 9);
		String zip = eu.ExcelFileUtil("datafile", 1, 10);
		String mob = eu.ExcelFileUtil("datafile", 1, 11);
		
		
	
		su.DOB("30", "September", "1998");
		su.signUpusers(pw, fn, ln, comp, add1, add2, state, city, zip, mob);
		
		 //Verify 'ACCOUNT CREATED!' and click 'Continue' button
		boolean ele3 = driver.findElement(By.xpath("//b[text()=\"Account Created!\"]")).isDisplayed();
		assertEquals(ele3, true);
		driver.findElement(By.xpath("//a[text()=\"Continue\"]")).click();
		
		//Verify ' Logged in as username' at top
		WebElement ele4 = driver.findElement(By.xpath("//b[text()=\"shivam singh\"]"));
		String txt = ele4.getText();
		System.out.println("name verify:"+txt);
		
		//Click 'Cart' button
		homePage hp = new homePage(driver);
		hp.getLinkcart().click();
		
		//Click 'Proceed To Checkout' button
		driver.findElement(By.xpath("//a[text()=\"Proceed To Checkout\"]")).click();
		
		// Verify Address Details and Review Your Order
		boolean ele5 = driver.findElement(By.xpath("//h2[text()=\"Address Details\"]")).isDisplayed();
		assertEquals(ele5, true);
		
		//Enter description in comment text area and click 'Place Order'
		driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys("order in time");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[text()=\"Place Order\"]")).click();
		
		//enter payment details: Name on Card, Card Number, CVC, Expiration date
		driver.findElement(By.xpath("//input[@data-qa=\"name-on-card\"]")).sendKeys("Shivam Singh");
		driver.findElement(By.xpath("//input[@data-qa=\"card-number\"]")).sendKeys("1234852896397897");
		driver.findElement(By.xpath("//input[@data-qa=\"cvc\"]")).sendKeys("897");
		driver.findElement(By.xpath("//input[@data-qa=\"expiry-month\"]")).sendKeys("12");
		driver.findElement(By.xpath("//input[@data-qa=\"expiry-year\"]")).sendKeys("2050");
		driver.findElement(By.xpath("//button[@data-qa=\"pay-button\"]")).click();
		
		//Click 'Pay and Confirm Order' button, Verify success message 'Your order has been placed successfully!'
		/*WebElement ele6 = driver.findElement(By.xpath("//div[@class=\"alert-success alert\"]"));
		wu.waitForVisibilityOfElement(driver, ele6);
		String text = ele6.getText();
		System.out.println(text);*/
		
		//Click 'Delete Account' button, Verify 'ACCOUNT DELETED!' and click 'Continue' button
		driver.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();
		
		WebElement ele7 = driver.findElement(By.xpath("//b[text()=\"Account Deleted!\"]"));
		String texxt = ele7.getText();
		System.out.println(texxt);
	}

}
