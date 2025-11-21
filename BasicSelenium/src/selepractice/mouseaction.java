package selepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseaction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		WebElement ele =driver.findElement(By.xpath("//a[text()='Saved']"));
		//WebElement ele1=driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions a=new Actions(driver);
		//a.moveToElement(ele).click().perform();
		a.moveToElement(ele).contextClick().perform();
		//a.moveToElement(ele1).perform();
		
			// driver.quit();
	}

}
