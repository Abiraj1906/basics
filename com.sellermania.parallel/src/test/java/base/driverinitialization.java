
//  Cross browser testing purpose
package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginpage;
import testcases.Ordertest;
import utilities.ExtentReportListener;

public class driverinitialization {

	public Logger logger = LogManager.getLogger(this.getClass());

// ThreadLocal WebDriver
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public WebDriver login_setup(String browser, String url) throws FileNotFoundException, IOException, AWTException {

		logger.info("Launching browser:" + browser);
		switch (browser.toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());           // ✅ set driver to current threa
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
			break;

		default:
			throw new IllegalArgumentException("Invalid browser" + browser);

		}

		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().get(url);

		return getDriver();
	}

// Getter for ThreadLocal driver
	public static  WebDriver getDriver() {
		return driver.get();                             // ✅ return driver for current thread
	}



	@AfterMethod
	 // Quit driver
    public void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove(); // VERY IMPORTANT       // ✅ remove thread data (VERY IMPORTANT)
        }
    }
	
}
