package com.saucedemo.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.actiondriver.Action;
import com.saucedemo.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(id = "user-name")
	WebElement txtUsername;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath = "//*[@id=\"login-button\"]")
	WebElement btnLogin;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/img")
	WebElement logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogo() {
		Action.waitForFiveSecs(driver);
		return Action.isDisplayed(driver, logo);
	}
	
	public ProductPage login (String username, String password) {
		Action.waitForFiveSecs(driver);
		Action.type(txtUsername, username);
		Action.type(txtPassword, password);
		Action.click(driver, btnLogin);
		return new ProductPage();
	}
	
	public boolean validatePageTitle() {
		Action.waitForFiveSecs(driver);
		return Action.validatePageTitle(driver, "Swag Labs");
	}
}
