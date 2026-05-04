package broken_image_links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wetransform_page_broken_check {

	
	@Test
	public void wetransform() {
	
		WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://preprod2.platform.sellermania.com/");
	
	driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
	driver.findElement(By.name("password")).sendKeys("test");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	WebElement we_transform_menu=driver.findElement(By.linkText("WeTransform (Beta)"));
	we_transform_menu.isEnabled();
	we_transform_menu.click();
	
	driver.findElement(By.xpath("//h3[text()='Your feed history']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
