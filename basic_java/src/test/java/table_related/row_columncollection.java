package table_related;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class row_columncollection {


	@Test
	public void table_details() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://preprod2.platform.sellermania.com");
		driver.findElement(By.name("email")).sendKeys("balaSC@sellermania.com");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement webtable= driver.findElement(By.id("orders-turnover-evolution-table"));

		List<WebElement> rows, cols;

		rows=webtable.findElements(By.tagName("tr"));
		int row=rows.size()-1;
		System.out.println("row details"+ row);

		for(int i=0;i<rows.size();i++) {
			cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("row no"+i+" column size "+cols.size());
		}



		driver.quit();


	}





















}
