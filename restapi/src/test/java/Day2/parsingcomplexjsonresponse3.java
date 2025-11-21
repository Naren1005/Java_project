package Day2;

import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import static org.hamcrest.MatcherAssert.assertThat;

public class parsingcomplexjsonresponse3 {
	
	
	@Test
	void testResponsebody()
	{
		ResponseBody resbody=
				given()
				.when()
					.get("http://localhost:3000/employees")
				.then()
					.statusCode(200)
					.extract().response().body();
		JsonPath jsonPath=new JsonPath(resbody.asString());
		
		int empsize=jsonPath.getInt("size()");
		System.out.println("empsize is :" +empsize);
		for(int i=0;i<empsize;i++)
		{
			String fname=jsonPath.get("["+i+"].first_name");
			String lname=jsonPath.get("["+i+"].last_name");
			String email=jsonPath.get("["+i+"].email");
			String gender=jsonPath.get("["+i+"].gender");
			System.out.println("****"+fname+"  "+ lname+" "+email+" "+gender+" ");
		}
		
		boolean status=false;
		for(int i=0;i<empsize;i++)
		{
			String fname=jsonPath.get("["+i+"].first_name");
			if(fname.equals("Steve"))
			{
				status= true;
				break;
			}
		}
			
		Assert.assertEquals(status, true,"employe details are not found");
		
	
	}
	}
