package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WysiWygEditorPage {

	private WebDriver driver;
	private WebDriverWait wait;
	private String textEditor="mce_0_ifr";
	private By textContent=By.id("tinymce");
	private By increaseIndentButton=By.xpath("//button[@aria-label='Increase indent']");
	
	public WysiWygEditorPage(WebDriver driver) {
		this.driver=driver;
	}

	private void switchToTextArea() {		
		driver.switchTo().frame(textEditor);
	}
	private void switchToParentFrame() {		
		driver.switchTo().parentFrame();
	}
	
	
	public void clearTextArea() {
		switchToTextArea();
		wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(textContent));
		driver.findElement(textContent).clear();
		switchToParentFrame();
	}
	
	public void setTextArea(String text) {
		switchToTextArea();		
		driver.findElement(textContent).sendKeys(text);
		switchToParentFrame();
	}
	
	public void clickIncreaseIndent() {
		driver.findElement(increaseIndentButton).click();
	
	}
	
	public String getEditorAreaText() {
		switchToTextArea();
		String text= driver.findElement(textContent).getText();
		switchToParentFrame();
		return text;
	}
	
}
