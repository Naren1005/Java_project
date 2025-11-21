package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.id("name"));
				w1.sendKeys("Naren");
				Thread.sleep(3000);
	driver.switchTo().frame("frm1");
	WebElement f1dd=driver.findElement(By.id("course"));
	Select sc=new Select(f1dd);
	sc.selectByVisibleText("Java");
	driver.switchTo().defaultContent();
	w1.clear();
	Thread.sleep(3000);
	w1.sendKeys("Vindhya");
	driver.switchTo().frame("frm2");
	driver.findElement(By.id("firstName")).sendKeys("Akurathi Lalitha Varshini");
	driver.findElement(By.id("englishchbx")).click();
	driver.switchTo().defaultContent();
	
	
	
	
	}

}
