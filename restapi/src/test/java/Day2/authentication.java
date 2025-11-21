package Day2;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.testng.annotations.Test;
public class authentication {
	// Basic auth
	//@Test
	void basicauth() {
		
	
	given()
		.auth().basic("postman","password")
	.when()
		.get("https://postman-echo.com/basic-auth")
	
	.then()
		.statusCode(200)
		//.body("authenticated",equalTo(true))
		
		.log().body();
	;
	}
	
	// preemptive auth
	//@Test
	void premetiveauth() {
		
		
		given()
			.auth().preemptive().basic("postman","password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		
		.then()
			.statusCode(200)
			//.body("authenticated",equalTo(true))
			
			.log().body();
		;
		}
	
	// Digest auth
		//@Test
		void digestauth() {
			
			
			given()
				.auth().digest("postman","password")
			.when()
				.get("https://postman-echo.com/basic-auth")
			
			.then()
				.statusCode(200)
				//.body("authenticated",equalTo(true))
				
				.log().body();
			;
			}
		
		//Bearer Token 
		//@Test
		void bearerauth() {
			
			given()
			.header("Authorization","Bearer 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")
			
			.when()
				.get("https://api.github.com/user/repos")
			.then()
				.statusCode(200);
		
		}
		
		//API key Auth
		@Test
		void apikeyauth()
		{
			
			given()
				.queryParam("q", "Hyderabad")
				.queryParam("appid", "fe9c5cddb7e01d747b4611c3fc9eaf2c")
				
			.when()
				.get("https://api.openweathermap.org/data/2.5/weather")
			.then()
				.statusCode(200)
				.log().body();
		}
}
