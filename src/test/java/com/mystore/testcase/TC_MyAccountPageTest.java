package com.mystore.testcase;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mystire.pageobject.AccountCreationDetails;
import com.mystire.pageobject.IndexPage;
import com.mystire.pageobject.MyAccount;
import com.mystire.pageobject.RegisterUser;

import org.testng.Assert;
@Listeners(com.mystore.utilities.ExtentListinerClass.class)
public class TC_MyAccountPageTest extends BaseClas{
	@Test
	public void VerifyRegistationAndLogin() {
		driver.get(url);
		Logger.info("url opened");
		IndexPage ip=new IndexPage(driver);
		ip.clickOnSignin();
		MyAccount ma=new MyAccount(driver);
		ma.EnterCreateEmailAddress("nitishr137@gmail.com");
		ma.ClickSubmitCreate().click();
		AccountCreationDetails acd=new AccountCreationDetails(driver);
		acd.SelectTitel();
		acd.EnterFirstName("Nitish");
		acd.EnterLastName("Rout");
		acd.EnterPassword("asdf5678");
		acd.EnterAfirstName("Nitish");
		acd.EnterAlastName("Rout");
		acd.EnterAddress1("Sasane Nagar");
		acd.EnterCity("Pune");
		acd.SelectState("Arizona");
		acd.EnterPost("12345");
		acd.SelectCountry("United States");
		acd.EnterMobile("1234567895");
		acd.EnterAddress2("Hadapsar");
		acd.EnterRegister();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		RegisterUser ru=new RegisterUser(driver);
		String UserName=ru.getUserName();
		Assert.assertEquals("Nitish Rout",UserName);
		
	}
}
