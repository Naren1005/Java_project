package xpath;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class absa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ib-u.absa.co.za/xsms/ms/dsp/product.html");
		driver.manage().window().maximize();
		
		
		Select sc=new Select(driver.findElement(By.id("application")));
		sc.selectByVisibleText("Cheque Account");
		Thread.sleep(3000);
		Select sc1=new Select(driver.findElement(By.id("products")));
		sc1.selectByVisibleText("Premium Banking");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	}

}
