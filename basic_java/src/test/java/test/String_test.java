package test;

import java.util.HashSet;

public class String_test {

	public static void main(String[] args) {
		
		String str="testing";
//		for(int i=str.length()-1;i>0;i--) {
//System.out.println(str.charAt(i));			
//		}

		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		
	//String[] arr= {"t","e","s","t","i","n","g"};	
		
//		int i=0;int j=arr.length-1;
//		
//		while(i<j) {
//			String t=arr[i];
//			arr[i]=arr[j];
//		arr[j]=t;
//		i++;
//		j--;
//		}
//	
//		for(String s:arr) {
//			System.out.println(s);
//
//		}

		
		
		
		 int[] arr={50,5,10,12,15,18,2,3,24,98};
	       
	       int max=arr[0];
	       for(int i=1;i<arr.length;i++){
	           if(arr[i]>max){
	               max=arr[i];
	           }
	       }
	  System.out.println(arr.length);
	        System.out.println(max);
	        
	        
	        
	        
	        String[] arr1={"Bangalore","chennai","Bangalore","chennai","cuddalore"};
	        
	        HashSet<String> seen=new HashSet<String>();
	        HashSet<String> duplicates=new HashSet<String>();
	            
	        for(String  num:arr1){
	            if(!seen.add(num))
	            duplicates.add(num);
	        }
	        
	        for(String dub:duplicates){
	            
	            int count=0;
	            
	            for(String num:arr1){
	                if(dub==num){
	                count++;
	                   
	                }
	            }
	        
	             System.out.println(dub+"repeated"+count+"times");
	        }
	        

	             System.out.println(seen+"    "+duplicates);
	        
	        
	             String str1="mom";
	             String rev="";
	             for(int i=str1.length()-1;i>=0;i--){
	                  rev=rev+str1.charAt(i);
	                  
	             }
	       System.out.println(rev);
	             
	             if(str1.equals(rev)){
	                 System.out.println("this is palindrome");
	             }else{
	                 System.out.println("this is not palindrome");
	             }
	             
	             
	             int x=10;
	             int a=0;
	             int b=1;
	             for(int i=0;i<x;i++){
	                 int c=a+b;
	                 a=b;
	                 b=c;
	                  System.out.println(c);
	             }
	             
	             
	            
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	        
	}

}
