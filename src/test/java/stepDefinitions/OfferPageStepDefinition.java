package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OffersPage;
import utils.SeleniumHelper;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	
	
	TestContextSetup testContextSetup;
	
	
public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
	}
	
	
    @Then("^user searched for (.+) shortname in offers page to check if product exist$")
    public void user_searched_for_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
//    	testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
    	OffersPage offersPage=testContextSetup.pageObjectManager.getOffersPage();
    	offersPage.clickOnTopDeals();
      Thread.sleep(1000);
      testContextSetup.seleniumHelper.swicthToChildWindow();
      
      
      offersPage.searchItem(shortName);
      Thread.sleep(1000);
      testContextSetup.offerProductName=offersPage.getProductName();

      
//      testContextSetup.driver.findElement(By.id("search-field")).sendKeys(shortName);
//      testContextSetup.offerProductName=testContextSetup.driver.findElement(By.xpath("//tr/td[1]")).getText();
      
      System.out.println("==============================================================================================");
      System.out.println("Offer product name is "+ testContextSetup.offerProductName);
    }
    
    @Then("Validate if the landing page product name and offer page product is same")
    public void validate_if_the_landing_page_product_name_and_offer_page_product_is_same() {
       
    	Assert.assertEquals(testContextSetup.productName, testContextSetup.offerProductName);
    	
    }


}















