package testcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import utilities.Tokenmanager;

public class post_method {

	
	
	@Test
	public void post_call() {
		
		HashMap<String, Object>map=new HashMap<String, Object>();
		
		List<String>list=new ArrayList<String>();
		
		list.add("skuone");
		
		map.put("skus", list);
		
		
		
		
		Response response=RestAssured.given()
				.accept("application/json")
				.contentType("application/json")
				.header("Authorization","Bearer "+ Tokenmanager.getToken())
				.body(map)
				.when()
				.post("https://preprod2.api.sellermania.com/v4/offers/quantities");
		
		
	 ValidatableResponse post_result=response.then().log().all().statusCode(200);
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
