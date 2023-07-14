package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pages.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String productName;
	public String offerProductName;
	public SeleniumHelper seleniumHelper;
	public String checkoutPageName;
	
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	
	
	public TestContextSetup() throws InterruptedException, IOException {
		
		testbase= new TestBase();
		pageObjectManager = new PageObjectManager(testbase.WebDriverManager());
		seleniumHelper = new SeleniumHelper(testbase.WebDriverManager());
	}

}
