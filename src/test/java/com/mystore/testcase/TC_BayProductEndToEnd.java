package com.mystore.testcase;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mystire.pageobject.IndexPage;
import com.mystire.pageobject.MyAccount;
import com.mystire.pageobject.OrderAddressPage;
import com.mystire.pageobject.OrderConformPage;
import com.mystire.pageobject.OrderPaymentPage;
import com.mystire.pageobject.OrderShippingPage;
import com.mystire.pageobject.OrderSummaryPage;
import com.mystire.pageobject.ProductPage;
import com.mystire.pageobject.RegisterUser;
import com.mystire.pageobject.SearchResultPage;
@Listeners(com.mystore.utilities.ExtentListinerClass.class)
public class TC_BayProductEndToEnd extends BaseClas {
	@Test
	public void EndToEnd() throws IOException {
		driver.get(url);
		IndexPage ip=new IndexPage(driver);
		ip.clickOnSignin();
		MyAccount ma=new MyAccount(driver);
		ma.EnterEmail("nitishr137@gmail.com");
		ma.EnterPassword("asdf5678");
		ma.ClickSubmit();
		RegisterUser ru=new RegisterUser(driver);
		ru.EnterInSearch("T-shirts");
		ru.ClickSearchButton();
		SearchResultPage srp=new SearchResultPage(driver);
		srp.ClickMoreButton();
		ProductPage pp=new ProductPage(driver);
		pp.IncreaseQuantity();
		pp.SelectSize("2");
		pp.ClickAddToCart();
		pp.ClickProceedToCheckout();
		OrderSummaryPage osp=new OrderSummaryPage(driver);
		osp.ClickProceedToCheckOutSummary();
		OrderAddressPage oap=new OrderAddressPage(driver);
		oap.ClickProceedToCheckOutAddress();
		OrderShippingPage os=new OrderShippingPage(driver);
		os.ClickAgree();
		os.ClickProceedToCheckoutShip();
		OrderPaymentPage opp=new OrderPaymentPage(driver);
		opp.ClickPayByCheck();
		OrderConformPage ocp=new OrderConformPage(driver);
		ocp.ClickConformOrder();
		//ocp.ClickSignOuts();
		String msg=ocp.GetConformAlert();
		if(msg.equalsIgnoreCase("Your order on My Store is complete.")) {
			Assert.assertTrue(true);
		}else {
			CaptureScreenshot(driver,"BayProductEndToEnd");
			Assert.assertTrue(false);
		}
		
	}

}
