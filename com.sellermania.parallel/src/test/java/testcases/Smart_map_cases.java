package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.driverinitialization;
import pages.Smart_map_pages;

public class Smart_map_cases extends driverinitialization {

	
	@Test(dependsOnMethods = { "testcases.Setting_cases.Setting_test" })
	public void smart_map_cases() {

		Smart_map_pages sm = new Smart_map_pages();
		sm.smart_map_menu();
		sm.input_feed("test", "/home/sellerp26/Abirajsellermania/csv files/mapper file/wt inventoryAZ.csv");

	}

}
