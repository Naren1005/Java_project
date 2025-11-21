package dependecy;

import org.testng.annotations.Test;

public class dependsonmethod1 {
	String trackingno=null;
	@Test
	public void createorder() {
            int a=6/0;
		System.out.println("order has been created");
		trackingno="ASD54564";
	}
	@Test (dependsOnMethods = {"createorder"} )
	public void trackorder() throws Exception {
		if(trackingno !=null)
		{
			System.out.println("trackorder has been created");
		}
		else
			throw new Exception("invalid tracking no ");
	}
	@Test (priority=1,dependsOnMethods = {"createorder"})
	public void cancelorder() throws Exception {
		
		if(trackingno !=null)
		{
			System.out.println("cancelorder has been created");
		}
		else
			throw new Exception("invalid tracking no ");
	}

}
