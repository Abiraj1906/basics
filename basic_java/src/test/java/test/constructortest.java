package test;

public class constructortest {

	String book_name;
	int pages_number;
    constructortest(String name,int number)
    {
    	book_name=name;
    	pages_number=number;
    //System.out.println("constructor executed");
    }
	
	public void getbook()
	{
		System.out.println("book_name   "+book_name+"   "+"page_number  "+ pages_number);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructortest ct=new constructortest("amazoncd", 10);
		ct.getbook();
		
	}

}
