package com.mystire.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
	WebDriver idriver;
	public OrderSummaryPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(linkText="Proceed to checkout")
	WebElement ProceedToCheckOutSumm;
	
	public void ClickProceedToCheckOutSummary() {
		ProceedToCheckOutSumm.click();
	}

}
