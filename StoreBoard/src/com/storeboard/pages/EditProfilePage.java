package com.storeboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.storeboard.generic.WebDriverCommonLibrary;
/**
 * This POM class contains the address of the webelement present on the edit profile page and contains address returning method and
 * action performing method which has to be called in the  test classes whenever required[used the concept of encapsulation and 
 * abstract class ]
 * @author Shilpa
 *
 */
public class EditProfilePage 
{
	WebDriverCommonLibrary wlib=new WebDriverCommonLibrary();
	@FindBy(xpath="//a[.='Profile']") private WebElement profileOption;
	public WebElement getProfileOption() {
		return profileOption;
	}
	public void setProfileOption() {
		wlib.moveToElement(profileOption);
	}
	@FindBy(xpath="//a[.='Manage Profile']") private WebElement manageProfileOption;
	
	public WebElement getManageProfileOption() {
		return manageProfileOption;
	}
	public void setManageProfileOption() {
		 manageProfileOption.click();;
	}

}
