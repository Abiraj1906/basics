package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	ExtentSparkReporter spark;
	ExtentReports report;
	ExtentTest test;
	
	@Test
	public void add_cart() throws IOException {
		
		
		spark=new ExtentSparkReporter("./sample.html");
		spark.config().setDocumentTitle("AZ checkout");
		spark.config().setReportName("Abiraj");
		spark.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(spark);

		
		test=report.createTest("test starting");
		test.assignAuthor("Abiraj");
		
		
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option=new FirefoxOptions();
		String browsername=option.getBrowserName();
		System.out.println(browsername);
		
		String browserversion=option.getBrowserVersion();
		System.out.println(browserversion);
		
		
		option.addArguments("window-size=500,500");
		
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirt");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
			
		driver.findElement(By.xpath("//img[contains(@alt,'Chuppa Rustum Men’s Oversized')]")).click();
		Set<String> child=driver.getWindowHandles();
		
		List<String> list=new ArrayList<String>(child);
		driver.switchTo().window(list.get(1));
		System.out.println(list);
		
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String dest=new String("./amazon.png");
		
	
		FileUtils.copyFile(screenshot, new File( dest));		
		test.addScreenCaptureFromPath(dest);
		
		
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.findElement(By.name("proceedToRetailCheckout")).click();
	
		report.flush();
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
