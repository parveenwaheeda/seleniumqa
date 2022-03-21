package com.testscenarios;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverMethodSample {
  @Test
  
	  	public static void main(String[] args) throws Exception {

	  		WebDriver driver;
	  		WebDriverManager.chromedriver().setup();
	  		driver = new ChromeDriver();
	  		driver.manage().window().maximize();
	  		driver.get("https://www.facebook.com/");

	  		// GetTitle(): Get the current screen Title of the page?
	  		String titleFB = driver.getTitle();
	  		System.out.println(titleFB);
	  		// GetCurrentURL(): Get the current page URL
	  		String urlFB = driver.getCurrentUrl();
	  		System.out.println(urlFB);

	  		// click on Forgotten password?
	  		driver.findElement(By.linkText("Forgot password?")).click();
	  		Thread.sleep(3000);

	  		// navigational Methods
	  		// Back()
	  		driver.navigate().back();
	  		Thread.sleep(3000);
	  		// send data to email editbox
	  		driver.findElement(By.name("email")).sendKeys("sdgdsgds");
	  		Thread.sleep(3000);
	  		// refresh()
	  		driver.navigate().refresh();
	  		Thread.sleep(3000);
	  		// forward()
	  		driver.navigate().forward();

	  		// navigate to another URL
	  		driver.navigate().to("https://demoqa.com/browser-windows");

	  		// Click on windowButton
	  		driver.findElement(By.id("windowButton")).click();
	  		Thread.sleep(3000);

	  		// Close(): Close the current window (parent window)
	  		//driver.close();
	  		// Quit(): Close the current window (parent window) & related Child window(s).
	  		driver.quit();
	  		
	  		// navigate to another URL
	  		driver.get("https://collegeweeklive.com/go-signup/");
	  		Thread.sleep(6000);
	  	
	  		driver.findElement(By.id("submit")).click();
	  		Thread.sleep(6000);
	  		//error message, get those and print into console
	  		String errorMSG =  driver.findElement(By.id("firstNameError")).getText();
	  		System.out.println(errorMSG);
	  		

	  	}
	  	}


