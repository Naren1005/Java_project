package selepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googlesearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		Actions a= new Actions(driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		
		
		Thread.sleep(1000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']"));
		
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			
		}
		
				//driver.quit();
	}

}
