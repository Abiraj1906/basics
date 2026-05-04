package cross_browser;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class group_annotation {


	WebDriver driver;
	
	@BeforeSuite
	public void set_up() throws MalformedURLException {
	
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://preprod2.platform.sellermania.com/login");
		
	}
	
	@Test(groups={"smoke"})
	public void test_case() {
	
	
	
	driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
	driver.findElement(By.name("password")).sendKeys("test");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
   Assert.assertEquals("Sellermania Platform", driver.getTitle());
	
	}
	
	@Test(dependsOnMethods = "test_case")
	public void test_case1() {
		
		driver.findElement(By.linkText("Orders")).click();
		Select element=new Select(driver.findElement(By.name("seller_filter_global[firstParam][searchBy]")));
		List<WebElement> dropdown=element.getOptions();
		for(WebElement  num:dropdown) {
			System.out.println(num);
		}
		
		element.selectByVisibleText("Order number");
		driver.findElement(By.name("seller_filter_global[firstParam][search]")).sendKeys("aztest");
		driver.findElement(By.id("goSimpleSearch")).click();
		
		
		
		System.out.println("simple search happened successfully");
	}
	
	
	
	@AfterSuite
	public void tear_down() {
		
		 if(driver !=null) {
		 	  driver.quit();
		
	}
	
	
	
	
	}
}




























