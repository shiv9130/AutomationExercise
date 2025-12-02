package dataDrivenTest;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClassAE.baseClass;

public class test_6_uploadFile extends baseClass {
	
	
	@DataProvider
	public Object[][] getData() {
		
		return new Object[][] {
			{
				"shivam singh", "shivam1234@gmail.com","upload file","file upload using object retrun"
			}
		};
		
	}
	
	@Test(dataProvider = "getData")
	public void getDataFromprovider(String un, String email, String Upload, String msg) throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@href=\"/contact_us\"]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder=\"Subject\"]")).sendKeys(Upload);
		driver.findElement(By.xpath("//textarea[@placeholder=\"Your Message Here\"]")).sendKeys(msg);
		
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\Nis\\Desktop\\img.jpg");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.switchTo().alert().accept();
		
				
	}

}
