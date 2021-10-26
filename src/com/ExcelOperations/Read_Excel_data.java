package com.ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedHashMap;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_data{

	static LinkedHashMap<String, LinkedHashMap<String, String>> TestData;

	public static void main(String[] args) throws Throwable{
		
		TestData = new LinkedHashMap<String, LinkedHashMap<String, String>>();
		File excel = new File("D:\\Gk\\test.xls");
		FileInputStream fis = new FileInputStream(excel);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowNum = ws.getLastRowNum() + 1;
		int colNum = ws.getRow(0).getLastCellNum();
		for (int i = 1; i < rowNum; i++) {
			String TestID = null;
			LinkedHashMap<String, String> CurrentHashMap = new LinkedHashMap<String, String>();
			for (int j = 0; j < colNum; j++) {
				if (ws.getRow(0).getCell(j) == null) {
					ws.getRow(0).createCell(j);
				}
				if (ws.getRow(i).getCell(j) == null) {
					ws.getRow(i).createCell(j);
				}
				CurrentHashMap.put(ws.getRow(0).getCell(j).getStringCellValue(),
						ws.getRow(i).getCell(j).getStringCellValue());
				if (ws.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("Test-3")) {
					TestID = ws.getRow(i).getCell(j).getStringCellValue();
				}
			}
			TestData.put(TestID, CurrentHashMap);
		}
		System.out.println(TestData);
		wb.close();
	}

	public LinkedHashMap<String, LinkedHashMap<String, String>> getTestData() {

		return TestData;
	}

}