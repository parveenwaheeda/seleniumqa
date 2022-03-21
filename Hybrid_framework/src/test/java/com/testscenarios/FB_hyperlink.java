package com.testscenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_hyperlink {
  @Test
	  	public static void main(String[] args) {
	  		//object of webdriver
	  		WebDriver driver;
	  	
	  		//chrome browser launch
	  		WebDriverManager.chromedriver().setup();
	  		driver = new ChromeDriver();
	  		
	  		//maximize of browser
	  		driver.manage().window().maximize();
	  		
	  		driver.get("https://www.facebook.com/");
	  		
	  		//send date to email editbox
	  		driver.findElement(By.name("email")).sendKeys("sdgdsgds");
	  		
	  		//click on Forgotten password?
	  		//driver.findElement(By.linkText("Forgotten password?")).click();		
	  		driver.findElement(By.partialLinkText("password")).click();
	  	
	  	}

	  }
