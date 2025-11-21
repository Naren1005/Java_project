package selepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multiselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		Thread.sleep(3000);
		WebElement sele=driver.findElement(By.xpath("//select[@id='course']"));
		Select s1=new Select(sele);
		s1.selectByIndex(1);
		
		WebElement empcountddown=driver.findElement(By.xpath("//select[@id='ide']"));
				
		System.out.println(empcountddown.getTagName());
		Select s=new Select(empcountddown);
		Thread.sleep(2000);
		//WebElement firtoptio=s.getFirstSelectedOption();
		//System.out.println("first selected option in the list is : "+firtoptio.getText());
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("nb");
		Thread.sleep(2000);
		s.selectByVisibleText("IntelliJ IDEA");
		
		List <WebElement> lwb=s.getAllSelectedOptions();
		s.deselectAll();
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("nb");
		Thread.sleep(2000);
		s.selectByVisibleText("IntelliJ IDEA");
		s.deselectByIndex(1);
		//driver.quit();
	}

}
