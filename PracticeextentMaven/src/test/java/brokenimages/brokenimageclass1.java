package brokenimages;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenimageclass1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/#google_vignette");
		driver.manage().window().maximize();
		List<WebElement> brokenimages=driver.findElements(By.tagName("img"));
		System.out.println("the total noof images are: "+brokenimages.size());
		
		for (WebElement image : brokenimages) {
			String brokenurl=image.getAttribute("src");
		URL url=new URL(brokenurl);
	URLConnection urlconnection= url.openConnection();
	HttpURLConnection httpurlcon=(HttpURLConnection) urlconnection;
	httpurlcon.setConnectTimeout(2000);
	httpurlcon.connect();
	if(httpurlcon.getResponseCode()==200)
	{
		System.out.println(brokenurl+"-"+httpurlcon.getResponseMessage());
	}
	else {
		System.err.println(brokenurl+"-"+httpurlcon.getResponseMessage());
	}
		httpurlcon.disconnect();	
		}
		driver.quit();		
	}

}
