package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.driverinitialization;
import utilities.File_download;
import utilities.waitutills;

public class orderpage {
	WebDriver driver;

//constructor
	public orderpage() {
		 this.driver=driverinitialization.getDriver();
		PageFactory.initElements(driver, this);// mandatory step for initiating element

	}

	// locators
	@FindBy(linkText = "Orders")
	private WebElement ordermenu;

	@FindBy(linkText = "Return to the previous version")
	private WebElement previouspage;

	@FindBy(how = How.XPATH, using = "//button[@id='filterBtn']")
	private WebElement advancefilter;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> allorderbutton;

	@FindBy(xpath = "//input[starts-with(@id,'seller_filter_global_marketplace')]")
	private List<WebElement> website_checkbox;

	@FindBy(id = "apply-filter")
	private WebElement confirmbutton;

	@FindBy(linkText = "azorder")
	private WebElement orderid;
	// ------shipping address

	@FindBy(how = How.XPATH, using = "(//a[@class='btn btn-outline-primary'])[1]")
	private WebElement shipping_details;

	@FindBy(id = "seller_customer_seller_orders_info_buyer_buyerName")
	private WebElement customer_name;

	@FindBy(id = "seller_customer_seller_orders_info_buyer_recipientName")
	private WebElement dispatch_from;

	@FindBy(id = "seller_customer_seller_orders_info_buyer_shipAddress1")
	private WebElement address1;

	@FindBy(id = "seller_customer_seller_orders_info_buyer_shipCity")
	private WebElement city1;

	@FindBy(id = "seller_customer_seller_orders_info_buyer_shipZip")
	private WebElement zip1;

	@FindBy(id = "seller_customer_seller_orders_info_buyer_shipCountry")
	private WebElement country1;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement validate;

//-------------billing_address

	@FindBy(how = How.XPATH, using = "(//a[@class='btn btn-outline-primary'])[2]")
	private WebElement billing_details;

	@FindBy(id = "customer_seller_orders_info_bill_billAddress1")
	private WebElement address2;

	@FindBy(id = "customer_seller_orders_info_bill_billCity")
	private WebElement city2;

	@FindBy(id = "customer_seller_orders_info_bill_billZip")
	private WebElement zip2;

	@FindBy(id = "customer_seller_orders_info_bill_billCountry")
	private WebElement country2;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement validate1;

// print slip	

	@FindBy(xpath = "(//button[@role='button']/parent::div)[2]")
	private WebElement print_slip;

	@FindBy(linkText = "Print slip with prices")
	private WebElement print_slip_with_price;

	@FindBy(linkText = "Print slip without prices")
	private WebElement print_slip_without_price;

	// Print label
	@FindBy(linkText = "Print label")
	private WebElement order_label;

	// ------------print bill
	@FindBy(how = How.LINK_TEXT, using = "Print bill")
	private WebElement print_bill;

	// Add_comment
	@FindBy(id = "comments_specialComments")
	private WebElement comment_order;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submit_comment;

	@FindBy(xpath = "//div[@class='alert alert-success']/parent::div")
	private WebElement comment_added_msg;

	// order confirmation
	@FindBy(how = How.ID, using = "orders-checkbox-1")
	private WebElement checkboxaz;

	@FindBy(xpath = "(//button[@role='button'])[2]")
	private WebElement selectanaction;

	@FindBy(how = How.LINK_TEXT, using = "Edit order status")
	private WebElement status;

	@FindBy(how = How.LINK_TEXT, using = "Confirmed")
	private WebElement confirmed;

	@FindBy(id = "modal-button-confirm")
	private WebElement dialogue;

	// print pick list

	@FindBy(linkText = "Print a pick list")
	private WebElement pick_list;

	// print packing slip
	@FindBy(linkText = "Print packing slips")
	private WebElement packing_slip;

	@FindBy(linkText = "Print slip with prices")
	private WebElement print_packing_slip_with_price;

	@FindBy(linkText = "PDF")
	private WebElement pdf_format;

	@FindBy(linkText = "In browser")
	private WebElement browser_format;

	@FindBy(linkText = "Back")
	private WebElement back;

	@FindBy(linkText = "Print slip without prices")
	private WebElement print_packing_slip_without_price;

	// Print labels

	@FindBy(linkText = "Print labels")
	private WebElement print_label;

	@FindBy(linkText = "PDF 1 column")
	private WebElement pdf_1;

	@FindBy(linkText = "PDF 2 columns")
	private WebElement pdf_2;

	@FindBy(linkText = "In browser")
	private WebElement browser_view;

	// print invoices
	@FindBy(linkText = "Print invoices")
	private WebElement invoices;

	@FindBy(linkText = "Print selected invoices")
	private WebElement selected_invoices;

	// Export
	@FindBy(linkText = "Export orders")
	private WebElement export_order;

	@FindBy(linkText = "Export selected orders")
	private WebElement selected_order;

	@FindBy(linkText = "Into excel")
	private WebElement excel_format;

	@FindBy(linkText = "Into csv")
	private WebElement csv_format;

	// Add a comment

	@FindBy(linkText = "Add a comment")
	private WebElement comment_link;

	@FindBy(id = "order_list_add_comment_comment")
	private WebElement comment_box;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement confirm;

	@FindBy(linkText = "Remove a comment")
	private WebElement remove_comment;

	@FindBy(id = "modal-button-confirm")
	private WebElement pop_up_confirm;

//Action class	
	public void clickordermenu() {
		ordermenu.click();
	}

	public void legacypage() {
		previouspage.click();
	}

	public void clickadvancefilter() {
		waitutills.waitForVisibility(driver, advancefilter);
		advancefilter.click();

		try {
			if (allorderbutton.size() > 5) {
				allorderbutton.get(5).click();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		if (website_checkbox.size() >= 5) {
			website_checkbox.get(2).click();
		} else {
			System.out.println("more marketplace checkbox displayed");
		}

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		js.executeScript("arguments[0].scrollIntoView(true);", confirmbutton);
		waitutills.waitForClickable(driver, confirmbutton);
		confirmbutton.click();

	}

	public void clickorderId() {
		waitutills.waitForClickable(driver, orderid);
		orderid.click();

	}

	// -----------------shipping_address
	public void shipping_address(String name, String dis_from, String buy_add, String city, String zip,
			String country) {
        waitutills.waitForClickable(driver, shipping_details);
		shipping_details.click();
		customer_name.sendKeys(name);
		dispatch_from.sendKeys(dis_from);
		;
		address1.sendKeys(buy_add);
		city1.sendKeys(city);
		zip1.sendKeys(zip);
		Select element = new Select(country1);
		element.selectByVisibleText(country);
		validate.click();
	}

	// ---------------------billing_address

	public void billing_address_details(String bill_add, String bill_city, String bill_zip, String bill_country) {
		waitutills.waitForClickable(driver, billing_details);
		billing_details.click();
		address2.sendKeys(bill_add);
		city2.sendKeys(bill_city);
		zip2.sendKeys(bill_zip);
		Select element1 = new Select(country2);
		element1.selectByVisibleText(bill_country);
		validate1.click();

	}

//Invoice details

	public void invoice() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", print_slip);
		waitutills.waitForClickable(driver, print_slip);
		print_slip.click();
		print_slip_with_price.click();
		driver.navigate().back();

		js.executeScript("arguments[0].scrollIntoView(true);", print_slip);
		print_slip.click();

		print_slip_without_price.click();
		driver.navigate().back();

		waitutills.waitForClickable(driver, order_label);
		order_label.click();
		driver.navigate().back();
		waitutills.waitForVisibility(driver, print_bill);

		print_bill.click();
	}

	// comment
	public void add_comment(String comment) {
		waitutills.waitForClickable(driver, comment_order);
		comment_order.sendKeys(comment);
		submit_comment.click();
		String msg = comment_added_msg.getText();
		System.out.println(msg);
	}

//select AZ order perticular checkbox

	public void choose_az_order() {
		waitutills.waitForClickable(driver, checkboxaz);
		checkboxaz.click();
	}

	// Action dropdown

	public void action() {
		waitutills.waitForClickable(driver, selectanaction);
		selectanaction.click();
		status.click();
		confirmed.click();

	}
//Order confirmation

	public void dialogue_confirm() {
		waitutills.waitForClickable(driver, dialogue);
		dialogue.click();
	}

	// print a pick list

	public void pick_list() {
		waitutills.waitForClickable(driver, selectanaction);
		selectanaction.click();
		waitutills.waitForClickable(driver, pick_list);
		pick_list.click();
		driver.navigate().back();
	}

	public void packing_slip() {
		waitutills.waitForClickable(driver, selectanaction);
		selectanaction.click();
		waitutills.waitForClickable(driver, packing_slip);
		packing_slip.click();
		waitutills.waitForClickable(driver, print_packing_slip_with_price);
		print_packing_slip_with_price.click();
		waitutills.waitForClickable(driver, pdf_format);
		pdf_format.click();
		back.click();

//	  selectanaction.click();
//	  packing_slip.click();
//	  print_packing_slip_with_price.click();	  
//	  browser_format.click();
//	  driver.navigate().back();
		waitutills.waitForClickable(driver, selectanaction);

		selectanaction.click();
		packing_slip.click();

		print_packing_slip_without_price.click();
		pdf_format.click();

//	  

//	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//	  wait.until(ExpectedConditions.urlContains("/orders/legacy/slips-download-pdf/html?"));

//      driver.get(currentURL);

		back.click();
	}

	public void print_labels() {
		waitutills.waitForClickable(driver, selectanaction);

		selectanaction.click();
		print_label.click();
		pdf_1.click();
		back.click();
		waitutills.waitForClickable(driver, selectanaction);

		selectanaction.click();
		print_label.click();
		pdf_2.click();
		back.click();

//		selectanaction.click();
//		  String parentwindow=driver.getWindowHandle();
//
//		print_label.click();
//		browser_view.click();
//		
//		Set<String>childwindow=driver.getWindowHandles();
//	      driver.switchTo().window(parentwindow);
	}

	public void print_invoice() {
		waitutills.waitForClickable(driver, selectanaction);

		selectanaction.click();
		invoices.click();
		waitutills.waitForClickable(driver, selected_invoices);

		selected_invoices.click();
		back.click();

	}

	public void single_export() throws AWTException {
		waitutills.waitForClickable(driver, selectanaction);

		selectanaction.click();
		waitutills.waitForClickable(driver, export_order);

		export_order.click();
		selected_order.click();

		excel_format.click();
		File_download.cleanDownloadFolder();

//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		robot.keyRelease(KeyEvent.VK_ESCAPE);
		waitutills.waitForClickable(driver, selectanaction);

		selectanaction.click();
		export_order.click();
		selected_order.click();
		csv_format.click();
		File_download.cleanDownloadFolder();

//		Robot robot1 = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		robot.keyRelease(KeyEvent.VK_ESCAPE);

	}

	// Add a comment through action way
	public void add_a_comment_through_order_list(String comment) {
		waitutills.waitForClickable(driver, selectanaction);

		selectanaction.click();
		comment_link.click();
		comment_box.sendKeys(comment);
		confirm.click();
		waitutills.waitForClickable(driver, selectanaction);

		selectanaction.click();
		remove_comment.click();
		waitutills.waitForClickable(driver, pop_up_confirm);
		pop_up_confirm.click();

	}

}