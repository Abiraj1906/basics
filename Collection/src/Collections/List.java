package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class List {

	
	public static void main(String[] args) {
		
		java.util.List<String> list=new ArrayList<String>();
		
		list.add("amazon");
		list.add("cdiscount");
		list.add("fnac");
		list.add("darty");
		list.add("manomano");
		list.add("fnac");
		
		System.out.println(list);
		
		System.out.println(list.contains("amazon"));
		System.out.println(list.containsAll(list));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(2));
		

		
		
//	Iterator<String> iter=list.iterator();
//	while(iter.hasNext()) {
//		list.add("refurb");
//		System.out.println(iter.next());
//	}
		
	 	//Collections.reverse(list);
		
		//System.out.println(list);

		//java.util.List<String> list1=new ArrayList<String>(Arrays.asList("a","b","c"));
		
		java.util.List<String> list1=Arrays.asList("a","b","c");
		System.out.println(list1.size());

		list1.add("e");
		System.out.println(list1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
	
}
