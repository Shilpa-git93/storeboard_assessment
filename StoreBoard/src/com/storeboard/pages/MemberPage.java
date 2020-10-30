package com.storeboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
