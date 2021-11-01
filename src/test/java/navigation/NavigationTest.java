package navigation;

import org.testng.annotations.Test;

import base.BaseTest;

public class NavigationTest extends BaseTest{

	@Test
	public void testNavigation() {
		homePage.clickDynamicLoadingLink().clickExample1();
		getWindoManager().goBack();
		getWindoManager().goForward();
		getWindoManager().refreshPage();
		getWindoManager().goToUrl("https://github.com/AhmedMounir001/the-internet.herokuapp/tree/master");
	}

	@Test
	public void testWitchToTabs() {
		homePage.clickMultipleWindowsPage().clickHereLink();
		getWindoManager().switchToTab("New Window");
	}
	@Test
	public void testRightClickToOpenNewTab() {
		homePage.clickDynamicLoadingLink().clickExample2();		
	}
}
