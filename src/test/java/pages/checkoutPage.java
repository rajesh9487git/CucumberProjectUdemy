package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {
	
public WebDriver driver;
	
	public checkoutPage
	(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//p[@class='product-name']")
	private WebElement checkoutproductName;
	
	@FindBy(xpath="//*[text()='Apply']")
	private WebElement applyButton;
	
	@FindBy(xpath="//*[text()='Place Order']")
	private WebElement placeOderButton;
	
	
	public String getcheckoutproductName() {
		
		
		return checkoutproductName.getText();
	}

	
public WebElement getApplyButton() {
		
		
		return applyButton;
	}

public WebElement getPlaceOrderButton() {
	
	
	return placeOderButton;
}
}
