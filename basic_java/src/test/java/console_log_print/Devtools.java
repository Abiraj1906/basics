package console_log_print;

import java.time.Duration;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Devtools {

	
	@Test
	public void devtools_logs() {
		

//		LoggingPreferences logs=new LoggingPreferences();
//		logs.enable(LogType.BROWSER, Level.ALL);
//		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.preprod2.platform.sellermania.com");
//		
//
//		driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys("balaSC@sellermania.com");
//		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("test");
//        driver.findElement(By.xpath("//input[@name='email']/ancestor::form//button[@type='submit']")).click();
		
		LoggingPreferences logprefs=new LoggingPreferences();
		logprefs.enable(LogType.BROWSER, Level.ALL);
		
		ChromeOptions options=new ChromeOptions();
		options.setCapability("goog:loggingprefs",logprefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		
         //get browser console logs
		LogEntries entry=driver.manage().logs().get(LogType.BROWSER);
        
        for(org.openqa.selenium.logging.LogEntry log:entry) {
        	System.out.println(log.getLevel()+"  "+log.getMessage());
        }
        
        driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
