package apitestingg;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class apiitestingggg {
	
	
	@Test
	public void createProject()
	{
		//JavaLibrary jLib = new JavaLibrary();
		
		//Step 1: create pre requisites
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "john");
		//jObj.put("projectName", "Allstates "+jLib.getRandomNumber());
		jObj.put("status", "Completed");
		jObj.put("teamSize", 20);
		
	   baseURI = "https://reqres.in/";
		//port = 8084;
		
		given()
		 .body(jObj)
		 .contentType(ContentType.JSON)
		 
		.when()
		 .post("/api/users")
		 
		.then()
		 .assertThat()
		 .statusCode(201)
		 .log().all();
}
	
	
	
	

}
