package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	
	@Test
	public void iframe_methods() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://preprod2.platform.sellermania.com");
		
		driver.findElement(By.xpath("//input[@type='email' or @name='username']")).sendKeys("balaSC@sellermania.com");
		driver.findElement(By.xpath("//input[@type='password' or @name='password']")).sendKeys("test");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText("Inventory")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		// wait until iframe exists in DOM
		wait.until(ExpectedConditions.presenceOfElementLocated(
		    By.id("ug-troubleshooter-iframe")
		));

		// switch to iframe
		WebElement iframe = driver.findElement(By.id("ug-troubleshooter-iframe"));
		driver.switchTo().frame(iframe);

		// interact inside iframe
		WebElement ug = driver.findElement(By.id("userguiding"));
		System.out.println("Iframe content loaded");

		// switch back
		driver.switchTo().defaultContent();

        WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ug-modal-frame")));
        
        WebElement iframe1 = driver.findElement(By.id("ug-modal-frame"));
        driver.switchTo().frame(iframe1);
        
        System.out.println("Iframe content loaded");
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
