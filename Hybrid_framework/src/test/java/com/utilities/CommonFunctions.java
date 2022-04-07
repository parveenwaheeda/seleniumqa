package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.text.DateFormat;

public class CommonFunctions {
	public static WebDriver driver;

	public void chromeBrowserLaunch() {
		// WebDriverManager.chromedriver().browserVersion("99.0.4844.74").setup();
		// latest chrome version
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void firefoxBrowserLaunch() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();// abc
		driver.manage().window().maximize();
	}

	public void edgeBrowserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	public String timeStamp() {
		Date d = new Date();
		System.out.println(d);
		DateFormat df = new SimpleDateFormat("yyyy_MMM_dd_HH_mm_ss");
		// convet the system date to user defined format
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		return timeStamp;
	}

	public void takescreenshot() throws Exception {
		// take screenshot
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String pathoftheScreenshotFolder = "./screernshots/";
		FileHandler.copy(abc, new File(pathoftheScreenshotFolder + "Test" + timeStamp() + ".PNG"));

	}

	/** sendkeys by any locators for Editbox/Textbox *********/
	public static void sendKeyByAnyLocator(By locator, String testdata) {
		WebElement ele = driver.findElement(locator);
		if (ele.isDisplayed()) {
			if (ele.isEnabled()) {
				ele.clear();
				ele.sendKeys(testdata);
			} else {
				System.out.println("element is disable state, please check the locator***");
			}
		} else {
			System.out.println("element is not displayed, please check the locator***");
		}
	}

	/************ click on any webelement *************/

	public void clickByAnylocator(By locator) {
		WebElement ele = driver.findElement(locator);
		if (ele.isDisplayed() && ele.isEnabled()) {
			ele.click();
		} else {
			System.out.println("The given locator is not displayed on DOM or not in enabled state****");
		}
	}

	/****************** Dropdown selection **************************************/

	public void selectByVisibleText(By locator, String visibleText) {

		WebElement element = driver.findElement(locator);
		if (element.isDisplayed()) {
			if (element.isEnabled()) {
				Select dropdown = new Select(element);
				dropdown.selectByVisibleText(visibleText);
			} else {
				System.out.println("The webelement is NOT Enabled, please check**************");
			}
		} else {
			System.out.println("The webelement is NOT displayed, please check**************");
		}

	}

//	/*****************
//	 * read data from excel sheet
//	 * 
//	 * @throws IOException
//	 *********************/
//	public void readdata(String email,String password)  throws IOException {
//		FileInputStream fi = new FileInputStream("./src/test/resources/TestData/td1.xlsx");
//		
//		Workbook wb = new XSSFWorkbook(fi);
//		Sheet s = wb.getSheet("sheetname");
//		Row r = s.getRow(1);
//		Cell c = r.getCell(0);
//		String email1 = c.toString();
//		Cell c1 = r.getCell(1);
//		String password1 = c1.toString();
//
//	}

/************
 * popupHandle
 * 
 * @throws InterruptedException
 *********************************/
public void popupHandleToCloseTheChildWindow() throws InterruptedException {
	// get the main windown name
	String mainWindowName = driver.getWindowHandle();
	System.out.println("mainWindowName:" + mainWindowName);

	Set<String> allWindowNames = driver.getWindowHandles();
	System.out.println("allWindowNames:" + allWindowNames);

	// Close the child window (popups)
	for (String abc : allWindowNames) {// 2
		// validate the window name is parent window /Child window?
		if (!mainWindowName.equals(abc)) {
			// switch to child window
			driver.switchTo().window(abc);
			Thread.sleep(3000);
			// Close my child window
			driver.close();
		}
	}
	// move cursor point to back to mainwindow
	driver.switchTo().window(mainWindowName);
}

public void navigateToPopupWindow() throws InterruptedException {
	// get the main windown name
	String mainWindowName = driver.getWindowHandle();
	System.out.println("mainWindowName:" + mainWindowName);

	Set<String> allWindowNames = driver.getWindowHandles();// 4
	System.out.println("allWindowNames:" + allWindowNames);

	// Close the child window (popups)
	// for (int i = 0; i < array.length; i++) { }
	for (String string : allWindowNames) {
		// validate the window name is parent window /Child window?
		if (!mainWindowName.equals(string)) {
			// switch to child window
			driver.switchTo().window(string);
			Thread.sleep(3000);
		}
	}

}

/*********** SwithchToWindow using Tab ***************************/
public void switchToNewTab() {
	// Get the current window handle
	String windowHandle = driver.getWindowHandle();// abc

	ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(allTabs.get(1));

	// Switch back to original window
	// driver.switchTo().window(windowHandle);
}

/***********
 * SwithchToWindow using Tab then close the New Tab againg back to Parent Window
 ***************************/
public void switchAndCloseNewTab() {
	// Get the current window handle
	String parentWindow = driver.getWindowHandle();
	ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs2.get(1));
	// Close the newly Opened Window
	driver.close();
	// Switch back to original window
	driver.switchTo().window(parentWindow);
}

}