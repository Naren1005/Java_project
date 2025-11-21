package filehandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readfromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f= new File("D:\\Vcube java selenium recordings\\Seleniumdatafortesting.xlsx");

		FileInputStream fis= new FileInputStream(f);

		XSSFWorkbook w= new XSSFWorkbook(fis);
		XSSFSheet sht=w.getSheet("Lalitha");

		System.out.println(sht.getLastRowNum());
		for(int i=0; i<=sht.getLastRowNum();i++) {
			String a=sht.getRow(i).getCell(0).getStringCellValue();
			System.out.println(a);
		}
	}
}
