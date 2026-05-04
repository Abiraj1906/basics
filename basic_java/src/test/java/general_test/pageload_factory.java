package general_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageload_factory {

	
	@Test
	public void page_load_factory() {
	
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions option=new FirefoxOptions();
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		
		
		
	WebDriver driver=new FirefoxDriver(option);
	
	Point p=driver.manage().window().getPosition();
	System.out.println(p.getX());
	System.out.println(p.getY());
	
	Dimension d=driver.manage().window().getSize();
	System.out.println(d.getWidth());
	System.out.println(d.getHeight());
	
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://preprod2.platform.sellermania.com/");
	
	driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
	driver.findElement(By.name("password")).sendKeys("test");
	WebElement login_button=driver.findElement(By.xpath("//button[@type='submit']"));
	
	String colour=login_button.getCssValue("color");
	System.out.println(colour);
	
	String font_size=login_button.getCssValue("font-size");
	System.out.println(font_size);
	
	String background_color=login_button.getCssValue("background-color");
	System.out.println(background_color);
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
