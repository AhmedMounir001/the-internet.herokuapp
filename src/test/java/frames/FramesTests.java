package frames;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.WysiWygEditorPage;

public class FramesTests extends BaseTest {

	private String text1="Hi ";
	private String text2="Automation World";
	private String AllTexts=text1+text2;
	@Test
	public void TestTextAreaEditor() {
		WysiWygEditorPage editorChange=homePage.clickWysiWygEditorLink();		
		editorChange.clearTextArea();
		editorChange.clickIncreaseIndent();		
		editorChange.setTextArea(text1);
		editorChange.setTextArea(text2);
		System.out.println(editorChange.getEditorAreaText());
		assertEquals(editorChange.getEditorAreaText(), text1+text2,"Wrong Data");
		//assertTrue(editorChange.getEditorAreaText().contains(text1),"Wrong Data");
	}
}
