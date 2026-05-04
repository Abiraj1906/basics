package testcases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.driverinitialization;
import pages.Filemanagement;

public class Filemanagement_cases extends driverinitialization{
 

  org.apache.logging.log4j.Logger logger=LogManager.getLogger(Filemanagement_cases.class);
  
 // @Test(dependsOnMethods = {"testcases.Logintest.loginpage"})
 @Test(dependsOnMethods = {"testcases.Inventorytest.inventorypage"})
 
 public void file_management() throws AWTException {
	
	 
	Filemanagement fm=new Filemanagement();
	
	
	logger.info("File management opening");
	fm.File_management_page();
	fm.send_file_in_txtformat();
	fm.upload_your_file_manually();
	fm.choose_file_toupload("/home/sellerp26/Abirajsellermania/csv files/add az fr 1.csv");
	fm.confim_button();
	
	logger.info("file upload successfully");

	
	
	logger.info("Export file clicking");
	fm.excel_export();
	fm.export_dropdown_list();
    fm.export_count();   
	logger.info("Export file downloading");
   
	
	
	 
	
 }
	
}