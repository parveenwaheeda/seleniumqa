package com.testscenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Collegeprivacypolicy {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(1000);
		driver.findElement(By.id("questions[q_137]")).click();
		driver.findElement(By.xpath("//a [@href='https://www.platformqedu.com/privacy-policy/']")).click();
  }
}
