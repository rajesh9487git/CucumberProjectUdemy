package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h4[@class='product-name']")
	private WebElement productName;
	

	@FindBy(xpath="//input[@type= 'search']")
	WebElement search;
	
	@FindBy(xpath="//a[@class='increment']")
	WebElement quantityIncrease;
	
	@FindBy(xpath="//*[text()='ADD TO CART']")
	WebElement addToCart;
	
	@FindBy(xpath="//*[@alt='Cart']")
	WebElement cart;
	
	@FindBy(xpath="//*[text()='PROCEED TO CHECKOUT']")
	WebElement checkout;
	
	
	public void searchItem(String name) {
		
		search.sendKeys(name);
	}
	
	
	public String getProductName() {
		
		return productName.getText();
		
	}
	
	public void increaseQuantity(int quantity) {
		
		for(int i=1;i<quantity;i++) {
		quantityIncrease.click();
		
	}
	}
	
	
	public void addToCart() {
		addToCart.click();
		
	}	
	
	public void clickOnCart() {
		cart.click();
		
	}	
	
	public void clickOnCheckout() {
		
		checkout.click();
	}
		

}
