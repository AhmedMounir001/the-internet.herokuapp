package dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropdownListPage;

public class DropdownTests extends BaseTest{

	private String option="Option 1";
	
	@Test
	public void testSelectedOption() {
		DropdownListPage dropdownListPage=homePage.clickDropdownListLink();
		dropdownListPage.selectFromDropdown(option);			
		var selectedOption= dropdownListPage.getSelectedOptions();
		assertEquals(selectedOption.size(), 1,"incorrect Number of selection");
		assertTrue(selectedOption.contains(option), option);
		assertTrue(selectedOption.contains(option),"Option not selected");		
	}
	@Test
	public void testAllOptions() {
		DropdownListPage dropdownListPage=homePage.clickDropdownListLink();
		assertEquals(dropdownListPage.getAllOptions().size(), 3);		
		System.out.println(dropdownListPage.getAllOptions().toString());
	}
	@Test
	public void testFirstSelectedOption() {
		DropdownListPage dropdownListPage=homePage.clickDropdownListLink();
		var firstOptin=dropdownListPage.getFirstSelectedOption();
		assertTrue(firstOptin.getText().contains("Please"),"First option is wrong");
	}
}
