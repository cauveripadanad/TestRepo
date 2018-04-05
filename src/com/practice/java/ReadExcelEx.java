package com.practice.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.sf.saxon.sort.DescendingComparer;

public class ReadExcelEx {
	
	private static XSSFWorkbook Excelworkbook;
	private static XSSFSheet Excelsheet;
	private static XSSFRow Row;
	private static XSSFCell Cell;
	//static List<String> unsortList;
	static String aa;
	
	public static void setTheFile(String sheetName) throws IOException{
		
		//filepath
		String filepath = "C:\\Users\\21790\\Desktop\\excelex\\readandwrite.xlsx";
		
		//open file
		FileInputStream fs = new FileInputStream(filepath);
		
		//access required sheet
		Excelworkbook= new XSSFWorkbook(fs);
		
		Excelsheet = Excelworkbook.getSheet(sheetName);
		
	}
	
	public static String getCellData1(int rownum, int colnum){
		
		Cell = Excelsheet.getRow(rownum).getCell(colnum);
		
		String celldata=Cell.getStringCellValue();
		
		System.out.println(celldata);
		
		return celldata;
		
	}
	
	/**
	 * @param rownum
	 * @param colnum
	 * @return
	 */
	public static void getCellData(){
		
		
		int totalrow = Excelsheet.getLastRowNum()+1;		
		System.out.println("total row -- " + totalrow);
		
		//list
		List<String> unsortList = new ArrayList<String>();
		
		for(int i=0; i<totalrow; i++){
			
			int cellCount = Excelsheet.getRow(i).getLastCellNum();
			
				
			for (int j = 0; j < cellCount; j++) {				
			
			 Row = Excelsheet.getRow(i);
			  
			 aa = Row.getCell(j).getStringCellValue();
			  System.out.println("vvv "+aa);
			  
			
			/*Cell = Excelsheet.getRow(rownum).getCell(colnum);
			
			String celldata=Cell.getStringCellValue();*/
			  
			  
			
			//create array
			  unsortList.add(aa);
			  
			System.out.println("ssssssssssss ---" +unsortList); 
		}
			
			
			Collections.sort(unsortList);
			for(String counter : unsortList){
				
				System.out.println(counter);
			}
		
	}
		
	
		
	
		
}

	public static void main(String args[]) throws IOException{
		
		setTheFile("Sheet1");
		//getCellData(0, 1);
		getCellData();
		
	}

}
