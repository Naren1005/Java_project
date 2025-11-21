package grouping;

import org.testng.annotations.Test;

public class sit {
  @Test (groups="unit")
  public void unitgroup() {
	  System.out.println("Unit group test case");
	  
  }
  @Test (groups="sit")
  public void sitgroup1() {
	  System.out.println("sit group test case");
	  
  }
  @Test (groups="uat")
  public void uatgroup() {
	  System.out.println("Uat group test case");
	  
  }
  @Test (groups={"sit","reg"})
  public void sitgroup() {
	  System.out.println("sit group test case");
	  
  }
  @Test (groups="reg")
  public void reggroup() {
	  System.out.println("reg group test case");
	  
  }
  @Test (groups={"sit","reg"})
  public void reggroup1() {
	  System.out.println("reg group test case");
	  
  }
  @Test (groups="unit")
  public void unitgroup1() {
	  System.out.println("Unit group test case");
	  
  }
}
