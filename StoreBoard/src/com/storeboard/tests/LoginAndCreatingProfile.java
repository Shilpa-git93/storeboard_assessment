package com.storeboard.tests;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.storeboard.generic.BaseTest;
import com.storeboard.generic.FileLibrary;
import com.storeboard.generic.WebDriverCommonLibrary;
import com.storeboard.pages.EditProfilePage;
import com.storeboard.pages.LoginPage;
import com.storeboard.pages.ManageProfilePage;
import com.storeboard.pages.PremiumPackagePage;

/**
 * this class conatins methods related to login to the storeboard website and creating a profile
 * @author Shilpa
 *
 */
public class LoginAndCreatingProfile extends BaseTest
{
	LoginPage lp=new LoginPage();
	FileLibrary flib=new FileLibrary();
	WebDriverCommonLibrary wlib=new WebDriverCommonLibrary();
	PremiumPackagePage pp=new PremiumPackagePage();
	EditProfilePage ep=new EditProfilePage();
	ManageProfilePage mp=new ManageProfilePage();
	/**
	 * loging into the application by calling the login method present in loginPage.java and by using the data present in propeerty file
	 */
	@Test
	public void Login() throws Throwable
	{
		lp.login(flib.getKeyPropValue(PROPERTY_PATH,"username"),flib.getKeyPropValue(PROPERTY_PATH, "password"));
		String expectedTitle=driver.getTitle();
		wlib.verifyAssert(driver.getTitle(), expectedTitle, "premiumpackage page should be displayed");
	}
	/**
	 * @throws Throwable 
	 * @throws EncryptedDocumentException 
	 * 
	 */
	@Test
	public void creatingProfile() throws EncryptedDocumentException, Throwable
	{
		//clicking on storeboard text present on top left corner of the webpage
		pp.setStoreBoardText();
		String expectedEditTitle=driver.getTitle();
		wlib.verifyAssert(driver.getTitle(), expectedEditTitle,"edit profile page should be displayed");
		//clicking on manage profile option under profile option present on left navigational bar
		ep.setProfileOption();
		ep.setManageProfileOption();
		String expectedManageTitle=driver.getTitle() ;
		wlib.verifyAssert(driver.getTitle(),expectedManageTitle,"manage profile page should be displayed");
		//entering the address by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setAddress(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 0));
		//entering the state of provinence by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setStateOfProvinence(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 1));
		//entering the state of phone number by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setPhone(flib.getIntCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 2));
		//entering the Alternate phone no1 by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setAlternatePhoneNo1(flib.getIntCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 3));
		//entering the Alternate phone no2 by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setAlternatePhoneNo2(flib.getIntCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 4));
		//entering the email address by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setEmail(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 5));
		//entering the website address by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setWebsite(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 6));
		//clicking on save changes button
		mp.setSaveBtn();
		//entering the facebook address by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setFacebookPageUrl(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 7));
		//entering the ownername by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet and by selecting the dropdownlist present in the webpage.
		mp.setOwnerNameDD();
		mp.setOwnerName(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1,10));
		//entering the owner phone number by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet and by selecting the dropdownlist present in the webpage.
		mp.setOwnerphoneDD();
		mp.setOwnerPhone(flib.getIntCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 11));
		//entering the owners email address by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setOwnerEmail(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 12));
		//entering the manager name by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet and by selecting the dropdownlist present in the webpage.
		mp.setManagerNameDD();
		mp.setManageName(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 13));
		//entering the manager phone number by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet and by selecting the dropdownlist present in the webpage.
		mp.setManagerPhoneDD();
		mp.setManagePhone(flib.getIntCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 14));
		//entering the managers email address by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setManageEmail(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 15));
		//hours
		//entering the specialized in by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setSpecializedIn(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 16));
		//entering the how we got started text area by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setHowWeGotStarted(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 17));
		//selecting the years in bussiness dropdown list by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setYearsInBusinessDD();
		//Entering favourite part of the bussiness text area by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setFavoritePartOfTheBussiness(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 18));
		//Entering customer can expect text area by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setCustomerCanExpect(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 19));
		//Selecting price,value,expertise,convenience,selection,service dropdownlist by calling the methods present in ManageProfilePage
		mp.setValue();
		mp.setPrice();
		mp.setConvenience();
		mp.setExpertise();
		mp.setService();
		mp.getSelection();
		//Entering members on text area by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setMembersOf(flib.getCellData(MANAGE_EXCEL_PATH, "Sheet1", 1, 20));
		//selecting the method of payment by calling the method present in ManageProfilePage and passing arguments from filelibrary which contains generic reuasable methods to read data 
		//from excel sheet
		mp.setMethodOfPayment("cash");
		//click on save button
		mp.setSaveBtn2();
		String expectedTitle=driver.getTitle();
		wlib.verifyAssert(driver.getTitle(), expectedTitle,"Manage profile details page should be displayed");		
	}
	

}
