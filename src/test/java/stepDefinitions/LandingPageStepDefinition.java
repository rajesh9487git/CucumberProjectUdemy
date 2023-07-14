package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	

	
	TestContextSetup testContextSetup;
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
	}
	
	
//	LandingPage landingPage= testContextSetup.pageObjectManager.getLandingPage();
	
	
    @Given("User is on greencart landing page")
    public void user_is_on_greencart_landing_page()  {
//        System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
//        testContextSetup.driver= new ChromeDriver();
//        testContextSetup.driver.manage().window().maximize();
//        testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//        Thread.sleep(2000);
    }
    
//    LandingPage landingPage= testContextSetup.pageObjectManager.getLandingPage();
    
    @When("^user searched with shortname (.+) and extracted actual name of product$")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
    	
    	LandingPage landingPage= testContextSetup.pageObjectManager.getLandingPage();
    	landingPage.searchItem(shortName);
    	
       Thread.sleep(1000);
       
       testContextSetup.productName=landingPage.getProductName().split("-")[0].trim();
//       testContextSetup.productName=testContextSetup.driver.findElement(By.xpath("//h4[@class='product-name']")).getText().split("-")[0].trim();
       
        System.out.println("=============Product name is "+testContextSetup.productName);
    }
    
    
    @When("^increase the quantity of the product to (.+) and add to cart$")
    public void increase_the_quantity_of_the_product_to(Integer int1) {
       
    	LandingPage landingPage= testContextSetup.pageObjectManager.getLandingPage();
    	
    	
    		landingPage.increaseQuantity(int1);
    		landingPage.addToCart();
    	
    }
    
    @Given("click on cart and proceed to checkout")
    public void click_on_cart_and_proceed_to_checkout() {
    	
    	LandingPage landingPage= testContextSetup.pageObjectManager.getLandingPage();
    	landingPage.clickOnCart();
    	testContextSetup.seleniumHelper.swicthToChildWindow();
    	
    	landingPage.clickOnCheckout();
    }
   
}















