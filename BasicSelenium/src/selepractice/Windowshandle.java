package selepractice;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowshandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.absa.co.za/personal/");
		Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Corporate']")).click();
	
	Set<String> ws=driver.getWindowHandles();
	System.out.println(ws);
	java.util.Iterator<String> it=ws.iterator();
	String parentwh=it.next();
		System.out.println("parent wh:"+parentwh);
	String childwh=it.next();
	
	System.out.println("child wh:"+childwh);
	Thread.sleep(4000);
//	driver.switchTo().window(parentwh);
//	driver.switchTo().window(childwh);
	driver.findElement(By.xpath("//span[text()='Insights and Events']")).click();
	driver.switchTo().window(parentwh);
	System.out.println(driver.getTitle());
		
	
		
	}

}
