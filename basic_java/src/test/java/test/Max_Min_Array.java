package test;

public class Max_Min_Array {

	public static void main(String[] args) {
//		
//		int[] arr= {10,15,28,39,45,86,12,10,5};
//		
//		//int min=arr[0];
//		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}		
//		System.out.println(max);
//
//int[] arr1= {10,15,28,39,45,86,12,10,5};
//		
//		//int min=arr[0];
//		int min=arr[0];
//		for(int i=1;i<arr1.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}		
//		System.out.println(min);

		
	//second largest array
		
		
//		int[] arr2= {10,15,28,39,45,12,10,50,86};
//
//		int firstl=arr2[arr2.length-1];
//		int secondl=-1;
//		
//		for(int i=arr2.length-2;i>0;i--) {
//			if(arr2[i]>secondl&&arr2[i]!=firstl) {
//				secondl=arr2[i];
//			}
//		}
//		System.out.println(firstl);
//		System.out.println(arr2.length);
//		System.out.println(secondl);
		
//		
//	 int[] arr={10,25,35,28,31,15,15};
//	        int firstl=arr[0];   //10
//	        int secondl=-1;
//	        
//	        for(int i=1;i<arr.length;i++){
//	            if(arr[i]>firstl){
//	            secondl=firstl;
//	             firstl=arr[i];    
//	            }else if(arr[i]>secondl&&arr[i]!=firstl){
//                secondl=arr[i];
//	            }
//	        }
//	        
//	        
//	        System.out.println(arr.length);
//	        System.out.println(firstl);
//System.out.println(secondl);





int[] arr1={2,3,5,10,15,4};
int[] arr2={10,8,7,6,5};
boolean sorted=true;

for(int i=1;i<arr2.length;i++) {
	
		 if(arr2[i]>arr2[i-1]) {
			 sorted=false;
			 break;
		 }
	}

		
	
System.out.println(sorted);

	}
}
