package ObjectRepoAE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import UtilityAE.webdriverUtil;

public class signUpLogin extends basePage{

	webdriverUtil wu = new webdriverUtil();
	
	public signUpLogin(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name = "email")
	private WebElement textfLoginEmail;
	
	@FindBy(name = "password")
	private WebElement textfLoginPassword;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//h2[text()='New User Signup!']")
	private WebElement signupconfirm;
	
	@FindBy(name = "name")
	private WebElement textfSignName;
	
	@FindBy(xpath = "(//input[@name='email'])[2]")
	private WebElement textsignEmail;
	
	@FindBy(xpath ="//button[text()='Signup']")
	private WebElement btnSignup;

	public WebElement getTextfLoginEmail() {
		return textfLoginEmail;
	}

	public WebElement getTextfLoginPassword() {
		return textfLoginPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTextfSignName() {
		return textfSignName;
	}

	public WebElement getTextsignEmail() {
		return textsignEmail;
	}

	public WebElement getBtnSignup() {
		return btnSignup;
	}
	
	//business logic code for login user
	
	public void loginAE(String un,String pw) {
		
		textfLoginEmail.sendKeys(un);
		textfLoginPassword.sendKeys(pw);
		btnLogin.click();		
	}
	
	public void SignUpAE(String name, String email) {
		textfSignName.sendKeys(name);
		textsignEmail.sendKeys(email);
		btnSignup.click();
	}


	public WebElement getSignupconfirm() {
		return signupconfirm;
	}
	
	
	
	
	
	

}
