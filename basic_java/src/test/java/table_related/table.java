package table_related;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table {

	@Test
	public void table_fields() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://preprod2.platform.sellermania.com");
		driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		int element=		driver.findElements(By.tagName("table")).size();
		String element1= driver.findElement(By.id("orders-turnover-evolution-table")).getText();

		String element2=          driver.findElement(By.xpath("//table[@id='orders-turnover-evolution-table']/tbody/tr[10]/td[1]")).getText();

		System.out.println(element);
		System.out.println(element1);
		System.out.println("10th row 1st column value"+element2);


	}


}
