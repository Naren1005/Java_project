package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobject.pageObjectManager;


//this is called as dependency injection
public class TestContextSetup {
	public WebDriver driver;
	public String pvegname;
	public pageObjectManager pageobjectManager;
	public TestBase testbase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException
	{
		testbase=new TestBase();
		pageobjectManager=new pageObjectManager(testbase.WebDriverManager());
		
		genericUtils=new GenericUtils(testbase.WebDriverManager());
	
	}

}
