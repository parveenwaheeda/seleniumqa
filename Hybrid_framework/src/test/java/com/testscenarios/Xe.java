package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xe {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.xe.com/");
		Thread.sleep(4000);
		WebElement d=driver.findElement(By.id("amount"));
  		String s=d.getAttribute("value");
  		System.out.println(s);
		
		
	  
  }
  
}
