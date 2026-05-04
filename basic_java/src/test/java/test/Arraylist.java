package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
list.add("testing");
list.add("test");
list.add("tester");
list.add("abcd");
list.add("dcba");
System.out.println(list);
//
//		for (String fulllist : list) {
//		
//			System.out.println(fulllist);
//		}
//		iterator
		Iterator<String> iter=list.iterator();
		System.out.println(iter.next());   //---first element only return
		
		while(iter.hasNext())
		{
		//	list.add("string");
			System.out.println(iter.next());  //all element return
		}
		
//		System.out.println(list.get(0));
//		System.out.println(list.getFirst());
//
//		System.out.println(list.isEmpty());
//
//		list.set(0, null);
//		list.set(1, null);
//
//		System.out.println(list);
//		
		
		
		ListIterator<String>liter=list.listIterator();
		
	while(liter.hasPrevious())
	{
		System.out.println(liter.previous());
	}		
		
		
		

	}

}
