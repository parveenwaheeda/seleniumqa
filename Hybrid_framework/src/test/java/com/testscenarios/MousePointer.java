package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class MousePointer extends CommonFunctions {
	@Test
	public void f() throws InterruptedException {
		chromeBrowserLaunch();

		Actions act = new Actions(driver);

		driver.get("https://demoqa.com/tool-tips");
		
		WebElement ele=driver.findElement(By.id("toolTipButton"));
		act.moveToElement(ele).perform();
		
		  Thread.sleep(5000);
		  driver.quit();

		
	}

}
