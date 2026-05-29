package Assertion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sku_list {

	@Test
	public void Get_sku_names() throws FileNotFoundException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://preprod2.platform.sellermania.com");
		WebElement username = driver.findElement(By.name("email"));
		username.isEnabled();
		username.sendKeys("balaSC@sellermania.com");
		// Assert.assertFalse(username);

		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.linkText("Inventory")).click();

		
		
		
		List<WebElement> skus = driver.findElements(By.xpath("//span[@class='text-muted sku']"));

		System.out.println(skus.size());

		for (WebElement sku_names : skus) {
			System.out.println(sku_names.getText());
		}

		
		driver.findElement(By.linkText("File management")).click();
		
		List<WebElement> export=driver.findElements(By.xpath("//div[contains(text(),'inventory_export')]"));
		
		System.out.println(export.size());
		
		try {
			for(WebElement export_names:export) {
				System.out.println(export_names.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
