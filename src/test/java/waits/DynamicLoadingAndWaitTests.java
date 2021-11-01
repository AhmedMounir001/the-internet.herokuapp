package waits;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTest;

public class DynamicLoadingAndWaitTests extends BaseTest{

	@Test
	public void testDynamicLoadingExample1() {
		var example1= homePage.clickDynamicLoadingLink().clickExample1();
		example1.clickStartButton();
		assertEquals(example1.getFinishMessage(), "Hello World!","Wrong message");
	}
	@Test
	public void testDynamicLoadingExample2() {
		var example2= homePage.clickDynamicLoadingLink().clickExample2();
		example2.clickStartButton();
		assertEquals(example2.getFinishMessage(), "Hello World!","Wrong message");
	}
}
