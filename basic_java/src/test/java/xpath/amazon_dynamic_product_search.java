package xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_dynamic_product_search {

	
	
	@Test
	public void product_search() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text']"))).sendKeys("phones");
		
//		WebElement search_amazon=driver.findElement(By.xpath("//input[@type='text']"));
//		
//		search_amazon.clear();
//		search_amazon.sendKeys("phones");
		
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement search_button=	wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));
		
		
		
		//WebElement search_button=driver.findElement(By.cssSelector("#nav-search-submit-button"));
		search_button.click();
		
		List<WebElement> products=driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		
		
		System.out.println(products.size());
		
		if(products.size()>=3) {
			WebElement thirdproduct=products.get(2);
			System.out.println("Product name"+ thirdproduct.getText());
		}else {
			System.out.println("Les than 3 products only there");
		}
		
		
		
		//changes happened
		
		
		
		//master changes appeared on feature or not
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
