package test;

public class perfect_factorial {

	public static void main(String[] args) {
		int x=6;
		int sum=0;
		for(int i=1;i<x;i++) {
			if(x%i==0) {
				sum=sum+i;
			}
		}
		if(sum==x) {
		System.out.println("is perfect");
		}else {
			System.out.println("not perfect");
		}
		
//		
//		//ternary
//		int a1=10;
//		int b1=20;
//		
//	      int a2= a1<b1? a1:b1;
//		System.out.println(a1+" "+b1);
//		
		int i=5;
		int fact=1;
		for(int j=1;j<=i;j++) {
			fact=fact*j;
			
		}
		System.out.println(fact);
		
		
	}

}
