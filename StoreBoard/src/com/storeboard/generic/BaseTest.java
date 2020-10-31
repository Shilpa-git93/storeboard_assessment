package com.storeboard.generic;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
/**
 * There are few actions which has to be repeated in every testscripts like opening the browser and closing browser so, instead of 
 * repeating these steps in every test scripts,I created a class known as BaseTest(which extends in every test class) which contains method related to opening the browser 
 * and closing the browser and by using testNg annotations these methods are automatically called to every test class.[used the inheritance concept of java]
 * @author Shilpa
 *
 */
public class BaseTest implements IAutoConsts
{
	public static WebDriver driver;
	FileLibrary flib;
	WebDriverCommonLibrary wlib;
	
	@BeforeMethod
	public void openBrowser() throws Throwable
	{
		flib=new FileLibrary();
		wlib=new WebDriverCommonLibrary();
		String browserValue=flib.getKeyPropValue(PROPERTY_PATH, "browser");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		else
		{
			Reporter.log("Enter Correct Browser Name", true);
		}
		driver.get(flib.getKeyPropValue(PROPERTY_PATH, "url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		String expectedWelcomePageTitle=driver.getTitle();
		wlib.verifyAssert(driver.getTitle(), expectedWelcomePageTitle,"welcomepage is displayed");
	}
	

@AfterMethod
public void closeBrowser()
{
	driver.quit();
}
}





