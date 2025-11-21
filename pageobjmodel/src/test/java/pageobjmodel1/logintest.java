package pageobjmodel1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {
	WebDriver driver;
@BeforeClass	
  void setup()
  {
	WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  driver.manage().window().maximize();
  }
  @Test
  void testlogin()
  {
	  loginpage2pagefactory lp=new loginpage2pagefactory(driver); //for page factory
	  //loginpage lp=new loginpage(driver); // with out page factory.
	  lp.setusername("selenium");
	  lp.setpassword("selenium");
	  lp.clicklogin();
	  
	  Assert.assertEquals(driver.getTitle(),"OrangeHRM","title is  matching");
  System.out.println(driver.getTitle());
  }
  @AfterClass
  void teardown()
  {
	  driver.quit();
  }

}
