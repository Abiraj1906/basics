package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.driverinitialization;

public class Smart_map_pages {
 
	
	
	WebDriver driver;
	
public	Smart_map_pages(){
	 this.driver=driverinitialization.getDriver();
		PageFactory.initElements(driver, this);		
		
	}
	
	//Smart map menu
	@FindBy(linkText = "Smart Map")
	private WebElement smart_map_menu;
	
	//Add an input--source feed
	@FindBy(xpath="//span[text()='Add an input feed']")
	private WebElement input_feed;
	
	@FindBy(id="ImportFile_fluxName")
	private WebElement feed_name;
	
	@FindBy(xpath = "(//label[@for='ImportFile_choice_1'])[1]")
	private WebElement file_import;
	
	@FindBy(id="ImportFile_file")
	private WebElement choose_file;
	
	@FindBy(id="importFileFormOk")
	private WebElement load_feed;
	
	
	
	
	//Actions
	
	public void smart_map_menu() {
		String parent_window=driver.getWindowHandle();
      System.out.println(parent_window);
      
		smart_map_menu.click();
		
		Set<String> child_window=driver.getWindowHandles();

	    System.out.println(child_window);
	    List<String>list=new ArrayList<String>(child_window);
	    driver.switchTo().window(list.get(1));  
	  	
	}
	
	public void input_feed(String feed_name,String file) {
		input_feed.sendKeys(feed_name);
		file_import.click();
		choose_file.sendKeys(file);
		load_feed.click();
		
	}
	
	
	
	
}
