package com.testscenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

public class Jrisignup1 extends CommonFunctions {
	@Test
	public void f() throws IOException {

		Locators loc1 = new Locators();
		chromeBrowserLaunch();
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream("./src/test/resources/TestData/data.properties");
		prop.load(fi);
		driver.get(prop.getProperty("URL"));
		sendKeyByAnyLocator(loc1.Justrechargeit_signup_name_Editbox, prop.getProperty("Username"));
		sendKeyByAnyLocator(loc1.Justrechargeit_signup_mobileno_Editbox, prop.getProperty("MobileNo"));
		sendKeyByAnyLocator(loc1.Justrechargeit_signup_email_Editbox, prop.getProperty("Email"));
		sendKeyByAnyLocator(loc1.Justrechargeit_signup_password_Editbox, prop.getProperty("Password"));
		clickByAnylocator(loc1.Justrechargeit_signup_Checkbox);
		clickByAnylocator(loc1.Justrechargeit_signup_Button);

	}
}
