package com.selenium.code.dataDrivenTesting;

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

public class ReadDataFromExcelFile {

	public static void main(String[] args) {
		// Excel->workBook->workSheet->row->cell

		// file path
		String excelPath = "C:\\Users\\Dell\\Downloads\\Book.xlsx";

		String digiExcelPath="C:\\Users\\Dell\\Downloads\\Digital-Invoice Api's response(restTemplate migration) (3).xlsx";
		// open file by using FileInputStream
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// get XSSFWorkbook
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fileInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// get sheet by using workbook

		XSSFSheet sheet = workbook.getSheetAt(0);

		// iterate by using iterator()

		/**
		Iterator iterator = sheet.iterator();

		while (iterator.hasNext()) {
			// get Row->XSSFRow
			XSSFRow row = (XSSFRow) iterator.next();

			// get Allcells
			Iterator cellIterator = row.cellIterator();//get all cells

			while (cellIterator.hasNext()) {

				XSSFCell cell = (XSSFCell) cellIterator.next();

				switch (cell.getCellType()) {

				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print("\t");

			}
			System.out.println();

		}*/
		
		//alternate way by using nested for loop
		
		int countRows = sheet.getLastRowNum();
		int countCells = sheet.getRow(0).getLastCellNum();

		for(int i=0;i<countRows;i++) {
			XSSFRow currentRow = sheet.getRow(i);
			
			for(int j=0;j<countCells;j++) {
				String value = currentRow.getCell(j).toString();
			System.out.print(value);
			System.out.print("\t");

			}
			System.out.println();
		}
		
		
	}

}
