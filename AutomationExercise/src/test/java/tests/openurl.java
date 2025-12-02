package tests;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClassAE.baseClass;


@Listeners(ListinerAE.extentReport.class)
public class openurl extends baseClass {
	
	@Test(groups="smokeTest")
	public void open() {
		
	}
	
	

}
