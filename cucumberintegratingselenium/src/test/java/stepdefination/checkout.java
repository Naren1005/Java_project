package stepdefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageobject.checkoutpage_po;
import pageobject.landingpage_po;
import pageobject.offerpage_po;
import pageobject.pageObjectManager;
import utils.TestContextSetup;

public class checkout {
	WebDriver driver;
	String ovegname;
	String pvegname;
	TestContextSetup testContextSetup;
	pageObjectManager pageobjectManager;
	checkoutpage_po Checkoutpage;

	public checkout(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.Checkoutpage=testContextSetup.pageobjectManager.getcheckoutpage_po();
	}

	@Then("verify user is able to enter the promo code and place the order")
	public void user_has_ability_toenterpromo_placeorder() throws InterruptedException
	{
		Thread.sleep(5000);
		Assert.assertTrue(Checkoutpage.verifypromo_button());
		Assert.assertTrue(Checkoutpage.Verifyplace_order());
		
	}
	@Then("user proceeds to checkout and validate the {string} item on the checkout page")
	public void proceed_Checkout(String name)
	{
		Checkoutpage.CheckoutItems();
		
	}
	
}
