package com.storeboard.generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
/**This class contains the generic reusable methods of selenium webdriver interface which has to be called in the test class 
 * whenever required so the test class is light weight and reduces the number of lines in the code.
 * 
 * @author Shilpa
 *
 */

public class WebDriverCommonLibrary extends BaseTest
{
	public static WebDriver driver;
	public String getPageTitle()
	{
		String title=driver.getTitle();
		return title;	
	}
	public void waitForPageLoad(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void waitForVisibilityOfElement(By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));			
	}
	public void selectOption(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectOption(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public void selectOption(String value,WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void moveToElement(WebElement element)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
	}
	public void verifyAssert(String actual,String expected,String message)
	{
		Assert.assertEquals(actual,expected);
		Reporter.log(message+"is verified,passed",true);
	}
	public void verifySoftAssert(String actual,String expected,String message)
	{
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual, expected);
		Reporter.log(message+"is verified,passed",true);
	}
	
	

}
