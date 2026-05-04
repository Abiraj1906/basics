package test;

import java.util.Stack;
import java.util.Vector;

public class stack_vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> s=new Stack<>();
		s.add("test");
		s.add("testing");
		s.push("test in progress");
		s.pop();
		System.out.println(s);
		
		Vector<String> v=new Vector<>();
		v.addElement("test");
		v.add("testing");
		v.remove(0);
	System.out.println(v);
	}

}
