package com.testscenarios;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Toyota {
	WebDriver driver;

	@Parameters("browsername")
	@BeforeClass

	public void browser(String browsername) throws Exception {

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else {
			System.out.println("Incorrect Browser");
		}
	}

	@Test
	public void f() throws InterruptedException, IOException {
		Date d = new Date();

//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();

		driver.get("https://forms.toyota.co.uk/brochure");
		driver.findElement(By.xpath("//a[@ class='tgbgdpr-cta-primary']")).click();
		driver.findElement(By.xpath("//li[@class='brochure_cars  on_hold-0 hybrid-1']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle  ']")).click();
		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath("//label[@for='brochure_newyarishybrid']"));
		String s1 = name.getText();

		WebElement s = (driver.findElement(By.xpath("//a[@data-value='Mrs']")));
		s.click();
		String s3 = s.getAttribute("data-value");

		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("wah");
		String s4 = fname.getAttribute("value");

		String s2 = s1 + s3 + s4;
		driver.findElement(By.name("surname")).sendKeys(s2);
		driver.findElement(By.id("submit-br")).click();

		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String pathoftheScreenshotFolder = "./screernshots/";
		FileHandler.copy(abc, new File(pathoftheScreenshotFolder + d + "Testabc.PNG"));
		Thread.sleep(8000);
		driver.quit();

	}

}