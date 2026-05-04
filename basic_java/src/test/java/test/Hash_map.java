package test;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer> map=new HashMap<>();
		
		map.put("amazon", 1);
		map.put("cdiscount", 6);
		map.put("backmarket", 30);
		map.put("boulanger", 8);
		map.put("refurbed", 61);
		map.put("zalando", 54);
		map.put("rakuten", 3);
	

		
		System.out.println(map);
		Integer AZ=map.get("amazon");
		System.out.println(AZ);
		
		boolean cd=map.containsKey("backmarket");
		System.out.println(cd);
		
		
		
		
		
		
		

	}

}
