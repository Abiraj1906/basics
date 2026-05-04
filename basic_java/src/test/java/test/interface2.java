package test;

public class interface2 implements interface_test{

	
	
	
	public static void main(String[] args) {
		interface_test it=new interface2();
		it.dog();
		it.eat();
		
			}

	@Override
	public void dog() {
		// TODO Auto-generated method stub
		System.out.println("Dogs speaking");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dogs are eating");
	}

}
