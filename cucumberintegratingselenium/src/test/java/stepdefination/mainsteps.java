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
import pageobject.landingpage_po;
import pageobject.offerpage_po;
import pageobject.pageObjectManager;
import utils.TestContextSetup;

public class mainsteps {
	WebDriver driver;
	String ovegname;
	String pvegname;
	TestContextSetup testContextSetup;
	pageObjectManager pageobjectManager;
	landingpage_po landingpage;

	public mainsteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.landingpage=testContextSetup.pageobjectManager.getlandingpage();
	}

	@Given("user is on the green cart landing page")
	public void user_is_on_the_green_cart_landing_page() {
		System.out.println(landingpage.getpagetitle());
		Assert.assertTrue(landingpage.getpagetitle().contains("GreenKart"));
	

	}
	@When("user searched with the short name {string} and extracted the full name")
	public void user_searched_with_the_short_name(String shortname) throws InterruptedException {
		System.out.println("shortname is:"+shortname);
		//landingpage_po lp=new landingpage_po(testContextSetup.driver);
		//pageObjectManager pom=new pageObjectManager(testContextSetup.driver);
		//landingpage_po lp= pom.getlandingpage();
		
		
		landingpage.Veg_shortname(shortname);
		Thread.sleep(2000);
		testContextSetup.pvegname=landingpage.Veg_desc_aftersearch().split("-")[0].trim();
		System.out.println("product page :"+testContextSetup.pvegname);
		Thread.sleep(2000);
		//landingpage.topdeals();
		//driver.findElement(By.className("increment")).click();
		//WebElement addcart= driver.findElement(By.xpath("//button[text()='ADD TO CART']"));

		//addcart.click();
	}
	@When("add the no of quantity as {string} and add to cart")
	public void add_noof_quantity(String quantity)
	{
	
	
		landingpage.add_quantity(Integer.parseInt(quantity));
		landingpage.add_cart();
	
	}

}
