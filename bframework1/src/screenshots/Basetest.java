package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basetest {
	public static WebDriver driver;
	public static String screenshotfoldername;
	@BeforeTest
	public void browswer() {
		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}

	public void screenshot(String fname) throws Exception
	{
		if(screenshotfoldername == null)
		{
			LocalDateTime myDateObj = LocalDateTime.now();
			System.out.println("localdatetime"+myDateObj);
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyy-HH mm ss");
			screenshotfoldername = myDateObj.format(myFormatObj);
			System.out.println("foldername"  +screenshotfoldername);
		}
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sor=ts.getScreenshotAs(OutputType.FILE);
		System.out.println("666"+screenshotfoldername);
		File tr=new File("./screenshot/"+screenshotfoldername+"/"+fname);
		FileUtils.copyFile(sor, tr);

	}

}
