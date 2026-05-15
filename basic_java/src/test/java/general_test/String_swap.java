package general_test;

public class String_swap {

	public static void main(String[] args) {
		
		 String str="testing in progress";
	       
	       char[] arr=str.toCharArray();
	       
	       int left=0;
	       int right=arr.length-1;
	       
	       while(left<right){
	           if(arr[left]==' '){
	               left++;
	           }
	           else if(arr[right]==' '){
	               right--;
	           }
	           else {
	               char temp=arr[left];
	               arr[left]=arr[right];
	               arr[right]=temp;
	               left++;
	               right--;
	               
	               
	           }
	           
	           
	          
	           
	       }
	        System.out.println(new String(arr));
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
