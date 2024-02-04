package com.saucedemo.actiondriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.saucedemo.base.BaseClass;

public class Action extends BaseClass {
	
	public static void click (WebDriver ldriver, WebElement locator) {
		Actions act = new Actions (ldriver);
		act.moveToElement(locator).click().build().perform();
	}
	
	public static void implicitWait (WebDriver ldriver, int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	public static void waitForFiveSecs (WebDriver ldriver) {
		try {
			Thread.sleep(5000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static boolean type (WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag = true;
		} catch (Exception e) {
			System.out.println ("Location not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println ("Successfully entered the value");
			} else {
				System.out.println ("Unable to enter value");
			}
		}
		return flag;
	}
	
	public static boolean isDisplayed (WebDriver ldriver, WebElement ele) {
		boolean isButtonDisplayed = isDisplayed(driver, ele);
		System.out.println(isButtonDisplayed);
		return isButtonDisplayed;
	}
	
	public static boolean validatePageTitle (WebDriver ldriver, String expectedTitle) {
		boolean flag = false;
		String actualTitle = ldriver.getTitle().toString();
		if (actualTitle.equals(expectedTitle)) {
			flag = true;
		}
		return flag;
	}

}
