package testcases;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import base.driverinitialization;
import pages.orderpage;

public class Ordertest extends driverinitialization {

	private final static org.apache.logging.log4j.Logger logger = LogManager.getLogger(Ordertest.class);

	@Test(dependsOnMethods = { "testcases.Logintest.login_test" })
	public void orderpage() throws AWTException {

		orderpage op = new orderpage();
		logger.info("order menu opening");
		op.clickordermenu();
		

		// op.legacypage();
		logger.info("Advance filter opening & AZ order getting filtered");
		op.clickadvancefilter();

		logger.info("Clicking the AZ order to see details");
		op.clickorderId();

		logger.info("Filling shipping_address");
		// -----order_details
		op.shipping_address("test", "france", "pondicherry", "paris", "606 103", "FRANCE");

		// -------------billing_address
		logger.info("Filling billing_address");

		op.billing_address_details("test", "pondi", "605 011", "FRANCE");

		logger.info("view slip/label/invoice pdf");
		// -----print bill
		op.invoice();
		driverinitialization.getDriver().navigate().back();
		op.add_comment("testing in progress");

		op.clickordermenu();
		// driver.navigate().back();
		// driver.navigate().back();
		op.clickadvancefilter();

		op.choose_az_order();

		logger.info("click select an action button");
		op.action();

		logger.info("changing the status");

		op.dialogue_confirm();

		logger.info("order confirmed");
		logger.info("order pick list printing");

		op.pick_list();
		logger.info("order packing_slip printing");

		op.packing_slip();
		logger.info("order labels are printing ");

		op.print_labels();
		logger.info("order invoice printing ");

		op.print_invoice();

		logger.info("order export downloading ");

		op.single_export();

		logger.info("order comment add & delete ");

		op.add_a_comment_through_order_list("test in progress");

	}

}


