package selepractice;

import org.openqa.selenium.By;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class linksverifcation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"https://www.sugarcrm.com/au/request-demo/?utm_medium=organic&utm_source=google.com&utm_source=google.com&utm_medium=organic");
		Thread.sleep(1500);
		List<WebElement> alllinkslist = driver.findElements(By.tagName("a"));

		System.out.println("the total no of links are :" + alllinkslist.size());
//		for (int i = 0; i < alllinkslist.size(); i++) {
//			System.out.println(i + ">>>>" + "link details are :" + alllinkslist.get(i).getText());
//			System.out.println(i + ">>>>" + "link details are :" + alllinkslist.get(i).getAttribute("href"));
//		}

		for (WebElement webElement : alllinkslist) {
			System.out.println(webElement.getAttribute("href"));
			System.out.println(webElement.getText());
			
		}
	}

}
