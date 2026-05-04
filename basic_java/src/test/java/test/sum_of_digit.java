package test;

public class sum_of_digit {

	public static void main(String[] args) {
//		
//		int x=123456;
//		int temp=0;
//		int result=0;
//		
//		while(x>0) {
//			temp=x%10;
//			result=result*10+temp;
//			x=x/10;
//			
//			
//		}
//		System.out.println(result);
//		

		int x=100;
		int first=0;
		int second=1;
		int result=0;

		for(int i=1;i<=x;i++){
		result=first+second;
		first=second;
		second=result;
		System.out.println(result);


		}

		
		
		
	}

}
