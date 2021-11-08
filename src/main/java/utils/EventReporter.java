package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventReporter implements WebDriverEventListener {

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("Click On: Accept Alert");
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		
		System.out.println("Done");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("Click On: Dismiss Alert");	

	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("Done");		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigate to: "+url);
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {		
		System.out.println("Navigation to "+"' "+url+" '"+"Done");

		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Click On: Back");
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigate Back Done");		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Click On: Forward");		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Navigate Forward Done");
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("Click On: Refresh");		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("Refresh Done");
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		//System.out.println("Click on: "+element.getText()+"By Find By: "+by.toString());		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		//System.out.println("Done");
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Click On: "+element.getText());

		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		
		System.out.println("Click on "+element.getText()+" Done");

		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		//System.out.println("Changing value of: "+element.getText());		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Done");

	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Switch to window: "+windowName);
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Switching to window Done");		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		System.out.println("Taking screenshot: "+target.toString());		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		System.out.println("Screenahot Done");
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("Get text from: "+element.getText());
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("Done");		
	}

}
