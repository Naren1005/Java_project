package brokenLinks;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinktest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/#google_vignette");
		driver.manage().window().maximize();

		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("totoal no of links are:" +links.size());
		Set<String> brokenlinks=new HashSet<String>();

		for (WebElement link : links) {
			String linkurl=link.getAttribute("href");
			URL url= new URL(linkurl);
			//URL url=new URL(linkurl); //url class to connect to the server
			URLConnection urlconnection=url.openConnection(); // opening the connection to the server
			HttpURLConnection httpurlconnection= (HttpURLConnection) urlconnection; //HttpURLConnection -is an abstract class creating an object to pass the http request.
			httpurlconnection.setConnectTimeout(5000);
			httpurlconnection.connect();

						if(httpurlconnection.getResponseCode()==200)
						{
							System.out.println(linkurl+"-"+httpurlconnection.getResponseCode()+"-"+httpurlconnection.getResponseMessage());
						}
						else {
							System.err.println(linkurl+"-"+httpurlconnection.getResponseCode());
						}

//			if(httpurlconnection.getResponseCode()!=200)
//			{
//				brokenlinks.add(linkurl);
//			}
			httpurlconnection.disconnect();
		}

		//		for (String brokenlinkurl : brokenlinks) {
		//			System.err.println(brokenlinkurl);

	//}
	driver.quit();

}

}
