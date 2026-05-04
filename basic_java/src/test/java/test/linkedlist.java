package test;

import java.util.LinkedList;

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
		System.out.println(linklist);
		
		linklist.get(1);
		
	System.out.println(linklist.contains(10));	
		
		
		
		
	}

}
