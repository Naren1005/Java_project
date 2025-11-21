package readingexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class readingwithoutknowcout {
  @Test
  public void readfromexcel() throws IOException {
	  
	  FileInputStream fis= new FileInputStream("D:\\Vcube java selenium recordings\\Seleniumdatafortesting.xlsx");
	  
	  XSSFWorkbook W= new XSSFWorkbook(fis);
	  XSSFSheet sht= W.getSheet("Lalitha");
	 
	  
	  int b=sht.getLastRowNum();
	  System.out.println("the no of records in the sheet are:  "+b);
	  
	  for (int a=0;a<=b;a++)  // as we know the no of rows so we are able to put the last value as 58
	  {
		  String cellval=sht.getRow(a).getCell(0).getStringCellValue();
		  
	  System.out.println(a+"-"+cellval);
	 
	  }
	  
  }
}
