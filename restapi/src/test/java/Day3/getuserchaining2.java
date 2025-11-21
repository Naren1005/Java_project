package Day3;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
public class getuserchaining2 {
	static final String Base_url="https://gorest.co.in/public/v2/users"; 

	static final String Bearer_token="e166a5418c352dae83c158bfcd854626f6bf1275c1e00313a6b9952f880b1c2b";

	Faker faker=new Faker();
	int useridno;
	@Test(dependsOnMethods = {"Day3.createuserchaining.creatUser"})
	void getuser(ITestContext context)
	{
		given()
			.headers("Authorization", "Bearer "+Bearer_token )
			.pathParam("id",context.getAttribute("userid"))
		.when()
			.get(Base_url+"/{id}")
		.then()
			.statusCode(200)
			.log().body();
	}


}
