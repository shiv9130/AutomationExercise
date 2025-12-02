package baseClassAE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import UtilityAE.properties;
import UtilityAE.webdriverUtil;

public class baseClass {
	
	public static WebDriver sdriver;
	public WebDriver driver;
	
	properties pu = new properties();
	webdriverUtil wu = new webdriverUtil();
	
	
	@BeforeSuite(groups="smokeTest")
	public void configBS() {
		
		Reporter.log("DB connection sucessfully start", true);
				
	}
	
	@BeforeTest(groups="smokeTest")
	public void configBT() {
		
		Reporter.log("Pre-condition",true);
		
	}
	
	@BeforeClass(groups="smokeTest")
	public void configBC() {
		
		String bro = pu.propUtil("Browser");
		String url = pu.propUtil("URL");
		
		if(bro.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}else if(bro.equalsIgnoreCase("edge")) {			
			driver =  new EdgeDriver();
		
		}else if (bro.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
			 
		}else {
			
			driver = new ChromeDriver();
		}
		sdriver = driver;
		
		driver.get(url);
		driver.manage().window().maximize();
		wu.waitForPageToLoad(driver);
		
		Reporter.log("Browser open and url loaded sucessfully ",true);
		
	}
	
    @BeforeMethod(groups="smokeTest")
	public void configBM() {
    	
    	Reporter.log("user login sucessfully",true);
		
	}
    
    @AfterMethod(groups="smokeTest")
    public void configAM() {
    	
    	//driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
    	
    	Reporter.log("user logout sucessfully",true);
    	
    }
    
    @AfterClass(groups="smokeTest")
    public void configAC() {
    	
    	driver.close();
    	
    	Reporter.log("browser closed", true);
    	
    }
    
    @AfterTest(groups="smokeTest")
    public void configAT() {
    	
    	Reporter.log("Post-condition",true);
    	
    }
    
    @AfterSuite(groups="smokeTest")
    public void configAS() {
    	
    	Reporter.log("DB closed sucessfully",true);
    	
    }

}
