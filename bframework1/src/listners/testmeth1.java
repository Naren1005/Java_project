package listners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (listener.class)
public class testmeth1 {
  @Test
  public void method1() {
	  System.out.println("i am method one");
  }
  @Test
  public void method2() {
	  System.out.println("i am method two");
	  Assert.assertTrue(false);
  }
  @Test(timeOut=1000)
  public void method3() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("i am method three");
	  
  }
  @Test(dependsOnMethods = "method3")
  public void method4() {
	  System.out.println("i am method four");
  }
}
