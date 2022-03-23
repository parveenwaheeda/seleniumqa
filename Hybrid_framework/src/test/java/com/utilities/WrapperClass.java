package com.utilities;

import org.openqa.selenium.By;

public class WrapperClass extends BaseClass {

	public static void sendKeysByAnyLocator(By locator, String inputdata) {

		if (driver.findElement(locator).isDisplayed()) {
			if (driver.findElement(locator).isEnabled()) {
				driver.findElement(locator).clear();
				driver.findElement(locator).sendKeys(inputdata);
			} else {
				System.out.println("element is not displayed on screen");
			}
		} else {
			System.out.println("element is not disabled on screen");
		}

	}
}