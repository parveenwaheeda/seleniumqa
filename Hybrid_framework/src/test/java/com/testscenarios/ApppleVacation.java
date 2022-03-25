package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

public class ApppleVacation extends CommonFunctions {
	@Test
	public void f() throws InterruptedException, IOException {
		Locators loc = new Locators();

		FileInputStream fi = new FileInputStream("./src/test/resources/AppleVacationTD.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		clickByAnylocator(loc.apple_securityquestion);
		Sheet s = wb.getSheet("Sheet1");

		for (int i = 1; i <= s.getLastRowNum(); i++) {

			chromeBrowserLaunch();

			driver.get("https://www.applevacations.com/#!/");
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='reset']")));
			clickByAnylocator(By.xpath("//button[@type='reset']"));
			clickByAnylocator(By.xpath("//i[@class='icon-sprite-base90 bg-user']"));
			Thread.sleep(5000);
			clickByAnylocator(By.partialLinkText("Sign Up"));
			sendKeyByAnyLocator(loc.apple_email, s.getRow(i).getCell(0).getStringCellValue());
			sendKeyByAnyLocator(loc.apple_phone, s.getRow(i).getCell(1).getStringCellValue());
			sendKeyByAnyLocator(loc.apple_password, s.getRow(i).getCell(2).getStringCellValue());
			Thread.sleep(5000);
			sendKeyByAnyLocator(loc.apple_confirm, s.getRow(i).getCell(3).getStringCellValue());
			Thread.sleep(5000);
			sendKeyByAnyLocator(loc.apple_first, s.getRow(i).getCell(4).getStringCellValue());
			sendKeyByAnyLocator(loc.apple_last, s.getRow(i).getCell(5).getStringCellValue());
			sendKeyByAnyLocator(loc.apple_address, s.getRow(i).getCell(6).getStringCellValue());
			sendKeyByAnyLocator(loc.apple_aptno, s.getRow(i).getCell(7).toString());
			sendKeyByAnyLocator(loc.apple_city, s.getRow(i).getCell(8).getStringCellValue());
			clickByAnylocator(loc.apple_state);
			Thread.sleep(3000);
			selectByVisibleText(loc.apple_state, "OH");
			sendKeyByAnyLocator(loc.apple_postal, s.getRow(i).getCell(9).getStringCellValue());
			Thread.sleep(3000);
			selectByVisibleText(loc.apple_securityquestion, " What is your favorite pet's name?");
			sendKeyByAnyLocator(loc.apple_securityanswer, s.getRow(i).getCell(10).getStringCellValue());
			clickByAnylocator(loc.apple_createaccount);
			Thread.sleep(3000);

			if (driver.findElements(By.xpath("//td[@class='ajax__validatorcallout_error_message_cell']")).size() > 0) {
				System.out.println("Please type the characters that you see in the image.");
				System.out.println("Fail");
				Cell cell = s.getRow(i).createCell(11);
				cell.setCellValue("FAIL");
			} else {
				System.out.println("account created");
				Cell cell = s.getRow(i).createCell(11);
				cell.setCellValue("pass");
			}
			FileOutputStream outputStream = new FileOutputStream("./src/test/resources/AppleVacationTD.xlsx");
			wb.write(outputStream);

		}

	}

}
