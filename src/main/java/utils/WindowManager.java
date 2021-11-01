package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

public class WindowManager {

	private WebDriver driver;
	private Navigation navigate;
	
	public WindowManager(WebDriver driver) {
		this.driver = driver;
		navigate = driver.navigate();
	}
	
	public void goBack() {navigate.back();}
	public void goForward() {navigate.forward();}
	public void refreshPage() {navigate.refresh();}
	public void goToUrl(String url) {navigate.to(url);}
	
	public void switchToTab(String tabTitle) {
		var windows= driver.getWindowHandles();
		
		System.out.println("Total tabs: "+windows.size());
		//for (String window : windows) {System.out.println("Window Handles:"+window);}
		System.out.println("Window Handles:");
		windows.forEach(System.out::println);
		for (String window : windows) {
			driver.switchTo().window(window);
			System.out.println("Window url is: "+driver.getCurrentUrl());
			System.out.println("Window title is: "+driver.getTitle());
			if (tabTitle.equals(driver.getTitle())) {
				break;
			}
		}		
	}
}
