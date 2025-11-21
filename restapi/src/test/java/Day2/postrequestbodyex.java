package Day2;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class postrequestbodyex {
	String studentid;
	//@Test
	public void createstudentusinghashmap()
	{
		HashMap<String,Object> requestbody=new HashMap<>();
		 requestbody.put("name", "Lalitha");
		 requestbody.put("location", "guntur");
		 requestbody.put("phone", "1234567");
		 String courses[]= {"c","c++"};
		 requestbody.put("courses", courses);
		studentid= given()
		  .contentType("application/json")
		 .body(requestbody)
		 .when()
		 .post("http://localhost:3000/students")
		 
		 .then()
		 .statusCode(201)
		 .body("name",equalTo("Lalitha"))
		 .body("location", equalTo("guntur"))
		 .body("phone",equalTo("1234567"))
		 .body("courses[0]",equalTo("c"))
		 .body("courses[1]",equalTo("c++"))
		 .body("phone", equalTo("1234567"))
		 .header("Content-Type","application/json")
		 .log().body()
		 .extract().jsonPath().getString("id");
		 
	}
	// create request body using org.json library 
	//@Test
	public void createstudentusingJsonLibrary()
	{
		JSONObject requestbody=new JSONObject();
		 requestbody.put("name", "Lalitha");
		 requestbody.put("location", "guntur");
		 requestbody.put("phone", "12345674");
		 String courses[]= {"c","c++"};
		 requestbody.put("courses", courses);
		 
		studentid= 
		given()
				.contentType("application/json")
				.body(requestbody.toString())
		.when()
				.post("http://localhost:3000/students")
		 
		.then()
		 		.statusCode(201)
		 		.body("name",equalTo("Lalitha"))
		 		.body("location", equalTo("guntur"))
		 		.body("phone",equalTo("1234567"))
		 		.body(	"courses[0]",equalTo("c"))
		 		.body("courses[1]",equalTo("c++"))
		 		.header("Content-Type","application/json")
		 		.log().body()
		 		.extract().jsonPath().getString("id");
		 
	}
	
	// create request body using pojo(plain old java object) class 
	//@Test
	public void createstudentusingPOJO()
	{
		studentpojo requestbody=new studentpojo();
		 requestbody.setName("Lalitha");
		 requestbody.setLocation("guntur");
		 requestbody.setPhone("12345674");
		 String courses[]= {"c","c++"};
		 requestbody.setCourses(courses);
		 
		studentid= 
		given()
				.contentType("application/json")
				.body(requestbody)
		.when()
				.post("http://localhost:3000/students")
		 
		.then()
		 		.statusCode(201)
		 		.body("name",equalTo(requestbody.getName()))
		 		.body("location", equalTo(requestbody.getLocation()))
		 		.body("phone",equalTo(requestbody.getPhone()))
		 		.body(	"courses[0]",equalTo(requestbody.getCourses()[0]))
		 		.body("courses[1]",equalTo(requestbody.getCourses()[1]))
		 		.header("Content-Type","application/json")
		 		.log().body()
		 		.extract().jsonPath().getString("id");
		 
	}
	
	// create request body using external file
		@Test
		public void createstudentusingExtfile() throws FileNotFoundException
		{
			File myfile=new File(".\\src\\test\\java\\Day2\\studentjdata");
			FileReader fileReader=new FileReader(myfile);
			JSONTokener jsontoken=new JSONTokener(fileReader);
			
			JSONObject requestbody=new JSONObject(jsontoken);
			
			 
			 
			studentid= 
			given()
					.contentType("application/json")
					.body(requestbody.toString())
					
			.when()
					.post("http://localhost:3000/students")
			 
			.then()
			 		.statusCode(201)
			 		.body("name",equalTo("Lalitha"))
			 		.body("location", equalTo("guntur"))
			 		.body("phone",equalTo("9949924187"))
			 		.body(	"courses[0]",equalTo("c"))
			 		.body("courses[1]",equalTo("c++"))
			 		.header("Content-Type","application/json")
			 		.log().body()
			 		.extract().jsonPath().getString("id");
			 
		}
	@AfterMethod 
//@Test
		public void deleterec()
	{
		given()
		.when()
		.delete("http://localhost:3000/students/"+studentid)
		//.delete("http://localhost:3000/students/b3a9")
		.then()
		//.body(emptyOrNullString())
	.time(lessThan(2000L))
	.log().all();
	}

}
