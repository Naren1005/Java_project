package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class addition {
	@Parameters({"a","b"}) 
  @Test
  public void add(int a, int b) {
	  int sum;
	  sum=a+b;
	  System.out.println("the sum of a and b is : "+ sum  );
	  
  }
}
