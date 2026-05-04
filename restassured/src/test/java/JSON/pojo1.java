package JSON;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class pojo1 {

	
	public static void main(String[] args) throws JsonProcessingException {
		
		pojo po=new pojo();
		po.setName("Abiraj");
		po.setAge(27);
		po.setSkills(Arrays.asList("java","selenium"));
		
		System.out.println(po.getName());
		System.out.println(po.getAge());
		System.out.println(po.getSkills());
		
	
	ObjectMapper mapper=new ObjectMapper();
	String s=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(po);
	System.out.println(s);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
