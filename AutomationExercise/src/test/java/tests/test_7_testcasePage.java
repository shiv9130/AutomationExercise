package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClassAE.baseClass;

public class test_7_testcasePage extends baseClass {
	
	@Test
	public void testCasePage() {
		
		driver.findElement(By.xpath("//a[@href=\"/test_cases\"]")).click();
		WebElement ele = driver.findElement(By.xpath("//b[text()=\"Test Cases\"]"));
		String text = ele.getText();
		Reporter.log(text,true);
		
		boolean t = ele.isDisplayed();
		assertEquals(t, true);
		
	}

}
