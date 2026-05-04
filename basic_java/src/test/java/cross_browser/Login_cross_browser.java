package cross_browser;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_cross_browser {

	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void set_up(String browser) throws MalformedURLException {
	
	//WebDriverManager.firefoxdriver().setup();
	
		
	if(browser.equalsIgnoreCase("firefox")) {	
		
		FirefoxOptions option=new FirefoxOptions();
		
		option.setPlatformName("LINUX");
		driver=new RemoteWebDriver(new URL("http://localhost:4444"),  option);
	    
	
	
	
	}else {
		
		ChromeOptions option=new ChromeOptions();
		option.setPlatformName("LINUX");
		driver=new RemoteWebDriver(new URL("http://localhost:4444"),  option);
		
		
	}
	}
	@Test
	public void test_case() {
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://preprod2.platform.sellermania.com/login");
	
	driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
	driver.findElement(By.name("password")).sendKeys("test");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
	}
	
	
	
	
	
	@AfterTest
	public void tear_down() {
		
		 if(driver !=null) {
		 	  driver.quit();
		
	}
	
	
	
	
	}
}
	
	
	
	

