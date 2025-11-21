package parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class multi {
@Parameters({"a","b"}) 
	 @Test
	  public void add(@Optional("4") int a, int b) {
		  int div;
		  div=a*b;
		  System.out.println("the division of a and b is : "+ div  );
	 }
}
