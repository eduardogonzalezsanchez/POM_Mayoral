package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();	
		loginPage= new LoginPage();
	}
	
	@Test(priority=1)
	public void loginTest(){
		homePage.quitarBasura();
		homePage.clickOnLogin();
		loginPage.login(OR.getProperty("username"),OR.getProperty("password"));
		
		//Assert.assertEquals(title, "Ladorian IDS |");
	}
	
/*	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}*/
	
	
	@DataProvider
	public Object[][] getIdsTestData(){
		Object data[][] = TestUtil.getTestData("contacts");
		return data;
	}
	
	
/*	@Test(priority=3, dataProvider="getIdsTestData")
	public void validateCreateNewContact(String title, String firstName){
		//homePage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		loginPage.createNewContact(title, firstName);
		Assert.assertEquals(driver.getCurrentUrl(), "https://ladorianids.com/dashboard", "It is not the URL expected: ");
		
	}*/
	
	
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
	
	
	

}
