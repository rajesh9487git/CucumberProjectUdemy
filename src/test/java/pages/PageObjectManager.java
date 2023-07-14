package pages;

import org.openqa.selenium.WebDriver;

import utils.TestBase;

public class PageObjectManager {
	
	public WebDriver driver;
	LandingPage landingPage;
	OffersPage offersPage;
	public checkoutPage checkoutpage;
	
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public LandingPage getLandingPage() {
		
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	
	
    public OffersPage getOffersPage() {
		
		offersPage = new OffersPage(driver);
		return offersPage;
	}
    
    
    public checkoutPage getCheckOutPage() {
		
    	checkoutpage = new checkoutPage(driver);
		return checkoutpage;
	}
    


}
