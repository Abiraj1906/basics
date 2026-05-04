package Assertion;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validation {

	@Test
	public void hard_soft_assert() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://preprod2.platform.sellermania.com");
		WebElement username = driver.findElement(By.name("email"));
		username.isEnabled();
		// Assert.assertFalse(username);

		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertEquals(driver.getTitle(), "Sellermania Platform", "titlte mismatch");

		SoftAssert soft = new SoftAssert();
		soft.assertEquals(driver.getTitle(), "sellermania", "title matched");

		soft.assertAll();

	}

}
