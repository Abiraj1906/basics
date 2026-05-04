package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_related {

	
	@Test
	public void xpath_methods() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://preprod2.platform.sellermania.com");
		
		//driver.findElement(By.xpath("//button"))
		
		driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys("balaSC@sellermania.com");
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@name='email']/ancestor::form//button[@type='submit']")).click();
		
     String text=   driver.findElement(By.xpath("//label[text()='Currency']/following-sibling::select")).getText();
     System.out.println(text);
        
        
//		driver.findElement(By.linkText("WeReprice")).click();
//		driver.findElement(By.linkText("Add a strategy")).click();
//	     driver.findElement(By.id("stratNameInput")).sendKeys("test");
//	     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Validate and go to next step']/parent::button"))).click();
//	     System.out.println("element clicked1");
//	     
//	     
//	     Thread.sleep(2000);
//	     WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(20));
//	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[2]/parent::div"))).click();
//	
//	   System.out.println("element clicked2");
//	   
//	   JavascriptExecutor js=(JavascriptExecutor)driver;
//	  
//	   
//	   driver.findElement(By.id("radio-ALL")).click();
//
//	   js.executeScript("window.scrollBy(0,5000)");
//	   
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("(//button[@type='button'])[2]/child::span")).click();
//	   System.out.println("element clicked3");
//	   
//	   js.executeScript("window.scrollBy(0,5000)");
//	   driver.findElement(By.id("simplifySelected")).click();
//	   driver.findElement(By.xpath("(//input[@type='text'])[38]")).sendKeys("2");
//	  
//	  
//
//	   js.executeScript("window.scrollBy(0,5000)");
//
//
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//span[text()='Validate and Save']")).click();
//	 
//         System.out.println("element clicked4");
//		
//         
         
         //setting page
         
       driver.findElement(By.linkText("Settings")).click();
       driver.findElement(By.linkText("See your seller profile")).click();
      // Thread.sleep(3000);
           JavascriptExecutor js=(JavascriptExecutor)driver;

	   js.executeScript("window.scrollBy(0,5000)");

       Thread.sleep(2000);
//       driver.findElement(By.linkText("Settings per marketplace")).click();
//       
//         driver.findElement(By.xpath("//button[text()='Validate']")).click();
//      
        // js1.executeScript("window.scrollBy(0,5000)");
         
         WebElement submit=driver.findElement(By.xpath("(//button[contains(@class,'btn-primary')])[2]"));
         
	     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(submit));
        
        js.executeScript("arguments[0].scrollIntoView({block:'center'})",submit);
        submit.click();
        
        
        
         //driver.findElement(By.xpath("(//button[contains(@class,'btn-primary')])[2]/parent::div")).click();
         
         
         
         
         
         
         
         
         
         
		driver.close();
		
	}
	
	
	//label[text()='Username']/following-sibling::input
	//label[text()='Accept Terms']/preceding-sibling::input
	//span[text()='Error occurred']/ancestor-or-self::div
	
	//span[text()='Error occurred']/ancestor-or-self::div
	//div[@class='form']/descendant-or-self::input
//	//div[@class='menu']/child::a
	
	
	
//	html
//	 └── body
//	     └── form
//	         └── div
//	             └── input
//
//	
//	
//	
//	Go up → parent, ancestor
//
//	Go down → child, descendant
//
//	Go sideways → following-sibling, preceding-sibling
//	
	
	
	
	
	
}
