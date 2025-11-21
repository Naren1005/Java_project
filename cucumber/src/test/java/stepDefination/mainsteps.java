package stepDefination;

import java.util.List;

import io.cucumber.java.en.*;

public class mainsteps {

	@Given("user landed on loginpage")
	public void user_launched_the_browser() {
	    System.out.println("hi *-user launched the browser");
	}
	@When("user login into to application with {string} and password {string}")
	public void landing_page_is_displayed(String uname,String pass) {
		 System.out.println("hi *-"+uname+"****"+pass);
	}
	@Then("user landed on the home page")
	public void user_name_and_password_fields_are_displayed() {
		System.out.println("hi *-user home page is  displayed");
	}
	
	@Given("user is on signup page")
	public void user_is_on_signup_page() {
		System.out.println("user sign up landingpage");
	}
	@When("capture the details")
	public void capture_the_details(List<String> dataTable) {
	   System.out.println(dataTable.get(0));
	   System.out.println(dataTable.get(1));
	   System.out.println(dataTable.get(2));
	   System.out.println(dataTable.get(3));
	}
	@Then("signed up popup is displayed")
	public void signed_up_popup_is_displayed() {
	   System.out.println("user signed up successfully");
}
	
	@Given("Chrome browser is avaialbale")
	public void chrome()
	{
		System.out.println("chrome browser is available");
	}
	@When("user clicks on the chrome browser")
	public void launch_chrome()
	{
		System.out.println("chrome browser is clicked");
	}
	@Then("chrome browser is launched.")
	public void chrome_launched()
	{
		System.out.println("chrome browser is launched");
	}
		
	
}
