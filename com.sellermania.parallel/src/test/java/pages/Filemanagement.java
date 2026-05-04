package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.driverinitialization;
import utilities.waitutills;

public class Filemanagement {
public WebDriver driver;


//constructor

 public Filemanagement(){
	 this.driver=driverinitialization.getDriver();
	 PageFactory.initElements(driver,this);
 }
	
	@FindBy(linkText = "File management")
    private	WebElement filemanage;
	
	@FindBy(linkText = "Send a file in txt format")
	private WebElement send_file;
	
	@FindBy(id = "loadFileBtn")
	private WebElement upload_button;
	
	@FindBy(id = "upload_txt_file")
	private WebElement choose_file;
	
	@FindBy(how = How.XPATH,using = "(//button[@type='submit'])[1]")
	private WebElement submit;
	
	
	@FindBy(id = "exportDropdownFormatBtn")
	private WebElement xl_export;
	
	@FindBy(id = "exportDropdownBtn")
	private WebElement export_dropdown;
	
	@FindBy(linkText = "In stock offers (light)")
	private WebElement light_export;
	
	@FindBy(linkText = "In error offers (light)")
	private WebElement error_report_light;
	//Action class
	
	public void File_management_page() {
		
		filemanage.click();
	}
	public void send_file_in_txtformat() {
		send_file.click();
	}
	
	public void upload_your_file_manually()  {
		
		upload_button.click();
		
		
		
		
	}
	
	
	public void choose_file_toupload(String file) throws AWTException {
		choose_file.sendKeys(file);
		
		
//	try {	
//		String file="/home/sellerp26/Abirajsellermania/csv files/add az fr 1.csv";
//		StringSelection selection=new StringSelection(file);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		
//		Robot robo=new Robot();
//		robo.delay(2000);
//      
//		// 4. Press CTRL+V to paste the path
//		robo.keyPress(KeyEvent.VK_CONTROL);
//		robo.keyPress(KeyEvent.VK_V);
//		robo.keyRelease(KeyEvent.VK_V);
//		robo.keyRelease(KeyEvent.VK_CONTROL);
//
//		// 5. Press ENTER to submit the dialog
//		robo.keyPress(KeyEvent.VK_ENTER);
//		robo.keyRelease(KeyEvent.VK_ENTER);
//	} catch (Exception e) {
//		System.out.println(e.getMessage());// TODO: handle exception
//	}
//	finally {
//		System.out.println("file upload completed");
//		
//	}
//		
	}
	
	public void confim_button() {
		submit.click();
	}
	
	public void excel_export() {
		xl_export.click();
	}
	
	public void export_dropdown_list() {
		export_dropdown.click();
		light_export.click();
		xl_export.click();
		waitutills.waitForClickable(driver, error_report_light);
		error_report_light.click();
		
		
	}
	
	public void export_count() {
		List<WebElement> element=driver.findElements(By.xpath("//a[contains(@href,'inventory/export/download')]"));
		System.out.println(element.size());
		
		if(element.size()>=5) {
			element.get(1).click();
			
			
		}else {
			System.out.println("element is more than 5");
		}
		
	}
	
	
	
	
	
	
	
	
	
}