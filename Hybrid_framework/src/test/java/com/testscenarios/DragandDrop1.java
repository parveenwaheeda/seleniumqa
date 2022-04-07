package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class DragandDrop1 extends CommonFunctions{
  @Test
  public void f() throws InterruptedException {
 chromeBrowserLaunch();
	  
	  Actions act= new Actions(driver);
	  
	  driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
	  WebElement ele =driver.findElement(By.id("draggable"));
	  WebElement ele1 =driver.findElement(By.id("droppable"));
	  act.dragAndDrop(ele, ele1).perform();
	  Thread.sleep(5000);
	  driver.quit();
	  
}
}