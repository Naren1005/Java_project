package invocation;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

public class invocationcount1 {
  @Test (invocationCount = 5,invocationTimeOut = 1000,threadPoolSize = 2)
  public void f() {
	  
	  System.out.println("using invocation count to print this sysout statement 5 times with out using for loop");
	 
  }
}
