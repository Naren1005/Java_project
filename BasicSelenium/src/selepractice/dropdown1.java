package selepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(
				"https://www.sugarcrm.com/au/request-demo/?utm_medium=organic&utm_source=google.com&utm_source=google.com&utm_medium=organic");

		WebElement empcountddown = driver.findElement(By.name("input_8"));

		Select s = new Select(empcountddown);
		Thread.sleep(2000);
		WebElement firtoptio = s.getFirstSelectedOption();
		System.out.println("first selected option in the list is : " + firtoptio.getText());
		s.selectByIndex(5);
		Thread.sleep(2000);
		s.selectByValue("level9");
		Thread.sleep(2000);
		s.selectByVisibleText("1,001 - 2,500 employees");
		List<WebElement> emprange = s.getOptions();

		System.out.println("total count rows is :" + emprange.size());

		for (int i = 0; i < emprange.size(); i++) {
			System.out.println("the values present in the company size drop down are as below:");
			System.out.println(emprange.get(i).getText());
		}
		System.out.println("**************************");
		WebElement country=driver.findElement(By.name("input_84"));
		Select s1=new Select(country);
		List<WebElement> con=s1.getOptions();
		System.out.println("the total no of conutries are:"  + con.size());
		
		for (int i = 0; i < con.size(); i++) {
			System.out.println(con.get(i).getText());
		}

		// driver.quit();
	}

}
