package com.mystore.testcase;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mystire.pageobject.IndexPage;
import com.mystire.pageobject.MyAccount;
import com.mystire.pageobject.RegisterUser;
import com.mystire.pageobject.SearchResultPage;

import org.testng.Assert;
@Listeners(com.mystore.utilities.ExtentListinerClass.class)
public class TC_ProductPageTest extends BaseClas {
	@Test
	public void VerifySearchProduct() throws IOException {
		driver.get(url);
		String SearchKey="T-shirts";
		IndexPage ip=new IndexPage(driver);
		ip.clickOnSignin();
		MyAccount ma=new MyAccount(driver);
		ma.EnterEmail("nitishr137@gmail.com");
		ma.EnterPassword("asdf5678");
		ma.ClickSubmit();
		RegisterUser ru =new RegisterUser(driver);
		ru.EnterInSearch(SearchKey);
		ru.ClickSearchButton();
		SearchResultPage srp=new SearchResultPage(driver);
		String ProductName=srp.GetSearchResultProductName();
		if(ProductName.contains(SearchKey)) {
			Assert.assertTrue(true);
			ru.ClickSignOut();
		}else {
			CaptureScreenshot(driver,"VerifySearchProduct");
			Assert.assertTrue(false);
			driver.quit();
		}
	}

}
