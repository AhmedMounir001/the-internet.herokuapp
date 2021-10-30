package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {

	private WebDriver driver;
	private By modal=By.xpath("//div[@class='modal-title']/h3");
	private By closeButton= By.xpath("//p[text()='Close']");
	
	public EntryAdPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String switchToModalAd() {
		//driver.switchTo().frame(driver.findElement(modal));
		//driver.switchTo().activeElement();
		
		System.out.println(driver.findElement(modal).getText());
		return driver.findElement(modal).getText();
		//driver.findElement(closeButton).click();
		//driver.switchTo().alert().accept();
	}
}
