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
	
	
	
	//AppleVacations
	public final By apple_email=By.name("ctl01$ContentPlaceHolder$account$txtEmail");
	public final By apple_phone=By.name("ctl01$ContentPlaceHolder$account$txtPhone");
	public final By apple_password=By.name("ctl01$ContentPlaceHolder$account$txtPassword");
	public final By apple_confirm=By.name("ctl01$ContentPlaceHolder$account$ConfirmPassword");
	public final By apple_first=By.name("ctl01$ContentPlaceHolder$account$txtFirstName");
	public final By apple_last=By.name("ctl01$ContentPlaceHolder$account$txtLastName");
	public final By apple_address=By.name("ctl01$ContentPlaceHolder$account$txtAddress1");
	public final By apple_aptno=By.name("ctl01$ContentPlaceHolder$account$txtApartmentNumber");
	public final By apple_city=By.name("ctl01$ContentPlaceHolder$account$txtCity");
	public final By apple_state=By.name("ctl01$ContentPlaceHolder$account$txtState");
	public final By apple_postal=By.name("ctl01$ContentPlaceHolder$account$txtPostal");
	public final By apple_securityquestion=By.name("ctl01$ContentPlaceHolder$account$drpdwnSecurityQuestion");
	public final By apple_securityanswer=By.name("ctl01$ContentPlaceHolder$account$txtSecurityAnswer");
	public final By apple_createaccount=By.name("ctl01$ContentPlaceHolder$account$BtnCreate");
	
	
	

}