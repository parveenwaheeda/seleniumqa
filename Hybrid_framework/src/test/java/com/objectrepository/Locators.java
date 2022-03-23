package com.objectrepository;
import org.openqa.selenium.By;
public class Locators {
	
	//Signin locators
	public final By Justrechargeit_login_Email_Editbox=By.name("txtUserName");
	public final By Justrechargeit_login_password_Editbox=By.id("txtPasswd");
	public final By Justrechargeit_login_entercaptcha_Editbox=By.name("txtCaptcha");
	public final By Justrechargeit_login_securesignin_Button=By.id("imgbtnSignin");
	
	
	//signup locators
	public final By Justrechargeit_signup_name_Editbox=By.name("signup_name");
	public final By Justrechargeit_signup_mobileno_Editbox=By.id("signup_mobileno");
	public final By Justrechargeit_signup_email_Editbox=By.name("signup_email");
	public final By Justrechargeit_signup_password_Editbox=By.name("signup_password");
	public final By Justrechargeit_signup_Checkbox1=(By.id("checkbox1"));
	public final By Justrechargeit_signup_Checkbox=(By.id("checkbox"));
	public final By Justrechargeit_signup_Button=By.name("imgbtnSubmit");
	
	//Fb signin Locators
	
	public final By Fb_email= By.id("email");
	public final By Fb_password=By.name("pass");
	
	
	
	
	

}