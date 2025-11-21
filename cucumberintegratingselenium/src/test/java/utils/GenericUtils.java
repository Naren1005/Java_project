package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	public void SwithcwindowToChild()
	{
		Set<String> ow=driver.getWindowHandles();
		Iterator<String> i1= ow.iterator();
		String parentwin=i1.next();
		String childwin=i1.next();
		driver.switchTo().window(childwin);
	}

}
