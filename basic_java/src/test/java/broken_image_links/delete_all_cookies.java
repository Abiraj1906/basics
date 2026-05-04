package broken_image_links;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class delete_all_cookies {

	@Test
	public void delete_cookies() {
		
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1366, 768));

		driver.manage().window().setPosition(new Point(0, 0));

		driver.get("https://preprod2.platform.sellermania.com/login");
         
		
	}
	
	
	
	
	
	
	
}
