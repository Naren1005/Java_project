package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before("@Netbanking")
	public void netbankingsetup()
	{
		System.out.println("************");
		System.out.println("using net banking credentials");
	}
	@Before("@Mortagae")
	public void mortagagesetup()
	{
		System.out.println("************");
		System.out.println("using net mortagage credentials");
	}

@After
public void logout() {
	System.out.println("user is logged out of the application");
	System.out.println("************");
}
}
