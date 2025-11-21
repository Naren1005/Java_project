package readingexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;

public class differentdatatypes {
  @Test
  public void readfromexcel() throws IOException {
	  
	  
	 //crateing the excel workbook 
//	  XSSFWorkbook workbook=new XSSFWorkbook();
//	  XSSFSheet sheet=workbook.createSheet("Laltiha");
//	  XSSFRow row=sheet.createRow(0);
//	  sheet.getRow(0).createCell(0).setCellValue("Lalitha Varshini");
//	  sheet.getRow(0).createCell(1).setCellValue("Akurathi");
//	  sheet.createRow(1);
//	  sheet.getRow(1).createCell(0).setCellValue("Vindhya");
//	  sheet.getRow(1).createCell(1).setCellValue("Akurathi");
//	  
//	  File file=new File("D:\\Vcube java selenium recordings\\Seleniumdatafortesting1.xlsx");
//	  FileOutputStream fos=new FileOutputStream(file);
//	  workbook.write(fos);
//	  workbook.close();
	  
	  FileInputStream fis=new FileInputStream("D:\\\\Vcube java selenium recordings\\\\Seleniumdatafortesting1.xlsx");
	  XSSFWorkbook workbook=new XSSFWorkbook(fis);
	  XSSFSheet sheet=workbook.getSheet("Vindhya");
	  String s=sheet.getRow(1).getCell(0).getStringCellValue();
	 
	  int rowcount= sheet.getPhysicalNumberOfRows();
	  int cellcount=sheet.getRow(0).getPhysicalNumberOfCells();
	  
	  System.out.println("no of rows are:  "+ rowcount);
	  System.out.println("no of cells in a row are : "+ cellcount);
	  System.out.println("*****************");
	  
	  String[][] data=new String[rowcount][cellcount];
	  for(int i=1;i<rowcount;i++)
	  {
		  XSSFRow row=sheet.getRow(i);
		  for(int j=0;j<cellcount;j++)
		  {
//			  XSSFCell cell=row.getCell(j);
//			  String cellvalue=getcellvalue(cell);
//			  System.out.print("||"+cellvalue);
			 DataFormatter df= new DataFormatter();
			 System.out.print("||"+df.formatCellValue(sheet.getRow(i).getCell(j)));
		 }
		  System.out.println();
	  }
	    
	//	  }  
  }
  public String getcellvalue(XSSFCell cell)
  {
	  switch (cell.getCellType())
	  {
		  case NUMERIC:
			  return String.valueOf(cell.getNumericCellValue());
		  case BOOLEAN:
			  return String.valueOf(cell.getBooleanCellValue());
		  case STRING:
			  return cell.getStringCellValue();
			  default:
				  return cell.getStringCellValue();
  }
}
}
