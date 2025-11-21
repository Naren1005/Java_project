package pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class jssendvalue {
	
	public static WebDriver driver;
	@Test
	public void myprog() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");

		 driver= new ChromeDriver();

		driver.manage().window().maximize();
		
		
		 driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
			System.out.println("title before login:  "+ driver.getTitle());
			SS("beforelogin");
			WebElement UN=driver.findElement(By.xpath("//input[@name='txtUserName']"));
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
			js.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow')" ,UN);
			js.executeScript("arguments[0].value='selenium'", UN);
			Thread.sleep(2000);
			WebElement PW=driver.findElement(By.xpath("//input[@name='txtPassword']"));
			js.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow')" ,PW);
			js.executeScript("arguments[0].value='selenium'", PW);
			
			Thread.sleep(2000);
			SS("userpass");
			//for submit button
			WebElement Sub=	driver.findElement(By.xpath("//input[@name='Submit']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click()" ,Sub);
			System.out.println("title after login:  "+ driver.getTitle());
			SS("afterlogin");
			System.out.println("exe");
	}
	public void SS(String a) throws IOException
	{
		
		File T3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File S3= new File("./screenshot/image1"+ a +".jpg");
		FileHandler.copy(T3, S3);
}
}
