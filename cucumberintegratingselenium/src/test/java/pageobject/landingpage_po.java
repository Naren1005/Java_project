package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class landingpage_po {
	WebDriver driver;
	public landingpage_po(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//input[@class='search-keyword']")
	WebElement searchkey;
	@FindBy(how=How.CSS,using="h4.product-name")
	WebElement pname;
	@FindBy(how=How.LINK_TEXT,using="Top Deals")
	WebElement tdeals;
	
	@FindBy(how=How.CSS,using="a.increment")
	WebElement incriment;
	@FindBy(how=How.XPATH,using="//div[@class='product-action']/button")
	WebElement addtocart;
	
	public void Veg_shortname(String pshortname)
	{
	  searchkey.sendKeys(pshortname);
	}
	public  String Veg_desc_aftersearch()
	{
	 return pname.getText();
	  
	}
	public void topdeals()
	{
		tdeals.click();
	}
	public String getpagetitle()
	{
		return driver.getTitle();
	}
	
	public void add_quantity(int quantity)
	{
		int i =quantity-1;
		while(i>0)
		{
			incriment.click();
			i--;
		}
	}
	public void add_cart()
	{
		addtocart.click();
	}

}
