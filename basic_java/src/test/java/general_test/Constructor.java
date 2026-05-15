package general_test;

public class Constructor {

	


	    Constructor() {
	        System.out.println("Default");
	    }

	    Constructor(int x) {
	        System.out.println("Parameterized");
	    }

	    Constructor(int x, int y) {
	        System.out.println("Overloaded");
	    }
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Constructor con=new Constructor();
		
		Constructor con1=new Constructor(10);
		
		Constructor con2=new Constructor(10, 20);
		
		System.out.println(con+" "+con1+" "+con2);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
