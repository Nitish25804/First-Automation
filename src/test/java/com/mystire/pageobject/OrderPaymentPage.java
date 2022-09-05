package com.mystire.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPaymentPage {
	WebDriver idriver;
	public OrderPaymentPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//a[@class='cheque']")
	WebElement PayByCheck;
	@FindBy(xpath="//a[@class='bankwire']")
	WebElement PayByBankWire;
	
	public void ClickPayByCheck() {
		PayByCheck.click();
	}
	public void ClickPayByBankWire() {
		PayByBankWire.click();
	}

}
