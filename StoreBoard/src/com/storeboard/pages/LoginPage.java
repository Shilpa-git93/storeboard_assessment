package com.storeboard.pages;import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * This POM class contains the address of the webelement present on the Login page and contains address returning method and
 * action performing method which has to be called in the  test classes whenever required[used the concept of encapsulation and 
 * abstract class ]
 * @author Shilpa
 *
 */
public class LoginPage 
{
	@FindBy(className="log-in-btn") private WebElement loginBtn;
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void setLoginBtn() {
		loginBtn.click();
	}
	@FindBy(id="LogInUserID") private WebElement userNameTextbox;
	public WebElement getUserNameTextbox() {
		return userNameTextbox;
	}
	public void setUserNameTextbox(String userName) {
		 userNameTextbox.sendKeys(userName);
	}
	@FindBy(id="LogInPopupPassword") private WebElement passwordTextBox;
	
	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}
	public void setPasswordTextBox(String password) {
		passwordTextBox.sendKeys(password);;
	}
	@FindBy(xpath="//div[@className='log-in-popup_submit-line']/descendant::input[@type='button']") private WebElement submitBtn;
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public void setSubmitBtn() {
		 submitBtn.click();;
	}
	public void login(String userName,String passWord)
	{
		this.setLoginBtn();
		this.setUserNameTextbox(userName);
		this.setPasswordTextBox(passWord);
		this.setSubmitBtn();
		
	}
	
			
}
