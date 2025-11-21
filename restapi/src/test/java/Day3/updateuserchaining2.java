package Day3;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
public class updateuserchaining2 {

	static final String Base_url="https://gorest.co.in/public/v2/users"; 

	static final String Bearer_token="e166a5418c352dae83c158bfcd854626f6bf1275c1e00313a6b9952f880b1c2b";

	Faker faker=new Faker();
	int useridno;
	
	@Test(dependsOnMethods = {"Day3.getuserchaining2.getuser"})
	void updateuser(ITestContext context)
	{
		JSONObject reqdata1=new JSONObject();

		reqdata1.put("name",faker.name().fullName());
		reqdata1.put("gender","female");
		reqdata1.put("email",faker.internet().emailAddress());
		reqdata1.put("status","Active");
		System.out.println("updateuser name"+faker.name().fullName() );
		given()
			.headers("Authorization", "Bearer "+Bearer_token )
			.contentType("application/json")
			.pathParam("id",context.getAttribute("userid"))
			.body(reqdata1.toString())
		.when()
			.put(Base_url+"/{id}")
		.then()
			.statusCode(200)
			.log().body();
	}
}
