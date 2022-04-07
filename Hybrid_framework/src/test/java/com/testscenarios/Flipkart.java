package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class Flipkart extends CommonFunctions {
  @Test
  public void f() throws InterruptedException {
	  chromeBrowserLaunch();

		Actions act = new Actions(driver);

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement ele = driver.findElement(By.xpath("//*[text()='Electronics']"));
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.quit();
  }
}
