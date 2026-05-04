package api_testing;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import utilities.Tokenmanager;

import java.util.HashMap;

import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


public class authenticate {
	

	

	@Test
	public  void authenticate_call() {
	
	HashMap<String, String>map=new HashMap<String, String>();
	map.put("appId", "b0248d6e7a");
	map.put("username", "commercial@sellermania.com");
	
      ValidatableResponse response= RestAssured.given()
            
			.header("Content-Type","application/json")
			.header("accept","application/json")
			.header("X-signature","a0ddffc917709c78ac4c91c8c284a6cd96dedbf3adc2b29c09c3598a239e40b9")
			.body(map)
			.when()
			.post("https://preprod2.api.sellermania.com/v4/authenticate")
			.then()
			.log().all()
			.statusCode(200);
      
		String token=response.extract().jsonPath().getString("accessToken");      
		//System.out.println(token);	
		
		Tokenmanager.setToken(token);
		
		System.out.println("Token       "+Tokenmanager.getToken());
		
		
		
	}


	
	
	
	
	
	
	
	
}

