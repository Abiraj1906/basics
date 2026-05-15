package I_Questions;

import java.util.Map;
import java.util.TreeMap;

public class child extends parent
{
	
	int x=20;
	

	
	void show() {
		System.out.println("child x"+ x);
		System.out.println("parent x"+ super.x);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		child ch=new child();
		
		ch.show();
		
		
		Map<Integer, String>map=new TreeMap<Integer, String>();
		map.put(1, "chennai");
		map.put(1, "madurai");
		
		System.out.println(map);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
