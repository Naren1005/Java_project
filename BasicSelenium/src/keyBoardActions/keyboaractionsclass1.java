package keyBoardActions;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboaractionsclass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.manage().window().maximize();

		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		Thread.sleep(2000);
		Actions l= new Actions(driver);
		//l.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		Thread.sleep(2000);
		l.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);
		l.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
//		
//		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
//		driver.findElement(By.name("Submit")).click();
//
//		Thread.sleep(3000);
//		WebElement w=	driver.findElement(By.linkText("Change Password"));
//
//		Actions l= new Actions(driver);
//		l.doubleClick(w).perform();
//
		//l.moveToElement(w).perform(); // mouse over
		//l.contextClick(w).perform(); // right click




	}

}
