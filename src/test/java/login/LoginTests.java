package login;


import static org.testng.Assert.*;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTest {
	
	private String userName="tomsmith";
	private String password= "SuperSecretPassword!";
	private String expectedSuccessfulMessage="You logged into a secure area!";
	private String ExpectedErrorMessage= "invalid";
	
	private String msg="Faile to get this message";

	@Test
	public void testSuccessfulLogin() {
		LoginPage loginPage = homePage.clickAuthenticationLink();
		loginPage.typeUserName(userName);
		loginPage.typePassword(password);
		SecureAreaPage secureAreaPage=loginPage.clickLogin();
		assertTrue(secureAreaPage.getFlashMessage().contains(expectedSuccessfulMessage), msg);
		//assertEquals(secureAreaPage.getFlashMessage(), expectedMessage,"Faile to get this message");
	}
	@Test
	public void testCantLoginWithoutUserNameAndPassword() {
		LoginPage loginPage = homePage.clickAuthenticationLink();
		loginPage.clickLogin();
		assertTrue(loginPage.getErrorMessage().contains(ExpectedErrorMessage), msg);
	}
	@Test
	public void testCantLoginWithWrogUsername() {
		LoginPage loginPage = homePage.clickAuthenticationLink();
		loginPage.typeUserName("Wrong");
		loginPage.typePassword(password);
		loginPage.clickLogin();
		assertTrue(loginPage.getErrorMessage().contains(ExpectedErrorMessage), msg);
	}
	@Test
	public void testCantLoginWithWrongPassword() {
		LoginPage loginPage = homePage.clickAuthenticationLink();
		loginPage.typeUserName(userName);
		loginPage.typePassword("Wrong");
		loginPage.clickLogin();
		assertTrue(loginPage.getErrorMessage().contains(ExpectedErrorMessage), msg);
		
	}
}
