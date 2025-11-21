package Day2;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class perametersdemo {
	//@Test
	public void pathparam() {
		
		given()
			.pathParam("country","South Africa") //path parameter
		.when()
			.get("https://restcountries.com/v2/name/{country}")
		.then()
		.statusCode(200)
		.log().body();
	}
	
	@Test(priority = 1,enabled = true)
	public void queryparam()
	{
		given()
		 	.header("x-api-key","reqres-free-v1")
		 	.queryParam("page",2)
		 	.queryParam("id", 7)
		
		.when()
			.get("https://reqres.in/api/users")
				
		.then()
			.statusCode(200)
			//.body("page",equalTo(2))
			.body(containsString("email"))
			.body(containsString("id"))
			.log().body();
	}

}
