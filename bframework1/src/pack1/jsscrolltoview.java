package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class jsscrolltoview {
  @Test
  public void myprog() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");
	  
	 WebDriver driver= new ChromeDriver();
	 
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.ebay.com/");
	//((JavascriptExecutor)driver).executeScript("window.scrollBy(1000,5500)");
	WebElement a=driver.findElement(By.linkText("TCGplayer"));	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",a);
		
		a.click();
	
  }
}
