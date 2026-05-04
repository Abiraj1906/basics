package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.waitutills;


public class loginpage {
 private WebDriver driver;
   
   //constructor
 public	loginpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);//mandatory step for initiating element

	}
//locators
	@FindBy(name="email")
private	WebElement emailfield;
	@FindBy(name="password") 
private	WebElement passfield;
	@FindBy(xpath = "//button[@type='submit']") 
private	WebElement loginbutton;
	
	//Actions method
	public void Login_pages(String user,String pass) {
		//waitutills.waitforclickable(driver, emailfield, 10);
		emailfield.sendKeys(user);
		passfield.sendKeys(pass);
		loginbutton.click();
		
	}
	
	
	
}