package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
	private WebDriver driver;
	private By figureBox = By.className("figure");
	private By figCaption = By.className("figcaption");
	
	public HoversPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * 
	 * @param index starts at 1
	 * FigureCaption
	 */
	public FigureCaption hoveroverFigure(int index) {
		WebElement figure = driver.findElements(figureBox).get(index-1);
		Actions actions = new Actions(driver);
		actions.moveToElement(figure).perform();		
		return new FigureCaption(figure.findElement(figCaption));
	}

}
