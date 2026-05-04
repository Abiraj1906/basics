package Excel_reusable_code;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page {

	
	@DataProvider(name="loginData")
	public Object[][] getloginData(){
		
		String excelpath="/home/sellerp26/Abiraj_project/basic_java/src/test/resources/test_data.xlsx";
		ExcelUtil excel=new ExcelUtil(excelpath, "test_data");
		return excel.getData();
		
	}
	
	
	@Test(dataProvider = "loginData")
	public void login_test(String uName,String pWord) {
		
		   System.out.println("Username: " +uName);
	        System.out.println("Password: " + pWord);
	        
	        
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://preprod2.platform.sellermania.com/login");
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys(uName);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pWord);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.close();

	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
