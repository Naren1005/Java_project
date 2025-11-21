package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class checkoutpage_po {
	WebDriver driver;
	public checkoutpage_po(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(how=How.CSS,using="img[alt='Cart']")
	WebElement cart;
	@FindBy(how=How.XPATH,using="//button[text()='PROCEED TO CHECKOUT']")
	WebElement checkout;
	@FindBy(how=How.CSS,using=".promoBtn")
	WebElement promoapply;
	@FindBy(how=How.XPATH,using="//button[text()='Place Order']")  
	WebElement placeorder;
	
	public void CheckoutItems()
	{
	  cart.click();
	  checkout.click();
	}
	
	public boolean verifypromo_button()
	{
		
	return promoapply.isDisplayed();
	}
	public boolean Verifyplace_order()
	{
		return placeorder.isDisplayed();
	}

}
