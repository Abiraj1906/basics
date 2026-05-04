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
		
	     // Unique file name using timestamp + thread id
        String timestamp = String.valueOf(System.currentTimeMillis());
        String threadId = String.valueOf(Thread.currentThread().getId());

        String fileName = testName + "_" + threadId + "_" + timestamp + ".png";

        String path = System.getProperty("user.dir") + "/Screenshots/" + fileName;

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(path);

        FileUtils.copyFile(src, dest);

        return path;
    }
}