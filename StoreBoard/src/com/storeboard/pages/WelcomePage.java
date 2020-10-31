package com.storeboard.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.storeboard.generic.WebDriverCommonLibrary;
/**
 * This POM class contains the address of the webelement present on the welcome page and contains address returning method and
 * action performing method which has to be called in the  test classes whenever required[used the concept of encapsulation and 
 * abstract class ]
 * @author Shilpa
 *
 */
public class WelcomePage
{
	WebDriverCommonLibrary wlib=new WebDriverCommonLibrary();
	@FindBy(xpath="//a[.='Join Now']") private WebElement joinNowLink;

	public WebElement getJoinNowLink() {
		return joinNowLink;
	}

	public void mouseHoverToJoinNowLink() {
		wlib.moveToElement(joinNowLink);
		 
	}
	
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
