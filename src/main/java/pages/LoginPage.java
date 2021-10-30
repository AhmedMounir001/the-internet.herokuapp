package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private WebDriver driver;
	private By userNameTxt= By.id("username");
	private By passWordTxt= By.id("password");
	private By loginBtn= By.className("radius");
	private By errorFlashMessage = By.id("flash");
	
	public void typeUserName(String userName) {
		driver.findElement(userNameTxt).sendKeys(userName);		
	}

	public void typePassword(String password) {
		driver.findElement(passWordTxt).sendKeys(password);
	}
	 /**
	  * 
	  * @return
	  * SecureAreaPage
	  */
	public SecureAreaPage clickLogin() {
		driver.findElement(loginBtn).click();
		return new SecureAreaPage(driver);
	}
	public String getErrorMessage(){
		return driver.findElement(errorFlashMessage).getText();
	}
}
