package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePge;
import utils.WindowManager;

public class BaseTest {
	
	private WebDriver driver;
	protected HomePge homePage;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromiumdriver().browserVersion("95").setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().setScriptTimeout(4, TimeUnit.SECONDS);
		goHome();
		homePage = new HomePge(driver);
	}
	
	@BeforeMethod
	public void goHome() {
		driver.get("https://the-internet.herokuapp.com");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	protected WindowManager getWindoManager() {
		return new WindowManager(driver);
	}
}
