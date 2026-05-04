package Java_net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.testng.annotations.Test;

public class Get_post_put_delete {

	//------https://restful-api.dev/
	@Test
	public void getrequest() throws IOException
	{
		
		URL url=new URL("https://api.restful-api.dev/objects");
	HttpURLConnection httpsconnection=(HttpURLConnection)url.openConnection();
		
	httpsconnection.setRequestMethod("GET");
	httpsconnection.connect();
		
	int status_code=	httpsconnection.getResponseCode();
	String status_msg=httpsconnection.getResponseMessage();
	System.out.println(status_code);	
		System.out.println(status_msg);
		
	InputStream inputstream=httpsconnection.getInputStream();
	InputStreamReader Ir=new InputStreamReader(inputstream);
	BufferedReader br=new BufferedReader(Ir);
	
	String line;
	StringBuffer sb=new StringBuffer();
	
		while((line=br.readLine())!=null) {
			sb.append(line);
			
		}
		
		System.out.println(sb.toString());		
	}	
	
@Test
public void postrequest() throws IOException {
	
	URL url=new URL("https://api.restful-api.dev/objects");
HttpsURLConnection connection=(HttpsURLConnection)url.openConnection();
	connection.setRequestMethod("POST");
	connection.setRequestProperty("Content-Type", "application/json");
	connection.setDoOutput(true);
	
			String jsonbody="{\n"
					+ "   \"name\": \"Apple MacBook Pro 16\",\n"
					+ "   \"data\": {\n"
					+ "      \"year\": 2019,\n"
					+ "      \"price\": 1849.99,\n"
					+ "      \"CPU model\": \"Intel Core i9\",\n"
					+ "      \"Hard disk size\": \"1 TB\"\n"
					+ "   }\n"
					+ "}";
byte[] inputjson	=jsonbody.getBytes();
	
    OutputStream os=connection.getOutputStream();
  os.write(inputjson);

  InputStream inputstream=connection.getInputStream();
	InputStreamReader Ir=new InputStreamReader(inputstream);
	BufferedReader br=new BufferedReader(Ir);
	
	String line;
	StringBuffer sb=new StringBuffer();
	
		while((line=br.readLine())!=null) {
			sb.append(line);
			
		}
		
		System.out.println(sb.toString());		
	}	
	
 @Test
 public void putrequest() throws IOException {
	 
	 URL url=new URL("https://api.restful-api.dev/objects/7");
	 HttpsURLConnection connection=(HttpsURLConnection)url.openConnection();
	 	connection.setRequestMethod("POST");
	 	connection.setRequestProperty("Content-Type", "application/json");
	 	connection.setDoOutput(true);
	 	
	 			String jsonbody="{\n"
	 					+ "   \"name\": \"Apple MacBook Pro 16\",\n"
	 					+ "   \"data\": {\n"
	 					+ "      \"year\": 2019,\n"
	 					+ "      \"price\": 2049.99,\n"
	 					+ "      \"CPU model\": \"Intel Core i9\",\n"
	 					+ "      \"Hard disk size\": \"1 TB\"\n"
	 					+ "   }\n"
	 					+ "}";
	 byte[] inputjson	=jsonbody.getBytes();
	 	
	     OutputStream os=connection.getOutputStream();
	   os.write(inputjson);

	   InputStream inputstream=connection.getInputStream();
	 	InputStreamReader Ir=new InputStreamReader(inputstream);
	 	BufferedReader br=new BufferedReader(Ir);
	 	
	 	String line;
	 	StringBuffer sb=new StringBuffer();
	 	
	 		while((line=br.readLine())!=null) {
	 			sb.append(line);
	 			
	 		}
	 		
	 		System.out.println(sb.toString());		
	 	}	
	 
	@Test
	public void deleterequest() throws IOException {
		
		 URL url=new URL("https://api.restful-api.dev/objects/6");
		 HttpsURLConnection connection=(HttpsURLConnection)url.openConnection();
		 connection.setRequestMethod("DELETE");
		connection.connect();
		
		int status_code=connection.getResponseCode();
		String msg=connection.getResponseMessage();
		System.out.println(status_code); 
		 System.out.println(msg);
		 
	}
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		Get_post_put_delete get=new Get_post_put_delete();
	get.getrequest();
//		get.postrequest();
		
		//get.putrequest();
		//get.deleterequest();
		
	}

}
