package JSON;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class json_read {

	@Test
	public void json_read() throws IOException, ParseException {
		
		
	JSONParser jsonparser=new JSONParser();
	FileReader fr=new FileReader("/home/sellerp26/Abiraj_project/restassured/sample.json");
	
Object parseobject=	jsonparser.parse(fr);
	
	JSONObject jsonobject=(JSONObject) parseobject;
	
	
	String quantity=(String)jsonobject.get("quantity");
JSONArray array=(JSONArray)jsonobject.get("skus");
	
	Iterator iter=array.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	String blp=(String)jsonobject.get("bottomlimitprice");
	
	String itemNote=(String)jsonobject.get("itemNote");
	
	String wp=(String)jsonobject.get("wished price");
	
	String sku=	(String) jsonobject.get("sku");
	
	String title=(String)jsonobject.get("title");

	String lockedprice=(String)jsonobject.get("lockedPrice");
	
	String custom=(String)jsonobject.get("customField");
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
}
