package filehandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeintoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f= new File("D:\\Vcube java selenium recordings\\Seleniumdatafortesting.xlsx");
		
		FileInputStream fis= new FileInputStream(f);
		
		XSSFWorkbook w= new XSSFWorkbook(fis);
		XSSFSheet sht=w.getSheet("Naren");
		
		XSSFRow ro= sht.createRow(1);
		XSSFCell roco=ro.createCell(0);
		roco.setCellValue("hi am writing in to the excel");
		
		FileOutputStream fos= new FileOutputStream(f);
		
		w.write(fos);
		//w.close();
				}
			}

