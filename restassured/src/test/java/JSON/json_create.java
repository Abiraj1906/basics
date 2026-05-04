package JSON;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class json_create {

	
	@Test
	public void json_create() throws IOException {
		
		JSONArray jsonarray=new JSONArray();
		jsonarray.add("sku001");
		jsonarray.add("unknown-sku");
		
		
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("sku", "sku001");
		jsonobject.put("title", "Listing title");
		jsonobject.put("itemNote", "Professional seller");
		jsonobject.put("quantity", "10");
		jsonobject.put("wisshedprie", "100");
		jsonobject.put("bottomlimitprice", "50");
		jsonobject.put("lockedprice", "false");
		jsonobject.put("customField", "custom field");
		jsonobject.put("skus", jsonarray);
		
		
		FileWriter fw=new FileWriter("./sample.json");
		fw.write(jsonobject.toJSONString());
		fw.close();
		
	    
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
