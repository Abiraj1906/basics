package test;

class Animal {
	void Sound() {
		System.out.println("Animal make sound");
	}
	
}
class Dog extends Animal{
	void Sound() {
	System.out.println("Dog barks");
	
	}
	
	void run() {
		System.out.println("Dog can run");
		
	}
	
	}
	


public class object_casting {

	public static void main(String[] args) {
		
		Animal a=new Dog();
	
		a.Sound();
		
		
	}

}
