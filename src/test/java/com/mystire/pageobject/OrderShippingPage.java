package com.mystire.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderShippingPage {
	WebDriver idriver;
	public OrderShippingPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//div[@id='uniform-cgv']")
	WebElement Agree;
	@FindBy(xpath="//button[@name='processCarrier']")
	WebElement ProceedToCheckoutShip;
	
	public void ClickAgree() {
		Agree.click();
	}
	public void ClickProceedToCheckoutShip() {
		ProceedToCheckoutShip.click();
	}

}
