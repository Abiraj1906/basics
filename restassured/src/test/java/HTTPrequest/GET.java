package HTTPrequest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;


public class GET {

	@Test
	
	public void get_order_byId() {
		
	File schemafile=new File("./Get_order json schema.json");	
		
	given()
	.header("accept","application/json")
	.body(schemafile)
	.header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJFZERTQSJ9.eyJzdWIiOiJjb21tZXJjaWFsQHNlbGxlcm1hbmlhLmNvbSIsImlhdCI6MTc2NjU3MjgxMywiZXhwIjoxNzY2NTc2NDEzLCJzY29wZSI6WyJTQ09QRV9BTEwiXSwiY29udGV4dCI6eyJhcHBJZCI6ImIwMjQ4ZDZlN2EifX0.Fap10ebPK6yvRLHriuP0Kl168AXXLS-8FF4fJnXXMWJ-5epR0zBb_0MCIGs73jLUXCUFOOabUmbvZ_0mChM9Dg")
	
	.when()
	 .get("https://.api.sellermania.com/v4/orders/AZ_FR/407-7649075-5214705") 
	
	.then()
	.statusCode(200)
	.log().all()
	//.body("orderId",equalTo("171-9052961-7305950"))
	.body(JsonSchemaValidator.matchesJsonSchema(schemafile));
	//.body(JsonSchemaValidator.matchesJsonSchema(schemafile));
	
	System.out.println("schema validation completed");
	
	}


	
	@Test
	public void get_order_available_status() {
		
//		curl -X 'GET' \
//		  'https://preprod2.api.sellermania.com/v4/orders/AZ_FR/404-4455003-3640359/availableStatus' \
//		  -H 'accept: application/json' \
//		  -H 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJFZERTQSJ9.eyJzdWIiOiJjb21tZXJjaWFsQHNlbGxlcm1hbmlhLmNvbSIsImlhdCI6MTc2NjU3MjgxMywiZXhwIjoxNzY2NTc2NDEzLCJzY29wZSI6WyJTQ09QRV9BTEwiXSwiY29udGV4dCI6eyJhcHBJZCI6ImIwMjQ4ZDZlN2EifX0.Fap10ebPK6yvRLHriuP0Kl168AXXLS-8FF4fJnXXMWJ-5epR0zBb_0MCIGs73jLUXCUFOOabUmbvZ_0mChM9Dg'
	
		
	RestAssured.given()
		.contentType("application/json")
		
		.header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJFZERTQSJ9.eyJzdWIiOiJjb21tZXJjaWFsQHNlbGxlcm1hbmlhLmNvbSIsImlhdCI6MTc2NjU3MjgxMywiZXhwIjoxNzY2NTc2NDEzLCJzY29wZSI6WyJTQ09QRV9BTEwiXSwiY29udGV4dCI6eyJhcHBJZCI6ImIwMjQ4ZDZlN2EifX0.Fap10ebPK6yvRLHriuP0Kl168AXXLS-8FF4fJnXXMWJ-5epR0zBb_0MCIGs73jLUXCUFOOabUmbvZ_0mChM9Dg")
		
		.when()
		.get("https://preprod2.api.sellermania.com/v4/orders/AZ_FR/404-4455003-3640359/availableStatus")
		.then()
		.log().all()
		
		.statusCode(200);
		
	}
	
	
	//this is the changes I made on remote repo
	
	
	
	
	
}
