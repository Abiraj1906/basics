package test;

public class prime_numbers {

	public static void main(String[] args) {
		int x=12;
//		
//		if(x%2==0) {
//			System.out.println("is prime number");
//		}else {
//			System.out.println("not prime number");
//		}
//		
		
		boolean isprime=true;
		for(int i=2;i<x;i++) {
		
			if(x%i==0) {
				isprime=false;
				break;
			}
		}
		
		if(isprime) {
		System.out.println("prime number");
		}else {
			System.out.println("is not prime");
		}
		

		//between prime print
		
		for(int i=2;i<=20;i++) {
			boolean isprime1=true;
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				isprime1=false;
				break;
			}
			
		}
	
		if(isprime1) {
			System.out.println(i);
		}
		
		
		}	
		
		
	}

}
