package HTTPrequest;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class POST {

	//@Test(priority=1)
	public void posthttpcall() {
		HashMap<String, Object> datas=new HashMap();
		datas.put("year", 2019);
		datas.put("price", 1849.99);
		datas.put("CPU model", "Intel Core i9");
		datas.put("Hard disk size", "1 TB");
		
		HashMap<String, Object> body=new HashMap();
		body.put("name", "Apple MacBook Pro 16");
		body.put("data", datas);
		
		
		
		given()
		   .contentType("application/json")
		    .body(body)
		  
		.when()
		.post("https://api.restful-api.dev/objects")
		
		.then()
		.statusCode(200)
		.log().all();	
		
	}

	@Test(priority=2)
	public void orgjson() {
		
		JSONObject requestbody=new JSONObject();
		requestbody.put("year", 2019);
		requestbody.put("price", 1849.99);
		requestbody.put("CPU model", "Intel Core i9");
		requestbody.put("Hard disk size", "1 TB");
		
		HashMap<String, Object> body=new HashMap();
		
		body.put("name", "Apple MacBook Pro 16");
		body.put("data", requestbody);
		
		given()
		.contentType("application/json")
		.body(body)
		.when()
		.post("https://api.restful-api.dev/objects")
		.then()
		.statusCode(200)
		
		.log().all();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
