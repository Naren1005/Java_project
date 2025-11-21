package pageobjmodel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage2pagefactory {

	//constructor
	//Locators
	//Action methods
	WebDriver driver;
	loginpage2pagefactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); //mandatory
	}

//	By username_loc=By.xpath("//input[@name='txtPassword']");
//	By password_loc=By.xpath("//input[@name='txtUserName']");
//	By login_button_loc=By.xpath("//input[@name='Submit']");
	
	@FindBy(xpath="//input[@name='txtPassword']") 
	WebElement txtpassword;
	@FindBy(xpath="//input[@name='txtUserName']") 
	WebElement txtusername;
	
	@FindBy(xpath="//input[@name='Submit']") 
	WebElement loginbutton;
	
	public void setusername(String usr)
	{
	txtusername.sendKeys(usr);
	}
	public void setpassword(String psw)
	{
		txtpassword.sendKeys(psw);
	}
	public void clicklogin()
	{
	loginbutton.click();
	}
	
}
