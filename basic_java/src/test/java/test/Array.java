package test;

public class Array {

	public static void main(String[] args) {
//		int[] arr=new int[5];
//		arr[0]=100;
//		arr[1]=150;
//		arr[1]=200;
//		arr[3]=250;
//		arr[4]=300;
////		//arr[5]=350;
//		
//		int[] arr= {10,15,12,13,48};
//				
//		System.out.println(arr.length);
//		//System.out.println(arr[5]);
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		int sum=0;
//   for(int x:arr)
//   {
//	   sum += x;
//	 
//   }
//   System.out.println("total"+ sum);
//		
//	//2 dimensional	
//		int[][] arr1= {{1,2,3},{4,5,6}};
//		
//		System.out.println(arr1[0][1]);
//		
		//object array
		
		Object[] obj=new Object[5];
		obj[0]=100;
		obj[1]="test";
		obj[2]=10.75;
		obj[3]=1;
		obj[4]=true;
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
		
		Object[][] obj1= {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		
	for(int i=0;i<obj1.length;i++)
	{
		System.out.println(obj1[i]);
	}
		
		
		
		
		
	}

}
