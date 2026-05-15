package I_Questions;

public interface Interface_A {

	
	 default void car() {
		System.out.println("car method");
	}
	
	
	static void sound() {
		System.out.println("sound method");
	}
	
	
	public static void main(String[] args) {
		
		Interface_A.sound();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
