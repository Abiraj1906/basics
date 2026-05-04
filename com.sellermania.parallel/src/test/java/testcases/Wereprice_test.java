package testcases;

import org.testng.annotations.Test;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.driverinitialization;
import pages.Wereprice_page;

public class Wereprice_test extends driverinitialization {

	private final static Logger logger = LogManager.getLogger(Wereprice_test.class);

	// @Test(dependsOnMethods = {"testcases.Openlisting_test.openlistingtest"})
	@Test(dependsOnMethods = { "testcases.Filemanagement_cases.file_management" })

	// @Test(dependsOnMethods = {"testcases.Logintest.loginpage"})

	public void werepricetest() {

		Wereprice_page strategy = new Wereprice_page();

		
		logger.info("Wereprice menu opening");
		strategy.wereprice_menu();
		strategy.first_step("s_name");
		strategy.second_step("sku_one");

		strategy.third_step();

		strategy.fourth_step(5);

		logger.info("Strategy created successfully");

		strategy.pricing_schedule();

		logger.info("Pricing schedule page open & closed successfully");

	}

}
