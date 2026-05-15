package general_test;

import java.util.Map;

public class Hash_map_using1 {

	public static void main(String[] args) {
		
	
	
	Hash_map_using hash=new Hash_map_using();
	
	Map<String, Integer> studentmap=hash.getStudents();
	
System.out.println(studentmap);
	
	
	
	
	for(String num:studentmap.keySet()) {
		System.out.println(num);
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
}
