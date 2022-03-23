package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollegeWeekly {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
  		WebDriverManager.chromedriver().setup();
  		driver = new ChromeDriver();
  		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(1000);
        driver.findElement(By.name("firstName")).sendKeys("wah");
        driver.findElement(By.name("lastName")).sendKeys("par");
        driver.findElement(By.name("emailAddress")).sendKeys("par.wah@gmail.com");
        driver.findElement(By.name("phoneNumber")).sendKeys("9999999999");
        driver.findElement(By.name("password")).sendKeys("ppppppp");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("ppppppp");
        Select nationality= new Select(driver.findElement(By.name("nationality")));
        nationality.selectByVisibleText("UNITED STATES"); 
        
        Select role = new Select(driver.findElement(By.name("attendeeType")));
        role.selectByVisibleText("Student Looking for Graduate Degree"); 
        
        Select term1 = new Select(driver.findElement(By.name("questions[q_134]")));
        term1.selectByVisibleText("Fall 2022"); 
        
        Select month = new Select(driver.findElement(By.id("questions_16_Month")));
        month.selectByVisibleText("February"); 
        
        Select day = new Select(driver.findElement(By.id("questions_16_DayOfMonth")));
       day.selectByVisibleText("3"); 
       Select year = new Select(driver.findElement(By.id("questions_16_DOBYear")));
       year.selectByVisibleText("2006");
      //div[@class='multiselect'];
       WebElement DropDownElement=driver.findElement(By.id("questions[q_19]"));
       DropDownElement.click();
     //  Select dropdownSelectObject = new Select(driver.findElement(By.id("questions[q_19][0]")));
	//dropdownSelectObject.selectByVisibleText("Area, ethnic, and gender studies");
	
       
       driver.findElement(By.id("questions[q_19][0]")).click();
       driver.findElement(By.id("questions[q_19][3]")).click();
       DropDownElement.click();
       driver.findElement(By.id("questions[q_137]")).click();
       driver.findElement(By.id("submit")).click();
 
		
	}

}
