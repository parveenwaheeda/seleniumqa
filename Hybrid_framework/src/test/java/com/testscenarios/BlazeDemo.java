
package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeDemo {

	public static void main(String[] args) {
		WebDriver driver;
  		WebDriverManager.chromedriver().setup();
  		driver = new ChromeDriver();
  		
  	//	WebDriverManager.safari().setup();
  	//	driver = new ChromeDriver();
  		
  		driver.manage().window().maximize();
  		driver.get("https://blazedemo.com/");
		
	   Select fromport = new Select(driver.findElement(By.name("fromPort")));
        fromport.selectByVisibleText("Portland"); 
       
        Select toport = new Select(driver.findElement(By.name("toPort")));
        toport.selectByVisibleText("Berlin"); 
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("(//input[@type='submit'])[2] ")).click();
        driver.findElement(By.xpath("//input[@name='inputName']")).sendKeys("wah");
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("123 Main St.");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Columbus");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Ohio");
        driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("43240");
        Select card =new Select(driver.findElement(By.name("cardType")));
        card.selectByVisibleText("American Express");
        driver.findElement(By.xpath("//input[@name='creditCardNumber']")).sendKeys("4768786876876");
        driver.findElement(By.xpath("//input[@name='creditCardMonth']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@name='creditCardYear']")).sendKeys("2026");
        driver.findElement(By.xpath("//input[@name='nameOnCard']")).sendKeys("John Smith");
        driver.findElement(By.xpath("//input[@name='rememberMe']")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();        
       String s= driver.findElement(By.xpath("//h1")).getText();
       System.out.println(s); 
String t=driver.findElement(By.xpath("//table[@class='table']")).getText();
System.out.println(t);

}
}
