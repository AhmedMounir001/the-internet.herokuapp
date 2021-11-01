package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePge {

	private WebDriver driver;
	
	public HomePge(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Dynamic method to click on any link By adding link text
	 * 
	 */
	private void clickLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}

	/**
	 * When click on Authentication Link it will open login page
	 * @return
	 * LoginPage
	 */
	public LoginPage clickAuthenticationLink() {
		clickLink("Form Authentication");		
		return new LoginPage(driver);
	}
	
	/**
	 * When click on Dropdpwn List Link it will open Dropdpwn List page
	 * @return
	 * DropdownListPage
	 */
	public DropdownListPage clickDropdownListLink() {
		clickLink("Dropdown");
		return new DropdownListPage(driver);		
	}
	public HoversPage clickHoversLink() {
		clickLink("Hovers");
		return new HoversPage(driver);
	}
	public KeyPressesPage clickKeyPressesLink() {
		clickLink("Key Presses");
		return new KeyPressesPage(driver);
	}
	/**
	 * @return HorizontalSliderPage
	 */
	public HorizontalSliderPage clickHorizontalSliderLink() {
		clickLink("Horizontal Slider");
		return new HorizontalSliderPage(driver);
	}
	/** 
	 * @return JavaScriptAlertsPage
	 */
	public JavaScriptAlertsPage clickJavaScriptAlertsLinks() {
		clickLink("JavaScript Alerts");
		return new JavaScriptAlertsPage(driver);		
	}
	/** 
	 * @return FileUploadPage
	 */
	public FileUploadPage clickFileUploadLink() {
		clickLink("File Upload");
		return new FileUploadPage(driver);
	}
	
	public EntryAdPage clickEntryAdLink() {
		clickLink("Entry Ad");
		return new EntryAdPage(driver);
	}
	public ContextMenuPage clickContextMenuLink() {
		clickLink("Context Menu");
		return new ContextMenuPage(driver);		
	}
	
	public WysiWygEditorPage clickWysiWygEditorLink() {
		clickLink("WYSIWYG Editor");
		return new WysiWygEditorPage(driver);
	}

	public DynamicLoadingPage clickDynamicLoadingLink() {
		clickLink("Dynamic Loading");
		return new DynamicLoadingPage(driver); 
	}
	public MultipleWindowsPage clickMultipleWindowsPage() {
		clickLink("Multiple Windows");
		return new MultipleWindowsPage(driver);
	}
}
