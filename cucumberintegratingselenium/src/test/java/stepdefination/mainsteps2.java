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

public class mainsteps2 {
	WebDriver driver;
	String ovegname;
	String pvegname;
	TestContextSetup testContextSetup;
	pageObjectManager pageobjectManager;

	public mainsteps2(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	@Then("^ search in top deals with the shortname(.+)$")
	public void search_restuls_are_displayed(String shortname1) {
		
		
		//offerpage_po op=new offerpage_po(testContextSetup.driver);
//		pageobjectManager=new pageObjectManager(testContextSetup.driver);
//		offerpage_po op= pageobjectManager.getofferpage();
		offerpage_po op=testContextSetup.pageobjectManager.getofferpage();
		
		window_switch();
		op.off_veg_search(shortname1);
		ovegname=op.off_veg_name();
		
		System.out.println("offer page vegname is :"+ ovegname);
		/*String oprice=productrow.findElement(By.xpath("./td[2]")).getText();
		String odisc=productrow.findElement(By.xpath("./td[3]")).getText();
		//String oprice=driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[text()='Tomato']/td[2]")).getText();
		System.out.println("offerpriceis:"+oprice);
		//String odisc=driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[text()='Tomato']/td[3]")).getText();
		System.out.println("discount is :" +odisc);*/
	}
	public void window_switch()
	{
//		landingpage_po lp=new landingpage_po(testContextSetup.driver);
//		lp.topdeals();
		/*Set<String> ow=testContextSetup.driver.getWindowHandles();
		Iterator<String> i1= ow.iterator();
		String parentwin=i1.next();
		String childwin=i1.next();
		testContextSetup.driver.switchTo().window(childwin);*/
		testContextSetup.genericUtils.SwithcwindowToChild();
	}
	@And("validte the name from product and offer page")
	public void product_validation()
	{
		System.out.println("product name:"+testContextSetup.pvegname);
		System.out.println("offerpage name"+ovegname);
		Assert.assertEquals(testContextSetup.pvegname,ovegname);
	}

}
