package ObjectRepoAE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactPage extends basePage{

	public contactPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//h2[text()=\"Contact \"]")
	private WebElement textContact;
	
	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement txtfName;
	
	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement txtfEmail;
	
	@FindBy(xpath = "//input[@name=\"subject\"]")
	private WebElement txtfSubject;
	
	@FindBy(xpath = "//textarea[@name=\"message\"]")
	private WebElement txtAreaMsg;
	
	@FindBy(xpath = "name=\"upload_file\"")
	private WebElement btnUpload;
	
	@FindBy(xpath = "//input[@name=\"submit\"]")
	private WebElement btnSubmit;

	public WebElement getTextContact() {
		return textContact;
	}

	public WebElement getTxtfName() {
		return txtfName;
	}

	public WebElement getTxtfEmail() {
		return txtfEmail;
	}

	public WebElement getTxtfSubject() {
		return txtfSubject;
	}

	public WebElement getTxtAreaMsg() {
		return txtAreaMsg;
	}

	public WebElement getBtnUpload() {
		return btnUpload;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	//business logic
	
	public void ContactDetails(String name, String email, String sub, String msg, String upl) {
		
		txtfName.sendKeys(name);
		txtfEmail.sendKeys(email);
		txtfSubject.sendKeys(sub);
		txtAreaMsg.sendKeys(msg);
		btnUpload.sendKeys(upl);
		btnSubmit.click();
		
	}

}
