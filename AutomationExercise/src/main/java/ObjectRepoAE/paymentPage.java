package ObjectRepoAE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class paymentPage extends basePage{

	public paymentPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//h2[text()=\"Payment\"]")
	private WebElement textPayment;
	
	@FindBy(xpath = "//input[@name=\"name_on_card\"]")
	private WebElement txtFNameonCard;
	
	@FindBy(xpath = "//input[@name=\"card_number\"]")
	private WebElement txtFCardNo;
	
	@FindBy(xpath = "//input[@name=\"cvc\"]")
	private WebElement txtFCVC;
	
	@FindBy(xpath = "//input[@name=\"expiry_month\"]")
	private WebElement txtFExpiryMonth;
	
	@FindBy(xpath = "//input[@data-qa=\"expiry-year\"]")
	private WebElement txtFExpiryYear;
	
	@FindBy(xpath = "//button[@id=\"submit\"]")
	private WebElement btnPayConfirm;

	public WebElement getTextPayment() {
		return textPayment;
	}

	public WebElement getTxtFNameonCard() {
		return txtFNameonCard;
	}

	public WebElement getTxtFCardNo() {
		return txtFCardNo;
	}

	public WebElement getTxtFCVC() {
		return txtFCVC;
	}

	public WebElement getTxtFExpiryMonth() {
		return txtFExpiryMonth;
	}

	public WebElement getTxtFExpiryYear() {
		return txtFExpiryYear;
	}

	public WebElement getBtnPayConfirm() {
		return btnPayConfirm;
	}
	
	//business logic
	
	public void paymentConfirm(String name, String Card, String Cvv, String expireM, String ExpireY) {
		
		txtFNameonCard.sendKeys(name);
		txtFCardNo.sendKeys(Card);
		txtFCVC.sendKeys(Cvv);
		txtFExpiryMonth.sendKeys(expireM);
		txtFExpiryYear.sendKeys(ExpireY);
		getBtnPayConfirm().click();
	}

}
