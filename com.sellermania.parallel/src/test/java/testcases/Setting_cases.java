package testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.driverinitialization;
import pages.Setting_page;

public class Setting_cases extends driverinitialization {

	private final static Logger logger = LogManager.getLogger(Setting_cases.class);

	@Test(dependsOnMethods = { "testcases.Openlisting_test.openlistingtest" })

	// @Test(dependsOnMethods = {"testcases.Logintest.loginpage"})
	public void Setting_test() {

		Setting_page sp = new Setting_page();

		
		logger.info("Settings menu opening");

		sp.Settings_menu();
		logger.info("Seller profile opening");

		sp.Seller_profile(100, 50);

		logger.info("Order_preferences menu opening");

		sp.Order_preferences("abirajg@sellermania.com", "test@gmail.com", "test@gmail.com", "test@gmail.com", "testing", "test", "test", "pondi", "606103", "+91");

		logger.info("Push_preferences menu opening");

		sp.Push_preferences();
		driverinitialization.getDriver().navigate().back();

		logger.info("Marketplaces connection menu opening");

		sp.Mkp_connection();

		// (dependsOnMethods = {"testcases.Wereprice_test.werepricetest"})
		// (dependsOnMethods = {"testcases.Logintest.loginpage"})
	}

}
