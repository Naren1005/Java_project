package Day2;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class parsingcomplexjsonresponse {
	
	//to read the external json file created a java method
	
	JSONObject getJsonResponse() throws FileNotFoundException
	{
		File file=new File(".\\src\\test\\resources\\complex.json");
		
		FileReader fileReader=new FileReader(file);
		
		JSONTokener jsonTokener= new JSONTokener(fileReader);
		
		JSONObject jsonObject= new JSONObject(jsonTokener);
		
		return jsonObject;
	}
	@Test (priority=1)
	void validateUSerDetails() throws FileNotFoundException
	{
		JsonPath jsonPath=new JsonPath(getJsonResponse().toString());
		
		String status=jsonPath.getString("status");
		Assert.assertEquals(status, "success");
		int id=jsonPath.getInt("data.userDetails.id");
		Assert.assertEquals(id,12345);
		String name=jsonPath.getString("data.userDetails.name");
		Assert.assertEquals(name,"John Doe");
		String email=jsonPath.getString("data.userDetails.email");
		Assert.assertEquals(email,"john.doe@example.com");
		String phhome=jsonPath.getString("data.userDetails.phoneNumbers[0].type");
		Assert.assertEquals(phhome,"home");
		
		String phwork=jsonPath.getString("data.userDetails.phoneNumbers[1].number");
		Assert.assertEquals(phwork,"987-654-3210");
		String street=jsonPath.getString("data.userDetails.address.street");
		Assert.assertEquals(street,"123 Main St");
		
		double geola=jsonPath.getDouble("data.userDetails.address.geo.latitude");
		Assert.assertEquals(geola,39.7817);
		
		String preftheme=jsonPath.getString("data.userDetails.preferences.theme");
		Assert.assertEquals(preftheme,"dark");
		String preflang=jsonPath.getString("data.userDetails.preferences.languages[2]");
		Assert.assertEquals(preflang,"French");
		
		
	}
}
