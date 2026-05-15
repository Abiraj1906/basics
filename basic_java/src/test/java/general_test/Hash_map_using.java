package general_test;

import java.util.HashMap;
import java.util.Map;

public class Hash_map_using {

	Map<String, Integer> students;
	
	
	public Hash_map_using() {
		
		students=new HashMap<String, Integer>();
		students.put("abiraj", 28);
		students.put("vinoth", 29);
		students.put("vicky", 30);
		
		
	}
	
	
	public Map<String, Integer> getStudents(){
		return students;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
