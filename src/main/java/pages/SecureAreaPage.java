package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

	public SecureAreaPage(WebDriver driver) {
		this.driver = driver;
	}
	private WebDriver driver;
	private By flashMessage= By.id("flash");
	
	public String getFlashMessage() {
		return driver.findElement(flashMessage).getText();
	}
}
