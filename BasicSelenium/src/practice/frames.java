package practice;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver","D:\\\\software_install setup\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Vcube%20java%20selenium%20recordings/Class%20videos/Selenium/htlmfiles/Frames.html");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='Hyper links.html']")));
		
		driver.findElement(By.linkText("The Rock Says")).click();
		Thread.sleep(3000);
		driver.navigate().back();

	}

}
