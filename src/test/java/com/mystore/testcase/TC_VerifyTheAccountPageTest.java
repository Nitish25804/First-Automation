package com.mystore.testcase;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mystire.pageobject.IndexPage;
import com.mystire.pageobject.MyAccount;
import com.mystire.pageobject.RegisterUser;

import org.testng.Assert;

@Listeners(com.mystore.utilities.ExtentListinerClass.class)
public class TC_VerifyTheAccountPageTest extends BaseClas{
	
	@Test
	public void VerifyTheAccountPage() throws IOException {
		driver.get(url);
		IndexPage ip=new IndexPage(driver);
		ip.clickOnSignin();
		MyAccount ma=new MyAccount(driver);
		ma.EnterEmail("nitisi37@gmail.com");
		ma.EnterPassword("12345678");
		ma.ClickSubmit();
		RegisterUser ru=new RegisterUser(driver);
		String UserName=ru.getUserName();
		if(UserName.equalsIgnoreCase("Nitish Rout")) {
			Assert.assertTrue(true);
		}else {
			CaptureScreenshot(driver,"VerifyLogin");
			Assert.assertTrue(false);
		}
	}

}
