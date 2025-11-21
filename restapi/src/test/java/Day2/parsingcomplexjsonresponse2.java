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

public class parsingcomplexjsonresponse2 {
	
	
	@Test
	void testResponsebody()
	{
		ResponseBody resbody=
				given()
				.when()
					.get("http://localhost:3000/store")
				.then()
					.statusCode(200)
					.extract().response().body();
		JsonPath jsonPath=new JsonPath(resbody.asString());
		
		int bookcount=jsonPath.getInt("book.size()");
		System.out.println("total no of books count is :" +bookcount);
		for(int i=0;i<bookcount;i++)
		{
			String title=jsonPath.get("book["+i+"].title");
			System.out.println("the titles are:"+title);
		}
		
		boolean status=false;
		for(int i=0;i<bookcount;i++)
		{
			String tname=jsonPath.get("book["+i+"].title");
			if(tname.equals("Sword of Hoour"))
			{
				status= true;
				break;
			}
		}
			
		Assert.assertEquals(status, true,"book details are not found");
		
	
	}
	}
