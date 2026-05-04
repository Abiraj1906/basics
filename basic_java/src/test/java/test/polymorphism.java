package test;

public class polymorphism {
	
    void creation(String sku,String ean)
    {   	
    	System.out.println("sku created");
    	
    }
	 void deletion(int quantity) {
		System.out.println("sku deleted");
	}
	
	
 public static void main(String[] args) {
	 polymorphism p=new polymorphism();
	 p.creation("testsku", "123456789");
	 p.deletion(0);
	 
	 
}	
	
}
