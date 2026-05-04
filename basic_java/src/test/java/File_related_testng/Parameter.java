package File_related_testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parameter {

	WebDriver driver;
	@Parameters("browser")
	@Test
	public void cross_browser(String browserName) {
		
	   if(browserName.equalsIgnoreCase("chrome")) {
		
		WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   
	   }else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			   driver.manage().deleteAllCookies();

	   }
		driver.get("https://google.com");
		String Expectedtitle="Google";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(Expectedtitle)) {
			System.out.println("Page title"+ actualtitle+"  "+Expectedtitle);
		}
			
		driver.quit();	
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
