package com.storeboard.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.storeboard.generic.WebDriverCommonLibrary;

public class RegistrationPage
{
	WebDriverCommonLibrary wlib=new WebDriverCommonLibrary();
	@FindBy(id="tbBizName") private WebElement bussinessNameTb;
	public WebElement getBussinessNameTb() {
		return bussinessNameTb;
	}
	public void setBussinessNameTb(String bn) {
		 bussinessNameTb.sendKeys(bn);;
	}
	@FindBy(id="Addr2") private WebElement addressTb;
	public WebElement getAddressTb() {
		return addressTb;
	}
	public void setAddressTb(String add) {
		addressTb.sendKeys(add);;
	}
	@FindBy(id="CountryID") private WebElement countrydd;
	public WebElement getCountrydd() {
		return countrydd;
	}
	public void setCountrydd() {
		countrydd.click();
		wlib.selectOption(countrydd, "India");
	}
	@FindBy(name="IntState") private WebElement state;
	public WebElement getState() {
		return state;
	}
	public void setState(String state) {
		getState().sendKeys(state);
	}
	@FindBy(id="IntState") private WebElement city;
	public WebElement getCity() {
		return city;
	}
	public void setCitydd(String city) {
		getCity().sendKeys(city);
	}
	@FindBy(id="ZIPSELECT") private WebElement zipCodedd;
	public WebElement getZipCodedd() {
		return zipCodedd;
	}
	public void setZipCodedd(WebElement zipCodedd) {
		this.zipCodedd = zipCodedd;
	}
	
	@FindBy(id="ckNoPhone") private WebElement bussinessPhoneNumber;
	public WebElement getBussinessPhoneNumber() {
		return bussinessPhoneNumber;
	}
	public void setBussinessPhoneNumber() {
		bussinessPhoneNumber.click();;
	}
	@FindBy(id="ddURLEnd") private WebElement websiteAddress;
	public WebElement getWebsiteAddress() {
		return websiteAddress;
	}
	public void setWebsiteAddress(String wb) {
		this.websiteAddress.sendKeys(wb); 
	}
	@FindBy(id="ddYearInBusiness") private WebElement yearInBussinessdd;
	public WebElement getYearInBussinessdd() {
		return yearInBussinessdd;
	}
	public void setYearInBussinessdd() {
		yearInBussinessdd.click();
		wlib.selectOption("3",yearInBussinessdd);
	}
	@FindBy(id="MemberRegionID") private WebElement storeBoardCitydd;
	public WebElement getStoreBoardCitydd() {
		return storeBoardCitydd;
	}
	public void setStoreBoardCitydd() {
		storeBoardCitydd.click();
		wlib.selectOption(storeBoardCitydd, "chennai");
		
	}
	@FindBy(id="ddNYKACatID") private WebElement selectDirectoryCategory;
	public WebElement getSelectDirectoryCategory() {
		return selectDirectoryCategory;
	}
	public void setSelectDirectoryCategor() {
		selectDirectoryCategory.click();
		wlib.selectOption(selectDirectoryCategory, "Answering Services");
	
	}
	@FindBy(id="ParentID") private WebElement bussinessCategorydd;
	public WebElement getBussinessCategorydd() {
		return bussinessCategorydd;
	}
	public void setBussinessCategorydd() {
		 bussinessCategorydd.click();
		 wlib.selectOption( bussinessCategorydd, "Abrasives");
		this.bussinessCategorydd = bussinessCategorydd;
	}
	@FindBy(id="tbShortDesc") private WebElement briefDescriptionAbtBusiness;
	public WebElement getBriefDescriptionAbtBusiness() {
		return briefDescriptionAbtBusiness;
	}
	public void setBriefDescriptionAbtBusiness(String bf) {
		this.briefDescriptionAbtBusiness.sendKeys(bf);
	}
	@FindBy(xpath="//a[.='SUBMIT']") private WebElement submitBtn;
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public void setSubmitBtn() {
		 submitBtn.click();;
	}
	
	
	
}
