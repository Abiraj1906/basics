package console_log_print;

import java.awt.Event;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v143.v143Log;
import org.openqa.selenium.devtools.v143.runtime.Runtime;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Devtools_another_Way {

	
	@Test
	public void devtool() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		DevTools devtools=((ChromeDriver)driver).getDevTools();
		devtools.createSession();
		
devtools.send(Runtime.enable());		
		
devtools.addListener(Runtime.consoleAPICalled(), event -> {event.getArgs().forEach(arg -> System.out.println("console"+arg.getValue()));		
});
driver.get("https://www.amazon.in");
Thread.sleep(3000);

		JavascriptExecutor js =((JavascriptExecutor)driver);
		
		js.executeScript("console.log('Hello from Selenium');");
		js.executeScript("console.error('This is a test error');");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
//		
//		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
