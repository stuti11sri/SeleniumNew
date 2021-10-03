package newProj_demoqa_forms_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import newProj_demoqa_forms_PageObjects.PageObject_OpenForms;
import newProj_demoqa_forms_Utilities.BrowserManager;
import newProj_demoqa_forms_Utilities.CommonFunctions;
import newProj_demoqa_forms_Utilities.ExcelUtility;

public class TC15_new {
	@Test
	 public void read()
	
	{	
		
		//WebDriver driver=BrowserManager.getDriver(browser,URL);
		//CommonFunctions.scroll(driver);
		//PageObject_OpenForms obj=PageFactory.initElements(driver,PageObject_OpenForms.class);
		//obj.openFormFromHome();
		//Reporter.log("Passed");
		ExcelUtility exl=new ExcelUtility();
		exl.readExcelHashMap();
		//driver.close();
	}

}
