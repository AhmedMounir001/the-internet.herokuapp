package alerts;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.EntryAdPage;

public class EntryAdTests extends BaseTest{

	@Test
	public void testClickOnClose() {
		EntryAdPage entryAdPage=homePage.clickEntryAdLink();
		entryAdPage.switchToModalAd();
	}
}
