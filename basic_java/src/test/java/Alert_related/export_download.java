package Alert_related;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class export_download {

	
	
	@Test
	public void download_export() {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://preprod2.platform.sellermania.com/");
		
		driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		driver.findElement(By.linkText("File management")).click();
		
		List<WebElement> element=driver.findElements(By.xpath("//a[contains(@href,'inventory/export/download')]"));
		System.out.println(element.size());
		
		if(element.size()>=5) {
			element.get(3).click();
			
			
		}else {
			System.out.println("element is more than 5");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
