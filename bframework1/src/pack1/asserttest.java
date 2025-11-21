package pack1;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asserttest {
	int a=10;
	int b=10;
	@Test
	public void assertequals() {
		int a=10;
		int b=10;
		Assert.assertEquals(a,b, "a and b are not equal");
	}
	@Test
	public void assernotequal()
	{
		Assert.assertNotEquals(a, b,"a and b are equal");
	}
	@Test
	public void assertcondition()
	{
		boolean condition= (a>=b);
		Assert.assertTrue(condition,"a is greater than or equal to b");
	}
}