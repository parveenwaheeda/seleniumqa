package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ttd {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		Thread.sleep(5000);
		
		WebElement d=driver.findElement(By.partialLinkText("Sign"));
		d.click();
		Thread.sleep(5000);
		driver.findElement(By.name("fName")).sendKeys("wah");
		driver.findElement(By.name("lName")).sendKeys("moh");
		driver.findElement(By.name("mobNo")).sendKeys("9999999999");
		
		driver.findElement(By.name("countryS")).click();
        Select s=new Select(driver.findElement(By.name("countryS")));
        Thread.sleep(4000);
        s.selectByVisibleText("India");
       
        driver.findElement(By.name("stateS")).click();
        Select s1=new Select(driver.findElement(By.name("stateS")));
        Thread.sleep(4000);
        s1.selectByVisibleText("Arunachal Pradesh");
        driver.findElement(By.id("regi_continue")).click();
        driver.quit();
         
		
  }
}
