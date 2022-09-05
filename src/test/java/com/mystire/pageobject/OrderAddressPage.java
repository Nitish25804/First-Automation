package com.mystire.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderAddressPage {
	WebDriver idriver;
	public OrderAddressPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(name="processAddress")
	WebElement ProceedToCheckOutAddr;
	
	public void ClickProceedToCheckOutAddress() {
		ProceedToCheckOutAddr.click();
	}

}
