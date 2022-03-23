package com.testscenarios;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadTestdatafromExcel {
  @Test
  public void f() throws IOException {
	  FileInputStream fi = new FileInputStream("./src/test/resources/TestData/td1.xlsx");
	  Workbook wb = new XSSFWorkbook(fi);
	  Sheet s= wb.getSheet("sheet1");
	  Row r=s.getRow(1);
	  System.out.println(r.getCell(0));
	  

  }
} 
