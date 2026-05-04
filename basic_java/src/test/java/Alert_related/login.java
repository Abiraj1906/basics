package Alert_related;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {

	
	@Test
	public void login() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://preprod2.platform.sellermania.com");
		driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
		driver.findElement(By.name("password")).sendKeys("test");
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Mot de passe oublié ?")).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
