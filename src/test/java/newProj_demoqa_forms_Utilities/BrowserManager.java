package newProj_demoqa_forms_Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class BrowserManager {
	public static WebDriver getDriver(String type, String URL)
	{	WebDriver driver=null;	
		if(type.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\stuti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		Reporter.log("Chrome is selected");
		}
		else if(type.equalsIgnoreCase("firefox"))
		{
		
		driver=new FirefoxDriver();
		}
		else
		{
			Assert.assertTrue(false,"This browser not supported");
		}
		
		driver.get(URL);
		Reporter.log("URL is opened");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	
	}

}
