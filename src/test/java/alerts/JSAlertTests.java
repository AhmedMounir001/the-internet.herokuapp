package alerts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.JavaScriptAlertsPage;

public class JSAlertTests extends BaseTest {

	private String promptText="MO";
	@Test
	public void testAcceptAlert() {
		JavaScriptAlertsPage jsAlertsPage = homePage.clickJavaScriptAlertsLinks();
		jsAlertsPage.triggerAlert();
		jsAlertsPage.acceptAlert();
		assertEquals(jsAlertsPage.getResult(), "You successfully clicked an alert", "Wrong message");
	}

	@Test
	public void testOKConfirmAlert() {
		JavaScriptAlertsPage jsAlertsPage = homePage.clickJavaScriptAlertsLinks();
		jsAlertsPage.triggerConfirm();
		jsAlertsPage.acceptAlert();
		assertEquals(jsAlertsPage.getResult(), "You clicked: Ok", "Wrong message");
	}



	@Test
	public void testCancelConfirmAlert() {
		JavaScriptAlertsPage jsAlertsPage = homePage.clickJavaScriptAlertsLinks();
		jsAlertsPage.triggerConfirm();
		jsAlertsPage.dismissAlert();
		assertEquals(jsAlertsPage.getResult(), "You clicked: Cancel", "Wrong message");
	}
	
	@Test
	public void testtyppingInPromptAndOK() {
		JavaScriptAlertsPage jsAlertsPage = homePage.clickJavaScriptAlertsLinks();
		jsAlertsPage.triggerPrompt();
		jsAlertsPage.addTextToPrompt(promptText);
		jsAlertsPage.acceptAlert();		
		assertTrue(jsAlertsPage.getResult().contains(promptText));
	}
	
	@Test
	public void testtyppingInPromptAndCancel() {
		JavaScriptAlertsPage jsAlertsPage = homePage.clickJavaScriptAlertsLinks();
		jsAlertsPage.triggerPrompt();
		jsAlertsPage.addTextToPrompt(promptText);
		jsAlertsPage.dismissAlert();		
		assertFalse(jsAlertsPage.getResult().contains(promptText));
	}
}
