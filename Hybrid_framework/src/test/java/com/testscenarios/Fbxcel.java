package com.testscenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

public class Fbxcel extends CommonFunctions {
	@Test

	public void f() throws IOException {
		Locators loc = new Locators();
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream("./src/test/resources/TestData/data.properties");
		prop.load(fi);
		chromeBrowserLaunch();
		driver.get("https://www.facebook.com/");

		sendKeyByAnyLocator(loc.Fb_email, prop.getProperty("email"));
		sendKeyByAnyLocator(loc.Fb_password, prop.getProperty("password"));
		clickByAnylocator(By.name("login"));
		driver.quit();
		

	}

}
