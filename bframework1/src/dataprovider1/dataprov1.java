package dataprovider1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprov1 {
	// if we have multiple data then we can use string for single dimensional array with same data type or object if different data type.
  @Test(dataProvider="create",dataProviderClass=dataproviderclass.class)
  public void logincre(String a[]) {
	  System.out.println("***********"+a[0]);
	  System.out.println("***********"+a[1]);
	  System.out.println("***********"+a[2]);
	  System.out.println("***********"+a[3]);
	  System.out.println("***********"+a[4]);
  }
  
  
//  @Test(dataProvider="create",dataProviderClass=dataprovidertestdata.class)
//  public void logincre(String uname,String pas) {
//	  System.out.println(uname+"***********"+pas);
//	  
//  }
  
  @Test(dataProvider="create",dataProviderClass=dataproviderclass.class)
  public void m1(String un,String ps,String m) 
  {
	  System.out.println(un+"***********"+ps+"*******"+m);
  }
  
  @Test(dataProvider="dep1",dataProviderClass=dataproviderclass.class)
  public void m2(String a)
  {
	  System.out.println(a+"***********");
  }
  
 
  
  @Test(dataProvider="exceldata",dataProviderClass=dataproviderclass.class)
  public void m3(String un,String ps)
  {
	  System.out.println("username:  "+un+"***********"+"password :  "+ps+">>>>>>>>>>>"+Thread.currentThread().getId());
	  
  }
  
 
}
