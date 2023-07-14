package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import utils.TestContextSetup;

public class Hooks {
	
	public TestContextSetup testcontextsetup;
	
	
	public Hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
	
	@After
	public void closeBrowser() throws InterruptedException, IOException {
		
		testcontextsetup.testbase.WebDriverManager().quit();
	}

}
