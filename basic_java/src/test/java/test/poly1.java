package test;

public class poly1 extends polymorphism{
	public void creation(String sku,String ean)
	    {   	
	    	System.out.println("sku ploy1 created");
	    }
		public void deletion(int quantity) {
			System.out.println("sku poly1 deleted");
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism p1=new poly1();
		p1.creation("skutest", "789456123");
		p1.deletion(0);
	}

}
