package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.driverinitialization;

public class ExtentReportListener implements ITestListener {

	ExtentSparkReporter spark;
	ExtentReports extent;
	/*
	 * ExtentTest test is not Thread-safe but you are calling test.get() test.get()
	 * only works with ThreadLocal
	 */

	//ExtentTest test; // Represents one test case entry in report.
	public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	//public static WebDriver driver;

	public void onStart(ITestContext context) { // (ITestContext)Contains information about the current test suite
												// execution.

		spark = new ExtentSparkReporter("./Reports/WebRegression-report.html");
		spark.config().setDocumentTitle("Login validation");
		spark.config().setReportName("Abiraj");
		spark.config().setTheme(Theme.DARK);
		spark.config().setTimeStampFormat(" MMM yyyy HH:mm:ss");
		extent = new ExtentReports(); // main object that manage all test reports
		extent.attachReporter(spark);

		// Useful for debugging.
		extent.setSystemInfo("Computer_name", "LocalHost");
		extent.setSystemInfo("env", "Preprod");
		extent.setSystemInfo("OS", "Linux");
		extent.setSystemInfo("Browser", "chrome");

	}

	public void onTestStart(ITestResult result) { // (ITestResult)Contains information about the test method.

	ExtentTest	extentTest = extent.createTest(result.getName());
		extentTest.assignAuthor("Abiraj");
		// ✅ Store test in ThreadLocal
        test.set(extentTest);
	
	}

	public void onTestSuccess(ITestResult result) {

		// test=extent.createTest(result.getName());

		test.get().log(Status.PASS, "Test Passed: " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		// test=extent.createTest(result.getName());

		test.get().log(Status.FAIL, "Test failed: " + result.getName());
		

		try {
		WebDriver	driver = driverinitialization.getDriver();

			String screenshotpath = ScreenshotUtill.capturescreenshot(driver, result.getName());
			test.get().addScreenCaptureFromPath(screenshotpath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	public void onTestSkipped(ITestResult result) {
		// test=extent.createTest(result.getName());

		test.get().log(Status.SKIP, "Test skipped: " + result.getName());
		
	}

	public void onFinish(ITestContext context) {

		/*
		 * Without this line:Report will be empty
		 */
		extent.flush();
	}

}
