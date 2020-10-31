package com.storeboard.pages;

import org.openqa.selenium.WebDriver;
/**
 * This POM class contains the address of the webelement present on the PremiumPackage page page and contains address returning method and
 * action performing method which has to be called in the  test classes whenever required[used the concept of encapsulation and 
 * abstract class ]
 * @author Shilpa
 *
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.storeboard.generic.WebDriverCommonLibrary;

public class PremiumPackagePage 
{
	@FindBy(xpath="") private WebElement storeBoardText;
	WebDriver driver;
	WebDriverCommonLibrary wlib=new WebDriverCommonLibrary();
	public WebElement getStoreBoardText() {
		return storeBoardText;
	}

	public void setStoreBoardText() 
	{
		wlib.moveToElement(storeBoardText);
		getStoreBoardText().click();
		
	}
}
