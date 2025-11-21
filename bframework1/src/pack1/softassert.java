package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	int a=10;
	int b=10;
	boolean con=(a>=b);
  @Test
  public void assertequals() {
	  
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(a,b, "a and b are not equal");
	  sa.assertNotEquals(a, b,"a and b are equal");
	  sa.assertTrue(con,"a is not greater than b");
	  sa.assertFalse(con,"a is less than b");
	  sa.assertAll();
			  }
  
  @Test
  public void assertequals1() {
	  
	 
	  Assert.assertEquals(a,b, "a and b are not equal");
	  Assert.assertNotEquals(a, b,"a and b are equal");
	  Assert.assertTrue(con,"a is not greater than b");
	 Assert.assertFalse(con,"a is less than b");
	  
			  }
}
