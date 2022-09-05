package com.mystire.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationDetails {
	WebDriver idriver;
	public AccountCreationDetails(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(id="id_gender1")
	WebElement TitelMr;
	
	@FindBy(xpath="//*[@id='customer_firstname']")
	WebElement FirstName;
	
	
	@FindBy(xpath="//*[@id='customer_lastname']")
	WebElement LastName;
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement Password;
	
	@FindBy(id="firstname")
	WebElement AfirstName;
	
	@FindBy(id="lastname")
	WebElement AlastName;
	
	@FindBy(xpath="//*[@id='address1']")
	WebElement Address1;
	
	@FindBy(xpath="//*[@id='city']")
	WebElement City;
	
	@FindBy(id="id_state")
	WebElement State;
	
	@FindBy(xpath="//*[@id='postcode']")
	WebElement Post;
	
	@FindBy(xpath="//*[@id='id_country']")
	WebElement Country;
	
	@FindBy(xpath="//*[@id='phone_mobile']")
	WebElement Phone1;
	
	@FindBy(id="alias")
	WebElement Address2;
	
	@FindBy(xpath="//*[text()='Register']")
	WebElement Register;
	
	
	public void SelectTitel() {
		TitelMr.click();
	}
	public void EnterFirstName(String fname) {
		FirstName.sendKeys(fname);
	}
	public void EnterLastName(String lname) {
		LastName.sendKeys(lname);
	}
	public void EnterPassword(String pass) {
		Password.sendKeys(pass);
	}
	public void EnterAfirstName(String Afirst) {
		AfirstName.clear();
		AfirstName.sendKeys(Afirst);
	}
	public void EnterAlastName(String Alast) {
		AlastName.clear();
		AlastName.sendKeys(Alast);
	}
	
	public void EnterAddress1(String addrf) {
		Address1.sendKeys(addrf);
	}
	public void EnterCity(String city) {
		City.sendKeys(city);
	}
	public void SelectState(String text) {
		Select se=new Select(State);
		se.selectByVisibleText(text);
	}
	public void EnterPost(String post) {
		Post.sendKeys(post);
	}
	public void SelectCountry(String text) {
		Select sc=new Select(Country);
		sc.selectByVisibleText(text);
	}
	public void EnterMobile(String mobile) {
		Phone1.sendKeys(mobile);
	}
	public void EnterAddress2(String addrs) {
		Address2.clear();
		Address2.sendKeys(addrs);
	}
	public void EnterRegister() {
		Register.click();
	}
	
	
}
