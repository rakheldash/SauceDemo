package com.saucedemo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.saucedemo.base.BaseClass;
import com.saucedemo.pageobjects.LoginPage;

public class LoginPageTest extends BaseClass {
	
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@Test
	public void verifyPageTitle() {
		LoginPage loginPage = new LoginPage();
		boolean result = loginPage.validatePageTitle();
		Assert.assertTrue(result);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}	

}
