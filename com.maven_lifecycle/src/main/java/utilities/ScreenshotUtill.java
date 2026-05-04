package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtill {

	
 public WebDriver driver;
	
	public static String capturescreenshot(WebDriver driver,String testName) throws IOException {
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String dest=System.getProperty("user.dir")+"/screenshots/screenshots for failed"+testName+"_"+System.currentTimeMillis()+".png";
		
		FileUtils.copyFile(screenshot, new File(dest));
		return dest;
	}
	

	
}