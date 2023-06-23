package com.selenium.code.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTesting {

	public static void main(String[] args) {

		XSSFWorkbook workbook = null;
		XSSFSheet workSheet;

		// create an object of File to open file

		File excelFile = new File("C:\\Users\\Dell\\Downloads\\Book.xlsx");
		FileInputStream inputStream = null;
		// create an object of file class to open file
		try {
			inputStream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		// Excel->workBook->workSheet->row->cell

		// create an object XSSFWorkbook to handle excel file
		try {
			workbook = new XSSFWorkbook(inputStream);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// to access workSheet.
		workSheet = workbook.getSheetAt(0);
		
		//iterete by using iterator()
		Iterator<Row> iterator = workSheet.iterator();
		
		while(iterator.hasNext()) {
		
			XSSFRow row = (XSSFRow)iterator.next();	//get the row
			Iterator<Cell> cellIterator = row.cellIterator();//get all cells
			
			while(cellIterator.hasNext()) {
				XSSFCell cell = (XSSFCell)cellIterator.next();//get cell
				
				switch(cell.getCellType()) {//check type and based on type print cells.
				case STRING:System.out.print(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;

				}
				System.out.print("\t");//once print cell take tab space.
			}
			System.out.println();//after each cell take new line.
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		/*
		 * // get Total rows int TtlRow = workSheet.getLastRowNum() + 1;
		 * System.out.println(TtlRow); // get total no of cells. int TtlCells =
		 * workSheet.getRow(0).getLastCellNum(); System.out.println(TtlCells);
		 * 
		 * /// print data
		 * 
		 * for (int currentRow = 0; currentRow <TtlRow; currentRow++) {
		 * 
		 * 
		 * // printing cell data..
		 * 
		 * for(int currentCell=0;currentCell<TtlCells;currentCell++) {
		 * System.out.print(workSheet.getRow(currentRow).getCell(currentCell).toString()
		 * ); System.out.print("\t");
		 * 
		 * } System.out.println();
		 * 
		 * 
		 * 
		 * // login by using excel credentials.
		 * 
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.get("http://www.saucedemo.com");
		 * 
		 * driver.findElement(By.id("user-name")).sendKeys(workSheet.getRow(currentRow).
		 * getCell(0).toString()); // locate password By name
		 * driver.findElement(By.name("password")).sendKeys(workSheet.getRow(currentRow)
		 * .getCell(1).toString()); // locate login By tag
		 * driver.findElement(By.id("login-button")).click();
		 * 
		 * // driver.quit(); }
		 */

	}

}
