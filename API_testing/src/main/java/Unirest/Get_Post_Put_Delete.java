package Unirest;

import org.testng.annotations.Test;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class Get_Post_Put_Delete {

	
	
	@Test
	public void getrequest_unirest() {
		
HttpResponse<JsonNode>jsonresponse=Unirest.get("https://api.restful-api.dev/objects").asJson();
		
		System.out.println(jsonresponse.getStatus());
		System.out.println(jsonresponse.getStatusText());
		System.out.println(jsonresponse.getBody());
			
	}
	
@Test
public void postrequest_unirest() {
	
HttpResponse<JsonNode>jsonresponse=Unirest.post("https://api.restful-api.dev/objects").body("{\n"
		+ "   \"name\": \"Apple MacBook Pro 16\",\n"
		+ "   \"data\": {\n"
		+ "      \"year\": 2019,\n"
		+ "      \"price\": 1849.99,\n"
		+ "      \"CPU model\": \"Intel Core i9\",\n"
		+ "      \"Hard disk size\": \"1 TB\"\n"
		+ "   }\n"
		+ "}").asJson();

System.out.println(jsonresponse.getStatus());
System.out.println(jsonresponse.getStatusText());
System.out.println(jsonresponse.getBody());

}	
	
	@Test
	public void putrequest_unirest() {
	HttpResponse<JsonNode>jsonresponse=	Unirest.put("https://api.restful-api.dev/objects/7").body("{\n"
				+ "   \"name\": \"Apple MacBook Pro 16\",\n"
				+ "   \"data\": {\n"
				+ "      \"year\": 2019,\n"
				+ "      \"price\": 2049.99,\n"
				+ "      \"CPU model\": \"Intel Core i9\",\n"
				+ "      \"Hard disk size\": \"1 TB\"\n"
				+ "   }\n"
				+ "}").asJson();
		

System.out.println(jsonresponse.getStatus());
System.out.println(jsonresponse.getStatusText());
System.out.println(jsonresponse.getBody());
		
		
	}
	
	
	@Test
	public void deleterequest_unirest() {
	HttpResponse<JsonNode>jsonresponse=Unirest.delete("https://api.restful-api.dev/objects/6").asJson();
		
	System.out.println(jsonresponse.getStatus());
	System.out.println(jsonresponse.getStatusText());
	System.out.println(jsonresponse.getBody());
	
	
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		Get_Post_Put_Delete get=new Get_Post_Put_Delete();
		//get.getrequest_unirest();
		//get.postrequest_unirest();
		//get.putrequest_unirest();
		get.deleterequest_unirest();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
