package relativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class relativelocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdrive.chorme.driver","D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement pas=driver.findElement(By.id("password"));
	
		
		
	}

}
