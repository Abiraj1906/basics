package api_testing;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import utilities.Tokenmanager;


public class get_mkp_call {

	
	@Test
	public void get_mkp() {
		
	Response response=RestAssured.given()
			.accept("application/json")
			.header("Authorization", "Bearer " + Tokenmanager.getToken())
			.when()
			.get("https://preprod2.api.sellermania.com/v4/marketplaces");
	
	ValidatableResponse result=response.then().log().all();
	
	
	List<String>inner_values=response.jsonPath().getList("features");
	
	System.out.println(inner_values);
	
	List<List<String>> feature=response.jsonPath().getList("findAll{it.marketplace=='ABEB_FR'}.features");
	System.out.println(feature);
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
