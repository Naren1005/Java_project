package selepractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class propertiesfile {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
	Properties pro=new Properties();
	File f=new File("D:\\Naren-java work space\\BasicSelenium\\browserfiles\\test1");
	FileInputStream fis=new FileInputStream(f);
	pro.load(fis);
	System.out.println(pro.getProperty("username"));
	driver.findElement(By.name("txtUserName")).sendKeys(pro.getProperty("username"));
	driver.findElement(By.name("txtPassword")).sendKeys(pro.getProperty("password"));
	
	
	
		
	
		
	}

}
