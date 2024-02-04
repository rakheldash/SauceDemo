package com.saucedemo.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.actiondriver.Action;
import com.saucedemo.base.BaseClass;

public class ProductPage extends BaseClass {
	
	@FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")
	WebElement btnAddToCartSauceLabBackPack;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/svg")
	WebElement lnkCart;
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CartPage addProductToCart () {
		Action.click(driver, btnAddToCartSauceLabBackPack);
		Action.implicitWait(driver, 5);
		Action.click(driver, lnkCart);
		return new CartPage();
	}

}
