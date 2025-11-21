package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpathaxes {
  @Test
  public void xpathsiblings() throws Exception {
	  
	  System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).sendKeys("found the element");
		 driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click();
		driver.findElement(By.xpath("//label[text()='Email']/following::div[2]/child::input[@type='password']")).sendKeys("found child");	 Thread.sleep(5000);
		
		 Thread.sleep(3000);
		 driver.close();}
  
 
}
