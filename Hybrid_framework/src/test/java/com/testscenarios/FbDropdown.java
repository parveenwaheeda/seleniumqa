package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbDropdown {
  @Test
public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\']")).click();
		Thread.sleep(50000);
		driver.findElement(By.name("firstname")).sendKeys("wahee");
		driver.findElement(By.name("lastname")).sendKeys("moh");
		driver.findElement(By.name("reg_email__")).sendKeys("moh.wah@gmail.com");
		driver.findElement(By.name("reg_email__")).sendKeys("moh.wah@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("dsjfkdjhfk");
		
		Select s=new Select(driver.findElement(By.name("birthday_month")));
		Thread.sleep(4000);
		s.selectByVisibleText("Mar");
		
		Select s1=new Select(driver.findElement(By.name("birthday_day")));
		Thread.sleep(4000);
		s1.selectByVisibleText("18");
		
		Select s2=new Select(driver.findElement(By.name("birthday_year")));
		Thread.sleep(4000);
		s2.selectByVisibleText("1984");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
  }
}
