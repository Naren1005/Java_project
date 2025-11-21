package Day2;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;



import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
public class cookies {
	
	@Test
	void cookiestest()
	{
		given()
		
		.when()
			.get("https://www.google.com/")
		.then()
		//.cookie("AEC",not)
		.log().cookies();
		
	}

}
