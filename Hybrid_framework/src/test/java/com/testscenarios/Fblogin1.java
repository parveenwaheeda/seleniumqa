package com.testscenarios;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

public class Fblogin1 extends CommonFunctions {
	@Test
	public void f() throws IOException, InterruptedException {

		Locators loc = new Locators();
		FileInputStream fi = new FileInputStream("./src/test/resources/TestData/td1.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet("sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		String email = c.toString();
		Cell c1 = r.getCell(1);
		String password = c1.toString();

		chromeBrowserLaunch();
		driver.get("https://www.facebook.com/");

		sendKeyByAnyLocator(loc.Fb_email, email);
		sendKeyByAnyLocator(loc.Fb_password, password);
		clickByAnylocator(By.name("login"));
		Thread.sleep(3000);

		driver.quit();

	}
}