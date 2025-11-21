package pageobjmodel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	//constructor
	//Locators
	//Action methods
	WebDriver driver;
	loginpage(WebDriver driver)
	{
		this.driver=driver;
	}

	By username_loc=By.xpath("//input[@name='txtPassword']");
	By password_loc=By.xpath("//input[@name='txtUserName']");
	By login_button_loc=By.xpath("//input[@name='Submit']");
	
	public void setusername(String usr)
	{
		driver.findElement(username_loc).sendKeys(usr);
	}
	public void setpassword(String psw)
	{
		driver.findElement(password_loc).sendKeys(psw);
	}
	public void clicklogin()
	{
		driver.findElement(login_button_loc).click();
	}
	
}
