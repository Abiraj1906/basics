package base;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_links {

	
	@Test
	public void find_broken_links() {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://preprod2.platform.sellermania.com/login");
		
		driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total links"+links.size());

		for(WebElement link:links) {
			
			String linkURL=link.getAttribute("href");
			//System.out.println(linkURL);
			
			if(linkURL==null||linkURL.isEmpty()) {
				System.out.println("Link href is empty");
                continue;
			}
			
			
		try {
			URL url=new URL(linkURL);
			HttpURLConnection httpconnection=(HttpURLConnection) url.openConnection();
			httpconnection.setConnectTimeout(3000);
			httpconnection.connect();
			
			if(httpconnection.getResponseCode()==200) {
				System.out.println("broken links"+linkURL+"  "+httpconnection.getResponseMessage());
			}
			
			
		} catch (Exception e) {
			System.out.println("broken link"+linkURL);
		}	
			
		
			
		}
		
		
		
		driver.quit();
	}
	
	
	
	
	
}
