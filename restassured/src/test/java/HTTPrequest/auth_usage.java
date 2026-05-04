package HTTPrequest;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForGivenType;

public class auth_usage {

	
	@Test
	public void get_token() {
		
		Map<String, String>map=new HashMap<String, String>();
		map.put("username", "balaSC@sellermania.com");
		map.put("password", "test");
		
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(map)
		.when()
		.post("/login")
		.then()
		.log().all();
	
		
		
		
	}
	

	
	
	
	
	@Test
	public void Authentication() {
		
		
		
		
		
		RestAssured.given()
		.baseUri("https://preprod2.platform.sellermania.com")
		.basePath("/api/internal/orders")
		.queryParam("page", 1)
		.queryParam("itemPerPage", 25)
		.queryParam("startDate", "2025-12-17T00:00:00+01:00")
		.queryParam("sort[date]", "desc")		
		.headers("Accept","application/json")
		.headers("Accept-Encoding","gzip, deflate, br, zstd")
		.headers("Accept-Language","en-US,en;q=0.9,fr;q=0.8")
		.auth().basic("balaSC@sellermania.com", "test")
		.when()
		.get()
		.then()
		.log().all()
		.statusCode(200);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
