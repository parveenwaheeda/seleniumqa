package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class GoogleCaps extends CommonFunctions{
  @Test
  public void f() throws InterruptedException {
chromeBrowserLaunch();
	  
	  Actions act= new Actions(driver);
	  
	  driver.get("https://www.google.com");
	  WebElement ele=driver.findElement(By.name("q"));
	  act.keyDown(ele,Keys.SHIFT).sendKeys("hi google").perform();
	 
	 String s= ele.getAttribute("q");
	 System.out.println(s);
	 act.contextClick(ele).perform();
	  Thread.sleep(4000);
	  driver.quit();
	  
  }
}
