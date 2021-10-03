package newProj_demoqa_forms_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import newProj_demoqa_forms_PageObjects.PageObject_OpenForms;
import newProj_demoqa_forms_Utilities.BrowserManager;
import newProj_demoqa_forms_Utilities.CommonFunctions;

public class TC01_OpenForms {

	@Test
	@Parameters({"browser","URL"} )
	 public void tc01_openForms(String browser , String URL)
	
	{	
		
		WebDriver driver=BrowserManager.getDriver(browser,URL);
		CommonFunctions.scroll(driver);
		PageObject_OpenForms obj=PageFactory.initElements(driver,PageObject_OpenForms.class);
		obj.openFormFromHome();
		Reporter.log("Passed");
		driver.close();
	}
}
