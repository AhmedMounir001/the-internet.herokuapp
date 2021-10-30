package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1Page {

	private WebDriver driver;
	private By startButton=By.cssSelector("#start button");
	private By loadingIndicator = By.id("loading");
	private By finish= By.id("finish");
	private WebDriverWait wait;
	
	public DynamicLoadingExample1Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickStartButton() {
		driver.findElement(startButton).click();
		wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));
		
	}
	
	public String getFinishMessage() {
		wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(finish));
		return driver.findElement(finish).getText();
	}
	
}
