package ObjectRepoAE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutPage extends basePage{

	public checkoutPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//h2[text()=\"Address Details\"]")
	private WebElement textAddressVerify;
	
	@FindBy(xpath = "//textarea[@name=\"message\"]")
	private WebElement textArea;
	
	@FindBy(xpath = "//a[text()=\"Place Order\"]")
	private WebElement btnPlaceOrder;

}
