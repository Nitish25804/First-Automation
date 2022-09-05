package com.mystire.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	//obj for webdriver
		WebDriver ldriver;
		public IndexPage(WebDriver rdriver) {
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		@FindBy(xpath="//a[@class='login']")
		WebElement Signin;
		
		public void clickOnSignin() {
			Signin.click();;
		}

}
