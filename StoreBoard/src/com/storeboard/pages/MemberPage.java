package com.storeboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * This POM class contains the address of the webelement present on the Member Page page and contains address returning method and
 * action performing method which has to be called in the  test classes whenever required[used the concept of encapsulation and 
 * abstract class ]
 * @author Shilpa
 *
 */

public class MemberPage 
{
	@FindBy(id="rdChoice8") private WebElement generalBusinessOptn;
	public WebElement getGeneralBusinessOptn() {
		return generalBusinessOptn;
	}
	public void setGeneralBusinessOptn() {
		 generalBusinessOptn.click();
	}
	@FindBy(xpath="//a[.='Save & Continue']") private WebElement saveandContinueBtn;
	
	public WebElement getSaveandContinueBtn() {
		return saveandContinueBtn;
	}
	public void setSaveandContinueBtn() {
		saveandContinueBtn.click();;
	}

}
