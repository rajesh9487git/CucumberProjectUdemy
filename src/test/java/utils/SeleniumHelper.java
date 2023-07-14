package utils;

import org.openqa.selenium.WebDriver;

public class SeleniumHelper {
	
	
//TestContextSetup testContextSetup;
	public WebDriver driver;
	
	public SeleniumHelper(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void swicthToChildWindow() {
		
		String mainWindow= driver.getWindowHandle();
	      
	      for(String windowHandle:driver.getWindowHandles()) {
	    	  
	    	  if(!(windowHandle==mainWindow)) {
	    		  driver.switchTo().window(windowHandle);
	    	  }else{
	    		  
	    		System.out.println("There is no child window");
	    		
	    	  }
	      }
		
		
	}

}
