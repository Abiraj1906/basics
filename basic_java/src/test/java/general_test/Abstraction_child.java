package general_test;

public class Abstraction_child extends Abstraction {

	@Override
	public void animal() {
		// TODO Auto-generated method stub
		System.out.println("child method executed");
	}

	
	public static void main(String[] args) {
		
		Abstraction_child ref=new Abstraction_child();
		ref.animal();
		ref.sound();
	}
	
}
