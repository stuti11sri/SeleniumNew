package newProj_demoqa_forms_PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class PageObject_OpenForms {
	WebDriver driver;
	
	public PageObject_OpenForms(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]")
	private WebElement link_Form;
	
	@FindBy(how=How.CLASS_NAME, using="main-header")
	private WebElement heading_Form;
	
	//Methods
	public void clickForm()
	{
		link_Form.click();
		Reporter.log("clicked on form link");
	}
	public String getHeading()
	{
		String head=heading_Form.getText();
		Reporter.log("Retrieved form heading");
		return head;
	}
	public void openFormFromHome()
	{
	
		clickForm();
		String actual=getHeading();
		String expected="Forms";
		Assert.assertEquals(actual,expected);
		//Assert.assertEquals(actual, expected, "Not working");
		Reporter.log("Correct page opened");
		
	}
}
