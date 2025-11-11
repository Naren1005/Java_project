package Day1;

import org.testng.annotations.Test;

import io.restassured.http.Header;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class httpmethods {
	int userid;
	@Test(priority = 1,enabled = true)
	public void getusers()
	{
		given()
		 .header("x-api-key","reqres-free-v1")
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.body(containsString("email"))
		.body(containsString("id"))
		
		.log().all();
	}
	@Test(priority = 2)
	public void createuser()
	{
		HashMap<String,String> data=new HashMap<String, String>();
		data.put("name","naren");
		data.put("job","lead");
		userid=given()
		 	.header("x-api-key","reqres-free-v1")
		 	.contentType("application/json")
		 	.body(data)
		 
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201)
			.body("name",equalTo("naren"))
			.body("job",equalTo("lead"))
			.body(containsString("id"))
			.log().all()
			.extract().jsonPath().getInt("id");
	}
	
	//updating the user
	
	@Test(priority = 3,dependsOnMethods = {"createuser"})
	public void updateuser()
	{
		HashMap<String,String> data=new HashMap<String, String>();
		data.put("name","venkata narendra");
		data.put("job","Test lead");
		given()
		 	.header("x-api-key","reqres-free-v1")
		 	.contentType("application/json")
		 	.body(data)
		 
		.when()
			.put("https://reqres.in/api/users/"+userid)
		.then()
			.statusCode(200)
			.body("name",equalTo("venkata narendra"))
			.body("job",equalTo("Test lead"))
			
			.log().all();
	}
	@Test(priority = 4,dependsOnMethods = {"createuser"})
	public void deleteteuser()
	{
		
		given()
		 	.header("x-api-key","reqres-free-v1")
		 	.contentType("application/json")
		 	
		 
		.when()
			.delete("https://reqres.in/api/users/"+userid)
		.then()
			.statusCode(204)
			.time(lessThan(2000L))
			.body(emptyOrNullString())
			.log().all();
	}
}
