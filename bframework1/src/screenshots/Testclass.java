package screenshots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testclass extends Basetest {
  @Test(testName="orhrm", priority=1,groups= {"regression"})
  public void orhrmlogin() {
	  
	  
	  //.pageLoadTimeout(2,TimeUnit.SECONDS)
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selnim");
		driver.findElement(By.name("Submit")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//li[text()='Welcome selenium']")).isDisplayed());
		
  }
  @Test(testName="fb",priority=2,groups= {"smoke","regression"})
  public void fblogin() throws InterruptedException {
	  
	  
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String inttitle=driver.getTitle();
		driver.findElement(By.name("email")).sendKeys("selenium",Keys.ENTER);
		
		String afterlogin=driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(inttitle, afterlogin);
		
		
  }
  @Test(testName="google",priority=3,groups= {"smoke"})
  public void googlesearch() throws InterruptedException {
	  
	  
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.className("gLFyf")).sendKeys("narendra akurathi",Keys.ENTER);
		
		
  }
}
