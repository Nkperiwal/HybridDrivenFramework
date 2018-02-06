package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	private static LoginPage oLoginPage;
	private static HomePage oHomePage;
	

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialize();
		oLoginPage = new LoginPage();

	}
	
	
	@Test(priority = 0)
	public void loginPageTitleTest()
	{
		String sTitle = oLoginPage.validateLoginpageTitle();
		String sActualTitle = "#1 Free CRM for Any Business: Online Customer Relationship Software";
		Assert.assertEquals(sTitle, sActualTitle);
	}
	
	@Test(priority = 1)
	public void crmLogoImageTest()
	{
		boolean flag = oLoginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void loginTest(){
		oHomePage = oLoginPage.login(oDriverProperties.getProperty("username"),oDriverProperties.getProperty("password"));
			
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		oDriver.closeAllBrowsers();
	}

}
