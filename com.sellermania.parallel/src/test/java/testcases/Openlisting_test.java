package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;

import base.driverinitialization;
import pages.openlisting_page;

public class Openlisting_test extends driverinitialization {

	private final static org.apache.logging.log4j.Logger logger = LogManager.getLogger(Openlisting_test.class);

	// @Test(dependsOnMethods = {"testcases.Filemanagement_cases.file_management"})
	@Test(dependsOnMethods = { "testcases.Wereprice_test.werepricetest" })

	public void openlistingtest() {

		openlisting_page open = new openlisting_page();
		logger.info("opening openlisting  fro Rakuten mkp");
		open.rakuten_mkp(10, 20);
		logger.info("opening openlisting for Fnac FR");

		open.fnac_fr(10, 20);
		logger.info("openlisting finished successfully");
	}

}
