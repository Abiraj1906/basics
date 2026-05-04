package windowhandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {

	
	@Test
	public void window_handle() throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--Ingognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://gmail.com");
		
		 String parent=driver.getWindowHandle();
		 System.out.println(parent);

		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		
        Set<String> allwindow=driver.getWindowHandles();
        for(String child:allwindow) {
        	System.out.println(child);
        	}
        Thread.sleep(2000);
        	driver.switchTo().window(parent);
    		System.out.println(driver.getTitle());
          
    	List<String> list=new ArrayList<String>(allwindow);
    	driver.switchTo().window(list.get(2));
    		System.out.println(driver.getTitle());
    		
    		driver.findElement(By.linkText("Terms of Service")).click();
    		
    		driver.findElement(By.linkText("services")).click();
    		JavascriptExecutor js=(JavascriptExecutor) driver;
    		js.executeScript("window,scrollBy(0,1000)");
    		
        }
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

