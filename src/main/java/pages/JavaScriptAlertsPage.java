package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptAlertsPage {

	private WebDriver driver;
	private By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
	private By jsConfirm = By.xpath("//button[text()='Click for JS Confirm']");
	private By jsPrompt = By.xpath("//button[text()='Click for JS Prompt']");
	private By result= By.id("result");
	
	public JavaScriptAlertsPage(WebDriver driver) {this.driver = driver;}
	
	public void triggerAlert() {		
		clickButton(driver.findElement(triggerAlertButton));
	}
	public void acceptAlert() {
		driver.switchTo().alert().accept();		
	}
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();		
	}
	public void addTextToPrompt(String promptText) {
		driver.switchTo().alert().sendKeys(promptText);
	}
	private void clickButton(WebElement Button) {Button.click();}
	public void triggerConfirm() {
		clickButton(driver.findElement(jsConfirm));		
	}
	public void triggerPrompt() {
		clickButton(driver.findElement(jsPrompt));
	}
	
	public String getResult() {
		return driver.findElement(result).getText();		
	}
	
}
