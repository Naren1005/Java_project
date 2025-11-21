package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		System.out.println(System.getProperty("user.dir"));
		File fi= new File(System.getProperty("user.dir")+"\\src\\test\\propetiesfile\\cucumber_global.properties");
		FileInputStream fis=new FileInputStream(fi);
		Properties pro=new Properties();
		pro.load(fis);
		String url=pro.getProperty("QAurl");
		if (driver == null)
		{
			System.setProperty("webdriver.chrome.driver","D:\\software_install setup\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}
}
