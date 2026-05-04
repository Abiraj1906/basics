package utilities;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitutills {

	private static final int DEFAULT_TIMEOUT = 20;

	  private static final int DEFAULT_TIMEOUT1 = 15;
	    private static final int POLLING_TIME = 500;

	    private static WebDriverWait getWait(WebDriver driver) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
	        wait.pollingEvery(Duration.ofMillis(POLLING_TIME));
	        wait.ignoring(StaleElementReferenceException.class);
	        wait.ignoring(NoSuchElementException.class);
	        return wait;
	    }

	    // ✅ Visibility
	    public static WebElement waitForVisibility(WebDriver driver, WebElement element) {
	        return getWait(driver).until(ExpectedConditions.visibilityOf(element));
	    }

	    // ✅ Clickable
	    public static WebElement waitForClickable(WebDriver driver, WebElement element) {
	        return getWait(driver).until(ExpectedConditions.elementToBeClickable(element));
	    }

	    // ✅ Presence (for list)
	    public static List<WebElement> waitForAllElementsVisible(WebDriver driver, List<WebElement> elements) {
	        return getWait(driver).until(ExpectedConditions.visibilityOfAllElements(elements));
	    }

	    // ✅ Invisibility
	    public static boolean waitForInvisibility(WebDriver driver, WebElement element) {
	        return getWait(driver).until(ExpectedConditions.invisibilityOf(element));
	    }

	    // ✅ Text present
	    public static boolean waitForText(WebDriver driver, WebElement element, String text) {
	        return getWait(driver).until(ExpectedConditions.textToBePresentInElement(element, text));
	    }

	    // ✅ Attribute contains
	    public static boolean waitForAttribute(WebDriver driver, WebElement element, String attribute, String value) {
	        return getWait(driver).until(ExpectedConditions.attributeContains(element, attribute, value));
	    }

	    // ✅ Frame switch
	    public static void waitForFrameAndSwitch(WebDriver driver, WebElement frameElement) {
	        getWait(driver).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	    }

	    // ✅ Alert
	    public static Alert waitForAlert(WebDriver driver) {
	        return getWait(driver).until(ExpectedConditions.alertIsPresent());
	    }

	    // ================= ACTION METHODS ================= //

	    // 🔥 Click
	    public static void click(WebDriver driver, WebElement element) {
	        waitForClickable(driver, element).click();
	    }

	    // 🔥 Send Keys
	    public static void sendKeys(WebDriver driver, WebElement element, String value) {
	        WebElement ele = waitForVisibility(driver, element);
	        ele.clear();
	        ele.sendKeys(value);
	    }

	    // 🔥 Get Text
	    public static String getText(WebDriver driver, WebElement element) {
	        return waitForVisibility(driver, element).getText();
	    }

	    // 🔥 Is Displayed
	    public static boolean isDisplayed(WebDriver driver, WebElement element) {
	        try {
	            return waitForVisibility(driver, element).isDisplayed();
	        } catch (TimeoutException e) {
	            return false;
	        }
	    }

	    // 🔥 Scroll into view
	    public static void scrollToElement(WebDriver driver, WebElement element) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].scrollIntoView(true);", element);
	    }

	    // 🔥 JS Click (fallback)
	    public static void jsClick(WebDriver driver, WebElement element) {
	        WebElement ele = waitForVisibility(driver, element);
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", ele);
	    }
	}

