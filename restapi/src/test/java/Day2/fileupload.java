package Day2;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.io.File;

import org.testng.annotations.Test;

public class fileupload {
	@Test
	void singlefileupload()
	{
		File ufile=new File(".\\src\\test\\java\\Day2\\up2.txt");
		
		given()
			.multiPart("file",ufile)
			.contentType("multipart/form-data")
	
		.when()
			.post("https://the-internet.herokuapp.com/upload")
		
		.then()
			.statusCode(200)
			//.body(", null)
			.log().body()
		
		;
		
	}
	
	//@Test
	void downloadfile()
	{
				
		given()
			
		.when()
			.post("https://the-internet.herokuapp.com/download/up2.txt")
		
		.then()
			//.statusCode(200)
			//.body(", null)
			//.log().body()
		
		;
		
	}

}
