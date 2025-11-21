package pack1;

import org.testng.annotations.Test;

public class testngclass1 {
	 @Test(priority=2,description="this is c method")
	  public void c() {
		  System.out.println("c method");
	  }
  @Test(priority=3,description="this is a method")
  public void a() {
	  System.out.println("a method");
  }
  @Test(priority=1,description="this is b method")
  public void b() {
	  System.out.println("b method");
  }
 
}
