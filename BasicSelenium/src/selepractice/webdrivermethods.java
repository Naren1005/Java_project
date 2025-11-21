package selepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdrivermethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");

				
		driver.navigate().to("https://www.saucedemo.com/");
		String ptitle1=driver.getTitle();
		System.out.println("the navigated page title is : " + ptitle1);
		
		driver.findElement(By.cssSelector("input[class^='input_error'][placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		System.out.println(driver.findElement(By.xpath("//input[@id='password']")).getSize());
		
		System.out.println("attribute : "+driver.findElement(By.xpath("//input[@id='password']")).getAttribute("class"));
		System.out.println("is displayed : "+driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
		System.out.println("is enabled : "+driver.findElement(By.xpath("//input[@type='submit']")).isEnabled());
		System.out.println("is selected : "+driver.findElement(By.xpath("//input[@type='submit']")).isSelected());
		System.out.println("Visible text : "+driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText());
		
		//driver.quit();
	}

}
