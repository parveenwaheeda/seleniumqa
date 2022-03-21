package com.testscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.Locators;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JriLogin {

	public static void main(String[] args) throws InterruptedException {
		Locators loc=new Locators();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.justrechargeit.com/SignIn.aspx");
        driver.findElement(loc.Justrechargeit_login_Email_Editbox).sendKeys("par.wah@gmail.com");
        Thread.sleep(1000);
        driver.findElement(loc.Justrechargeit_login_password_Editbox).sendKeys("ppppp");
        driver.findElement(loc.Justrechargeit_login_entercaptcha_Editbox).sendKeys("22");
        driver.findElement(loc.Justrechargeit_login_securesignin_Button).click();
        



	}

}
