package keyPress;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.KeyPressesPage;

public class KeyPressTests extends BaseTest{


	
	@Test
	public void testBackSpace() {
		KeyPressesPage keyPressesPage=homePage.clickKeyPressesLink();
		keyPressesPage.enterText("G"+Keys.BACK_SPACE);
		assertTrue(keyPressesPage.getResultText().contains("BACK_SPACE"),"Wrong result");				
		assertEquals(keyPressesPage.getResultText(), "You entered: BACK_SPACE");
	}
	
	@Test
	public void testPi() {
		KeyPressesPage keyPressesPage=homePage.clickKeyPressesLink();
		keyPressesPage.enterPie();
	}
}
