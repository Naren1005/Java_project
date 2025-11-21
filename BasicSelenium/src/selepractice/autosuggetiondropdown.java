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

public class autosuggetiondropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		
		driver.findElement(By.className("commonModal__close")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		WebElement to= driver.findElement(By.xpath("//label[@for='toCity']"));
		from.sendKeys("johannesburg");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
	
	to.click();
	to.sendKeys("mumbai");
	to.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	to.sendKeys(Keys.ENTER);
	
	
	
		
	
		
	}

}
