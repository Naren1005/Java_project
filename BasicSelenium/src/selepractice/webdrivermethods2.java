package selepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdrivermethods2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");

		String curl=driver.getCurrentUrl();
		System.out.println("the page current url is : " +curl);
		//String psource=driver.getPageSource();
		//System.out.println("the page source is : " +psource);
		String ptitle=driver.getTitle();
		System.out.println("the page title is : " + ptitle);
		
		driver.navigate().to("https://www.saucedemo.com/");
		String ptitle1=driver.getTitle();
		System.out.println("the navigated page title is : " + ptitle1);
		
		driver.findElement(By.cssSelector("input[class^='input_error'][placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String wh=driver.getWindowHandle();
		System.out.println("window handle for sauce demo : " + wh);
		
		List<WebElement> we=driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println("the total no of elements are :"+we.size());
		
		for(int i=0;i<we.size();i++)
		{
			System.out.println("the no of webelements present on the page are  :"+we.get(i).getText());
		}
		
		
		
		//driver.quit();
	}

}
