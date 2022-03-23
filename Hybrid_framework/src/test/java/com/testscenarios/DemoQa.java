package com.testscenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQa {
	@Test
	public void f() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(10000);
		String t = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		System.out.println(t);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmButton")).click();

		Thread.sleep(3000);
		String p = driver.switchTo().alert().getText();
		System.out.println(p);

		driver.switchTo().alert().accept();
		String r = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(r);
		driver.findElement(By.id("confirmButton")).click();

		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		String g = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(g);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.sendKeys("wah");
		Thread.sleep(2000);
		a.accept();
		String m = driver.findElement(By.id("promptResult")).getText();
		System.out.println(m);

	}
}
