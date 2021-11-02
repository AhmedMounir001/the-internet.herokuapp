package base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePge;
import utils.EventReporter;
import utils.WindowManager;

public class BaseTest {

	private EventFiringWebDriver driver;
	protected HomePge homePage;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromiumdriver().browserVersion("95").setup();
		driver = new EventFiringWebDriver(new ChromeDriver());
		driver.register(new EventReporter());
		//driver.manage().timeouts().setScriptTimeout(4, TimeUnit.SECONDS);
		goHome();
	}

	@BeforeMethod
	public void goHome() {
		driver.get("https://the-internet.herokuapp.com");
		homePage = new HomePge(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@AfterMethod
	public void screenshotFailure(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {

			var camera =(TakesScreenshot)driver;
			File screenshot= camera.getScreenshotAs(OutputType.FILE);
			//System.out.println("screenshot taken: "+screenshot.getAbsolutePath());
			try {
				Files.move(screenshot, new File("src/main/resources/Screenshots/"+result.getName()+".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	protected WindowManager getWindoManager() {
		return new WindowManager(driver);
	}
}
