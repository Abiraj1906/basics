package I_Questions;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.BiDi;
import org.openqa.selenium.bidi.Connection;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies_handle {

	@Test
	public void cookies_handle() {
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.get("https://preprod2.platform.sellermania.com");
	
	
	Cookie cookie=new Cookie("", "");
	driver.manage().addCookie(cookie);
	
	//1️⃣ Get all cookies
//Set<Cookie>cookies=driver.manage().getCookies();
//	
//	for(Cookie cookie:cookies) {
////		System.out.println(cookie.getName());
////		System.out.println(cookie.getValue());
////		System.out.println(cookie.getPath());
////	System.out.println(cookie.getDomain());
////	System.out.println(cookie.getClass());
//		System.out.println(cookie.isHttpOnly());
//		
		
		
		
	
	driver.quit();
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
