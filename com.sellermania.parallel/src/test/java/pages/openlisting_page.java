package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.driverinitialization;
import utilities.waitutills;

public class openlisting_page {

	public WebDriver driver;
	//constuctor
	public openlisting_page(){
		 this.driver=driverinitialization.getDriver();
		PageFactory.initElements(driver,this);
	}
	
	//POM for openlisting page
	
	@FindBy(linkText = "Importing your inventory")
	private WebElement openlisting_menu;
	
	@FindBy(linkText = "Rakuten")
	private WebElement rakuten_mkp;
	
	@FindBy(id = "customer_inventory_wishedPricePercentage")
	private WebElement wp;
	
	@FindBy(id = "customer_inventory_bottomLimitPricePercentage")
	private WebElement blp;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(linkText = "Check the success of your import")
	private WebElement success_report;
	
	
	
	//Fnac FR openlisting
	@FindBy(linkText = "Fnac FR")
	private WebElement fnac_fr_mkp;
	
	
	
	
	
	
	
	
	
	//Action method for each POM
	public void rakuten_mkp(int amount,int blp_amount) {
		openlisting_menu.click();
		rakuten_mkp.click();
		wp.sendKeys(String.valueOf(amount));
		blp.sendKeys(String.valueOf(blp_amount));
		submit.click();
		success_report.click();
	
	}	
	
	public void fnac_fr(int amount,int blp_amount) {
		openlisting_menu.click();
		fnac_fr_mkp.click();
		wp.sendKeys(String.valueOf(amount));
		blp.sendKeys(String.valueOf(blp_amount));
		submit.click();
		success_report.click();
		
	}
	
	
	
	
	
	
	
	
	
	
}
