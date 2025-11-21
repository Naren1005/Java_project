package Day2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.json.JSONObject;

import  com.github.javafaker.Faker;

import io.restassured.http.Headers;

public class chainingwithfaker {

	static final String Base_url="https://gorest.co.in/public/v2/users"; 

	static final String Bearer_token="e166a5418c352dae83c158bfcd854626f6bf1275c1e00313a6b9952f880b1c2b";

	Faker faker=new Faker();
	int useridno;

	@Test
	void creatUser()
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
	}

	@Test(dependsOnMethods = {"creatUser"})
	void getuser()
	{
		given()
			.headers("Authorization", "Bearer "+Bearer_token )
			.pathParam("id",useridno)
		.when()
			.get(Base_url+"/{id}")
		.then()
			.statusCode(200)
			.log().body();
	}

	@Test(dependsOnMethods = {"getuser"})
	void updateuser()
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
			.pathParam("id",useridno)
			.body(reqdata1.toString())
		.when()
			.put(Base_url+"/{id}")
		.then()
			.statusCode(200)
			.log().body();
	}
	
	@Test(dependsOnMethods = {"updateuser"})
	void deleteuser()
	{
		given()
			.headers("Authorization", "Bearer "+Bearer_token )
			.pathParam("id",useridno)
			
		.when()
			.delete(Base_url+"/{id}")
		.then()
			.statusCode(204);
			
	}
}
