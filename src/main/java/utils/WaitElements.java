package utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

/**
 * FluentWait weith time duration 100 seconds and polling every 1 nano seconds
 * and ignoring NoSuchElementException * 
 * @author Mounir
 *
 */
public class WaitElements {
	private WebDriver driver;

	public WaitElements(WebDriver driver) {
		this.driver = driver;
	}

	private int timeOutInSeconds=10;
	private int pollingEveryNanos=1;
	public void waitVisibilityOfElement(By byLocator) {
		FluentWait<WebDriver> waitElement = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOutInSeconds))
				.pollingEvery(Duration.ofNanos(pollingEveryNanos))
				.ignoring(NoSuchElementException.class);
		waitElement.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLocator));
	}

	public void waitInvisibilityOfElement(By byLocator) {
		FluentWait<WebDriver> waitElement = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOutInSeconds))
				.pollingEvery(Duration.ofNanos(pollingEveryNanos))
				.ignoring(NoSuchElementException.class);
		waitElement.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLocator));
	}

}
