package keyPress;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTest;

public class HorizontalTests extends BaseTest{

	@Test
	public void testSuccessfullMoveOnSlider() {
		var horizontalSliderPage = homePage.clickHorizontalSliderLink();
		horizontalSliderPage.moveOnHoriozontalSlider();		
		assertEquals(horizontalSliderPage.getSliderRange(), "4","Value is not = 4");
	}
}
