package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import base.driverinitialization;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginpage;

public class Logintest extends driverinitialization {

	private final static Logger logger = LogManager.getLogger(Logintest.class);
	
	@Test
	public void login_test() {

		
		loginpage login = new loginpage(getDriver());
		login.Login_pages("balaSC@sellermania.com", "test");

//		String actual_title="Sellermania Platform";
//		String expected_title=driver.getTitle();
//		
//		if(actual_title.equalsIgnoreCase(expected_title)) {
//			System.out.println("login successfull");
//		}else {
//			System.out.println("login not successfull");
//		}
//		
		AssertJUnit.assertEquals(getDriver().getTitle(), "Sellermania Platform");
		
		
		logger.info("login successfull");
	}

}
