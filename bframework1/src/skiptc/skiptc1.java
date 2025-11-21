package skiptc;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skiptc1 {
	boolean data=true;
	@Test (enabled=false)
	public void skikenable() {
		System.out.println("se t the test to enable to false");
	}
	@Test 
	public void skipthrow() {
		System.out.println("force stoping the execution");
		throw new SkipException("no need to execute this test");
	}
	@Test 
	public void skipif() {
		if(data==false)
		{
			System.out.println("execute this test");
		}
		else
		{
			System.out.println("data is not avaialbe to execute this test");
			throw new SkipException("data is not avaialbe to execute this test");
		}
	}

}
