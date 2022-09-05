package com.mystire.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	WebDriver idriver;
	public MyAccount(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//input[@id='email_create']")
	WebElement CreateEmailId;
	@FindBy(id="SubmitCreate")
	WebElement SubmitCreate;
	@FindBy(xpath="//input[@id='email']")
	WebElement RegisterEmailId;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement RegisterPassword;
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement SubmitButton;
	
	
	
	public void EnterCreateEmailAddress(String EmailAdd) {
		CreateEmailId.sendKeys(EmailAdd);
	}

	public WebElement ClickSubmitCreate() {
		return SubmitCreate;
	}
	public void EnterEmail(String Email) {
		RegisterEmailId.sendKeys(Email);
	}
	public void EnterPassword(String Password) {
		RegisterPassword.sendKeys(Password);
	}
	public void ClickSubmit() {
		SubmitButton.click();
	}
	
	
}	
