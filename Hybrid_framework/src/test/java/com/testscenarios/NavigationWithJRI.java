package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationWithJRI {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.justrechargeit.com/SignIn.aspx");
        String tit = driver.getTitle();
        System.out.println(tit);
        String url= driver.getCurrentUrl();
        System.out.println(url);
        driver.findElement(By.xpath("//a[@title='Create New Account']")).click();
        String tit1 = driver.getTitle();
        System.out.println(tit1);
        String url1= driver.getCurrentUrl();
        System.out.println(url1);
        driver.findElement(By.name("imgbtnSubmit")).click();
        Thread.sleep(4000);
        WebElement s=driver.findElement(By.xpath("//span[@class='errormsg']"));
        String ss=s.getText();
        System.out.println(ss);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.quit();
}
}