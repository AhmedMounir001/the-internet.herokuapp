package pages;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownListPage {

	private static final List<WebElement> WebElement = null;

	public DropdownListPage(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;
	private By dropdown = By.id("dropdown");

	public void selectFromDropdown(String option) {
		/*
		 * Select dropdownElement = new Select(driver.findElement(dropdown));
		 * dropdownElement.selectByVisibleText(option);//old
		 */
		findDropdown().selectByVisibleText(option);
	}

	/**
	 * get all options in dropdown list
	 * @return
	 * allOptions Data
	 */
	public List<String> getAllOptions() {
		List<WebElement> allOptions = findDropdown().getOptions();
		for(int i =0;i<allOptions.size();i++) 
		{ String optionText = allOptions.get(i).getText();	}
		return allOptions.stream().map(e->e.getText()).collect(Collectors.toList());
	}

	/**
	 * list of selected items 
	 * @return
	 * selected all option text
	 */
	public List<String> getSelectedOptions() {
		List<WebElement> selectedElements = findDropdown().getAllSelectedOptions();
		return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
	}

	/**
	 * 
	 * @return
	 * print Only first selected option
	 */
	public WebElement getFirstSelectedOption() {
		System.out.println(findDropdown().getFirstSelectedOption().getText());
		return findDropdown().getFirstSelectedOption();
	}

	private Select findDropdown() {
		return new Select(driver.findElement(dropdown));
	}
}
