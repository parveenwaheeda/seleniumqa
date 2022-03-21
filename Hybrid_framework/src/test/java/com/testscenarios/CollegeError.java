package com.testscenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollegeError {
  @Test
  public void f() throws InterruptedException {
	    WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(1000);
	    driver.findElement(By.id("submit")).click();
	    WebElement first_error=driver.findElement(By.id("firstNameError"));
	    String first =first_error.getText();
	    System.out.println(first);
        System.out.println("===========================");
         
	    WebElement last_error=driver.findElement(By.id("lastNameError"));
	    String last = last_error.getText();
	    System.out.println(last);
        System.out.println("===========================");
	    
	    WebElement email_error=driver.findElement(By.id("emailAddressError"));
	    String email = email_error.getText();
	    System.out.println(email);
        System.out.println("===========================");
        
	    WebElement mobile_error=driver.findElement(By.id("phoneNumberError"));
	    String mobile = mobile_error.getText();
	    System.out.println(mobile);
        System.out.println("===========================");

	    WebElement pass_error=driver.findElement(By.id("passwordError"));
	    String pass = pass_error.getText();
	    System.out.println(pass);
        System.out.println("===========================");
	    
	    WebElement passw_error=driver.findElement(By.id("ConfirmPasswordError"));
	    String passw = passw_error.getText();
	    System.out.println(passw);
        System.out.println("===========================");
	    
	    WebElement nation_error=driver.findElement(By.id("nationalityError"));
	    String nation = nation_error.getText();
	    System.out.println(nation);
        System.out.println("===========================");
	    
	    WebElement attendee_error=driver.findElement(By.id("attendeeTypeError"));
	    String attendee = attendee_error.getText();
	    System.out.println(attendee);
        System.out.println("===========================");
	    
	    WebElement privacy_error=driver.findElement(By.id("questions_137Error"));
	    String privacy = privacy_error.getText();
	    System.out.println(privacy);
        System.out.println("===========================");
	    
	    driver.quit();
	    
	 
	    
  }
  
}
