package dataprovider1;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderclass{
	@DataProvider (name="create")
	public Object[][] data1(Method m)
	{
		Object[][] testdata=null;
		if(m.getName().equals("logincre"))
			testdata= new Object[][]
					{
			{"user1","pass1","u1","u2","u3"},
			{"user2","pass2","u4","u5","u6"},
			{"user3","pass3","u8","u9","u10"},
			{"user4","pass4","u11","u12","u13"}
					};

					else if	(m.getName().equals("m1"))  
					{
						testdata= new Object[][]
								{
							{"user1","pass1","m1"},
							{"user2","pass2","m1"},
							{"user3","pass3","m1"}
								};
					}

		return testdata;

	}
	@DataProvider(name="dep1",indices ={0,2})
	public String[] dep2()
	{
		String[] a= {"Vindhya","Lalitha","Hema","Narendra"};
		return a;
	}
	@DataProvider(name="exceldata")
	public String[][] readfromexcel() throws IOException {
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
		for(int i=0;i<rowcount-1;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<cellcount;j++)
			{
				DataFormatter df= new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
			//System.out.println();
		}
		fis.close();
		workbook.close();
		return data;

	}

}
