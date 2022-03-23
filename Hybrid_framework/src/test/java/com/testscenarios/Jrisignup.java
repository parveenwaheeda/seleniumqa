package com.testscenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.Locators;
import com.utilities.WrapperClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jrisignup extends WrapperClass{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
	   	Locators loc1 =new Locators();
		WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
		 Properties prop = new Properties();
		 FileInputStream fi=new FileInputStream("./src/test/resources/TestData/data.properties");
		 prop.load(fi);
		 driver.get(prop.getProperty("URL"));
		 sendKeysByAnyLocator(loc1.Justrechargeit_signup_name_Editbox,prop.getProperty("Username"));
		 sendKeysByAnyLocator(loc1.Justrechargeit_signup_mobileno_Editbox,prop.getProperty("MobileNo"));
		 sendKeysByAnyLocator(loc1.Justrechargeit_signup_email_Editbox,prop.getProperty("Email"));
		 sendKeysByAnyLocator(loc1.Justrechargeit_signup_password_Editbox,prop.getProperty("Password"));
		 driver.findElement(loc1.Justrechargeit_signup_Checkbox).click();
		 driver.findElement(loc1.Justrechargeit_signup_Button).click();
		 
		 
		}

}
 