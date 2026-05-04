package api_testing;

import java.util.Map;

import org.testng.Assert;
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

		Response response = RestAssured.given().accept("application/json")
				.header("Authorization", "Bearer " + Tokenmanager.getToken()).when()
				.get("https://preprod2.api.sellermania.com/v4/offers/skuone");

		String total = response.getBody().asString();
		System.out.println(total);
		ValidatableResponse get_value = response.then().log().all();

		String get_sku = response.jsonPath().getString("sku");
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertNotNull(get_sku,"sku should not be null");

		int quantity = response.jsonPath().getInt("quantity");
		Assert.assertEquals(quantity, 5);
		
		Map<String, Object> inner_details=response.jsonPath().getMap("specific");
		
		System.out.println(inner_details);
		for(String value:inner_details.keySet()) {
			System.out.println(value);
			
			
		}
		
		for(Object value1:inner_details.values()) {
			System.out.println(value1);			
		}
 
		
		
		
		
	}

}
