package test;

public class sample_test {

	int x=100;
	
	
	sample_test(int x){
		this.x=x;
	}
	
	
	public void animal() {
		System.out.println("animal sound");
	}
	
	
	
	public void cat() {
		System.out.println("cat sound");
	}
	
	
	
	
	public static void main(String[] args) {
		
		sample_test num=new sample_test(200);
		
		num.animal();
		num.cat();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
