package base;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExtentReportListener;

public class driverinitialization {
	// public static WebDriver driver;
	Properties conpro;
	private final static Logger logger = LogManager.getLogger(driverinitialization.class);

	/*
	 * Logger is an interface provided by Log4j. It provides methods like:
	 * logger.info() logger.debug() logger.error() logger.warn() LogManager is a
	 * factory class.
	 * 
	 */

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	// ✅ Getter (VERY IMPORTANT)
	public static WebDriver getDriver() {
		return driver.get();
	}

	@BeforeTest
	@Parameters("browser")
	public void login_setup(String browser) throws FileNotFoundException, IOException, AWTException {

		conpro = new Properties();
		conpro.load(new FileInputStream(
				"/home/sellerp26/Abiraj_project/com.maven_lifecycle/src/test/resources/config.properties"));

		String url = conpro.getProperty("url");
		WebDriver localDriver;
		
		URL gridUrl=new URL("http://localhost:4444/wd/hub");
		
		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			
			DesiredCapabilities cap=new DesiredCapabilities();
			
			cap.setBrowserName("chrome");
			
			

			localDriver = new RemoteWebDriver(gridUrl,cap);

		} else {
			WebDriverManager.firefoxdriver().setup();
			
			DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setBrowserName("firefox");

	        localDriver = new RemoteWebDriver(gridUrl, cap);

		}

		logger.info("**** Browser Launched in Thread: " + Thread.currentThread().getId() + " ****"+"browser"+browser);

		// ✅ Assign driver to current thread
		driver.set(localDriver);

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().get(url);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@AfterTest
	public void teardown() {

		if (getDriver() != null) {
			getDriver().quit();
			driver.remove();
		}
	}
}

// Cross browser testing purpose
//package base;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.net.URL;
//import java.time.Duration;
//import java.util.Properties;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.model.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.loginpage;
//import testcases.Ordertest;
//import utilities.ExtentReportListener;
//
//public class driverinitialization {                           
// public static WebDriver driver;
//
//public  Logger logger=LogManager.getLogger(driverinitialization.class);
//private static ThreadLocal<WebDriver> test1=new ThreadLocal<>();
//
//@Parameters({"browser", "url"})
//@BeforeTest
//public void login_setup(String browser,String url) throws FileNotFoundException, IOException, AWTException {
//	  
//test1.set(driver);
//logger=LogManager.getLogger(this.getClass());
//	  switch (browser.toLowerCase()) {
//	  
//	  case "chrome":
//		   driver=new ChromeDriver();
//		   WebDriverManager.chromedriver().setup();
//		   break;
//	  
//	  case "firefox":
//		   WebDriverManager.firefoxdriver().setup();
//		   driver=new FirefoxDriver();
//		   break;
//	  
//	  default:
//		   throw new IllegalArgumentException("Invalid browser"+browser);
//	  
//	  }
//	  
//	 driver.manage().window().maximize();
//	 driver.get(url);
//	  
//	 
//}
//
//
//
//
//	  
//	  @AfterTest
//
//public void teardown() {
//		  
//		  if(driver !=null) {
// 	  driver.quit();
//   }
//	  }
//}
//	
