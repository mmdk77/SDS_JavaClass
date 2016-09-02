package com.sds.movie.list;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	public static void main(String[] args) {
		//XSSFWorkbook - ���������� �����ϱ� ���� ��ü
		File file = new File("C:/MovieDB.xlsx");
		try {
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			
			//���� ���Ͽ� ���� sheet �� �����غ���!!
			XSSFSheet sheet=workbook.getSheet("movie");
			
			XSSFRow row=sheet.getRow(3);
			
			XSSFCell cell=row.getCell(0);
			System.out.println(cell.getStringCellValue());
			
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
