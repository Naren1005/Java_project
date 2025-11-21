package Day2;

import org.testng.annotations.Test;
import com.github.javafaker.Faker;
public class fakerTestdatagenerator {
	@Test
	void fakedata()
	{
		Faker faker=new Faker();
		String fullname=faker.name().fullName();
		String fname=faker.name().firstName();
		String lname=faker.name().lastName();
		String email=faker.internet().emailAddress();
		String pno=faker.phoneNumber().cellPhone();
		String landno=faker.phoneNumber().extension();
		
		String add=faker.address().cityName();
		
		System.out.println(fullname);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(pno);
		System.out.println(landno);
		System.out.println(add);
		
		
		
	}

}
