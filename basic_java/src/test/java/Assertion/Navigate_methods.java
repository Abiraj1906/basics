package Assertion;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.BiDi;
import org.openqa.selenium.bidi.Connection;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_methods {

	private WebDriver driver;
	
	
	@Test
	public void navigate() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
	
		
		Set<Cookie> cookies_name=driver.manage().getCookies();
		 for(Cookie cookie:cookies_name) {
			 System.out.println(cookie);
		 }
	
	
	
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));

		  WebElement search_box=driver.findElement(By.name("q"));
		 boolean x= search_box.isDisplayed();
		  boolean y=search_box.isEnabled();
		  
	System.out.println(x+"   "+y);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
