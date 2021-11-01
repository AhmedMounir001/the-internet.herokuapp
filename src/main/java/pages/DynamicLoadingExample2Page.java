package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utils.WaitElements;

public class DynamicLoadingExample2Page<pollingEvery, withTimeout, ignoring> {

	private WebDriver driver;
	private By startButton=By.cssSelector("#start button");
	private By loadingIndicator = By.id("loading");
	private By finish= By.id("finish");
	//private WebDriverWait wait;
	
	WaitElements element ;
	public DynamicLoadingExample2Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickStartButton() {
		driver.findElement(startButton).click();
	/*	FluentWait fwait= new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofNanos(1))
				.ignoring(NoSuchElementException.class);
		fwait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));*/
		//waitInvisibilityOfElement(loadingIndicator);
		element = new WaitElements(driver);
		element.waitInvisibilityOfElement(loadingIndicator);
	}
		
	public String getFinishMessage() {
		//wait = new WebDriverWait(driver, 5000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(finish));
		//waitVisibilityOfElement(finish);
		element= new WaitElements(driver);
		element.waitVisibilityOfElement(finish);
		return driver.findElement(finish).getText();
	}
	/*private void waitVisibilityOfElement(By byLocator) {
		FluentWait waitElement= new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofNanos(1))
				.ignoring(NoSuchElementException.class);
		waitElement.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLocator));		
	}

	private void waitInvisibilityOfElement(By byLocator) {
		FluentWait waitElement= new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofNanos(1))
				.ignoring(NoSuchElementException.class);
		waitElement.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLocator));		
	}*/

}
