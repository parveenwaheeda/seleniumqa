package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class DoubleClick extends CommonFunctions {
	@Test
	public void f() throws InterruptedException {

		chromeBrowserLaunch();
		Actions act = new Actions(driver);
		driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
		WebElement ele = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(ele).perform();
		Thread.sleep(4000);
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
