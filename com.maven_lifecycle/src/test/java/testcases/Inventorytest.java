package testcases;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import base.driverinitialization;
import pages.Inventorypage;

public class Inventorytest extends driverinitialization {
	private final static Logger logger = LogManager.getLogger(Inventorytest.class);

	//@Test(dependsOnMethods = { "testcases.Ordertest.orderpage" })
  @Test(dependsOnMethods = { "testcases.Logintest.login_test" })

	public void inventorypage() throws InterruptedException {

		Inventorypage ip = new Inventorypage(getDriver());

		logger.info("Inventory menu opening");
		ip.inventorymenu();
		// ip.advancefilter_actions();

		String actual = getDriver().getCurrentUrl();
		String expected = "/inventory";

		try {

			if (actual.contains(expected)) {
				System.out.println("inventory mnu opened" + getDriver().getCurrentUrl());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
//	js.executeScript("window,scrollBy(0,500)");

		logger.info("Add item menu opening");

		ip.additempage("9782259207324");

		logger.info("Listing details filling");

		ip.Listing("sku_test_510", 5, "test", 100, 50, 2);

		js.executeScript("window,scrollBy(0,2000)");

		logger.info("LCF opening");
		// -----------------------LCF
		logger.info("LCF details filling for all mkp's");

		ip.LCF_click();

		ip.allegro_details(100);

		// js.executeScript("window,scrollBy(0,1000)");
		ip.az_au_details(100);
		ip.az_be_details();
		ip.az_ca_details(100);
		ip.az_de_details();
		ip.az_es_details();
		ip.az_fr_details();
		ip.az_gb_details(100);
		ip.az_ie_details();
		ip.az_in_details(100);
		ip.az_it_details();
		ip.az_jp_details(100);
		ip.az_mx_details(100);
		ip.az_nl_details();
		ip.az_pl_details(100);

		ip.az_sa_details(100);
		ip.az_se_details(100);
		ip.az_sg_details(100);
		ip.az_tr_details(100);
		ip.az_us_details(100);

		logger.info("AZ all locale's LCF filled");

		ip.animalis_details(100, 2);

		logger.info("animalis LCF filled");

		ip.atlas4men_details(100, 2);
		logger.info("atlas4men LCF filled");

		ip.bhv_details(100, 2);
		logger.info("bhv LCF filled");

		ip.bm_details(1);

		ip.auchan_details(2);
		logger.info("auchan LCF filled");

		ip.bol_details(7);
		logger.info("bol LCF filled");

		ip.boulanger_details(6);
		logger.info("boulnager LCF filled");

		ip.bulevip_details(100);
		ip.but_details(100);

		ip.lcf_cd(2);
		logger.info("cd LCF filled");

		ip.conforama_details();
		logger.info("conforama LCF filled");

		ip.conrad_details(1);
		logger.info("conrad details filled");
		
		ip.cultura_details();
		logger.info("cultura LCF filled");

		ip.decathlon_details(2);
		logger.info("decathlon LCF filled");

//		ip.ebay_details();
//		logger.info("ebay LCF filled");

		ip.fnac_details();
		logger.info("fnac LCF filled");

		ip.galeriesLafayette_details();
		logger.info("galeriesLafayette LCF filled");

		ip.ldlc_details(6);
		logger.info("ldlc LCF filled");

		ip.laredoute_details(2);
		logger.info("laredoute LCF filled");

		ip.lbc_details(10, 7, 100);
		logger.info("lbc LCF filled");

		ip.manor_details(100);

		logger.info("manor LCF filled");

		ip.medi_at_details();
		ip.medi_be_details();
		ip.medi_de_details();
		ip.medi_es_details();
		ip.medi_it_details();
		ip.medi_nl_details();
		ip.medi_pl_details(100);
		logger.info("Mediamarkt LCF filled");

		ip.pix_details(6);
		logger.info("pixmania LCF filled");

		ip.qbp_details(7,1);
		logger.info("Qbp LCF filled");

		ip.lcf_rakuten("test");
		logger.info("rakuten LCF filled");

		ip.lcf_refurbed();
		logger.info("refurbed LCF filled");

		ip.showroomprive_details(100, 200, 300, 400);
		ip.temu_details("123456789102587", 100, 1000);

		ip.ubaldi_details(7, 10, 6);
		logger.info("ubaldi LCF filled");

		ip.zalando_ch_details(100);
		ip.zalando_cz_details(100);
		ip.zalando_dk_details(100);
		ip.zalando_gb_details(100);
		ip.zalando_hr_details(100);
		ip.zalando_hu_details(100);
		ip.zalando_no_details(100);
		ip.zalando_pl_details(100);
		ip.zalando_ro_details(100);
		ip.zalando_se_details(100);

		logger.info("zalando LCF details added");

		ip.lcf_submit();

		ip.success();
		logger.info("SKU created successfully");

		// Thread.sleep(10000);
//		ip.inventorymenu();
//		ip.double_click_quantity_update("sku_test", 50);

	}

}