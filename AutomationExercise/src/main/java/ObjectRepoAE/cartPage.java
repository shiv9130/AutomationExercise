package ObjectRepoAE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage extends basePage{

	public cartPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[text()=\"Proceed To Checkout\"]")
	private WebElement BtnCheckout;
	
	@FindBy(xpath = "//a[@class=\"cart_quantity_delete\"]")
	private WebElement BtnCDeleteProduct;

}
