package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Safari {
	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver;
	WebDriverManager.safaridriver().setup();
	driver = new SafariDriver();
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("pass")).sendKeys("ppppp");
	driver.findElement(By.name("login")).click();
	
}
}