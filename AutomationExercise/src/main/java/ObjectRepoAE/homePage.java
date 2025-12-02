package ObjectRepoAE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage{

	public homePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//img[@alt='Website for automation practice']")
	private WebElement img;
	
	@FindBy(xpath  = " //a[@href=\"/products\"]")
	private WebElement linkProduct;
	
	@FindBy(linkText = " Cart")
	private WebElement linkcart;
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement linkSignLogin;

	public WebElement getImg() {
		return img;
	}

	public WebElement getLinkProduct() {
		return linkProduct;
	}

	public WebElement getLinkcart() {
		return linkcart;
	}

	public WebElement getLinkSignLogin() {
		return linkSignLogin;
	}
	
	

}
