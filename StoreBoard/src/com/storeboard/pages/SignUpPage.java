package com.storeboard.pages;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.storeboard.generic.FileLibrary;
import com.storeboard.generic.WebDriverCommonLibrary;

public class SignUpPage 
{
	WebDriver driver;
	WebDriverCommonLibrary wlib=new WebDriverCommonLibrary();
	FileLibrary flib=new FileLibrary();
	@FindBy(xpath="//input[@id='tbFirstName']") private WebElement firstNameBtn;
	
	public WebElement getFirstNameBtn() {
		return firstNameBtn;
	}

	public void setFirstNameBtn(String firstName) {
		 firstNameBtn.sendKeys(firstName);
	}
	@FindBy(xpath="//input[@id='tbLastName']") private WebElement lastNameBtn;
	public WebElement getLastNameBtn() {
		return lastNameBtn;
	}

	public void setLastNameBtn(String lastName) {
		 lastNameBtn.sendKeys(lastName);
	}

	@FindBy(xpath="//input[@id='tbEmail']")  private WebElement emailAddressBtn;
	public WebElement getEmailAddressBtn() {
		return emailAddressBtn;
	}

	public void setEmailAddressBtn(String emailAddress) {
		emailAddressBtn.sendKeys(emailAddress);;
	}
	@FindBy(xpath="//input[@id='tbPassword']") private WebElement passwordBtn;
	public WebElement getPasswordBtn() {
		return passwordBtn;
	}

	public void setPasswordBtn(String password) {
		passwordBtn.sendKeys(password);
	}
	@FindBy(xpath="//input[@id='tbPassword2']") private WebElement confirmPasswordBtn;
	public WebElement getConfirmPasswordBtn() {
		return confirmPasswordBtn;
	}

	public void setConfirmPasswordBtn(String confirmPassword) {
		 confirmPasswordBtn.sendKeys(confirmPassword);
	}
	@FindBy(xpath="//input[@id='regReceiveSubscribe']") private WebElement chkBtn;
	public WebElement getChkBtn() {
		return chkBtn;
	}

	public void setChkBtn() {
		 chkBtn.click();
	}
	@FindBy(xpath="//span[@id='recaptcha-anchor']") private WebElement capthBtn;

	public WebElement getCapthBtn() {
		return capthBtn;
	}

	public void setCapthBtn() {
		 capthBtn.click();
	}
	@FindBy(xpath="//div[@class='capcha-submit-btn-wrp']/descendant::input[@type='button' ]") private WebElement letsGoBtn;

	public WebElement getLetsGoBtn() {
		return letsGoBtn;
	}

	public void setLetsGoBtn() {
		 letsGoBtn.click();
	}
	public void signUp(String firstName, String lastName, String emailAddress,String password,String confirmPassword) throws EncryptedDocumentException, Throwable
	{
		this.setFirstNameBtn(firstName);
		this.setLastNameBtn(lastName);
		this.setEmailAddressBtn(emailAddress);
		this.setPasswordBtn(confirmPassword);
		this.setPasswordBtn(confirmPassword);
		this.setChkBtn();
		WebElement fAddr=driver.findElement(By.id("gRecaptcha"));
		driver.switchTo().frame(fAddr);
		this.setCapthBtn();
		this.setLetsGoBtn();
		String expectedHomeTitle=flib.getCellData("EXCEL_PATH", "Sheet1", 0, 5);
		wlib.verifyAssert(wlib.getPageTitle(), expectedHomeTitle, "login page is dispalyed");
	}

	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
