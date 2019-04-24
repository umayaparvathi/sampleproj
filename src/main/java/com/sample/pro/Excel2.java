package com.sample.pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {

	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\user\\eclipse-workspace\\MavenSample\\excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet2");
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		System.out.println(c);
		System.out.println("\n"+"****************");

		// get no of rows
		int count = s.getPhysicalNumberOfRows();
		System.out.println(count);
		System.out.println("\n");

		// get no of cell
		Row r1 = s.getRow(3);
		int count1 = r1.getPhysicalNumberOfCells();
		System.out.println(count1);
		System.out.println("\n");

		// get particular row value
		Row r2 = s.getRow(2);
		for (int i = 0; i < r2.getPhysicalNumberOfCells(); i++) {
			Cell c2 = r2.getCell(i);
			System.out.println(c2);
		}
		System.out.println("\n");
		
	   // get all values from excel
       for(int k=0;k<s.getPhysicalNumberOfRows();k++) {
       Row r3 = s.getRow(k);
       for(int l=0;l<r3.getPhysicalNumberOfCells();l++) {
	   Cell c3 = r3.getCell(l);
	   System.out.println(c3);
       }
       }	
       System.out.println("\n");
      
	   //last cell numbre
	  Row r5 = s.getRow(1);
	  for(int n=0;n<r5.getLastCellNum();n++) {
	  Cell c5 = r5.getCell(n);
	  System.out.println(c5);
	}
	  System.out.println("\n");
	}
	}
	
	









		
			
		
		

	
