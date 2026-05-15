package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_validate {

	static WebDriver driver;

	@Test
	public void verify() {

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://preprod2.platform.sellermania.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement username = driver.findElement(By.name("email"));
		if (username.isDisplayed()) {
			System.out.println("username is displayed");
			username.sendKeys("balaSC@sellermania.com");
		} else {
			System.out.println("username not displayed");
		}

		WebElement password = driver.findElement(By.name("password"));

		if (password.isDisplayed()) {
			System.out.println("password is displayed");
			password.sendKeys("test");
		} else {
			System.out.println("password not displayed");
		}

		WebElement login_button = driver.findElement(By.xpath("//button[@type='submit']"));
		login_button.click();

		Assert.assertEquals(driver.getTitle(), "Sellermania platform");
		System.out.println("Title matched----title validating success");
		
		
		
	}

}
