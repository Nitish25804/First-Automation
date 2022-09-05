package com.mystore.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mystire.pageobject.IndexPage;
import com.mystire.pageobject.MyAccount;
import com.mystire.pageobject.RegisterUser;
import com.mystore.utilities.ReadExcelFile;
@Listeners(com.mystore.utilities.ExtentListinerClass.class)
public class TC_VerifyTheAccountPageTestDataDrivin extends BaseClas{
	
	@Test(dataProvider="LoginDataProvider")
	public void VerifyTheAccountPage(String userEmail,String userpass,String expectedUserName) throws IOException {
		driver.get(url);
		IndexPage ip=new IndexPage(driver);
		ip.clickOnSignin();
		MyAccount ma=new MyAccount(driver);
		ma.EnterEmail(userEmail);
		ma.EnterPassword(userpass);
		ma.ClickSubmit();
		RegisterUser ru=new RegisterUser(driver);
		String UserName=ru.getUserName();
		if(UserName.equalsIgnoreCase(expectedUserName)) {
			Assert.assertTrue(true);
		}else {
			CaptureScreenshot(driver,"VerifyLogin");
			Assert.assertTrue(false);
		}
		ru.ClickSignOut();
	}
	@DataProvider(name="LoginDataProvider")
	public String[][] LoginDataProviderDemo() throws IOException{
		
		String fileName = System.getProperty("user.dir") + "\\TestData\\MyLoginStoreData.xlsx";


		int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginTestData");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginTestData");
		
	

		String data[][]=new String[ttlRows-1][ttlColumns];

		for(int i=1;i<ttlRows;i++){
			for(int j=0;j<ttlColumns;j++){

				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"LoginTestData", i,j);
			}

		}
		return data;

	}

}
