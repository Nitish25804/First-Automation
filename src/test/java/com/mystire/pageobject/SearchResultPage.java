package com.mystire.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	WebDriver idriver;
	public SearchResultPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
	WebElement SearchResultProduct;
	@FindBy(linkText="More")
	WebElement More;
	
	public String GetSearchResultProductName() {
		return(SearchResultProduct.getText());
	}
	public void ClickMoreButton() {
		More.click();
	}

}
