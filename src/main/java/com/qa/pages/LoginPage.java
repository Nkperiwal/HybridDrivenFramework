package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - OR:
	
	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy (xpath = "//input[@type = 'submit']")
	WebElement loginBtn;

	@FindBy (xpath = "//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy (xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	public LoginPage()
	{
		PageFactory.initElements(oDriver.getDriver(), this);
		
	}
	
	public String validateLoginpageTitle()
	{
		return oDriver.getTitle();
	}
	
	public boolean validateCRMImage()
	{
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd)
	{
		oDriver.setText(userName,un );
		oDriver.setText(password, pwd);
		oDriver.clickElement(loginBtn);
		
		return new HomePage();
	}
	
}
