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
	
	@FindBy(xpath= "//a[@href=\"/view_cart\"]")
	private WebElement linkcart;
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement linkSignLogin;
	
	@FindBy(xpath = "//h2[text()=\"Subscription\"]")
	private WebElement fotterSubs;
	
	@FindBy(xpath = "//input[@type=\"email\"]")
	private WebElement emailFoot;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//a[@xpath=\"1\"]")
	private WebElement LinkUserDetail;

	@FindBy(xpath = "//a[text()=\" Logout\"]")
	private WebElement lnkLogout;
	
	@FindBy(xpath = "//a[text()=\" Delete Account\"]")
	private WebElement lnkDeleteAccount;
	
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

	public WebElement getFotterSubs() {
		return fotterSubs;
	}

	public WebElement getEmailFoot() {
		return emailFoot;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	public void email(String email) {
		emailFoot.sendKeys(email);
		btnSubmit.click();
	}

	public WebElement getLinkUserDetail() {
		return LinkUserDetail;
	}

	public WebElement getLnkLogout() {
		return lnkLogout;
	}

	public WebElement getLnkDeleteAccount() {
		return lnkDeleteAccount;
	}
	

}
