package com.android;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class session_create {

	AndroidDriver driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		
		UiAutomator2Options options=new UiAutomator2Options();
		
		options.setPlatformName("Android");
		options.setDeviceName("emulator-5554");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
		
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("session created successfully");	
		
	}
	
	
	@Test
	public void open_google() {
		//driver.get("https://www.google.com");
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(5)")).click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("amazon.in");
				
		
	}
	
	
	
	@AfterTest
	public void teardown() {
		
		
		 if (driver != null) {
	            driver.quit();
	            System.out.println("Session closed successfully.");
	        }
		
	}
	
	
	
	
	
	
	
}
