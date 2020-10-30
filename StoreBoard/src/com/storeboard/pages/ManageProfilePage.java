package com.storeboard.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.storeboard.generic.FileLibrary;
import com.storeboard.generic.WebDriverCommonLibrary;

public class ManageProfilePage
{
	FileLibrary flib=new FileLibrary();
	WebDriverCommonLibrary wlib=new WebDriverCommonLibrary();
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='PrAddr1']")private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	public void setAddress(String add) {
		 address.sendKeys(add);
	}
	@FindBy(xpath="//input[@id='PrStateInt']")private WebElement stateOfProvinence;
	public WebElement getStateOfProvinence() {
		return stateOfProvinence;
	}
	public void setStateOfProvinence(String sop) {
		 stateOfProvinence.sendKeys(sop);;
	}
	@FindBy(xpath="//input[@name='tbPhoneInt']")private WebElement phone;
	public WebElement getPhone() {
		return phone;
	}
	public void setPhone(double ph) {
		
		 phone.sendKeys(ph+"");
	}
	@FindBy(xpath="//input[@name='tbPhoneInt2']")private WebElement alternatePhoneNo1;
	public WebElement getAlternatePhoneNo1() {
		return alternatePhoneNo1;
	}
	public void setAlternatePhoneNo1(double ph) {
		alternatePhoneNo1.sendKeys(ph+"");;
	}
	@FindBy(xpath="//input[@name='tbPhoneInt3']")private WebElement alternatePhoneNo2;
	public WebElement getAlternatePhoneNo2() {
		return alternatePhoneNo2;
	}
	public void setAlternatePhoneNo2(double ph){
		 alternatePhoneNo2.sendKeys(ph+"");
	}
	@FindBy(xpath="//input[@id='PrEmail']")private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);;
	}
	@FindBy(xpath="//input[@id='WebURL']")private WebElement website;
	
	public WebElement getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website.sendKeys(website);
	}
	@FindBy(xpath="(//a[@class='light-green-btn light-green-btn-inline' and .='Save Changes'])[2]") private  WebElement saveBtn;
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void setSaveBtn() {
		saveBtn.click();
	}
	@FindBy(xpath="//input[@id='TwitterUserName']")private WebElement twitterUserName;
	public WebElement getTwitterUserName() {
		return twitterUserName;
	}
	public void setTwitterUserName(String wb) {
		 twitterUserName.sendKeys(wb);;
	}
	@FindBy(xpath="//input[@id='FacebookPage']")private WebElement facebookPageUrl;
	public WebElement getFacebookPageUrl() {
		return facebookPageUrl;
	}
	public void setFacebookPageUrl(String facebookPageUrl) {
		this.facebookPageUrl.sendKeys(facebookPageUrl);
	}
	@FindBy(xpath="//select[@name='ddSalutationOwner']") private WebElement ownerNameDD;
	public WebElement getOwnerNameDD() {
		return ownerNameDD;
	}
	public void setOwnerNameDD() {
		getOwnerNameDD().click();
		wlib.selectOption("2", ownerNameDD);
	}
	@FindBy(xpath="//select[@name='ddOwnerPhoneType']") private WebElement ownerphoneDD;
	public WebElement getOwnerphoneDD() {
		return ownerphoneDD;
	}
	public void setOwnerphoneDD() {
		ownerphoneDD.click();
		wlib.selectOption("B", ownerphoneDD);
		
		
	}
	@FindBy(xpath="//select[@name='ddSalutationStoreMgr']") private WebElement managerNameDD;
	public WebElement getManagerNameDD() {
		return managerNameDD;
	}
	public void setManagerNameDD() {
		managerNameDD.click();
		wlib.selectOption("2", managerNameDD);
		
	}
	@FindBy(xpath="//select[@name='ddStoreMgrPhoneType']") private WebElement managerPhoneDD;
	
	public WebElement getManagerPhoneDD() {
		return managerPhoneDD;
	}
	public void setManagerPhoneDD() {
		managerPhoneDD.click();
		wlib.selectOption("B", managerPhoneDD);
	}
	@FindBy(xpath="//input[@name='OwnerName']")private WebElement ownerName;
	public WebElement getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		getOwnerName().sendKeys(ownerName);
	}
	@FindBy(xpath="//input[@name='tbOwnerPhoneInt']")private WebElement ownerPhone;
	public WebElement getOwnerPhone() {
		return ownerPhone;
	}
	public void setOwnerPhone(double ownerPhone) {
		this.ownerPhone.sendKeys(ownerPhone+"");
	}
	@FindBy(xpath="//input[@name='OwnerEmail']")private WebElement ownerEmail;
	public WebElement getOwnerEmail() {
		return ownerEmail;
	}
	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail.sendKeys(ownerEmail);
	}
	@FindBy(xpath="//input[@name='StoreMgr']")private WebElement manageName;
	public WebElement getManageName() {
		return manageName;
	}
	public void setManageName(String manageName) {
		this.manageName.sendKeys(manageName); 
	}
	@FindBy(xpath="//input[@name='tbStoreMgrPhoneInt']")private WebElement managePhone;
	public WebElement getManagePhone() {
		return managePhone;
	}
	public void setManagePhone(double managePhone) {
		this.managePhone.sendKeys(managePhone+"");
	}
	@FindBy(xpath="//input[@name='StoreMgrEmail']")private WebElement manageEmail;
	public WebElement getManageEmail() {
		return manageEmail;
	}
	public void setManageEmail(String manageEmail) {
		this.manageEmail .sendKeys(manageEmail);
	}
	@FindBy(xpath="//input[@id='SpecializesInDesc']") private WebElement specializedIn;
	
	public WebElement getSpecializedIn() {
		return specializedIn;
	}
	public void setSpecializedIn(String specializedIn) {
		this.specializedIn.sendKeys(specializedIn);
	}
	@FindBy(xpath="/input[@id='HowWeGotStartedDesc']")private WebElement howWeGotStarted;
	public WebElement getHowWeGotStarted() {
		return howWeGotStarted;
	}
	public void setHowWeGotStarted(String howWeGotStarted) {
		this.howWeGotStarted.sendKeys(howWeGotStarted);
	}
	@FindBy(xpath="//select[@name='YearsInBusiness']")private WebElement yearsInBusinessDD;
	public WebElement getYearsInBusinessDD() {
		return yearsInBusinessDD;
	}
	public void setYearsInBusinessDD() {
		yearsInBusinessDD.click();
		wlib.selectOption("3", yearsInBusinessDD);
	
	}
	@FindBy(xpath="FavPartOfBusDesc")private WebElement favoritePartOfTheBussiness;
	public WebElement getFavoritePartOfTheBussiness() {
		return favoritePartOfTheBussiness;
	}
	public void setFavoritePartOfTheBussiness(String favoritePartOfTheBussiness) {
		this.favoritePartOfTheBussiness.sendKeys(favoritePartOfTheBussiness); 
	}
	@FindBy(xpath="//textarea[@id='CustCanExpectDesc']")private WebElement customerCanExpect;
	public WebElement getCustomerCanExpect() {
		return customerCanExpect;
	}
	public void setCustomerCanExpect(String customerCanExpect) {
		getCustomerCanExpect().sendKeys(customerCanExpect);
	}
	@FindBy(id="ShowNoHours") private WebElement hourCheckBox;
	
	public WebElement getHourCheckBox() {
		return hourCheckBox;
	}
	public void setHourCheckBox() {
		 hourCheckBox.click();
	}
	@FindBy(xpath="")private WebElement price;
	public WebElement price() {
		return price;
	}
	public void setPrice() {
		price.click();
		wlib.selectOption("7",price);
	}
	@FindBy(xpath="")private WebElement selection;
	public WebElement getSelection() {
		return selection;
	}
	public void setSelection() {
		selection.click();
		wlib.selectOption("9", selection);
		this.selection = selection;
	}
	@FindBy(xpath="")private WebElement value;
	public WebElement getValue() {
		return value;
	}
	public void setValue() {
		value.click();
		wlib.selectOption("9", value);
	}
	@FindBy(xpath="")private WebElement service;
	public WebElement getService() {
		return service;
	}
	public void setService() {
		service.click();
		wlib.selectOption("10",service);
		this.service = service;
	}
	@FindBy(xpath="")private WebElement expertise;
	public WebElement getExpertise() {
		return expertise;
	}
	public void setExpertise() {
		expertise.click();
		wlib.selectOption("8",expertise);;
	}
	@FindBy(xpath="")private WebElement convenience;
	
	public WebElement getConvenience() {
		return convenience;
	}
	public void setConvenience() {
		convenience.click();
		wlib.selectOption("9", convenience);
	}
	@FindBy(xpath="//textarea[@id='MemberOfDesc']")private WebElement membersOf;
	public WebElement getMembersOf() {
		return membersOf;
	}
	public void setMembersOf(String membersOf) {
		this.membersOf.sendKeys(membersOf);
	}
	@FindBy(xpath="")private WebElement methodOfPayment;
	public WebElement getMethodOfPayment() {
		return methodOfPayment;
	}
	public void setMethodOfPayment(String mop) 
	{
		if(mop.equalsIgnoreCase("visa"))
		{
			driver.findElement(By.xpath("//input[@id='MethodsOfPayment_0']")).click();
			
		}
		else if(mop.equalsIgnoreCase("discover"))
				{
			driver.findElement(By.xpath("//input[@id='MethodsOfPayment_3']']")).click();
			
				}
		else if(mop.equalsIgnoreCase("cash"))
				{
			driver.findElement(By.xpath("//input[@id='MethodsOfPayment_9']")).click();
			
				}
		else if(mop.equalsIgnoreCase("master card"))
				{
			driver.findElement(By.xpath("//input[@id='MethodsOfPayment_2']]")).click();
			
				}
		else if(mop.equalsIgnoreCase("debit card"))
				{
			driver.findElement(By.xpath("//input[@id='MethodsOfPayment_11']")).click();
			
				}
	}
	@FindBy(xpath="//a[@class='light-green-btn light-green-btn-inline' and .='Save Changes'])[2]") private WebElement saveBtn2;
	public WebElement getSaveBtn2() {
		return saveBtn2;
	}
	public void setSaveBtn2() {
		 saveBtn2.click();
	}
	
	
	}
