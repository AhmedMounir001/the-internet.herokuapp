package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

	public DynamicLoadingPage(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;
	private String linkXpathFormat="//a[contains(text(),'%s')]";
	private By linkExample1=By.xpath(String.format(linkXpathFormat, "Example 1"));
	private By linkExample2=By.xpath(String.format(linkXpathFormat, "Example 2"));
	
	public DynamicLoadingExample1Page clickExample1() {
		driver.findElement(linkExample1).click();
		return new DynamicLoadingExample1Page(driver);
	}
	public DynamicLoadingExample2Page clickExample2() {
		driver.findElement(linkExample2).click();
		System.out.println(driver.getCurrentUrl());
		return new DynamicLoadingExample2Page(driver);
	}
	
	public DynamicLoadingExample2Page rightClickExample2() {
		Actions actions = new Actions(driver);
		WebElement ex2 =driver.findElement(linkExample2);
		actions.contextClick(ex2).keyDown(Keys.CONTROL).click(ex2).perform();
		return new DynamicLoadingExample2Page(driver);
	}
}
