package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Array_rotation {

	public static void main(String[] args) {
		
		
		
//		   int[] arr={1,2,3,4,5,6,7,8};
//	       
//	       int n=3;
//	       n = n % arr.length; 
//	       System.out.println(n);
//	       for(int i=0;i<n;i++){
//	           int first=arr[0];
//	           
//	           for(int j=0;j<arr.length-1;j++){
//	               arr[j]=arr[j+1];
//	           }
//	           
//	           arr[arr.length-1]=first;
//	           
//	           for(int num:arr){
//	               System.out.print(num+" ");
//	           }
//	           
//	       }
//	       
//	       
	       
	       String s="programming";
	        int[] freq=new int[256];
	        
	        for(char c:s.toCharArray()){
	            freq[c]++;
	        }
	        
	        for(int i=0;i<256;i++){
	            if(freq[i]>0){
	                System.out.println((char)i+"   "+freq[i]);
	            }
	        }

	       
	       
	      
	       
	       
	       
	       
	       

	}

}
