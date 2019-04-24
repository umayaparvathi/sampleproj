package com.sample.pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet2 {

	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\user\\eclipse-workspace\\MavenSample\\excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet3");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				// 1-text,0-number
				int type = c.getCellType();//0 ,1
				if (type == 1) {
					String name = c.getStringCellValue();
					System.out.println(name);
				}
				if (type == 0) {
					double d = c.getNumericCellValue();
					// d-l
					long L = (long) d;
					// l-s
					String name = String.valueOf(L);
				//	int d = (int) c.getNumericCellValue();
					System.out.println(name);
				
				}

			}

		}
	}
}