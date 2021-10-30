package alerts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTest {

	@Test
	public void testSuccessflUploadFile() {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/UploadedFiles/Ahmed Mounir.pdf";
		FileUploadPage fileUploadPage = homePage.clickFileUploadLink();
		fileUploadPage.uploadFile(filePath);
		assertTrue(fileUploadPage.getUploadedFileName().contains("Mounir"),"Kindly Check file name");;
	}
}
