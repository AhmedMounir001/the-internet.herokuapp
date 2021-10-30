package pages;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

	private WebDriver driver;
	private By horizontalSlider=By.cssSelector("input[value='0']");
	private By range = By.id("range");
	

	public HorizontalSliderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void moveOnHoriozontalSlider() {
		
		for (int i = 0; i < 8; i++) {
			driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
		}
	}
	
	public String getSliderRange() {
		return driver.findElement(range).getText();		
	}
}
