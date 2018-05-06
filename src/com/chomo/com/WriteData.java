package com.chomo.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData 
{
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("./data/book1.xlxs");
		Workbook wb=WorkbookFactory.create(fis);
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				Cell c=wb.getSheet("Sheet1").getRow(i).getCell(j);
				System.out.print(c+"");
			}
			System.out.println();	
		}
		
	}
}
