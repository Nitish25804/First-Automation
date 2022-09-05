package com.mystire.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConformPage {
	WebDriver idriver;
	public OrderConformPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//span[text()='I confirm my order']")
	WebElement ConformOrder;
	@FindBy(xpath="//p[@class='alert alert-success']")
	WebElement ConformAlert;
	@FindBy(xpath="//a[@title='Log me out']")
	WebElement SignOuts;
	
	public void ClickConformOrder() {
		ConformOrder.click();
	}
	public String GetConformAlert() {
		return (ConformAlert.getText());
	}
	public void ClickSignOuts() {
		SignOuts.click();
	}

}
