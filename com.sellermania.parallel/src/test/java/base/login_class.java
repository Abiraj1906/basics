package base;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_class {

	
		
		@Test(dataProvider = "LoginData",dataProviderClass = Dataprovider.class)
		
		public void login_multi_data_validation(String username,String password) throws IOException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://preprod2.platform.sellermania.com");
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			String expectedurl="Dashboard";
			String actualurl=driver.getCurrentUrl();
			if(actualurl.equalsIgnoreCase(expectedurl)) {
				System.out.println("login success"+actualurl);
			}else {
				System.out.println("login failed"+actualurl);
			}
			
			
			
			
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("./sample.png");
			FileUtils.copyFile(screenshot, dest);
			
			
			
			
			driver.close();
			
		}
		public static void main(String[] args) throws IOException {
      
			login_class lc=new login_class();
			//lc.login_multi_data_validation(, null);
			
			
	}

}
