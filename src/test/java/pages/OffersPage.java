package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OffersPage {
	
public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search-field")
	WebElement search;
	
	@FindBy(xpath="//tr/td[1]")
	WebElement product;
	
	@FindBy(linkText="Top Deals")
	WebElement topDeals;
	
	
	public void searchItem(String searchName) {
		
		search.sendKeys(searchName);
	}
		
		
	public String getProductName() {
		
		return product.getText();
	}
	
	public void clickOnTopDeals() {
		
		topDeals.click();
	}

}
