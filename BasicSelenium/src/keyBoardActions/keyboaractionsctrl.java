package keyBoardActions;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboaractionsctrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

//		driver.findElement(By.id("APjFqb")).sendKeys("guntur pin code");
		Thread.sleep(2000);
//		
		Actions l= new Actions(driver);
//		
//		l.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//		l.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		l.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).perform();
		
		//driver.findElement(By.partialLinkText("Ad")).click();
		
		driver.switchTo().activeElement();
//		
		driver.findElement(By.xpath("//div[@class='niO4u VDgVie SlP8xc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("guntur pin code");
//
//		l.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		


	}

}
