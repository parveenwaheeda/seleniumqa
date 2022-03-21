package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Stqa {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/index.php");
		driver.findElement(By.name("studentname")).sendKeys("wah");
		driver.findElement(By.name("fathername")).sendKeys("saleem");
		driver.findElement(By.name("paddress")).sendKeys("cjdhckjdsh");
		driver.findElement(By.name("personaladdress")).sendKeys("sdjnfkjfhbkasdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		
		driver.findElement(By.name("City")).click();
		Thread.sleep(3000);
		Select s=new Select(driver.findElement(By.name("City")));
		s.selectByVisibleText("PATNA");
	
		driver.findElement(By.name("Course")).click();
		Thread.sleep(3000);
		Select s1=new Select(driver.findElement(By.name("Course")));
		s1.selectByVisibleText("MCA");
		
		driver.findElement(By.name("District")).click();
		Thread.sleep(3000);
		Select s2=new Select(driver.findElement(By.name("District")));
		s2.selectByVisibleText("PATNA");
		
		driver.findElement(By.name("State")).click();
		Thread.sleep(3000);
		Select s3=new Select(driver.findElement(By.name("State")));
		s3.selectByVisibleText("BIHAR");
		
		driver.findElement(By.name("pincode")).sendKeys("453533");
		driver.findElement(By.name("emailid")).sendKeys("wah.moh@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(6000);
		driver.quit();
		
		
}
  }

