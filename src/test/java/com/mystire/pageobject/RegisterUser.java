package com.mystire.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser {
	WebDriver idriver;
	public RegisterUser(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//a[@title='View my customer account']")
	WebElement UserName;
	@FindBy(linkText="Sign out")
	WebElement SignOut;
	@FindBy(name ="search_query")
	WebElement SearchBox;
	@FindBy(name ="submit_search")
	WebElement SubmitSearch;
	public String getUserName() {
		String text=UserName.getText();
		return text;
	}
	public void ClickSignOut() {
		SignOut.click();
	}
	public void EnterInSearch(String Search) {
		SearchBox.sendKeys(Search);
	}
	public void ClickSearchButton() {
		SubmitSearch.click();
	}

}
