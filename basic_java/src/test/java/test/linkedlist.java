package test;

import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> linklist=new LinkedList<>();
		
//		linklist.add("testing");
//		linklist.addFirst("test");
//		linklist.addLast("in progress");
//		
//	System.out.println(linklist);	
//		
//		System.out.println(linklist.getFirst());
//		
//		//System.out.println(linklist.remove());
//		System.out.println(linklist.poll());
//
//		System.out.println(linklist);	
//		
          linklist.add(10);
          linklist.add(12);
          linklist.add(13);
          linklist.add(14);
          linklist.add(15);
		
		linklist.get(1);
		
		System.out.println(linklist);

		ListIterator<Integer> list_iter=linklist.listIterator();
		
		while(list_iter.hasPrevious()) {
			System.out.println("previous element"+list_iter.previous());
		}
	
		
		
		
	}

}
