package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.driverinitialization;
import utilities.waitutills;

public class Wereprice_page {

	WebDriver driver;

	// constructor
	public Wereprice_page() {
		 this.driver=driverinitialization.getDriver();
		PageFactory.initElements(driver, this);

	}

	// strategy_parameters
	@FindBy(linkText = "WeReprice")
	private WebElement wereprice;

	@FindBy(linkText = "Add a strategy")
	private WebElement add_strategy;

	@FindBy(id = "stratNameInput")
	private WebElement s_name;

	@FindBy(how = How.XPATH, using = "//span[text()='Validate and go to next step']/parent::button")
	private WebElement validate_1st_step;

	// sku_criterion
	@FindBy(xpath = "//label[text()='Apply only on skus that meet those conditions ']")
	private WebElement sku_meet_condition;

	@FindBy(xpath = "//textarea[starts-with(@id,'input-v-')]")
	private WebElement sku_list;

	@FindBy(xpath = "//button[text()=' Add a new filter group']")
	private WebElement filter_create;

	@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-arrow-right')]")
	private WebElement sku_criterion_submit;

//	@FindBy(how = How.XPATH,using = "//button[.//span[text()='Validate and go to next step']]")
//	private private WebElement validate_2nd_step;

	@FindBy(xpath = "//label[text()='All item conditions']")
	private WebElement condition_filter;

	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[2]/child::span")
	private WebElement validate_3rd_step;

	// 4th step

	@FindBy(id = "simplifySelected")
	private WebElement cheapest;

	@FindBy(xpath = "(//input[@type='text'])[38]")
	private WebElement common_value;

	@FindBy(xpath = "//span[text()='Validate and Save']")
	private WebElement validate_save;

	// Repricing schedule_page
	@FindBy(linkText = "schedule your repricings")
	private WebElement pricing_schedule;

	@FindBy(linkText = "Cancel")
	private WebElement cancel_button;

	// Action methods for POM

	public void wereprice_menu() {
		wereprice.click();
	}

	public void first_step(String strategy_name) {
		add_strategy.click();
		s_name.sendKeys(strategy_name);
		validate_1st_step.click();

	}

	// sku_criterion

	public void second_step(String sku) {
		sku_meet_condition.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", filter_create);
		filter_create.click();

		sku_list.sendKeys(sku);
		js.executeScript("arguments[0].scrollIntoView(true);", sku_criterion_submit);

		sku_criterion_submit.click();

	}
	// 3rd step_competitor_condition_filter

	public void third_step() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		condition_filter.click();
		js.executeScript("arguments[0].scrollIntoView(true);", validate_3rd_step);
		validate_3rd_step.click();
	}

	// 4th step of the strategy page

	public void fourth_step(int num) {
		cheapest.click();
		common_value.sendKeys(String.valueOf(num));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", validate_save);

		validate_save.click();
	}

//pricing_schedule_page
	public void pricing_schedule() {
		waitutills.waitForClickable(driver,  pricing_schedule);
		pricing_schedule.click();
		cancel_button.click();
	}

}
