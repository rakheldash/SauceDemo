package com.saucedemo.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.saucedemo.base.BaseClass;
import com.saucedemo.pageobjects.LoginPage;
import com.saucedemo.pageobjects.ProductPage;

public class ProductPageTest extends BaseClass {
	
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@Test
	public void addProductToCart() {
		LoginPage loginPage = new LoginPage();
		ProductPage productPage = new ProductPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		productPage.addProductToCart();
	}
	
	
}
