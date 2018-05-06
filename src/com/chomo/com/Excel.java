package com.chomo.com;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static void main(String[] args) throws Exception{
	String xlPath="./data/input.xlsx";
	FileInputStream fis=new FileInputStream(xlPath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s=wb.getSheet("Sheet1");
	Row r = s.getRow(0);
	Cell c=r.getCell(0);
	String v=c.getStringCellValue();
	System.out.println(v);
		
	}
}
