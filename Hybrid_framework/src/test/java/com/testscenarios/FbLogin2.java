package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
  		WebDriverManager.chromedriver().setup();
  		driver = new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("https://www.facebook.com/");
  		WebElement d=driver.findElement(By.id("email"));
  		String s=d.getAttribute("placeholder");
  		System.out.println(s);
  		driver.quit();
  		
	}



}
