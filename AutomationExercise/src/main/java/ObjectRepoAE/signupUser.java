package ObjectRepoAE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import UtilityAE.webdriverUtil;

public class signupUser extends basePage {
	
	webdriverUtil wu = new webdriverUtil();

	public signupUser(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//b[text()=\"Enter Account Information\"]")
	private WebElement pageConfirmation;
	
	@FindBy(id = "id_gender1")
	private WebElement radioGenM;
	
	@FindBy(id = "id_gender2")
	private WebElement radioGenF;
	
	@FindBy(id = "password")
	private WebElement txtfPassword;
	
	@FindBy(id = "newsletter")
	private WebElement chkBNewsL;
	
	@FindBy(id = "optin")
	private WebElement chkBox2;
	
	@FindBy(id = "first_name")
	private WebElement txtFFirstName;
	
	@FindBy(id = "last_name")
	private WebElement txtFLastName;
	
	@FindBy(id = "company")
	private WebElement txtFCompany;
	
	@FindBy(id = "address1")
	private WebElement txtFAddress1;
	
	@FindBy(id = "address2")
	private WebElement txtFaddress2;
	
	@FindBy(id = "state")
	private WebElement txtFstate;
	
	@FindBy(id = "city")
	private WebElement txtFcity;
	
	@FindBy(id = "zipcode")
	private WebElement txtFzipcode;
	
	@FindBy(id = "mobile_number")
	private WebElement txtFmobile_number;
	
	@FindBy(xpath = "//button[text()=\"Create Account\"]")
	private WebElement btnCreate;
	
	//dropdown
	
	@FindBy(id = "days")
	private WebElement ddDay;
	
	@FindBy(id = "months")
	private WebElement ddMonth;
	
	@FindBy(id = "years")
	private WebElement ddYear;
	
	@FindBy(xpath = "//b[text()='Account Created!']")
	private WebElement TxtConfirmationCreated;
	
	
	//business logic for signup
	
	public void signUpusers(String pw,String fn, String ln, String company, String Add1, String Add2, String State, 
			String city, String zip, String mob ) {
		txtfPassword.sendKeys(pw);
		txtFFirstName.sendKeys(fn);
		txtFLastName.sendKeys(ln);
		txtFCompany.sendKeys(company);
		txtFAddress1.sendKeys(Add1);
		txtFaddress2.sendKeys(Add2);
		txtFstate.sendKeys(State);
		txtFcity.sendKeys(city);
		txtFzipcode.sendKeys(zip);
		txtFmobile_number.sendKeys(mob);
		btnCreate.click();
	}
	
	public void DOB(String D, String M, String Y) {
		
		wu.select(D, ddDay);
		wu.select(M, ddMonth);
		wu.select(Y, ddYear);
		
		
	}

	public webdriverUtil getWu() {
		return wu;
	}

	public WebElement getPageConfirmation() {
		return pageConfirmation;
	}

	public WebElement getRadioGenM() {
		return radioGenM;
	}

	public WebElement getRadioGenF() {
		return radioGenF;
	}

	public WebElement getTxtfPassword() {
		return txtfPassword;
	}

	public WebElement getChkBNewsL() {
		return chkBNewsL;
	}

	public WebElement getChkBox2() {
		return chkBox2;
	}

	public WebElement getTxtFFirstName() {
		return txtFFirstName;
	}

	public WebElement getTxtFLastName() {
		return txtFLastName;
	}

	public WebElement getTxtFCompany() {
		return txtFCompany;
	}

	public WebElement getTxtFAddress1() {
		return txtFAddress1;
	}

	public WebElement getTxtFaddress2() {
		return txtFaddress2;
	}

	public WebElement getTxtFstate() {
		return txtFstate;
	}

	public WebElement getTxtFcity() {
		return txtFcity;
	}

	public WebElement getTxtFzipcode() {
		return txtFzipcode;
	}

	public WebElement getTxtFmobile_number() {
		return txtFmobile_number;
	}

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public WebElement getDdDay() {
		return ddDay;
	}

	public WebElement getDdMonth() {
		return ddMonth;
	}

	public WebElement getDdYear() {
		return ddYear;
	}

	public WebElement getTxtConfirmationCreated() {
		return TxtConfirmationCreated;
	}
	
	

}
