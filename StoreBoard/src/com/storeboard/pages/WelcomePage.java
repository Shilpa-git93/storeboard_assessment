package com.storeboard.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.storeboard.generic.WebDriverCommonLibrary;

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
