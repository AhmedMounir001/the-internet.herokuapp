package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

	private WebDriver driver;
	private By hotspotBox = By.id("hot-spot");
	private By contextMenu=By.tagName("h3");
	public ContextMenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void rightClickHotSpotBox() {
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(hotspotBox)).perform();
	}
	public void jsAlertAccept() {
		driver.switchTo().alert().accept();		
	}

	public String getHeaderData() {
		return driver.findElement(contextMenu).getText();
	}

}
