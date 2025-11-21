package Day3;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
public class createuserchaining {
	
	static final String Base_url="https://gorest.co.in/public/v2/users"; 

	static final String Bearer_token="e166a5418c352dae83c158bfcd854626f6bf1275c1e00313a6b9952f880b1c2b";

	Faker faker=new Faker();
	int useridno;

	@Test
	void creatUser(ITestContext context)
	{
		JSONObject reqdata=new JSONObject();

		reqdata.put("name",faker.name().fullName());
		reqdata.put("gender","male");
		reqdata.put("email",faker.internet().emailAddress());
		reqdata.put("status","Active");
		useridno=given()
					.headers("Authorization", "Bearer "+Bearer_token )
	
					.contentType("application/json")
					.body(reqdata.toString())
				.when()
					.post(Base_url)
				.then()
					.statusCode(201)
					.log().body()
					.extract().response().jsonPath().getInt("id");

		System.out.println(useridno);
		context.setAttribute("userid",useridno);
	}


}
