package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

	private WebDriver driver;
	private By inputText= By.id("target");
	private By result = By.id("result");
	
	public KeyPressesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterText(String text) {
		driver.findElement(inputText).sendKeys(text);
	}
	
	public String getResultText() {
		return driver.findElement(result).getText();
	}
	public void enterPie() {
		enterText(Keys.chord(Keys.LEFT_ALT,"p",Keys.LEFT_ALT)+"=3.14");		
	}
	
}
