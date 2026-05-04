package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.driverinitialization;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginpage;
import utilities.ExcelUtil;

public class Logintest extends driverinitialization {

	private final static Logger logger = LogManager.getLogger(Logintest.class);
	
	@Test
	public void login_test() {

		
		loginpage login = new loginpage(driverinitialization.getDriver());
		login.Login_pages("balaSC@sellermania.com", "test");

		logger.info("login successfull");
	}

}
