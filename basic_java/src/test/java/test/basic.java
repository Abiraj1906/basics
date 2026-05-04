package test;

public abstract class basic {

	
	private String colour;
	
	
	public static void main(String[] args) {

		basic b=new basic1();      //allot memory for this object

		b.setcolour("blue");
		b.study();
		
		
}

	abstract void study();

	public void setcolour(String newcolour) {
		// TODO Auto-generated method stub
		if(newcolour.equals("green")) 
		{
		  System.out.println("green is best");	
		}else
		{
			System.out.println("green is not best");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
