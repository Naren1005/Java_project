package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class offerpage_po {
	WebDriver driver;
	public offerpage_po(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how=How.CSS,using="input[id='search-field']")
	WebElement offer_searchfield;

	@FindBy(how=How.XPATH,using="//tr[td[text()='Tomato']]/td[1]")
	WebElement offer_vegname;
	
	
	public void off_veg_search(String s)
	{
		offer_searchfield.sendKeys(s);
	}
	public String off_veg_name()
	{
		return offer_vegname.getText();
	}
	
}
