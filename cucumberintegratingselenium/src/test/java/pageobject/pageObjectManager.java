package pageobject;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
	public WebDriver driver;
	public landingpage_po landingpage;
	public offerpage_po offerpage;
	public checkoutpage_po checkoutpage;
 public  pageObjectManager(WebDriver driver)
 {
	 this.driver=driver;
 }
 public landingpage_po getlandingpage()
 {
	 landingpage= new landingpage_po(driver);
	 return landingpage;
 }
 public offerpage_po getofferpage()
 {
	 offerpage= new offerpage_po(driver);
	 return offerpage;
 }
 
 public checkoutpage_po getcheckoutpage_po()
 {
	 checkoutpage= new checkoutpage_po(driver);
	 return checkoutpage;
 }
	
}
