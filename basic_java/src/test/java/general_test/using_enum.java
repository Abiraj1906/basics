package general_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class using_enum {

	
	@Test
	public void launchBrowser() {
		//sample browser=sample.chrome;
		sample browser=sample.firefox;

		switch (browser) {
		case chrome:
			WebDriver driver=new ChromeDriver();
			driver.get("https://google.com");
			break;
         
		case firefox:
		WebDriver	driver1=new FirefoxDriver();
			driver1.get("https://preprod2.platform.sellermania.com");
			break;
			
		default:
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
