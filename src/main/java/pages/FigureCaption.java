package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FigureCaption {

	//private WebDriver driver;
	private WebElement caption;
	private By header = By.tagName("h5"); 
	private By link=By.tagName("a");
	public FigureCaption(WebElement caption) {
		this.caption = caption;
	}
	
	public boolean isCaptionDisplay() {
		return caption.isDisplayed();}
	public String getTitle() {return caption.findElement(header).getText();}
	
	public String getLink() {return caption.findElement(link).getAttribute("href");}
	public String getLinktext() {return caption.findElement(link).getText();}
}
