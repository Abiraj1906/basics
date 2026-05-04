package test;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

	
	public void basic() {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("test");
		hs.add("testing");
		hs.add("tes in progress");
		hs.add("test");
		System.out.println(hs);
		
		
	}
	public void iterator()
	{
		HashSet<String> hs1=new HashSet<>();
hs1.add("cdiscount");
hs1.add("boul");
hs1.add("bm");
hs1.add("rk");
System.out.println(hs1);
		
		Iterator<String> iter=hs1.iterator();
		while(iter.hasNext())
		{
		System.out.println(iter.next());	
			
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

         Hash_set hse=new Hash_set();
         hse.basic();
         hse.iterator();

		
		
		
	}

}
