package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws InterruptedException, IOException {
		
		
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url=prop.getProperty("qaUrl");
		String browser = prop.getProperty("browser");
		
		
		 
		 if(driver==null) {
			 
			 if(browser.equalsIgnoreCase("chrome")) {
				 
			 }
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
	        driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get(url);
	        Thread.sleep(1000);
	        
		 }else if(browser.equalsIgnoreCase("firefox")){
			 
			 //fire fox browser code
		 }
	
		 
		 return driver;
		 
	}

}
