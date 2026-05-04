package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utilities.Tokenmanager;

public class get_method {

	
@Test(dependsOnMethods = "authenticate_call")
public void get_call() {
	
	Response response=RestAssured.given()
			.accept("application/json")
	        .header("Authorization","Bearer "+ Tokenmanager.getToken())
	        .when()
	        .get("https://preprod2.api.sellermania.com/v4/offers/skuone");
	
ValidatableResponse get_value=response.then().log().all().statusCode(200);
String get_sku=response.jsonPath().getString("sku");
System.out.println(get_sku);
   Assert.assertNotNull(get_value, "should null");              
	        
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
