package hovers;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.FigureCaption;
import pages.HoversPage;

public class HoversTests  extends BaseTest{
	
	@Test
	public void testHoverUser1() {
		HoversPage hoversPage= homePage.clickHoversLink();
		FigureCaption figureCaption =hoversPage.hoveroverFigure(1);
		
		System.out.println(figureCaption.getTitle());
		
		assertTrue(figureCaption.isCaptionDisplay(), "figure caption does not display");
		assertEquals(figureCaption.getTitle(), "name: user1","Title is incorect");
		assertTrue(figureCaption.getLinktext().contains("profile"),"user profile did not display");
		assertTrue(figureCaption.getLink().endsWith("users/1"),"incorrect link");
	}
	@Test
	public void testHoverUser2() {
		HoversPage hoversPage= homePage.clickHoversLink();
		FigureCaption figureCaption =hoversPage.hoveroverFigure(2);
		
		System.out.println(figureCaption.getTitle());
		
		assertTrue(figureCaption.isCaptionDisplay(), "figure caption does not display");
		assertEquals(figureCaption.getTitle(), "name: user2","Title is incorect");
		assertTrue(figureCaption.getLinktext().contains("profile"),"user profile did not display");
		assertTrue(figureCaption.getLink().endsWith("users/2"),"incorrect link");
	}
	@Test
	public void testHoverUser3() {
		HoversPage hoversPage= homePage.clickHoversLink();
		FigureCaption figureCaption =hoversPage.hoveroverFigure(3);
		
		System.out.println(figureCaption.getTitle());
		
		assertTrue(figureCaption.isCaptionDisplay(), "figure caption does not display");
		assertEquals(figureCaption.getTitle(), "name: user3","Title is incorect");
		assertTrue(figureCaption.getLinktext().contains("profile"),"user profile did not display");
		assertTrue(figureCaption.getLink().endsWith("users/3"),"incorrect link");
	}
	

}
