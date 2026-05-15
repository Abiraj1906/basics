package I_Questions;

import java.util.Arrays;
import java.util.HashSet;

public class Anagram {

	
	public static void main(String[] args) {
		
		String s1="eat";
		String s2="teae";
		
//		char[] arr1=s1.toCharArray();
//		char[] arr2=s2.toCharArray();
//		
//		
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		
//		
//		if(Arrays.equals(arr1, arr2)) {
//			System.out.println("both are anagram");
//		}else {
//			System.out.println("btoh are not anagram");
//		}
//		
		HashSet<Character> set=new HashSet<>();
		for(char num:s2.toCharArray()) {
		 if(set.add(num)) {
		 }
		}
		 System.out.println(set);

		StringBuilder sb=new StringBuilder();
		
		for(char ch:set) {
			sb.append(ch);
		}
		 
		// System.out.println(sb.toString());
		 
		 
		 String news2=sb.toString();
		 System.out.println(news2);
		 
		 char[] arr1=s1.toCharArray();
		 char[] arr2=news2.toCharArray();
		 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 
		 if(Arrays.equals(arr1, arr2)) {
			 System.out.println("both are anagram");
		 }else {
			 System.out.println("both are not anagram");
		 }
		 
		 
		 
		 
		 
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
