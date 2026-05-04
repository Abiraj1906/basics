package broken_image_links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class broken_image {

	@Test
	public void find_broken_image() {
	
		WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://membres.sellermania.com");
	
	driver.findElement(By.name("email")).sendKeys("picoSC@yopmail.com");
	driver.findElement(By.name("password")).sendKeys("Caid_6518");
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	List<WebElement>images=driver.findElements(By.tagName("img"));
	System.out.println("Total images"+images.size());
	
	
	for(WebElement img: images) {
		String imageURL=img.getAttribute("src");
		
		if (imageURL == null || imageURL.isEmpty()) {
            System.out.println("Image src is empty");
            continue;
        }
		
		try {
			URL url=new URL(imageURL);
			HttpURLConnection httpconn=(HttpURLConnection) url.openConnection();
			
			httpconn.setConnectTimeout(3000);
			httpconn.connect();
			
			if(httpconn.getResponseCode()==200) {
				System.out.println("Broken image"+imageURL+"  "+httpconn.getResponseMessage());
			}
			
			
		} catch (Exception e) {
			System.out.println("Broken image"+imageURL);
		}
	}
	
	
	
	
	
	driver.quit();
	
	
	
	}
	
}
