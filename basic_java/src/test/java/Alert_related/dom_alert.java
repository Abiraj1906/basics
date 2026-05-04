package Alert_related;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dom_alert {

	
	@Test
	public void os_window_file_upload() throws AWTException, InterruptedException {
		

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://preprod2.platform.sellermania.com/");
		
		driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		driver.findElement(By.linkText("File management")).click();
		driver.findElement(By.linkText("Send a file in txt format")).click();
		
		driver.findElement(By.id("loadFileBtn")).click();
		driver.findElement(By.name("upload_txt[file]")).sendKeys("/home/sellerp26/Abirajsellermania/csv files/preprod_invup.csv");
		
		
		Thread.sleep(1000);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
