package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportlistners implements ITestListener {

	ExtentReports extent;
	ExtentSparkReporter spark;
	static ExtentTest test;

	public void onStart(ITestContext context) {

		spark = new ExtentSparkReporter("./Report/api_report.html");
		spark.config().setDocumentTitle("Api validation");
		spark.config().setReportName("Abiraj");
		spark.config().setTheme(Theme.DARK);
		spark.config().setTimeStampFormat(" MMM yyyy HH:mm:ss");

		extent = new ExtentReports();
		extent.attachReporter(spark);
		// Useful for debugging.
		extent.setSystemInfo("Computer_name", "LocalHost");
		extent.setSystemInfo("env", "Preprod");
		extent.setSystemInfo("OS", "Linux");
		extent.setSystemInfo("Browser", "chrome");

	}

	public void onTestStart(ITestResult result) { // (ITestResult)Contains information about the test method.

		test = extent.createTest(result.getName());
		test.assignAuthor("Abiraj");

	}

	public void onTestSuccess(ITestResult result) {

		test.log(Status.PASS, "Test Passed: " + result.getName());

	}

	public void onTestFailure(ITestResult result) {

		test.log(Status.FAIL, "Test failed: " + result.getName());

	}

	public void onTestSkipped(ITestResult result) {

		test.log(Status.SKIP, "Test skipped: " + result.getName());

	}

	public void onFinish(ITestContext context) {

		/*
		 * Without this line:Report will be empty
		 */
		extent.flush();
	}

}
