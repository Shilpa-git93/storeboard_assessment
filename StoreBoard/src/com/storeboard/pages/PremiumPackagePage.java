package com.storeboard.pages;

import org.openqa.selenium.WebDriver;
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
