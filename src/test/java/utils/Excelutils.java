package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	public static void main (String[] args) {
	
		getRowCount();
		
		 
	}
 public static void getRowCount() {
	 XSSFWorkbook workbook;
	 XSSFSheet sheet;
	try {
		//String projectpath= System.getProperty("user.dir");
		workbook = new XSSFWorkbook("D:\\Training workspace\\Hello\\Excel\\excel.xlsx");
		
		  sheet = workbook.getSheet("Sheet1");
		//  String celldata = sheet.getRow(0).getCell(0).getStringCellValue();
		  String celldata1 = sheet.getRow(1).getCell(0).getStringCellValue() +" "+ sheet.getRow(2).getCell(0).getStringCellValue();
		
		
		  System.out.println(celldata1);
		
		int rowcount  = sheet.getPhysicalNumberOfRows();
		 System.out.println("no of rows"+" "+rowcount);

	} catch (IOException exp) {
	
		exp.printStackTrace();
		exp.getCause();
	exp.getMessage();
	}
	
 }
}
