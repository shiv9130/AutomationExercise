package ObjectRepoAE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class order_placedPage extends basePage{

	public order_placedPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//p[text()=\"Congratulations! Your order has been confirmed!\"]")
	private WebElement txtOrderConfirm;
	
	@FindBy(xpath = "//a[text()=\"Download Invoice\"]")
	private WebElement btnInvoice;
	
	@FindBy(xpath = "//a[text()=\"Continue\"]")
	private WebElement btnContinue;

	public WebElement getTxtOrderConfirm() {
		return txtOrderConfirm;
	}

	public WebElement getBtnInvoice() {
		return btnInvoice;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	
}
