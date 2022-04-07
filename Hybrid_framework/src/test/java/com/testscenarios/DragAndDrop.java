package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class DragAndDrop extends CommonFunctions
{
  @Test
  public void f() throws InterruptedException {
	  chromeBrowserLaunch();
	  
	  Actions act= new Actions(driver);
	  
	  driver.get("https://demoqa.com/droppable");
	  WebElement ele =driver.findElement(By.id("draggable"));
	  WebElement ele1 =driver.findElement(By.id("droppable"));
	  
	  act.dragAndDrop(ele, ele1).perform();
	  Thread.sleep(5000);
	  
	  WebElement ele3 =driver.findElement(By.xpath("//*[text()='Dropped!']"));
	  String s=ele3.getText();
	  System.out.println(s);
	  driver.quit();
	  
  
  }
}
