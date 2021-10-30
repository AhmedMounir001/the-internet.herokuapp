package alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTest{

	@Test
	public void testRightClick() {
		ContextMenuPage contextMenuPage=homePage.clickContextMenuLink();
		contextMenuPage.rightClickHotSpotBox();
		contextMenuPage.jsAlertAccept();
		System.out.println(contextMenuPage.getHeaderData());
		assertEquals(contextMenuPage.getHeaderData(), "Context Menu","Wrrrrrrong ");
	}
}
