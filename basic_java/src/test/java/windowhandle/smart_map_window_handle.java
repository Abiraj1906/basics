package windowhandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class smart_map_window_handle {

	
	@Test
	public void smart_map() {
		
	
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
//	org.openqa.selenium.Point position=new org.openqa.selenium.Point(0, 0);
//	driver.manage().window().setPosition(position);
//
	
	
	driver.get("https://preprod2.platform.sellermania.com/login");
	
	driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
	driver.findElement(By.name("password")).sendKeys("test");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String parent_window=driver.getWindowHandle();
	System.out.println(parent_window);
	
	driver.findElement(By.linkText("Smart Map")).click();
    Set<String> child_window=driver.getWindowHandles();
    System.out.println(child_window);
	
    for(String child:child_window) {
    	if(!parent_window.equals(child)) {
    		driver.switchTo().window(child);
    	}
    	
		System.out.println(driver.getTitle());

    }
	System.out.println(driver.getTitle());

	driver.findElement(By.xpath("//span[text()='Add an input feed']")).click();
	
	
	
	
	
	
	
	
	
	}
	
}
