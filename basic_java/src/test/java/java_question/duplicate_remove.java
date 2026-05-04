package java_question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class duplicate_remove {

	public static void main(String[] args) {
		
	
    
//    String s1="abcdefabc";
//   
//    List<Character> list=new ArrayList<>();
//    
//    
//    for(char num:s1.toCharArray()){
//        if(!list.contains(num)){
//        	list.add(num);
//        }
//
//    }
//    
//	
	
	
//    System.out.println(list.size());
//    System.out.println(list.toString());

    List<String>list=new LinkedList<String>();
    list.add("cuddalore");
    list.add("chennai");
    list.add("chennai");
    list.add("cuddalore");
    
    System.out.println(list);
    
   List<String> result=new LinkedList<String>();
   
   for(String num:list) {
	   if(!result.contains(num)) {
		   result.add(num);
	   }
   }
    System.out.println(result);
    
    
    
    
    
    
    
	}
	
	
}
