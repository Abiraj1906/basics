package HTTPrequest;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import io.restassured.RestAssured;

public class GetAuth_Orders {

	
	
	@Test
	public void post_authentication() {
		Map<String, String>map=new HashMap<String, String>();
		map.put("appId", "b0248d6e7a");
		map.put("username", "commercial@sellermania.com");
		
		//System.out.println(map);
		
		RestAssured.given()
		.header("accept","application/json")
		.contentType("application/json")
		.body(map)
        .headers("X-signature","a0ddffc917709c78ac4c91c8c284a6cd96dedbf3adc2b29c09c3598a239e40b9")		
        
        .when()
        .post("https://preprod2.api.sellermania.com/v4/authenticate")
		
		.then()
		.log().all()
		.statusCode(200);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
