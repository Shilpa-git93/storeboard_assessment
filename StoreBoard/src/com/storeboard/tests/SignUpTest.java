package com.storeboard.tests;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.storeboard.generic.BaseTest;
import com.storeboard.generic.FileLibrary;
import com.storeboard.generic.WebDriverCommonLibrary;
import com.storeboard.pages.MemberPage;
import com.storeboard.pages.RegistrationPage;
import com.storeboard.pages.SignUpPage;
import com.storeboard.pages.WelcomePage;
/** 
 *This class contains method related to signing up to the storeboard website
 */
public class SignUpTest extends BaseTest
{
	WelcomePage wp; 
	SignUpPage sp;
	FileLibrary flib;
	WebDriverCommonLibrary wlib;
	MemberPage mb=new MemberPage();
	RegistrationPage rp=new RegistrationPage();
	/**;
	 * method signIn related to signing into the application by entering the valid data 
	 * into  all the textfields by using data present in filelibrary .
	 * @throws Throwable 
	 * @throws EncryptedDocumentException 
	 */
	@Test
	public void signIn() throws  Throwable
	{
		wp=new WelcomePage(driver);
		sp=new SignUpPage(driver);
		flib=new FileLibrary();
		wlib=new WebDriverCommonLibrary();
		wp.mouseHoverToJoinNowLink();
		wp.getJoinNowLink().click();
		sp.getFirstNameBtn().sendKeys(flib.getCellData(EXCEL_PATH, "Sheet1", 0, 0));
		sp.getLastNameBtn().sendKeys(flib.getCellData(EXCEL_PATH, "Sheet1", 0, 1));
		sp.getEmailAddressBtn().sendKeys(flib.getCellData(EXCEL_PATH, "Sheet1", 0,2));
		sp.getPasswordBtn().sendKeys(flib.getCellData(EXCEL_PATH, "Sheet1", 0, 3));
		sp.getConfirmPasswordBtn().sendKeys(flib.getCellData(EXCEL_PATH, "Sheet1", 0, 4));
		sp.setChkBtn();
		WebElement fAddr=driver.findElement(By.id("gRecaptcha"));
		driver.switchTo().frame(fAddr);
		sp.setCapthBtn();
		sp.setLetsGoBtn();
		String expectedHomeTitle=flib.getCellData(EXCEL_PATH, "Sheet1", 0, 5);
		wlib.verifyAssert(wlib.getPageTitle(), expectedHomeTitle, "login page is dispalyed");
		}
	/**
	 * using more customized way...just caling the signUp method by passing the parameters
	 * @throws Throwable 
	 * @throws EncryptedDocumentException 
	 */
	
	@Test
	public void signIn1() throws EncryptedDocumentException, Throwable
	{
		sp.signUp(flib.getCellData(EXCEL_PATH, "Sheet1", 0, 0),flib.getCellData(EXCEL_PATH, "Sheet1",0, 1),flib.getCellData(EXCEL_PATH, "Sheet1", 0, 2), 
				flib.getCellData(EXCEL_PATH, "Sheet1", 0, 3),flib.getCellData(EXCEL_PATH, "Sheet1", 0, 4));
	}
	@Test
	public void signInDetails() throws EncryptedDocumentException, Throwable
	{
		//Selecting the bussiness option by the calling method present in member page
		mb.setGeneralBusinessOptn();
		//Clicking on save and continue button
		mb.setSaveandContinueBtn();
		String expectedTitle =driver.getTitle();
		//verfiying whether registration page should be displayed.
		wlib.verifyAssert(driver.getTitle(), expectedTitle,"user register page should be displayed");
		//Entering the bussiness name text field by calling the method present in Registration Page and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		rp.setBussinessNameTb(flib.getCellData(REGISTER_EXCEL_PATH, "Sheet1", 1, 0));
		//Entering the Address text field by calling the method present in Registration Page and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		rp.setAddressTb(flib.getCellData(REGISTER_EXCEL_PATH, "Sheet1", 1, 1));
		//Selecting the country name from the country dropdown list by calling the method present in Registration page
		rp.setCountrydd();
		//Entering the State text field by calling the method present in Registration Page and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		rp.setState(flib.getCellData(REGISTER_EXCEL_PATH, "Sheet1", 1, 2));
		//Entering the city text field by calling the method present in Registration Page and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		rp.setCitydd(flib.getCellData(REGISTER_EXCEL_PATH, "Sheet1", 1, 5));
		//clicking the business phone number checkbox
		rp.setBussinessPhoneNumber();
		//Entering the Website text field by calling the method present in Registration Page and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		rp.setWebsiteAddress(flib.getCellData(REGISTER_EXCEL_PATH, "Sheet1", 1, 3));
		//Selecting the years in bussiness dropdown list from the years in bussiness dropdown list by calling the method present in Registration page
		rp.setYearInBussinessdd();
		//Selecting the storeboard city name from the storeboard city dropdown list by calling method present in Registration page
		rp.setStoreBoardCitydd();
		//Selecting the directory category name from the directory category dropdown list by calling method present in Registration page
		rp.setSelectDirectoryCategor();;
		//Selecting the bussiness name from the bussiness dirctory category dropdown list by calling method present in Registration page
		rp.setBussinessCategorydd();
		//Entering the brief description about bussiness text area by calling the method present in Registration Page and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		rp.setBriefDescriptionAbtBusiness(flib.getCellData(REGISTER_EXCEL_PATH, "Sheet1", 1, 4));
		//clicking on submit button by calling the method present in registrartion page
		rp.setSubmitBtn();
		String homeTitle=driver.getTitle();
		//verifying whether home page is displayed or not
		wlib.verifyAssert(driver.getTitle(),homeTitle,"homepage should be displayed");
		
		
		
	}
}
