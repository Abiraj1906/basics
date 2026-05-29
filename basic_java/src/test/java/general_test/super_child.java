package general_test;

public class super_child extends super_key{

	int x=20;
	
	
	
	
	void show() {
		
		
		System.out.println("child x"+x);
		System.out.println("parent x"+super.x);
		
	
	
	}
	
	public static void main(String[] args) {
		
		super_child sup=new super_child();
		sup.show();
		
	}
	
	
	
	
	
	
	
	
	
	
}
