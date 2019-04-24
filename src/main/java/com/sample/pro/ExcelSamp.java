package com.sample.pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSamp {

	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\user\\eclipse-workspace\\MavenSample\\excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet2");
		Row r = s.getRow(2); 
		Cell c = r.getCell(1); 
		System.out.println(c);
		 
		   // no of rows count

		   int count = s.getPhysicalNumberOfRows();
		   System.out.println(count);
		   System.out.println("\n");
		
		    // no of cell count

		    Row r1 = s.getRow(2);
		    int c1 = r1.getPhysicalNumberOfCells();
		    System.out.println(c1);
			System.out.println("\n");
		
		    // get particular row values
		
		    Row r2 = s.getRow(2);
		    for (int h = 0; h < r2.getPhysicalNumberOfCells(); h++) {
		    Cell c2 = r2.getCell(h);
		    System.out.println(c2);
		    }
		    System.out.println("\n");
			// get all values from excel

			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r3 = s.getRow(i);
			for (int j = 0; j < r3.getPhysicalNumberOfCells(); j++) {
			Cell c3 = r3.getCell(j);
			System.out.println(c3);
			}
			}
			System.out.println("\n");
			// get particular row values

			Row r4 = s.getRow(2);
			for (int l = 0; l < r4.getLastCellNum(); l++) {
			Cell c4 = r4.getCell(l);
			System.out.println(c4);
			//getLastCellNum method will print till last values in excelsheet.Suppose particular row has 8 values in continuous order getPhysicalNumberOfCells will print the null values.
			
					}
				}
			}
