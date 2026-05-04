
package test;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action_double_click {

	
	@Test
	public void double_click() throws InterruptedException, AWTException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
//		org.openqa.selenium.Point position=new org.openqa.selenium.Point(0, 0);
//		driver.manage().window().setPosition(position);
//	
		
		
		driver.get("https://preprod2.platform.sellermania.com/login");
		
		driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.linkText("Inventory")).click();
		driver.findElement(By.name("q[simple_search][value]")).sendKeys("sku_test");
		driver.findElement(By.xpath("//button[@type='submit']/child::i")).click();
		
		Actions ac=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement element=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-sku='736b755f74657374']")));
		
		ac.doubleClick(element).perform();
	
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element1=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='12']")));
		
	try {
		element1.clear();
		driver.findElement(By.xpath("(//button[text()='Cancel']/parent::div)[34]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='20';", element1);
		
		driver.findElement(By.linkText("Inventory")).click();

	} catch (Exception e) {
       System.out.println("exception"+e.getMessage());
	}
		
		
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
