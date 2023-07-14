package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.checkoutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {
	

	public checkoutPage checkoutpage;
	
	TestContextSetup testContextSetup;
	
	public CheckoutPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
	}
	
	
	
	
	
	@Then("in checkout page make sure the correct product is displaying$")
	public void in_checkout_page_make_sure_the_correct_product_is_displaying() {
	   
		LandingPage landingPage= testContextSetup.pageObjectManager.getLandingPage();
		testContextSetup.productName=landingPage.getProductName().split("-")[0].trim();
		
	    checkoutpage = testContextSetup.pageObjectManager.getCheckOutPage();
	    testContextSetup.checkoutPageName= checkoutpage.getcheckoutproductName().split("-")[0].trim();
	    
	    System.out.println("==============================================================================================");
	      System.out.println("Product added checkout is "+ testContextSetup.productName);
	      
	      System.out.println("==============================================================================================");
	      System.out.println("Name of the product in checkout page is "+ testContextSetup.checkoutPageName);
	    
	    Assert.assertEquals(testContextSetup.productName, testContextSetup.checkoutPageName);
	    
	}

	@Then("in checkout page Apply and Place Order buttons are displaying")
	public void in_checkout_page_apply_and_place_order_buttons_are_displaying() throws InterruptedException {
		
//		checkoutPage checkoutpage = testContextSetup.pageObjectManager.getCheckOutPage();
		Thread.sleep(1000);
		
		Boolean applyButton=checkoutpage.getApplyButton().isDisplayed();
		
		Assert.assertTrue(applyButton);
		
		Boolean placeOrderButton=checkoutpage.getPlaceOrderButton().isDisplayed();
		Assert.assertTrue(placeOrderButton);
		
		
		
	}


   
}















