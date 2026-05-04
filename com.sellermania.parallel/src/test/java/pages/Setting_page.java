package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.driverinitialization;
import utilities.waitutills;

public class Setting_page {

	protected WebDriver driver;

	// constructor
	public Setting_page() {

		 this.driver=driverinitialization.getDriver();
		PageFactory.initElements(driver, this);
	}

	// POM for setting
	@FindBy(linkText = "Settings")
	private WebElement setting_menu;

	// seller profile
	@FindBy(linkText = "See your seller profile")
	private WebElement seller_profile;

	@FindBy(xpath = "//a[normalize-space()='Settings per marketplace']")
	private WebElement obo_default;

	@FindBy(linkText = "Refurbed")
	private WebElement default_refurb_mkp;

	@FindBy(id = "marketplace_locale_206_listingCommonFields_wishedPrice")
	private WebElement refurb_LU_mkp_wp;

	@FindBy(id = "marketplace_locale_206_listingCommonFields_bottomPrice")
	private WebElement refurb_LU_mkp_blp;

	@FindBy(linkText = "Cancel")
	private WebElement cancel_button;

	@FindBy(id = "seller_profile_CustomerAccount_inventoryNumberOfRowsDefault")
	private WebElement item_per_page;

	@FindBy(how = How.XPATH, using = "(//button[@type='submit'])[2]")
	private WebElement validate_button;

	// order preference
	@FindBy(linkText = "See your order preferences")
	private WebElement order_preferences;

	@FindBy(id = "order_setting_User_ordersItemPerPage")
	private WebElement order_per_page;

	
	//email preferences for each mkp
	@FindBy(linkText = "Specify you address and email for each marketplace")
	private WebElement email_for_each_mkp;
	
	@FindBy(id="seller_pref_order_treatment_settings_by_mkp_csas_0_companyName")
	private WebElement abebooks_email_pref;
	
	@FindBy(id="seller_pref_order_treatment_settings_by_mkp_csas_0_emailFromPreference")
	private WebElement send_your_email_from;
	
	@FindBy(id="seller_pref_order_treatment_settings_by_mkp_csas_0_emailCcPreference")
	private WebElement send_copy_of_your_emails_to;
	
	@FindBy(id="seller_pref_order_treatment_settings_by_mkp_csas_0_emailSignature")
	private WebElement your_email_signature;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement validate_email_page;
	
	@FindBy(linkText = "Customize your email templates")
	private WebElement customize_email_template;
	
	
	//New email template creation
	@FindBy(xpath = "//button[text()='Add an email template']")
	private WebElement add_an_email_template;
	
	@FindBy(id="templateNameField")
	private WebElement template_name;
	
	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	private WebElement cancel_button_email_template_page;
	
	//Other printing preferences
	@FindBy(id="order_setting_displaySlipsUnpaid_slips_unpaid")
	private WebElement not_paid_label_on_slips_enable;
	
	@FindBy(id="order_setting_displayDeliveryInstructions_delivery_instructions")
	private WebElement delivery_instruction_enable;
	
	@FindBy(id="order_setting_displayPhoneOnDocuments_display_phone_on_documents")
	private WebElement phone_number_enabled;
	
	@FindBy(id="order_setting_displayEanBarcode_ean_barcode")
	private WebElement EAN_barcode_enable;
	
	
	//default warehouse address
	@FindBy(linkText = "Specify your default warehouse addresses for Amazon Vendor")
	private WebElement default_warehouse_link;
	
	@FindBy(linkText = "Add a new address")
	private WebElement add_new_address;
	
	@FindBy(linkText = "Save")
	private WebElement save_button;
	
	@FindBy(xpath = "//span[text()='The warehouse name is mandatory.']")
	private WebElement error_message;
	
	@FindBy(id="order_setting_warehouse_address_address_name")
	private WebElement address_address_name;
	
	@FindBy(id="order_setting_warehouse_address_name")
	private WebElement address_name;
	
	@FindBy(id="order_setting_warehouse_address_addressLine1")
	private WebElement address_line1;
	
	@FindBy(id="order_setting_warehouse_address_city")
	private WebElement address_city;
	
	@FindBy(id="order_setting_warehouse_address_postalCode")
	private WebElement postal_code;
	
	@FindBy(id="order_setting_warehouse_address_countryCode")
	private WebElement country_Code;
	
	@FindBy(id="order_setting_warehouse_address_isDefault")
	private WebElement is_default_address;
	
	
	
	
	
	
	
	@FindBy(id = "order_setting_shippingTypePrepaid_shipping_type_prepaid_0")
	private WebElement prepaid_mondial_relay;

	@FindBy(id = "order_setting_shippingTypePrepaid_shipping_type_prepaid_1")
	private WebElement prepaid_so_collissimo;

	@FindBy(id = "order_setting_shippingTypePrepaid_shipping_type_prepaid_2")
	private WebElement prepaid_collissimo;

	@FindBy(id = "order_setting_shippingTypePrepaid_shipping_type_prepaid_3")
	private WebElement prepaid_chronopost;

	@FindBy(id = "order_setting_shippingTypePrepaid_shipping_type_prepaid_4")
	private WebElement prepaid_colis_prive;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	// push schedule
	@FindBy(linkText = "See your push preferences")
	private WebElement push_preference;

	// mkp connection
	@FindBy(linkText = "Look up and update your marketplace connections")
	private WebElement mkp_connection;

	// Action methods

	public void Settings_menu() {
		setting_menu.isDisplayed();
		setting_menu.click();
	}

	public void Seller_profile(int wp_price,int blp_price) {
		seller_profile.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", obo_default);

		obo_default.click();

		js.executeScript("arguments[0].scrollIntoView(true);", default_refurb_mkp);
		waitutills.waitForClickable(driver,  default_refurb_mkp);
		default_refurb_mkp.click();
		refurb_LU_mkp_wp.sendKeys(String.valueOf(wp_price));
		refurb_LU_mkp_blp.sendKeys(String.valueOf(blp_price));
		
		
		cancel_button.click();

		Select element = new Select(item_per_page);
		element.selectByIndex(2);

		js.executeScript("arguments[0].scrollIntoView(true)", validate_button);

		// js.executeScript("arguments[0].scrollIntoView({block:'center'})",validate_button);
		validate_button.click();

	}

	public void Order_preferences(String mail,String send_mail,String cc_mail,String mail_signature,String address_name1,String name,String address_line,String city,String code,String country_code) {
		order_preferences.click();

		Select element = new Select(order_per_page);
		element.selectByIndex(3);

		JavascriptExecutor js = (JavascriptExecutor) driver;
//email address preferences
		email_for_each_mkp.click();
		abebooks_email_pref.sendKeys(mail);
		send_your_email_from.sendKeys(send_mail);
		send_copy_of_your_emails_to.sendKeys(cc_mail);
		your_email_signature.sendKeys(mail_signature);
		
		js.executeScript("arguments[0].scrollIntoView(true)", validate_email_page);
		waitutills.waitForClickable(driver, validate_email_page);
		validate_email_page.click();
		
//		customize_email_template.click();
//		add_an_email_template.click();
//		waitutills.waitForClickable(driver, cancel_button_email_template_page);
//		cancel_button_email_template_page.click();
//		
//		driver.navigate().back();
//		driver.navigate().back();
//		driver.navigate().back();

		
		
		
		//Other printing preferences
		if(not_paid_label_on_slips_enable.isSelected()) {
			System.out.println("it's already enabled");
		}else {
			not_paid_label_on_slips_enable.click();
		}
		if(delivery_instruction_enable.isSelected()) {
			System.out.println("it's already enabled");
		}else {
			delivery_instruction_enable.click();
		}
		
		if(phone_number_enabled.isSelected()) {
			System.out.println("it's already enabled");
		}else {
			phone_number_enabled.click();
		}
		
		if(EAN_barcode_enable.isSelected()) {
			System.out.println("it's already enabled");
		}else {
			EAN_barcode_enable.click();
		}
			
		//default warehouse address
		default_warehouse_link.click();
		add_new_address.click();
		save_button.click();
	    error_message.getText();
	    address_address_name.sendKeys(address_name1);
	    address_name.sendKeys(name);
	    address_line1.sendKeys(address_line);
	    address_city.sendKeys(city);
	    postal_code.sendKeys(code);		
	    country_Code.sendKeys(country_code);
	    is_default_address.click();
	    save_button.click();
		
		
		
		
		
		// js.executeScript("window.scrollBy(0,5000)");
		js.executeScript("arguments[0].scrollIntoView(true)", prepaid_mondial_relay);
		prepaid_mondial_relay.click();
		prepaid_so_collissimo.click();
		prepaid_collissimo.click();
		prepaid_chronopost.click();
		prepaid_colis_prive.click();

		js.executeScript("arguments[0].scrollIntoView(true)", submit);

		submit.click();

	}

	public void Push_preferences() {
		push_preference.click();

	}

	public void Mkp_connection() {
		mkp_connection.click();

	}

}
