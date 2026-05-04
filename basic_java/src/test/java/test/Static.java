package test;

public class Static {

	public  void create()
	{
		int a=10,b=20;
		int c=a+b;
				
		System.out.println(c);
	}
	public static  void delete()
	{
		System.out.println("sku deleted");
	}
	public static void main(String[] args) {
		
//		
Static s=new Static();
		s.create();
//		s.delete();
  //  Static.create();
    Static.delete();
		
		
	}

}
