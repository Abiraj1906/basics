package JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class Serialization {

	@Test
	public void serialize() {
		
		Map<String, Object> map=new HashMap();
		map.put("name", "Abiraj");
		map.put("Age", 27);
		
		List<String> list=new ArrayList();
		list.add("java");
		list.add("selenium");
		map.put("skills", list);
		
		System.out.println(map);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//check for pull how works
	
	
	
	
	
	
	
	
	
}
