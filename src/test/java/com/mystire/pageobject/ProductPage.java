package com.mystire.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	WebDriver idriver;
	public ProductPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//i[@class='icon-plus']")
	WebElement Quantity;
	@FindBy(xpath="//select[@id='group_1']")
	WebElement Size;
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement AddToCart;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement ProceedToCheckout;
	public void IncreaseQuantity() {
		Quantity.click();
	}
	public void SelectSize(String SizeOfProduct) {
		Select s=new Select(Size);
		s.selectByValue(SizeOfProduct);
	}
	public void ClickAddToCart() {
		AddToCart.click();
	}
	public void ClickProceedToCheckout() {
		ProceedToCheckout.click();
	}

}
