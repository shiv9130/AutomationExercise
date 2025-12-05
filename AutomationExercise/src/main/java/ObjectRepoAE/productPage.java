package ObjectRepoAE;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class productPage extends basePage{

	public productPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath = "//img[@id=\"sale_image\"]")
	private WebElement imgLogo;
	
	@FindBy(xpath = "//input[@id=\"search_product\"]")
	private WebElement txtSearch;
	
	@FindBy(xpath = "//button[@id=\"submit_search\"]")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//a[text()=\"View Product\"]")
	private List<WebElement> btnViewProduct;
	
	@FindBy(xpath = "//h2[text()=\"Subscription\"]")
	private WebElement TextproductSUbs;
	
	@FindBy(xpath = "//input[@type=\"email\"]")
	private WebElement txtFEmailProductFooter;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement btnProductSubmit;
	
	@FindBy(xpath = "//a[@data-toggle=\"collapse\"]")
	private List<WebElement> toggleProduct;

	public WebElement getImgLogo() {
		return imgLogo;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public List<WebElement> getBtnViewProduct() {
		return btnViewProduct;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTextproductSUbs() {
		return TextproductSUbs;
	}

	public WebElement getTxtFEmailProductFooter() {
		return txtFEmailProductFooter;
	}

	public WebElement getBtnProductSubmit() {
		return btnProductSubmit;
	}

	public List<WebElement> getToggleProduct() {
		return toggleProduct;
	}

	
	
	
	

}
