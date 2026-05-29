package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_use {

	
	
	
	@Test
	
	public void Navigate_to() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.navigate().to("https://preprod2.platform.sellermania.com");
		driver.navigate().forward();
		
		WebElement username = driver.findElement(By.name("email"));
		username.isEnabled();
		username.sendKeys("balaSC@sellermania.com");
		// Assert.assertFalse(username);

		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
